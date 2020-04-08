<template>
  <div>
    <el-row :gutter="13">
      <el-col :span="13">
        <el-card shadow="always">
        <div id="div" :style="{width: '100%', height: '700px'}">
        </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
    export default {
        data(){
            return{
                option:{
                    title: {
                        text: 'ECharts 入门示例'
                    },
                    tooltip: {},
                    legend: {
                        data:['销量']
                    },
                    xAxis: {
                        data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
                    },
                    yAxis: {},
                    series: [{
                        name: '销量',
                        type: 'bar',
                        data: [5, 20, 36, 10, 10, 20]
                    }]
                },
                option2 : {
                    title:{
                      text: '茶饮年总销量：',
                    },
                    legend: {},
                    tooltip: {
                        trigger: 'axis',
                        showContent: false
                    },
                    dataset: {
                        source: [
                            ['商品', '2012', '2013', '2014', '2015', '2016', '2017'],
                            ['抹茶拿铁', 41.1, 30.4, 65.1, 53.3, 83.8, 98.7],
                            ['奶茶', 86.5, 92.1, 85.7, 83.1, 73.4, 55.1],
                            ['奶酪可可', 24.1, 67.2, 79.5, 86.4, 65.2, 82.5],
                            ['核桃布朗尼', 55.2, 67.1, 69.2, 72.4, 53.9, 39.1]
                        ]
                    },
                    xAxis: {type: 'category'},
                    yAxis: {gridIndex: 0},
                    grid: {top: '55%'},
                    series: [
                        {type: 'line', smooth: true, seriesLayoutBy: 'row'},
                        {type: 'line', smooth: true, seriesLayoutBy: 'row'},
                        {type: 'line', smooth: true, seriesLayoutBy: 'row'},
                        {type: 'line', smooth: true, seriesLayoutBy: 'row'},
                        {
                            type: 'pie',
                            id: 'pie',
                            radius: '30%',
                            center: ['50%', '25%'],
                            label: {
                                formatter: '{b}: {@2012} ({d}%)'
                            },
                            encode: {
                                itemName: 'product',
                                value: '2012',
                                tooltip: '2012'
                            }
                        }
                    ]
                }
            }
        },
        mounted(){
          this.StatisticalChart();
        },
        components: {
        },
        methods:{
            StatisticalChart(){
                let dom = document.getElementById('div');
                let myChart = echarts.init(dom);
                myChart.on('updateAxisPointer', function (event) {
                    let xAxisInfo = event.axesInfo[0];
                    if (xAxisInfo) {
                        let dimension = xAxisInfo.value + 1;
                        myChart.setOption({
                            series: {
                                id: 'pie',
                                label: {
                                    formatter: '{b}: {@[' + dimension + ']} ({d}%)'
                                },
                                encode: {
                                    value: dimension,
                                    tooltip: dimension
                                }
                            }
                        });
                    }
                });
                myChart.setOption(this.option2);
            },
        }
    }
</script>

<style lang="less" scoped>

</style>
