<template>
  <nav>
    <router-link class="btn btn-primary" to="/">모든사원 보기</router-link> |
    <router-link class="btn btn-primary" to="/add">사원추가</router-link> |
    <router-link class="btn btn-primary" to="/search">이름으로 사원 찾기</router-link> |
    <router-link class="btn btn-primary" to="/searchbyid">아이디로 사원 찾기</router-link> |
    <router-link class="btn btn-primary" to="/chartcustomer">부서별 인원보기</router-link> |
    <router-link class="btn btn-primary" to="/chartpiecustomer">부서별 인원보기2</router-link> |
    <router-link class="btn btn-primary" to="/qnaboard">QnA 게시판</router-link>
    <!-- <a class="btn btn-primary" href="/">모든사원 보기</a> | -->
    <!-- ctrl+k+c -->
  </nav>
</template>

<script>
export default {
  name: 'NavHeader',
};
</script>
