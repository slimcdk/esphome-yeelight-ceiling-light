package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.view.RedSpotTipTextView */
public class RedSpotTipTextView extends TextView {

    /* renamed from: a */
    private int f16075a = Color.parseColor("#ff320a");

    /* renamed from: b */
    private boolean f16076b = false;

    /* renamed from: c */
    private Paint f16077c;

    public RedSpotTipTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo36489a(boolean z) {
        this.f16076b = z;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int paddingRight = getPaddingRight();
        if (this.f16077c == null) {
            Paint paint = new Paint();
            this.f16077c = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f16077c.setAntiAlias(true);
        }
        if (this.f16076b) {
            this.f16077c.setColor(this.f16075a);
            int i = paddingRight / 2;
            canvas.drawCircle((float) (width - i), (float) ((height / 2) - i), (float) C9193k.m22152c(getContext(), 4.0f), this.f16077c);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setPointColor(int i) {
        this.f16075a = i;
        invalidate();
    }
}
