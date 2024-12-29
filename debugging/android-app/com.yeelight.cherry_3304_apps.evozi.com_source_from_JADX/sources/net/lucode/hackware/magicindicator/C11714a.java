package net.lucode.hackware.magicindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.p265d.p266c.p269d.C11729a;

@TargetApi(11)
/* renamed from: net.lucode.hackware.magicindicator.a */
public class C11714a {

    /* renamed from: a */
    private List<MagicIndicator> f23045a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ValueAnimator f23046b;

    /* renamed from: c */
    private int f23047c;

    /* renamed from: d */
    private int f23048d = 150;

    /* renamed from: e */
    private Interpolator f23049e = new AccelerateDecelerateInterpolator();

    /* renamed from: f */
    private Animator.AnimatorListener f23050f = new C11715a();

    /* renamed from: g */
    private ValueAnimator.AnimatorUpdateListener f23051g = new C11716b();

    /* renamed from: net.lucode.hackware.magicindicator.a$a */
    class C11715a extends AnimatorListenerAdapter {
        C11715a() {
        }

        public void onAnimationEnd(Animator animator) {
            C11714a.this.m30392e(0);
            ValueAnimator unused = C11714a.this.f23046b = null;
        }
    }

    /* renamed from: net.lucode.hackware.magicindicator.a$b */
    class C11716b implements ValueAnimator.AnimatorUpdateListener {
        C11716b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = (int) floatValue;
            float f = floatValue - ((float) i);
            if (floatValue < 0.0f) {
                i--;
                f += 1.0f;
            }
            C11714a.this.m30393f(i, f, 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m30392e(int i) {
        for (MagicIndicator a : this.f23045a) {
            a.mo36799a(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m30393f(int i, float f, int i2) {
        for (MagicIndicator b : this.f23045a) {
            b.mo36800b(i, f, i2);
        }
    }

    /* renamed from: g */
    private void m30394g(int i) {
        for (MagicIndicator c : this.f23045a) {
            c.mo36801c(i);
        }
    }

    /* renamed from: h */
    public static C11729a m30395h(List<C11729a> list, int i) {
        int i2;
        if (i >= 0 && i <= list.size() - 1) {
            return list.get(i);
        }
        C11729a aVar = new C11729a();
        if (i < 0) {
            i2 = 0;
        } else {
            i = (i - list.size()) + 1;
            i2 = list.size() - 1;
        }
        C11729a aVar2 = list.get(i2);
        aVar.f23094a = aVar2.f23094a + (aVar2.mo36884b() * i);
        aVar.f23095b = aVar2.f23095b;
        aVar.f23096c = aVar2.f23096c + (aVar2.mo36884b() * i);
        aVar.f23097d = aVar2.f23097d;
        aVar.f23098e = aVar2.f23098e + (aVar2.mo36884b() * i);
        aVar.f23099f = aVar2.f23099f;
        aVar.f23100g = aVar2.f23100g + (i * aVar2.mo36884b());
        aVar.f23101h = aVar2.f23101h;
        return aVar;
    }

    /* renamed from: d */
    public void mo36804d(MagicIndicator magicIndicator) {
        this.f23045a.add(magicIndicator);
    }

    /* renamed from: i */
    public void mo36805i(int i) {
        mo36806j(i, true);
    }

    /* renamed from: j */
    public void mo36806j(int i, boolean z) {
        if (this.f23047c != i) {
            if (z) {
                ValueAnimator valueAnimator = this.f23046b;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    m30392e(2);
                }
                m30394g(i);
                float f = (float) this.f23047c;
                ValueAnimator valueAnimator2 = this.f23046b;
                if (valueAnimator2 != null) {
                    f = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    this.f23046b.cancel();
                    this.f23046b = null;
                }
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f23046b = valueAnimator3;
                valueAnimator3.setFloatValues(new float[]{f, (float) i});
                this.f23046b.addUpdateListener(this.f23051g);
                this.f23046b.addListener(this.f23050f);
                this.f23046b.setInterpolator(this.f23049e);
                this.f23046b.setDuration((long) this.f23048d);
                this.f23046b.start();
            } else {
                m30394g(i);
                ValueAnimator valueAnimator4 = this.f23046b;
                if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                    m30393f(this.f23047c, 0.0f, 0);
                }
                m30392e(0);
                m30393f(i, 0.0f, 0);
            }
            this.f23047c = i;
        }
    }
}
