<template>
  <div class="review">
    <v-card class="mx-auto" max-width="500" width="500" outlined>
      <v-list-item three-line>
        <v-list-item-content>
          <div class="text-overline mb-4">{{ users.first_name }}</div>
          <v-list-item-title class="text-h5 mb-1">
            별점 ★★★★★
          </v-list-item-title>
          <v-list-item-subtitle> </v-list-item-subtitle>
          <input
            type="text"
            placeholder="리뷰를 작성해주세요"
            v-model="reviewInput"
          />
        </v-list-item-content>

        <v-list-item-avatar tile size="80" color="grey"></v-list-item-avatar>
      </v-list-item>

      <v-card-actions>
        <v-btn outlined rounded text> 리뷰작성하기 </v-btn>
      </v-card-actions>
    </v-card>
  </div>
</template>
<script>
import axios from "axios";
export default {
  data() {
    return {
      users: null,
      reviewInput: "",
    };
  },
  methods: {
    fetchData() {
      axios
        .get("https://reqres.in/api/users")
        .then((res) => {
          console.log(res.data.data);
          this.users = res.data.data[0];
        })
        .catch((err) => {
          console.log(err);
        });
    },
    ReviewWrite() {
      let url = "api/#";
      let data = { review: this.reviewInput };
      axios.post(url, JSON.stringify(data), {
        headers: {},
      });
      // .then((res) => {
      //     if (res.status === 200) {
      //     }
      // });
    },
  },
  created() {
    this.fetchData(this.pageNum);
  },
};
</script>
<style>
.review {
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 10px 10px 10px 10px;
}
</style>
