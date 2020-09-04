<template>

  <div id="app">

    <!--A VOIR
    <router-view/>-->

    <div class="contenu container">
      <HeaderComponent/>
      <ListeFormations/>
      <CardComponent/>
      <FooterComponent/>

    </div>
  </div>
</template>


<script>

import HeaderComponent from "@/components/HeaderComponent";
import ListeFormations from "@/components/ListeFormations";
import FooterComponent from "@/components/FooterComponent";
import CardComponent from "@/components/CardComponent";

export default {
  name: "App",
  components: {
    HeaderComponent,
    ListeFormations,
    FooterComponent,
    CardComponent

  },
};
</script>

<style></style>
