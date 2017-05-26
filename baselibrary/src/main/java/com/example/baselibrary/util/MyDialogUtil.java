package com.example.baselibrary.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.baselibrary.R;
import com.example.baselibrary.widget.dialog.BaseCustomDialog;
import com.example.baselibrary.widget.dialog.CustomDialog;

/**
 * description: 自定义dialog的处理工具类
 * Date: 2017/5/23 15:24
 * User: Administrator
 */
public class MyDialogUtil {

    /**
     * 展示系统统一样式的dialog
     *
     * @param context
     * @param theme
     * @param canceledOnTouchOutside
     * @param title
     * @param msg
     * @param negativeTxt
     * @param positiveTxt
     * @param onClickListener
     * @return
     */
    public static CustomDialog showCustomDialog(Context context, int theme, boolean canceledOnTouchOutside, String title,
                                                String msg, String negativeTxt, String positiveTxt, View.OnClickListener onClickListener) {
        return new CustomDialog(context, theme,
                canceledOnTouchOutside, title, msg, negativeTxt, positiveTxt, onClickListener);
    }

    /**
     * 展示系统统一样式的dialog
     *
     * @param context
     * @param canceledOnTouchOutside
     * @param title
     * @param msg
     * @param negativeTxt
     * @param positiveTxt
     * @param onClickListener
     * @return
     */
    public static CustomDialog showCustomDialog(Context context, boolean canceledOnTouchOutside, String title,
                                                String msg, String negativeTxt, String positiveTxt, View.OnClickListener onClickListener) {
        return new CustomDialog(context, canceledOnTouchOutside, title, msg, negativeTxt, positiveTxt, onClickListener);
    }

    /**
     * 自定义布局，展示高度个性化的dialog
     *
     * @param context
     * @return
     */
    public static BaseCustomDialog showCustomDialog(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.baselib_dialog_custom, null);
        final BaseCustomDialog baseCustomDialog = new BaseCustomDialog(context, R.style.baselib_Dialog, view, true);
        //===
        TextView dialog_title = (TextView) view.findViewById(R.id.dialog_title);
        dialog_title.setText("hello title");
        Button negative_btn = (Button) view.findViewById(R.id.negative_btn);
        negative_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseCustomDialog.dismiss();
            }
        });
        //===
        return baseCustomDialog;
    }

}
