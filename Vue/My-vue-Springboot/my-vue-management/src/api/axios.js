import Axios from 'axios';
import Qs from 'qs';
import {Message} from 'element-ui';
import store from '@/store/index'

Axios.defaults.baseURL = 'http://localhost:8181';
Axios.defaults.timeout = 10000;  //设置请求超时时间
Axios.defaults.withCredentials = true;    //设置跨域请求是否允许携带Cookie
// global.axios = Axios;  //设置一个全局axios便于调用
//=>设置POST之下请求主体数据格式处理
Axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded;charset=UTF-8';
// Axios.defaults.transformRequest = data => qs.stringify(data);

//请求拦截器
Axios.interceptors.request.use(config =>{
  const token = store.state.token;
  token && (config.headers.Authorization = tokem);
  console.log('token='+token);
  return config;
},error =>{
  return Promise.error(error);
  console.log('请求错误!!')
})

//响应拦截器
Axios.interceptors.response.use(response =>{
  //=>只拿到响应主体信息   接受服务器返回结果，正常返回结果
  if (response.status && response.status == 200 && response.data.status == 500) {
    Message.error({message: response.data.msg})
    return;
  }
  if (response.data.msg) {
    Message.success({message: response.data.msg})
  }
  return response.data;
},error =>{
  if (error && error.response){
    switch (error.response.status){
      //=> 错误状态码  非正常返回结果
      case 400:
        err.message = '错误请求'
        break;
      case 401:
        err.message = '未授权，请重新登录'
        break;
      case 403:
        err.message = '拒绝访问'
        break;
      case 404:
        router.replace({
          path: '*',
          query:{redirect:router.currentRoute.fullPath}
        })
        err.message = '请求错误,未找到该资源'
        break;
      case 405:
        err.message = '请求方法未允许'
        break;
      case 408:
        err.message = '请求超时'
        break;
      case 500:
        router.replace({
          path: '/errfalse',
          query:{redirect:router.currentRoute.fullPath}
        })
        err.message = '服务器端出错'
        break;
      case 501:
        err.message = '网络未实现'
        break;
      case 502:
        err.message = '网络错误'
        break;
      case 503:
        err.message = '服务不可用'
        break;
      case 504:
        err.message = '网络超时'
        break;
      case 505:
        err.message = 'http版本不支持该请求'
        break;
      default:
        err.message = `连接错误${err.response.status}`
    }
  }else{
    err.message = "连接到服务器失败"
    if (!window.navigator.onLine){
      //=>断网处理   没有拿到任何信息的情况下处理
    }
    return Promise.reject(error);
  }
});

export default Axios;
