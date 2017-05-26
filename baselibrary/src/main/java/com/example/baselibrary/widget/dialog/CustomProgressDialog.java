package com.example.baselibrary.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.support.annotation.ColorInt;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.basemodule.utils.NativeUtil;
import com.basemodule.utils.XOutdatedUtils;
import com.basemodule.widget.XColorDrawable;
import com.example.baselibrary.R;

public class CustomProgressDialog extends Dialog {

    //##########################  custom variables start ##########################################

    private Context context = null;

    //===
    private TextView loadingNotice;

    private ImageView loadingImageView;

    private LinearLayout xframe_loading_view;

    private XColorDrawable drawable;

    //===
    public static final int HORIZONTAL = 0;

    public static final int VERTICAL = 1;

    private static CustomProgressDialog dialog;

    //##########################   custom variables end  ##########################################

    //######################      custom metohds start     ########################################

    /**
     * @param context
     * @return
     */
    public static CustomProgressDialog with(Context context) {
        if (dialog == null) {
            dialog = new CustomProgressDialog(context);
        }
        return dialog;
    }

    /**
     * @param context
     * @param theme
     * @return
     */
    public static CustomProgressDialog with(Context context, int theme) {
        if (dialog == null) {
            dialog = new CustomProgressDialog(context, theme);
        }
        return dialog;
    }

    /**
     * @param context
     */
    public CustomProgressDialog(Context context) {
        super(context);
        this.context = context;
        initView(context);
    }

    /**
     * @param context
     * @param theme
     */
    public CustomProgressDialog(Context context, int theme) {
        super(context, theme);
        this.context = context;
        initView(context);
    }

    /**
     * @param context
     */
    public void initView(Context context) {
        View root = LayoutInflater.from(context).inflate(R.layout.baselib_layout_loading_dialog, null);
        xframe_loading_view = (LinearLayout) root.findViewById(R.id.xframe_loading_view);
        loadingNotice = (TextView) root.findViewById(R.id.loading_notice);
        loadingImageView = (ImageView) root.findViewById(R.id.loadingImageView);

        loadingNotice.setVisibility(View.GONE);
        //===
        drawable = new XColorDrawable();
        setContentView(root);
        getWindow().getAttributes().gravity = Gravity.CENTER;
        setCancelable(true);
        setCanceledOnTouchOutside(false);
        AnimationDrawable animationDrawable = (AnimationDrawable) loadingImageView.getBackground();
        animationDrawable.start();

        loadingNotice.setPadding(0, 15, 0, 0);
        drawable.setColor(Color.WHITE);
        XOutdatedUtils.setBackground(xframe_loading_view, drawable);
    }

    /**
     * @param orientation
     * @return
     */
    public CustomProgressDialog setOrientation(int orientation) {
        xframe_loading_view.setOrientation(orientation);
        if (orientation == HORIZONTAL) {
            loadingNotice.setPadding(15, 0, 0, 0);
        } else {
            loadingNotice.setPadding(0, 15, 0, 0);
        }
        return dialog;
    }

    /**
     * @param color
     * @return
     */
    public CustomProgressDialog setBackgroundColor(@ColorInt int color) {
        drawable.setColor(color);
        XOutdatedUtils.setBackground(xframe_loading_view, drawable);
        return dialog;
    }

    /**
     * @param cancel
     * @return
     */
    public CustomProgressDialog setCanceled(boolean cancel) {
        setCanceledOnTouchOutside(cancel);
        setCancelable(cancel);
        return dialog;
    }

    /**
     * @param message
     * @return
     */
    public CustomProgressDialog setMessage(String message) {
        if (!NativeUtil.isEmpty(message)) {
            loadingNotice.setVisibility(View.VISIBLE);
            loadingNotice.setText(message);
        } else {
            loadingNotice.setVisibility(View.GONE);
        }
        return this;
    }

    /**
     * @param color
     * @return
     */
    public CustomProgressDialog setMessageColor(@ColorInt int color) {
        loadingNotice.setTextColor(color);
        return this;
    }

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @Override
    public void dismiss() {
        super.dismiss();
        if (dialog != null)
            dialog = null;
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
    }

    //######################   override methods end  ##############################################
}
