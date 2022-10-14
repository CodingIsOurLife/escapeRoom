import Vue from "vue";
import VueRouter from "vue-router";
import store from "../store/index";
Vue.use(VueRouter);

const authUser = (to, from, next) => {
  if (store.state.isLogin === true) {
    //이미 로그인된 유저
    alert("이미 로그인이 되었슴니다");
    next("/");
  } else {
    next();
  }
};
const onlyAuthUser = (to, from, next) => {
  if (store.state.isLogin === false) {
    //아직 로그인 안 된 유저
    alert("로그인이 필요합니다");
    next("/");
  } else {
    next();
  }
};
const routes = [
  {
    path: "/",
    name: "home",
    component: () => import("../views/HomeView"),
  },

  {
    path: "/about",
    name: "about",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () =>
      import(/* webpackChunkName: "about" */ "../views/AboutView.vue"),
  },
  {
    path: "/board",
    name: "board",
    component: () => import("../views/post/PostList"),
  },
  {
    path: "/postDetail",
    name: "postDetail",
    component: () => import("../views/post/PostDetail"),
  },
  {
    path: "/escape",
    name: "escape",
    component: () => import("../views/EscapeDetail"),
  },
  {
    path: "/login",
    name: "login",
    beforeEnter: authUser,
    component: () => import("../views/auth/Login"),
  },
  {
    path: "/signUp",
    name: "signUp",
    component: () => import("../views/auth/SignUp"),
  },
  {
    path: "/myPage",
    name: "myPage",
    beforeEnter: onlyAuthUser,
    component: () => import("../views/auth/MyPage"),
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
