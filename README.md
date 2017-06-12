## AndroidMouldProject2 

android快速开发模板工程，组件化的MVP结构，方便快速开发和多人协作，减少代码耦合，同时方便自定义扩展,封装了一些常用
的模块，通过引用AndroidBaseModule基础工程的方式来实现持续更新，同时通过依赖库的方式，增强个性化定制，使工程更加
简洁，使开发者只需要关心自己的逻辑实现，便于维护。

### 项目结构：
![Alt text](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/screens/app_struct.png)

### 使用方法：
- 复制代码，修改包名，按照自己的需求更改代码逻辑和依赖关系
- 新建activity，fragment,model,view,presenter等，复制粘贴baselibrary->src->main->java->com.example.baselibrary->demo目录下对应的文件模板,
  保证严格按照统一的格式，方便代码阅读和维护
- xxxmanager提供使用参考
- 第三方库的使用详见下方使用到的第三方库链接

### 项目构成：
1. app: 主应用入口，最终完整的app打包运行模块
2. baselibrary: 基础的依赖包，提供基础服务，供各个library和manager调用
3. chartlibrary： 图标库,对应代码示例chartmanager
4. mainlibrary: app的主页面，对应代码示例mainmanager,单独做成一个库方便协作开发和解耦，同时方便快速调试，其他主模块可参考该模块
5. testlibrary： 测试模块，对应代码示例testmanager,是对baselibrary中基础代码的使用方法展示
6. dependencies.gradle: 应用的依赖库集中配置，方便各个library中依赖库的管理
7. gradle.properties: 配置应用的一些参数，方便管理以及jenkins打包
8. 各个library以及manager对应的library:

### 模块介绍：
#### 1. chartlibrary: 图标模块
 基于Android原生Canvas来绘制各种图表,使用简便,定制灵活。
 目前支持<b>(3D/非3D,背向式)柱形图(Bar Chart)、3D/非3D饼图(Pie Chart)、堆积图(Stacked Bar Chart)、面积图(Area Chart)、
 折线图(Line Chart)、曲线图(Spline Chart)、环形图(Dount Chart)、南丁格尔玫瑰图(Rose Chart)、仪表盘(Dial Chart)、刻度盘(Gauge Chart)、雷达图(Radar Chart)、
 圆形图(Circle Chart)、弧线比较图、散点图(Scatter Chart)、气泡图(Bubble Chart)、范围条形图(RangeBar Chart)、玫瑰风向图(Wind Rose)、象限图(Quadrant chart)、漏斗图(Funnel Chart)等图表。<br/>
 &nbsp;&nbsp;&nbsp;&nbsp;其它特性还包括手势缩放、图表滑动、点击交互、多图叠加、图表批注、动画效果、多XY轴显示、轴线任意方位显示、动态图例、图表参考线、柱图刻度对齐风格切换、混合图表及同数据源图表类型切换等。</b><br/> 
 
图表库简要教程
http://blog.csdn.net/xcl168/article/details/42318669 	

部份例图:
 
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/barpiechart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/area_ln_pie_chart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/spinnerBarChart2.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/barchart_m.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/stackedchart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/barchart2.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/dydialchart1.gif)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/dydialchart2.gif)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/dydialchart3.gif)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/dydialchart4.gif)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/bar3dchart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/linechart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/splinechart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/pie3dchart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/radarchart_circle.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/WindRoseChart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/rosechart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/circlechart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/spinnerBarChart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/gaugechart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/piechart2.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/arclinechart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/dountchart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/bubblechart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/scatterchart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/radarchart_a.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/areachart2.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/rangebarchart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/mulaxischart1.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/mulaxischart2.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/mulbarchart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/QuadrantChart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/lines.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/spinnerPieChart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/barchart8.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/barchart9.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/FunnelChart_desc.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/FunnelChart_asc.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/splinechart05.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/splinechart6.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/linechart6.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/barchart6.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/barchartcloud.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/circlechart2.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/roundbarchart.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/roundbarchart2.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/areachart3.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/funnelchart2.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/barchart_hh.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/chartmanager/screens/barchart_hhh.png)

#### 2. baselibrary: 基础依赖库
包含常用的网络请求，升级，下载，图片加载以及压缩处理，服务，工具类，自定义控件等都包含在内，具体的使用方法参考
testlibrary库以及testmanager代码示例

部份例图:

![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/testmanager/screens/barchart_hhh.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/testmanager/screens/barchart_hhh.png)
![](https://github.com/BrillantZhao/AndroidMouldProject2/blob/master/testmanager/screens/barchart_hhh.png)

### 用到的第三方库
```
def supportVersion = "25.3.0"
def butterKnifeVersion = "8.5.1"
def permissionsdispatcherVersion = "2.3.2"
def AndroidBaseModuleVersion = "1.1.2.54"
def AndroidFilePickerVersion = "1.0.5"
def okgoVersion = "2.1.4"
def okrxVersion = "0.1.2"
def okserverVersion = "1.1.3"
def alisdkHotfixVersion = "2.0.6"
def alicloudAndroidHttpdnsVersion = "1.0.10"
def leakcanaryVersion = "1.5"
def rxjavaVersion = "1.1.9"
def rxandroidVersion = "1.2.1"
def rxbindingVersion = "0.4.0"
def rxlifecycleVersion = "1.0"
def rxlifecycleComponentsVersion = "1.0"
def rxpermissionsVersion = "0.9.1@aar"
def daggerVersion = "2.6"
def circleimageviewVersion = "2.1.0"
def greendaoVersion = "3.2.2"
def practicalrecyclerviewVersion = "1.1.5"
def bannerVersion = "1.4.9"
def LubanVersion = "1.0.9"
def SuperTextViewVersion = "1.1.2"

project.ext {
    android = [
            compileSdkVersion: 25,
            buildToolsVersion: "25.0.2",
            applicationId    : "com.brilliant",
            applicationIdSIT : "com.brilliant.sit",
            applicationIdUAT : "com.brilliant.uat",
            minSdkVersion    : 19,
            targetSdkVersion : 25,
    ]

    dependencies = [
            //=== android-support
            "support-v4"                     : "com.android.support:support-v4:${supportVersion}",
            "appcompat-v7"                   : "com.android.support:appcompat-v7:${supportVersion}",
            "design"                         : "com.android.support:design:${supportVersion}",
            "recyclerview-v7"                : "com.android.support:recyclerview-v7:${supportVersion}",
            "cardview-v7"                    : "com.android.support:cardview-v7:${supportVersion}",
            "constraint-layout"              : "com.android.support.constraint:constraint-layout:1.0.0-alpha9",

            //=== test
            "junit"                          : "junit:junit:4.12",

            //=== java8-support
            "stream"                         : "com.annimon:stream:1.0.8",

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
            "banner"                         : "com.youth.banner:banner:${bannerVersion}",

            //=== Luban (https://github.com/Curzibn/Luban) 最接近微信朋友圈的图片压缩算法
            "Luban"                         : "top.zibin:Luban:${LubanVersion}",

            //=== SuperTextView (https://github.com/lygttpod/SuperTextView) 满足日常大部分布局样式
            "SuperTextView"                         : "com.github.lygttpod:SuperTextView:${SuperTextViewVersion}",
    ]
}
```

## Thanks



