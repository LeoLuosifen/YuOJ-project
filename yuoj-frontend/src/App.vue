<template>
  <div id="app">
    <BasicLayout />
  </div>
</template>

<style>
#app {
}
</style>
<script setup lang="ts">
import BasicLayout from "@/layouts/BasicLayout.vue";
import { useRouter } from "vue-router";
import { useStore } from "vuex";
import ACCESS_ENUM from "@/access/accessEnum";

const router = useRouter();
const store = useStore();

router.beforeEach((to, from, next) => {
  // 仅管理员可见
  if (to.meta?.access === ACCESS_ENUM.ADMIN) {
    if (store.state.user.loginUser?.userRole !== "admin") {
      next("/noAuth");
      return;
    }
  }
  next();
});
</script>
