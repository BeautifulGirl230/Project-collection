import '../src/util/lessRem'

import Vue from 'vue'

import App from './App'

import router from './router'

import ElementUi from 'element-ui'

// 默认主题
import 'element-ui/lib/theme-chalk/index.css';

// import './assets/css/theme-green/index.css'; // 浅绿色主题

import './assets/css/icon.css';

import store from './store/index'

import api from './api/index'

import Echarts from 'echarts'   //=> 引入echarts数据图



Vue.config.productionTip = false;

Vue.use(Echarts);

// Vue.prototype.echarts = Echarts;

global.echarts = Echarts;

Vue.use(ElementUi);

// Vue.prototype.api = api;

global.axios = api;  //设置一个全局axios便于调用


/* eslint-disable no-new */
export default new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
})
