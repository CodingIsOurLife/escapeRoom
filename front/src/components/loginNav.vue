<template>
  <div class="navs">
    <ul class="nav">
      <div v-if="isLogin === true">
        <li @click="$store.dispatch('logout')">로그아웃</li>
      </div>
      <div v-else>
        <li><router-link to="/login">Sign In</router-link></li>
        <li><router-link to="/signUp">Sign Up</router-link></li>
      </div>
    </ul>
  </div>
</template>
<script>
import { mapActions, mapState } from "vuex";

export default {
  computed: {
    ...mapState(["isLogin"]),
  },
  methods: {
    ...mapActions(["logout"]),
  },
};
</script>
<style>
.navs {
  overflow: hidden;
  background-color: white;
}
.navs ul {
  text-align: center;
}
.navs li {
  display: inline-block;
  float: right;
  display: block;

  /* text-align: center; */
  padding: 10px 10px;
  text-decoration: none;
}
.navs a {
  color: #345f53;
  text-decoration: none;
}
</style>
