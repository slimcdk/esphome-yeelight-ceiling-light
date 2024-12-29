package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.yeelight.yeelib.R$drawable;
import p170i4.C9110c;

/* renamed from: com.yeelight.yeelib.ui.view.YeelightSwitchButton */
public class YeelightSwitchButton extends C9110c {
    public YeelightSwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m21122f();
    }

    /* renamed from: f */
    private void m21122f() {
        this.f16805a = ContextCompat.getDrawable(getContext(), R$drawable.icon_switch_bg);
        this.f16806b = ContextCompat.getDrawable(getContext(), R$drawable.icon_switch_point_on);
        this.f16808d = ContextCompat.getDrawable(getContext(), R$drawable.icon_switch_point_off);
        setBackgroundResource(R$drawable.sliding_btn_bg_light);
        this.f16814j = this.f16805a.getIntrinsicWidth();
        this.f16815k = this.f16805a.getIntrinsicHeight();
        int min = Math.min(this.f16814j, this.f16806b.getIntrinsicWidth());
        this.f16816l = min;
        this.f16817m = 0;
        this.f16818n = this.f16814j - min;
        this.f16819o = 0;
        this.f16809e = Bitmap.createScaledBitmap(new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), R$drawable.sliding_btn_bar_off_light)).getBitmap(), (this.f16814j * 2) - this.f16816l, this.f16815k, true);
        this.f16811g = Bitmap.createScaledBitmap(new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), R$drawable.sliding_btn_bar_on_light)).getBitmap(), (this.f16814j * 2) - this.f16816l, this.f16815k, true);
        this.f16805a.setBounds(0, 0, this.f16814j, this.f16815k);
        Drawable drawable = ContextCompat.getDrawable(getContext(), R$drawable.sliding_btn_mask_light);
        drawable.setBounds(0, 0, this.f16814j, this.f16815k);
        this.f16813i = mo37133c(drawable);
        this.f16810f = new Paint();
        Paint paint = new Paint();
        this.f16812h = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f16810f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }
}
