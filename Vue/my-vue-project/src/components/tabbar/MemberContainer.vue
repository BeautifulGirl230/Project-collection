<template>
  <div class="demo-type">
    <div class="login-backgorund">
      <el-avatar class="login-title" :size="130" src="https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png"></el-avatar>
    </div>
    <el-form :model="loginForm" status-icon label-width="100px" class="demo-ruleForm">
    <div class="login">
      用户：
      <el-input prop="user" class="login-username" placeholder="请输入内容" v-model="loginForm.username" clearable></el-input><br>
      密码：
      <el-input prop="pwd" class="login-password" placeholder="请输入密码" v-model="loginForm.password" show-password></el-input>
    </div>
    <el-row class="login-button">
      <el-button class="button01" type="primary" @click="login" :disabled="!loginForm.username || !loginForm.password">登录</el-button>
    </el-row>
    </el-form>
  </div>
</template>

<script>
  import { Toast } from 'mint-ui'
  import qs from 'qs'
  import { mapMutations } from "vuex";
    export default {
        data(){
          return{
              loginForm:{
                username:'Snake',
                password:'123456',
              },
              longuser:[],
          }
        },
        created(){
        },
        methods: {
            ...mapMutations(["changeUserInfo"]),
            login() {
                let params = new URLSearchParams();
                params.append('username',this.loginForm.username);
                params.append('password',this.loginForm.password);
                console.log("您输入的:" + params);
                     axios({
                            method: 'post',
                            url: '/api/goods',
                            data: qs.stringify({
                                username:this.loginForm.username,
                                password:this.loginForm.password
                            }),
                            headers: {'Content-Type': 'application/json'},   //请求的header中添加:Content-Type:application/json,这样就可以发送json数据啦
                        }).then((res) => {    //请求成功  res后端返回结果
                            console.log(res);
                            if (res.data.errno.username === this.loginForm.username || res.data.errno.password === this.loginForm.password){
                                this.initUserInfo();
                                    Toast({message: '登录成功', type: 'success', duration: 1500});   // ui弹窗提示
                            } else {
                                console.log(res.data);
                                this.$message.error({message: '您输入的用户名或密码有误', type: 'success', duration: 3000});
                              }
                        }).catch((error) => {    //请求失败  error后端传递结果
                            this.$message.error({message: '请求服务失败', type: 'success', duration: 3000});
                            console.log(error)
                        });

            },
            initUserInfo(){
              axios.get('/api/static/Snake.json').then(res => {
                  if (res.data.status === 0){
                      this.longuser = res.data.loginForm;
                      const userInfo = res.data;   //后端数据的data值
                      localStorage.setItem("userInfo", JSON.stringify(userInfo)); //把输入框里的值存进localStorage中
                      this.$store.commit("changeUserInfo", JSON.stringify(userInfo));  //通过commit调用mutations中的方法  进行传参
                      this.$router.push({name: 'MemberContainer'});  // 跳转到首页
                      console.log(this.longuser);
                  }
              })
            },
        }
    }
</script>

<style lang="scss" scoped>
  //引入 Element.css
  @import url('../../lib/mui/css/Element.css');
</style>
