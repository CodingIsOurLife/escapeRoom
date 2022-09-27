<template>
  <div class="outer">
    <div class="inner">
      <v-card class="mx-auto" width="100%" outlined>
        <v-list-item three-line>
          <v-list-item-content>
            <v-list-item-title class="font1">
              인생은 참 ....
            </v-list-item-title>
            <v-list-item-subtitle class="font2"
              >정말 힘이 듭니다....</v-list-item-subtitle
            >
          </v-list-item-content>

          <v-list-item-avatar tile size="80" color="black"></v-list-item-avatar>
        </v-list-item>
      </v-card>
    </div>
  </div>
</template>
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
