<template>
  <div class="review">
    <template>
      <v-card class="mx-auto" max-width="500" outlined>
        <v-list-item three-line>
          <v-list-item-content>
            <div class="text-overline mb-4">
              {{ users.first_name }}
            </div>
            <v-list-item-title class="text-h5 mb-1">
              별점:{{ users.email }}
            </v-list-item-title>
            <v-list-item-subtitle>내용:{{ users.email }}</v-list-item-subtitle>
          </v-list-item-content>

          <v-list-item-avatar tile size="80" color="grey"></v-list-item-avatar>
        </v-list-item>

        <v-card-actions>
          <v-btn
            outlined
            rounded
            text
            @click="
              {
                deleteReview;
              }
            "
          >
            삭제
          </v-btn>
        </v-card-actions>
      </v-card>
    </template>
  </div>
</template>

<script>
import axios from "axios";

export default {
  components: {},
  data() {
    return {
      users: null,
      totalPage: null,

      pageNum: 1,
    };
  },
  methods: {
    fetchData(pageNum) {
      axios
        .get("https://reqres.in/api/users?page=" + pageNum)
        .then((res) => {
          console.log(res.data.data);
          this.users = res.data.data[0];

          this.totalPage = res.data.total_pages;
        })
        .catch((err) => {
          console.log(err);
        });
    },
  },
  deleteReview() {
    axios.post().then();
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
