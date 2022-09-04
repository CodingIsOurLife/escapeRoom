import axios from "axios";
import Vue from "vue";
import Vuex from "vuex";
import router from "../router/index";

Vue.use(Vuex);
export default new Vuex.Store({
  state: {
    userInfo: null,
    isLogin: false,
    isLoginError: false,
  },

  mutations: {
    //로그인 성공시,
    loginSuccess(state, payload) {
      state.isLogin = true;
      state.userInfo = payload;
    },
    loginError(state) {
      state.isLogin = false;
      state.isLoginError = true;
    },
    //로그아웃
    logout(state) {
      state.isLogin = false;
      state.isLoginError = false;
      state.userInfo = null;
    },
  },
  actions: {
    //로그인시도
    login({ dispatch }, loginObj) {
      //로그인 -> 토큰 반환
      axios
        .post("https://reqres.in/api/login", loginObj)
        .then((res) => {
          console.log(res);
          let token = res.data.token;

          localStorage.setItem("access_token", token);
          dispatch("getMemberInfo");
        })
        .catch((err) => {
          console.log(err);
        });
    },

    //로그아웃
    logout({ commit }) {
      commit("logout");
      router.push({ name: "home" });
    },

    getMemberInfo({ commit }) {
      //localStorage에 있는 token을 불러옴
      let token = localStorage.getItem("access_token");

      let config = {
        headers: {
          "access-token": token,
        },
      };
      //토큰으로 멤버 정보 반환
      //토큰으로 멤버정보 요청
      axios
        .get("https://reqres.in/api/users/2", config)
        .then((res) => {
          let userInfo = { id: res.data.data.id };
          commit("loginSuccess", userInfo);
          console.log(userInfo);
          router.push({ name: "myPage" });
        })
        .catch(() => {
          alert("이메일과 비밀번호를 확인해주세요");
        });
    },
  },
});
