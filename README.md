# AndroidMouldProject 组件化的MVP结构，方便快速开发和多人协作

##### android快速开发模板工程，封装了一些常用的模块，通过引用AndroidBaseModule基础工程的方式来实现持续更新，同时使工程更加简洁，使开发者只需要关心自己的逻辑实现。
##### 一些用到的代码示例放在了 com.brillant.module.mvpmodle.test 目录下面，开发者可以参考示例代码，根据自己的需要实现自己的逻辑。

## Screenshot

##### 项目结构：
![Alt text](https://github.com/yuanzaiyuanfang/AndroidMouldProject/raw/master/images/xiangmujiegou.png)
##### 应用截图：

这里有截图
##### 使用方法：
- demo中有mvp模板，直接复制改个名字就可以用了
- module提供使用参考
- 第三方库的使用详见下方链接

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

            //=== slider(https://github.com/daimajia/AndroidImageSlider)
            "slider"                         : "com.daimajia.slider:library:${sliderVersion}",

            //=== photoview(https://github.com/chrisbanes/PhotoView)
            "photoview"                      : "com.github.chrisbanes.photoview:library:${photoviewVersion}",

            //=== greendao  (https://github.com/greenrobot/greenDAO)
            "greendao"                       : "org.greenrobot:greendao:${greendaoVersion}",

            //=== practicalrecyclerview  (https://github.com/ssseasonnn/PracticalRecyclerView)
            "practicalrecyclerview"          : "zlc.season:practicalrecyclerview:${practicalrecyclerviewVersion}",

            //=== banner  (https://github.com/youth5201314/banner)
            "banner"          : "com.youth.banner:banner:${bannerVersion}"
	
```

Thanks
---


