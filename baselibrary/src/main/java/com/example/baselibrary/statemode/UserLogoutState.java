package com.example.baselibrary.statemode;

import com.basemodule.utils.log.MyLogUtil;

/**
 * description: 未登录状态
 * Date: 2017/6/2 15:13
 * User: Administrator
 */
public class UserLogoutState implements UserState {

    @Override
    public void pay() {
        startLoginActivity();
    }

    @Override
    public void collection() {
        startLoginActivity();
    }

    /**
     * 跳转到登录页面
     */
    private void startLoginActivity() {
        MyLogUtil.d("跳转到登录页面");
    }
}
