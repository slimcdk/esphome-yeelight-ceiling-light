package p104u2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.lcodecore.tkrefreshlayout.R$color;
import p096s2.C3687b;
import p096s2.C3688c;
import p112w2.C3894a;

/* renamed from: u2.a */
public class C3720a extends View implements C3687b {

    /* renamed from: a */
    private Paint f6240a;

    /* renamed from: b */
    private float f6241b;

    /* renamed from: c */
    private int f6242c;

    /* renamed from: d */
    private int f6243d;

    /* renamed from: e */
    float f6244e;

    /* renamed from: f */
    float f6245f;

    /* renamed from: g */
    boolean f6246g;

    /* renamed from: h */
    ValueAnimator f6247h;

    /* renamed from: i */
    ValueAnimator f6248i;

    /* renamed from: u2.a$a */
    class C3721a implements ValueAnimator.AnimatorUpdateListener {
        C3721a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3720a.this.f6244e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C3720a.this.invalidate();
        }
    }

    /* renamed from: u2.a$b */
    class C3722b implements ValueAnimator.AnimatorUpdateListener {
        C3722b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3720a.this.f6245f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    public C3720a(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public C3720a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6242c = 5;
        this.f6246g = false;
        m10607e();
    }

    /* renamed from: e */
    private void m10607e() {
        this.f6241b = (float) C3894a.m11093a(getContext(), 4.0f);
        Paint paint = new Paint();
        this.f6240a = paint;
        paint.setAntiAlias(true);
        this.f6240a.setColor(Color.rgb(114, 114, 114));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 1.2f, 1.0f, 0.8f});
        this.f6247h = ofFloat;
        ofFloat.setDuration(800);
        this.f6247h.setInterpolator(new DecelerateInterpolator());
        this.f6247h.addUpdateListener(new C3721a());
        this.f6247h.setRepeatCount(-1);
        this.f6247h.setRepeatMode(2);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f, 1.0f, 1.2f});
        this.f6248i = ofFloat2;
        ofFloat2.setDuration(800);
        this.f6248i.setInterpolator(new DecelerateInterpolator());
        this.f6248i.addUpdateListener(new C3722b());
        this.f6248i.setRepeatCount(-1);
        this.f6248i.setRepeatMode(2);
    }

    /* renamed from: a */
    public void mo26098a(float f, float f2) {
        this.f6246g = true;
        this.f6247h.start();
        this.f6248i.start();
    }

    /* renamed from: b */
    public void mo26099b(float f, float f2, float f3) {
        float f4 = (f / 2.0f) + 1.0f;
        setScaleX(f4);
        setScaleY(f4);
        if (f < 1.0f) {
            this.f6246g = false;
            if (this.f6247h.isRunning()) {
                this.f6247h.cancel();
                invalidate();
            }
            if (this.f6248i.isRunning()) {
                this.f6248i.cancel();
            }
        }
    }

    /* renamed from: c */
    public void mo26100c(C3688c cVar) {
        cVar.mo20261a();
    }

    /* renamed from: d */
    public void mo26101d(float f, float f2, float f3) {
        float f4 = (f / 2.0f) + 1.0f;
        setScaleX(f4);
        setScaleY(f4);
        this.f6246g = false;
        if (this.f6247h.isRunning()) {
            this.f6247h.cancel();
            invalidate();
        }
        if (this.f6248i.isRunning()) {
            this.f6248i.cancel();
        }
    }

    public View getView() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f6247h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f6248i;
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
        int measuredWidth = (getMeasuredWidth() / this.f6242c) - 10;
        for (int i11 = 0; i11 < this.f6242c; i11++) {
            if (this.f6246g) {
                if (i11 == 0) {
                    this.f6240a.setAlpha(105);
                    this.f6240a.setColor(getResources().getColor(R$color.Yellow));
                    i8 = (getMeasuredWidth() / 2) - (this.f6243d * 2);
                    i7 = (measuredWidth * 2) / 3;
                } else if (i11 == 1) {
                    this.f6240a.setAlpha(145);
                    this.f6240a.setColor(getResources().getColor(R$color.Green));
                    i8 = (getMeasuredWidth() / 2) - (this.f6243d * 1);
                    i7 = measuredWidth / 3;
                } else if (i11 != 2) {
                    if (i11 == 3) {
                        this.f6240a.setAlpha(145);
                        this.f6240a.setColor(getResources().getColor(R$color.Orange));
                        i10 = (getMeasuredWidth() / 2) + (this.f6243d * 1);
                        i9 = measuredWidth / 3;
                    } else if (i11 != 4) {
                    } else {
                        this.f6240a.setAlpha(105);
                        this.f6240a.setColor(getResources().getColor(R$color.Yellow));
                        i10 = (getMeasuredWidth() / 2) + (this.f6243d * 2);
                        i9 = (measuredWidth * 2) / 3;
                    }
                    i6 = i10 + (i9 * 2);
                    f3 = (float) i6;
                    f2 = (float) (getMeasuredHeight() / 2);
                    f5 = this.f6241b;
                    f4 = this.f6245f;
                    f = f5 * f4;
                } else {
                    this.f6240a.setAlpha(255);
                    this.f6240a.setColor(getResources().getColor(R$color.Blue));
                    f3 = (float) (getMeasuredWidth() / 2);
                    f2 = (float) (getMeasuredHeight() / 2);
                    f5 = this.f6241b;
                    f4 = this.f6244e;
                    f = f5 * f4;
                }
                i6 = i8 - (i7 * 2);
                f3 = (float) i6;
                f2 = (float) (getMeasuredHeight() / 2);
                f5 = this.f6241b;
                f4 = this.f6245f;
                f = f5 * f4;
            } else {
                if (i11 == 0) {
                    this.f6240a.setAlpha(105);
                    this.f6240a.setColor(getResources().getColor(R$color.Yellow));
                    i3 = (getMeasuredWidth() / 2) - (this.f6243d * 2);
                    i2 = (measuredWidth * 2) / 3;
                } else if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            this.f6240a.setAlpha(145);
                            this.f6240a.setColor(getResources().getColor(R$color.Orange));
                            i5 = (getMeasuredWidth() / 2) + (this.f6243d * 1);
                            i4 = measuredWidth / 3;
                        } else if (i11 != 4) {
                        } else {
                            this.f6240a.setAlpha(105);
                            this.f6240a.setColor(getResources().getColor(R$color.Yellow));
                            i5 = (getMeasuredWidth() / 2) + (this.f6243d * 2);
                            i4 = (measuredWidth * 2) / 3;
                        }
                        i = i5 + (i4 * 2);
                    } else {
                        this.f6240a.setAlpha(255);
                        this.f6240a.setColor(getResources().getColor(R$color.Blue));
                        i = getMeasuredWidth() / 2;
                    }
                    f3 = (float) i;
                    f2 = (float) (getMeasuredHeight() / 2);
                    f = this.f6241b;
                } else {
                    this.f6240a.setAlpha(145);
                    this.f6240a.setColor(getResources().getColor(R$color.Green));
                    i3 = (getMeasuredWidth() / 2) - (this.f6243d * 1);
                    i2 = measuredWidth / 3;
                }
                i = i3 - (i2 * 2);
                f3 = (float) i;
                f2 = (float) (getMeasuredHeight() / 2);
                f = this.f6241b;
            }
            canvas.drawCircle(f3, f2, f, this.f6240a);
        }
    }

    public void reset() {
        this.f6246g = false;
        if (this.f6247h.isRunning()) {
            this.f6247h.cancel();
        }
        if (this.f6248i.isRunning()) {
            this.f6248i.cancel();
        }
        invalidate();
    }

    public void setCir_x(int i) {
        this.f6243d = i;
    }
}
