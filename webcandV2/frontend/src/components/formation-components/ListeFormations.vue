<template>
  <div>
    <b-dropdown
        id="dropdown"
        text="Liste formation"
        class="d-inline-flex p-2"
        variant="danger">

      <!-- appel de la liste des formations et leurs details-->
      <b-dropdown-item href="/api/Formations">Liste des formations</b-dropdown-item>

      <!-- appel du composant qui affiche la liste des formations dans le dropdown-->
      <ListeDDFormations></ListeDDFormations>

    </b-dropdown>
  </div>
</template>

<script>
import ListeDDFormations from "./ListeDDFormations";
export default {
  name: "ListeFormations",
  components: {ListeDDFormations}
}
</script>

<style scoped>

</style>
