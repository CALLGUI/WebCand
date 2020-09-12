<template>
    <div class="container">
        <h3>All Formations</h3>
        <div class="container">
            <table class="table">
                <thead>
                <tr>
                    <th>Id</th>
                    <th>Description</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="formation in formations" v-bind:key="formation.nomFormation">
                    <td>{{formation.nomFormation}}</td>
                    <td>{{formation.descriptionFormation}}</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>
<script>
    import FormationsDataService from "../services/FormationsDataService";

    export default {
        name: "ListeDesFormations",
        data() {
            return {
                formations: []
            };
        },
        methods: {
            refreshFormations() {
                FormationsDataService.retrieveAllFormations()
                    .then(response => {
                        this.formations = response.data;
                    });
            }
        },
        created() {
            this.refreshFormations();
        }
    }
</script>

<style scoped>

</style>
