//引入vux库里的 fastclick 来实现移除移动端页面点击延迟
const FastClick = require('fastclick');
FastClick.attach(document.body);

//入口文件
import Vue from 'vue'
//导入App根组件
import app from './App'
//声明一个全局
// Vue.prototype.HOST = '/api';
//1.1 导入路由的包
import VueRouter from 'vue-router'
//1.3 导入自己的 index.js 路由模块
import  router from './router/index'
//2.1 导入 vue-resource
import vueResource from 'vue-resource'
//2.2 安装 vue-resource
Vue.use(vueResource);
import axios from 'axios'
axios.defaults.baseURL = '/api';  // 改成/api才能用proxyTable跨域
Vue.prototype.$axios = axios;
//引入状态管理员对象 store2.js 本地储存
import store from "./store";
//引入图片懒加载
//通过 npm i vant -S 安装vant
import {Lazyload} from 'vant'
Vue.use(Lazyload,{
  lazyComponent: true,
  preLoad: 1.3, // 提前加载高度（数字 1 表示 1 屏的高度） 默认值:1.3
  error: '../static/img/LazyLoad/BB.gif', // 当加载图片失败的时候
  loading: '../static/img/LazyLoad/AA.gif', // 图片加载状态下显示的图片
  attempt: 3, //  加载错误后最大尝试次数 默认值:3
});
//引入下拉刷新
import { PullRefresh,Search} from 'vant';
Vue.use(PullRefresh);
//引入搜索
Vue.use(Search);
// import VueLazyload from "vue-lazyload";
// Vue.use(VueLazyload,{
//   preLoad: 1.3, // 提前加载高度（数字 1 表示 1 屏的高度） 默认值:1.3
//   error: '../static/img/LazyLoad/BB.gif', // 当加载图片失败的时候
//   loading: '../static/img/LazyLoad/AA.gif', // 图片加载状态下显示的图片
//   attempt: 3, //  加载错误后最大尝试次数 默认值:3
//       //图片监听过滤
// });
//组件懒加载  兼容低版本的浏览器
import 'intersection-observer';
//导入格式时间插件
import moment, { min } from 'moment'
//定义一个时间的全局过滤器
Vue.filter('dateFormat',function (dataStr,pattern = "YYYY-MM-DD HH:mm:ss") {
  return  moment(dataStr).format(pattern)
});

//导入Mint-Ui 组件
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

//引入Mint-ui.css样式 否则没有效果
import 'mint-ui/lib/style.css'
//导入Mui的样式
import './lib/mui/css/mui.min.css'
//导入 Mui 购物车扩展图标样式
import './lib/mui/css/icons-extra.css'
import request from "vue-resource/src/http/request";

Vue.config.productionTip = false;

/* eslint-disable no-news */
var vm = new Vue({
  el: '#app',
  //图片懒加载
  // Lazyload,
  //1.2 安装路由
  VueRouter,
  //1.4 挂载路由对象到 VM 实例上
  router,
  //挂载 store
  store,
  render: c => c(app),
  components: { app },
  template: '<App/>'
});
// console.log('ok')
