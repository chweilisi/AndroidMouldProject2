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
 * description:
 * Date: 2017/3/22 16:47
 * User: Administrator
 */
public class UIFactory {

    /**
     * 跳转到引导页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startGuideActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_module_project_scheme) +
                "://" + activity.getString(R.string.baselib_module_project_host) + ":" + activity.getString(R.string.baselib_module_project_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_module_project_scheme) +
                "://" + activity.getString(R.string.baselib_module_project_host) + ":" + activity.getString(R.string.baselib_module_project_port) +
                "/.module.HomeActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    //##########################  测试页面 start #################################################

    /**
     * 进入测试页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startTestActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.TestActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * OKGO网络请求测试页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startOkGoTestActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.OkGoRequestActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 同步请求测试页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startSyncActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.SyncActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 文件上传测试页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startFormUploadActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.FormUploadActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 文件下载测试页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startFileDownloadActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.FileDownloadActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 权限申请页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startRequestPermissionSingleActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.RequestPermissionSingleActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 权限申请页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startRequestPermissionMultipleActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.RequestPermissionMultipleActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 自定义titlebar页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startCusttomTitleBarActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.CusttomTitleBarActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 自定义标签云页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startCusttomTagsLayoutActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.CusttomTagsLayoutActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 自定义星级评分
     *
     * @param activity
     * @param requestCode
     */
    public static void startCusttomRatingStarActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.CusttomRatingStarActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 自定义空白页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startEmptyActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.EmptyActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * dataBinding测试
     *
     * @param activity
     * @param requestCode
     */
    public static void startDataBindingActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.DataBindingActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 自定义dialog的两种实现方式
     *
     * @param activity
     * @param requestCode
     */
    public static void startCustomDialogActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.CustomDialogActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 自定义扩展性强的popupWindow
     *
     * @param activity
     * @param requestCode
     */
    public static void startCustomPopupWindowActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.CustomPopupWindowActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 自定义轮播图banner
     *
     * @param activity
     * @param requestCode
     */
    public static void startCustomBannerActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.CustomBannerActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * logger日志展示
     *
     * @param activity
     * @param requestCode
     */
    public static void startLogDisplayActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.LogDisplayActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 缓存处理
     *
     * @param activity
     * @param requestCode
     */
    public static void startCacheActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.CacheActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * SuperTextView
     *
     * @param activity
     * @param requestCode
     */
    public static void startSuperTextViewActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_test_library_scheme) +
                "://" + activity.getString(R.string.baselib_test_library_host) + ":" + activity.getString(R.string.baselib_test_library_port) +
                "/.view.SuperTextViewActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    //############################  测试页面 end #################################################

    /**
     * 打开升级
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
}
