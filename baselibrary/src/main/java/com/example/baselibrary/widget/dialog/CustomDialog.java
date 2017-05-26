package com.example.baselibrary.widget.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.baselibrary.R;
import com.example.baselibrary.util.NativeUtil;

/**
 * description:
 * Date: 2017/5/23 11:33
 * User: Administrator
 */
public class CustomDialog extends Dialog {

    //##########################  custom variables start ##########################################

    private Context context;

    private View.OnClickListener onClickListener;      //这里定义了一个监听是为了实现内部的监听接口处理，从而实现代码分层管理

    private boolean canceledOnTouchOutside; // 是否允许点击外部是dialog消失

    // 文字展示
    private String title, msg, negativeTxt, positiveTxt;

    //=== 内部控件
    private TextView dialog_title, dialog_msg;

    private Button negative_btn, positive_btn;

    //##########################   custom variables end  ##########################################

    /**
     *
     * @param context
     * @param canceledOnTouchOutside
     * @param title
     * @param msg
     * @param negativeTxt
     * @param positiveTxt
     * @param onClickListener
     */
    public CustomDialog(Context context, boolean canceledOnTouchOutside, String title, String msg,
                        String negativeTxt, String positiveTxt, View.OnClickListener onClickListener) {
        super(context);
        this.context = context;
        this.canceledOnTouchOutside = canceledOnTouchOutside;
        this.title = title;
        this.msg = msg;
        this.negativeTxt = negativeTxt;
        this.positiveTxt = positiveTxt;
        if (onClickListener != null) {
            this.onClickListener = onClickListener;
        }
        init();
    }

    /**
     * @param context
     * @param theme
     * @param canceledOnTouchOutside
     * @param title
     * @param msg
     * @param negativeTxt
     * @param positiveTxt
     * @param onClickListener
     */
    public CustomDialog(Context context, int theme, boolean canceledOnTouchOutside, String title,
                        String msg, String negativeTxt, String positiveTxt, View.OnClickListener onClickListener) {
        super(context, theme);
        this.context = context;
        this.canceledOnTouchOutside = canceledOnTouchOutside;
        this.title = title;
        this.msg = msg;
        this.negativeTxt = negativeTxt;
        this.positiveTxt = positiveTxt;
        if (onClickListener != null) {
            this.onClickListener = onClickListener;
        }
        init();
    }

    /**
     * dialog初始化
     */
    private void init() {
        //以view的方式引入，然后回调activity方法，setContentView，实现自定义布局
        View view = LayoutInflater.from(context).inflate(R.layout.baselib_dialog_custom, null);
        setContentView(view);

        //=== 控件的初始化
        dialog_title = (TextView) view.findViewById(R.id.dialog_title);
        if (NativeUtil.isEmpty(title)) {
            dialog_title.setVisibility(View.GONE);
        } else {
            dialog_title.setVisibility(View.VISIBLE);
            dialog_title.setText(title);
        }

        dialog_msg = (TextView) view.findViewById(R.id.dialog_msg);
        if (NativeUtil.isEmpty(msg)) {
            dialog_msg.setVisibility(View.GONE);
        } else {
            dialog_msg.setVisibility(View.VISIBLE);
            dialog_msg.setText(msg);
        }

        negative_btn = (Button) view.findViewById(R.id.negative_btn);
        if (NativeUtil.isEmpty(negativeTxt)) {
            negative_btn.setVisibility(View.GONE);
        } else {
            negative_btn.setVisibility(View.VISIBLE);
            negative_btn.setText(negativeTxt);
        }
        negative_btn.setOnClickListener(onClickListener);

        positive_btn = (Button) view.findViewById(R.id.positive_btn);
        if (NativeUtil.isEmpty(positiveTxt)) {
            positive_btn.setVisibility(View.GONE);
        } else {
            positive_btn.setVisibility(View.VISIBLE);
            positive_btn.setText(positiveTxt);
        }
        positive_btn.setOnClickListener(onClickListener);

        //=== 设置dialog大小，这里是一个小赠送，模块好的控件大小设置
        Window dialogWindow = getWindow();
        WindowManager manager = ((Activity) context).getWindowManager();
        WindowManager.LayoutParams params = dialogWindow.getAttributes(); // 获取对话框当前的参数值
        dialogWindow.setGravity(Gravity.CENTER);//设置对话框位置
        Display d = manager.getDefaultDisplay(); // 获取屏幕宽、高度
        params.width = (int) (d.getWidth() * 0.8); // 宽度设置为屏幕的0.65，根据实际情况调整
        dialogWindow.setAttributes(params);

        //=== 其他的一些控制展示
        setCanceledOnTouchOutside(canceledOnTouchOutside);
        show();
    }

    //######################      custom metohds start     ########################################

    //######################    custom metohds end   ##############################################
}