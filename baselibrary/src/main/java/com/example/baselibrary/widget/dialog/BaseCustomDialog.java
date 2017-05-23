package com.example.baselibrary.widget.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * description:
 * Date: 2017/5/23 13:46
 * User: Administrator
 */
public class BaseCustomDialog extends Dialog {

    //##########################  custom variables start ##########################################

    private Context context;    //下面三个定义的跟上面讲得就是一样的啦

    protected View view;    //看到这里我们定义的就清楚，我们也是借用view这个父类来引入布局的

    private boolean canceledOnTouchOutside; // 是否允许点击外部是dialog消失

    //##########################   custom variables end  ##########################################

    /**
     *
     * @param context
     * @param view
     * @param canceledOnTouchOutside
     */
    public BaseCustomDialog(Context context, View view, boolean canceledOnTouchOutside) {
        super(context);
        this.context = context;
        this.view = view;
        this.canceledOnTouchOutside = canceledOnTouchOutside;
        init();
    }

    /**
     *
     * @param context
     * @param themeResId
     * @param view
     * @param canceledOnTouchOutside
     */
    public BaseCustomDialog(Context context, int themeResId, View view, boolean canceledOnTouchOutside) {
        super(context, themeResId);
        this.context = context;
        this.view = view;
        this.canceledOnTouchOutside = canceledOnTouchOutside;
        init();
    }

    /**
     *
     */
    protected void init() {
        //=== 以view来引入布局
        setContentView(view);

        //=== 设置dialog大小
        Window dialogWindow = getWindow();
        WindowManager manager = ((Activity) context).getWindowManager();
        WindowManager.LayoutParams params = dialogWindow.getAttributes(); // 获取对话框当前的参数值
        dialogWindow.setGravity(Gravity.CENTER);
        Display d = manager.getDefaultDisplay(); // 获取屏幕宽、高度
        params.width = (int) (d.getWidth() * 0.8); // 宽度设置为屏幕的0.65，根据实际情况调整
        dialogWindow.setAttributes(params);

        //=== 其他的一些控制展示
        setCanceledOnTouchOutside(canceledOnTouchOutside);
        show();
    }
}