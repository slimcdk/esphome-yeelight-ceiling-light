package com.yeelight.yeelib.p194ui.view;

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
    TextView f19423a = ((TextView) findViewById(R$id.text_title));

    /* renamed from: b */
    RedSpotTipImageView f19424b = ((RedSpotTipImageView) findViewById(R$id.btn_title_bar_left));

    /* renamed from: c */
    RedSpotTipImageView f19425c = ((RedSpotTipImageView) findViewById(R$id.btn_title_bar_right));

    /* renamed from: d */
    RedSpotTipImageView f19426d = ((RedSpotTipImageView) findViewById(R$id.btn_title_bar_right2));

    /* renamed from: e */
    FrameLayout f19427e = ((FrameLayout) findViewById(R$id.common_tile_bar_layout));

    /* renamed from: f */
    ImageView f19428f = ((ImageView) findViewById(R$id.image_logo_view));

    /* renamed from: g */
    ImageView f19429g = ((ImageView) findViewById(R$id.tile_bar_bottom_divider));

    /* renamed from: h */
    TextView f19430h = ((TextView) findViewById(R$id.tile_bar_right_text));

    public CommonTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R$layout.common_title_bar, this);
        ProgressBar progressBar = (ProgressBar) findViewById(R$id.page_loading_img);
        this.f19425c.mo33115a(false);
        this.f19426d.mo33115a(false);
        this.f19424b.mo33115a(false);
        setInitPara(attributeSet);
    }

    /* renamed from: a */
    public void mo32825a(String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this.f19423a.setText(str);
        this.f19424b.setOnClickListener(onClickListener);
        this.f19425c.setOnClickListener(onClickListener2);
        this.f19430h.setOnClickListener(onClickListener2);
    }

    /* renamed from: b */
    public void mo32826b(@DrawableRes int i, View.OnClickListener onClickListener) {
        this.f19426d.setVisibility(0);
        this.f19426d.setImageResource(i);
        this.f19426d.setOnClickListener(onClickListener);
    }

    /* renamed from: c */
    public void mo32827c(int i, int i2, int i3, int i4) {
        this.f19425c.setPadding(i, i2, i3, i4);
    }

    public RedSpotTipImageView getRightButton() {
        return this.f19425c;
    }

    public void setBottomDividerVisibility(int i) {
        this.f19429g.setVisibility(i);
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
            this.f19427e.setBackgroundColor(0);
            this.f19423a.setBackgroundColor(0);
            this.f19424b.setBackgroundColor(0);
            this.f19425c.setBackgroundColor(0);
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(R$styleable.CommonTitleBar_rightButtonBackground, 0);
        if (resourceId4 != 0) {
            this.f19425c.setBackground(ContextCompat.getDrawable(getContext(), resourceId4));
        }
        int resourceId5 = obtainStyledAttributes.getResourceId(R$styleable.CommonTitleBar_bottomDividerColor, 0);
        if (resourceId5 != 0) {
            this.f19429g.setBackgroundColor(ContextCompat.getColor(getContext(), resourceId5));
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.CommonTitleBar_bottomDividerVisible, true)) {
            this.f19429g.setVisibility(0);
        } else {
            this.f19429g.setVisibility(8);
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.CommonTitleBar_rightTextVisible, false)) {
            this.f19430h.setVisibility(0);
        } else {
            this.f19430h.setVisibility(8);
        }
        int resourceId6 = obtainStyledAttributes.getResourceId(R$styleable.CommonTitleBar_rightTextResource, 0);
        if (resourceId6 != 0) {
            this.f19430h.setText(resourceId6);
        }
        int resourceId7 = obtainStyledAttributes.getResourceId(R$styleable.CommonTitleBar_rightTextColor, 0);
        if (resourceId7 != 0) {
            this.f19430h.setTextColor(ContextCompat.getColor(getContext(), resourceId7));
        }
        obtainStyledAttributes.recycle();
    }

    public void setLeftButtonRedSpot(boolean z) {
        this.f19424b.mo33115a(z);
    }

    public void setLeftButtonResource(int i) {
        this.f19424b.setImageResource(i);
    }

    public void setLeftButtonVisibility(int i) {
        this.f19424b.setVisibility(i);
    }

    public void setLogoViewVisibility(int i) {
        this.f19428f.setVisibility(i);
    }

    public void setRightButtonClickListener(View.OnClickListener onClickListener) {
        this.f19425c.setOnClickListener(onClickListener);
        this.f19430h.setOnClickListener(onClickListener);
    }

    public void setRightButtonDrawable(Drawable drawable) {
        this.f19425c.setImageDrawable(drawable);
    }

    public void setRightButtonRedSoptOffset(int i) {
        this.f19425c.setCircleCenterOffSet(i);
    }

    public void setRightButtonRedSpot(boolean z) {
        this.f19425c.mo33115a(z);
    }

    public void setRightButtonResource(int i) {
        this.f19425c.setImageResource(i);
    }

    public void setRightButtonVisibility(int i) {
        this.f19425c.setVisibility(i);
    }

    public void setRightTextColor(@ColorInt int i) {
        this.f19430h.setTextColor(i);
    }

    public void setRightTextStr(String str) {
        this.f19430h.setText(str);
    }

    public void setRightTextVisible(boolean z) {
        this.f19430h.setVisibility(z ? 0 : 4);
    }

    public void setTitle(CharSequence charSequence) {
        this.f19423a.setText(charSequence);
    }

    public void setTitleBarBackground(int i) {
        this.f19427e.setBackgroundResource(i);
    }

    public void setTitleTextColor(int i) {
        this.f19423a.setTextColor(ContextCompat.getColor(getContext(), i));
    }

    public void setTitleTextSize(int i) {
        this.f19423a.setTextSize((float) i);
    }
}
