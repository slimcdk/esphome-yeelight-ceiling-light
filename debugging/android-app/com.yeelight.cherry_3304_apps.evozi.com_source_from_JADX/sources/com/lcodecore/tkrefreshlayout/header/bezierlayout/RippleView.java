package com.lcodecore.tkrefreshlayout.header.bezierlayout;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;

public class RippleView extends View {

    /* renamed from: a */
    private Paint f6609a;

    /* renamed from: b */
    private int f6610b;

    /* renamed from: c */
    ValueAnimator f6611c;

    /* renamed from: com.lcodecore.tkrefreshlayout.header.bezierlayout.RippleView$a */
    public interface C3398a {
    }

    public RippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10544a();
    }

    /* renamed from: a */
    private void m10544a() {
        Paint paint = new Paint();
        this.f6609a = paint;
        paint.setAntiAlias(true);
        this.f6609a.setColor(-1);
        this.f6609a.setStyle(Paint.Style.FILL);
    }

    public int getR() {
        return this.f6610b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f6611c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) this.f6610b, this.f6609a);
    }

    public void setR(int i) {
        this.f6610b = i;
    }

    public void setRippleColor(@ColorInt int i) {
        Paint paint = this.f6609a;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setRippleEndListener(C3398a aVar) {
    }
}
