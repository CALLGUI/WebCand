<template>

  <!--  Header 1-->
  <div class="container">
    <nav class="col-12 navbar navcolor bg-light border">
      <img src="../assets/1280px-CNAM_Logo.svg.png" style=" width: 324px; height: 68px;" class="navbar-brand" href="/">
      <form class="form-inline">
        <input class="form-control mr-sm-2" type="search" placeholder="Rechercher" aria-label="Search">
        <button class="btn btn-primary my-2 my-sm-0" type="submit">Chercher</button>
      </form>
    </nav>


    <!--Header 2-->
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
            <a class="nav-link" href="#">Accueil <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Formations</a>
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


export default {
  name: "HeaderComponent"
}


</script>

<style scoped>

</style>