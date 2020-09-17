<template>
  <div>
    <b-row class="d-flex justify-content-between">
      <div class="bg-light col-10">
        <a class="">
          <h3>NOM DE LA FORMATION :</h3>
          <p>Durée de la Formation :</p>
        </a>
      </div>
      <div class="col-2">
        <b-button variant="danger">Ajout favoris</b-button>
      </div>
    </b-row>
    <hr>
    <div>
      <div class="">
        <div class="bg-light">
          <a class="">
            <h3>Descriptif Formation</h3>
            <p>Est camerarius vita, cesaris. Favere absolute ducunt ad rusticus ignigena.</p>
          </a>
        </div>
      </div>
      <div class="">
        <div class="bg-light">
          <a class="">
            <h3>Pourquoi cette Formation</h3>
            <p>Living is the only mineral, the only guarantee of satori.</p>
          </a>
        </div>
      </div>
    </div>
    <hr>
    <div class="">
      <div class="bg-light mb-5">
        <a class="">
          <h3>Programme de la Formation</h3>
          <p>Machines are the pathways of the final energy.</p>
        </a>
      </div>
    </div>
    <div class="d-flex justify-content-center">
      <a class="btn btn-danger" href="InscriptionInfos" role="button">M'inscrire à la Formation</a>
    </div>
    <div class="listform d-flex justify-content-left foot">
    </div>
    <router-view></router-view>
  </div>
</template>

<script>

export default {
  name: "Informatique",
  components: {
  },
};

</script>

<style scoped>

</style>
