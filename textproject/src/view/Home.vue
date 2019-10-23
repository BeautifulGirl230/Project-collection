<template>
    <div class="home">
      <my-header></my-header>
    </div>
</template>

<script>
import MyHeader from '@/components/myHeader';
    export default {
        name: "Home",
        components:{
          MyHeader
        },
        data(){
            return{
                msg:'hello vue'
            };
        },
        methods:{}
    }
</script>

<style scoped>
</style>
