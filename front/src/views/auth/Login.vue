<template>
  <div class="container">
    <h2>Sign In</h2>
    <form>
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
        label="password"
        :error-messages="passwordErrors"
        required
        @input="$v.password.$touch()"
        @blur="$v.password.$touch()"
      ></v-text-field>

      <div style="float: left">
        <v-btn outlined @click="login({ email: email, password: password })">
          SIGN IN
        </v-btn>
      </div>
      <div style="float: right">
        <v-btn outlined @click="clear"> clear </v-btn>
      </div>
    </form>
  </div>
</template>

<script>
//import axios from "axios";
import { mapActions } from "vuex";
import { validationMixin } from "vuelidate";
import { helpers, required, maxLength, email } from "vuelidate/lib/validators";

const pwVaild = helpers.regex(
  "pwVaild",
  /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/
);

export default {
  mixins: [validationMixin],

  validations: {
    email: { required, email },
    password: { required, maxLength: maxLength(10), pwVaild },
  },

  data: () => ({
    password: "",
    email: "",
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
};
</script>
<style>
.container {
  margin: 10% 30% 10% 30%;
}
</style>
