<template>
    <div class="container" style="margin-top: 30px">
        <div class="row">
            <div class="col">
                <img src="../assets/Ad.jpg" style="height: 300px">
            </div>
            <div class="col">
                <h5>주택 관련 기사</h5>
                <hr>
                <div class="list-group">
                    <a href="https://www.dnews.co.kr/uhtml/view.jsp?idxno=202105101048247560757" class="list-group-item list-group-item-action">
                    첫번째 주택 관련 기사</a>
                    <a href="https://www.mk.co.kr/news/realestate/view/2021/05/511614/" class="list-group-item list-group-item-action">
                    두번째 주택 관련 기사</a>
                    <a href="http://www.sentv.co.kr/news/view/594292" class="list-group-item list-group-item-action">
                    세번째 주택 관련 기사</a>
                    <a href="https://www.mk.co.kr/news/realestate/view/2021/05/512524/" class="list-group-item list-group-item-action">
                    네번째 주택 관련 기사</a>
                </div>
            </div>
            <div class="col">
                <h5>오늘의 뉴스</h5>
                <hr>
                <div class="list-group">
                    <a href="https://realestate.joins.com/article/article.asp?pno=143348" class="list-group-item list-group-item-action">
                    기가 막힌 뉴스</a>
                    <a href="https://www.fnnews.com/news/202105260908482428" class="list-group-item list-group-item-action">
                    놀라운 뉴스
                    <span class="badge badge-danger badge-pill"> Update!</span>
                    </a>
                    <a href="https://www.mk.co.kr/news/realestate/view/2021/05/513115/" class="list-group-item list-group-item-action">
                    엄청난 소식의 뉴스</a>
                    <a href="https://realestate.joins.com/article/article.asp?pno=143494" class="list-group-item list-group-item-action">
                    엄청난 뉴스</a>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
export default {
  name: "MainNews",
};
</script>
<style>
* {
    font-family: 'Jal_Onuel','Y_Spotlight','IBMPlexSansKR-Regular';
}
.container {
    width: 100%;
    padding-right: 15px;
    padding-left: 15px;
    margin-right: auto;
    margin-left: auto;
}
.row {
    display: flex;
    flex-wrap: wrap;
    margin-right: -15px;
    margin-left: -15px;
}
.list-group {
    display: flex;
    flex-direction: column;
    border-radius: .25rem;
}
.list-group-item {
    position: relative;
    display: block;
    padding: .75rem 1.25rem;
    border: 1px solid rgba(0,0,0,.125);
}
hr {
    border-top: 1px solid rgba(0,0,0,.1);
}
a {
    font-size: 1.25rem;
}
h5 {
    font-size: 1.25rem;
}
.col {
    position: relative;
    width: 100%;
    padding-right: 15px;
    padding-left: 15px;
}
</style>