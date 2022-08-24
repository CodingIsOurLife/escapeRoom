<template>
  <div class="navs">
    <ul class="nav">
      <div v-if="isCookie">
        <li>home</li>
        <li v-on:click.prevent="deleteCookie" href="/">로그아웃</li>
      </div>
      <div v-else>
        <li><router-link to="/login">Sign In</router-link></li>
        <li><router-link to="/signUp">Sign Up</router-link></li>
      </div>
    </ul>
  </div>
</template>
<script>
export default {
  data() {
    return {
      isCookie: null,
    };
  },
  created() {
    this.isCookie = document.cookie;
  },
  methods: {
    deleteCookie() {
      this.$cookie.delete("accesstoken");
      this.isCookie = document.cookie;
      alert("로그아웃되었습니다.");
    },
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
  color: #f2f2f2;
  /* text-align: center; */
  padding: 10px 10px;
  text-decoration: none;
}
.navs a {
  color: #345f53;
  text-decoration: none;
}
</style>
