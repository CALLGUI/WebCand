<template>

  <div>

    <!--  Header partie 1-->
    <nav class="navbar navcolor bg-light border">
      <div class="col-4">
      <img src="../assets/1280px-CNAM_Logo.svg.png" class="navbar-brand img-fluid" href="/">
      </div>
      <form class="form-inline">
        <input class="form-control mr-sm-2" type="search" placeholder="Rechercher" aria-label="Search">
        <button class="btn btn-primary my-2 my-sm-0" type="submit">Chercher</button>
      </form>
    </nav>

    <!--Header partie  2-->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <div class="dropdown">
        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown"
                aria-haspopup="true" aria-expanded="false">
          Menu
        </button>
        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
          <a class="dropdown-item" href="#">Action 1</a>
          <a class="dropdown-item" href="#">Action 2</a>
          <a class="dropdown-item" href="#">Action 3</a>
        </div>
      </div>
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
            <a class="nav-link" href="#">amodifier</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">amodifier</a>
          </li>
        </ul>
      </div>
    </nav>
  </div>
</template>

<script>


import ListeFormations from "@/components/ListeFormations";

export default {
  name: "HeaderComponent",
  components: {ListeFormations}
}


</script>

<style scoped>

</style>