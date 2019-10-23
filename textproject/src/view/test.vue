<template>
    <div class="test">
<!--  动态路由   -->
      this is id : {{ $route.params.testId }}
      <br>
      this is name : {{ $route.params.testName }}
<!--  嵌套路由    -->
      <router-link to="/test/title1">标题1</router-link>
      <router-link to="/test/title2">标题2</router-link>
      <router-view></router-view>

<!--  编程式路由    -->
      <div @click="gotoGoods">跳转到商品详情</div>

<!--  命名式路由    -->
      <router-link v-bind:to="{ name: 'goods' }">用命名路由的方式跳到商品详情页面</router-link>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                msg: 'hello vue'
            }
        },
        methods:{
            gotoGoods(){
                // this.$router.push("/goods")
                this.$router.push({
                    path:'/goods?goodsId=01'
                });
                this.$router.push({
                    panth:'/goods',
                    query:{
                        //后面面对参数不需要0，有0会报错
                        goodsId:1
                    }
                })
            }
        }
    }
</script>

<style scoped>

</style>
