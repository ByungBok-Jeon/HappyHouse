<template>
  <div class="searchhouserent">
    <HelloWorld msg="Welcome to Happy House" msg1="Choose your own happy House!" />
    <b-container fluid>
      <b-row>
        <b-col style="margin-left: 10%; margin-top : 1%;">
          <h2>&lt;전월세 정보&gt;</h2>
          <b-form-group label="<주택 종류 선택>" v-slot="{ ariaDescribedby }">
            <b-form-checkbox-group
              @input="checkboxChanged"
              v-model="checkboxSelected"
              :options="checkboxOptions"
              :aria-describedby="ariaDescribedby"
              buttons
              button-variant="primary"
              size="lg"
              name="buttons-2"
            ></b-form-checkbox-group>
          </b-form-group>
          <b-table :items="pageItems"></b-table>
          <div>
            <b-pagination
              align="fill"
              v-model="currentPage"
              :total-rows="rows"
              :per-page="perPage"
              first-number
              last-number
            ></b-pagination>
          </div>
        </b-col>
        <b-col>
          <KakaoMap></KakaoMap>
        </b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
import http from '../../http-common5';
import HelloWorld from '@/components/HelloWorld.vue';
import KakaoMap from '@/components/map/KakaoMap.vue';
export default {
  name: 'SearchHouseRent',
  props: ['dongcode', 'sigungucode'],
  components: {
    HelloWorld,
    KakaoMap,
  },
  data() {
    return {
      pageItems: [],
      items1: [],
      items2: [],
      items3: [],
      items4: [],
      items: [
        {
          시군구: null,
          동: null,
          주택종류: null,
          이름: null,
          매물종류: null,
          보증금: null,
          월세: null,
          면적: null,
          층: null,
        },
      ],
      rows: 100,
      perPage: 1,
      currentPage: 1,
      checkboxSelected: [1, 2, 3, 4], // Must be an array reference!
      checkboxOptions: [
        { text: '아파트', value: '1' },
        { text: '연립주택', value: '2' },
        { text: '단독주택', value: '3' },
        { text: '오피스텔', value: '4' },
      ],
    };
  },
  watch: {
    currentPage: function() {
      this.pageItems = this.items.slice((this.currentPage - 1) * 10, this.currentPage * 10 - 1);
    },
  },
  methods: {
    checkboxChanged() {
      this.items = [];
      for (let index = 0; index < this.checkboxSelected.length; index++) {
        let ele = this.checkboxSelected[index];
        if (ele == 1) {
          this.items = this.items.concat(this.items1);
        } else if (ele == 2) {
          this.items = this.items.concat(this.items2);
        } else if (ele == 3) {
          this.items = this.items.concat(this.items3);
        } else if (ele == 4) {
          this.items = this.items.concat(this.items4);
        }
      }
      this.rows = this.items.length / 10 + 1;
      this.pageItems = this.items.slice(0, 9);
    },
  },
  mounted() {
    http
      .get('/houserent/selectAllHouseRentByDong/' + this.dongcode + '/' + this.sigungucode)
      .then(({ data }) => {
        const arr = data;
        this.rows = data.length / 10 + 1;
        this.items = [];
        arr.forEach((element) => {
          this.items.push({
            시군구: element.sigungu,
            동: element.dong,
            주택종류: element.type,
            이름: element.name,
            매물종류: element.renttype,
            보증금: element.rentprice1,
            월세: element.rentprice2,
            면적: element.area,
            층: element.floor,
          });
        });
        this.pageItems = this.items.slice(0, 9);
      });
    http
      .get('/houserent/selectAptRentByDong/' + this.dongcode + '/' + this.sigungucode)
      .then(({ data }) => {
        let arr = data;
        arr.forEach((element) => {
          this.items1.push({
            시군구: element.sigungu,
            동: element.dong,
            주택종류: element.type,
            이름: element.name,
            매물종류: element.renttype,
            보증금: element.rentprice1,
            월세: element.rentprice2,
            면적: element.area,
            층: element.floor,
          });
        });
      });
    http
      .get('/houserent/selectRowHouseRentByDong/' + this.dongcode + '/' + this.sigungucode)
      .then(({ data }) => {
        let arr = data;
        arr.forEach((element) => {
          this.items2.push({
            시군구: element.sigungu,
            동: element.dong,
            주택종류: element.type,
            이름: element.name,
            매물종류: element.renttype,
            보증금: element.rentprice1,
            월세: element.rentprice2,
            면적: element.area,
            층: element.floor,
          });
        });
      });
    http
      .get('/houserent/selectDetachedHouseRentByDong/' + this.dongcode + '/' + this.sigungucode)
      .then(({ data }) => {
        let arr = data;
        arr.forEach((element) => {
          this.items3.push({
            시군구: element.sigungu,
            동: element.dong,
            주택종류: element.type,
            이름: element.name,
            매물종류: element.renttype,
            보증금: element.rentprice1,
            월세: element.rentprice2,
            면적: element.area,
            층: element.floor,
          });
        });
      });
    http
      .get('/houserent/selectOfficetelRentByDong/' + this.dongcode + '/' + this.sigungucode)
      .then(({ data }) => {
        let arr = data;
        arr.forEach((element) => {
          this.items4.push({
            시군구: element.sigungu,
            동: element.dong,
            주택종류: element.type,
            이름: element.name,
            매물종류: element.renttype,
            보증금: element.rentprice1,
            월세: element.rentprice2,
            면적: element.area,
            층: element.floor,
          });
        });
      });
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
