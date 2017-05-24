package com.example.testlibrary.view;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.util.MyDialogUtil;
import com.example.baselibrary.util.MyToastUtil;
import com.example.baselibrary.widget.dialog.BaseCustomDialog;
import com.example.baselibrary.widget.dialog.CustomDialog;
import com.example.testlibrary.R;
import com.example.testlibrary.R2;

import butterknife.OnClick;

/**
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class CustomDialogActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    private CustomDialog radioButtonDialog; // 自定义dialog展示

    private BaseCustomDialog baseCustomDialog;

    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.testlibrary_activity_custom_dialog;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
    }

    @Override
    public void initData(Bundle savedInstanceState) {
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @OnClick({R2.id.dialogType1, R2.id.dialogType2})
    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.dialogType1) {
            // 系统通用的dialog
            if (radioButtonDialog == null) {
                radioButtonDialog = MyDialogUtil.showCustomDialog(mContext, R.style.Dialog,
                        true, "my title", "", "negative", "positive", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                radioButtonDialog.dismiss();
                                if (v.getId() == R.id.positive_btn) {
                                    MyToastUtil.showShortToast("click ok!");
                                }
                            }
                        });
            } else {
                radioButtonDialog.show();
            }
        } else if (i == R.id.dialogType2) {
            // 自定义展示的dialog
            if (baseCustomDialog == null) {
                baseCustomDialog = MyDialogUtil.showCustomDialog(mContext);
            } else {
                baseCustomDialog.show();
            }
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
