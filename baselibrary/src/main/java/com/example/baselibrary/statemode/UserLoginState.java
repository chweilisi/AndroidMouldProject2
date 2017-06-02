package com.example.baselibrary.statemode;

import com.basemodule.utils.log.MyLogUtil;

/**
 * description: 登录状态
 * Date: 2017/6/2 15:11
 * User: Administrator
 */
public class UserLoginState implements UserState {

    @Override
    public void pay() {
        MyLogUtil.d("进行支付");
    }

    @Override
    public void collection() {
        MyLogUtil.d("进行收藏");
    }
}
