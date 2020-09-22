<template>
  <div class="submit-form text-center">
    <h1 class="display-4 mb-3">Ajouter une Formation</h1>
    <div v-if="!submitted">
      <div class="form-group">
        <input
            type="text"
            class="form-control text-center"
            id="nomFormation"
            required
            v-model="formation.nomFormation"
            name="nomFormation"
            placeholder="Nom de la Formation"
        />
      </div>
      <div class="form-group">
        <input
            class="form-control text-center"
            id="descriptionFormation"
            required
            v-model="formation.descriptionFormation"
            name="descriptionFormation"
            placeholder="Description de la formation"
        />
      </div>

      <button @click="saveFormation" class="btn btn-success">Submit</button>
    </div>

    <div v-else>
      <h4>Yes</h4>
      <button class="btn btn-success" @click="newFormation">Add</button>
    </div>
  </div>
</template>

<script>
import FormationsDataService from "@/services/FormationsDataService";

export default {
  name: "AddFormation",
  data() {
    return {
      formation: {
        idFormation: null,
        nomFormation: '',
        descriptionFormation: '',
        published: false
      },
      submitted: false
    };
  },
  methods: {
    saveFormation() {
      var data = {
        nomFormation: this.formation.nomFormation,
        descriptionFormation: this.formation.descriptionFormation
      };

      FormationsDataService.createFormation(data)
          .then(response => {
            this.formation.idFormation = response.data.id;
            console.log(response.data);
            this.submitted = true;
          })
          .catch(e => {
            console.log(e);
          });
    },

    newFormation() {
      this.submitted = false;
      this.formation = {};
    }
  }
}
</script>

<style scoped>

</style>
