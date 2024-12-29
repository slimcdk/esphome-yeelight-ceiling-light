package com.yeelight.yeelib.p142ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.yeelight.yeelib.R$color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p096s2.C3687b;
import p096s2.C3688c;
import p112w2.C3894a;

/* renamed from: com.yeelight.yeelib.ui.view.a */
public class C8869a extends View implements C3687b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Paint f16121a;

    /* renamed from: b */
    float f16122b;

    /* renamed from: c */
    float f16123c;

    /* renamed from: d */
    private ArrayList<ValueAnimator> f16124d;

    /* renamed from: e */
    private Map<ValueAnimator, ValueAnimator.AnimatorUpdateListener> f16125e;

    /* renamed from: f */
    private int f16126f;

    /* renamed from: g */
    private int f16127g;

    /* renamed from: h */
    private int f16128h;

    /* renamed from: i */
    private int f16129i;

    /* renamed from: j */
    private int f16130j;

    /* renamed from: k */
    private float f16131k;

    /* renamed from: com.yeelight.yeelib.ui.view.a$a */
    class C8870a implements ValueAnimator.AnimatorUpdateListener {
        C8870a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8869a.this.f16122b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C8869a.this.postInvalidate();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.a$b */
    class C8871b implements ValueAnimator.AnimatorUpdateListener {
        C8871b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8869a.this.f16123c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C8869a.this.postInvalidate();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.a$c */
    class C8872c implements ValueAnimator.AnimatorUpdateListener {
        C8872c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8869a.this.f16121a.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            C8869a.this.postInvalidate();
        }
    }

    public C8869a(Context context) {
        this(context, (AttributeSet) null);
    }

    public C8869a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C8869a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16122b = 1.0f;
        this.f16128h = 15;
        this.f16129i = 4;
        this.f16130j = 5;
        this.f16131k = 12.0f;
        this.f16125e = new HashMap();
        this.f16126f = -3684409;
        this.f16127g = getResources().getColor(R$color.round_btn_red);
        int a = C3894a.m11093a(context, 30.0f);
        setLayoutParams(new FrameLayout.LayoutParams(a, a, 17));
        Paint paint = new Paint();
        this.f16121a = paint;
        paint.setColor(-1);
        this.f16121a.setStyle(Paint.Style.FILL);
        this.f16121a.setAntiAlias(true);
        float f = ((float) getResources().getDisplayMetrics().widthPixels) / 1080.0f;
        this.f16128h = (int) (((float) this.f16128h) * f);
        this.f16129i = (int) (((float) this.f16129i) * f);
        this.f16131k *= f;
        this.f16130j = (int) (f * ((float) this.f16130j));
    }

    /* renamed from: g */
    private boolean m21124g() {
        Iterator<ValueAnimator> it = this.f16124d.iterator();
        if (it.hasNext()) {
            return it.next().isStarted();
        }
        return false;
    }

    /* renamed from: a */
    public void mo26098a(float f, float f2) {
        mo36537h();
    }

    /* renamed from: b */
    public void mo26099b(float f, float f2, float f3) {
        mo36538i();
    }

    /* renamed from: c */
    public void mo26100c(C3688c cVar) {
        cVar.mo20261a();
    }

    /* renamed from: d */
    public void mo26101d(float f, float f2, float f3) {
        mo36538i();
    }

    /* renamed from: f */
    public void mo36536f() {
        this.f16124d = new ArrayList<>();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f, 1.0f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatCount(-1);
        this.f16125e.put(ofFloat, new C8870a());
        this.f16124d.add(ofFloat);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 180.0f, 360.0f});
        ofFloat2.setDuration(1000);
        ofFloat2.setRepeatCount(-1);
        this.f16125e.put(ofFloat2, new C8871b());
        this.f16124d.add(ofFloat2);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{196, 255, 196});
        ofInt.setDuration(1500);
        ofInt.setRepeatCount(-1);
        this.f16125e.put(ofInt, new C8872c());
        this.f16124d.add(ofInt);
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo36537h() {
        if (this.f16124d == null) {
            mo36536f();
        }
        if (this.f16124d != null && !m21124g()) {
            for (int i = 0; i < this.f16124d.size(); i++) {
                ValueAnimator valueAnimator = this.f16124d.get(i);
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f16125e.get(valueAnimator);
                if (animatorUpdateListener != null) {
                    valueAnimator.addUpdateListener(animatorUpdateListener);
                }
                valueAnimator.start();
            }
            setIndicatorColor(this.f16127g);
        }
    }

    /* renamed from: i */
    public void mo36538i() {
        ArrayList<ValueAnimator> arrayList = this.f16124d;
        if (arrayList != null) {
            Iterator<ValueAnimator> it = arrayList.iterator();
            while (it.hasNext()) {
                ValueAnimator next = it.next();
                if (next != null && next.isStarted()) {
                    next.removeAllUpdateListeners();
                    next.end();
                }
            }
        }
        setIndicatorColor(this.f16126f);
        this.f16123c = 0.0f;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f16124d != null) {
            for (int i = 0; i < this.f16124d.size(); i++) {
                this.f16124d.get(i).cancel();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f16121a.setStrokeWidth((float) this.f16129i);
        this.f16121a.setStyle(Paint.Style.STROKE);
        float width = (float) (getWidth() / 2);
        float height = (float) (getHeight() / 2);
        canvas.save();
        canvas.translate(width, height);
        canvas.rotate(this.f16123c);
        float[] fArr = {135.0f, -45.0f};
        for (int i = 0; i < 2; i++) {
            float f = this.f16131k;
            canvas.drawArc(new RectF((-width) + f, (-height) + f, width - f, height - f), fArr[i], 90.0f, false, this.f16121a);
        }
        this.f16121a.setStrokeWidth((float) this.f16130j);
        this.f16121a.setStyle(Paint.Style.STROKE);
        canvas.restore();
        canvas.translate(width, height);
        float f2 = this.f16122b;
        canvas.scale(f2, f2);
        canvas.rotate(-this.f16123c);
        canvas.drawCircle(0.0f, 0.0f, (float) this.f16128h, this.f16121a);
    }

    public void reset() {
        mo36538i();
    }

    public void setIndicatorColor(int i) {
        this.f16121a.setColor(i);
    }
}
