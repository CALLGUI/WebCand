<template>
  <div>
    <form>
      <div class="text-center">
        <h1 class="display-3">S'inscrire</h1>
        <p>Remplissez les champs ci-dessous pour vous inscrire :</p>
        <hr>

        <div class="mb-2">
          <label><b>Identifiant</b></label>
          <br>
          <input type="text" placeholder="Entrer votre Identifiant" name="email" id="ident" required>
        </div>

        <div class="mb-2">
          <label for="email"><b>E-mail</b></label>
          <br>
          <input type="text" placeholder="Entrer votre E-mail" name="email" id="email" required>
        </div>

        <div class="mb-2">
          <label for="psw"><b>Mot de passe</b></label>
          <br>
          <input type="password" placeholder="Mot de passe" name="psw" id="psw" required>
        </div>

        <div class="mb-4">
          <label for="psw-repeat"><b>Répéter le mot de passe</b></label>
          <br>
          <input type="password" placeholder="Mot de passe" name="psw-repeat" id="psw-repeat" required>
        </div>

        <b-button type="submit" class="registerbtn btn-success">S'inscrire</b-button>
      </div>
      <div class="container signin text-center mt-3">
        <p>Vous avez déjà un compte ? <a href="Login">Se connecter</a>.</p>
      </div>
    </form>
    <router-view></router-view>
  </div>
</template>

<script>

export default {
  name: "Inscription",
}
</script>

<style scoped>

/*
centrer les placeholder des champs d'inscription
*/
::-webkit-input-placeholder {
  text-align: center;
}

</style>