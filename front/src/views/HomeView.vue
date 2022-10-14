<template>
  <div>
    <SearchBox />
    <hello-world />
    <Escape />
  </div>
</template>

<script>
import HelloWorld from "../components/HelloWorld";
import Escape from "../components/Escape";
import SearchBox from "../components/SearchBox.vue";
export default {
  name: "Home",

  components: {
    HelloWorld,
    Escape,
    SearchBox,
  },
};
</script>
