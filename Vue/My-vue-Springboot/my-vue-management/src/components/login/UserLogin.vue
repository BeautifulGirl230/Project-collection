<template>
  <el-form ref="form" :model="form" label-width="80px">
    <el-form-item label="账号：">
      <el-input v-model="form.name"></el-input>
    </el-form-item>
    <el-form-item label="密码：">
        <el-input v-model="form.pwd"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="onSubmit">登录</el-button>
      <el-button>注册</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
    export default {
        data() {
            return {
                form: {
                    name: 'Snake',
                    pwd: '123',
                }
            }
        },
        methods: {
            onSubmit() {
                let _this = this;
                axios({
                    method:'post',
                    url:'http://localhost:8181/api/login',
                    data:_this.form
                }).then(function(resp){
                    this.form = JSON.stringify(resp.data);
                    console.log(resp);
                    this.$router.push('/asideAssembly');
                }).catch(function (resp) {
                    console.log("请求失败"+resp)
                })
            }
        }
    }
</script>

<style scoped>

</style>
