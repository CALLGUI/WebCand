<template>
  <div>
    <b-dropdown
        id="dropdown"
        text="Liste formation"
        class="d-inline-flex p-2"
        variant="danger"
    >
      <b-dropdown-item>Formation</b-dropdown-item>
      <b-dropdown-item>Formation</b-dropdown-item>
      <b-dropdown-item>Formation</b-dropdown-item>
    </b-dropdown>
    <b-button id="btndropdown" variant="danger" >Validez choix</b-button>
  </div>
</template>

<script>
export default {
name: "ListeFormations"
}
</script>

<style scoped>

</style>