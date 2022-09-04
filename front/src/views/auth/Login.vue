<template>
  <div class="register">
    <h3>로그인</h3>
    <!-- <form v-on:submit.prevent="loginSubmit"> -->
    <div class="flex">
      <ul class="container">
        <li class="item center">이메일</li>
        <li class="item">
          <input
            type="text"
            v-model="email"
            placeholder="이메일을 입력하세요."
            required
          />
        </li>
      </ul>
      <ul class="container">
        <li class="item center">비밀번호</li>
        <li class="item">
          <input
            type="password"
            v-model="password"
            placeholder="비밀번호를 입력하세요."
            required
          />
        </li>
        <li class="item"></li>
      </ul>

      <ul class="container">
        <li class="item center"></li>
        <li class="item">
          <button @click="login({ email: email, password: password })">
            로그인하기
          </button>
        </li>
        <li class="item"></li>
      </ul>
    </div>
    <!-- </form> -->
  </div>
</template>

<script>
//import axios from "axios";
import { mapActions } from "vuex";
export default {
  data() {
    return {
      email: "",
      password: "",
      // token: "",
    };
  },
  methods: {
    ...mapActions(["login"]),

    // loginSubmit: function () {
    //   //event.preventDefault();

    //   //console.log(this.uemail, this.pw, this.nickname);
    //   let url = "member/login";
    //   let saveData = {
    //     email: this.uemail,
    //     pw: this.pw,
    //   };
    //   try {
    //     axios
    //       .post(url, JSON.stringify(saveData), {
    //         headers: {
    //           "Content-Type": `application/json`,
    //         },
    //       })
    //       .then((res) => {
    //         if (res.status === 200) {
    //           this.result = res.data;
    //           console.log(this.result);
    //           this.token = this.result.token;
    //           this.$cookie.set("accesstoken", res.data.token, 1);
    //           axios.defaults.headers.common["access token"] = res.data.token;
    //           alert("어서오세요");
    //           this.$router.push("/");
    //         }
    //       });
    //   } catch (error) {
    //     console.log(error);
    //   }
  },
};
</script>
<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
ul,
li {
  list-style: none;
}
a {
  text-decoration: none;
  color: inherit;
}
.register {
  width: 550px;
  margin: 200px auto 0;
  padding: 15px 20px;
  background: white;
  color: #2b2e4a;
  font-size: 14px;
  text-align: left;
  box-shadow: 1px 1px 5px rgba(0, 0, 0, 0.2);
}
.register h3 {
  font-size: 20px;
  margin-bottom: 20px;
  text-align: center;
}
.register input {
  width: 100%;
  height: 40px;
  outline: none;
  padding: 10px;
  border: 1px solid #707070;
  transition: 0.3s;
}
.register input:valid,
.register input:focus {
  border: 1px solid #2b2e4a;
}
.register .center {
  display: flex;
  align-items: center;
}
.register .flex {
  display: flex;
  flex-direction: column;
}
.register .flex .container {
  display: grid;
  grid-template-columns: 1fr 3fr 1fr;
  margin-bottom: 10px;
}
.register .flex .container .item:first-child {
  margin-right: 10px;
}
.register .flex .container .item .idcheck {
  height: 100%;
  margin-left: 10px;
  padding: 5px 15px;
  background: #2b2e4a;
  border: 1px solid #2b2e4a;
  color: white;
  font-size: 12px;
  transition: 0.3s;
}
.register .flex .container .item .idcheck:hover {
  background: white;
  color: #2b2e4a;
}
.register .flex .container .item select {
  height: 40px;
  padding: 10px;
  border: 1px solid #2b2e4a;
}
.register .submit {
  width: 100%;
  height: 40px;
  color: white;
  border: none;
  border: 1px solid #2b2e4a;
  background: #2b2e4a;
  transition: 0.3s;
}
.register .flex .container:last-child {
  margin: 0;
}
.register .submit:hover {
  width: 100%;
  height: 40px;
  border: none;
  border: 1px solid #2b2e4a;
  color: #2b2e4a;
  background: white;
}
</style>
