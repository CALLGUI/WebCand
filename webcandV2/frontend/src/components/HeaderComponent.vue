<template>

  <div class="mb-5">

    <!--  Header partie 1-->
    <nav class="navbar navcolor bg-light border">
      <div class="col-4">
        <img src="../assets/1280px-CNAM_Logo.svg.png" class="navbar-brand img-fluid" href="/">
      </div>
      <form class="form-inline">
        <input class="form-control mr-sm-2" type="search" placeholder="Rechercher" aria-label="Search">
        <button class="btn btn-primary my-2 my-sm-0" type="submit">Chercher</button>
        <div class="ml-3">
          <a class="btn btn-light" href="Login" role="button">Login</a>
          <router-link class="navbar-brand" to="/Profil">Profil</router-link>
        </div>
      </form>
    </nav>

    <!--Header partie  2-->
    <div class="">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
              aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item active">
            <a class="nav-link" href="/">Accueil <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <ListeFormations/>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="Profil">Profil</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">amodifier</a>
          </li>
        </ul>
      </div>
    </nav>
    </div>
  </div>
</template>

<script>


import ListeFormations from "@/components/formation-components/ListeFormations";

export default {
  name: "HeaderComponent",
  components: {ListeFormations}
}


</script>

<style scoped>

</style>
