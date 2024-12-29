package p108v2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import p112w2.C3895b;
import p112w2.C3896c;

/* renamed from: v2.a */
public class C3806a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TwinklingRefreshLayout.C2689d f6397a;

    /* renamed from: b */
    private DecelerateInterpolator f6398b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f6399c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f6400d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f6401e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f6402f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f6403g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f6404h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f6405i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f6406j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f6407k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f6408l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f6409m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f6410n = false;

    /* renamed from: o */
    private ValueAnimator.AnimatorUpdateListener f6411o = new C3807a();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ValueAnimator.AnimatorUpdateListener f6412p = new C3808b();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public ValueAnimator.AnimatorUpdateListener f6413q = new C3809c();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ValueAnimator.AnimatorUpdateListener f6414r = new C3810d();

    /* renamed from: v2.a$a */
    class C3807a implements ValueAnimator.AnimatorUpdateListener {
        C3807a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (!C3806a.this.f6399c || !C3806a.this.f6397a.mo20317x()) {
                C3806a.this.f6397a.mo20310q().getLayoutParams().height = intValue;
                C3806a.this.f6397a.mo20310q().requestLayout();
                C3806a.this.f6397a.mo20310q().setTranslationY(0.0f);
                C3806a.this.f6397a.mo20276O((float) intValue);
            } else {
                C3806a.this.m10861N((float) intValue);
            }
            if (!C3806a.this.f6397a.mo20263B()) {
                C3806a.this.f6397a.mo20314u().setTranslationY((float) intValue);
                C3806a.this.m10862O(intValue);
            }
        }
    }

    /* renamed from: v2.a$b */
    class C3808b implements ValueAnimator.AnimatorUpdateListener {
        C3808b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (!C3806a.this.f6400d || !C3806a.this.f6397a.mo20317x()) {
                C3806a.this.f6397a.mo20308o().getLayoutParams().height = intValue;
                C3806a.this.f6397a.mo20308o().requestLayout();
                C3806a.this.f6397a.mo20308o().setTranslationY(0.0f);
                C3806a.this.f6397a.mo20277P((float) intValue);
            } else {
                C3806a.this.m10860M((float) intValue);
            }
            C3806a.this.f6397a.mo20314u().setTranslationY((float) (-intValue));
        }
    }

    /* renamed from: v2.a$c */
    class C3809c implements ValueAnimator.AnimatorUpdateListener {
        C3809c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x006c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAnimationUpdate(android.animation.ValueAnimator r3) {
            /*
                r2 = this;
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                boolean r0 = r0.mo20265D()
                if (r0 == 0) goto L_0x0032
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20310q()
                int r0 = r0.getVisibility()
                if (r0 == 0) goto L_0x0051
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20310q()
                r1 = 0
                goto L_0x004e
            L_0x0032:
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20310q()
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 == r1) goto L_0x0051
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20310q()
            L_0x004e:
                r0.setVisibility(r1)
            L_0x0051:
                v2.a r0 = p108v2.C3806a.this
                boolean r0 = r0.f6399c
                if (r0 == 0) goto L_0x006c
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                boolean r0 = r0.mo20317x()
                if (r0 == 0) goto L_0x006c
                v2.a r0 = p108v2.C3806a.this
                float r1 = (float) r3
                r0.m10861N(r1)
                goto L_0x00a1
            L_0x006c:
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20310q()
                r1 = 0
                r0.setTranslationY(r1)
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20310q()
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                r0.height = r3
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20310q()
                r0.requestLayout()
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                float r1 = (float) r3
                r0.mo20276O(r1)
            L_0x00a1:
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20314u()
                float r1 = (float) r3
                r0.setTranslationY(r1)
                v2.a r0 = p108v2.C3806a.this
                r0.m10862O(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p108v2.C3806a.C3809c.onAnimationUpdate(android.animation.ValueAnimator):void");
        }
    }

    /* renamed from: v2.a$d */
    class C3810d implements ValueAnimator.AnimatorUpdateListener {
        C3810d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x006c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAnimationUpdate(android.animation.ValueAnimator r3) {
            /*
                r2 = this;
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                boolean r0 = r0.mo20264C()
                if (r0 == 0) goto L_0x0032
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20308o()
                int r0 = r0.getVisibility()
                if (r0 == 0) goto L_0x0051
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20308o()
                r1 = 0
                goto L_0x004e
            L_0x0032:
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20308o()
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 == r1) goto L_0x0051
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20308o()
            L_0x004e:
                r0.setVisibility(r1)
            L_0x0051:
                v2.a r0 = p108v2.C3806a.this
                boolean r0 = r0.f6400d
                if (r0 == 0) goto L_0x006c
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                boolean r0 = r0.mo20317x()
                if (r0 == 0) goto L_0x006c
                v2.a r0 = p108v2.C3806a.this
                float r1 = (float) r3
                r0.m10860M(r1)
                goto L_0x00a1
            L_0x006c:
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20308o()
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                r0.height = r3
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20308o()
                r0.requestLayout()
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20308o()
                r1 = 0
                r0.setTranslationY(r1)
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                float r1 = (float) r3
                r0.mo20277P(r1)
            L_0x00a1:
                v2.a r0 = p108v2.C3806a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6397a
                android.view.View r0 = r0.mo20314u()
                int r3 = -r3
                float r3 = (float) r3
                r0.setTranslationY(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p108v2.C3806a.C3810d.onAnimationUpdate(android.animation.ValueAnimator):void");
        }
    }

    /* renamed from: v2.a$e */
    class C3811e extends AnimatorListenerAdapter {
        C3811e() {
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = C3806a.this.f6401e = false;
            if (C3806a.this.f6397a.mo20310q().getVisibility() != 0) {
                C3806a.this.f6397a.mo20310q().setVisibility(0);
            }
            C3806a.this.f6397a.mo20288a0(true);
            if (!C3806a.this.f6397a.mo20317x()) {
                C3806a.this.f6397a.mo20290b0(true);
                C3806a.this.f6397a.mo20280S();
            } else if (!C3806a.this.f6399c) {
                C3806a.this.f6397a.mo20290b0(true);
                C3806a.this.f6397a.mo20280S();
                boolean unused2 = C3806a.this.f6399c = true;
            }
        }
    }

    /* renamed from: v2.a$f */
    class C3812f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f6420a;

        C3812f(boolean z) {
            this.f6420a = z;
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = C3806a.this.f6402f = false;
            C3806a.this.f6397a.mo20288a0(false);
            if (this.f6420a && C3806a.this.f6399c && C3806a.this.f6397a.mo20317x()) {
                C3806a.this.f6397a.mo20310q().getLayoutParams().height = 0;
                C3806a.this.f6397a.mo20310q().requestLayout();
                C3806a.this.f6397a.mo20310q().setTranslationY(0.0f);
                boolean unused2 = C3806a.this.f6399c = false;
                C3806a.this.f6397a.mo20290b0(false);
                C3806a.this.f6397a.mo20283V();
            }
        }
    }

    /* renamed from: v2.a$g */
    class C3813g extends AnimatorListenerAdapter {
        C3813g() {
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = C3806a.this.f6403g = false;
            if (C3806a.this.f6397a.mo20308o().getVisibility() != 0) {
                C3806a.this.f6397a.mo20308o().setVisibility(0);
            }
            C3806a.this.f6397a.mo20284W(true);
            if (!C3806a.this.f6397a.mo20317x()) {
                C3806a.this.f6397a.mo20285X(true);
                C3806a.this.f6397a.mo20274M();
            } else if (!C3806a.this.f6400d) {
                C3806a.this.f6397a.mo20285X(true);
                C3806a.this.f6397a.mo20274M();
                boolean unused2 = C3806a.this.f6400d = true;
            }
        }
    }

    /* renamed from: v2.a$h */
    class C3814h implements ValueAnimator.AnimatorUpdateListener {
        C3814h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int s;
            View view;
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (!C3896c.m11101g(C3806a.this.f6397a.mo20314u(), C3806a.this.f6397a.mo20315v()) && (s = C3806a.this.m10858I() - intValue) > 0) {
                if (C3806a.this.f6397a.mo20314u() instanceof RecyclerView) {
                    view = C3806a.this.f6397a.mo20314u();
                } else {
                    view = C3806a.this.f6397a.mo20314u();
                    s /= 2;
                }
                C3896c.m11104j(view, s);
            }
            C3806a.this.f6412p.onAnimationUpdate(valueAnimator);
        }
    }

    /* renamed from: v2.a$i */
    class C3815i extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f6424a;

        C3815i(boolean z) {
            this.f6424a = z;
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = C3806a.this.f6404h = false;
            C3806a.this.f6397a.mo20284W(false);
            if (this.f6424a && C3806a.this.f6400d && C3806a.this.f6397a.mo20317x()) {
                C3806a.this.f6397a.mo20308o().getLayoutParams().height = 0;
                C3806a.this.f6397a.mo20308o().requestLayout();
                C3806a.this.f6397a.mo20308o().setTranslationY(0.0f);
                boolean unused2 = C3806a.this.f6400d = false;
                C3806a.this.f6397a.mo20282U();
                C3806a.this.f6397a.mo20285X(false);
            }
        }
    }

    /* renamed from: v2.a$j */
    class C3816j extends AnimatorListenerAdapter {
        C3816j() {
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = C3806a.this.f6405i = false;
            C3806a.this.f6397a.mo20288a0(false);
            if (!C3806a.this.f6397a.mo20317x()) {
                C3806a.this.f6397a.mo20290b0(false);
                C3806a.this.f6397a.mo20281T();
                C3806a.this.f6397a.mo20283V();
            }
        }
    }

    /* renamed from: v2.a$k */
    class C3817k extends AnimatorListenerAdapter {
        C3817k() {
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = C3806a.this.f6406j = false;
            C3806a.this.f6397a.mo20284W(false);
            if (!C3806a.this.f6397a.mo20317x()) {
                C3806a.this.f6397a.mo20285X(false);
                C3806a.this.f6397a.mo20275N();
                C3806a.this.f6397a.mo20282U();
            }
        }
    }

    /* renamed from: v2.a$l */
    class C3818l extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f6428a;

        /* renamed from: b */
        final /* synthetic */ int f6429b;

        /* renamed from: v2.a$l$a */
        class C3819a extends AnimatorListenerAdapter {
            C3819a() {
            }

            public void onAnimationEnd(Animator animator) {
                boolean unused = C3806a.this.f6407k = false;
                boolean unused2 = C3806a.this.f6408l = false;
            }
        }

        C3818l(int i, int i2) {
            this.f6428a = i;
            this.f6429b = i2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!C3806a.this.f6399c || !C3806a.this.f6397a.mo20317x() || !C3806a.this.f6397a.mo20298f0()) {
                C3806a aVar = C3806a.this;
                aVar.mo26264C(this.f6428a, 0, (long) (this.f6429b * 2), aVar.f6413q, new C3819a());
                return;
            }
            C3806a.this.mo26263B();
            boolean unused = C3806a.this.f6407k = false;
            boolean unused2 = C3806a.this.f6408l = false;
        }
    }

    /* renamed from: v2.a$m */
    class C3820m extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f6432a;

        /* renamed from: b */
        final /* synthetic */ int f6433b;

        /* renamed from: v2.a$m$a */
        class C3821a extends AnimatorListenerAdapter {
            C3821a() {
            }

            public void onAnimationEnd(Animator animator) {
                boolean unused = C3806a.this.f6409m = false;
                boolean unused2 = C3806a.this.f6410n = false;
            }
        }

        C3820m(int i, int i2) {
            this.f6432a = i;
            this.f6433b = i2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!C3806a.this.f6400d || !C3806a.this.f6397a.mo20317x() || !C3806a.this.f6397a.mo20296e0()) {
                C3806a aVar = C3806a.this;
                aVar.mo26264C(this.f6432a, 0, (long) (this.f6433b * 2), aVar.f6414r, new C3821a());
                return;
            }
            C3806a.this.mo26274y();
            boolean unused = C3806a.this.f6409m = false;
            boolean unused2 = C3806a.this.f6410n = false;
        }
    }

    public C3806a(TwinklingRefreshLayout.C2689d dVar) {
        this.f6397a = dVar;
        this.f6398b = new DecelerateInterpolator(8.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public int m10858I() {
        C3895b.m11094a("footer translationY:" + this.f6397a.mo20308o().getTranslationY() + "");
        return (int) (((float) this.f6397a.mo20308o().getLayoutParams().height) - this.f6397a.mo20308o().getTranslationY());
    }

    /* renamed from: J */
    private int m10859J() {
        C3895b.m11094a("header translationY:" + this.f6397a.mo20310q().getTranslationY() + ",Visible head height:" + (((float) this.f6397a.mo20310q().getLayoutParams().height) + this.f6397a.mo20310q().getTranslationY()));
        return (int) (((float) this.f6397a.mo20310q().getLayoutParams().height) + this.f6397a.mo20310q().getTranslationY());
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m10860M(float f) {
        this.f6397a.mo20308o().setTranslationY(((float) this.f6397a.mo20308o().getLayoutParams().height) - f);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m10861N(float f) {
        this.f6397a.mo20310q().setTranslationY(f - ((float) this.f6397a.mo20310q().getLayoutParams().height));
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m10862O(int i) {
        if (!this.f6397a.mo20318y()) {
            this.f6397a.mo20307n().setTranslationY((float) i);
        }
    }

    /* renamed from: A */
    public void mo26262A(int i) {
        if (!this.f6405i) {
            this.f6405i = true;
            C3895b.m11094a("animHeadHideByVy：vy->" + i);
            int abs = Math.abs(i);
            if (abs < 5000) {
                abs = 8000;
            }
            mo26264C(m10859J(), 0, (long) (Math.abs((m10859J() * 1000) / abs) * 5), this.f6411o, new C3816j());
        }
    }

    /* renamed from: B */
    public void mo26263B() {
        C3895b.m11094a("animHeadToRefresh:");
        mo26265D(m10859J(), this.f6397a.mo20309p(), this.f6411o, new C3811e());
    }

    /* renamed from: C */
    public void mo26264C(int i, int i2, long j, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(animatorUpdateListener);
        ofInt.addListener(animatorListener);
        ofInt.setDuration(j);
        ofInt.start();
    }

    /* renamed from: D */
    public void mo26265D(int i, int i2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(animatorUpdateListener);
        ofInt.addListener(animatorListener);
        ofInt.setDuration((long) ((int) (((float) Math.abs(i - i2)) * 1.0f)));
        ofInt.start();
    }

    /* renamed from: E */
    public void mo26266E(float f, int i) {
        int i2;
        C3895b.m11094a("animOverScrollBottom：vy->" + f + ",computeTimes->" + i);
        if (!this.f6410n) {
            this.f6397a.mo20292c0();
            int abs = (int) Math.abs((f / ((float) i)) / 2.0f);
            if (abs > this.f6397a.mo20313t()) {
                abs = this.f6397a.mo20313t();
            }
            int i3 = abs;
            if (i3 <= 50) {
                i2 = 115;
            } else {
                double d = (double) i3;
                Double.isNaN(d);
                i2 = (int) ((d * 0.3d) + 100.0d);
            }
            if (this.f6400d || !this.f6397a.mo20295e()) {
                this.f6410n = true;
                mo26264C(0, i3, (long) i2, this.f6414r, new C3820m(i3, i2));
                return;
            }
            this.f6397a.mo20300g0();
        }
    }

    /* renamed from: F */
    public void mo26267F(float f, int i) {
        int i2;
        C3895b.m11094a("animOverScrollTop：vy->" + f + ",computeTimes->" + i);
        if (!this.f6408l) {
            this.f6408l = true;
            this.f6397a.mo20294d0();
            int abs = (int) Math.abs((f / ((float) i)) / 2.0f);
            if (abs > this.f6397a.mo20313t()) {
                abs = this.f6397a.mo20313t();
            }
            int i3 = abs;
            if (i3 <= 50) {
                i2 = 115;
            } else {
                double d = (double) i3;
                Double.isNaN(d);
                i2 = (int) ((d * 0.3d) + 100.0d);
            }
            mo26264C(m10859J(), i3, (long) i2, this.f6413q, new C3818l(i3, i2));
        }
    }

    /* renamed from: G */
    public void mo26268G() {
        if (this.f6397a.mo20268G() || !this.f6397a.mo20302i() || m10859J() < this.f6397a.mo20309p() - this.f6397a.mo20315v()) {
            mo26275z(false);
        } else {
            mo26263B();
        }
    }

    /* renamed from: H */
    public void mo26269H() {
        if (this.f6397a.mo20268G() || !this.f6397a.mo20299g() || m10858I() < this.f6397a.mo20306m() - this.f6397a.mo20315v()) {
            mo26272w(false);
        } else {
            mo26274y();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26270K(float r4) {
        /*
            r3 = this;
            android.view.animation.DecelerateInterpolator r0 = r3.f6398b
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r1 = r3.f6397a
            int r1 = r1.mo20311r()
            float r1 = (float) r1
            float r1 = r4 / r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = r0.getInterpolation(r1)
            float r0 = r0 * r4
            float r0 = r0 / r2
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            boolean r4 = r4.mo20268G()
            if (r4 != 0) goto L_0x0042
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            boolean r4 = r4.mo20299g()
            if (r4 != 0) goto L_0x002e
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            boolean r4 = r4.mo20264C()
            if (r4 != 0) goto L_0x002e
            goto L_0x0042
        L_0x002e:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20308o()
            int r4 = r4.getVisibility()
            if (r4 == 0) goto L_0x0059
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20308o()
            r1 = 0
            goto L_0x0056
        L_0x0042:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20308o()
            int r4 = r4.getVisibility()
            r1 = 8
            if (r4 == r1) goto L_0x0059
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20308o()
        L_0x0056:
            r4.setVisibility(r1)
        L_0x0059:
            boolean r4 = r3.f6400d
            if (r4 == 0) goto L_0x007d
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            boolean r4 = r4.mo20317x()
            if (r4 == 0) goto L_0x007d
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20308o()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r1 = r3.f6397a
            android.view.View r1 = r1.mo20308o()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r1 = r1.height
            float r1 = (float) r1
            float r1 = r1 - r0
            r4.setTranslationY(r1)
            goto L_0x00a7
        L_0x007d:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20308o()
            r1 = 0
            r4.setTranslationY(r1)
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20308o()
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            float r1 = java.lang.Math.abs(r0)
            int r1 = (int) r1
            r4.height = r1
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20308o()
            r4.requestLayout()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            float r1 = -r0
            r4.mo20279R(r1)
        L_0x00a7:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20314u()
            float r0 = -r0
            r4.setTranslationY(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p108v2.C3806a.mo26270K(float):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26271L(float r4) {
        /*
            r3 = this;
            android.view.animation.DecelerateInterpolator r0 = r3.f6398b
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r1 = r3.f6397a
            float r1 = r1.mo20312s()
            float r1 = r4 / r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = r0.getInterpolation(r1)
            float r0 = r0 * r4
            float r0 = r0 / r2
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            boolean r4 = r4.mo20268G()
            if (r4 != 0) goto L_0x0041
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            boolean r4 = r4.mo20302i()
            if (r4 != 0) goto L_0x002d
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            boolean r4 = r4.mo20265D()
            if (r4 != 0) goto L_0x002d
            goto L_0x0041
        L_0x002d:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20310q()
            int r4 = r4.getVisibility()
            if (r4 == 0) goto L_0x0058
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20310q()
            r1 = 0
            goto L_0x0055
        L_0x0041:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20310q()
            int r4 = r4.getVisibility()
            r1 = 8
            if (r4 == r1) goto L_0x0058
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20310q()
        L_0x0055:
            r4.setVisibility(r1)
        L_0x0058:
            boolean r4 = r3.f6399c
            if (r4 == 0) goto L_0x007d
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            boolean r4 = r4.mo20317x()
            if (r4 == 0) goto L_0x007d
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20310q()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r1 = r3.f6397a
            android.view.View r1 = r1.mo20310q()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r1 = r1.height
            float r1 = (float) r1
            float r1 = r0 - r1
            r4.setTranslationY(r1)
            goto L_0x00a6
        L_0x007d:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20310q()
            r1 = 0
            r4.setTranslationY(r1)
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20310q()
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            float r1 = java.lang.Math.abs(r0)
            int r1 = (int) r1
            r4.height = r1
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20310q()
            r4.requestLayout()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            r4.mo20278Q(r0)
        L_0x00a6:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            boolean r4 = r4.mo20263B()
            if (r4 != 0) goto L_0x00bb
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6397a
            android.view.View r4 = r4.mo20314u()
            r4.setTranslationY(r0)
            int r4 = (int) r0
            r3.m10862O(r4)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p108v2.C3806a.mo26271L(float):void");
    }

    /* renamed from: w */
    public void mo26272w(boolean z) {
        C3895b.m11094a("animBottomBack：finishLoading?->" + z);
        if (z && this.f6400d && this.f6397a.mo20317x()) {
            this.f6397a.mo20286Y(true);
        }
        mo26265D(m10858I(), 0, new C3814h(), new C3815i(z));
    }

    /* renamed from: x */
    public void mo26273x(int i) {
        C3895b.m11094a("animBottomHideByVy：vy->" + i);
        if (!this.f6406j) {
            this.f6406j = true;
            int abs = Math.abs(i);
            if (abs < 5000) {
                abs = 8000;
            }
            mo26264C(m10858I(), 0, (long) (((m10858I() * 5) * 1000) / abs), this.f6412p, new C3817k());
        }
    }

    /* renamed from: y */
    public void mo26274y() {
        C3895b.m11094a("animBottomToLoad");
        mo26265D(m10858I(), this.f6397a.mo20306m(), this.f6412p, new C3813g());
    }

    /* renamed from: z */
    public void mo26275z(boolean z) {
        C3895b.m11094a("animHeadBack：finishRefresh?->" + z);
        if (z && this.f6399c && this.f6397a.mo20317x()) {
            this.f6397a.mo20287Z(true);
        }
        mo26265D(m10859J(), 0, this.f6411o, new C3812f(z));
    }
}
