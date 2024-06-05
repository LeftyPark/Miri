import { createWebHistory, createRouter } from "vue-router";
import Home from './pages/Home.vue'
import Login from './pages/Login.vue'
import List from './pages/List.vue'
import Write from './pages/Write.vue'


const routes = [
  {
    path: "/",
    component: Home,
  },
  {
    path: "/login",
    component: Login,
  },
  {
    path: "/list",
    component: List,
  },
  {
    path: "/write",
    component: Write,
  }
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router; 