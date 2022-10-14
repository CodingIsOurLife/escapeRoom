<template>
  <v-carousel :show-arrows="false" height="600">
    <v-carousel-item
      v-for="(item, i) in items"
      :key="i"
      :src="item.src"
    ></v-carousel-item>
  </v-carousel>
</template>
<script>
export default {
  data() {
    return {
      items: [
        {
          src: "./방탈출.jpg",
        },
        {
          src: "./방탈출2.jpg",
        },
      ],
    };
  },
};
</script>
