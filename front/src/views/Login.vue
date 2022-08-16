<template>
  <form>
    <v-text-field
      v-model="email"
      :error-messages="emailErrors"
      :counter="10"
      label="email"
      required
      @input="$v.name.$touch()"
      @blur="$v.name.$touch()"
    ></v-text-field>
    <v-text-field
      v-model="password"
      :error-messages="passwordErrors"
      label="password"
      required
      @input="$v.email.$touch()"
      @blur="$v.email.$touch()"
    ></v-text-field>

    <v-btn class="mr-4" @click="submit"> 로그인 </v-btn>
    <v-btn @click="clear"> 취소 </v-btn>
  </form>
</template>
