import Vue from 'vue'
import Router from 'vue-router'
// import HelloWorld from '@/components/HelloWorld'
Vue.use(Router);
let router = new Router({
  mode:'history',
  routes: [
    {
      path: '/',
      redirect:'/home'
    },
    {
      path: '/home',
      name: 'home',
      component: () => import('@/components/Home/index'),
      meta:{
        title: '首页',
        type: '',
      }
    },
    {
      path: '/aside',
      name:'Aside',
      component: () => import("@/components/Home/Aside/AsideLeft"),
      meta:{
        title: '左侧导航栏',
        type: '',
      }
    },
    {
      path: '/asideAssembly',
      name:'AsideAssembly',
      component: () => import("@/components/Home/Aside/AsideAssembly/Query"),
      meta:{
        title: '图书查询',
        type: '',
      }
    },
    {
      path:'/addBooks',
      name:'AddBooks',
      component: () => import('@/components/Home/Aside/AddBooks/AddBooks'),
      meta:{
        title:'添加图书',
        type:'',
      }
    },
    {
      path:'/update',
      name:'BookUpdate',
      component: () => import('@/components/Home/Aside/AsideAssembly/Update/BookUpdate'),
      meta:{
        title:'添加图书',
        type:'',
      }
    }
  ]
});

export default router;

