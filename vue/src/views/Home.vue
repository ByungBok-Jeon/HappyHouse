<template>
  <div class="home">
    <HelloWorld msg="Welcome to Happy House" msg1="Choose your own happy House!" />
    <MainNews></MainNews>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from "@/components/HelloWorld.vue";
import MainNews from "@/components/MainNews.vue";

export default {
  name: "Home",
  components: {
    HelloWorld,
    MainNews,
  },
};
</script>
<style>
  KakaoMap {
    height: 500px; 
    margin-left: 50%; 
    margin-right: 20%; 
    margin-top: 5%; 
    position: relative;
    overflow: hidden;
}
</style>
