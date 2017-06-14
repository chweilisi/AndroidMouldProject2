package com.example.baselibrary.base;

/**
 * description: eventBus消息传递pojo类
 * Date: 2017/6/14 14:24
 * User: Administrator
 */
public class MessageEvent {

    // 消息传递标示，所有的标示作为常量，统一放在EventBusConstant.java中
    public final String message;

    public String getMessage() {
        return message;
    }

    public MessageEvent(String message) {
        this.message = message;
    }
}
