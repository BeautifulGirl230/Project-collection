<template>
  <div class="hello">
    <el-container>
      <el-aside style="width: 280px;">
        <comment--aside></comment--aside>
      </el-aside>
      <el-container>
        <el-header>Header</el-header>
        <el-main>
          <transition>
            <router-view></router-view>
          </transition>
        </el-main>
        <el-footer>Footer</el-footer>
      </el-container>
    </el-container>
  </div>
</template>

<script>
  import commentAside from '../src/components/Home/Aside/AsideLeft'
    export default {
        data() {
            return {
            }
        },
        components:{
            //用来注册子组件
            'comment-Aside':commentAside,
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
      }
      .el-aside {
        overflow-x: hidden;

        background-color: #545c64;
        color: #333;
        line-height: 200px;
      }
      .el-header, .el-footer {
        background-color: #B3C0D1;
        color: #333;
        text-align: center;
        line-height: 60px;
      }
      .el-main {
        background-color: #E9EEF3;
        color: #333;
        text-align: center;
        line-height: 160px;
      }
  }
</style>
