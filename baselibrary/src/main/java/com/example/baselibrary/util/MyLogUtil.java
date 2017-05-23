package com.example.baselibrary.util;

import com.blankj.utilcode.util.LogUtils;

/**
 * description:
 * Date: 2017/5/23 15:49
 * User: Administrator
 */
public class MyLogUtil {

    private static boolean isShowLog = true;

    /**
     *
     * @param isShowLog
     */
    public static void init(boolean isShowLog) {
        MyLogUtil.isShowLog = isShowLog;
    }

    public static void v(Object contents) {
        if (isShowLog)
            LogUtils.v(contents);
    }

    public static void v(String tag, Object... contents) {
        if (isShowLog)
            LogUtils.v(tag, contents);
    }

    public static void d(Object contents) {
        if (isShowLog)
            LogUtils.d(contents);
    }

    public static void d(String tag, Object... contents) {
        if (isShowLog)
            LogUtils.d(tag, contents);
    }

    public static void i(Object contents) {
        if (isShowLog)
            LogUtils.i(contents);
    }

    public static void i(String tag, Object... contents) {
        if (isShowLog)
            LogUtils.i(tag, contents);
    }

    public static void w(Object contents) {
        if (isShowLog)
            LogUtils.w(contents);
    }

    public static void w(String tag, Object... contents) {
        if (isShowLog)
            LogUtils.w(tag, contents);
    }

    public static void e(Object contents) {
        if (isShowLog)
            LogUtils.e(contents);
    }

    public static void e(String tag, Object... contents) {
        if (isShowLog)
            LogUtils.e(tag, contents);
    }

    public static void a(Object contents) {
        if (isShowLog)
            LogUtils.a(contents);
    }

    public static void a(String tag, Object... contents) {
        if (isShowLog)
            LogUtils.a(tag, contents);
    }
}
