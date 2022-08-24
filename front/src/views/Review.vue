<template>
  <div>
    <ReviewCreate />
    <ReviewRead />
  </div>
</template>
<script>
import ReviewCreate from "@/components/ReviewCreate.vue";
import ReviewRead from "@/components/ReviewRead.vue";
export default {
  components: { ReviewCreate, ReviewRead },
};
</script>
