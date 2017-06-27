package com.example.baselibrary.okgo;


import com.basemodule.utils.log.MyLogUtil;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class HttpDNSInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originRequest = chain.request();
        HttpUrl httpUrl = originRequest.url();

        String url = httpUrl.toString();
        String host = httpUrl.host();

        // 通过HTTPDNS获取IP成功，进行URL替换和HOST头设置
        String newUrl = url;
        try {
            // String ip = IBaseApplication.getHttpdns().getIpByHostAsync(host);
            String ip = null;
            if (ip != null) {
                newUrl = url.replaceFirst(host, ip);
                MyLogUtil.i("Get IP: " + ip + " for host: " + host + " from HTTPDNS successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            newUrl = url;
        }

        Request.Builder builder = originRequest.newBuilder();
        builder.url(newUrl);
        builder.header("Host", host);

        Request newRequest = builder.build();
        MyLogUtil.i("originalUrl:" + url + "\nnewUrl:" + newRequest.url());
        Response newResponse = chain.proceed(newRequest);
        return newResponse;
    }
}