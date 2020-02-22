<template>
  <div>
    <mt-header fixed title="服装详情">
      <router-link to="/home/newslist" slot="left">
        <mt-button icon="back">返回</mt-button>
      </router-link>
    </mt-header>
    <div class="newsinfo-container" v-for="item in info" :key="item.id">
<!--    大标题  -->
      <h3 class="title" >{{ item.title }}</h3>
<!--    子标题  -->
      <p class="subtitle">
        <span>发表时间：{{ item.date | dateFormat }}</span>
        <span>点击次数：{{ item.author_name }}次</span>
      </p>
      <hr>
<!--   内容区域   -->
      <div class="content" v-html="item.content"></div>

<!--  评论区域    -->
      <comment-box></comment-box>
    </div>
  </div>
</template>

<script>
import { Toast } from 'mint-ui'
import NewsList from "../NewsList";
// 1.导入评论组件
import comment from "./subcomponents/comment";
    export default {
        data(){
            return{
                //测试是否获取到当前点击的类容ID 并将url地址传递过来，方便以后的调用
                id: this.$route.params.id,
                newsinfo:{ },
                info:{},
            };
        },
        created(){
            this.getNewsInfo();
        },
        methods:{
            getNewsInfo(){  //获取新闻列
                let JSONLIST = '/api/static/Snake.json';
                this.$http.get(JSONLIST).then(result => {
                    if (result.body.status === 0){
                        //如果没有失败，应该把数据保存在data上
                        this.newsinfo = result.body.clothing;
                        // 过滤不等于当前点击的id的数据
                        this.info = this.newsinfo.filter((item) => {
                            return this.id === item.id
                        })
                    }else{
                        Toast('获取服装资讯失败。。。')
                    }
                })
            },
        },
        components:{  // 用来注册子组件的节点
            'comment-box':comment
        }
    }
</script>

<style lang="scss" scoped>
  .newsinfo-container{
    padding: 0 4px;
    .title{
      font-size: 16px;
      text-align: center;
      margin: 15px;
      color: red;
    }
    .subtitle{
      font-size: 14px;
      color: cornflowerblue;
      display: flex;
      justify-content: space-between;
    }
    .content{}
  }

</style>
