import Vue from "vue";
import VueRouter from "vue-router";
import HomeView from "../views/HomeView.vue";
import board from "../views/board";
import escape from "../views/escape";
import Login from "../views/Login";
import SignUp from "../views/SignUp";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "home",
    component: HomeView,
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
    component: board,
  },
  {
    path: "/escape",
    name: "escape",
    component: escape,
  },
  {
    path: "/login",
    name: "login",
    component: Login,
  },
  {
    path: "/signUp",
    name: "signUp",
    component: SignUp,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
