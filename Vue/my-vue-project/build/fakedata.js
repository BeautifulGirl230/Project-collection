let express = require('express');
let app = express();

// 本地json-server服务器搭建代码
// 引入数据库文件
let appData = require('../static/Snake');
let apiRoutes = express.Router();
// 使用api的方法来创建连接时候的请求
apiRoutes.post('/Snake', function (req, res) {
  res.json({
    errno: 0 ,
    data: appData
  });
});

apiRoutes.post('/Snake2', function (req, res) {
  res.json({
    errno: 0 ,
    data: appData.data.slide,
  });
});


module.exports = apiRoutes;
// 调用api
//app.use('/api', apiRoutes);
//axios.post('/api/test2,{"abc":234}); 这样的形式调用
