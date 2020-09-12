<template>
    <div class="container">
        <div class="container">
                <tbody>
                <tr v-for="formation in formations" v-bind:key="formation.nomFormation">
                    <td>
                        <a v-bind:href="'/api/formations/'+formation.idFormation">{{formation.nomFormation}}</a>
                    </td>
                </tr>
                </tbody>
        </div>
    </div>
</template>
<script>
    import FormationsDataService from "../services/FormationsDataService";

    export default {
        name: "ListeDDFormations",
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
