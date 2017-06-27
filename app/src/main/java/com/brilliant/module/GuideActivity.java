package com.brilliant.module;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.basemodule.local.sharedpref.SharedPrefUtils;
import com.brilliant.AndroidAPP;
import com.brilliant.R;
import com.example.baselibrary.base.BaseFullScreenActivity;
import com.example.baselibrary.constant.APPConstant;
import com.example.baselibrary.constant.UIBaseFactory;

/**
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class GuideActivity extends BaseFullScreenActivity {

    //##########################  custom variables start ##########################################

    private boolean mIsSkip = false;

    private ViewPager viewPager;

    private MyViewPagerAdapter myViewPagerAdapter;

    private LinearLayout dotsLayout;

    private TextView[] dots;

    private int[] layouts;

    private Button btnSkip, btnNext;

    //##########################   custom variables end  ##########################################

    //###################### Override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.activity_guide;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        dotsLayout = (LinearLayout) findViewById(R.id.layoutDots);
        btnNext = (Button) findViewById(R.id.btn_next);
        btnSkip = (Button) findViewById(R.id.btn_skip);

        //添加欢迎页面
        layouts = new int[]{
                R.layout.layout_guide_1,
                R.layout.layout_guide_2,
                R.layout.layout_guide_3
        };
        //添加点
        addBottomDots(0);

        myViewPagerAdapter = new MyViewPagerAdapter();
        viewPager.setAdapter(myViewPagerAdapter);
        viewPager.addOnPageChangeListener(viewPagerPageChangeListener);

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSkip();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = getItem(+1);
                if (current < layouts.length) {
                    viewPager.setCurrentItem(current);
                } else {
                    doSkip();
                }
            }
        });
    }

    //######################  Override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    /**
     * 设置底部的小圆点
     *
     * @param currentPage
     */
    private void addBottomDots(int currentPage) {
        dots = new TextView[layouts.length];

        int[] colorsActive = getResources().getIntArray(R.array.array_dot_active);
        int[] colorsInactive = getResources().getIntArray(R.array.array_dot_inactive);

        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));//圆点
            dots[i].setTextSize(35);
            dots[i].setTextColor(colorsInactive[currentPage]);
            dotsLayout.addView(dots[i]);
        }

        if (dots.length > 0) {
            dots[currentPage].setTextColor(colorsActive[currentPage]);
        }
    }

    /**
     * @param i
     * @return
     */
    private int getItem(int i) {
        return viewPager.getCurrentItem() + i;
    }

    /**
     *
     */
    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override
        public void onPageSelected(int position) {
            addBottomDots(position);
            //改变下一步按钮text  “NEXT”或“GOT IT”
            if (position == layouts.length - 1) {
                btnNext.setText(getString(R.string.start));
                btnSkip.setVisibility(View.GONE);
            } else {
                btnNext.setText(getString(R.string.next));
                btnSkip.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {
        }
    };

    /**
     *
     */
    public class MyViewPagerAdapter extends PagerAdapter {

        private LayoutInflater layoutInflater;

        public MyViewPagerAdapter() {
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View view = layoutInflater.inflate(layouts[position], container, false);
            container.addView(view);
            return view;
        }

        @Override
        public int getCount() {
            return layouts.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = (View) object;
            container.removeView(view);
        }
    }

    /**
     * 跳过
     */
    private void doSkip() {
        if (!mIsSkip) {
            mIsSkip = true;
            //在sp中记录访问过引导页的状态
            SharedPrefUtils.getInstance().setSharedStringData(APPConstant.PREFS_PREVERSION, AndroidAPP.getPackageInfo().versionName);
            UIBaseFactory.startHomeActivity(this, RESULT_OK);
            //===
            finish();
            overridePendingTransition(R.anim.hold, R.anim.zoom_in_exit);
        }
    }

    /**
     * @Description
     * @author BrillantZhao
     * @date 2015-1-16 下午12:56:28
     */
    private void backPressConform() {
        finish();
    }

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @Override
    public void onBackPressed() {
        backPressConform();
    }

    //######################   override methods end  ##############################################
}
