<template>
  <div class="app-container">
    <!--  顶部Header 区域    -->
    <mt-header class="mint-header" fixed title="鑫华服装平台"></mt-header>
    <!--  中间 路由 router-view 区域  -->
    <transition>
      <router-view class="views"></router-view>
    </transition>

    <!--  底部 Tabbar 区域  -->
    <nav class="mui-bar mui-bar-tab">
      <router-link class="mui-tab-item" to="/home">
        <span class="mui-icon mui-icon-home"></span>
        <span class="mui-tab-label">首页</span>
      </router-link>
      <router-link class="mui-tab-item" to="/search">
        <span class="mui-icon mui-icon-search"></span>
        <span class="mui-tab-label">搜索</span>
      </router-link>
      <router-link class="mui-tab-item" to="/shopcar">
        <span class="mui-icon mui-icon-extra mui-icon-extra-cart">
          <span class="mui-badge">{{getAllCount}}</span>
        </span>
        <span class="mui-tab-label">购物车</span>
      </router-link>
      <router-link class="mui-tab-item" to="/member">
        <span class="mui-icon mui-icon-contact"></span>
        <span class="mui-tab-label">我的</span>
      </router-link>
    </nav>
  </div>
</template>

<script>
    import {mapGetters} from "vuex"
    export default {
        data(){
            return{
            }
        },
        computed:{
            ...mapGetters(["getAllCount"])
        },
    }
</script>

<style>
  .app-container{
    padding-top: 40px;
    padding-bottom: 50px;
    overflow-x: hidden;
    .mint-header{
      background-color: cornsilk;
    }
  }
  //添加页面翻页动画效果
  .v-enter{
    opacity: 0;
    transform: translateX(100%);
  }
  .v-leave-to{
    opacity: 0;
    transform: translate(-100%);
    position: absolute;
  }
  .v-enter-active,
  .v-leave-active{
    transition: all 0.5s ease;
  }
</style>
