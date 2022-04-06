<template>
  <div class="main-body">
    <SideBar class="sidebar"/>
    <MainContent class="main-content"/>
  </div>
</template>

<script>
import SideBar from './SideBar.vue'
import MainContent from './MainContent.vue'

export default {
  name: 'MainBody', 
  props: {
    msg: String
  },
  components: {
    SideBar,
    MainContent
  }
}
</script>

<style scoped>
.main-body {
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  align-items: center;
}
.sidebar {
  background-color: #f5f5f5;
  padding: 20px;
  min-width: 15%;
}
</style>
