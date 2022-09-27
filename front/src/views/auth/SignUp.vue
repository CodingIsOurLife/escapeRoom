<template>
  <div class="container">
    <h2>Sign UP</h2>
    <form>
      <v-text-field
        v-model="nickname"
        :error-messages="nicknameErrors"
        :counter="5"
        label="NickName"
        required
        @input="$v.nickname.$touch()"
        @blur="$v.nickname.$touch()"
      ></v-text-field>

      <v-text-field
        v-model="email"
        :error-messages="emailErrors"
        label="E-mail"
        required
        @input="$v.email.$touch()"
        @blur="$v.email.$touch()"
      ></v-text-field>
      <v-text-field
        type="password"
        v-model="password"
        label="Password"
        :error-messages="passwordErrors"
        required
        @input="$v.password.$touch()"
        @blur="$v.password.$touch()"
      ></v-text-field>
      <v-text-field
        type="password"
        v-model="pwcheck"
        label="Password Check"
        :error-messages="passwordckErrors"
        required
        @input="$v.pwcheck.$touch()"
        @blur="$v.pwcheck.$touch()"
      ></v-text-field>

      <div style="float: left">
        <v-btn outlined @click="submitForm"> SIGN UP </v-btn>
      </div>
      <div style="float: right">
        <v-btn outlined @click="clear"> clear </v-btn>
      </div>
    </form>
  </div>
</template>

<script>
import axios from "axios";
import { mapActions } from "vuex";
import { validationMixin } from "vuelidate";
import { helpers, required, maxLength, email } from "vuelidate/lib/validators";

const pwVaild = helpers.regex(
  "pwVaild",
  /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/
);
const nickVaild = helpers.regex("nickVaild", /^[a-z0-9_-]{2,6}$/);

export default {
  mixins: [validationMixin],

  validations: {
    email: { required, email },
    nickname: { required, nickVaild },
    password: { required, maxLength: maxLength(10), pwVaild },
    pwcheck: { required },
  },

  data: () => ({
    password: "",
    email: "",
    nickname: "",
    pwcheck: "",
  }),

  computed: {
    emailErrors() {
      const errors = [];
      if (!this.$v.email.$dirty) return errors;
      !this.$v.email.email && errors.push("이메일 형식에 맞게 입력해주세요");
      !this.$v.email.required && errors.push("이메일을 입력해주세요");
      return errors;
    },
    passwordErrors() {
      const errors = [];
      if (!this.$v.password.$dirty) return errors;
      !this.$v.password.pwVaild &&
        errors.push("비밀번호 형식에 맞게 입력해주세요");
      !this.$v.password.required && errors.push("비밀번호를 입력해주세요");
      return errors;
    },
    nicknameErrors() {
      const errors = [];
      if (!this.$v.nickname.$dirty) return errors;
      !this.$v.nickname.nickVaild &&
        errors.push("닉네임 형식에 맞게 입력해주세요");
      !this.$v.nickname.required && errors.push("2자리이상 6자리이하");
      return errors;
    },
    passwordckErrors() {
      const errors = [];
      if (!this.$v.pwcheck.$dirty) return errors;

      if (this.pwcheck !== this.password)
        errors.push("비밀번호가 동일하지 않습니다.");

      !this.$v.pwcheck.required && errors.push("비밀번호를 입력해주세요");
      return errors;
    },
  },

  methods: {
    // submit() {
    //   this.$v.$touch();
    // },
    ...mapActions(["login"]),
    clear() {
      this.$v.$reset();
      this.password = "";
      this.email = "";
    },
  },
  submitForm: function (event) {
    event.preventDefault();

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
};
</script>
<style>
.container {
  margin: 10% 30% 30% 30%;
}
.v-text-field__details {
  margin-bottom: 10px;
}
</style>
