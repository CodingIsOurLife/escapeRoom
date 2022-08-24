<template>
  <div class="topnavs">
    <ul class="topnav">
      <li><router-link to="/escape">Escape</router-link></li>
      <li><router-link to="#">Ranking</router-link></li>
      <li><router-link to="/board">board</router-link></li>
      <li><router-link to="#">Mypage</router-link></li>
    </ul>
  </div>
</template>
<style>
@import url("https://fonts.googleapis.com/css2?family=Rajdhani:wght@300&display=swap");
.topnav {
  overflow: hidden;
  background-color: #345f53;
}

.topnav ul {
  text-align: center;
}
.topnav li {
  display: inline-block;
  float: right;
  display: block;
  color: #f2f2f2;
  /* text-align: center; */
  padding: 14px 16px;
  text-decoration: none;
}
.topnavs a {
  color: white;
  text-decoration: none;
  font-family: "Rajdhani", sans-serif;
}
</style>
