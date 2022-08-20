<template>
  <div class="navs">
    <ul class="nav">
      <li>
        <router-link to="/login">
          <h3>로 그 인</h3>
        </router-link>
      </li>
      <li>
        <router-link to="/signUp">
          <h3>회 원 가 입</h3>
        </router-link>
      </li>
    </ul>
  </div>
</template>

<style>
.navs {
  overflow: hidden;
  background-color: white;
  margin-right: 4em;
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
  margin-left: 2em;
}
.navs a {
  color: gray;
  text-decoration: none;
}
</style>
