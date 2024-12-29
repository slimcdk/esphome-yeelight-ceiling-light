package com.lcodecore.tkrefreshlayout.p142h;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.lcodecore.tkrefreshlayout.C3388b;
import com.lcodecore.tkrefreshlayout.C3389c;
import com.lcodecore.tkrefreshlayout.R$color;
import com.lcodecore.tkrefreshlayout.p144j.C3421a;

/* renamed from: com.lcodecore.tkrefreshlayout.h.a */
public class C3395a extends View implements C3388b {

    /* renamed from: a */
    private Paint f6598a;

    /* renamed from: b */
    private float f6599b;

    /* renamed from: c */
    private int f6600c;

    /* renamed from: d */
    private int f6601d;

    /* renamed from: e */
    float f6602e;

    /* renamed from: f */
    float f6603f;

    /* renamed from: g */
    boolean f6604g;

    /* renamed from: h */
    ValueAnimator f6605h;

    /* renamed from: i */
    ValueAnimator f6606i;

    /* renamed from: com.lcodecore.tkrefreshlayout.h.a$a */
    class C3396a implements ValueAnimator.AnimatorUpdateListener {
        C3396a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3395a.this.f6602e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C3395a.this.invalidate();
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.h.a$b */
    class C3397b implements ValueAnimator.AnimatorUpdateListener {
        C3397b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3395a.this.f6603f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    public C3395a(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public C3395a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6600c = 5;
        this.f6604g = false;
        m10539e();
    }

    /* renamed from: e */
    private void m10539e() {
        this.f6599b = (float) C3421a.m10616a(getContext(), 4.0f);
        Paint paint = new Paint();
        this.f6598a = paint;
        paint.setAntiAlias(true);
        this.f6598a.setColor(Color.rgb(114, 114, 114));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 1.2f, 1.0f, 0.8f});
        this.f6605h = ofFloat;
        ofFloat.setDuration(800);
        this.f6605h.setInterpolator(new DecelerateInterpolator());
        this.f6605h.addUpdateListener(new C3396a());
        this.f6605h.setRepeatCount(-1);
        this.f6605h.setRepeatMode(2);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f, 1.0f, 1.2f});
        this.f6606i = ofFloat2;
        ofFloat2.setDuration(800);
        this.f6606i.setInterpolator(new DecelerateInterpolator());
        this.f6606i.addUpdateListener(new C3397b());
        this.f6606i.setRepeatCount(-1);
        this.f6606i.setRepeatMode(2);
    }

    /* renamed from: a */
    public void mo18713a(float f, float f2) {
        this.f6604g = true;
        this.f6605h.start();
        this.f6606i.start();
    }

    /* renamed from: b */
    public void mo18714b(float f, float f2, float f3) {
        float f4 = (f / 2.0f) + 1.0f;
        setScaleX(f4);
        setScaleY(f4);
        if (f < 1.0f) {
            this.f6604g = false;
            if (this.f6605h.isRunning()) {
                this.f6605h.cancel();
                invalidate();
            }
            if (this.f6606i.isRunning()) {
                this.f6606i.cancel();
            }
        }
    }

    /* renamed from: c */
    public void mo18715c(float f, float f2, float f3) {
        float f4 = (f / 2.0f) + 1.0f;
        setScaleX(f4);
        setScaleY(f4);
        this.f6604g = false;
        if (this.f6605h.isRunning()) {
            this.f6605h.cancel();
            invalidate();
        }
        if (this.f6606i.isRunning()) {
            this.f6606i.cancel();
        }
    }

    /* renamed from: d */
    public void mo18716d(C3389c cVar) {
        cVar.mo18648a();
    }

    public View getView() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f6605h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f6606i;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f4;
        float f5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onDraw(canvas);
        int measuredWidth = (getMeasuredWidth() / this.f6600c) - 10;
        for (int i11 = 0; i11 < this.f6600c; i11++) {
            if (this.f6604g) {
                if (i11 == 0) {
                    this.f6598a.setAlpha(105);
                    this.f6598a.setColor(getResources().getColor(R$color.Yellow));
                    i8 = (getMeasuredWidth() / 2) - (this.f6601d * 2);
                    i7 = (measuredWidth * 2) / 3;
                } else if (i11 == 1) {
                    this.f6598a.setAlpha(145);
                    this.f6598a.setColor(getResources().getColor(R$color.Green));
                    i8 = (getMeasuredWidth() / 2) - (this.f6601d * 1);
                    i7 = measuredWidth / 3;
                } else if (i11 != 2) {
                    if (i11 == 3) {
                        this.f6598a.setAlpha(145);
                        this.f6598a.setColor(getResources().getColor(R$color.Orange));
                        i10 = (getMeasuredWidth() / 2) + (this.f6601d * 1);
                        i9 = measuredWidth / 3;
                    } else if (i11 != 4) {
                    } else {
                        this.f6598a.setAlpha(105);
                        this.f6598a.setColor(getResources().getColor(R$color.Yellow));
                        i10 = (getMeasuredWidth() / 2) + (this.f6601d * 2);
                        i9 = (measuredWidth * 2) / 3;
                    }
                    i6 = i10 + (i9 * 2);
                    f3 = (float) i6;
                    f2 = (float) (getMeasuredHeight() / 2);
                    f5 = this.f6599b;
                    f4 = this.f6603f;
                    f = f5 * f4;
                } else {
                    this.f6598a.setAlpha(255);
                    this.f6598a.setColor(getResources().getColor(R$color.Blue));
                    f3 = (float) (getMeasuredWidth() / 2);
                    f2 = (float) (getMeasuredHeight() / 2);
                    f5 = this.f6599b;
                    f4 = this.f6602e;
                    f = f5 * f4;
                }
                i6 = i8 - (i7 * 2);
                f3 = (float) i6;
                f2 = (float) (getMeasuredHeight() / 2);
                f5 = this.f6599b;
                f4 = this.f6603f;
                f = f5 * f4;
            } else {
                if (i11 == 0) {
                    this.f6598a.setAlpha(105);
                    this.f6598a.setColor(getResources().getColor(R$color.Yellow));
                    i3 = (getMeasuredWidth() / 2) - (this.f6601d * 2);
                    i2 = (measuredWidth * 2) / 3;
                } else if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            this.f6598a.setAlpha(145);
                            this.f6598a.setColor(getResources().getColor(R$color.Orange));
                            i5 = (getMeasuredWidth() / 2) + (this.f6601d * 1);
                            i4 = measuredWidth / 3;
                        } else if (i11 != 4) {
                        } else {
                            this.f6598a.setAlpha(105);
                            this.f6598a.setColor(getResources().getColor(R$color.Yellow));
                            i5 = (getMeasuredWidth() / 2) + (this.f6601d * 2);
                            i4 = (measuredWidth * 2) / 3;
                        }
                        i = i5 + (i4 * 2);
                    } else {
                        this.f6598a.setAlpha(255);
                        this.f6598a.setColor(getResources().getColor(R$color.Blue));
                        i = getMeasuredWidth() / 2;
                    }
                    f3 = (float) i;
                    f2 = (float) (getMeasuredHeight() / 2);
                    f = this.f6599b;
                } else {
                    this.f6598a.setAlpha(145);
                    this.f6598a.setColor(getResources().getColor(R$color.Green));
                    i3 = (getMeasuredWidth() / 2) - (this.f6601d * 1);
                    i2 = measuredWidth / 3;
                }
                i = i3 - (i2 * 2);
                f3 = (float) i;
                f2 = (float) (getMeasuredHeight() / 2);
                f = this.f6599b;
            }
            canvas.drawCircle(f3, f2, f, this.f6598a);
        }
    }

    public void reset() {
        this.f6604g = false;
        if (this.f6605h.isRunning()) {
            this.f6605h.cancel();
        }
        if (this.f6606i.isRunning()) {
            this.f6606i.cancel();
        }
        invalidate();
    }

    public void setCir_x(int i) {
        this.f6601d = i;
    }
}
