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
    private Paint f6616a;

    /* renamed from: b */
    private Paint f6617b;

    /* renamed from: c */
    private float f6618c;

    /* renamed from: d */
    private int f6619d;

    /* renamed from: e */
    private int f6620e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f6621f;

    /* renamed from: g */
    private int f6622g;

    /* renamed from: h */
    ValueAnimator f6623h;

    /* renamed from: i */
    private RectF f6624i;

    /* renamed from: j */
    private RectF f6625j;

    /* renamed from: com.lcodecore.tkrefreshlayout.header.bezierlayout.RoundProgressView$a */
    class C3399a implements ValueAnimator.AnimatorUpdateListener {
        C3399a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int unused = RoundProgressView.this.f6621f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            RoundProgressView.this.postInvalidate();
        }
    }

    public RoundProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6618c = 40.0f;
        this.f6619d = 7;
        this.f6620e = 270;
        this.f6621f = 0;
        this.f6622g = 15;
        m10547b();
    }

    /* renamed from: b */
    private void m10547b() {
        this.f6616a = new Paint();
        Paint paint = new Paint();
        this.f6617b = paint;
        paint.setColor(-1);
        this.f6617b.setAntiAlias(true);
        this.f6616a.setAntiAlias(true);
        this.f6616a.setColor(Color.rgb(114, 114, 114));
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 360});
        this.f6623h = ofInt;
        ofInt.setDuration(720);
        this.f6623h.addUpdateListener(new C3399a());
        this.f6623h.setRepeatCount(-1);
        this.f6623h.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f6623h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth() / this.f6619d;
        this.f6616a.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), this.f6618c, this.f6616a);
        canvas.save();
        this.f6616a.setStyle(Paint.Style.STROKE);
        this.f6616a.setStrokeWidth(6.0f);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), this.f6618c + 15.0f, this.f6616a);
        canvas.restore();
        this.f6617b.setStyle(Paint.Style.FILL);
        if (this.f6624i == null) {
            this.f6624i = new RectF();
        }
        this.f6624i.set(((float) (getMeasuredWidth() / 2)) - this.f6618c, ((float) (getMeasuredHeight() / 2)) - this.f6618c, ((float) (getMeasuredWidth() / 2)) + this.f6618c, ((float) (getMeasuredHeight() / 2)) + this.f6618c);
        canvas.drawArc(this.f6624i, (float) this.f6620e, (float) this.f6621f, true, this.f6617b);
        canvas.save();
        this.f6617b.setStrokeWidth(6.0f);
        this.f6617b.setStyle(Paint.Style.STROKE);
        if (this.f6625j == null) {
            this.f6625j = new RectF();
        }
        this.f6625j.set((((float) (getMeasuredWidth() / 2)) - this.f6618c) - ((float) this.f6622g), (((float) (getMeasuredHeight() / 2)) - this.f6618c) - ((float) this.f6622g), ((float) (getMeasuredWidth() / 2)) + this.f6618c + ((float) this.f6622g), ((float) (getMeasuredHeight() / 2)) + this.f6618c + ((float) this.f6622g));
        canvas.drawArc(this.f6625j, (float) this.f6620e, (float) this.f6621f, false, this.f6617b);
        canvas.restore();
    }

    public void setCir_x(int i) {
    }
}
