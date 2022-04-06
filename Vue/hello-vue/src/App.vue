<template>
  <div id="app">
    <NavBar/>
    <MainBody msg="Welcome to Your Vue.js App"/>
    <Footer/>
  </div>
</template>

<script>
import MainBody from './components/MainBody.vue'
import NavBar from './components/NavBar.vue'

export default {
  name: 'App',
  components: {
    MainBody,
    NavBar
  }
}
</script>

<style>
body {
  margin: 0;
  padding: 0;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
