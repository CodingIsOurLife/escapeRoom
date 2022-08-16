<template>
  <div>
    <Myheader></Myheader>

    <router-view />
    <Myfooter></Myfooter>
  </div>
</template>

<script>
import Myheader from "./components/Myheader.vue";
import Myfooter from "./components/Myfooter.vue";
//import HomeView from "./views/HomeView.vue";

export default {
  components: {
    Myheader,
    Myfooter,
    //HomeView,
  },
};
</script>

<style></style>
