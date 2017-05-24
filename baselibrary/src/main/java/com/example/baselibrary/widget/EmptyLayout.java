package com.example.baselibrary.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.baselibrary.R;

/**
 * 自定义空白展示页面
 * Created by Administrator on 2016/5/13 0013.
 */
public class EmptyLayout extends FrameLayout {

    //##########################  custom variables start ##########################################

    private Context mContext;

    private View mEmptyView;

    private View mBindView;

    private View mErrorView;

    //=== 错误页面
    private LinearLayout mBtnReset;

    private TextView txt_error;

    //===
    private View mLoadingView;

    private TextView mEmptyText;

    private TextView tvLoadingText;

    //##########################   custom variables end  ##########################################

    //######################      custom metohds start     ########################################

    /**
     *
     * @param context
     */
    public EmptyLayout(Context context) {
        this(context, null);
    }

    /**
     *
     * @param context
     * @param attrs
     */
    public EmptyLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    /**
     *
     * @param context
     * @param attrs
     * @param defStyleAttr
     */
    public EmptyLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;

        LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        //居中
        params.gravity = Gravity.CENTER;

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.EmptyLayout, 0, 0);
        //数据为空时的布局
        int emptyLayout = ta.getResourceId(R.styleable.EmptyLayout_elEmptyLayout, R.layout.layout_empty);
        mEmptyView = View.inflate(context, emptyLayout, null);
        mEmptyText = (TextView) mEmptyView.findViewById(R.id.tvEmptyText);
        addView(mEmptyView, params);

        //加载中的布局
        int loadingLayout = ta.getResourceId(R.styleable.EmptyLayout_elLoadingLayout, R.layout.layout_empty_loading);
        mLoadingView = View.inflate(context, loadingLayout, null);
        tvLoadingText = (TextView) mLoadingView.findViewById(R.id.tvLoadingText);
        addView(mLoadingView, params);

        //错误时的布局
        int errorLayout = ta.getResourceId(R.styleable.EmptyLayout_elErrorLayout, R.layout.layout_empty_error);
        mErrorView = View.inflate(context, errorLayout, null);
        mBtnReset = (LinearLayout) mErrorView.findViewById(R.id.error_layout);
        txt_error = (TextView) mErrorView.findViewById(R.id.txt_error);
        addView(mErrorView, params);

        //全部隐藏
        setGone();
    }

    /**
     *
     * @param resId
     */
    public void setEmptyView(int resId) {
        setEmptyView(View.inflate(mContext, resId, null));
    }

    /**
     *
     * @param v
     */
    public void setEmptyView(View v) {
        if (indexOfChild(mEmptyView) != -1) {
            removeView(mEmptyView);
        }
        mEmptyView = v;
        addView(mEmptyView);
        setGone();
    }

    /**
     *
     * @param view
     */
    public void bindView(View view) {
        mBindView = view;
    }

    /**
     * 展示空白页面，带有文字
     *
     * @param emptyText
     */
    public void showEmpty(String emptyText) {
        if (mBindView != null) mBindView.setVisibility(View.GONE);
        setGone();
        mEmptyView.setVisibility(View.VISIBLE);
        mEmptyText.setText(emptyText);
    }

    /**
     * 展示错误页面
     */
    public void showError() {
        showError(null);
    }

    /**
     * 展示错误页面
     *
     * @param text
     */
    public void showError(String text) {
        if (mBindView != null) mBindView.setVisibility(View.GONE);
        if (!TextUtils.isEmpty(text)) txt_error.setText(text);
        setGone();
        mErrorView.setVisibility(View.VISIBLE);
    }

    /**
     * 展示正在加载页面
     *
     * @param text
     */
    public void showLoading(String text) {
        if (mBindView != null) mBindView.setVisibility(View.GONE);
        if (!TextUtils.isEmpty(text)) tvLoadingText.setText(text);
        setGone();
        mLoadingView.setVisibility(View.VISIBLE);
    }

    /**
     * 展示正在加载页面
     */
    public void showLoading() {
        showLoading(null);
    }

    public void setOnButtonClick(OnClickListener listener) {
        mBtnReset.setOnClickListener(listener);
    }

    /**
     * 全部隐藏
     */
    private void setGone() {
        mEmptyView.setVisibility(View.GONE);
        mErrorView.setVisibility(View.GONE);
        mLoadingView.setVisibility(View.GONE);
    }

    /**
     * 加载成功
     */
    public void showSuccess() {
        if (mBindView != null) mBindView.setVisibility(View.VISIBLE);
        setGone();
    }

    //######################    custom metohds end   ##############################################
}
