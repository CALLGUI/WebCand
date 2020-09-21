<template>
  <div class="container text-center">
    <h1 class="display-4 text-center">Liste des Formations</h1>
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
            <b-button>Modifier</b-button>
          </td>
          <td>
            <b-button v-on:click="deleteFormation(formation.idFormation)">Supprimer</b-button>
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
      FormationsDataService.retrieveAllFormations()
          .then(response => {
            this.formations = response.data;
          });
    },
    deleteFormation(id) {
      FormationsDataService.deleteUneFormation(id)
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
