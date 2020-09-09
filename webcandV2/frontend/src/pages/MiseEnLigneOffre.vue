<template>
  <div>
    <router-view></router-view>
    <div>
      <h3>Entreprise :  </h3>
    </div>
    <div class="container">
      <div class="btntypeoffre">
        <b-button variant="outline-info">Type offre : offre x</b-button>
      </div>
      <div class="textDiv">
      <p>
        DEFINITIN DE LOFFRE ICI FRFRFRFRFRFRF RFRFRFRFRGTRHGIR6GK
        GTGTYHYTRJRYJUYJUYJ
        FREJHFERJFRJGHRKJEGHERZGHLEZGHLERGERJLGHERG
        FERKHGFERKJGFERZKJHERLJEZGERLGERLJGERLJFHKLJERJKLERNRE
        FERJHBFERLJGFERZHFBERZKFVERKFJVERFJBERFJKERJLFKBREF/KN
        DEFINITIN DE LOFFRE ICI FRFRFRFRFRFRF RFRFRFRFRGTRHGIR6GK
        GTGTYHYTRJRYJUYJUYJ
        FREJHFERJFRJGHRKJEGHERZGHLEZGHLERGERJLGHERG
        FERKHGFERKJGFERZKJHERLJEZGERLGERLJGERLJFHKLJERJKLERNRE
        FERJHBFERLJGFERZHFBERZKFVERKFJVERFJBERFJKERJLFKBREF/KN
        DEFINITIN DE LOFFRE ICI FRFRFRFRFRFRF RFRFRFRFRGTRHGIR6GK
        GTGTYHYTRJRYJUYJUYJ
        FREJHFERJFRJGHRKJEGHERZGHLEZGHLERGERJLGHERG
        FERKHGFERKJGFERZKJHERLJEZGERLGERLJGERLJFHKLJERJKLERNRE
        FERJHBFERLJGFERZHFBERZKFVERKFJVERFJBERFJKERJLFKBREF/KN
        DEFINITIN DE LOFFRE ICI FRFRFRFRFRFRF RFRFRFRFRGTRHGIR6GK
        GTGTYHYTRJRYJUYJUYJ
        FREJHFERJFRJGHRKJEGHERZGHLEZGHLERGERJLGHERG
        FERKHGFERKJGFERZKJHERLJEZGERLGERLJGERLJFHKLJERJKLERNRE
        FERJHBFERLJGFERZHFBERZKFVERKFJVERFJBERFJKERJLFKBREF/KN
      </p>
      </div>
      <div class="blockBtninfo">
      <b-button variant="outline-info">DateLimite : 27/08/1985</b-button>
      </div>
    </div>
    <div class="btnOffreEnligne">
          <b-button variant="primary"  @click="senfOffer ">Mettre offre en ligne</b-button>
    </div>
  </div>
</template>

<script>
export default {
    name: "MiseEnLigneOffre",
  components: {
  },
  methods: {
      senfOffer() {
          console.log("Si sa s'affiche la méthode marche maggle");
      }
  },
};
</script>

<style scoped>
h3{
    display: flex;
    justify-content: center;
    border:solid;
    border-color:rgb(70, 146, 108);
 
    
}
.container{
    border:solid;
    display: flex;
    flex-direction:column-reverse;
    align-content:center;
    border-color: red;
    padding: 4em 2em 4em 2em;
}
.btntypeoffre{
    display: flex;
    justify-content: flex-end;
    margin-top:5em;
}
.btnOffreEnligne{
    display: flex;
    justify-content: center;
    margin-top:4em;
}
.blockBtninfo{
    margin-bottom:5em;
}
.textDiv{
    display: flex;
    justify-content: center;
}

</style>
