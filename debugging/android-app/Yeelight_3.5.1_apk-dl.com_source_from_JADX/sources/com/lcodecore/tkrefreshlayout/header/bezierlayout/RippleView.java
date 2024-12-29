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
    private Paint f4651a;

    /* renamed from: b */
    private int f4652b;

    /* renamed from: c */
    ValueAnimator f4653c;

    /* renamed from: com.lcodecore.tkrefreshlayout.header.bezierlayout.RippleView$a */
    public interface C2691a {
    }

    public RippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7489a();
    }

    /* renamed from: a */
    private void m7489a() {
        Paint paint = new Paint();
        this.f4651a = paint;
        paint.setAntiAlias(true);
        this.f4651a.setColor(-1);
        this.f4651a.setStyle(Paint.Style.FILL);
    }

    public int getR() {
        return this.f4652b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f4653c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) this.f4652b, this.f4651a);
    }

    public void setR(int i) {
        this.f4652b = i;
    }

    public void setRippleColor(@ColorInt int i) {
        Paint paint = this.f4651a;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setRippleEndListener(C2691a aVar) {
    }
}
