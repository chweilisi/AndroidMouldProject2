package com.example.baselibrary.api;

import com.example.baselibrary.R;
import com.example.baselibrary.base.BaseApplication;
import com.example.baselibrary.constant.APPConstant;

import java.util.Vector;

/**
 * Created by conan on 2017/2/18.
 */

public class APIConstant {

    // 测试版本的时候使用：true
    // 正式发布版本的时候需要使用：false
    public static final boolean isDebug = true;

    /**
     * 根据当前的模式获取对应的请求头部
     *
     * @return
     */
    public static Vector getRequestUrlHead() {
        Vector vector = new Vector();
        String appUrlTest = BaseApplication.getInstance().getResources().getString(R.string.APP_URL_ENVIRONMENT);
        // 默认为release环境
        String rootHttp = "https://" + APPConstant.APP_HOST;
        String requestUrlHead = rootHttp + "/";
        String shareSDKHead = "http://newm.xiangfajr.com/";

        if ("SIT".equals(appUrlTest)) {
            // sit
            rootHttp = "http://172.16.88.167";
            requestUrlHead = rootHttp + ":5959/xiangfa/";
            shareSDKHead = "http://172.16.88.167:8444/";
        } else if ("UAT".equals(appUrlTest)) {
            // uat
            rootHttp = "http://172.16.88.168";
            requestUrlHead = rootHttp + ":5959/xiangfa/";
            shareSDKHead = "http://172.16.88.168:8444/";
        }
        vector.add(requestUrlHead);
        vector.add(rootHttp);
        vector.add(shareSDKHead);
        return vector;
    }

    /**
     * json request headers 参数
     */
    public static final String APP_APP_VERSION = "app_version";// 软件版本 软件版本 v1.0_beta 1.0
    public static final String APP_CHANNEL = "channel";// 渠道
    public static final String APP_CLIENT_IP = "client_ip";// 客户端IP
    public static final String APP_HEIGHT = "height";// 手机屏幕的高度
    public static final String APP_IMEI = "imei";// 手机的IMEI
    public static final String APP_MAC_ADDRESS = "macAddress";// 手机的MAC地址
    public static final String APP_NETWORK_TYPE = "network_type";// 网络类型 1:wifi 2:3g 3:gprs 4:其他
    public static final String APP_OS_VERSION = "os_version";// 系统版本	系统版本 4.2.1
    public static final String APP_PHONE_MODEL = "phone_model";// 手机型号 手机型号 MI-ONE C1/HTC T329t
    public static final String APP_PLATFORM = "platform";// 平台类型 平台类型 //IOS,WAP,WEB,AND
    public static final String APP_SERVICE_PROVIDER = "service_provider";// 运营商 运营商1：移动 2：电信3：联通4：其他
    public static final String APP_SESSION_TOKEN = "session_token";// token
    public static final String APP_SIGN = "sign";// 时间戳和 token的MD5加密串
    public static final String APP_TIMESTAMP = "timestamp";// 时间戳
    public static final String APP_WIDTH = "width";// 手机屏幕的宽度
    public static final String APP_DATA = "data";// 数据内容

    //################################### test start ############################################

    // 后台接口
    public static final String QUERYADVERT = "http://172.16.88.46:8080/gps-web" + "/m/v1/user/queryAdvert.json";

    // 获取图片
    public static final String URL_IMAGE = "http://server.jeasonlzy.com/OkHttpUtils/" + "image";

    // 上传文件
    public static final String URL_FORM_UPLOAD = "http://server.jeasonlzy.com/OkHttpUtils/" + "upload";

    // 上传文件
    public static final String URL_DOWNLOAD = "http://server.jeasonlzy.com/OkHttpUtils/" + "download";

    // 同步请求
    public static final String URL_JSONOBJECT = "http://server.jeasonlzy.com/OkHttpUtils/" + "jsonObject";

    //################################### test end ############################################
}
