<template>
<div>
  <lazy-component>
  <!--  顶部Header 区域    -->
  <mt-header fixed title="服装资讯">
    <router-link to="/home" slot="left">
      <mt-button icon="back">返回</mt-button>
    </router-link>
  </mt-header>
  <ul class="mui-table-view">
    <li class="mui-table-view-cell mui-media" v-for="item in newslist" :key="item.id">
      <router-link :to="'/home/newsinfo/' + item.id">

        <img class="mui-media-object mui-pull-left" v-lazy="item.img_url">

        <div class="mui-media-body">
          <h1>{{ item.title }}</h1>
          <p class='mui-ellipsis'>
            <span>发表时间：{{ item.date | dateFormat('YYYY-MM-DD') }}</span>
            <span>点击：{{ item.author_name }}次</span>
          </p>
        </div>
      </router-link>
    </li>
  </ul>
  </lazy-component>
</div>
</template>

<script>
  import { Toast } from  "mint-ui";
    export default {
        data(){
            return{
                newslist:[],
            }
        },
        created(){
          this.getNewsList();
        },
        methods:{
            getNewsList(){
                //获取服装资讯列表
                this.$http.get('/api/static/Snake.json',
                    {
                        'headers':{
                            'Content-Type':'Access-Control-Allow-Origin:*,Access-Control-Allow-Method:POST,GET,PUT,DELETE,OPTIONS',
                        }
                    }
                ).then(result => {
                    if (result.body.status === 0){
                        //如果没有失败，应该把数据保存在data上
                        this.newslist = result.body.clothing;
                    }else{
                        Toast('获取服装资讯失败。。。')
                    }
                },)
            },
      },
    }
</script>

<style lang="scss" scoped>
  /*  设置图片懒加载样式*/
  img[lazy=error] { }
  img[lazy=loaded] { }
  img[lazy=loading]{
    width: 40px;
    height: 100px;
  }
.mui-table-view{
  width: 100%;
  height: 100%;

  li{
    width: 100%;
    height: 80px;
    img{
      width: 70px;
      height: 60px;
    }
    h1{
      font-size: 14px;
      height: 20px;
    }
    mui-media-body{
      width: 150px;
      float: right;
    }
    .mui-ellipsis{
      font-size: 12px;
      color: #007aff;
      //设置左右对齐
      display: flex;
      justify-content: space-between;
    }
  }
}
</style>
