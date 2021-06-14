<template>
  <div class="search">
    <HelloWorld msg="Welcome to Happy House" msg1="Choose your own happy House!" />
    <div>
      <dropdown></dropdown>
    </div>
  </div>
</template>
<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue';
// import KakaoMap from '@/components/map/KakaoMap.vue';
import Dropdown from '@/components/Search/Dropdown.vue';
// import SearchHouse from '@/components/Search/SearchHouse.vue';
export default {
  name: 'Search',
  components: {
    HelloWorld,
    // KakaoMap,
    Dropdown,
    // SearchHouse,
  },
};
</script>
<style scoped></style>
