# AndroidMouldProject 组件化的MVP结构，方便快速开发和多人协作

##### android快速开发模板工程，封装了一些常用的模块，通过引用AndroidBaseModule基础工程的方式来实现持续更新，同时使工程更加简洁，使开发者只需要关心自己的逻辑实现。
##### 一些用到的代码示例放在了 com.brillant.module.mvpmodle.test 目录下面，开发者可以参考示例代码，根据自己的需要实现自己的逻辑。

## Screenshot

##### 项目结构：
![Alt text](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/images/app_struct.png)

##### 使用方法：
- demo中有mvp模板，直接复制改个名字就可以用了
- module提供使用参考
- 第三方库的使用详见下方链接

##### 项目构成：
1. 图标库：chartlibrary,对应代码示例chartmanager
==========
 基于Android原生Canvas来绘制各种图表,使用简便,定制灵活。<br/>
 &nbsp;&nbsp;&nbsp;&nbsp;目前支持<b>(3D/非3D,背向式)柱形图(Bar Chart)、3D/非3D饼图(Pie Chart)、堆积图(Stacked Bar Chart)、面积图(Area Chart)、
 折线图(Line Chart)、曲线图(Spline Chart)、环形图(Dount Chart)、南丁格尔玫瑰图(Rose Chart)、仪表盘(Dial Chart)、刻度盘(Gauge Chart)、雷达图(Radar Chart)、
 圆形图(Circle Chart)、弧线比较图、散点图(Scatter Chart)、气泡图(Bubble Chart)、范围条形图(RangeBar Chart)、玫瑰风向图(Wind Rose)、象限图(Quadrant chart)、漏斗图(Funnel Chart)等图表。<br/>
 &nbsp;&nbsp;&nbsp;&nbsp;其它特性还包括手势缩放、图表滑动、点击交互、多图叠加、图表批注、动画效果、多XY轴显示、轴线任意方位显示、动态图例、图表参考线、柱图刻度对齐风格切换、混合图表及同数据源图表类型切换等。</b><br/> 
 
图表库简要教程
http://blog.csdn.net/xcl168/article/details/42318669 <br/>	
<br/>
 <b>部份例图:</b><br/> 
 
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/barpiechart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/area_ln_pie_chart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/spinnerBarChart2.png)

![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/barchart_m.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/stackedchart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/barchart2.png)

![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/dydialchart1.gif)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/dydialchart2.gif)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/dydialchart3.gif)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/dydialchart4.gif)

![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/bar3dchart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/linechart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/splinechart.png)

![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/pie3dchart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/radarchart_circle.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/WindRoseChart.png)


![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/rosechart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/circlechart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/spinnerBarChart.png)

![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/gaugechart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/piechart2.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/arclinechart.png)


![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/dountchart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/bubblechart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/scatterchart.png)

![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/radarchart_a.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/areachart2.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/rangebarchart.png)

![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/mulaxischart1.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/mulaxischart2.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/mulbarchart.png)

![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/QuadrantChart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/lines.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/spinnerPieChart.png)

![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/barchart8.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/barchart9.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/FunnelChart_desc.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/FunnelChart_asc.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/splinechart05.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/splinechart6.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/linechart6.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/barchart6.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/barchartcloud.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/circlechart2.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/roundbarchart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/roundbarchart2.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/areachart3.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/funnelchart2.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/barchart_hh.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/tree/master/chartmanager/screens/barchart_hhh.png)

## 用到的第三方库

```xml
            //=== butterKnife (https://github.com/JakeWharton/butterknife)
            "butterknife"                    : "com.jakewharton:butterknife:${butterKnifeVersion}",
            "butterknife-compiler"           : "com.jakewharton:butterknife-compiler:${butterKnifeVersion}",

            //=== 6.0动态获取权限框架 PermissionDispatcher(https://github.com/hotchemi/PermissionsDispatcher)
            "permissionsdispatcher"          : "com.github.hotchemi:permissionsdispatcher:${permissionsdispatcherVersion}",
            "permissionsdispatcher-processor": "com.github.hotchemi:permissionsdispatcher-processor:${permissionsdispatcherVersion}",

            //=== AndroidBaseModule(https://github.com/BrillantZhao/AndroidBaseModule)
            "AndroidBaseModule"              : "com.github.BrillantZhao:AndroidBaseModule:${AndroidBaseModuleVersion}",

            //=== AndroidFilePicker(https://github.com/BrillantZhao/AndroidFilePicker)
            "AndroidFilePicker"              : "com.github.BrillantZhao:AndroidFilePicker:${AndroidFilePickerVersion}",

            //=== okhttp-OkGo  (https://github.com/jeasonlzy/okhttp-OkGo)
            //可以单独使用，不需要依赖下方的扩展包
            "okgo"                           : "com.lzy.net:okgo:${okgoVersion}",
            //RxJava扩展支持，根据需要添加
            "okrx"                           : "com.lzy.net:okrx:${okrxVersion}",
            //下载管理和上传管理扩展，根据需要添加
            "okserver"                       : "com.lzy.net:okserver:${okserverVersion}",

            //=== ali hotfix 传递性依赖utdid这个sdk, 所以不需要重复依赖utdid.但是另一方面其它阿里系SDK也可能依赖了utdid这个SDK,
            // 如果编译期间报utdid重复, 所以此时进行如下处理即可, 关闭传递性依赖
            "alisdk-hotfix"                  : "com.taobao.android:alisdk-hotfix:${alisdkHotfixVersion}",

            //=== ali httpdns (https://github.com/aliyun/alicloud-android-demo)
            "alicloud-android-httpdns"       : "com.aliyun.ams:alicloud-android-httpdns:${alicloudAndroidHttpdnsVersion}",

            //=== leakcanary(https://github.com/square/leakcanary)
            "leakcanary-android"             : "com.squareup.leakcanary:leakcanary-android:${leakcanaryVersion}",
            "leakcanary-android-no-op"       : "com.squareup.leakcanary:leakcanary-android-no-op:${leakcanaryVersion}",

            //=== rxjava(https://github.com/ReactiveX/RxJava)
            "rxjava"                         : "io.reactivex:rxjava:${rxjavaVersion}",

            //=== rxandroid(https://github.com/ReactiveX/RxAndroid)
            "rxandroid"                      : "io.reactivex:rxandroid:${rxandroidVersion}",

            //=== rxbinding(https://github.com/JakeWharton/RxBinding)
            "rxbinding"                      : "com.jakewharton.rxbinding:rxbinding:${rxbindingVersion}",

            //=== RxLifecycle(https://github.com/trello/RxLifecycle)
            "rxlifecycle"                    : "com.trello:rxlifecycle:${rxlifecycleVersion}",
            "rxlifecycle-components"         : "com.trello:rxlifecycle-components:${rxlifecycleComponentsVersion}",

            //=== RxPermissions(https://github.com/tbruyelle/RxPermissions)
            "rxpermissions"                  : "com.tbruyelle.rxpermissions:rxpermissions:${rxpermissionsVersion}",

            //=== dagger(https://github.com/google/dagger)
            "dagger"                         : "com.google.dagger:dagger:${daggerVersion}",
            "dagger-compiler"                : "com.google.dagger:dagger-compiler:${daggerVersion}",

            //=== circleimageview(https://github.com/hdodenhof/CircleImageView)
            "circleimageview"                : "de.hdodenhof:circleimageview:${circleimageviewVersion}",

            //=== greendao  (https://github.com/greenrobot/greenDAO)
            "greendao"                       : "org.greenrobot:greendao:${greendaoVersion}",

            //=== practicalrecyclerview  (https://github.com/ssseasonnn/PracticalRecyclerView)
            "practicalrecyclerview"          : "zlc.season:practicalrecyclerview:${practicalrecyclerviewVersion}",

            //=== banner  (https://github.com/youth5201314/banner)
            "banner"                         : "com.youth.banner:banner:${bannerVersion}"
	
```

Thanks
---


