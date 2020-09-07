<template>
  <div>
    <div class="head">
      <HeaderComponent/>
    </div>
    <router-view></router-view>
    <div class="foot">
      <FooterComponent/>
    </div>
  </div>
</template>

<script>

import HeaderComponent from "@/components/HeaderComponent";
import FooterComponent from "@/components/FooterComponent";

export default {
  name: "Home",
  components: {
    HeaderComponent,
    FooterComponent

  },
};
</script>

<style scoped>

</style>