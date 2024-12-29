package com.yeelight.yeelib.p194ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.lcodecore.tkrefreshlayout.C3388b;
import com.lcodecore.tkrefreshlayout.C3389c;
import com.lcodecore.tkrefreshlayout.p144j.C3421a;
import com.yeelight.yeelib.R$color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.yeelight.yeelib.ui.view.b */
public class C10493b extends View implements C3388b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Paint f19864a;

    /* renamed from: b */
    float f19865b;

    /* renamed from: c */
    float f19866c;

    /* renamed from: d */
    private ArrayList<ValueAnimator> f19867d;

    /* renamed from: e */
    private Map<ValueAnimator, ValueAnimator.AnimatorUpdateListener> f19868e;

    /* renamed from: f */
    private int f19869f;

    /* renamed from: g */
    private int f19870g;

    /* renamed from: h */
    private int f19871h;

    /* renamed from: i */
    private int f19872i;

    /* renamed from: j */
    private int f19873j;

    /* renamed from: k */
    private float f19874k;

    /* renamed from: com.yeelight.yeelib.ui.view.b$a */
    class C10494a implements ValueAnimator.AnimatorUpdateListener {
        C10494a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C10493b.this.f19865b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C10493b.this.postInvalidate();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.b$b */
    class C10495b implements ValueAnimator.AnimatorUpdateListener {
        C10495b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C10493b.this.f19866c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C10493b.this.postInvalidate();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.b$c */
    class C10496c implements ValueAnimator.AnimatorUpdateListener {
        C10496c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C10493b.this.f19864a.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            C10493b.this.postInvalidate();
        }
    }

    public C10493b(Context context) {
        this(context, (AttributeSet) null);
    }

    public C10493b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C10493b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19865b = 1.0f;
        this.f19871h = 15;
        this.f19872i = 4;
        this.f19873j = 5;
        this.f19874k = 12.0f;
        this.f19868e = new HashMap();
        this.f19869f = -3684409;
        this.f19870g = getResources().getColor(R$color.round_btn_red);
        int a = C3421a.m10616a(context, 30.0f);
        setLayoutParams(new FrameLayout.LayoutParams(a, a, 17));
        Paint paint = new Paint();
        this.f19864a = paint;
        paint.setColor(-1);
        this.f19864a.setStyle(Paint.Style.FILL);
        this.f19864a.setAntiAlias(true);
        float f = ((float) getResources().getDisplayMetrics().widthPixels) / 1080.0f;
        this.f19871h = (int) (((float) this.f19871h) * f);
        this.f19872i = (int) (((float) this.f19872i) * f);
        this.f19874k *= f;
        this.f19873j = (int) (f * ((float) this.f19873j));
    }

    /* renamed from: g */
    private boolean m25510g() {
        Iterator<ValueAnimator> it = this.f19867d.iterator();
        if (it.hasNext()) {
            return it.next().isStarted();
        }
        return false;
    }

    /* renamed from: a */
    public void mo18713a(float f, float f2) {
        mo33169h();
    }

    /* renamed from: b */
    public void mo18714b(float f, float f2, float f3) {
        mo33170i();
    }

    /* renamed from: c */
    public void mo18715c(float f, float f2, float f3) {
        mo33170i();
    }

    /* renamed from: d */
    public void mo18716d(C3389c cVar) {
        cVar.mo18648a();
    }

    /* renamed from: f */
    public void mo33168f() {
        this.f19867d = new ArrayList<>();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f, 1.0f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatCount(-1);
        this.f19868e.put(ofFloat, new C10494a());
        this.f19867d.add(ofFloat);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 180.0f, 360.0f});
        ofFloat2.setDuration(1000);
        ofFloat2.setRepeatCount(-1);
        this.f19868e.put(ofFloat2, new C10495b());
        this.f19867d.add(ofFloat2);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{196, 255, 196});
        ofInt.setDuration(1500);
        ofInt.setRepeatCount(-1);
        this.f19868e.put(ofInt, new C10496c());
        this.f19867d.add(ofInt);
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo33169h() {
        if (this.f19867d == null) {
            mo33168f();
        }
        if (this.f19867d != null && !m25510g()) {
            for (int i = 0; i < this.f19867d.size(); i++) {
                ValueAnimator valueAnimator = this.f19867d.get(i);
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f19868e.get(valueAnimator);
                if (animatorUpdateListener != null) {
                    valueAnimator.addUpdateListener(animatorUpdateListener);
                }
                valueAnimator.start();
            }
            setIndicatorColor(this.f19870g);
        }
    }

    /* renamed from: i */
    public void mo33170i() {
        ArrayList<ValueAnimator> arrayList = this.f19867d;
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
        setIndicatorColor(this.f19869f);
        this.f19866c = 0.0f;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f19867d != null) {
            for (int i = 0; i < this.f19867d.size(); i++) {
                this.f19867d.get(i).cancel();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f19864a.setStrokeWidth((float) this.f19872i);
        this.f19864a.setStyle(Paint.Style.STROKE);
        float width = (float) (getWidth() / 2);
        float height = (float) (getHeight() / 2);
        canvas.save();
        canvas.translate(width, height);
        canvas.rotate(this.f19866c);
        float[] fArr = {135.0f, -45.0f};
        for (int i = 0; i < 2; i++) {
            float f = this.f19874k;
            canvas.drawArc(new RectF((-width) + f, (-height) + f, width - f, height - f), fArr[i], 90.0f, false, this.f19864a);
        }
        this.f19864a.setStrokeWidth((float) this.f19873j);
        this.f19864a.setStyle(Paint.Style.STROKE);
        canvas.restore();
        canvas.translate(width, height);
        float f2 = this.f19865b;
        canvas.scale(f2, f2);
        canvas.rotate(-this.f19866c);
        canvas.drawCircle(0.0f, 0.0f, (float) this.f19871h, this.f19864a);
    }

    public void reset() {
        mo33170i();
    }

    public void setIndicatorColor(int i) {
        this.f19864a.setColor(i);
    }
}
