<template>
  <div id="app">
    <img src="./assets/logo.png">
    <router-view/>
    <router-view name="title1"/>
    <router-view name="title2"/>
    <span class="iconfont">&#xe617;</span>
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
