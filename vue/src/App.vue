<template>
  <div id="app">
    <!-- <div id="top_menu_wrap">
      <div id="_top_menu">
        <ul class="navi">
          <li v-if="isAuthenticated && getProfile">
            <span class="aboutme">[{{ getProfile }}님]</span> |
          </li>
          <li v-if="isAuthenticated" @click="logout"><span class="aboutme"> Logout</span></li>
        </ul>
      </div>
    </div> -->

    <div>
      <b-navbar toggleable="lg" type="dark" variant="info">
        <b-navbar-brand to="/">Home</b-navbar-brand>

        <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

        <b-collapse id="nav-collapse" is-nav>
          <div v-if="isAuthenticated">
            <b-navbar-nav>
              <b-nav-item to="/search" v-if="isAuthenticated">Search House</b-nav-item>
              <b-nav-item to="/qnaboard" v-if="isAuthenticated">Notice</b-nav-item>
            </b-navbar-nav>
          </div>
          <div v-else>
            <b-navbar-nav>
              <b-nav-item to="/search" disabled>Search House</b-nav-item>
              <b-nav-item to="/qnaboard" disabled>Notice</b-nav-item>
            </b-navbar-nav>
          </div>

          <!-- Right aligned nav items -->
          <b-navbar-nav class="ml-auto">
            <b-nav-item v-if="isAuthenticated && getProfile">
              [{{ getProfile }}]님 환영합니다
            </b-nav-item>
            <b-nav-item v-if="isAuthenticated" @click="logout">
              Logout
            </b-nav-item>
          </b-navbar-nav>
          <b-navbar-nav class="ml-5" v-if="!isAuthenticated">
            <b-nav-form class="login" @submit.prevent="login">
              <b-form-input
                size="sm"
                class="mr-sm-2"
                type="text"
                id="_userid"
                name="id"
                value
                data-msg="ID를"
                title="아이디"
                required
                v-model="usernameOrEmail"
                placeholder="아이디"
              ></b-form-input>
              <b-form-input
                size="sm"
                class="mr-sm-2"
                type="password"
                id="_pwd"
                name="pwd"
                value
                required
                v-model="password"
                title="패스워드"
                placeholder="패스워드"
              ></b-form-input>
              <b-button size="sm" class="my-2 my-sm-0 mr-sm-2" type="submit">로그인</b-button>
              <b-button size="sm" class="my-2 my-sm-0 mr-sm-2" @click="goSignUp">회원가입</b-button>
            </b-nav-form>
          </b-navbar-nav>
        </b-collapse>
      </b-navbar>
    </div>
    <!-- <div id="nav">
      <router-link to="/"> 홈 </router-link> |
      <router-link to="/search" v-if="isAuthenticated"> 검색 </router-link> |
      <router-link to="/qnaboard" v-if="isAuthenticated"> 공지사항</router-link>
    </div> -->
    <router-view />
  </div>
</template>
<script>
import { mapGetters, mapState } from 'vuex';
import { AUTH_LOGOUT } from './store/actions/auth';
import { AUTH_REQUEST } from './store/actions/auth';

export default {
  name: 'App',
  data() {
    return {
      usernameOrEmail: '',
      password: '',
      customer: {
        username: '',
        cname: '',
        email: '',
        password: '',
      },
      submitted: false,
    };
  },
  methods: {
    goSignUp: function() {
      this.$router.push('/signup');
    },
    login: function() {
      //model에 바인딩된 데이터 모두 ==> this
      const { usernameOrEmail, password } = this;
      this.$store.dispatch(AUTH_REQUEST, { usernameOrEmail, password }).then(() => {
        this.$router.push('/');
      });
    },
    logout: function() {
      alert('로그아웃 되었습니다.');
      this.$store.dispatch(AUTH_LOGOUT).then(() => this.$router.push('/'));
    },
  },
  computed: {
    ...mapGetters(['isAuthenticated', 'isProfileLoaded', 'getProfile']),
    ...mapState({
      authLoading: (state) => state.auth.status === 'loading',
      // ,uname: state => `${state.user.getProfile}`,
    }),
    loading: function() {
      return this.authStatus === 'loading' && !this.isAuthenticated;
    },
  },
};
</script>
<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 20px;
  background-color: #0062cc;
}

#nav a {
  font-weight: bold;
  color: #fff;
}

#nav a.router-link-exact-active {
  color: #fff;
}
.navi {
  list-style-type: none;
}
.navi li {
  display: inline-block;
  text-decoration: none;
}
.logout {
  background-color: #0062cc;
  color: burlywood;
}
.aboutme {
  color: #0062cc;
  background-color: burlywood;
}
</style>
