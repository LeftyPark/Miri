<template>
  <div>

    <Header></Header>
    
    <router-view></router-view>
    <!-- <Home></Home> -->
    <Footer></Footer>


  </div>
</template>

<script>
// import Home from "./pages/Home.vue";
import Header from './components/Header.vue'
import Footer from './components/Footer.vue'

export default {
  name: "App",
  components: {
    // Home,
    Header,
    Footer
  },

  setup(){
    // console.log("+++++++++++++")
  }
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  /* text-align: center; */
  color: #2c3e50;
  /* margin-top: 60px; */
}



</style>
