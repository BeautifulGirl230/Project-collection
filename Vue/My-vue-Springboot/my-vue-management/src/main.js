import '../src/util/lessRem'
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUi from 'element-ui'
import Axios from 'axios'


Vue.config.productionTip = false;
Vue.use(ElementUi);
Vue.prototype.$axios = Axios;
Axios.defaults.baseURL = '/api';  // 改成/api才能用proxyTable跨域
global.axios = Axios;  //设置一个全局axios便于调用
Axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded';global.axios = Axios;


/* eslint-disable no-new */
export default new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
