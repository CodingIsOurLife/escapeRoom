<template>
  <div class="topnavs">
    <hr />
    <ul class="topnav">
      <li>
        <router-link to="/escape">
          <h3>방탈출</h3>
        </router-link>
      </li>
      <li>
        <router-link to="#">
          <h3>랭킹</h3>
        </router-link>
      </li>
      <li>
        <router-link to="/board">
          <h3>게시판</h3>
        </router-link>
      </li>
      <li>
        <router-link to="#">
          <h3>마이페이지</h3>
        </router-link>
      </li>
    </ul>
    <hr />
  </div>
</template>

<style>
.topnav {
  overflow: hidden;
  margin-left: 2em;
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
.topnavs a {
  color: black;
  text-decoration: none;
  font-weight: bold;
}
</style>
