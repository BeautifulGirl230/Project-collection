# my-vue-management

> Vue 管理平台

## 安装依赖

``` bash
# 首先安装Elemtent 组件库
npm install element-ui --save
并在index.html引入js与css
<!-- 引入样式 -->
<link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
<!-- 引入组件库 -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
# 安装less-loader less node-less style-loader
npm install less-loader@7.3.1 --save-dev
npm install node-less --save-dev
npm install less --save-dev
npm install style-loader --save-dev
# 安装组件懒加载 Vue Lazy Component
npm install @xunlei/vue-lazy-component
```

### Build Setup

``` bash
# install dependencies
npm install

# serve with hot reload at localhost:8080
npm run dev

# build for production with minification
npm run build

# build for production and view the bundle analyzer report
npm run build --report
```

For a detailed explanation on how things work, check out the [guide](http://vuejs-templates.github.io/webpack/) and [docs for vue-loader](http://vuejs.github.io/vue-loader).
