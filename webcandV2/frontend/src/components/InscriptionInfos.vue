<template>
  <div>
    <form>
      <div class="col-12">
        <h5 class="bg-info rounded text-light col-10 mx-auto mb-5">1 Choix des informations nécessaires pour la
          Formation
        </h5>
        <div class="form-group row mx-auto d-flex justify-content-center">
          <b-dropdown id="dropdown-1" text="Liste Diplômes" class="">
            <b-dropdown-item>Choix 1</b-dropdown-item>
            <b-dropdown-item>Choix 2</b-dropdown-item>
            <b-dropdown-item>Choix 3</b-dropdown-item>
          </b-dropdown>
          <input type="school" class="form-control col-4" id="school" placeholder="Etablissement">
          <label for="example-datetime-local-input" class="col-form-label"></label>
          <div class="">
            <input class="form-control" type="datetime-local" value="2011-08-19T13:45:00"
                   id="example-datetime-local-input">
          </div>
        </div>
        <div class="mt-4 form-group row mx-auto d-flex justify-content-center">
          <b-dropdown id="dropdown-1" text="Expérience Pro" class="m-md-2">
            <b-dropdown-item>Choix 1</b-dropdown-item>
            <b-dropdown-item>Choix 2</b-dropdown-item>
            <b-dropdown-item>Choix 3</b-dropdown-item>
          </b-dropdown>
          <label for="example-time-input" class="col-form-label">Durée</label>
          <div class="">
            <input class="form-control" type="time" value="13:45:00" id="example-time-input">
          </div>
        </div>
        <div>
          <h5 class="bg-info rounded text-light col-10 mx-auto mt-5">2 Déposer votre CV et Lettre de Motivation</h5>
          <div class="form-group row mx-auto d-flex justify-content-center">
            <b-dropdown id="dropdown-1" text="Liste CV" class="">
              <b-dropdown-item>Choix 1</b-dropdown-item>
              <b-dropdown-item>Choix 2</b-dropdown-item>
              <b-dropdown-item>Choix 3</b-dropdown-item>
            </b-dropdown>
            <input type="school" class="form-control col-4" id="school" placeholder="Etablissement">
          </div>
        </div>
      </div>
      <div class="d-flex justify-content-center">
        <b-button class="btn-success" data-toggle="modal" data-target="#exampleModal">Valider</b-button>

        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Candidature validée</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div class="modal-body">
                Votre candidature à été prise en compte,
                Vous recevrez une réponse sous peu.
              </div>
              <div class="modal-footer">
                <a href="#/" class="btn btn-info" role="button">Accueil</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </form>
  </div>
</template>

<script>

export default {
  name: "InscriptionInfos"
}
</script>

<style scoped>

</style>