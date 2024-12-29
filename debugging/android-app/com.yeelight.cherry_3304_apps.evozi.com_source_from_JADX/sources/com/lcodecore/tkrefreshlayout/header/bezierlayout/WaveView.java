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
    private int f6627a;

    /* renamed from: b */
    private int f6628b;

    /* renamed from: c */
    Path f6629c;

    /* renamed from: d */
    Paint f6630d;

    public WaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10548a();
    }

    /* renamed from: a */
    private void m10548a() {
        this.f6629c = new Path();
        Paint paint = new Paint();
        this.f6630d = paint;
        paint.setColor(-14736346);
        this.f6630d.setAntiAlias(true);
    }

    public int getHeadHeight() {
        return this.f6628b;
    }

    public int getWaveHeight() {
        return this.f6627a;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f6629c.reset();
        this.f6629c.lineTo(0.0f, (float) this.f6628b);
        this.f6629c.quadTo((float) (getMeasuredWidth() / 2), (float) (this.f6628b + this.f6627a), (float) getMeasuredWidth(), (float) this.f6628b);
        this.f6629c.lineTo((float) getMeasuredWidth(), 0.0f);
        canvas.drawPath(this.f6629c, this.f6630d);
    }

    public void setHeadHeight(int i) {
        this.f6628b = i;
    }

    public void setWaveColor(@ColorInt int i) {
        Paint paint = this.f6630d;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setWaveHeight(int i) {
        this.f6627a = i;
    }
}
