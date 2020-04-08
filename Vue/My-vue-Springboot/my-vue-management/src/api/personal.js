import axios from './axios'
import Qs from 'qs';

export default {
  //=>获取所有数据
  findAll(findAll){
    return axios.get('/book/findAll/0/6',{
      findAll
    })
  },
  //=>分页数据获取
  currentPage(data){
    return axios.get('/book/findAll/' + (data-1) + '/6').then((res) => {
      return Promise.resolve(res);
    }).catch((err) => {
      return Promise.reject(err);
    })
  },
  //=>获取当前ID的数据
  findById(id){
    return axios.get('/book/findById/' + id).then((res) =>  {
        return Promise.resolve(res);
      }).catch((err) => {
        return Promise.reject(err);
    })
  },
  //=>修改接口
  phone(data){
    return axios.put('/book/update/', data).then((res) => {
      return Promise.resolve(res);
    }).catch((err) => {
      return Promise.reject(err)
    })
  },
  //=>添加数据
  addsave(data){
    return axios.post('/book/save',data).then((res) => {
      return Promise.resolve(res);
    }).catch((err) => {
      return Promise.reject(err);
    })
  },
  //=>删除数据
  finddelete(id){
    return axios.delete('/book/deleteById/' + id).then((res) => {
      return Promise.resolve(res);
    }).catch((err) => {
      return Promise.reject(err);
    })
  }
}
