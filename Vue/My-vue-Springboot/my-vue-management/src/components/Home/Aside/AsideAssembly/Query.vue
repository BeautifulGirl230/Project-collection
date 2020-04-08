<template>
  <div>
    <div class="combooten">
      <el-row :gutter="21">
        <el-col :span="21" style="width: 100%;height: 700%">
          <el-card shadow="always" style="width: 100%;height: 700px">
          <el-table
        :data="tableData"
        border
        :row-class-name="tableRowClassName"
        style="width: 100%">
        <el-table-column
          fixed
          prop="id"
          label="编号"
          height="50px">
        </el-table-column>
        <el-table-column
          prop="name"
          label="图书名"
          height="50px">
        </el-table-column>
        <el-table-column
          prop="author"
          label="作者"
          height="50px">
        </el-table-column>
        <el-table-column
          prop="publish"
          label="出版社"
          height="50px">
        </el-table-column>
        <el-table-column
          prop="pages"
          label="页数"
          height="50px">
        </el-table-column>
        <el-table-column
          prop="price"
          label="价格"
          height="50px">
        </el-table-column>
        <el-table-column
          prop="bookcaseid"
          label="类型"
          height="50px">
        </el-table-column>
        <el-table-column
          prop="abled"
          label="数量"
          height="50px">
        </el-table-column>
        <el-table-column
          label="操作"
          height="50px">
          <template slot-scope="scope">
            <el-button @click="edit(scope.row)"  size="small">修改</el-button>
            <el-button @click="deleteBook(scope.row)" type="danger" size="small">删除</el-button>
          </template>
        </el-table-column>
      </el-table>
        </el-card>
      </el-col>
    </el-row>
      <el-pagination
        background
        layout="prev, pager, next"
        :page-size="pageSize"
        :total="total"
        @current-change="page">
      </el-pagination>
    </div>
  </div>
</template>

<script>
    export default {
        data() {
            return {
                loading: true,
                pageSize:1,
                total:11,
                tableData: []
            }
        },
        methods:{
            tableRowClassName({row, rowIndex}) {
                if (rowIndex === 1) {
                    return 'warning-row';
                } else if (rowIndex === 3) {
                    return 'success-row';
                }
                return '';
            },
            edit(row){
               this.$router.push({
                    path:'/asideAssembly/update',
                    query:{
                        id:row.id   //传递id
                    }
                });
            },
            deleteBook(row){
                this.$confirm( '是否删除：《' + row.name + '》？', '提示',{
                    type:'warning',
                    confirmButtonText:'确认',
                    cancelButtonText:'取消',
                }).then(() =>{
                    axios.personal.finddelete(row.id).then(res => {
                        window.location.reload();
                    })
                }).catch(() =>{
                })
            },
           async page(currentPage){
                let data = await axios.personal.currentPage(currentPage);
                   console.log(data);
                   this.tableData = data.content;
                   this.pageSize = data.size;
                   this.total = data.totalElements;
                // const _this = this;
                // axios.get('http://localhost:8181/book/findAll/'+ (currentPage-1) +'/6').then(function(resp){
                //     console.log(resp);
                //     _this.tableData = resp.data.content;
                //     _this.pageSize = resp.data.size;
                //     _this.total = resp.data.totalElements;
                // })
            },
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
        async created(){
            let _this = this;
            let data = await axios.personal.findAll(this.findAll);
            if (parseInt(data.code) !== 0 ){
                console.log('>>>>>>>正在加载数据<<<<<<<<<<');
                console.log(data);
                console.log('>>>>>>>加载完成<<<<<<<<<<');
                _this.tableData = data.content;
                _this.pageSize = data.size;
                _this.total = data.totalElements;
            }
            // axios.get('http://localhost:8181/book/findAll/0/6').then(function(resp){
            //     console.log(resp);
            //     _this.tableData = resp.data.content;
            //     _this.pageSize = resp.data.size;
            //     _this.total = resp.data.totalElements;
            // })
        },
    }
</script>

<style lang="less" scoped>
  @rem:10rem;
    .el-pagination{
      position: fixed;
      bottom: 0.7rem;
      height: 0.3rem;
      left: 9.9rem;
      /*border-style: solid;*/
      .el-table-column{
      }
    }
  .el-table .warning-row {
    background: lawngreen;
  }

  .el-table .success-row {
    background: #ebb563;
  }
</style>
