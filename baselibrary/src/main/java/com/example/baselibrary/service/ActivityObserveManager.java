package com.example.baselibrary.service;


import com.basemodule.utils.log.MyLogUtil;
import com.example.baselibrary.base.ObserveInerface;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by RJS on 2016/8/21.
 */
public class ActivityObserveManager {

    private final String TAG = "ActivityObserveManager";

    private static HashMap<String, ObserveInerface> observeMap;

    private volatile static ActivityObserveManager _instance;

    private ActivityObserveManager() {
        observeMap = new HashMap<>();
    }

    public synchronized static ActivityObserveManager getInstance() {
        if (_instance == null) {
            _instance = new ActivityObserveManager();
        }
        return _instance;
    }

    public void addObserve(ObserveInerface activity) {
        MyLogUtil.e("============addObserve==============" + activity.getClass().getName());
        observeMap.put(activity.getClass().getName(), activity);
        MyLogUtil.e("============addObserve==============" + observeMap.size());
    }

    public void clearObserve() {
        observeMap.clear();
    }

    public void removeObserve(ObserveInerface activity) {
        MyLogUtil.e("============removeObserve==============" + activity.getClass().getName());
        observeMap.remove(activity.getClass().getName());
    }

    public void notifyRefreshSpecialPages(String[] keys) {
        for (String key : keys) {
            ObserveInerface listener = observeMap.get(key);
            if (listener != null) {
                listener.refreshData();
            }
        }
    }

    public void notifyRefreshSpecialPage(String key) {
        MyLogUtil.e("============" + key + "==============");
        ObserveInerface listener = observeMap.get(key);
        if (listener != null) {
            listener.refreshData();
        }
    }

    public void notifyRefresh() {
        MyLogUtil.e("============notifyRefresh==============");
        for (Map.Entry<String, ObserveInerface> entry : observeMap.entrySet()) {
            entry.getValue().refreshData();
        }
    }
}

