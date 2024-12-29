package com.yeelight.yeelib.p194ui.view;

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
import com.yeelight.yeelib.p194ui.widget.C10518c;

/* renamed from: com.yeelight.yeelib.ui.view.YeelightSwitchButton */
public class YeelightSwitchButton extends C10518c {
    public YeelightSwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25508f();
    }

    /* renamed from: f */
    private void m25508f() {
        this.f20081a = ContextCompat.getDrawable(getContext(), R$drawable.icon_switch_bg);
        this.f20082b = ContextCompat.getDrawable(getContext(), R$drawable.icon_switch_point_on);
        this.f20084d = ContextCompat.getDrawable(getContext(), R$drawable.icon_switch_point_off);
        setBackgroundResource(R$drawable.sliding_btn_bg_light);
        this.f20090j = this.f20081a.getIntrinsicWidth();
        this.f20091k = this.f20081a.getIntrinsicHeight();
        int min = Math.min(this.f20090j, this.f20082b.getIntrinsicWidth());
        this.f20092l = min;
        this.f20093m = 0;
        this.f20094n = this.f20090j - min;
        this.f20095o = 0;
        this.f20085e = Bitmap.createScaledBitmap(new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), R$drawable.sliding_btn_bar_off_light)).getBitmap(), (this.f20090j * 2) - this.f20092l, this.f20091k, true);
        this.f20087g = Bitmap.createScaledBitmap(new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), R$drawable.sliding_btn_bar_on_light)).getBitmap(), (this.f20090j * 2) - this.f20092l, this.f20091k, true);
        this.f20081a.setBounds(0, 0, this.f20090j, this.f20091k);
        Drawable drawable = ContextCompat.getDrawable(getContext(), R$drawable.sliding_btn_mask_light);
        drawable.setBounds(0, 0, this.f20090j, this.f20091k);
        this.f20089i = mo33286c(drawable);
        this.f20086f = new Paint();
        Paint paint = new Paint();
        this.f20088h = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f20086f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }
}
