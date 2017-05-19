package com.example.testlibrary.view;

import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.widget.CustomMsgItem;
import com.example.testlibrary.R;

/**
 * activity模板，所有新建的activity都应该复制该文件然后自定义
 * description:
 * Date: 2017/2/13 11:10
 * User: Administrator
 */
public class MsgItemActivity extends BaseActivity {

    //##########################  custom variables start ##########################################

    private CustomMsgItem mimMine;
    private CustomMsgItem mimComment;
    private CustomMsgItem mimGood;
    private CustomMsgItem mimSystem;

    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    @Override
    public int getLayoutId() {
        return R.layout.testlibrary_activity_msg_item;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        mimMine = (CustomMsgItem) findViewById(R.id.mimMine);
        //设置左侧图标
        mimMine.setImageResourceIcon(R.mipmap.setting);
        //设置内容
        mimMine.setTextContent("@我的");
        //隐藏标题，使内容独占一行，并且垂直居中
        mimMine.setVisibleTitle(false);
        //设置未读信息数量
        mimMine.setTextTip("3");
        //设置右侧展开图标提示
        mimMine.setImageResourceExpand(R.mipmap.setting);

        mimComment = (CustomMsgItem) findViewById(R.id.mimComment);
        mimComment.setImageResourceIcon(R.mipmap.setting);
        mimComment.setTextContent("评论");
        mimComment.setVisibleTitle(false);
        //设置右侧提示图标
        mimComment.setImageResourceTip(R.mipmap.setting);
        mimComment.setImageResourceExpand(R.mipmap.setting);

        mimGood = (CustomMsgItem) findViewById(R.id.mimGood);
        mimGood.setImageResourceIcon(R.mipmap.setting);
        mimGood.setTextContent("赞");
        mimGood.setVisibleTitle(false);
        //隐藏右侧提示图标
        mimGood.setVisibleTip(false);
        mimGood.setImageResourceExpand(R.mipmap.setting);

        mimSystem = (CustomMsgItem) findViewById(R.id.mimSystem);
        mimSystem.setImageResourceIcon(R.mipmap.setting);
        //设置标题内容
        mimSystem.setTextTitle("系统消息");
        mimSystem.setTextContent("通知：XXX定于明天凌晨2：00 -- 6:00升级维护，因此给您带来的不便我们深表歉意！");
        mimSystem.setVisibleTip(false);
        mimSystem.setImageResourceExpand(R.mipmap.setting);
    }

    @Override
    public void initData() {
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

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
