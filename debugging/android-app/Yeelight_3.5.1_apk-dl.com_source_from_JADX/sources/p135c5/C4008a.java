package p135c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.MagicIndicator;
import p171i5.C9120a;

@TargetApi(11)
/* renamed from: c5.a */
public class C4008a {

    /* renamed from: a */
    private List<MagicIndicator> f6766a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ValueAnimator f6767b;

    /* renamed from: c */
    private int f6768c;

    /* renamed from: d */
    private int f6769d = 150;

    /* renamed from: e */
    private Interpolator f6770e = new AccelerateDecelerateInterpolator();

    /* renamed from: f */
    private Animator.AnimatorListener f6771f = new C4009a();

    /* renamed from: g */
    private ValueAnimator.AnimatorUpdateListener f6772g = new C4010b();

    /* renamed from: c5.a$a */
    class C4009a extends AnimatorListenerAdapter {
        C4009a() {
        }

        public void onAnimationEnd(Animator animator) {
            C4008a.this.m11649e(0);
            ValueAnimator unused = C4008a.this.f6767b = null;
        }
    }

    /* renamed from: c5.a$b */
    class C4010b implements ValueAnimator.AnimatorUpdateListener {
        C4010b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = (int) floatValue;
            float f = floatValue - ((float) i);
            if (floatValue < 0.0f) {
                i--;
                f += 1.0f;
            }
            C4008a.this.m11650f(i, f, 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m11649e(int i) {
        for (MagicIndicator a : this.f6766a) {
            a.mo38942a(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m11650f(int i, float f, int i2) {
        for (MagicIndicator b : this.f6766a) {
            b.mo38943b(i, f, i2);
        }
    }

    /* renamed from: g */
    private void m11651g(int i) {
        for (MagicIndicator c : this.f6766a) {
            c.mo38944c(i);
        }
    }

    /* renamed from: h */
    public static C9120a m11652h(List<C9120a> list, int i) {
        int i2;
        if (i >= 0 && i <= list.size() - 1) {
            return list.get(i);
        }
        C9120a aVar = new C9120a();
        if (i < 0) {
            i2 = 0;
        } else {
            i = (i - list.size()) + 1;
            i2 = list.size() - 1;
        }
        C9120a aVar2 = list.get(i2);
        aVar.f16857a = aVar2.f16857a + (aVar2.mo37185b() * i);
        aVar.f16858b = aVar2.f16858b;
        aVar.f16859c = aVar2.f16859c + (aVar2.mo37185b() * i);
        aVar.f16860d = aVar2.f16860d;
        aVar.f16861e = aVar2.f16861e + (aVar2.mo37185b() * i);
        aVar.f16862f = aVar2.f16862f;
        aVar.f16863g = aVar2.f16863g + (i * aVar2.mo37185b());
        aVar.f16864h = aVar2.f16864h;
        return aVar;
    }

    /* renamed from: d */
    public void mo26601d(MagicIndicator magicIndicator) {
        this.f6766a.add(magicIndicator);
    }

    /* renamed from: i */
    public void mo26602i(int i) {
        mo26603j(i, true);
    }

    /* renamed from: j */
    public void mo26603j(int i, boolean z) {
        if (this.f6768c != i) {
            if (z) {
                ValueAnimator valueAnimator = this.f6767b;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    m11649e(2);
                }
                m11651g(i);
                float f = (float) this.f6768c;
                ValueAnimator valueAnimator2 = this.f6767b;
                if (valueAnimator2 != null) {
                    f = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    this.f6767b.cancel();
                    this.f6767b = null;
                }
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f6767b = valueAnimator3;
                valueAnimator3.setFloatValues(new float[]{f, (float) i});
                this.f6767b.addUpdateListener(this.f6772g);
                this.f6767b.addListener(this.f6771f);
                this.f6767b.setInterpolator(this.f6770e);
                this.f6767b.setDuration((long) this.f6769d);
                this.f6767b.start();
            } else {
                m11651g(i);
                ValueAnimator valueAnimator4 = this.f6767b;
                if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                    m11650f(this.f6768c, 0.0f, 0);
                }
                m11649e(0);
                m11650f(i, 0.0f, 0);
            }
            this.f6768c = i;
        }
    }
}
