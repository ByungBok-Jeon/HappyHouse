<template>
  <div>
    <HelloWorld msg="Welcome to Happy House" msg1="Choose your own happy House!" />
    <b-card bg-variant="light">
      <b-form action method="post" id="_frmForm" name="frmForm" @submit.prevent="registryMyself">
        <b-form-group
          label-cols-lg="3"
          label="회원가입 페이지"
          label-size="lg"
          label-class="font-weight-bold pt-0"
          class="mb-0"
        >
          <b-form-group
            label="아이디 체크 :"
            label-for="_username2"
            label-cols-sm="3"
            label-align-sm="right"
          >
            <b-form-input
              data-msg="아이디"
              type="text"
              name="username"
              id="_username2"
              v-model="customer.username"
            ></b-form-input>
            <b-button class="mt-3" type="button" @click="checkusername">
              아이디 중복확인
            </b-button>
          </b-form-group>

          <b-form-group
            label="아이디 :"
            label-for="_username"
            label-cols-sm="3"
            label-align-sm="right"
          >
            <b-form-input
              data-msg="아이디"
              type="text"
              name="username"
              id="_username"
              v-model="customer.username"
              readonly
            ></b-form-input>
          </b-form-group>

          <b-form-group label="이름 :" label-for="_cname" label-cols-sm="3" label-align-sm="right">
            <b-form-input
              data-msg="이름"
              type="text"
              name="cname"
              id="_cname"
              v-model="customer.cname"
            ></b-form-input>
          </b-form-group>

          <b-form-group
            label="이메일 :"
            label-for="_email"
            label-cols-sm="3"
            label-align-sm="right"
          >
            <b-form-input
              data-msg="이메일"
              type="email"
              name="email"
              id="_email"
              size="20"
              v-model="customer.email"
            ></b-form-input>
          </b-form-group>

          <b-form-group
            label="패스워드 :"
            label-for="_password"
            label-cols-sm="3"
            label-align-sm="right"
          >
            <b-form-input
              data-msg="패스워드"
              type="password"
              name="password"
              id="_password"
              size="30"
              v-model="customer.password"
            ></b-form-input>
          </b-form-group>
          <b-button type="submit" name="button">회원가입</b-button>
        </b-form-group>
      </b-form>
    </b-card>
  </div>
</template>
<style></style>

<script>
import HelloWorld from '@/components/HelloWorld.vue';
import { AUTH_REQUEST } from '../store/actions/auth';
import http2 from '../http-common2';
import http3 from '../http-common3';
export default {
  name: 'signup',
  components: {
    HelloWorld,
  },
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
    checkusername() {
      if (this.customer.username == '') {
        alert('아이디를 입력하세요.');
        return;
      }
      http3
        .get('users/' + this.customer.username)
        .then((response) => {
          //console.log(response.data);
          if (response.data.id > 0) {
            alert('이미 존재하는 아이디입니다.');
            this.newCustomer();
          } else {
            alert('사용할 수 있는 아이디입니다.');
          }
          // else if (response.data.status==404) {
          // alert("사용할 수 있는 아이디네입니다.");
          // document.getElementById("_username2").setAttribute("readonly","readonly");
          // }
        })
        .catch(() => {
          alert('사용할 수 있는 아이디입니다.');
          //document.getElementById("_username").setAttribute("readonly","readonly");
        });
    },
    login: function() {
      //model에 바인딩된 데이터 모두 ==> this
      const { usernameOrEmail, password } = this;
      this.$store.dispatch(AUTH_REQUEST, { usernameOrEmail, password }).then(() => {
        this.$router.push('/');
      });
    },
    registryMyself() {
      if (this.customer.username == '') {
        alert('아이디를 입력하세요.');
        return;
      }
      if (this.customer.cname == '') {
        alert('이름을 입력하세요.');
        return;
      }
      if (this.customer.email == '') {
        alert('이메일을 입력하세요.');
        return;
      }
      if (this.customer.password == '') {
        alert('패스워드를 입력하세요.');
        return;
      }

      http2
        .post('/signup', {
          username: this.customer.username,
          name: this.customer.cname,
          email: this.customer.email,
          password: this.customer.password,
        })
        .then((response) => {
          //console.log(response.data);
          if (response.data.success == true || response.data.success == 'true') {
            alert('가입에 성공하였습니다.');
            this.submitted = true;
            this.$router.push('/');
          } else {
            alert('가입에 실패하였습니다.');
            this.submitted = false;
            this.newCustomer();
          }
        })
        .catch(() => {
          alert('가입에 실패하였습니다.');
          this.submitted = false;
          this.newCustomer();
        });
    },
    newCustomer() {
      this.customer = {
        username: '',
        cname: '',
        email: '',
        password: '',
      };
    },
  },
};
</script>
