package com.example.baselibrary.constant;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;

import com.example.baselibrary.R;
import com.example.baselibrary.service.DownloadService;
import com.example.baselibrary.service.ICallbackResult;

/**
 * description: app 主工程汇总页面跳转
 * Date: 2017/6/27 13:34
 * User: Administrator
 */
public class UIAppFactory {

    /**
     * 启动升级服务，进行升级包的下载和安装
     *
     * @param context
     * @param downurl
     * @param tilte
     */
    public static void openDownLoadService(Context context, String downurl, String tilte) {
        final ICallbackResult callback = new ICallbackResult() {
            @Override
            public void OnBackResult(Object s) {
            }
        };

        ServiceConnection conn = new ServiceConnection() {
            @Override
            public void onServiceDisconnected(ComponentName name) {
            }

            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                DownloadService.DownloadBinder binder = (DownloadService.DownloadBinder) service;
                binder.addCallback(callback);
                binder.start();
            }
        };
        Intent intent = new Intent(context, DownloadService.class);
        intent.putExtra(DownloadService.BUNDLE_KEY_DOWNLOAD_URL, downurl);
        intent.putExtra(DownloadService.BUNDLE_KEY_TITLE, tilte);
        context.startService(intent);
        context.bindService(intent, conn, Context.BIND_AUTO_CREATE);
    }

    /**
     * 跳转到引导页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startGuideActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_app_scheme) +
                "://" + activity.getString(R.string.baselib_app_host) + ":" + activity.getString(R.string.baselib_app_port) +
                "/.module.GuideActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * home页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startHomeActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_app_scheme) +
                "://" + activity.getString(R.string.baselib_app_host) + ":" + activity.getString(R.string.baselib_app_port) +
                "/.module.HomeActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

}
