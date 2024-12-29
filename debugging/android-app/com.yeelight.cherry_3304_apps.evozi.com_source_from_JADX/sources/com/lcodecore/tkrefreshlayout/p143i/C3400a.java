package com.lcodecore.tkrefreshlayout.p143i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.lcodecore.tkrefreshlayout.p144j.C3422b;
import com.lcodecore.tkrefreshlayout.p144j.C3423c;

/* renamed from: com.lcodecore.tkrefreshlayout.i.a */
public class C3400a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TwinklingRefreshLayout.C3385d f6631a;

    /* renamed from: b */
    private DecelerateInterpolator f6632b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f6633c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f6634d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f6635e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f6636f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f6637g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f6638h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f6639i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f6640j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f6641k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f6642l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f6643m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f6644n = false;

    /* renamed from: o */
    private ValueAnimator.AnimatorUpdateListener f6645o = new C3401a();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ValueAnimator.AnimatorUpdateListener f6646p = new C3402b();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public ValueAnimator.AnimatorUpdateListener f6647q = new C3403c();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ValueAnimator.AnimatorUpdateListener f6648r = new C3404d();

    /* renamed from: com.lcodecore.tkrefreshlayout.i.a$a */
    class C3401a implements ValueAnimator.AnimatorUpdateListener {
        C3401a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (!C3400a.this.f6633c || !C3400a.this.f6631a.mo18704x()) {
                C3400a.this.f6631a.mo18697q().getLayoutParams().height = intValue;
                C3400a.this.f6631a.mo18697q().requestLayout();
                C3400a.this.f6631a.mo18697q().setTranslationY(0.0f);
                C3400a.this.f6631a.mo18663O((float) intValue);
            } else {
                C3400a.this.m10552N((float) intValue);
            }
            if (!C3400a.this.f6631a.mo18650B()) {
                C3400a.this.f6631a.mo18701u().setTranslationY((float) intValue);
                C3400a.this.m10553O(intValue);
            }
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.i.a$b */
    class C3402b implements ValueAnimator.AnimatorUpdateListener {
        C3402b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (!C3400a.this.f6634d || !C3400a.this.f6631a.mo18704x()) {
                C3400a.this.f6631a.mo18695o().getLayoutParams().height = intValue;
                C3400a.this.f6631a.mo18695o().requestLayout();
                C3400a.this.f6631a.mo18695o().setTranslationY(0.0f);
                C3400a.this.f6631a.mo18664P((float) intValue);
            } else {
                C3400a.this.m10551M((float) intValue);
            }
            C3400a.this.f6631a.mo18701u().setTranslationY((float) (-intValue));
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.i.a$c */
    class C3403c implements ValueAnimator.AnimatorUpdateListener {
        C3403c() {
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
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                boolean r0 = r0.mo18652D()
                if (r0 == 0) goto L_0x0032
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18697q()
                int r0 = r0.getVisibility()
                if (r0 == 0) goto L_0x0051
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18697q()
                r1 = 0
                goto L_0x004e
            L_0x0032:
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18697q()
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 == r1) goto L_0x0051
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18697q()
            L_0x004e:
                r0.setVisibility(r1)
            L_0x0051:
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                boolean r0 = r0.f6633c
                if (r0 == 0) goto L_0x006c
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                boolean r0 = r0.mo18704x()
                if (r0 == 0) goto L_0x006c
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                float r1 = (float) r3
                r0.m10552N(r1)
                goto L_0x00a1
            L_0x006c:
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18697q()
                r1 = 0
                r0.setTranslationY(r1)
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18697q()
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                r0.height = r3
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18697q()
                r0.requestLayout()
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                float r1 = (float) r3
                r0.mo18663O(r1)
            L_0x00a1:
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18701u()
                float r1 = (float) r3
                r0.setTranslationY(r1)
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                r0.m10553O(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lcodecore.tkrefreshlayout.p143i.C3400a.C3403c.onAnimationUpdate(android.animation.ValueAnimator):void");
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.i.a$d */
    class C3404d implements ValueAnimator.AnimatorUpdateListener {
        C3404d() {
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
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                boolean r0 = r0.mo18651C()
                if (r0 == 0) goto L_0x0032
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18695o()
                int r0 = r0.getVisibility()
                if (r0 == 0) goto L_0x0051
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18695o()
                r1 = 0
                goto L_0x004e
            L_0x0032:
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18695o()
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 == r1) goto L_0x0051
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18695o()
            L_0x004e:
                r0.setVisibility(r1)
            L_0x0051:
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                boolean r0 = r0.f6634d
                if (r0 == 0) goto L_0x006c
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                boolean r0 = r0.mo18704x()
                if (r0 == 0) goto L_0x006c
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                float r1 = (float) r3
                r0.m10551M(r1)
                goto L_0x00a1
            L_0x006c:
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18695o()
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                r0.height = r3
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18695o()
                r0.requestLayout()
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18695o()
                r1 = 0
                r0.setTranslationY(r1)
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                float r1 = (float) r3
                r0.mo18664P(r1)
            L_0x00a1:
                com.lcodecore.tkrefreshlayout.i.a r0 = com.lcodecore.tkrefreshlayout.p143i.C3400a.this
                com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r0 = r0.f6631a
                android.view.View r0 = r0.mo18701u()
                int r3 = -r3
                float r3 = (float) r3
                r0.setTranslationY(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lcodecore.tkrefreshlayout.p143i.C3400a.C3404d.onAnimationUpdate(android.animation.ValueAnimator):void");
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.i.a$e */
    class C3405e extends AnimatorListenerAdapter {
        C3405e() {
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = C3400a.this.f6635e = false;
            if (C3400a.this.f6631a.mo18697q().getVisibility() != 0) {
                C3400a.this.f6631a.mo18697q().setVisibility(0);
            }
            C3400a.this.f6631a.mo18675a0(true);
            if (!C3400a.this.f6631a.mo18704x()) {
                C3400a.this.f6631a.mo18677b0(true);
                C3400a.this.f6631a.mo18667S();
            } else if (!C3400a.this.f6633c) {
                C3400a.this.f6631a.mo18677b0(true);
                C3400a.this.f6631a.mo18667S();
                boolean unused2 = C3400a.this.f6633c = true;
            }
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.i.a$f */
    class C3406f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f6654a;

        C3406f(boolean z) {
            this.f6654a = z;
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = C3400a.this.f6636f = false;
            C3400a.this.f6631a.mo18675a0(false);
            if (this.f6654a && C3400a.this.f6633c && C3400a.this.f6631a.mo18704x()) {
                C3400a.this.f6631a.mo18697q().getLayoutParams().height = 0;
                C3400a.this.f6631a.mo18697q().requestLayout();
                C3400a.this.f6631a.mo18697q().setTranslationY(0.0f);
                boolean unused2 = C3400a.this.f6633c = false;
                C3400a.this.f6631a.mo18677b0(false);
                C3400a.this.f6631a.mo18670V();
            }
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.i.a$g */
    class C3407g extends AnimatorListenerAdapter {
        C3407g() {
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = C3400a.this.f6637g = false;
            if (C3400a.this.f6631a.mo18695o().getVisibility() != 0) {
                C3400a.this.f6631a.mo18695o().setVisibility(0);
            }
            C3400a.this.f6631a.mo18671W(true);
            if (!C3400a.this.f6631a.mo18704x()) {
                C3400a.this.f6631a.mo18672X(true);
                C3400a.this.f6631a.mo18661M();
            } else if (!C3400a.this.f6634d) {
                C3400a.this.f6631a.mo18672X(true);
                C3400a.this.f6631a.mo18661M();
                boolean unused2 = C3400a.this.f6634d = true;
            }
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.i.a$h */
    class C3408h implements ValueAnimator.AnimatorUpdateListener {
        C3408h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int s;
            View view;
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (!C3423c.m10624g(C3400a.this.f6631a.mo18701u(), C3400a.this.f6631a.mo18702v()) && (s = C3400a.this.m10549I() - intValue) > 0) {
                if (C3400a.this.f6631a.mo18701u() instanceof RecyclerView) {
                    view = C3400a.this.f6631a.mo18701u();
                } else {
                    view = C3400a.this.f6631a.mo18701u();
                    s /= 2;
                }
                C3423c.m10627j(view, s);
            }
            C3400a.this.f6646p.onAnimationUpdate(valueAnimator);
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.i.a$i */
    class C3409i extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f6658a;

        C3409i(boolean z) {
            this.f6658a = z;
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = C3400a.this.f6638h = false;
            C3400a.this.f6631a.mo18671W(false);
            if (this.f6658a && C3400a.this.f6634d && C3400a.this.f6631a.mo18704x()) {
                C3400a.this.f6631a.mo18695o().getLayoutParams().height = 0;
                C3400a.this.f6631a.mo18695o().requestLayout();
                C3400a.this.f6631a.mo18695o().setTranslationY(0.0f);
                boolean unused2 = C3400a.this.f6634d = false;
                C3400a.this.f6631a.mo18669U();
                C3400a.this.f6631a.mo18672X(false);
            }
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.i.a$j */
    class C3410j extends AnimatorListenerAdapter {
        C3410j() {
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = C3400a.this.f6639i = false;
            C3400a.this.f6631a.mo18675a0(false);
            if (!C3400a.this.f6631a.mo18704x()) {
                C3400a.this.f6631a.mo18677b0(false);
                C3400a.this.f6631a.mo18668T();
                C3400a.this.f6631a.mo18670V();
            }
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.i.a$k */
    class C3411k extends AnimatorListenerAdapter {
        C3411k() {
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = C3400a.this.f6640j = false;
            C3400a.this.f6631a.mo18671W(false);
            if (!C3400a.this.f6631a.mo18704x()) {
                C3400a.this.f6631a.mo18672X(false);
                C3400a.this.f6631a.mo18662N();
                C3400a.this.f6631a.mo18669U();
            }
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.i.a$l */
    class C3412l extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f6662a;

        /* renamed from: b */
        final /* synthetic */ int f6663b;

        /* renamed from: com.lcodecore.tkrefreshlayout.i.a$l$a */
        class C3413a extends AnimatorListenerAdapter {
            C3413a() {
            }

            public void onAnimationEnd(Animator animator) {
                boolean unused = C3400a.this.f6641k = false;
                boolean unused2 = C3400a.this.f6642l = false;
            }
        }

        C3412l(int i, int i2) {
            this.f6662a = i;
            this.f6663b = i2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!C3400a.this.f6633c || !C3400a.this.f6631a.mo18704x() || !C3400a.this.f6631a.mo18685f0()) {
                C3400a aVar = C3400a.this;
                aVar.mo18752C(this.f6662a, 0, (long) (this.f6663b * 2), aVar.f6647q, new C3413a());
                return;
            }
            C3400a.this.mo18751B();
            boolean unused = C3400a.this.f6641k = false;
            boolean unused2 = C3400a.this.f6642l = false;
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.i.a$m */
    class C3414m extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f6666a;

        /* renamed from: b */
        final /* synthetic */ int f6667b;

        /* renamed from: com.lcodecore.tkrefreshlayout.i.a$m$a */
        class C3415a extends AnimatorListenerAdapter {
            C3415a() {
            }

            public void onAnimationEnd(Animator animator) {
                boolean unused = C3400a.this.f6643m = false;
                boolean unused2 = C3400a.this.f6644n = false;
            }
        }

        C3414m(int i, int i2) {
            this.f6666a = i;
            this.f6667b = i2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!C3400a.this.f6634d || !C3400a.this.f6631a.mo18704x() || !C3400a.this.f6631a.mo18683e0()) {
                C3400a aVar = C3400a.this;
                aVar.mo18752C(this.f6666a, 0, (long) (this.f6667b * 2), aVar.f6648r, new C3415a());
                return;
            }
            C3400a.this.mo18762y();
            boolean unused = C3400a.this.f6643m = false;
            boolean unused2 = C3400a.this.f6644n = false;
        }
    }

    public C3400a(TwinklingRefreshLayout.C3385d dVar) {
        this.f6631a = dVar;
        this.f6632b = new DecelerateInterpolator(8.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public int m10549I() {
        C3422b.m10617a("footer translationY:" + this.f6631a.mo18695o().getTranslationY() + "");
        return (int) (((float) this.f6631a.mo18695o().getLayoutParams().height) - this.f6631a.mo18695o().getTranslationY());
    }

    /* renamed from: J */
    private int m10550J() {
        C3422b.m10617a("header translationY:" + this.f6631a.mo18697q().getTranslationY() + ",Visible head height:" + (((float) this.f6631a.mo18697q().getLayoutParams().height) + this.f6631a.mo18697q().getTranslationY()));
        return (int) (((float) this.f6631a.mo18697q().getLayoutParams().height) + this.f6631a.mo18697q().getTranslationY());
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m10551M(float f) {
        this.f6631a.mo18695o().setTranslationY(((float) this.f6631a.mo18695o().getLayoutParams().height) - f);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m10552N(float f) {
        this.f6631a.mo18697q().setTranslationY(f - ((float) this.f6631a.mo18697q().getLayoutParams().height));
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m10553O(int i) {
        if (!this.f6631a.mo18705y()) {
            this.f6631a.mo18694n().setTranslationY((float) i);
        }
    }

    /* renamed from: A */
    public void mo18750A(int i) {
        if (!this.f6639i) {
            this.f6639i = true;
            C3422b.m10617a("animHeadHideByVy：vy->" + i);
            int abs = Math.abs(i);
            if (abs < 5000) {
                abs = 8000;
            }
            mo18752C(m10550J(), 0, (long) (Math.abs((m10550J() * 1000) / abs) * 5), this.f6645o, new C3410j());
        }
    }

    /* renamed from: B */
    public void mo18751B() {
        C3422b.m10617a("animHeadToRefresh:");
        mo18753D(m10550J(), this.f6631a.mo18696p(), this.f6645o, new C3405e());
    }

    /* renamed from: C */
    public void mo18752C(int i, int i2, long j, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(animatorUpdateListener);
        ofInt.addListener(animatorListener);
        ofInt.setDuration(j);
        ofInt.start();
    }

    /* renamed from: D */
    public void mo18753D(int i, int i2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(animatorUpdateListener);
        ofInt.addListener(animatorListener);
        ofInt.setDuration((long) ((int) (((float) Math.abs(i - i2)) * 1.0f)));
        ofInt.start();
    }

    /* renamed from: E */
    public void mo18754E(float f, int i) {
        int i2;
        C3422b.m10617a("animOverScrollBottom：vy->" + f + ",computeTimes->" + i);
        if (!this.f6644n) {
            this.f6631a.mo18679c0();
            int abs = (int) Math.abs((f / ((float) i)) / 2.0f);
            if (abs > this.f6631a.mo18700t()) {
                abs = this.f6631a.mo18700t();
            }
            int i3 = abs;
            if (i3 <= 50) {
                i2 = 115;
            } else {
                double d = (double) i3;
                Double.isNaN(d);
                i2 = (int) ((d * 0.3d) + 100.0d);
            }
            if (this.f6634d || !this.f6631a.mo18682e()) {
                this.f6644n = true;
                mo18752C(0, i3, (long) i2, this.f6648r, new C3414m(i3, i2));
                return;
            }
            this.f6631a.mo18687g0();
        }
    }

    /* renamed from: F */
    public void mo18755F(float f, int i) {
        int i2;
        C3422b.m10617a("animOverScrollTop：vy->" + f + ",computeTimes->" + i);
        if (!this.f6642l) {
            this.f6642l = true;
            this.f6631a.mo18681d0();
            int abs = (int) Math.abs((f / ((float) i)) / 2.0f);
            if (abs > this.f6631a.mo18700t()) {
                abs = this.f6631a.mo18700t();
            }
            int i3 = abs;
            if (i3 <= 50) {
                i2 = 115;
            } else {
                double d = (double) i3;
                Double.isNaN(d);
                i2 = (int) ((d * 0.3d) + 100.0d);
            }
            mo18752C(m10550J(), i3, (long) i2, this.f6647q, new C3412l(i3, i2));
        }
    }

    /* renamed from: G */
    public void mo18756G() {
        if (this.f6631a.mo18655G() || !this.f6631a.mo18689i() || m10550J() < this.f6631a.mo18696p() - this.f6631a.mo18702v()) {
            mo18763z(false);
        } else {
            mo18751B();
        }
    }

    /* renamed from: H */
    public void mo18757H() {
        if (this.f6631a.mo18655G() || !this.f6631a.mo18686g() || m10549I() < this.f6631a.mo18693m() - this.f6631a.mo18702v()) {
            mo18760w(false);
        } else {
            mo18762y();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18758K(float r4) {
        /*
            r3 = this;
            android.view.animation.DecelerateInterpolator r0 = r3.f6632b
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r1 = r3.f6631a
            int r1 = r1.mo18698r()
            float r1 = (float) r1
            float r1 = r4 / r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = r0.getInterpolation(r1)
            float r0 = r0 * r4
            float r0 = r0 / r2
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            boolean r4 = r4.mo18655G()
            if (r4 != 0) goto L_0x0042
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            boolean r4 = r4.mo18686g()
            if (r4 != 0) goto L_0x002e
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            boolean r4 = r4.mo18651C()
            if (r4 != 0) goto L_0x002e
            goto L_0x0042
        L_0x002e:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18695o()
            int r4 = r4.getVisibility()
            if (r4 == 0) goto L_0x0059
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18695o()
            r1 = 0
            goto L_0x0056
        L_0x0042:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18695o()
            int r4 = r4.getVisibility()
            r1 = 8
            if (r4 == r1) goto L_0x0059
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18695o()
        L_0x0056:
            r4.setVisibility(r1)
        L_0x0059:
            boolean r4 = r3.f6634d
            if (r4 == 0) goto L_0x007d
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            boolean r4 = r4.mo18704x()
            if (r4 == 0) goto L_0x007d
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18695o()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r1 = r3.f6631a
            android.view.View r1 = r1.mo18695o()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r1 = r1.height
            float r1 = (float) r1
            float r1 = r1 - r0
            r4.setTranslationY(r1)
            goto L_0x00a7
        L_0x007d:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18695o()
            r1 = 0
            r4.setTranslationY(r1)
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18695o()
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            float r1 = java.lang.Math.abs(r0)
            int r1 = (int) r1
            r4.height = r1
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18695o()
            r4.requestLayout()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            float r1 = -r0
            r4.mo18666R(r1)
        L_0x00a7:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18701u()
            float r0 = -r0
            r4.setTranslationY(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lcodecore.tkrefreshlayout.p143i.C3400a.mo18758K(float):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18759L(float r4) {
        /*
            r3 = this;
            android.view.animation.DecelerateInterpolator r0 = r3.f6632b
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r1 = r3.f6631a
            float r1 = r1.mo18699s()
            float r1 = r4 / r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = r0.getInterpolation(r1)
            float r0 = r0 * r4
            float r0 = r0 / r2
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            boolean r4 = r4.mo18655G()
            if (r4 != 0) goto L_0x0041
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            boolean r4 = r4.mo18689i()
            if (r4 != 0) goto L_0x002d
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            boolean r4 = r4.mo18652D()
            if (r4 != 0) goto L_0x002d
            goto L_0x0041
        L_0x002d:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18697q()
            int r4 = r4.getVisibility()
            if (r4 == 0) goto L_0x0058
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18697q()
            r1 = 0
            goto L_0x0055
        L_0x0041:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18697q()
            int r4 = r4.getVisibility()
            r1 = 8
            if (r4 == r1) goto L_0x0058
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18697q()
        L_0x0055:
            r4.setVisibility(r1)
        L_0x0058:
            boolean r4 = r3.f6633c
            if (r4 == 0) goto L_0x007d
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            boolean r4 = r4.mo18704x()
            if (r4 == 0) goto L_0x007d
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18697q()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r1 = r3.f6631a
            android.view.View r1 = r1.mo18697q()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r1 = r1.height
            float r1 = (float) r1
            float r1 = r0 - r1
            r4.setTranslationY(r1)
            goto L_0x00a6
        L_0x007d:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18697q()
            r1 = 0
            r4.setTranslationY(r1)
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18697q()
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            float r1 = java.lang.Math.abs(r0)
            int r1 = (int) r1
            r4.height = r1
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18697q()
            r4.requestLayout()
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            r4.mo18665Q(r0)
        L_0x00a6:
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            boolean r4 = r4.mo18650B()
            if (r4 != 0) goto L_0x00bb
            com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d r4 = r3.f6631a
            android.view.View r4 = r4.mo18701u()
            r4.setTranslationY(r0)
            int r4 = (int) r0
            r3.m10553O(r4)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lcodecore.tkrefreshlayout.p143i.C3400a.mo18759L(float):void");
    }

    /* renamed from: w */
    public void mo18760w(boolean z) {
        C3422b.m10617a("animBottomBack：finishLoading?->" + z);
        if (z && this.f6634d && this.f6631a.mo18704x()) {
            this.f6631a.mo18673Y(true);
        }
        mo18753D(m10549I(), 0, new C3408h(), new C3409i(z));
    }

    /* renamed from: x */
    public void mo18761x(int i) {
        C3422b.m10617a("animBottomHideByVy：vy->" + i);
        if (!this.f6640j) {
            this.f6640j = true;
            int abs = Math.abs(i);
            if (abs < 5000) {
                abs = 8000;
            }
            mo18752C(m10549I(), 0, (long) (((m10549I() * 5) * 1000) / abs), this.f6646p, new C3411k());
        }
    }

    /* renamed from: y */
    public void mo18762y() {
        C3422b.m10617a("animBottomToLoad");
        mo18753D(m10549I(), this.f6631a.mo18693m(), this.f6646p, new C3407g());
    }

    /* renamed from: z */
    public void mo18763z(boolean z) {
        C3422b.m10617a("animHeadBack：finishRefresh?->" + z);
        if (z && this.f6633c && this.f6631a.mo18704x()) {
            this.f6631a.mo18674Z(true);
        }
        mo18753D(m10550J(), 0, this.f6645o, new C3406f(z));
    }
}
