package com.example.baselibrary.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.basemodule.utils.log.MyLogUtil;

public class NetStateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetInfo = connectManager.getActiveNetworkInfo();
        if (activeNetInfo != null) {
            if (activeNetInfo.getType() == ConnectivityManager.TYPE_WIFI) {
                MyLogUtil.i("wifi网络！");
                ActivityObserveManager.getInstance().notifyRefresh();
            } else if (activeNetInfo.getType() == ConnectivityManager.TYPE_MOBILE) {
                MyLogUtil.i("手机网络！");
                ActivityObserveManager.getInstance().notifyRefresh();
            } else {
                MyLogUtil.i("网络未连接！");
            }
        } else {
            MyLogUtil.i("网络断开！");
        }
    }
}
