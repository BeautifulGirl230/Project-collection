<template>
  <div>
    <el-menu
      router :default-active="activeIndex2"
      class="el-menu-vertical-demo"
      @open="handleOpen"
      @close="handleClose"
      background-color="#545c64"
      text-color="#fff"
      active-text-color="#ffd04b">
    <!--   一级导航栏   -->
    <el-submenu v-for="(item,index) in $router.options.routes" :key="index" v-if="item.show" :index="String(index)">
      <template slot="title">
        <i :class="item.icon"></i><span>{{ item.name }}</span>
      </template>
      <!--   二级导航栏   -->
      <el-menu-item-group v-for="(item2,index2) in item.children" :key="index2" v-if="item2.show">
        <!--        <router-link :to="item2.path">-->
        <el-menu-item :index="item2.path" :class="$route.path === item2.path?'is-active':''"><i :class="item2.icon"></i>{{ item2.name }}</el-menu-item>
        <!--        </router-link>-->
      </el-menu-item-group>
    </el-submenu>
<!--      <el-menu-item v-for="(item,index) in $router.options.routes" :key="index" v-if="item.show">-->
<!--        <router-link :to="item.path">-->
<!--        <i :class="item.title"></i>-->
<!--        <span slot="title">{{ item.name }}</span>-->
<!--        </router-link>-->
<!--      </el-menu-item>-->
    </el-menu>
  </div>
</template>

<script>
    export default {
        data(){
          return{
              activeIndex2:this.$route.path,
          }
        },
        methods: {
            handleOpen(key, keyPath) {
                console.log(key, keyPath);
            },
            handleClose(key, keyPath) {
                console.log(key, keyPath);
            }
        }
    }
</script>

<style lang="less" scoped>
  @rem: 10rem;
.el-container{
  width: 100%;
  .el-menu{
    width: 100%;
    border: none;
  }
}
</style>
