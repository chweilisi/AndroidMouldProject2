package com.example.baselibrary.statemode;

/**
 * description: 状态行为管理
 * Date: 2017/6/2 15:15
 * User: Administrator
 */
public class LoginContext {

    private UserState userState = new UserLogoutState(); // 默认为未登录状态

    public static final LoginContext getInstance() {
        return singletonHolder.INSTANCE;
    }

    /**
     *
     */
    private static class singletonHolder {
        private static final LoginContext INSTANCE = new LoginContext();
    }

    /**
     * @param userState
     */
    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    /**
     * 示例
     */
    public void pay() {
        userState.pay();
    }

    /**
     * 示例
     */
    public void collection() {
        userState.collection();
    }

    /**
     * 登录
     */
    public void login() {
        setUserState(new UserLoginState());
    }

    /**
     * 登出
     */
    public void logout() {
        setUserState(new UserLogoutState());
    }
}
