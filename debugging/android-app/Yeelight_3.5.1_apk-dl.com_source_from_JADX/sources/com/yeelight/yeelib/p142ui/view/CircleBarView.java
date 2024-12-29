package com.yeelight.yeelib.p142ui.view;

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
import com.yeelight.yeelib.R$color;
import p112w2.C3894a;

/* renamed from: com.yeelight.yeelib.ui.view.CircleBarView */
public class CircleBarView extends View {

    /* renamed from: a */
    private Paint f15601a;

    /* renamed from: b */
    private Paint f15602b;

    /* renamed from: c */
    private RectF f15603c;

    /* renamed from: d */
    private C8785a f15604d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public float f15605e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public float f15606f;

    /* renamed from: g */
    private int f15607g;

    /* renamed from: h */
    private int f15608h;

    /* renamed from: i */
    private float f15609i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f15610j;

    /* renamed from: k */
    private float f15611k;

    /* renamed from: l */
    private int f15612l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f15613m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f15614n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C8786b f15615o;

    /* renamed from: com.yeelight.yeelib.ui.view.CircleBarView$a */
    public class C8785a extends Animation {
        public C8785a() {
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            super.applyTransformation(f, transformation);
            CircleBarView circleBarView = CircleBarView.this;
            float unused = circleBarView.f15613m = circleBarView.f15614n + (((f * (CircleBarView.this.f15610j - CircleBarView.this.f15614n)) * CircleBarView.this.f15605e) / CircleBarView.this.f15606f);
            CircleBarView.this.postInvalidate();
            if (CircleBarView.this.f15613m == CircleBarView.this.f15610j && CircleBarView.this.f15615o != null) {
                CircleBarView.this.f15615o.mo30967a();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.CircleBarView$b */
    public interface C8786b {
        /* renamed from: a */
        void mo30967a();
    }

    public CircleBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20708h(context, attributeSet);
    }

    /* renamed from: h */
    private void m20708h(Context context, AttributeSet attributeSet) {
        this.f15607g = ContextCompat.getColor(context, R$color.common_color_primary);
        this.f15608h = Color.parseColor("#FAD0D2");
        this.f15609i = -90.0f;
        this.f15610j = 360.0f;
        this.f15611k = (float) C3894a.m11093a(context, 5.0f);
        this.f15605e = 0.0f;
        this.f15606f = 100.0f;
        this.f15612l = C3894a.m11093a(context, 200.0f);
        this.f15603c = new RectF();
        Paint paint = new Paint();
        this.f15602b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f15602b.setColor(this.f15607g);
        this.f15602b.setAntiAlias(true);
        this.f15602b.setStrokeWidth(this.f15611k);
        this.f15602b.setStrokeCap(Paint.Cap.BUTT);
        Paint paint2 = new Paint();
        this.f15601a = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f15601a.setColor(this.f15608h);
        this.f15601a.setAntiAlias(true);
        this.f15601a.setStrokeWidth(this.f15611k);
        this.f15601a.setStrokeCap(Paint.Cap.ROUND);
        this.f15604d = new C8785a();
    }

    /* renamed from: i */
    private int m20709i(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode == 1073741824 ? size : mode == Integer.MIN_VALUE ? Math.min(i, size) : i;
    }

    /* renamed from: j */
    public void mo36138j() {
        this.f15614n = 0.0f;
        this.f15605e = 0.0f;
        clearAnimation();
    }

    /* renamed from: k */
    public void mo36139k() {
        clearAnimation();
        mo36140l(this.f15606f, 1000);
    }

    /* renamed from: l */
    public void mo36140l(float f, int i) {
        this.f15605e = f;
        this.f15614n = this.f15613m;
        this.f15604d.setDuration((long) i);
        startAnimation(this.f15604d);
    }

    /* renamed from: m */
    public void mo36141m() {
        clearAnimation();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f15603c, this.f15609i, this.f15610j, false, this.f15601a);
        canvas.drawArc(this.f15603c, this.f15609i, this.f15613m, false, this.f15602b);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(m20709i(this.f15612l, i), m20709i(this.f15612l, i2));
        setMeasuredDimension(min, min);
        float f = (float) min;
        float f2 = this.f15611k;
        if (f >= f2 * 2.0f) {
            this.f15603c.set(f2 / 2.0f, f2 / 2.0f, f - (f2 / 2.0f), f - (f2 / 2.0f));
        }
    }

    public void setMaxNum(float f) {
        this.f15606f = f;
    }

    public void setOnCompleteListener(C8786b bVar) {
        this.f15615o = bVar;
    }
}
