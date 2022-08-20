<template>
  <div class="navs">
    <ul class="nav">
      <li><router-link to="/login">로그인</router-link></li>
      <li><router-link to="/signUp">회원가입</router-link></li>
    </ul>
  </div>
</template>
<style>
.navs {
  overflow: hidden;
  background-color: white;
}
.navs ul {
  text-align: center;
}
.navs li {
  display: inline-block;
  float: right;
  display: block;
  color: #f2f2f2;
  /* text-align: center; */
  padding: 10px 10px;
  text-decoration: none;
}
.navs a {
  color: gray;
  text-decoration: none;
}
</style>
