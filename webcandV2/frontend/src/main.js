import Vue from "vue";
import App from "./App.vue";
import VueRouter from "vue-router";

import {BootstrapVue, IconsPlugin} from "bootstrap-vue";

//imports
import "bootstrap/dist/css/bootstrap.css";
import "bootstrap-vue/dist/bootstrap-vue.css";
import "./custom.scss";

//imports components
import MentionLegales from "@/components/MentionLegales";
import CardComponent from "@/components/CardComponent";
import Login from "@/pages/Login";
import InscriptionInfos from "@/components/InscriptionInfos";
import GestionProfil from "@/components/GestionProfil";
import ListeFormations from "@/components/formation-components/ListeFormations";
//import ModifierFormation from "@/components/formation-components/ModifierFormation";
import updateFormation from "@/components/formation-components/updateFormation";



//imports pages
import Home from "@/pages/Home";
import Formation from "@/pages/Formation";
import MiseEnLigneOffre from "@/pages/MiseEnLigneOffre";
import NotFound from "@/pages/NotFound";
import DemarcheCandidat from "@/pages/DemarcheCandidat";
import Postuler from "@/pages/Postuler";
import Inscription from "@/pages/Inscription";
import Profil from "@/pages/Profil";
import FormationsApp from "./components/formation-components/FormationsApp";
import AddFormation from "@/components/formation-components/AddFormation";



Vue.use(BootstrapVue);
Vue.use(IconsPlugin);
Vue.use(VueRouter);

const routes = [
    {
        path: "/", component: Home,
        children: [
            //INDEX DEFAULT
            {path: "/", component: CardComponent},
            //
            {path: "/mentionleg", component: MentionLegales},
            {path: "/listeformations", component: ListeFormations},
            {path: "/Formation", component: Formation},
            {path: "/DemarcheCandidat", component: DemarcheCandidat},
            {path: "/Postuler", component: Postuler},
            {path: "/MiseEnLigneOffre", component: MiseEnLigneOffre},
            {path: "/Login", component: Login},
            {path: "/Inscription", component: Inscription},
            {path: "/InscriptionInfos", component: InscriptionInfos},


            //Appel au back api
            //{path: "/api/formation/", component: Formation},

            {path: "/api/Formations/:id", component: Formation},
            {path: "/api/Formations/", component: FormationsApp},
            {path: "/api/Formations/:id", component: FormationsApp},
            {path: "/api/FormationsAdd/", component: AddFormation},
            //{path: "/api/ModifierFormation/:id", component: ModifierFormation},
            {path: "/api/ModifierFormation/:id", component: updateFormation},



            {
                path: "Profil/:id", component: Profil,
                children: [
                    {path: "GestionProfil", component: GestionProfil},
                ]
            },

            {path: "*", name: '/NotFound', component: NotFound},
        ],
    },
]

const router = new VueRouter({
    mode: "history",
    routes
});

Vue.config.productionTip = false;

new Vue({
    render: h => h(App),
    router
}).$mount("#app");
