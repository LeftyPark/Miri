<template>

  <div class="container">
    <form action="/api/add" method="POST" class="mt-5">
      <input v-model="state.title" name="title" placeholder="title" class="mt-3"/>
      <textarea v-model="state.content" name="content" placeholder="content" class="mt-3"></textarea>
      <br>
      <button @click="submit()" class="btn btn-primary">submit</button>
    </form>
  </div>

</template>

<script>
import axios from 'axios';
import { reactive } from 'vue';
// import router from '../router.js'

export default {
    name: "write",

    setup(){
        const state = reactive({
            title : "",
            content : ""
        });

        const submit = () => {
            // axios.post('/api/add', {
            axios.post('/add', {
                title: state.title,
                content: state.content
            }).then((res) => {
                console.log("successfully!!!!!!!!!!!!", res.data)
                // router.push('/')
            }).catch((err) =>{
                console.log("error!!!!!!!!!!!!!!!11", err)
            })
        }


        axios.get('/api/write').then((res)=>{
            console.log(res)
        })    

        return { state, submit }
    }



};
</script>

<style scoped>
.container{
    width: 400px;
    height: 400px;
    text-align: center;
    margin-top: 20px;
    background-color:cornflowerblue;
}


input{
    width: 100%;
}

textarea{
    width: 100%;
    height: 6.25em;
    border: none;
    resize: none;
}


</style>
