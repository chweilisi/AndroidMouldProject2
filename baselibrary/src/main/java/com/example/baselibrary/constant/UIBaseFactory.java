package com.example.baselibrary.constant;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

import com.example.baselibrary.R;

/**
 * description:
 * Date: 2017/3/22 16:47
 * User: Administrator
 */
public class UIBaseFactory {

    /**
     * 进入测试页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startTestActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
                "/.TestActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * OKGO网络请求测试页面
     *
     * @param activity
     * @param requestCode
     */
    public static void startOkGoTestActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
                "/.view.SuperTextViewActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * PowerfulEditText
     *
     * @param activity
     * @param requestCode
     */
    public static void startPowerfulEditTextDemoActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
                "/.view.PowerfulEditTextDemoActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * ExpandableTextView
     *
     * @param activity
     * @param requestCode
     */
    public static void startExpandableTextViewDemoActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
                "/.view.ExpandableTextViewDemoActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * RunningTextView
     *
     * @param activity
     * @param requestCode
     */
    public static void startRunningTextViewDemoActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
                "/.view.RunningTextViewActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * RunningTextView
     *
     * @param activity
     * @param requestCode
     */
    public static void startEllDefaultBottomDemoActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
                "/.view.EllDefaultBottomDemoActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * RunningTextView
     *
     * @param activity
     * @param requestCode
     */
    public static void startEllCustomBottomDemoActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
                "/.view.EllCustomBottomDemoActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * @param activity
     * @param requestCode
     */
    public static void startLcLableViewActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
                "/.view.LcLableViewActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * @param activity
     * @param requestCode
     */
    public static void startStateModeActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
                "/.view.StateModeActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * @param activity
     * @param requestCode
     */
    public static void startViewAsycChangeActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
                "/.view.ViewAsycChangeActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * @param activity
     * @param requestCode
     */
    public static void startCustomButtonActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
                "/.view.CustomButtonActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * @param activity
     * @param requestCode
     */
    public static void startStateModeChangeActivity(Activity activity, int requestCode) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(activity.getString(R.string.baselib_basemanager_scheme) +
                "://" + activity.getString(R.string.baselib_basemanager_host) + ":" + activity.getString(R.string.baselib_basemanager_port) +
                "/.view.StateModeChangeActivity"));
        activity.startActivityForResult(intent, requestCode);
    }

}
