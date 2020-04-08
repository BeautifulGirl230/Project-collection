<template>
  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
    <el-form-item label="图书名称" prop="name">
      <el-input v-model="ruleForm.name"></el-input>
    </el-form-item>
    <el-form-item label="作者" prop="author">
      <el-input v-model="ruleForm.author"></el-input>
    </el-form-item>
    <el-form-item label="出版社" prop="publish">
      <el-input v-model="ruleForm.publish"></el-input>
    </el-form-item>
    <el-form-item label="页数" prop="pages">
      <el-input v-model="ruleForm.pages"></el-input>
    </el-form-item>
    <el-form-item label="价格" prop="price">
      <el-input v-model="ruleForm.price"></el-input>
    </el-form-item>
    <el-form-item label="类型" prop="bookcaseid">
      <el-input v-model="ruleForm.bookcaseid"></el-input>
    </el-form-item>
    <el-form-item label="数量" prop="abled">
      <el-input v-model="ruleForm.abled"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="submitForm('ruleForm')">立即创建</el-button>
      <el-button @click="resetForm('ruleForm')">重置</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
    export default {
        data() {
            return {
                ruleForm: {
                    name: '',
                    author: '',
                    publish:'',
                    pages:'',
                    price:'',
                    bookcaseid:'',
                    abled:'',
                },
                rules: {
                    name: [
                        { required: true, message: '图书名称不能为空！', trigger: 'blur' },
                    ],
                    author: [
                        { required: true, message: '作者不能为空！', trigger: 'blur' }
                    ],
                    publish: [
                        { required: true, message: '出版社不能为空！', trigger: 'blur' },
                    ],
                    pages: [
                        { required: true, message: '页数不能为空！', trigger: 'blur' },
                    ],
                    price: [
                        { required: true, message: '价格不能为空！', trigger: 'blur' },
                    ],
                    bookcaseid: [
                        { required: true, message: '类型不能为空！', trigger: 'blur' },
                    ],
                    abled: [
                        { required: true, message: '数量不能为空！', trigger: 'blur' },
                    ],
                }
            };
        },
        methods: {
            submitForm(formName) {
                // axios.personal.addsave(this.ruleForm).then(result => {
                //     console.log(result)
                // })
                const _this = this;
                this.$refs[formName].validate((valid) => {
                    if (valid) {
                        axios.personal.addsave(this.ruleForm).then(res => {
                            if (res === 'success'){
                                console.log(this.ruleForm);
                                _this.$alert( '成功添加《' + this.ruleForm.name + '》', '消息',{
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
            }
        }
    }
</script>

<style lang="less" scoped>
  @rem:10rem;
.el-form{
  width: 5rem;
  margin: 1rem auto;
}
</style>
