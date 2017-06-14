package com.example.baselibrary.okgo;

import android.content.Context;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.request.GetRequest;
import com.lzy.okgo.request.PostRequest;

import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * description:
 * Date: 2017/4/7 11:13
 * User: Administrator
 */
public class OkGoRequest {

    /**
     * 普通Post，直接上传Json类型的文本
     * <p>
     * 该方法与postString没有本质区别，只是数据格式是json,一般来说，需要自己创建一个实体bean或者一个map，
     * 把需要的参数设置进去，然后通过三方的Gson或者fastjson转换成json字符串，最后直接使用该方法提交到服务器。
     * 默认会携带以下请求头，请不要手动修改，okgo也不支持自己修改
     * Content-Type: application/json;charset=utf-8
     *
     * @param context
     * @param url
     * @return
     */
    public static PostRequest postJsonRequestDef(Context context, String url, HashMap<String, Object> map) {
        return OkGo.post(url)
                .tag(context)//以对应activity或fragment作为网络请求tag，以便即时取消网络请求
                .upJson(new JSONObject(map));
    }

    // 自定义复杂参数的请求
    public static PostRequest postJsonRequestWithCustomParam(Context context, String url, HashMap<String, Object> map,
                                                             boolean isMultipart) {
        return OkGo.post(url)
                .tag(context)//以对应activity或fragment作为网络请求tag，以便即时取消网络请求
                .isMultipart(isMultipart)         //强制使用 multipart/form-data 表单上传（只是演示，不需要的话不要设置。默认就是false）
                .upJson(new JSONObject(map));
    }

    /**
     * 普通Post，直接上传文本
     *
     * @param context
     * @param url
     * @param upString
     * @return
     */
    public static PostRequest postStringRequestDef(Context context, String url, String upString) {
        return OkGo.post(url)
                .tag(context)//以对应activity或fragment作为网络请求tag，以便即时取消网络请求
                .upString(upString); //上传的文本
    }

    // 自定义复杂参数的请求
    public static PostRequest postStringRequestWithCustomParam(Context context, String url, String upString,
                                                               boolean isMultipart) {
        return OkGo.post(url)
                .tag(context)//以对应activity或fragment作为网络请求tag，以便即时取消网络请求
                .isMultipart(isMultipart)         //强制使用 multipart/form-data 表单上传（只是演示，不需要的话不要设置。默认就是false）
                .upString(upString); //上传的文本
    }

    /**
     * 普通post, 上传字节数据
     *
     * @param context
     * @param url
     * @param bytes
     * @return
     */
    public static PostRequest postByteRequestDef(Context context, String url, byte[] bytes) {
        return OkGo.post(url)
                .tag(context)//以对应activity或fragment作为网络请求tag，以便即时取消网络请求
                .upBytes(bytes); //字节数据
    }

    // 自定义复杂参数的请求
    public static PostRequest postByteRequestWithCustomParam(Context context, String url, byte[] bytes,
                                                             boolean isMultipart) {
        return OkGo.post(url)
                .tag(context)//以对应activity或fragment作为网络请求tag，以便即时取消网络请求
                .isMultipart(isMultipart)         //强制使用 multipart/form-data 表单上传（只是演示，不需要的话不要设置。默认就是false）
                .upBytes(bytes); //字节数据
    }

    /**
     * 文件上传
     *
     * @param context
     * @param url
     * @param files   文件的路径集合
     * @return
     */
    public static PostRequest formUploadRequestDef(Context context, String url, HashMap<String, String> map,
                                                   ArrayList<File> files) {
        return OkGo.post(url)
                .tag(context)//以对应activity或fragment作为网络请求tag，以便即时取消网络请求
                .params(map)
                .addFileParams("file", files);
    }

    // 自定义复杂参数的请求
    public static PostRequest formUploadRequestWithCustomParam(Context context, String url, HashMap<String, String> map,
                                                               ArrayList<File> files, boolean isMultipart) {
        return OkGo.post(url)
                .tag(context)//以对应activity或fragment作为网络请求tag，以便即时取消网络请求
                .params(map)
                .isMultipart(isMultipart)         //强制使用 multipart/form-data 表单上传（只是演示，不需要的话不要设置。默认就是false）
                .addFileParams("file", files);
    }

    /**
     * 文件下载
     *
     * @param context
     * @param url
     * @return
     */
    public static PostRequest postParamRequestDef(Context context, String url, HashMap<String, String> map) {
        return OkGo.post(url)
                .tag(context)//以对应activity或fragment作为网络请求tag，以便即时取消网络请求
                .params(map);
    }

    // 自定义复杂参数的请求
    public static PostRequest postParamRequestWithCustomParam(Context context, String url, HashMap<String, String> map,
                                                              boolean isMultipart) {
        return OkGo.post(url)
                .tag(context)//以对应activity或fragment作为网络请求tag，以便即时取消网络请求
                .isMultipart(isMultipart)         //强制使用 multipart/form-data 表单上传（只是演示，不需要的话不要设置。默认就是false）
                .params(map);
    }

    /**
     * 普通Get请求
     *
     * @param context
     * @param url
     * @param map
     * @return
     */
    public static GetRequest getParamRequestDef(Context context, String url, HashMap<String, String> map) {
        return OkGo.get(url)
                .tag(context)//以对应activity或fragment作为网络请求tag，以便即时取消网络请求
                .params(map);
    }

    // 自定义复杂参数的请求
    public static GetRequest getParamRequestWithCustomParam(Context context, String url, HashMap<String, String> map,
                                                            CacheMode cacheMode, String cacheKey, long cacheTime) {
        return OkGo.get(url)
                .tag(context)//以对应activity或fragment作为网络请求tag，以便即时取消网络请求
                .cacheMode(cacheMode)//
                .cacheKey(cacheKey)   //对于无缓存模式,该参数无效
                .cacheTime(cacheTime)        //对于无缓存模式,该时间无效
                .params(map);
    }

}
