<template>
  <div id="app">
    <MyHeader></MyHeader>
    <MyFooter></MyFooter>
  </div>
</template>

<script>
import MyHeader from "./components/common/MyHeader.vue";
import MyFooter from "./components/common/MyFooter.vue";

export default {
  components: {
    MyHeader,
    MyFooter,
  },
};
</script>
