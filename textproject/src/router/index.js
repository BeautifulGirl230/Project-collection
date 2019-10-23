import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Test from '@/view/test'
import Title1 from '@/view/title1'
import Title2 from '@/view/title2'
import Goods from '@/view/goods'
import Home from '@/view/Home'
Vue.use(Router)

export default new Router({
  routes: [{
      path:'/',
      name:'/',
      components:{
        default:Goods,
        title1:Title1,
        title2:Title2
      }
    },
    {
      path: '/test',
      name: 'test',
      component: Test,
      children:[
        {
        path: 'title1',
        name: 'title2',
        component: Title1
        },
        {
          path: 'title2',
          name: 'title2',
          component: Title2
        }]
    },
    {
      path: '/test/:testId/name/:testName',
      name: 'HelloWorld',
      component: Test
    },
    {
      path:'/goods',
      name:'goods',
      component:Goods
    },
    {
      path:'/Home',
      name:'Home',
      component:{
        default: Home
      }
    }]
})
