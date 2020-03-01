//引入vux库里的 fastclick 来实现移除移动端页面点击延迟    npm install fastclick -S
const FastClick = require('fastclick');
FastClick.attach(document.body);
import Vue from 'vue'   //入口文件
import App from './App'     //导入App根组件
import router from './router'   //1.3 导入自己的 index.js 路由模块
import VueRouter from 'vue-router'    //1.1 导入路由的包
import store from "./store";                //引入状态管理员对象 store2.js 本地储存
import { Search } from 'vant';   //引入搜索
Vue.use(Search);    //注册全局配置 搜索框
import { PullRefresh} from 'vant';   //引入下拉刷新
Vue.use(PullRefresh); //注册全局配置 下拉刷新
import 'intersection-observer';     //组件懒加载  兼容低版本的浏览器
import ElementUI from 'element-ui'    //引入ElementUi   npm i element-ui -S
Vue.use(ElementUI);   //注册全局配置
import 'element-ui/lib/theme-chalk/index.css'   //引入样式
import moment, { min } from 'moment'    //导入格式时间插件    npm install moment --save
Vue.filter('dateFormat',function (dataStr,pattern = "YYYY-MM-DD HH:mm:ss") {    //定义一个时间的全局过滤器
  return  moment(dataStr).format(pattern)
});
//导入Mint-Ui 组件    npm install mint-ui --save
import { Header,Swipe, SwipeItem, Button,Navbar,TabItem,TabContainer, TabContainerItem, } from 'mint-ui';
Vue.component(Header.name, Header);
Vue.component(Swipe.name, Swipe);
Vue.component(SwipeItem.name, SwipeItem);
Vue.component(Button.name, Button);
//引入 库里的导航栏
Vue.component(Navbar.name, Navbar);
Vue.component(TabItem.name, TabItem);
Vue.component(TabContainer.name, TabContainer);
Vue.component(TabContainerItem.name, TabContainerItem);
import 'mint-ui/lib/style.css'    //引入Mint-ui.css样式 否则没有效果
import './lib/mui/css/mui.min.css'  //导入Mui的样式
import './lib/mui/css/icons-extra.css'    //导入 Mui 购物车扩展图标样式
import request from "vue-resource/src/http/request";



import {Lazyload} from 'vant' //引入图片懒加载  通过 npm i vant -S 安装vant
Vue.use(Lazyload,{
  lazyComponent: true,    //组件懒加载 注册时设置`lazyComponent`选项，将需要懒加载的组件放在lazy-component标签中，即可实现组件懒加载。
  preLoad: 1.3, // 提前加载高度（数字 1 表示 1 屏的高度） 默认值:1.3
  error: '../static/img/LazyLoad/BB.gif', // 当加载图片失败的时候
  loading: '../static/img/LazyLoad/AA.gif', // 图片加载状态下显示的图片
  attempt: 1, //  加载错误后最大尝试次数 默认值:3
});

import qs from 'qs'     //npm install qs
import Axios from 'axios'   //引入axios  npm install axios --save
Vue.prototype.$axios = Axios;
// Vue.prototype.HOST = '/api';
Axios.defaults.baseURL = '/api';  // 改成/api才能用proxyTable跨域
global.axios = Axios;  //设置一个全局axios便于调用
Axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded';

import {Toast} from 'mint-ui'
// 全局路由构造函数，判断是否登录和要跳转到页面
router.beforeEach((to, from, next) => {
  if (to.matched.some(res => res.meta.title)) {    // 需要登录
    if(window.localStorage.token){
      next()
    } else {
          next({path: '/login'});
          Toast({ message: '检测到您还未登录,请登录后操作！' + '请您输入账号:Snake,密码:123456', duration: 5500 });
      }
    } else {
      next()
    }
});
// // 添加请求拦截器
Axios.interceptors.request.use(function (config) {
  // 在发送请求之前做些什么
  if(store.state.token){
        config.headers.common['token'] =store.state.token
      }
      return config;
}, function (error) {
  // 对请求错误做些什么
  router.push("/login");
  Toast({ message: '检测到您还未登录,请登录后操作！' + '请输入:账号:Snake,密码:123456', duration: 5500 });
  return Promise.reject(error);
});
// 添加响应拦截器
Axios.interceptors.response.use(function (response) {
  if (!response.data){
    return {
      msg:'数据返回不合理'
    }
  }
  // 对响应数据做点什么
  return response;
}, function (error) {
  // 对响应错误做点什么
   if(error.response){
        switch(error.response.status){
          case 401:
            localStorage.removeItem('token');
            router.replace({
              path: '/home',
              query: {redirect: router.currentRoute.fullPath}//登录成功后跳入浏览的当前页面
            })
          }
        }
  return Promise.reject(error);
});

Vue.config.productionTip = false;


new Vue({
  el: '#app',
  router,     //1.4 挂载路由对象到 VM 实例上
  VueRouter,  //1.2 安装路由
  store,     //挂载 store
  // render: c => c(app),
  components: { App },
  template: '<App/>'
});
