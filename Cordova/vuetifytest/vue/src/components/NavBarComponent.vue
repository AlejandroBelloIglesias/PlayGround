<template>
  <nav>
    <!-- Sidebar when page is shrinked -->
    <v-navigation-drawer v-model="sidebar" temporary absolute clipped>
      <v-list-item>
        <v-list-item-content>
          <v-list-item-title class="text-h6">
            {{ appTitle }}
          </v-list-item-title>
        </v-list-item-content>
      </v-list-item>
      <v-list dense nav>
        <v-list-item
          v-for="item in menuItems"
          :key="item.title"
          :to="item.path"
        >
          <v-list-item-icon>
            <v-icon>{{ item.icon }}</v-icon>
          </v-list-item-icon>
          <v-list-item-content>
            {{ item.title }}
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>

    <v-toolbar color="blue" fixed>
      <!--Collapse button-->
      <span class="hidden-sm-and-up">
        <v-app-bar-nav-icon @click="sidebar = !sidebar"></v-app-bar-nav-icon>
      </span>
      <!--Title-->
      <v-toolbar-title>
        <router-link to="/" tag="span" style="cursor: pointer">
          {{ appTitle }}
        </router-link>
      </v-toolbar-title>
      <v-spacer></v-spacer>
      <!--Items-->
      <v-toolbar-items class="hidden-xs-only">
        <v-btn v-for="item in menuItems" :key="item.title" :to="item.path" text>
          <v-icon class="pr-2">{{ item.icon }}</v-icon>
          {{ item.title }}
        </v-btn>
      </v-toolbar-items>
    </v-toolbar>
  </nav>
</template>

<script>
export default {
  name: "App",
  data() {
    return {
      appTitle: "Amiitel Test",
      sidebar: false,
      menuItems: [
        { title: "Home", path: "/", icon: "mdi-home" },
        { title: "About", path: "/about", icon: "mdi-domain" },
        { title: "Grid", path: "/grid", icon: "" },
      ],
    };
  },
};
</script>