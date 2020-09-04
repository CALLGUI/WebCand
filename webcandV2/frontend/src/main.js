import Vue from "vue";
import App from "./App.vue";
import VueRouter from "vue-router";
//import VueRouter from "vue-router";

import {BootstrapVue, IconsPlugin} from "bootstrap-vue";

import "bootstrap/dist/css/bootstrap.css";
import "bootstrap-vue/dist/bootstrap-vue.css";
import "./custom.scss";

import HeaderComponent from "@/components/HeaderComponent";
import MentionLegales from "@/components/MentionLegales";
import CardComponent from "@/components/CardComponent";
import FooterComponent from "@/components/FooterComponent";
import Formations from "@/pages/Formations";

Vue.use(BootstrapVue);
Vue.use(IconsPlugin);
Vue.use(VueRouter);

const routes = [
    {path: "/", component: HeaderComponent},
    {path: "/mentionleg", component: MentionLegales},
    {path: "/card", component: CardComponent},
    {path: "/footer", component: FooterComponent},
    {path: "/formations", component: Formations}


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
