<template>
  <div class="card shadow-sm">

    <span class="img" :style="{backgroundImage: `url(${item.imgPath})`}"></span>

    <div class="card-body">
      <p class="card-text">{{ item.name }}
      </p>
      <div class="d-flex justify-content-between align-items-center">
        
        <small class="text-body-secondary">
            <!-- <i class="bi bi-heart heart"></i> -->
            <i class="bi bi-balloon-heart heart"></i>
            {{ item.likes }} likes</small>
        <button class="btn btn-success">detail</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
    name : 'Card',

    props: {
        item : Object,
    }    
};
</script>

<style scoped>
.card{
    text-align: center;
}

.img{
 /* display: inline-block;    */
 width: 100%;
 height: 300px;
 background-size: cover;
 background-position: center;
}

.heart{
    color: red;
}
</style>
