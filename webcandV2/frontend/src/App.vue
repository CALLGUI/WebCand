<template>

  <div id="app">

    <!--A VOIR
    <router-view/>
    -->

    <div class="contenu container">
      <HeaderComponent/>
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

      <div class="container d-flex h-100" id="imghome">
        <b-card-group deck>
          <b-card
              title="TITRE DU MOMENT"
              img-src="/images/poudre.jpg"
              img-alt="Image"
              img-top
          >
            <b-card-text>
              Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa.
              Cum sociis natoque penatibus et
            </b-card-text>
            <template v-slot:footer></template>
          </b-card>

          <b-card
              title="FORMATION EXEMPLE"
              img-src="/images/poudre.jpg"
              img-top
          >
            <b-card-text>
              Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa.
              Cum sociis natoque penatibus et
            </b-card-text>
            <template v-slot:footer></template>
          </b-card>

          <b-card
              title="ACTUALITE"
              img-src="/images/poudre.jpg"
              img-alt="Image"
              img-top
          >
            <b-card-text>
              Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa.
              Cum sociis natoque penatibus et
            </b-card-text>
            <template v-slot:footer></template>
          </b-card>
        </b-card-group>
      </div>

      <footer id="fh5co-footer" class="fh5co-bg" role="contentinfo">
        <div class="overlay"></div>
        <div class="container">
          <div class="row row-pb-md">
            <div class="col-md-4 fh5co-widget">

              <p><a class="btn btn-primary" href="#">Inscrivez vous</a></p>
            </div>
            <div class="row align-items-center">
              <div class="col-md-4 col-sm-4 col-xs-6">
                <ul class="fh5co-footer-links">
                  <li><a href="#">Mentions légales</a></li>
                  <li><a href="#">Contact</a></li>
                </ul>
              </div>

              <div class="col-md-4 col-sm-4 col-xs-6">
                <ul class="fh5co-footer-links">
                  <li><a href="#">Equipe pédagogique</a></li>
                  <li><a href="#">Adresse de l'école</a></li>
                </ul>
              </div>

              <div class="col-md-4 col-sm-4 col-xs-6">
                <ul class="fh5co-footer-links">
                  <li><a href="#">Programme</a></li>
                  <li><a href="#">FAQ</a></li>
                  <li><a href="#">Assistance</a></li>
                </ul>
              </div>
            </div>
          </div>

          <div class="row copyright">
            <div class="col-md-12 text-center">
              <p>
                <small class="block">&copy; 2020 </small>
                <small class="block">Bienvenue sur le site du cnam !</small>
              </p>
            </div>
          </div>
        </div>
      </footer>
    </div>
  </div>
</template>


<script>

import HeaderComponent from "@/components/HeaderComponent";

export default {
  name: "App",
  components: {
    HeaderComponent
  },
};
</script>

<style></style>
