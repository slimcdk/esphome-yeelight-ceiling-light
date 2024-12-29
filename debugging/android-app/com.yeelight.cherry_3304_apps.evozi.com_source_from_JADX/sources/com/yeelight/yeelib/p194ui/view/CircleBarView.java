package com.yeelight.yeelib.p194ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.core.content.ContextCompat;
import com.lcodecore.tkrefreshlayout.p144j.C3421a;
import com.yeelight.yeelib.R$color;

/* renamed from: com.yeelight.yeelib.ui.view.CircleBarView */
public class CircleBarView extends View {

    /* renamed from: a */
    private Paint f19339a;

    /* renamed from: b */
    private Paint f19340b;

    /* renamed from: c */
    private RectF f19341c;

    /* renamed from: d */
    private C10406a f19342d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public float f19343e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public float f19344f;

    /* renamed from: g */
    private int f19345g;

    /* renamed from: h */
    private int f19346h;

    /* renamed from: i */
    private float f19347i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f19348j;

    /* renamed from: k */
    private float f19349k;

    /* renamed from: l */
    private int f19350l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f19351m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f19352n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C10407b f19353o;

    /* renamed from: com.yeelight.yeelib.ui.view.CircleBarView$a */
    public class C10406a extends Animation {
        public C10406a() {
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            super.applyTransformation(f, transformation);
            CircleBarView circleBarView = CircleBarView.this;
            float unused = circleBarView.f19351m = circleBarView.f19352n + (((f * (CircleBarView.this.f19348j - CircleBarView.this.f19352n)) * CircleBarView.this.f19343e) / CircleBarView.this.f19344f);
            CircleBarView.this.postInvalidate();
            if (CircleBarView.this.f19351m == CircleBarView.this.f19348j && CircleBarView.this.f19353o != null) {
                CircleBarView.this.f19353o.mo27053a();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.CircleBarView$b */
    public interface C10407b {
        /* renamed from: a */
        void mo27053a();
    }

    public CircleBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25097h(context, attributeSet);
    }

    /* renamed from: h */
    private void m25097h(Context context, AttributeSet attributeSet) {
        this.f19345g = ContextCompat.getColor(context, R$color.common_color_primary);
        this.f19346h = Color.parseColor("#FAD0D2");
        this.f19347i = -90.0f;
        this.f19348j = 360.0f;
        this.f19349k = (float) C3421a.m10616a(context, 5.0f);
        this.f19343e = 0.0f;
        this.f19344f = 100.0f;
        this.f19350l = C3421a.m10616a(context, 200.0f);
        this.f19341c = new RectF();
        Paint paint = new Paint();
        this.f19340b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f19340b.setColor(this.f19345g);
        this.f19340b.setAntiAlias(true);
        this.f19340b.setStrokeWidth(this.f19349k);
        this.f19340b.setStrokeCap(Paint.Cap.BUTT);
        Paint paint2 = new Paint();
        this.f19339a = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f19339a.setColor(this.f19346h);
        this.f19339a.setAntiAlias(true);
        this.f19339a.setStrokeWidth(this.f19349k);
        this.f19339a.setStrokeCap(Paint.Cap.ROUND);
        this.f19342d = new C10406a();
    }

    /* renamed from: i */
    private int m25098i(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode == 1073741824 ? size : mode == Integer.MIN_VALUE ? Math.min(i, size) : i;
    }

    /* renamed from: j */
    public void mo32768j() {
        this.f19352n = 0.0f;
        this.f19343e = 0.0f;
        clearAnimation();
    }

    /* renamed from: k */
    public void mo32769k() {
        clearAnimation();
        mo32770l(this.f19344f, 1000);
    }

    /* renamed from: l */
    public void mo32770l(float f, int i) {
        this.f19343e = f;
        this.f19352n = this.f19351m;
        this.f19342d.setDuration((long) i);
        startAnimation(this.f19342d);
    }

    /* renamed from: m */
    public void mo32771m() {
        clearAnimation();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f19341c, this.f19347i, this.f19348j, false, this.f19339a);
        canvas.drawArc(this.f19341c, this.f19347i, this.f19351m, false, this.f19340b);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(m25098i(this.f19350l, i), m25098i(this.f19350l, i2));
        setMeasuredDimension(min, min);
        float f = (float) min;
        float f2 = this.f19349k;
        if (f >= f2 * 2.0f) {
            this.f19341c.set(f2 / 2.0f, f2 / 2.0f, f - (f2 / 2.0f), f - (f2 / 2.0f));
        }
    }

    public void setMaxNum(float f) {
        this.f19344f = f;
    }

    public void setOnCompleteListener(C10407b bVar) {
        this.f19353o = bVar;
    }
}
