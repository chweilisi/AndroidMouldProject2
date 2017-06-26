package com.example.testmanager.view;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.basemodule.local.cache.XCache;
import com.basemodule.utils.XOutdatedUtils;
import com.example.baselibrary.base.BaseActivity;
import com.example.testmanager.R;
import com.example.testmanager.bean.News;

import java.nio.charset.Charset;

/**
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class CacheActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    private TextView cacheText;
    private ImageView cacheImage;
    private XCache xCache;

    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.testlibrary_activity_cache;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        cacheText = (TextView) findViewById(R.id.cacheText);
        cacheImage = (ImageView) findViewById(R.id.cacheImage);
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        xCache = XCache.get(this);
        xCache.put("string", "缓存普通字符串");
        News news = new News(News.TYPE_SINGLE_PICTURE, "智能手机行业正处于关键转折点，下一战场会在哪里？", "https://pic.36krcnd.com/avatar/201701/17062818/1ucsedy4pdb4aqyu.jpg!heading", "缪定纯•明星公司", "58分钟前");
        xCache.put("news", news);//保存序列化对象
        xCache.put("bitmap", BitmapFactory.decodeResource(getResources(), R.mipmap.testlibrary_uu));
        xCache.put("drawable", XOutdatedUtils.getDrawable(mContext, R.mipmap.testlibrary_uu));
        xCache.put("byte", "缓存byte".getBytes(Charset.defaultCharset()));//字节数组，使用场景很多，这里只做测试
        /**
         * 关于实体类保存，建议用json字符串保存，效果更佳，兼容性更好
         */
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    //######################    custom metohds end   ##############################################

    //######################  override methods start ##############################################

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.button1) {
            cacheText.setText(xCache.getAsString("string"));
        } else if (i == R.id.button2) {
            cacheImage.setImageBitmap(xCache.getAsBitmap("bitmap"));
        } else if (i == R.id.button3) {
            cacheImage.setImageDrawable(xCache.getAsDrawable("drawable"));
        } else if (i == R.id.button4) {
            cacheText.setText(((News) xCache.getAsObject("news")).toString());
        } else if (i == R.id.button5) {
            cacheText.setText(new String(xCache.getAsBinary("byte"), Charset.defaultCharset()));
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
