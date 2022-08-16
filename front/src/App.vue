<template>
  <div>
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
//import HomeView from "./views/HomeView.vue";

export default {
  components: {
    Myheader,
    Myfooter,
    //HomeView,
    Mynav,
  },
};
</script>

<style></style>
