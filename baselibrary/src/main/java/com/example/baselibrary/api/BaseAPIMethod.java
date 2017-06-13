package com.example.baselibrary.api;


import com.example.baselibrary.baserx.RxSchedulers;

import java.util.HashMap;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by conan on 2017/2/18.
 */

public class BaseAPIMethod {

    //  手写错误抛出
    public static Observable<String> errorObservable(final String errorMsg) {
        return Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                throw new IllegalStateException(errorMsg);
            }
        }).compose(RxSchedulers.<String>io_main());
    }

    /**
     * 添加网络请求基本参数
     *
     * @param params
     * @return
     */
    public static HashMap<String, Object> addBaseParams(HashMap<String, Object> params) {
        params.put(APIConstant.PLATFORMTYPE_PARAM,
                APIConstant.PLATFORMTYPE_ANDROID);
        params.put(APIConstant.APP_CHANNEL_PARAM, null);
        params.put(APIConstant.APP_SIGN__PARAM, null);
        params.put(APIConstant.CLIENT_IP_PARAM, null);
        params.put(APIConstant.IMEI_PARAM, null);
        params.put(APIConstant.MAC_ADDRESS_PARAM, null);
        params.put(APIConstant.TIMESTAMP_PARAM, System.currentTimeMillis());
        return params;
    }

    /**
     * @param params
     * @return
     */
    public static HashMap<String, Object> getPublicParams(HashMap<String, Object> params) {
        //=== 公共部分设置
        HashMap<String, Object> map = addBaseParams(new HashMap<String, Object>());
        map.put(APIConstant.SESSION_TOKEN_PARAM, "token");
        map.put(APIConstant.PARAM, params);
        //===
        return map;
    }

    //#################################################################### 具体页面接口

}
