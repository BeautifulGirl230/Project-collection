<template>
  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
    <el-form-item label="图书编号" prop="id">
      <el-input v-model="ruleForm.id" disabled="disabled"></el-input>
    </el-form-item>
    <el-form-item label="图书名称" prop="name">
      <el-input v-model="ruleForm.name"></el-input>
    </el-form-item>
    <el-form-item label="作者" prop="author">
      <el-input v-model="ruleForm.author"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="submitForm('ruleForm')">修改</el-button>
      <el-button @click="resetForm('ruleForm')">重置</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
    export default {
        data() {
            return {
                id: this.$route.query.id,
                ruleForm: {
                    id: this.id,
                    name: '123',
                    author: '123',
                },
                rules: {
                    name: [
                        { required: true, message: '图书名称不能为空！', trigger: 'blur' },
                    ],
                    author: [
                        { required: true, message: '作者不能为空！', trigger: 'blur' }
                    ],
                }
            };
        },
        created() {
            const _this = this;
            axios.get('http://localhost:8181/book/findById/'+this.id).then(function(resp){
                _this.ruleForm = resp.data
            })
        },
        methods: {
            submitForm(formName) {
                const _this = this;
                this.$refs[formName].validate((valid) => {
                    if (valid) {
                        axios.put('http://localhost:8181/book/update/',this.ruleForm).then(res => {
                            if (res.data === 'success'){
                                console.log(this.ruleForm);
                                _this.$alert( '修改成功：《' + this.ruleForm.name + '》', '消息',{
                                    confirmButtonText:'确认',
                                    callback: action => {
                                        // this.$message({
                                        //     type:'info',
                                        //     message: '添加成功！'
                                        // });
                                        this.$router.push('/asideAssembly');
                                    }
                                });
                            }
                        })
                    } else {
                        console.log('error submit!!');
                        return false;
                    }
                });
            },
            resetForm(formName) {
                this.$refs[formName].resetFields();
            },
        },
    }
</script>

<style lang="less" scoped>
  @rem:10rem;
  .el-form{
    width: 5rem;
    margin: 2rem auto;
  }
</style>
