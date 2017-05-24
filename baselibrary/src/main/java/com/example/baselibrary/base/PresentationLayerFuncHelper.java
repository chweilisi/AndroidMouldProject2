package com.example.baselibrary.base;

import android.content.Context;

import com.example.baselibrary.R;
import com.example.baselibrary.widget.dialog.CustomProgressDialog;

/**
 * <页面基础公共功能实现>
 *
 * @author caoyinfei
 * @version [版本号, 2016/6/6]
 * @see [相关类/方法]
 * @since [V1]
 */
public class PresentationLayerFuncHelper implements PresentationLayerFunc {

    private Context context;

    private CustomProgressDialog progressDialog;

    public PresentationLayerFuncHelper(Context context) {
        this.context = context;
    }

    @Override
    public void showProgressDialog() {
        CustomProgressDialog.with(context, R.style.loading_dialog)
                .setOrientation(CustomProgressDialog.VERTICAL)
                .setMessage("")
                .show();
    }

    /**
     * 默认使用VERTICAL
     *
     * @param notice
     */
    @Override
    public void showProgressDialog(String notice) {
        CustomProgressDialog.with(context, R.style.loading_dialog)
                .setOrientation(CustomProgressDialog.VERTICAL)
                .setMessage(notice)
                .show();
    }

    @Override
    public void showCustomProgressDialog(boolean cancelAble, String notice, int orientation, int backgroundColor,
                                         int messageColor) {
        CustomProgressDialog.with(context, R.style.loading_dialog)
                .setOrientation(orientation)
                .setBackgroundColor(backgroundColor)
                .setMessageColor(messageColor)
                .setCanceled(cancelAble)
                .setMessage(notice)
                .show();
    }

    @Override
    public void hideProgressDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
