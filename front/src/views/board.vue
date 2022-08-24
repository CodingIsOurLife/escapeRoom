<template>
  <v-app>
    <v-main>
      <v-container>
        <div>게시판</div>

        <v-simple-table>
          <template v-slot:default>
            <thead>
              <tr>
                <th class="text-left">글번호</th>
                <th class="text-left">제목</th>
                <th class="text-left">날짜</th>
              </tr>
            </thead>
            <tbody>
              <tr v-for="item in desserts" :key="item.title">
                <td>{{ item.id }}</td>
                <td>{{ item.title }}</td>
                <td>{{ item.date }}</td>
              </tr>
            </tbody>
          </template>
        </v-simple-table>

        <div class="text-center">
          <v-pagination
            v-model="page"
            :length="4"
            prev-icon="mdi-menu-left"
            next-icon="mdi-menu-right"
          ></v-pagination>
        </div>
      </v-container>
    </v-main>
  </v-app>
</template>
<script>
export default {
  data() {
    return {
      page: 1,
      desserts: [
        {
          id: 1,
          title: "Frozen Yogurt",
          date: "2022.08.24",
        },
        {
          id: 2,
          title: "Ice cream sandwich",
          date: "2022.08.24",
        },
        {
          id: 3,
          title: "Eclair",
          date: "2022.08.24",
        },
        {
          id: 4,
          title: "Cupcake",
          date: "2022.08.24",
        },
        {
          id: 5,
          title: "Gingerbread",
          date: "2022.08.24",
        },
        {
          id: 6,
          title: "Jelly bean",
          date: "2022.08.24",
        },
        {
          id: 7,
          title: "Lollipop",
          date: "2022.08.24",
        },
        {
          id: 8,
          title: "Honeycomb",
          date: "2022.08.24",
        },
        {
          id: 9,
          title: "Donut",
          date: "2022.08.24",
        },
        {
          id: 10,
          title: "KitKat",
          date: "2022.08.24",
        },
      ],
    };
  },
};
</script>
