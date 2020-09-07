<template>
  <div class="d-flex h-100" id="imghome">
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
</template>

<script>
export default {
  name: "CardComponent"
}
</script>

<style scoped>

</style>