package com.example.testmanager.view;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.widget.EmptyLayout;
import com.example.testmanager.R;
import com.example.testmanager.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * activity模板，所有新建的activity都应该复制该文件然后自定义
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class EmptyActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    private EmptyLayout emptyLayout;

    private RecyclerView recyclerView;

    private List<String> list = new ArrayList<>();

    private MyAdapter adapter;

    private SwipeRefreshLayout srl;

    private Handler mHandler = new Handler();

    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.testlibrary_activity_empty;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        emptyLayout = (EmptyLayout) findViewById(R.id.emptyLayout);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        srl = (SwipeRefreshLayout) findViewById(R.id.srl);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter = new MyAdapter(list));
        //绑定
        emptyLayout.bindView(recyclerView);
        emptyLayout.setOnButtonClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //重新加载数据
                loadData();
            }
        });
        srl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                srl.setRefreshing(false);
                loadData();
            }
        });
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        loadData();
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    private void loadData() {
        //模拟加载数据
        emptyLayout.showLoading("正在加载，请稍后");
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //为了防止重复调用
                mHandler.removeCallbacks(this);
                Random r = new Random();
                int res = r.nextInt(10);

                if (res % 2 == 0) {
                    // 失败
                    emptyLayout.showError("加载失败，点击重新加载"); // 显示失败
                } else {
                    // 成功
                    emptyLayout.showSuccess();
                    for (int i = 0; i < 15; i++) {
                        list.add("测试" + i);
                    }
                    adapter.notifyDataSetChanged();
                }
            }
        }, 3000);
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
