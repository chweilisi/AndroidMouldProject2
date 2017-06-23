package com.example.baselibrary.baserx;

import android.app.Dialog;
import android.content.Context;

import com.basemodule.base.IBaseApplication;
import com.basemodule.utils.NetWorkUtils;
import com.basemodule.utils.log.MyLogUtil;
import com.example.baselibrary.R;
import com.example.baselibrary.widget.dialog.CustomProgressDialog;

import rx.Subscriber;

/**
 * des:订阅封装
 * Created by xsf
 * on 2016.09.10:16
 */

/********************
 * 使用例子
 ********************/
/*_apiService.login(mobile, verifyCode)
        .//省略
        .subscribe(new RxSubscriber<User user>(mContext,false) {
@Override
public void _onNext(User user) {
        // 处理user
        }

@Override
public void _onError(String msg) {
        ToastUtil.showShort(mActivity, msg);
        });*/
public abstract class RxSubscriber<T> extends Subscriber<T> {

    private static final String TAG = "RxSubscriber";

    private Context mContext;

    private boolean isShowDialog = true;

    private Dialog dialog;

    /**
     * 是否显示浮动dialog
     */
    public void showDialog() {
        this.isShowDialog = true;
    }

    public void hideDialog() {
        this.isShowDialog = true;
    }

    /**
     * @param context
     * @param isShowDialog
     */
    public RxSubscriber(Context context, boolean isShowDialog) {
        this.mContext = context;
        this.isShowDialog = isShowDialog;
    }

    @Override
    public void onCompleted() {
        if (isShowDialog) stopProgressDialog();
        _onAfter();
        _onCompleted();
    }

    @Override
    public void onStart() {
        super.onStart();
        if (isShowDialog) startProgressDialog();
        _onStart();
    }

    /**
     *
     */
    private void startProgressDialog() {
        if (dialog == null) {
            dialog = CustomProgressDialog.with(mContext, R.style.baselib_loading_dialog)
                    .setOrientation(CustomProgressDialog.VERTICAL)
                    .setMessage("");
        }
        if (dialog != null && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /**
     *
     */
    private void stopProgressDialog() {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override
    public void onNext(T t) {
        _onNext(t);
    }

    @Override
    public void onError(Throwable e) {
        _onAfter();

        MyLogUtil.d(TAG, "onError: " + e.getMessage());

        if (isShowDialog)
            stopProgressDialog();
        e.printStackTrace();
        //网络
        if (!NetWorkUtils.isNetConnected(mContext)) {
            _onError(IBaseApplication.getAppInstance().getString(com.basemodule.R.string.basemod_no_net));
        }
        //服务器
        else if (e instanceof ServerException) {
            _onError(e.getMessage());
        }
        //手动抛出
        else if (e instanceof IllegalStateException) {
            _onError(e.getMessage());
        }
//        //其它
//        else {
//            _onError(mContext.getString(R.string.net_error));
//        }
    }

    protected void _onStart() {
    }

    protected abstract void _onNext(T t);

    protected abstract void _onError(String message);

    protected void _onCompleted() {
    }

    protected void _onAfter() {
    }

}
