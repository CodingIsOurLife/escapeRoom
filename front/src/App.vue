<template>
  <div class="app">
    <Mynav></Mynav>
    <LoginNav></LoginNav>

    <Myheader></Myheader>
    <p class="design"><br />Escape</p>
    <router-view />
    <Myfooter></Myfooter>
  </div>
</template>

<script>
import Myheader from "./components/Myheader.vue";
import Myfooter from "./components/Myfooter.vue";
import Mynav from "./components/Mynav.vue";

import LoginNav from "./components/LoginNav.vue";
//import HomeView from "./views/HomeView.vue";

export default {
  components: {
    Myheader,
    Myfooter,
    //HomeView,
    Mynav,

    LoginNav,
  },
};
</script>

<style>
@font-face {
  font-family: "Rajdhani", sans-serif;
  src: url("https://fonts.googleapis.com/css2?family=Rajdhani:wght@300&display=swap");
}
.app {
  font-family: "Rajdhani", sans-serif;
}
.design {
  height: 100px;
  background-color: #345f53;
  color: white;
  font-size: x-large;
  text-align: center;
  /* font-family: "Rajdhani", sans-serif; */
}
</style>
