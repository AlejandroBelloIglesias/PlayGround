<template>
  <div>
    <h1>Grid View</h1>
    <div>{{ info }}</div>
    <v-btn v-on:click="getPrice()">
        Click Me
    </v-btn>

  </div>
</template>
<script>
export default {
  name: "GridView",
  info: {},
  methods: {
    getPrice() {
      axios
        .get("https://api.coindesk.com/v1/bpi/currentprice.json")
        .then((response) => (this.info = response));
    },
  },
};
</script>
