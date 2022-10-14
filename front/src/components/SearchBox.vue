<template>
  <div class="container">
    <div class="search-box">
      <input type="text" placeholder="방탈출 카페를 검색해보세요" />
      <button>
        <i class="fa fa-search"></i>
      </button>
    </div>
  </div>
</template>
<style>
.container {
  text-align: center;
  padding-bottom: 3rem;
  padding-left: 11%;
}
.search-box {
  width: 850px;
  height: 45px;
  border: 1px solid;
  border-radius: 20px;
  display: flex;
  margin-top: 20px;
}
.search-box input {
  width: 90%;
  height: 46px;
  padding-left: 12px;
  padding-right: 12px;
  border: none;
  outline: none;
  font-size: 15px;
}
.search_box button {
  width: 10%;
  height: 46px;
  margin: 0;
  padding: 0;
  border: none;
  background: #03cf5d;
}
.search-box i {
  color: white;
  font-size: 22px;
  text-align: center;
}
</style>
