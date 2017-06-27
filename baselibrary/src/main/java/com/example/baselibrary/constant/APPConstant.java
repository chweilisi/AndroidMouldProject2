package com.example.baselibrary.constant;

import java.io.File;

/**
 * description:
 * Date: 2017/4/7 11:00
 * User: Administrator
 */
public class APPConstant {

    //=== okgo参数设置
    public static final String RESP_SUCCESS_CODE = "1"; // 请求成功的返回码

    public static final String RESP_NOT_LOGIN = "-1";  // 用户尚未登录的返回码

    public static final String RESP_LOGIN_OTHER_DEVICE = "-2"; //用户在其他设备登录的返回码

    //=== 域名
    public static final String APP_HOST = "japi.xiangfajr.com";

    //=== ali httpdns Account ID
    public static final String ALI_HTTPDNS_ACCOUND_ID = "";

    //=== sharedPreference 存储 key
    public static final String PREFS_PREVERSION = "PREFS_PREVERSION";  // 版本号信息

    // App根目录
    public static final String APP_PATH_ROOT = APPMethod.getRootPath().getAbsolutePath()
            + File.separator
            + "moduleproject"
            + File.separator;

    // 默认存放图片的路径
    public final static String DEFAULT_SAVE_IMAGE_PATH = APP_PATH_ROOT
            + "osc_img"
            + File.separator;

    // 默认存放安装包下载的路径
    public final static String DEFAULT_SAVE_FILE_PATH = APP_PATH_ROOT
            + "download"
            + File.separator;

    // 生成的app的名称
    public final static String APP_NAME = "moduleproject.apk";

    // 默认存放异常日志文件的路径
    public final static String DEFAULT_CRASH_FILE_PATH = APP_PATH_ROOT
            + "crash"
            + File.separator;

    // 默认存放缓存文件的路径
    public final static String DEFAULT_CACHE_FILE_PATH = APP_PATH_ROOT
            + "cache"
            + File.separator;

}
