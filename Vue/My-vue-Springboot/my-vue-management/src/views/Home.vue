<template>
  <div class="hello">
        <el-container>
          <el-aside style="width: 280px;">
            <router-link to="/">
            <div class="el-aside-div el-icon-platform-eleme"><samp class="el-aside-div-size">Management</samp></div>
            </router-link>
              <comment--aside></comment--aside>
          </el-aside>
          <el-container>
            <el-header>
              <comment-header></comment-header>
            </el-header>
            <el-main>
              <!-- 过渡动画效果 -->
              <transition name="el-zoom-in-center">
                <router-view v-show="show2"></router-view>
              </transition>
            </el-main>
            <el-footer>Footer</el-footer>
          </el-container>
        </el-container>
  </div>
</template>

<script>
    import commentAside from '@/views/AsideLeft';
    import commentHeader from '@/views/HeaderTop/Header';
    export default {
        data() {
            return {
                show2: true,
            }
        },
        methods: {
            handleOpen(key, keyPath) {
                console.log(key, keyPath);
            },
            handleClose(key, keyPath) {
                console.log(key, keyPath);
            }
        },
        components:{
            //用来注册子组件
            'comment-Aside':commentAside,
            'comment-header': commentHeader,
        }
    };
</script>

<style lang="less" scoped>
  @rem:10px;
  .hello{
    width: 100%;
    height: 100%;
    position: absolute;
    top: 0;
    left: 0;
    .el-container{
      height: 100%;
      font-size: 0.4rem;
      //禁止双击文字变蓝
      -webkit-user-select: none;
      -moz-user-select: none;
      -ms-user-select: none;
      user-select: none;
      border: none;
        .el-aside {
        padding-top: 0.7rem;
        overflow-x: hidden;
        background-color: #545c64;
        color: #333;
        line-height: 20rem;
        .el-aside-div{
          position: fixed;
          top: 0;
          z-index: 2;
          padding-left: 0.2rem;
          padding-top: 0.05rem;
          font-size: 0.5rem;
          color: cornsilk;
          .el-aside-div-size{
            font-size: 0.3rem;
            float: right;
            line-height: 0.6rem;
            padding-left: 0.1rem;
            color: #E9EEF3;
          }
        }
      }
      .el-header, .el-footer {
        background-color: #B3C0D1;
        color: #333;
        text-align: center;
        line-height: 0.6rem;
      }
      .el-main {
        background-color: #E9EEF3;
        color: #333;
        text-align: center;
      }
    }
  }
</style>
