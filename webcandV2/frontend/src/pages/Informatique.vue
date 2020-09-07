<template>
  <div class="container">
    <div class="head">
      <Header-component/>
    </div>
    <div class="block1">
      <div class="border block1text">
        <a class="">
          <h3>NOM DE LA FORMATION</h3>
          <p>Durée de la Formation :</p>
        </a>
        <p></p>
      </div>
      <div class="btn1">
        <b-button variant="danger">Ajout favoris</b-button>
      </div>
    </div>
    <hr>
    <div>
      <div class="block1">
        <div class="border block1text">
          <a class="">
            <h3>Descriptif Formation</h3>
          </a>
        </div>
      </div>
      <div class="block1">
        <div class="border block1text">
          <a class="">
            <h3>Pourquoi cette Formation</h3>
          </a>
        </div>
      </div>
    </div>
    <hr>
    <div class="block1">
      <div class="border block1text">
        <a class="">
          <h3>Programme de la Formation</h3>
        </a>
      </div>
    </div>
    <div>
      <b-button variant="danger">M'inscrire à la Formation</b-button>
    </div>
    <div class="listform d-flex justify-content-center foot">
      <FooterComponent/>
    </div>
  </div>
</template>

<script>

import HeaderComponent from "@/components/HeaderComponent";
import FooterComponent from "@/components/FooterComponent";

export default {
  name: "Formations",
  components: {
    FooterComponent,
    HeaderComponent,
  },
};
</script>

<style scoped>

.container {
  display: flex;
  flex-direction: column;
  padding: 0;
}

.head {
  margin-top: -4em;
}

.listform {

}

.foot {
  margin-top: 12em;
}

.block1 {
  display: flex;
}

.block1text {
}

.btn1 {
  margin-top: 5em;
  margin-left: 40em;
}
</style>