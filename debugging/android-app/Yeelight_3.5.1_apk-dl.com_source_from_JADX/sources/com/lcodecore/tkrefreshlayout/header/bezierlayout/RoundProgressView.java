package com.lcodecore.tkrefreshlayout.header.bezierlayout;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

public class RoundProgressView extends View {

    /* renamed from: a */
    private Paint f4658a;

    /* renamed from: b */
    private Paint f4659b;

    /* renamed from: c */
    private float f4660c;

    /* renamed from: d */
    private int f4661d;

    /* renamed from: e */
    private int f4662e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f4663f;

    /* renamed from: g */
    private int f4664g;

    /* renamed from: h */
    ValueAnimator f4665h;

    /* renamed from: i */
    private RectF f4666i;

    /* renamed from: j */
    private RectF f4667j;

    /* renamed from: com.lcodecore.tkrefreshlayout.header.bezierlayout.RoundProgressView$a */
    class C2692a implements ValueAnimator.AnimatorUpdateListener {
        C2692a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int unused = RoundProgressView.this.f4663f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            RoundProgressView.this.postInvalidate();
        }
    }

    public RoundProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4660c = 40.0f;
        this.f4661d = 7;
        this.f4662e = 270;
        this.f4663f = 0;
        this.f4664g = 15;
        m7492b();
    }

    /* renamed from: b */
    private void m7492b() {
        this.f4658a = new Paint();
        Paint paint = new Paint();
        this.f4659b = paint;
        paint.setColor(-1);
        this.f4659b.setAntiAlias(true);
        this.f4658a.setAntiAlias(true);
        this.f4658a.setColor(Color.rgb(114, 114, 114));
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 360});
        this.f4665h = ofInt;
        ofInt.setDuration(720);
        this.f4665h.addUpdateListener(new C2692a());
        this.f4665h.setRepeatCount(-1);
        this.f4665h.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f4665h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth() / this.f4661d;
        this.f4658a.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), this.f4660c, this.f4658a);
        canvas.save();
        this.f4658a.setStyle(Paint.Style.STROKE);
        this.f4658a.setStrokeWidth(6.0f);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), this.f4660c + 15.0f, this.f4658a);
        canvas.restore();
        this.f4659b.setStyle(Paint.Style.FILL);
        if (this.f4666i == null) {
            this.f4666i = new RectF();
        }
        this.f4666i.set(((float) (getMeasuredWidth() / 2)) - this.f4660c, ((float) (getMeasuredHeight() / 2)) - this.f4660c, ((float) (getMeasuredWidth() / 2)) + this.f4660c, ((float) (getMeasuredHeight() / 2)) + this.f4660c);
        canvas.drawArc(this.f4666i, (float) this.f4662e, (float) this.f4663f, true, this.f4659b);
        canvas.save();
        this.f4659b.setStrokeWidth(6.0f);
        this.f4659b.setStyle(Paint.Style.STROKE);
        if (this.f4667j == null) {
            this.f4667j = new RectF();
        }
        this.f4667j.set((((float) (getMeasuredWidth() / 2)) - this.f4660c) - ((float) this.f4664g), (((float) (getMeasuredHeight() / 2)) - this.f4660c) - ((float) this.f4664g), ((float) (getMeasuredWidth() / 2)) + this.f4660c + ((float) this.f4664g), ((float) (getMeasuredHeight() / 2)) + this.f4660c + ((float) this.f4664g));
        canvas.drawArc(this.f4667j, (float) this.f4662e, (float) this.f4663f, false, this.f4659b);
        canvas.restore();
    }

    public void setCir_x(int i) {
    }
}
