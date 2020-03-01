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
      component: () => import('@/components/tabbar/HomeContainer'),
      meta:{
        title:'首页',
        type:'token'
      }
    },
    {
      path:'/search',
      name:'SearchContainer',
      component: () => import('@/components/tabbar/SearchContainer'),
      meta:{
        title:'搜索',
        type:'token'
      }
    },
    {
      path:'/shopcar',
      name:'ShopcarContainer',
      component: () => import('@/components/tabbar/ShopcarContainer'),
      meta:{
        title:'购物车页面',
        type:'token'
      }
    },
    {
      path:'/member',
      name:'MemberContainer',
      component: () => import('@/components/tabbar/MemberContainer'),
      meta:{
        title:'我的',
        type:'token'
      }
    },
    //配置登录页面默认路径
    {
      path:'/login',
      name:'login',
      component: () => import('@/components/userlogin/login'),
      meta:{
        login:'登录页面',
        type:''
      }
    },
    //配置服装资讯默认路径
    {
      path:'/home/newslist',
      name:'NewsList',
      component: () => import('@/components/news/NewsList'),
      meta:{
        title:'服装列表页面',
        type:'token'
      }
    },
    {
      path:'/home/newsinfo/:id',
      name:'NewsInfo',
      component: () => import('@/components/news/newsinfo/Newsinfo'),
      meta:{
        title:'服装详情页面',
        type:'token'
      }
    },
    //配置热门服装默认路径
    {
      path:'/picture/picturesharing',
      name:'PictureSharing',
      component: () => import('@/components/PictureSharing/PictureSharing'),
      meta:{
        title:'热门服装页面',
        type:'token'
      }
    },
    //配置购买服装默认路径
    // { path:'/purchase/clothing',component:BuyingClothes },
    {
      path:'/purchase/clothing',
      name:'BuyingClothes',
      component: () => import('@/components/BuyingClothes/BuyingClothes'),
      meta:{
        title:'购买服装页面',
        type:'token'
      }
    },
    {
      path:'/Detalis/ClothingDetails/:id',
      name:'ClothingDetails',
      component: () => import('@/components/BuyingClothes/Details/ClothingDetails'),
      meta:{
        title:'购买服装详情页面',
        type:'token'
      }
    }

  ],
  linkActiveClass:'muiMin-active'  //覆盖默认的路由高亮类，默认的类叫做 router-link-active
});

//把路由对象暴露出去
export default router
