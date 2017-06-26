package com.example.testmanager.view;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.util.MyToastUtil;
import com.example.baselibrary.widget.basepopup.BasePopupWindow;
import com.example.baselibrary.widget.custompopup.ScalePopup;
import com.example.baselibrary.widget.custompopup.SlideFromBottomPopup;
import com.example.baselibrary.widget.custompopup.SlideFromTopPopup;
import com.example.testmanager.R;
import com.example.testmanager.R2;

import butterknife.OnClick;

/**
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class CustomPopupWindowActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    private SlideFromTopPopup mSlideFromTopPopup;

    private RelativeLayout titleParent;

    private ImageView arrow;

    private RotateAnimation showArrowAnima;

    private RotateAnimation dismissArrowAnima;

    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.testlibrary_activity_custom_popupwindow;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        buildShowArrowAnima();
        buildDismissArrowAnima();

        titleParent = (RelativeLayout) findViewById(R.id.rl_title);
        mSlideFromTopPopup = new SlideFromTopPopup(this);
        mSlideFromTopPopup.setOnDismissListener(onDismissListener);
        mSlideFromTopPopup.setOnBeforeShowCallback(new BasePopupWindow.OnBeforeShowCallback() {
            @Override
            public boolean onBeforeShow(View popupRootView, View anchorView, boolean hasShowAnima) {
                if (anchorView!=null) {
                    mSlideFromTopPopup.setOffsetY(anchorView.getHeight());
                    return true;
                }
                return false;
            }
        });
        arrow = (ImageView) findViewById(R.id.iv_arrow);
    }

    @Override
    public void initData(Bundle savedInstanceState) {
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    /**
     *
     */
    private void buildShowArrowAnima() {
        if (showArrowAnima != null) return;
        showArrowAnima = new RotateAnimation(0, 180f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        showArrowAnima.setDuration(450);
        showArrowAnima.setInterpolator(new AccelerateDecelerateInterpolator());
        showArrowAnima.setFillAfter(true);
    }

    /**
     *
     */
    private void buildDismissArrowAnima() {
        if (dismissArrowAnima != null) return;
        dismissArrowAnima = new RotateAnimation(180f, 0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        dismissArrowAnima.setDuration(450);
        dismissArrowAnima.setInterpolator(new AccelerateDecelerateInterpolator());
        dismissArrowAnima.setFillAfter(true);
    }

    /**
     *
     */
    private void startShowArrowAnima() {
        if (arrow == null) return;
        arrow.clearAnimation();
        arrow.startAnimation(showArrowAnima);
    }

    /**
     *
     */
    private void startDismissArrowAnima() {
        if (arrow == null) return;
        arrow.clearAnimation();
        arrow.startAnimation(dismissArrowAnima);
    }

    /**
     *
     */
    private BasePopupWindow.OnDismissListener onDismissListener = new BasePopupWindow.OnDismissListener() {

        @Override
        public boolean onBeforeDismiss() {
            startDismissArrowAnima();
            return super.onBeforeDismiss();
        }

        @Override
        public void onDismiss() {
        }
    };

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @OnClick({R2.id.button1, R2.id.button2, R2.id.ll_title})
    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.button1) {
            //
            ScalePopup scalePopup = new ScalePopup(this);
            scalePopup.setOnDismissListener(new BasePopupWindow.OnDismissListener() {
                @Override
                public void onDismiss() {
                    MyToastUtil.showShortToast("dismiss");
                }
            });
            scalePopup.showPopupWindow();
        } else if (i == R.id.button2) {
            //
            new SlideFromBottomPopup(this).showPopupWindow();
        } else if (i == R.id.ll_title) {
            //
            if (!mSlideFromTopPopup.isShowing()) startShowArrowAnima();
            mSlideFromTopPopup.showPopupWindow(titleParent);
        }
    }

    @Override
    public void onBackPressed() {
        backPressConform();
    }

    /**
     * @Description
     * @author BrillantZhao
     * @date 2015-1-16 下午12:56:28
     */
    private void backPressConform() {
        finish();
    }

    //######################   override methods end  ##############################################
}
