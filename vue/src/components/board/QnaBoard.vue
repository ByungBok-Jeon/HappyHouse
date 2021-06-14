<template>
  <div>
    <div>
      <HelloWorld msg="Welcome to Happy House" msg1="Choose your own happy House!" />
    </div>
    <div style="margin-left:10%; margin-right:10%;">
      <h1 style="margin-top: 5%">공지사항</h1>
    <div class="search_box" style="margin-top: 5%;">
      글번호로 글 찾기 :
      <input type="text" name="num" v-model="cnum" @keyup.enter="searchbynum" v-cloak />
    </div>
    <div>
      <table class="list_table">
        <col width="10%" />
        <col width="20%" />
        <col width="30%" />
        <col width="20%" />
        <col width="10%" />
        <col width="5%" />
        <col width="5%" />
        <tr>
          <th>번호</th>
          <th>제목</th>
          <th>내용</th>
          <th>작성자</th>
          <th>등록일</th>
          <th>수정</th>
          <th>삭제</th>
        </tr>
        <tr v-for="board in info" class="nicecolor" :key="board.no">
          <td v-html="board.no"></td>
          <td v-html="board.title"></td>
          <td v-html="board.content"></td>
          <td v-html="board.writer"></td>
          <td>{{ board.regtime | getFormatDate}}</td>
          <!-- <td>{{ board.regtime | salarydecimal }}</td> -->
          <td class="button">
            <input type="button" class="blue" value="수정" @click="update_board(board.no)" />
          </td>
          <td class="button">
            <input type="button" class="blue" value="삭제" @click="delete_board(board.no)" />
          </td>
        </tr>
         <tr>
            <td colspan="7" class="button" style="height: 50px; text-align: center;">
              <input type="button" class="blue" value="등록" @click="create_board()" />
            </td>
          </tr>
      </table>
      <!-- <button class="blue" value="등록" @click="create_board" /> -->
    </div>
    </div>
  </div>
</template>

<script>
import HelloWorld from "@/components/HelloWorld.vue";
import http from "../../http-common5";
import moment from 'moment';
export default {
  name: "board-list",
  components: {
    HelloWorld,
  },
  data() {
    return {
      upHere: false,
      info: [],
      cnum : "",
      loading: true,
      errored: false
    };
  },
  
  methods: {
    retrieveBoards() {
      http
        .get("/board")
        .then(response => (this.info = response.data))
        .catch(() => {
          this.errored = true;
        })
        .finally(() => (this.loading = false));
    },
    refreshList() {
      this.retrieveBoards();
    },
    delete_board(boardno) {
      alert(boardno + "번 글을 삭제합니다.");
      http
        .delete("/board/" + boardno)
        .then(response => {
          if (response.data == "success") {
            alert("삭제 완료하였습니다.");
            this.retrieveBoards();
          } else {
            alert("삭제 하지 못했습니다.");
          }
        })
        .catch(() => {
          this.errored = true;
        })
        .finally(() => (this.loading = false));
    },
    update_board(boardno) {
      alert(boardno + "번 글을 수정합니다.");
      this.$router.push("/updateboard/" + boardno);
    },
    create_board() {
      alert("글을 등록합니다.");
      this.$router.push("/createboard");
    },
    searchbynum(e) {
      if (e.which == 13) {
        //enter
        http
          .get("/board/" + this.cnum)
          .then(response => {
            this.info = {d : response.data};
          })
          .catch(() => {
            this.errored = true;
          })
          .finally(() => (this.loading = false));
      }
    }
  },
  filters: {
    getFormatDate(regtime) {
      return moment(new Date(regtime)).format('YYYY.MM.DD');
    }
  },
  mounted() {
    this.retrieveBoards();
  }
};
</script>

<style>
</style>
