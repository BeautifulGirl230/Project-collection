import Vue from 'vue'
import Router from 'vue-router'
Vue.use(Router);

const router = new Router({
  mode:'history',
  routes: [
    {
      icon: 'el-icon-menu',
      path: '/',
      redirect: '/SystemHomePage',
      name: '首页',
      show:'true',
      component: () => import('@/views/Home'),
      children:[
        {
          icon: 'el-icon-house',
          path:'/SystemHomePage',
          name:'系统首页',
          show:'true',
          component: () => import('@/components/Home/SystemHome/SystemHomePage'),
        },
      ]
    },

    {
      icon: 'el-icon-s-marketing',
      path: '/',
      redirect: '/Homepage',
      name: '数据统计图',
      show: 'true',
      component: () => import('@/views/Home'),
      children: [
        {
          icon: 'el-icon-s-marketing',
          path: '/Charts',
          name: 'schart图表',
          show: 'true',
          component: () => import('@/components/HomePage/BaseCharts'),
        },
        {
          icon: 'el-icon-coffee',
          path: '/Homepage',
          name: '茶饮销量统计图',
          show:'true',
          component: () => import('@/components/HomePage/homepage'),
        },
      ]
    },

    {
      icon: 'el-icon-collection',
      path: '/administration',
      name: '图书管理',
      show:'true',
      component: () => import('@/views/Home'),
      children:[
        {
          icon: 'el-icon-view',
          path: '/asideAssembly',
          name:'图书查询',
          show:'true',
          component: () => import("@/components/Home/Aside/AsideAssembly/Query"),
        },
        {
          icon: 'el-icon-edit-outline',
          path:'/addBooks',
          name:'添加图书',
          show:'true',
          component: () => import('@/components/Home/Aside/AddBooks/AddBooks'),
        },
        {
          id: 2,
          icon: 'el-icon-edit',
          path:'/asideAssembly/update',
          name:'修改数据',
          component: () => import('@/components/Home/Aside/AsideAssembly/Update/BookUpdate'),
        },
        {
          icon: 'el-icon-user',
          path:'/login',
          name:'登录',
          show:'true',
          component: () => import('@/components/login/UserLogin'),
        }
      ]
    },

    {
      icon: 'el-icon-rank',
      path: '/',
      redirect: '/DragList',
      name: '拖拽组件',
      show:'true',
      component: () => import('@/views/Home'),
      children:[
        {
          icon: 'el-icon-s-data',
          path:'/List',
          name:'拖拽列表',
          show:'true',
          component: () => import('@/components/DragList/DragList'),
        },
      ]
    },

    {
      icon: 'el-icon-warning',
      path: '/',
      redirect: '/DragList',
      name: '错误处理',
      show:'true',
      component: () => import('@/views/Home'),
      children:[
        {
          path:'*',
          name:'404',
          show:'true',
          component: () => import('@/components/Error/err404'),
        },
        {
          path:'/errfalse',
          name:'500',
          show:'true',
          component: () => import('@/components/Error/err500'),
        }
      ]
    },

  ]
});

export default router;

