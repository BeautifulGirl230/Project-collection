<template>
  <div>
    <!--  顶部Header 区域    -->
    <mt-header fixed title="商品列表">
      <router-link to="/home" slot="left">
        <mt-button icon="back">返回</mt-button>
      </router-link>
    </mt-header>
    <div class="clothes_table">
      <div v-for="item in Clothes">
        <router-link :to="'/Detalis/ClothingDetails/' + item.id">
            <div class="clothes_table_div">
              <img class="clothes_table_img" v-lazy="item.img_url" alt="">
              <div class="clothes_price">
                <samp>{{ item.price }}</samp>
                <img :src="item.label" alt=""><br>
                <div class="clothes_table_title">{{ item.price_item }}</div>
                <a class="title">明天价格75￥</a>
              </div>
            </div>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script>
  import { Toast } from "mint-ui";
    export default {
        data(){
            return{
                id: this.$route.params.id,
                Clothes:[],
            }
        },
        created(){
            this.getClothes();
        },
        methods:{
            getClothes(){
                this.$forceUpdate();
                this.$http.get('/api/static/Snake.json').then(result => {
                    if (result.body.status === 0){
                        this.Clothes = result.body.clothing;
                        console.log(this.Clothes);
                        this.$forceUpdate();
                    }else{
                        Toast('获取服装列表失败。。。')
                    }
                })
            }
        }
    }
</script>

<style lang="scss" scoped>
.clothes_table{
  width: 100%;
  height: 100%;
  background-color: #ffffff;
    .clothes_table_div{
      width: 350px;
      height: 440px;
      margin: 10px auto;
      border-radius: 10px;
      background-color: #f5f5f5;
      .clothes_table_img{
        width: 350px;
        height: 360px;
        overflow: hidden;
        border-radius: 10px 10px 0 0;
      }
      /*  设置图片懒加载样式*/
      img[lazy=error] { }
      img[lazy=loaded] { }
      img[lazy=loading]{
        width: 40px;
        height: 100px;
      }
      .clothes_price{
        width: 100%;
        height: 50px;
        margin: 5px 0 0 8px;
        samp{
          color: red;
          width: 100%;
          font-size: 26px;
          margin-left: 10px;
        }
        img{
          width: 55px;
        }
        .clothes_table_title{
          width: 90%;
          height: 20px;
          color: #b5b5b5;
          font-size: 14px;
          margin: 0 0 0 2px;
          overflow: hidden;
        }
        a{
          color: #cd2626;
          font-size: 14px;
        }
      }
    }
}
</style>
