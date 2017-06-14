package com.example.baselibrary.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.baselibrary.R;

import java.io.File;

/**
 * Description : 图片加载工具类 使用glide框架封装
 */
public class ImageLoaderUtils {

    /**
     * @param context
     * @param imageView
     * @param url
     * @param placeholder
     * @param error       显示图片 默认设置
     */
    public static void display(Context context, ImageView imageView, String url, int placeholder, int error) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        RequestOptions options = new RequestOptions()
                .placeholder(placeholder)
                .error(error);

        Glide.with(context)
                .load(url)
                .apply(options).
                into(imageView);
    }

    /**
     * @param context
     * @param imageView
     * @param url       显示图片 有占位图和错误显示图
     */
    public static void display(Context context, ImageView imageView, String url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        RequestOptions options = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder(R.mipmap.baselib_ic_image_loading)
                .error(R.mipmap.baselib_ic_empty_picture);

        Glide.with(context)
                .load(url)
                .apply(options).
                into(imageView);
    }

    /**
     * @param context
     * @param imageView
     * @param url
     */
    public static void display(Context context, ImageView imageView, File url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        RequestOptions options = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder(R.mipmap.baselib_ic_image_loading)
                .error(R.mipmap.baselib_ic_empty_picture);

        Glide.with(context)
                .load(url)
                .apply(options)
                .into(imageView);
    }

    /**
     * @param context
     * @param imageView
     * @param url       显示缩略小图
     */
    public static void displaySmallPhoto(Context context, ImageView imageView, String url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        RequestOptions options = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder(R.mipmap.baselib_ic_image_loading)
                .error(R.mipmap.baselib_ic_empty_picture);

        Glide.with(context)
                .asBitmap()
                .load(url)
                .apply(options)
                .thumbnail(0.5f)
                .into(imageView);
    }

    /**
     * @param context
     * @param imageView
     * @param url       显示高清大图
     */
    public static void displayBigPhoto(Context context, ImageView imageView, String url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        RequestOptions options = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .format(DecodeFormat.PREFER_ARGB_8888)
                .placeholder(R.mipmap.baselib_ic_image_loading)
                .error(R.mipmap.baselib_ic_empty_picture);

        Glide.with(context)
                .load(url)
                .apply(options)
                .into(imageView);
    }

    /**
     * @param context
     * @param imageView
     * @param url       显示大图 没有占位图
     */
    public static void displayBigPhotoWithoutPlaceHolder(Context context, ImageView imageView, String url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        RequestOptions options = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .format(DecodeFormat.PREFER_ARGB_8888);

        Glide.with(context)
                .asBitmap()
                .load(url)
                .apply(options)
                .into(imageView);
    }

    /**
     * @param context
     * @param imageView
     * @param url
     */
    public static void display(Context context, ImageView imageView, int url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        RequestOptions options = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder(R.mipmap.baselib_ic_image_loading)
                .error(R.mipmap.baselib_ic_empty_picture);

        Glide.with(context)
                .load(url)
                .apply(options)
                .into(imageView);
    }

    /**
     * @param context
     * @param imageView
     * @param url       显示圆图
     */
    public static void displayRound(Context context, ImageView imageView, String url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        RequestOptions options = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .error(R.mipmap.baselib_toux2)
                .transform(new GlideRoundTransformUtil(context))
                .centerCrop();

        Glide.with(context)
                .load(url)
                .apply(options)
                .into(imageView);
    }
}
