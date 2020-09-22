<template>
  <div class="container text-center">
    <h1 class="display-4">Liste des Formations</h1>
    <input type="text" class="form-control mb-2" placeholder="chercher par nom" v-model="nomFormation">
    <div class="input-group-append">
<!--      <button class="btn btn-outline-secondary" type="button"-->
<!--              @click=""-->
<!--      >-->
<!--        Chercher-->
<!--      </button>-->
    </div>
    <b-button class="float-right btn-success" href="FormationsAdd">Ajouter Formation</b-button>
    <div class="container">
      <table class="table">
        <thead>
        <tr>
          <th>Nom</th>
          <th>Description</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="formation in formations" v-bind:key="formation.nomFormation">
          <td><a v-bind:href="'/api/Formations/'+formation.idFormation">{{ formation.nomFormation }}</a></td>
          <td>{{ formation.descriptionFormation }}</td>
          <td>
            <b-button class="btn-warning">Modifier</b-button>
          </td>
          <td>
            <b-button class="btn-danger" v-on:click="deleteFormation(formation.idFormation)">Supprimer</b-button>
          </td>
        </tr>
        </tbody>
      </table>
    </div>

  </div>
</template>
<script>
import FormationsDataService from "../services/FormationsDataService";

export default {
  name: "ListeDesFormations",
  data() {
    return {
      formations: []
    };
  },
  methods: {
    refreshFormations() {
      FormationsDataService.getAllFormation()
          .then(response => {
            this.formations = response.data;
          });
    },
    deleteFormation(id) {
      FormationsDataService.deleteFormation(id)
      this.refreshFormations();
    },
  },
  created() {
    this.refreshFormations();
    this.deleteFormation();
  }
}


</script>

<style scoped>

</style>
