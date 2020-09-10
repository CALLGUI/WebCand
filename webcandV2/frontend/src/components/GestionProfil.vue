<template>
  <div>
    <form class="needs-validation" novalidate>
      <h3 class="display-3 text-center mb-5">Informations</h3>
      <div class="form-row">
        <div class="col-md-4 mb-3">
          <label for="validationCustom01">Prénom</label>
          <input type="text" class="form-control" id="validationCustom01" placeholder="Prénom" value="Jean-Claude"
                 required>
          <div class="valid-feedback">
            Prénom invalide.
          </div>
        </div>
        <div class="col-md-4 mb-3">
          <label for="validationCustom02">Nom</label>
          <input type="text" class="form-control" id="validationCustom02" placeholder="Nom" value="Van Dalle" required>
          <div class="valid-feedback">
            Nom valide.
          </div>
        </div>
        <div class="col-md-4 mb-3">
          <label for="validationCustomUsername">Nom d'utilisateur</label>
          <div class="input-group">
            <div class="input-group-prepend">
              <span class="input-group-text" id="inputGroupPrepend">@</span>
            </div>
            <input type="text" class="form-control" id="validationCustomUsername" placeholder="Pseudo"
                   aria-describedby="inputGroupPrepend" required>
            <div class="invalid-feedback">
              Merci de choisir un nom d'utilisateur.
            </div>
          </div>
        </div>
      </div>

      <div class="form-row mb-2">

        <div class="col">
          <input type="text" class="form-control" placeholder="Age">
        </div>

      </div>

      <div class="form-group">
        <label for="exampleInputEmail1">Adresse</label>
        <input type="adress" class="form-control" id="Adresse"
               placeholder="Adresse">
      </div>

      <div class="form-group">
        <label for="exampleInputEmail1">Adresse E-mail</label>
        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
               placeholder="Adresse E-mail">
        <small id="emailHelp" class="form-text text-muted">Nous n'allons pas partager votre adresse e-mail.</small>
      </div>

      <div class="form-row">
        <div class="col-md-6 mb-3">
          <label for="validationCustom03">Ville</label>
          <input type="text" class="form-control" id="validationCustom03" placeholder="Ville" required>
          <div class="invalid-feedback">
            Merci de rentrer une ville valide.
          </div>
        </div>
        <div class="col-md-3 mb-3">
          <label for="validationCustom04">Région</label>
          <input type="text" class="form-control" id="validationCustom04" placeholder="Région" required>
          <div class="invalid-feedback">
            Merci de rentrer une région valide.
          </div>
        </div>
        <div class="col-md-3 mb-3">
          <label for="validationCustom05">Code postal</label>
          <input type="text" class="form-control" id="validationCustom05" placeholder="Code postal" required>
          <div class="invalid-feedback">
            Merci de rentrer un code postal valide.
          </div>
        </div>
      </div>
      <div class="form-group">
        <div class="form-check">
          <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
          <label class="form-check-label" for="invalidCheck">
            Veuillez accepter les lois en vigueur de la municipalité du septième fiel.
          </label>
          <div class="invalid-feedback">
            Acceptez la loi !
          </div>
        </div>
      </div>
      <button class="btn btn-primary" type="submit">CHAAARGEEEEZ!</button>
    </form>

  </div>
</template>

<script>

export default {
  name: "Profil"
}

</script>

<style scoped>

</style>