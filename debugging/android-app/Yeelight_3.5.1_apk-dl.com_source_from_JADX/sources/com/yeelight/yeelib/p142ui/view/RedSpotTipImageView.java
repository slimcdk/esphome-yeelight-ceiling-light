package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.yeelight.yeelib.R$color;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.view.RedSpotTipImageView */
public class RedSpotTipImageView extends AppCompatImageView {

    /* renamed from: a */
    private int f16071a;

    /* renamed from: b */
    private boolean f16072b = false;

    /* renamed from: c */
    private Paint f16073c;

    /* renamed from: d */
    private int f16074d;

    public RedSpotTipImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo36484a(boolean z) {
        this.f16072b = z;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f16073c == null) {
            Paint paint = new Paint();
            this.f16073c = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f16073c.setAntiAlias(true);
            this.f16071a = getResources().getColor(R$color.common_color_primary);
        }
        if (this.f16072b) {
            double d = (double) width;
            Double.isNaN(d);
            float f = (float) ((d * 1.7d) / 2.0d);
            int i = this.f16074d;
            double d2 = (double) height;
            Double.isNaN(d2);
            this.f16073c.setColor(this.f16071a);
            canvas.drawCircle(f - ((float) i), ((float) ((d2 * 0.5d) / 2.0d)) + ((float) i), (float) C9193k.m22152c(getContext(), 4.0f), this.f16073c);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCircleCenterOffSet(int i) {
        this.f16074d = i;
    }

    public void setPointColor(int i) {
        this.f16071a = i;
        invalidate();
    }
}
