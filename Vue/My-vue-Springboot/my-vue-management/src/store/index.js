import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    //=>管理公共状态
    token:'',
  },
  mutations: {
    //=>用于同步修改管理状态
  },
  actions: {
    //=>用于异步修改管理状态
  },
  modules: {
  }
})
