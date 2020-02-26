import Vue from 'vue'
import Router from 'vue-router'
Vue.use(Router);
//创建路由对象  使用路由懒加载
let router = new Router({
  routes:[  //配置路由规则
    //设置默认路径
    {
      path:'/',
      redirect: '/home'
    },
    {
      path:'/home',
      name:'HomeContainer',
      component: () => import('@/components/tabbar/HomeContainer')
    },
    {
      path:'/shopcar',
      name:'MemberContainer',
      component: () => import('@/components/tabbar/ShopcarContainer')
    },
    {
      path:'/member',
      name:'ShopcarContainer',
      component: () => import('@/components/tabbar/MemberContainer')
    },
    {
      path:'/search',
      name:'SearchContainer',
      component: () => import('@/components/tabbar/SearchContainer')
    },
    //配置服装资讯默认路径
    {
      path:'/home/newslist',
      name:'NewsList',
      component: () => import('@/components/news/NewsList')
    },
    {
      path:'/home/newsinfo/:id',
      name:'NewsInfo',
      component: () => import('@/components/news/newsinfo/Newsinfo')
    },
    //配置图片分享默认路径
    {
      path:'/',
      redirect:'/picture'
    },
    {
      path:'/picture/picturesharing',
      name:'PictureSharing',
      component: () => import('@/components/PictureSharing/PictureSharing')
    },
    //配置购买服装默认路径
    // { path:'/purchase/clothing',component:BuyingClothes },
    {
      path:'/purchase/clothing',
      name:'BuyingClothes',
      component: () => import('@/components/BuyingClothes/BuyingClothes')
    },
    {
      path:'/Detalis/ClothingDetails/:id',
      name:'ClothingDetails',
      component: () => import('@/components/BuyingClothes/Details/ClothingDetails')
    }

  ],
  linkActiveClass:'muiMin-active'  //覆盖默认的路由高亮类，默认的类叫做 router-link-active
});

//把路由对象暴露出去
export default router
