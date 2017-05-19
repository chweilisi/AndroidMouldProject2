package com.example.baselibrary.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * description:
 * Date: 2017/5/19 16:57
 * User: Administrator
 */
public class CustomMsgItem extends RelativeLayout {

    private static final int VIEW_IVICON_ID = 0x0001;
    private static final int VIEW_TVTITLE_ID = 0x0002;
    private static final int VIEW_TVCONTENT_ID = 0x0003;
    private static final int VIEW_BTMTIP_ID = 0x0004;
    private static final int VIEW_IVEXPAND_ID = 0x0005;

    private Context context;
    private OnClickListener onClickListener = null;

    /*view control*/
    private ImageView ivIcon;
    private TextView tvTitle;
    private TextView tvContent;
    private ButtonM btmTip;
    private ImageView ivExpand;

    public interface OnClickListener {
        public void onClick(View v);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public CustomMsgItem(Context context) {
        this(context, null);
    }

    public CustomMsgItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomMsgItem(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
        setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        setBackgroundColor(android.graphics.Color.WHITE);
        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent event) {
                //setColor(event.getAction());
                return false;
            }
        });
        setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onClickListener != null) {
                    onClickListener.onClick(v);
                }
            }
        });
        initView();
    }

    private void initView() {
        ivIcon = new ImageView(context);
         // ivIcon.setId(VIEW_IVICON_ID);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_VERTICAL);
        lp.setMargins(10, 5, 10, 5);
        ivIcon.setLayoutParams(lp);

        tvTitle = new TextView(context);
        //  tvTitle.setId(VIEW_TVTITLE_ID);
        lp = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.RIGHT_OF, ivIcon.getId());
        lp.setMargins(0, 5, 0, 5);
        tvTitle.setTextSize(16);
        tvTitle.setTextColor(Color.parseColor("#696969"));
        tvTitle.setLayoutParams(lp);

        ivExpand = new ImageView(context);
        // ivExpand.setId(VIEW_IVEXPAND_ID);
        lp = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_VERTICAL);
        lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        lp.rightMargin = 10;
        ivExpand.setLayoutParams(lp);

        btmTip = new ButtonM(context);
        // btmTip.setId(VIEW_BTMTIP_ID);
        btmTip.setShape(GradientDrawable.OVAL);
        btmTip.setFillet(true);
        btmTip.setTextColori(android.graphics.Color.WHITE);
        btmTip.setTextSize(14);
        btmTip.setShape(GradientDrawable.OVAL);
        btmTip.setRadius(15);
                 /*back color is red*/
        btmTip.setBackColor(Color.parseColor("#ff0000"));
        lp = new RelativeLayout.LayoutParams(dp2px(context, 32), dp2px(context, 32));
        lp.addRule(RelativeLayout.CENTER_VERTICAL);
        lp.addRule(RelativeLayout.LEFT_OF, ivExpand.getId());
        lp.rightMargin = 5;
        btmTip.setLayoutParams(lp);

        tvContent = new TextView(context);
        // tvContent.setId(VIEW_TVCONTENT_ID);
        lp = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.LEFT_OF, btmTip.getId());
        lp.addRule(RelativeLayout.RIGHT_OF, ivIcon.getId());
        lp.addRule(RelativeLayout.BELOW, tvTitle.getId());
        lp.rightMargin = 10;
        lp.bottomMargin = 5;
        tvContent.setTextSize(18);
        tvContent.setTextColor(getResources().getColor(android.R.color.black));
        tvContent.setLayoutParams(lp);
                 /* When the length of the text is more than one line, then the end of"..." */
        tvContent.setSingleLine();
        tvContent.setEllipsize(TextUtils.TruncateAt.END);

        addView(ivIcon);
        addView(tvTitle);
        addView(tvContent);
        addView(btmTip);
        addView(ivExpand);
    }

    /**
     * 143      * set icon vith drawable
     * 144      * @param drawable
     * 145
     */
    public void setImageDrawableIcon(Drawable drawable) {
        ivIcon.setImageDrawable(drawable);
    }

    /**
     * 151      * set icon with resId
     * 152      * @param resId
     * 153
     */
    public void setImageResourceIcon(int resId) {
        ivIcon.setImageResource(resId);
    }

    /**
     * 159      * set icon with bitmap
     * 160      * @param bitmap
     * 161
     */
    public void setImageBitmapIcon(Bitmap bitmap) {
        ivIcon.setImageBitmap(bitmap);
    }

    /**
     * 167      * set the title show state that change the tvContent position
     * 168      * @param visible
     * 169
     */
    public void setVisibleTitle(Boolean visible) {
        RelativeLayout.LayoutParams lp;
        if (visible) {
            tvTitle.setVisibility(View.VISIBLE);
            lp = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            lp.addRule(RelativeLayout.LEFT_OF, btmTip.getId());
            lp.addRule(RelativeLayout.RIGHT_OF, ivIcon.getId());
            lp.addRule(RelativeLayout.BELOW, tvTitle.getId());
            lp.rightMargin = 5;
            lp.bottomMargin = 5;
            tvContent.setLayoutParams(lp);
        } else {
            tvTitle.setVisibility(View.GONE);
            lp = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            lp.addRule(RelativeLayout.LEFT_OF, btmTip.getId());
            lp.addRule(RelativeLayout.RIGHT_OF, ivIcon.getId());
            lp.addRule(RelativeLayout.CENTER_VERTICAL);
            tvContent.setLayoutParams(lp);
        }
    }

    /**
     * 192      * set text to the title
     * 193      * @param title
     * 194
     */
    public void setTextTitle(String title) {
        tvTitle.setText(title);
    }

    /**
     * 200      * set text to the content
     * 201      * @param content
     * 202
     */
    public void setTextContent(String content) {
        tvContent.setText(content);
    }

    /**
     * 208      * set text to the Tip
     * 209      * @param tip
     * 210
     */
    public void setTextTip(String tip) {
        btmTip.setText(tip);
    }

    /**
     * 216      * set Tip backgroundResource with resId
     * 217      * @param resId
     * 218
     */
    public void setImageResourceTip(int resId) {
        btmTip.setBackGroundImage(resId);
    }

    /**
     * 224      * set visible to the Tip
     * 225      * @param visible
     * 226
     */
    public void setVisibleTip(Boolean visible) {
        btmTip.setVisibility(visible ? View.VISIBLE : View.GONE);
    }

    /**
     * 232      * set expand vith drawable
     * 233      * @param drawable
     * 234
     */
    public void setImageDrawableExpand(Drawable drawable) {
        ivExpand.setImageDrawable(drawable);
    }

    /**
     * 240      * set expand with resId
     * 241      * @param resId
     * 242
     */
    public void setImageResourceExpand(int resId) {
        ivExpand.setImageResource(resId);
    }

    /**
     * 248      * set expand with bitmap
     * 249      * @param bitmap
     * 250
     */
    public void setImageBitmapExpand(Bitmap bitmap) {
        ivExpand.setImageBitmap(bitmap);
    }

    /**
     * 256      * set visible to the expand
     * 257      * @param visible
     * 258
     */
    public void setVisibleExpand(Boolean visible) {
        ivExpand.setVisibility(visible ? View.VISIBLE : View.GONE);
    }


    private int dp2px(Context context, float dpVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                dpVal, context.getResources().getDisplayMetrics());
    }


}
