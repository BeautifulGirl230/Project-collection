<template>
    <swiper :options="swiperOption" ref="mySwiper" @someSwiperEvent="callback">
      <swiper-slide><img src="../assets/img/slider-1.jpg" height="1370" width="2000"/></swiper-slide>
      <swiper-slide><img src="../assets/img/slider-2.jpg" height="1370" width="2000" ></swiper-slide>
      <swiper-slide><img src="../assets/img/slider-3.jpg" height="956" width="1435"/></swiper-slide>
      <swiper-slide><img src="../assets/img/slider-1.jpg" height="1370" width="2000"/></swiper-slide>
      <swiper-slide><img src="../assets/img/slider-2.jpg" height="956" width="1435"/></swiper-slide>
      <swiper-slide><img src="../assets/img/slider-3.jpg" height="956" width="1435"/></swiper-slide>
      <swiper-slide><img src="../assets/img/slider-1.jpg" height="1370" width="2000"/></swiper-slide>

      <div class="swiper-pagination" slot="pagination"></div>
<!--      <div class="swiper-button-prev" slot="button-prev"></div>-->
<!--      <div class="swiper-button-next" slot="button-next"></div>-->
<!--      <div class="swiper-scrollbar" slot="scrollbar"></div>-->
    </swiper>
</template>

<script>
  import "swiper/dist/css/swiper.css";
  import { swiper,swiperSlide } from "vue-awesome-swiper";
    export default {
        name: "carousel",
        data(){
            return{
                swiperOption:{
                    pagination:{
                        el:'.swiper-pagination',
                        dynamicBullets:true
                    },
                    autoplay:{
                        delay:2500,
                        disableOnInteraction:false
                    }
                }
            };
        },
        computed:{
          swiper(){
              return this.$refs.mySwiper.swiper
          }
        },
        mounted() {
            console.log('成功',this.swiper)
            this.swiper.slideTo(3,1000,false)
        }
    }
</script>

<style lang="less" scoped>

</style>
