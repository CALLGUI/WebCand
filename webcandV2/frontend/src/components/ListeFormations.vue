<template>
  <div>
    <b-dropdown
        id="dropdown"
        text="Liste formation"
        class="d-inline-flex p-2"
        variant="danger">

      <b-dropdown-item href="Informatique">Informatique</b-dropdown-item>
      <b-dropdown-item href="DemarcheCandidat">RH</b-dropdown-item>
      <b-dropdown-item>Gestion</b-dropdown-item>
    </b-dropdown>
  </div>
</template>

<script>
export default {
  name: "ListeFormations"
}
</script>

<style scoped>

</style>