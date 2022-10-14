<template>
  <div>
    <div class="out">
      <div class="in">
        <div class="navwrap">
          <div class="title">
            <router-link to="/">Flee</router-link>
          </div>
          <div class="category">
            <router-link to="/escape">방탈출</router-link>
          </div>
          <div class="category">
            <router-link to="#">랭킹</router-link>
          </div>
          <div class="category">
            <router-link to="/board">커뮤니티</router-link>
          </div>
          <div class="category">
            <router-link to="#">고객센터</router-link>
          </div>
          <div class="category">
            <router-link to="#">마이페이지</router-link>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style>
.navwrap {
  display: flex;
  padding-top: 2rem;
  padding-bottom: 3rem;
  width: 768px;
}
.category {
  font-size: 16px;

  color: inherit;
  white-space: pre;
  padding-bottom: 0.25rem;
  margin-right: 50px;
}
.title {
  font-size: 18px;

  white-space: pre;
  padding-bottom: 0.25rem;
  margin-right: 40%;
}

a {
  text-decoration: none;
  color: black;
  font-weight: 20;
}
.out {
  display: flex;
}
.in {
  width: 1080px;
}
</style>
<!-- <template>
  <v-card class="bold">
    <v-tabs background-color="teal darken-3" show-arrows>
      <v-tabs-slider color="teal lighten-3"> </v-tabs-slider>

      <v-tab>
        <router-link to="/escape" class="topnav">방탈출</router-link>
      </v-tab>
      <v-tab> <router-link to="#" class="topnav">랭킹</router-link></v-tab>
      <v-tab>
        <router-link to="/board" class="topnav">커뮤니티</router-link></v-tab
      >
      <v-tab>
        <router-link to="#" class="topnav">마이페이지</router-link></v-tab
      >
    </v-tabs>
  </v-card>
</template>

<style>
.topnav {
  text-decoration: none;
}
.bold {
  font-weight: bold;
}
</style> -->
<!-- <template>
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
</style> -->
