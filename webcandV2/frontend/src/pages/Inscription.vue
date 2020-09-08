<template>
<div>
  <InscriptionInfos/>
  <router-view></router-view>
</div>
</template>

<script>
import InscriptionInfos from "@/components/InscriptionInfos";

export default {
name: "Inscription",
  components: {InscriptionInfos}
}
</script>

<style scoped>

</style>