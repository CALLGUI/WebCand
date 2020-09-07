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
import ListeFormations from "@/components/ListeFormations";

//imports pages
import Home from "@/pages/Home";
import Informatique from "@/pages/Informatique";
import NotFound from "@/pages/NotFound";


Vue.use(BootstrapVue);
Vue.use(IconsPlugin);
Vue.use(VueRouter);

const routes = [
    {
        path: "/", component: Home,
        children: [
            //INDEX DEFAULT
            {path: "", component: CardComponent},
            //
            {path: "mentionleg", component: MentionLegales},
            {path: "listeformations", component: ListeFormations},
            {path: "Informatique", component: Informatique},
            {path: "*", name: 'NotFound', component: NotFound},
        ],
    },
    //Page erreur 404
    {
        path: "*",
        name: "NotFound",
        component: NotFound,
    }
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
