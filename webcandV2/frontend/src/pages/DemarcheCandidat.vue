<template>
  <div>
    <router-view></router-view>
<div>
    <h1>Liste des démarche du candidat :  {{prenom}} </h1>
</div>
    <div>
      <b-table
        :items="items"
        :fields="fields"
        :tbody-tr-class="rowClass"
      ></b-table>
    </div>
  </div>
</template>

<script>

export default {
  name: "DemarcheCandidat",
  components: {
  },
  data() {
    return {
      fields: ["entreprise", "date", "retour"],
      items: [
        {
          retour: 40,
          entreprise: "BOEING",
          date: "20/15/86",
          status: "awesome",
        },
        { retour: 1, entreprise: "CEGEO", date: "20/08/2020" },
        { retour: 0, entreprise: "", date: ""},
        { retour: 4, entreprise: "", date: ""},
        { retour: 5, entreprise: "", date: ""},
        { retour: 5, entreprise: "", date: ""},
        { retour: 5, entreprise: "", date: ""},
        { retour: 5, entreprise: "", date: ""},
        { retour: 5, entreprise: "", date: ""},
      ],
      function() {
       return {
          prenom: 'Pierre'
        }
    }
    };
  },
  methods: {
    rowClass(item, type) {
      if (!item || type !== "row") return;
      if (item.status === "awesome") return "table-success";
    },
  },
};
</script>

<style scoped></style>
