<template>
  <div class="escape">
    <v-card class="mx-auto" max-width="700">
      <div class="white--text align-end" height="200px">
        <Map />
        <v-card-title>강남방탈출이름</v-card-title>
      </div>

      <v-card-subtitle class="pb-0"> 주소 : </v-card-subtitle>

      <v-card-text class="text--primary">
        <div>추천인원:</div>

        <div>별점: 별별별별별</div>
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
