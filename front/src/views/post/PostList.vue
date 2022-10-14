<template>
  <div class="outer">
    <div class="inner">
      <h1>게시글</h1>
      <br />
      <button>게시글 작성</button>
      <br />
      <v-card
        class="mx-auto"
        width="100%"
        outlined
        v-for="(row, idx) in post"
        :key="idx"
      >
        <v-list-item three-line>
          <v-list-item-content>
            <v-list-item-title class="font1">
              {{ row.title }}
            </v-list-item-title>
            <v-list-item-subtitle class="font2">{{
              row.body
            }}</v-list-item-subtitle>
          </v-list-item-content>

          <v-list-item-avatar tile size="80" color="black"></v-list-item-avatar>
        </v-list-item>
      </v-card>
    </div>
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
<style>
.outer {
  display: flex;
  justify-content: center;
  align-content: center;
}
.inner {
  margin: auto;
  padding: 38px 0 52px 0;
  width: 960px;
}
.font1 {
  font-size: x-large;
  font-weight: bold;
  color: black;
}
.font2 {
  font-size: small;
  color: black;
}
</style>
