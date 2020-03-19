<template>
    <div class="combooten">
      <el-table
        :data="tableData"
        border
        style="width: 100%">
        <el-table-column
          fixed
          prop="id"
          label="编号"
          width="180"
          height="50px">
        </el-table-column>
        <el-table-column
          prop="name"
          label="图书名"
          width="180"
          height="50px">
        </el-table-column>
        <el-table-column
          prop="author"
          label="作者"
          width="180"
          height="50px">
        </el-table-column>
        <el-table-column
          label="操作"
          width="180"
          height="50px">
          <template slot-scope="scope">
            <el-button @click="edit(scope.row)" type="text" size="small">修改</el-button>
            <el-button @click="deleteBook(scope.row)" type="text" size="small">删除</el-button>
          </template>
        </el-table-column>
      </el-table>

      <el-pagination
        background
        layout="prev, pager, next"
        :page-size="pageSize"
        :total="total"
        @current-change="page">
      </el-pagination>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                pageSize:1,
                total:11,
                tableData: []
            }
        },
        methods:{
            edit(row){
                this.$router.push({
                    path:'/asideAssembly/update',
                    query:{
                        id:row.id   //传递id
                    }
                })
            },
            deleteBook(row){
                this.$confirm( '是否删除：《' + row.name + '》？', '提示',{
                    type:'warning',
                    confirmButtonText:'确认',
                    cancelButtonText:'取消',
                }).then(() =>{
                    axios.delete('http://localhost:8181/book/deleteById/'+ row.id).then(res => {
                            window.location.reload();
                    })
                }).catch(() =>{
                })
            },
            page(currentPage){
                const _this = this;
                axios.get('http://localhost:8181/book/findAll/'+ (currentPage-1) +'/6').then(function(resp){
                    console.log(resp);
                    _this.tableData = resp.data.content;
                    _this.pageSize = resp.data.size;
                    _this.total = resp.data.totalElements;
                })
            }
        },
        components: {
            tableRowClassName({row, rowIndex}) {
                if (rowIndex === 1) {
                    return 'warning-row';
                } else if (rowIndex === 3) {
                    return 'success-row';
                }
                return '';
            }
        },
        //初始化
        created(){
            let _this = this;
            axios.get('http://localhost:8181/book/findAll/0/6').then(function(resp){
                console.log(resp);
                _this.tableData = resp.data.content;
                _this.pageSize = resp.data.size;
                _this.total = resp.data.totalElements;
            })
        },
    }
</script>

<style lang="less" scoped>
  @rem:10rem;
  .combooten{
    width: 100%;
    height: 100%;
    text-align: center;
    .el-table{
      height: 7.4rem;
      text-align: center;
    }
    .el-table .warning-row {
      background: oldlace;
    }
    .el-table .success-row {
      background: #f0f9eb;
    }
  }
</style>
