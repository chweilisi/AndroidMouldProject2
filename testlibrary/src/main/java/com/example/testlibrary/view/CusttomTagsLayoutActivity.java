package com.example.testlibrary.view;

import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.widget.CustomTagsLayout;
import com.example.testlibrary.R;
import com.example.testlibrary.R2;

import butterknife.BindView;

/**
 * activity模板，所有新建的activity都应该复制该文件然后自定义
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class CusttomTagsLayoutActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    @BindView(R2.id.tags_layout)
    CustomTagsLayout tags_layout;

    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.testlibrary_activity_custom_tags_layout;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
    }

    @Override
    public void initData() {
        String[] string = {"从我写代码那天起，我就没有打算写代码", "从我写代码那天起", "我就没有打算写代码", "没打算", "写代码"};
        initTagsLayoutView(string,ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    /**
     *
     * @param tags
     * @param width
     * @param height
     */
    private void initTagsLayoutView(String tags[], int width, int height) {
        ViewGroup.MarginLayoutParams lp = new ViewGroup.MarginLayoutParams(width, height);
        for (int i = 0; i < 5; i++) {
            TextView textView = new TextView(this);
            textView.setText(tags[i]);
            textView.setTextColor(Color.WHITE);
            // 设置背景图片
            // textView.setBackgroundResource(R.drawable.round_square_blue);
            // 设置背景颜色
            textView.setBackgroundColor(getResources().getColor(R.color.blue));
            tags_layout.addView(textView, lp);
        }
    }

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

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
