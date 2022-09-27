<template>
  <div class="escape">
    <v-card class="mx-auto" max-width="700">
      <div class="white--text align-end" height="200px">
        <Map />
        <v-card-title>넥스트 에디션 강남1호점</v-card-title>
      </div>

      <v-card-subtitle class="pb-0">
        주소 : 서울 서초구 강남대로79길 59 B3층
      </v-card-subtitle>

      <v-card-text class="text--primary">
        <div>추천인원: 2-4</div>

        <div>별점: ★★★★</div>
      </v-card-text>

      <Review />
    </v-card>
  </div>
</template>
<script>
import Map from "@/components/Map";
import Review from "./Review.vue";
export default {
  components: { Map, Review },
};
</script>
<style>
.escape {
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 10px 10px 10px 10px;
}
</style>
