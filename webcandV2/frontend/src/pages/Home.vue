<template>
  <div class="container">
    <div class="head">
      <HeaderComponent/>
    </div>
    <div class="listform d-flex justify-content-center">
      <ListeFormations/>
    </div>
    <div class="cards">
      <CardComponent/>
    </div>
    <div class="foot">
      <FooterComponent/>
    </div>


  </div>
</template>

<script>

import HeaderComponent from "@/components/HeaderComponent";
import FooterComponent from "@/components/FooterComponent";
import ListeFormations from "@/components/ListeFormations";


export default {
  name: "Home",
  components: {
    HeaderComponent,
    FooterComponent,
    ListeFormations

  },
};
</script>

<style scoped>


.container {
  display: flex;
  flex-direction: column;
}

.head{
  margin-top: -4em;
}

.listform{

}

.foot{
  margin-top: 12em;
}



</style>