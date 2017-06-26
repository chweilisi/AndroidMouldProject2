package com.example.testmanager.view;

import android.os.Bundle;

import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.util.GlideImageLoader;
import com.example.baselibrary.util.MyToastUtil;
import com.example.testmanager.R;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class CustomBannerActivity extends BaseActivity implements OnBannerListener {

    //##########################  custom variables start ##########################################

    private Banner banner;

    private List<?> images = new ArrayList<>();

    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.testlibrary_activity_custom_banner;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        banner = (Banner) findViewById(R.id.banner);
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        String[] urls = getResources().getStringArray(R.array.testlibrary_url);
        List list = Arrays.asList(urls);
        images = new ArrayList(list);

        List<String> titles = new ArrayList<>();
        titles.add("title1");
        titles.add("title2");
        titles.add("title3");

        banner
                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE) //设置banner样式
                .setImageLoader(new GlideImageLoader()) //设置图片加载器
                .setImages(images)//设置图片集合
                .setBannerAnimation(Transformer.DepthPage) //设置banner动画效果
                .setBannerTitles(titles) //设置标题集合（当banner样式有显示title时）
                .isAutoPlay(true) //设置自动轮播，默认为true
                .setDelayTime(1500) //设置轮播时间
                .setIndicatorGravity(BannerConfig.CENTER) //设置指示器位置（当banner模式中有指示器时）
                .setOnBannerListener(this) // 设置点击监听事件
                .start(); //banner设置方法全部调用完毕时最后调用
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @Override
    public void OnBannerClick(int position) {
        MyToastUtil.showShortToast("你点击了：" + position);
    }

    @Override
    public void onStart() {
        super.onStart();
        //开始轮播
        banner.startAutoPlay();
    }

    @Override
    public void onStop() {
        super.onStop();
        //结束轮播
        banner.stopAutoPlay();
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
