<template>
  <div id="kakao">
    <div class="k_map">
      <div id="map"></div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'KakaoMap',
  mounted() {
    if (window.kakao && window.kakao.maps) {
      this.initMap();
    } else {
      const script = document.createElement('script');
      /* global kakao */
      script.onload = () => kakao.maps.load(this.initMap);
      script.type = 'text/javascript';
      script.src =
        'http://dapi.kakao.com/v2/maps/sdk.js?autoload=false&appkey=da74f8a93db8994fa9e11d3469adbf0c';
      // script.src = 'http://dapi.kakao.com/v2/maps/sdk.js?appkey=b687ceda8bd9f73e7312bc3a111f1619';
      document.head.appendChild(script);
    }
  },
  methods: {
    initMap() {
      var container = document.getElementById('map');
      var options = {
        center: new kakao.maps.LatLng(37.5666805, 126.9784147), // 서울시청
        level: 9,
      };

      var map = new kakao.maps.Map(container, options);
      // hybrid : 위성사진
      // terrain : 지형정보
      // roadview : 로드뷰 도로정보
      // use_district :  지격편집도
      // traffic : 교통정보
      map.setMapTypeId(kakao.maps.MapTypeId.roadview);
    },
  },
};
</script>

<style>
.k_map {
  height: 500px;
  margin-left: 20%;
  margin-right: 20%;
  margin-top: 5%;
  margin-bottom: 5%;
  position: relative;
  overflow: hidden;
}
#map {
  height: 100%;
  width: 100%;
  position: absolute;
  top: 0px;
  left: 0px;
  background-color: rgb(229, 227, 223);
  overflow: hidden;
}
</style>
