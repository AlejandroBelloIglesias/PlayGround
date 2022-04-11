<template>
  <v-container>
    <v-row class="text-center">
      <v-col cols="12">
        <v-img
          :src="require('../assets/logo.svg')"
          class="my-3"
          contain
          height="200"
        />
      </v-col>

      <v-col class="mb-4">
        <h1 class="display-2 font-weight-bold mb-3">Welcome to Vuetify</h1>

        <p class="subheading font-weight-regular">
          For help and collaboration with other Vuetify developers,
          <br />please join our online
          <a href="https://community.vuetifyjs.com" target="_blank"
            >Discord Community</a
          >
        </p>
      </v-col>

      <v-col class="mb-5" cols="12">
        <h2 class="headline font-weight-bold mb-3">What's next?</h2>

        <v-row justify="center">
          <a
            v-for="(next, i) in whatsNext"
            :key="i"
            :href="next.href"
            class="subheading mx-3"
            target="_blank"
          >
            {{ next.text }}
          </a>
        </v-row>
      </v-col>

      <v-col class="mb-5" cols="12">
        <h2 class="headline font-weight-bold mb-3">Important Links</h2>

        <v-row justify="center">
          <a
            v-for="(link, i) in importantLinks"
            :key="i"
            :href="link.href"
            class="subheading mx-3"
            target="_blank"
          >
            {{ link.text }}
          </a>
        </v-row>
      </v-col>

      <v-col class="mb-5" cols="12">
        <h2 class="headline font-weight-bold mb-3">Ecosystem</h2>

        <v-row justify="center">
          <a
            v-for="(eco, i) in ecosystem"
            :key="i"
            :href="eco.href"
            class="subheading mx-3"
            target="_blank"
          >
            {{ eco.text }}
          </a>
        </v-row>
      </v-col>
      <v-row>
        <v-col cols="12" sm="6">
          A lot of text for displacing the footer out of the screen: Lorem ipsum
          dolor sit amet, consectetur adipiscing elit. Morbi in velit sit amet
          magna lacinia eleifend ac non orci. Nunc tincidunt justo at auctor
          eleifend. Praesent semper purus ut tellus eleifend, et laoreet eros
          ultricies. Curabitur sed eleifend augue, vel eleifend velit. Phasellus
          in diam viverra libero ornare facilisis eu at augue. Nunc vitae metus
          quis orci consequat efficitur vel nec augue. Suspendisse augue diam,
          auctor vitae luctus ornare, rhoncus non dolor. Nullam metus purus,
          lacinia eu tincidunt sed, elementum sed metus. Praesent bibendum
          mattis risus, quis ullamcorper eros lobortis ac. Sed sodales fringilla
          nibh, vel finibus massa ullamcorper sed. Nulla vulputate lectus ac
          iaculis luctus. Cras vitae augue non dolor posuere lobortis. Ut
          sagittis imperdiet nibh porttitor commodo. Duis augue odio, vulputate
          et lacinia at, interdum in ante. Vestibulum ante ipsum primis in
          faucibus orci luctus et ultrices posuere cubilia curae; Fusce eget
          ligula velit. Curabitur imperdiet lectus in sem pulvinar, eu dignissim
          eros ullamcorper. Curabitur ac nulla at justo tristique eleifend ac
          nec justo. Proin vulputate id nisi in hendrerit. Orci varius natoque
          penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed
          vel elementum enim. Vivamus tortor magna, euismod vitae est eget,
          porta tincidunt ligula. Nunc cursus consequat ipsum, non efficitur sem
          tristique sed. Fusce porta, odio ac aliquam vehicula, odio mauris
          bibendum mi, ac egestas turpis justo in nisl.
        </v-col>
        <v-col cols="12" sm="6">
          Mauris est justo, vestibulum id elementum et, mollis ac sem. Curabitur
          sit amet ultrices nunc, in aliquam lectus. Nullam sed lobortis turpis.
          Phasellus lobortis nec nunc euismod pulvinar. Aenean finibus est sit
          amet ipsum condimentum, id tincidunt nulla suscipit. Donec faucibus
          elementum leo vitae rutrum. Suspendisse tempor rhoncus ornare. Etiam
          magna est, vulputate a neque non, iaculis scelerisque ex. Curabitur
          egestas metus sed urna accumsan suscipit. Praesent sodales sem vitae
          eros laoreet, vel pharetra diam laoreet. Nullam justo lacus, efficitur
          in eleifend vitae, suscipit id diam. Nullam consectetur, ex eget
          venenatis molestie, sapien arcu accumsan metus, ut vulputate purus
          velit vel est. Praesent faucibus fermentum ornare. Suspendisse congue
          imperdiet justo quis consectetur. Curabitur nec lacus odio. Nulla a
          convallis odio, sit amet pellentesque eros. Proin non consectetur dui.
          Maecenas nisi arcu, consectetur sit amet libero et, hendrerit
          facilisis ligula. Nulla pellentesque efficitur ultricies. Quisque
          sagittis nisl et tortor imperdiet eleifend. Etiam malesuada nisl id
          neque dapibus iaculis. Curabitur ac mattis neque, ut aliquet risus.
          Nunc iaculis elementum tellus ac fermentum. Curabitur elementum nulla
          mauris, quis scelerisque nibh rutrum ut. Praesent cursus mollis nulla,
          non consectetur lacus fringilla a. Aenean ultricies quam non est
          placerat ornare. Integer diam sem, iaculis vitae faucibus ac,
          imperdiet rhoncus nisi. Aenean quis consectetur dui. Nam faucibus
          condimentum ligula, eu sodales lectus vulputate eget. Donec lectus
          enim, semper sit amet congue ac, faucibus sit amet odio. Vivamus risus
          massa, feugiat ultrices tempor vel, faucibus at lacus. Lorem ipsum
          dolor sit amet, consectetur adipiscing elit. Phasellus blandit, diam
          sed placerat blandit, ex ipsum gravida ligula, consectetur posuere
          purus neque vitae ligula. Nunc sagittis odio ante, ac aliquam urna
          sagittis ac.
        </v-col>
      </v-row>
    </v-row>
  </v-container>
</template>

<script>
export default {
  name: "HelloWorld",

  data: () => ({
    ecosystem: [
      {
        text: "vuetify-loader",
        href: "https://github.com/vuetifyjs/vuetify-loader",
      },
      {
        text: "github",
        href: "https://github.com/vuetifyjs/vuetify",
      },
      {
        text: "awesome-vuetify",
        href: "https://github.com/vuetifyjs/awesome-vuetify",
      },
    ],
    importantLinks: [
      {
        text: "Documentation",
        href: "https://vuetifyjs.com",
      },
      {
        text: "Chat",
        href: "https://community.vuetifyjs.com",
      },
      {
        text: "Made with Vuetify",
        href: "https://madewithvuejs.com/vuetify",
      },
      {
        text: "Twitter",
        href: "https://twitter.com/vuetifyjs",
      },
      {
        text: "Articles",
        href: "https://medium.com/vuetify",
      },
    ],
    whatsNext: [
      {
        text: "Explore components",
        href: "https://vuetifyjs.com/components/api-explorer",
      },
      {
        text: "Select a layout",
        href: "https://vuetifyjs.com/getting-started/pre-made-layouts",
      },
      {
        text: "Frequently Asked Questions",
        href: "https://vuetifyjs.com/getting-started/frequently-asked-questions",
      },
    ],
  }),
};
</script>
