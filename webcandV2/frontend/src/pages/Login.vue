<template>
  <div>
    <div class="mx-auto d-flex justify-content-center text-center">
      <form class="form-signin">
        <h1 class="h3 mb-3 font-weight-normal display-4">Connectez-vous</h1>
        <label for="inputEmail" class="sr-only">E-mail</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required="" autofocus="">
        <label for="inputPassword" class="sr-only">Mot de passe</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required="">

        <div class="d-inline-block mt-3">
          <div class="float-left">
          <label for="save">Souvenez-vous</label>
          </div>
          <div class="float-right">
            <input type="checkbox" id="save" name="save">
          </div>
        </div>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
    </div>
  </div>
</template>

<script>

export default {
  name: "Login"
}
</script>

<style scoped>

</style>