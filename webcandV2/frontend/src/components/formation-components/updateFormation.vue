<template>
  <div class="submit-form text-center">
    <h1 class="display-4 mb-3">Modifier une Formation</h1>
    <div v-if="!submitted">
      <div class="form-group">
        <input
            type="text"
            class="form-control text-center"
            id="nomFormation"
            required
            name="nomFormation"
            v-model="formation.nomFormation"
        >
      </div>
      <div class="form-group">
        <input
            class="form-control text-center"
            id="descriptionFormation"
            required
            name="descriptionFormation"
            v-model="formation.descriptionFormation"
        />
      </div>
      <button class="btn btn-warning" @click="majFormation">Modifier</button>
    </div>
  </div>
</template>

<script>

import FormationsDataService from "@/services/FormationsDataService";

export default {
  name: "updateFormation",
  data() {
    return {
      formation: null,
    };
  },
  methods: {

    appelFormation(id) {
      FormationsDataService.getFormation(id)
      .then(response => {
        this.formation = response.data;
        console.log(response.data)
      })
    },


    majFormation() {
      FormationsDataService.updateFormation(this.formation.id, this.formation)
      .then(response => {
        console.log(response.data);
      })
    }
  },
  mounted() {
    this.appelFormation(this.$route.params.id);
  }
}
</script>

<style scoped>

</style>
