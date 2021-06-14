<template>
  <div class="dropdown " style="height: 513px;">
    <b-container style="height: 513px;">
      <div>
        <b-container class=" text-center ml-md-auto">
          <h1>&lt;동으로 매물 검색&gt;</h1>
          <b-container>
            <b-form inline>
              <b-form-select
                class="ml-4"
                v-model="selected0"
                :options="options0"
                size="lg"
              ></b-form-select>
              <b-form-select
                class="ml-4"
                v-on:change="cityselect"
                v-model="selected1"
                :options="options1"
                size="lg"
              ></b-form-select>
              <b-form-select
                class="ml-4"
                v-on:change="sigunguselect"
                v-model="selected2"
                :options="options2"
                size="lg"
              ></b-form-select>
              <b-form-select
                class="ml-4"
                v-model="selected3"
                :options="options3"
                size="lg"
              ></b-form-select>
              <b-button class="ml-3" @click="search" variant="success" size="lg">검색</b-button>
            </b-form>
          </b-container>
        </b-container>
      </div>
    </b-container>
  </div>
</template>

<script>
import http from '../../http-common5';
export default {
  name: 'DropDown',
  data() {
    return {
      city: ['서울특별시'],
      sigungu: [],
      dong: [],
      selected0: null,
      options0: [
        { value: null, text: '거래 종류를 선택하세요' },
        { value: 1, text: '매매' },
        { value: 2, text: '전/월세' },
      ],
      selected1: null,
      options1: [
        { value: null, text: '시/도를 선택하세요' },
        { value: 1, text: '서울특별시' },
      ],
      selected2: null,
      options2: [{ value: null, text: '시/군/구를 선택하세요' }],
      selected3: null,
      options3: [{ value: null, text: '동을 선택하세요' }],
    };
  },
  methods: {
    cityselect() {
      http.get('/code/selectSigunguCode').then((response) => {
        const arr1 = response.data;
        arr1.forEach((element) => {
          this.options2.push({ value: element.sigungucode, text: element.sigungu });
        });
      });
    },
    sigunguselect() {
      if (this.selected0 == 1) {
        http.get('/code/selectHouseDongCode/' + this.selected2).then((response) => {
          const arr2 = response.data;
          this.options3 = [{ value: null, text: '동을 선택하세요' }];
          this.selected3 = null;
          arr2.forEach((element) => {
            this.options3.push({ value: element.dongcode, text: element.dong });
          });
        });
      } else if (this.selected0 == 2) {
        http.get('/code/selectHouseRentDongCode/' + this.selected2).then((response) => {
          const arr2 = response.data;
          this.options3 = [{ value: null, text: '동을 선택하세요' }];
          this.selected3 = null;
          arr2.forEach((element) => {
            this.options3.push({ value: element.dongcode, text: element.dong });
          });
        });
      } else {
        alert('거래 종류를 선택하세요.');
      }
    },

    search() {
      if (this.selected0 == null) {
        alert('거래 종류를 선택하세요');
      } else if (this.selected1 == null) {
        alert('시/도를 선택하세요');
      } else if (this.selected2 == null) {
        alert('시/군/구를 선택하세요');
      } else if (this.selected3 == null) {
        alert('동을 선택하세요');
      } else {
        if (this.selected0 == 1) {
          this.searchHouse();
        } else if (this.selected0 == 2) {
          this.searchHouseRent();
        }
      }
    },

    searchHouse() {
      this.$router.push('/searchhouse/' + this.selected3);
    },
    searchHouseRent() {
      this.$router.push('/searchhouserent/' + this.selected3 + '/' + this.selected2);
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
