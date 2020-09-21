<template>
  <div>
    <div>
      <i class="fab fa-html5"></i>
    </div>
    <div>
      <nav class="navbar navbar-expand-lg navbar-light bg-primary mb-5">
<!--        <a>{{"Bienvenue " + enseignant.nomEnseignant}}</a>-->
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText"
                aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarText">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <router-link class="nav-link" to="/Profil/GestionProfil">Gestion Profil<span
                  class="sr-only">(current)</span></router-link>
            </li>
            <li class="nav-item">
              <router-link class="nav-link" to="Profil">Lien 2</router-link>
            </li>
            <li class="nav-item">
              <router-link class="nav-link" to="Profil">Lien 3</router-link>
            </li>
          </ul>
          <span class="navbar-text">

    </span>
        </div>
      </nav>
      <router-view></router-view>
    </div>
  </div>

</template>

<script>
import EnseignantsDataService from "@/services/EnseignantsDataService";

export default {
  name: "Profil",
  data() {
    return {
      enseignants: []
    };
  },
  methods: {
    findEnseignant(id) {
      EnseignantsDataService.retrieveUnEnseignant(id)
          .then(response => {
            this.enseignants = response.data;
          });
    },
  },
  created() {
    this.findEnseignant();
  }
}
</script>

<style scoped>

</style>
