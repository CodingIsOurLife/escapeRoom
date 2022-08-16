<template>
  <div class="app">
    <LoginNav></LoginNav>
    <Myheader></Myheader>

    <Mynav></Mynav>
    <router-view />
    <Myfooter></Myfooter>
  </div>
</template>

<script>
import Myheader from "./components/Myheader.vue";
import Myfooter from "./components/Myfooter.vue";
import Mynav from "./components/Mynav.vue";
import loginNav from "./components/loginNav.vue";
import LoginNav from "./components/loginNav.vue";
//import HomeView from "./views/HomeView.vue";

export default {
  components: {
    Myheader,
    Myfooter,
    //HomeView,
    Mynav,
    loginNav,
    LoginNav,
  },
};
</script>

<style>
.app {
  margin-left: 200px;
  margin-right: 200px;
}
</style>
