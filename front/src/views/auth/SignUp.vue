<template>
  <div class="register">
    <h3>회원가입</h3>
              <p v-if="errors.length">
    
    <ul>
      <li v-for="error in errors" :key="error">{{ error }}</li>
    </ul>
  </p>
    <form v-on:submit.prevent="submitForm">
      <div class="flex">
        <ul class="container">

          <li class="item center">닉네임</li>
          <li class="item">
            <input
              type="text"
              name="nickname"
              v-model="nickname"
              placeholder="닉네임을 입력하세요."
              autofocus
              required
            />
          </li>
          <li class="item">
            <button class="idcheck" @click="checkNick">중복확인</button>
          </li>
          <li class="item"></li>
        </ul>
        <ul class="container">
          <li class="item center">이메일</li>
          <li class="item">
            <input
              type="text"
              v-model="uemail"
              placeholder="이메일을 입력하세요."
              required
            />
          </li>
          <li class="item">
            <button class="idcheck">인증하기</button>
          </li>
        </ul>
        <ul class="container">
          <li class="item center">비밀번호</li>
          <li class="item">
            <input
              type="password"
              v-model="pw"
              placeholder="비밀번호를 입력하세요."
              required
            />
          </li>
          <li class="item"></li>
        </ul>
        <ul class="container">
          <li class="item center">비밀번호 확인</li>
          <li class="item">
            <input
              type="password"
              v-model="pwcheck"
              placeholder="비밀번호를 입력하세요."
              required
            />
          </li>
          <li class="item"></li>
        </ul>

        <ul class="container">
          <li class="item center"></li>
          <li class="item">
            <button class="submit" type="submit">가입하기</button>
          </li>
          <li class="item"></li>
        </ul>
      </div>
    </form>
  </div>
</template>

<script>
import axios from "axios";
// import { validateEmail } from "@/utils/validation";
export default {
  data() {
    return {
      uemail: "",
      pw: "",
      nickname: "",
      pwcheck:"",
      errors:[],
    };
  },
  // computed: {
  //   isUserVaild() {
  //     return validateEmail(this.uemail);
  //   },
  // },
  methods: {
    submitForm: function (event) {
      event.preventDefault();
      this.errors = [];
      if (!this.nickname) {
        this.errors.push("닉네임은 필수입니다.");        
      }
      if (!this.pw != this.pwcheck) {
        this.errors.push("비밀번호가 동일하지 않습니다");        
      }
      if (!this.uemail) {
        this.errors.push("이메일은 필수입니다.");
      } else if (!this.validEmail(this.uemail)) {
        this.errors.push("이메일 형식을 확인하세요.");
      }
      if (!this.errors.length) return true;

      console.log(this.uemail, this.pw, this.nickname);

      let url = "api/member/register";
      let datas = {
        nickname: this.nickname,
        pw: this.pw,
        email: this.uemail,
      };
      axios
        .post(url, JSON.stringify(datas), {
          headers: {
            "Content-Type": `application/json`,
          },
        })
        .then((res) => {
          res.data = this.nickname;
          if (res.status === 200) {
            alert(this.nickname + "님 회원가입이 완료되었습니다.");
            this.$router.push("/");
          }
        })
        .catch(function (error) {
          console.log(error);
          console.log("연결실패");
        });
    },
    validEmail: function (email) {
     //eslint-disable-next-line
      var re =
       /\S+@\S+\.\S+/;
      return re.test(email);
    },
    checkNick: function () {
      let url = "api/member/#";
      let data = {
        nickname: this.nickname,
      };
      axios
        .post(url, JSON.stringify(data), {
          headers: {
            "Content-Type": `application/json`,
          },
        })
        .then((res) => {
          res.data = this.nickname;
          if (res.status === 200) {
            alert("중복된 아이디입니다");
          }
        })
        .catch(function (error) {
          console.log(error);
        });
    },
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
