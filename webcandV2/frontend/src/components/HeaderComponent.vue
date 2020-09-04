<template>
  <div>
    <b-navbar toggleable="lg" type="dark" variant="danger" class="img-responsive">
      <b-navbar-brand>
        <div><a href="#">
          <img id="logoacc" src="../assets/1280px-CNAM_Logo.svg.png">
        </a></div>
      </b-navbar-brand>
      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>
        <b-navbar-nav class="ml-auto">
          <b-nav-form>
            <b-form-input size="sm" class="mr-sm-2"></b-form-input>
            <b-button
                size="sm"
                class="my-2 my-sm-0"
                type="submit"
                variant="danger"
            >Search
            </b-button
            >
          </b-nav-form>

          <b-nav-item-dropdown right>
            <template v-slot:button-content>
              <em>Utilisateur</em>
            </template>
            <b-dropdown-item href="#">Sign Out</b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
  </div>
</template>

<script>


export default {
  name: "HeaderComponent"
}


</script>

<style scoped>

</style>