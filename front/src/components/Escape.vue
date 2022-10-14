<template>
  <div style="display: flex">
    <v-card
      class="mx-auto my-12"
      max-width="374"
      outlined
      v-for="(row, idx) in post.slice(0, 3)"
      :key="idx"
      style="margin: 8px"
    >
      <v-img
        height="250"
        src="https://cdn.vuetifyjs.com/images/cards/cooking.png"
      ></v-img>

      <v-card-title>{{ row.title }}</v-card-title>

      <v-card-text>
        <div>{{ row.body }}</div>
      </v-card-text>
    </v-card>
  </div>
</template>
<script>
import axios from "axios";
export default {
  data() {
    return { post: [] };
  },
  created() {
    axios.get("https://jsonplaceholder.typicode.com/posts").then((res) => {
      console.log(res);
      this.post = res.data;
    });
  },
};
</script>
