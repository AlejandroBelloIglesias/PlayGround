<template>
  <v-app>
    <!--NAVBAR-->
     <navbar/>

    <!--MAIN CONTENT-->
    <v-main>
      <router-view />
    </v-main>

    <!--FOOTER-->
    <footercomponent/>

  </v-app>
</template>

<script>

import navbar from './components/NavBarComponent.vue'
import footercomponent from './components/FooterComponent.vue'

export default {
  name: "App",
  components: {
    navbar,
    footercomponent
  },
};
</script>
<style>
</style>