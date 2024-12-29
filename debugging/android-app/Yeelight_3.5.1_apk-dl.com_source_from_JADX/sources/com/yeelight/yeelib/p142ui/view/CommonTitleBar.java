package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$styleable;

/* renamed from: com.yeelight.yeelib.ui.view.CommonTitleBar */
public class CommonTitleBar extends FrameLayout {

    /* renamed from: a */
    TextView f15685a = ((TextView) findViewById(R$id.text_title));

    /* renamed from: b */
    RedSpotTipImageView f15686b = ((RedSpotTipImageView) findViewById(R$id.btn_title_bar_left));

    /* renamed from: c */
    RedSpotTipImageView f15687c = ((RedSpotTipImageView) findViewById(R$id.btn_title_bar_right));

    /* renamed from: d */
    RedSpotTipImageView f15688d = ((RedSpotTipImageView) findViewById(R$id.btn_title_bar_right2));

    /* renamed from: e */
    FrameLayout f15689e = ((FrameLayout) findViewById(R$id.common_tile_bar_layout));

    /* renamed from: f */
    ImageView f15690f = ((ImageView) findViewById(R$id.image_logo_view));

    /* renamed from: g */
    ImageView f15691g = ((ImageView) findViewById(R$id.tile_bar_bottom_divider));

    /* renamed from: h */
    TextView f15692h = ((TextView) findViewById(R$id.tile_bar_right_text));

    public CommonTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R$layout.common_title_bar, this);
        ProgressBar progressBar = (ProgressBar) findViewById(R$id.page_loading_img);
        this.f15687c.mo36484a(false);
        this.f15688d.mo36484a(false);
        this.f15686b.mo36484a(false);
        setInitPara(attributeSet);
    }

    /* renamed from: a */
    public void mo36195a(String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this.f15685a.setText(str);
        this.f15686b.setOnClickListener(onClickListener);
        this.f15687c.setOnClickListener(onClickListener2);
        this.f15692h.setOnClickListener(onClickListener2);
    }

    /* renamed from: b */
    public void mo36196b(@DrawableRes int i, View.OnClickListener onClickListener) {
        this.f15688d.setVisibility(0);
        this.f15688d.setImageResource(i);
        this.f15688d.setOnClickListener(onClickListener);
    }

    /* renamed from: c */
    public void mo36197c(int i, int i2, int i3, int i4) {
        this.f15687c.setPadding(i, i2, i3, i4);
    }

    public RedSpotTipImageView getRightButton() {
        return this.f15687c;
    }

    public void setBottomDividerVisibility(int i) {
        this.f15691g.setVisibility(i);
    }

    public void setInitPara(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CommonTitleBar);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.CommonTitleBar_textColor, 0);
        if (resourceId != 0) {
            setTitleTextColor(resourceId);
        }
        setLeftButtonVisibility(obtainStyledAttributes.getBoolean(R$styleable.CommonTitleBar_leftButtonVisible, false) ? 0 : 8);
        setRightButtonVisibility(obtainStyledAttributes.getBoolean(R$styleable.CommonTitleBar_rightButtonVisible, false) ? 0 : 8);
        int resourceId2 = obtainStyledAttributes.getResourceId(R$styleable.CommonTitleBar_leftButtonResource, 0);
        if (resourceId2 != 0) {
            setLeftButtonResource(resourceId2);
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(R$styleable.CommonTitleBar_rightButtonResource, 0);
        if (resourceId3 != 0) {
            setRightButtonResource(resourceId3);
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.CommonTitleBar_backgroundTranslucent, false)) {
            this.f15689e.setBackgroundColor(0);
            this.f15685a.setBackgroundColor(0);
            this.f15686b.setBackgroundColor(0);
            this.f15687c.setBackgroundColor(0);
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(R$styleable.CommonTitleBar_rightButtonBackground, 0);
        if (resourceId4 != 0) {
            this.f15687c.setBackground(ContextCompat.getDrawable(getContext(), resourceId4));
        }
        int resourceId5 = obtainStyledAttributes.getResourceId(R$styleable.CommonTitleBar_bottomDividerColor, 0);
        if (resourceId5 != 0) {
            this.f15691g.setBackgroundColor(ContextCompat.getColor(getContext(), resourceId5));
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.CommonTitleBar_bottomDividerVisible, true)) {
            this.f15691g.setVisibility(0);
        } else {
            this.f15691g.setVisibility(8);
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.CommonTitleBar_rightTextVisible, false)) {
            this.f15692h.setVisibility(0);
        } else {
            this.f15692h.setVisibility(8);
        }
        int resourceId6 = obtainStyledAttributes.getResourceId(R$styleable.CommonTitleBar_rightTextResource, 0);
        if (resourceId6 != 0) {
            this.f15692h.setText(resourceId6);
        }
        int resourceId7 = obtainStyledAttributes.getResourceId(R$styleable.CommonTitleBar_rightTextColor, 0);
        if (resourceId7 != 0) {
            this.f15692h.setTextColor(ContextCompat.getColor(getContext(), resourceId7));
        }
        obtainStyledAttributes.recycle();
    }

    public void setLeftButtonRedSpot(boolean z) {
        this.f15686b.mo36484a(z);
    }

    public void setLeftButtonResource(int i) {
        this.f15686b.setImageResource(i);
    }

    public void setLeftButtonVisibility(int i) {
        this.f15686b.setVisibility(i);
    }

    public void setLogoViewVisibility(int i) {
        this.f15690f.setVisibility(i);
    }

    public void setRightButtonClickListener(View.OnClickListener onClickListener) {
        this.f15687c.setOnClickListener(onClickListener);
        this.f15692h.setOnClickListener(onClickListener);
    }

    public void setRightButtonDrawable(Drawable drawable) {
        this.f15687c.setImageDrawable(drawable);
    }

    public void setRightButtonRedSoptOffset(int i) {
        this.f15687c.setCircleCenterOffSet(i);
    }

    public void setRightButtonRedSpot(boolean z) {
        this.f15687c.mo36484a(z);
    }

    public void setRightButtonResource(int i) {
        this.f15687c.setImageResource(i);
    }

    public void setRightButtonVisibility(int i) {
        this.f15687c.setVisibility(i);
    }

    public void setRightTextColor(@ColorInt int i) {
        this.f15692h.setTextColor(i);
    }

    public void setRightTextStr(String str) {
        this.f15692h.setText(str);
    }

    public void setRightTextVisible(boolean z) {
        this.f15692h.setVisibility(z ? 0 : 4);
    }

    public void setTitle(CharSequence charSequence) {
        this.f15685a.setText(charSequence);
    }

    public void setTitleBarBackground(int i) {
        this.f15689e.setBackgroundResource(i);
    }

    public void setTitleTextColor(int i) {
        this.f15685a.setTextColor(ContextCompat.getColor(getContext(), i));
    }

    public void setTitleTextSize(int i) {
        this.f15685a.setTextSize((float) i);
    }
}
