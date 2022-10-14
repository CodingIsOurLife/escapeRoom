<template>
  <div class="outer">
    <div class="inner">
      <LoginNav />

      <Mynav></Mynav>

      <router-view />
    </div>
  </div>
</template>

<script>
import Mynav from "./components/Mynav.vue";
import LoginNav from "./components/LoginNav.vue";

export default {
  components: {
    Mynav,
    LoginNav,
  },
};
</script>

<style>
@font-face {
  font-family: "Nanum Gothic", sans-serif;
  src: url("https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap");
}
.outer {
  display: flex;
  justify-content: center;
  align-content: center;
}
.inner {
  width: 1080px;
}
</style>
