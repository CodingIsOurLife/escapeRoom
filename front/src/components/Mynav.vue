<template>
  <div class="topnavs">
    <ul class="topnav">
      <li><router-link to="/escape">방탈출</router-link></li>
      <li><router-link to="#">랭킹</router-link></li>
      <li><router-link to="/board">게시판</router-link></li>
      <li><router-link to="#">마이페이지</router-link></li>
    </ul>
  </div>
</template>
<style>
.topnav {
  overflow: hidden;
  background-color: #333;
}
.topnav ul {
  text-align: center;
}
.topnav li {
  display: inline-block;
  float: left;
  display: block;
  color: #f2f2f2;
  /* text-align: center; */
  padding: 14px 16px;
  text-decoration: none;
}
.topnav a {
  color: white;
  text-decoration: none;
}
</style>
