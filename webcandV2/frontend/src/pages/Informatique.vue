<template>
  <div>
    <div class="">
      <div class="border">
        <a class="">
          <h3>NOM DE LA FORMATION</h3>
          <p>Durée de la Formation :</p>
        </a>
        <p></p>
      </div>
      <div class="">
        <b-button variant="danger">Ajout favoris</b-button>
      </div>
    </div>
    <hr>
    <div>
      <div class="">
        <div class="border">
          <a class="">
            <h3>Descriptif Formation</h3>
          </a>
        </div>
      </div>
      <div class="">
        <div class="border">
          <a class="">
            <h3>Pourquoi cette Formation</h3>
          </a>
        </div>
      </div>
    </div>
    <hr>
    <div class="">
      <div class="border">
        <a class="">
          <h3>Programme de la Formation</h3>
        </a>
      </div>
    </div>
    <div class="d-flex justify-content-center">
      <b-button variant="danger">M'inscrire à la Formation</b-button>
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