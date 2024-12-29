package com.yeelight.yeelib.p194ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.yeelib.ui.view.RedSpotTipImageView */
public class RedSpotTipImageView extends AppCompatImageView {

    /* renamed from: a */
    private int f19813a;

    /* renamed from: b */
    private boolean f19814b = false;

    /* renamed from: c */
    private Paint f19815c;

    /* renamed from: d */
    private int f19816d;

    public RedSpotTipImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo33115a(boolean z) {
        this.f19814b = z;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f19815c == null) {
            Paint paint = new Paint();
            this.f19815c = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f19815c.setAntiAlias(true);
            this.f19813a = getResources().getColor(R$color.common_color_primary);
        }
        if (this.f19814b) {
            double d = (double) width;
            Double.isNaN(d);
            float f = (float) ((d * 1.7d) / 2.0d);
            int i = this.f19816d;
            double d2 = (double) height;
            Double.isNaN(d2);
            this.f19815c.setColor(this.f19813a);
            canvas.drawCircle(f - ((float) i), ((float) ((d2 * 0.5d) / 2.0d)) + ((float) i), (float) C10547m.m25753c(getContext(), 4.0f), this.f19815c);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCircleCenterOffSet(int i) {
        this.f19816d = i;
    }

    public void setPointColor(int i) {
        this.f19813a = i;
        invalidate();
    }
}
