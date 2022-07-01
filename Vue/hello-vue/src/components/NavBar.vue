<template>
    <div class="navbar">
        <div class="left">
            <img src="../assets/logo.png" alt="Vue logo">
        </div>
        <div class="center">
            <h1>VueHub</h1>
        </div>
        <div class="right">
            <a 
            v-for="tab of tabs" 
            :key="tab.id" 
            :href="[tab.link]">
                {{ tab.name }}
            </a>
        </div>
    </div>
</template>
<script>
    export default {
        name: 'NavBar',
        data() {
            return {
                tabs: [
                    {
                        name: 'Home',
                        link: '/'
                    },
                    {
                        name: 'About',
                        link: '/about'
                    },
                    {
                        name: 'Contact',
                        link: '/contact'
                    }
                ]
            }
        }
    }
</script>
<style scoped>
    .navbar {
        background-color: #2c3e50;
        color: #ffffff;
        padding: 10px;
    }
    .navbar .left {
        float: left;
        position: absolute;
        margin: 1rem;
    }
    .navbar .center {
        margin-left: auto;
        margin-right: auto;
        text-align: center;
    }
    img {
        width: auto;
        height: 4rem;
    }
    .navbar .right a {
        color: #ffffff;
        text-decoration: none;
        padding: 10px;
    }
    .navbar .right a:hover {
        background-color: #ffffff;
        color: #2c3e50;
    }
</style>