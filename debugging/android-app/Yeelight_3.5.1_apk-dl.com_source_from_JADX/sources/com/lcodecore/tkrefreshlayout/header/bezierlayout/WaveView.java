package com.lcodecore.tkrefreshlayout.header.bezierlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;

public class WaveView extends View {

    /* renamed from: a */
    private int f4669a;

    /* renamed from: b */
    private int f4670b;

    /* renamed from: c */
    Path f4671c;

    /* renamed from: d */
    Paint f4672d;

    public WaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7493a();
    }

    /* renamed from: a */
    private void m7493a() {
        this.f4671c = new Path();
        Paint paint = new Paint();
        this.f4672d = paint;
        paint.setColor(-14736346);
        this.f4672d.setAntiAlias(true);
    }

    public int getHeadHeight() {
        return this.f4670b;
    }

    public int getWaveHeight() {
        return this.f4669a;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4671c.reset();
        this.f4671c.lineTo(0.0f, (float) this.f4670b);
        this.f4671c.quadTo((float) (getMeasuredWidth() / 2), (float) (this.f4670b + this.f4669a), (float) getMeasuredWidth(), (float) this.f4670b);
        this.f4671c.lineTo((float) getMeasuredWidth(), 0.0f);
        canvas.drawPath(this.f4671c, this.f4672d);
    }

    public void setHeadHeight(int i) {
        this.f4670b = i;
    }

    public void setWaveColor(@ColorInt int i) {
        Paint paint = this.f4672d;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setWaveHeight(int i) {
        this.f4669a = i;
    }
}
