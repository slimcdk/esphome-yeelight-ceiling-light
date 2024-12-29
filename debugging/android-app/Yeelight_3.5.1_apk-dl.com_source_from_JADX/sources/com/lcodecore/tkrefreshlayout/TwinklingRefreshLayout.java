package com.lcodecore.tkrefreshlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import p096s2.C3686a;
import p096s2.C3687b;
import p096s2.C3688c;
import p096s2.C3689d;
import p096s2.C3690e;
import p096s2.C3691f;
import p100t2.C3704a;
import p104u2.C3720a;
import p108v2.C3806a;
import p108v2.C3823c;
import p108v2.C3824d;
import p108v2.C3826e;
import p112w2.C3894a;

public class TwinklingRefreshLayout extends RelativeLayout implements C3690e, NestedScrollingChild {

    /* renamed from: q0 */
    private static String f4587q0 = "";

    /* renamed from: r0 */
    private static String f4588r0 = "";
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C2689d f4589A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final int f4590B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C3690e f4591C;

    /* renamed from: Q */
    private final NestedScrollingChildHelper f4592Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C3823c f4593R;

    /* renamed from: S */
    private C3689d f4594S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public float f4595T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public float f4596U;

    /* renamed from: V */
    private VelocityTracker f4597V;

    /* renamed from: W */
    private float f4598W;

    /* renamed from: a */
    protected float f4599a;

    /* renamed from: a0 */
    private float f4600a0;

    /* renamed from: b */
    protected float f4601b;

    /* renamed from: b0 */
    private float f4602b0;

    /* renamed from: c */
    protected float f4603c;

    /* renamed from: c0 */
    private float f4604c0;

    /* renamed from: d */
    protected float f4605d;

    /* renamed from: d0 */
    private int f4606d0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public View f4607e;

    /* renamed from: e0 */
    private int f4608e0;

    /* renamed from: f */
    protected FrameLayout f4609f;

    /* renamed from: f0 */
    private MotionEvent f4610f0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public FrameLayout f4611g;

    /* renamed from: g0 */
    private boolean f4612g0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3687b f4613h;

    /* renamed from: h0 */
    private int f4614h0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C3686a f4615i;

    /* renamed from: i0 */
    private final int[] f4616i0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f4617j;

    /* renamed from: j0 */
    private final int[] f4618j0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public FrameLayout f4619k;

    /* renamed from: k0 */
    private final int[] f4620k0;

    /* renamed from: l */
    protected boolean f4621l;

    /* renamed from: l0 */
    private int f4622l0;

    /* renamed from: m */
    protected boolean f4623m;

    /* renamed from: m0 */
    private int f4624m0;

    /* renamed from: n */
    protected boolean f4625n;

    /* renamed from: n0 */
    private int f4626n0;

    /* renamed from: o */
    protected boolean f4627o;

    /* renamed from: o0 */
    private boolean f4628o0;

    /* renamed from: p */
    protected boolean f4629p;

    /* renamed from: p0 */
    private C3691f f4630p0;

    /* renamed from: q */
    protected boolean f4631q;

    /* renamed from: r */
    protected boolean f4632r;

    /* renamed from: s */
    protected boolean f4633s;

    /* renamed from: t */
    protected boolean f4634t;

    /* renamed from: u */
    protected boolean f4635u;

    /* renamed from: v */
    protected boolean f4636v;

    /* renamed from: w */
    protected boolean f4637w;

    /* renamed from: x */
    protected boolean f4638x;

    /* renamed from: y */
    protected boolean f4639y;

    /* renamed from: z */
    protected boolean f4640z;

    /* renamed from: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$a */
    class C2686a implements C3689d {
        C2686a() {
        }

        /* renamed from: a */
        public void mo20256a(MotionEvent motionEvent, boolean z) {
            TwinklingRefreshLayout.this.f4593R.mo26294d(motionEvent, z);
        }

        public void onDown(MotionEvent motionEvent) {
            TwinklingRefreshLayout.this.f4593R.mo26297f(motionEvent);
        }

        public void onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            TwinklingRefreshLayout.this.f4593R.mo26293c(motionEvent, motionEvent2, f, f2);
        }

        public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            TwinklingRefreshLayout.this.f4593R.mo26291a(motionEvent, motionEvent2, f, f2, TwinklingRefreshLayout.this.f4595T, TwinklingRefreshLayout.this.f4596U);
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$b */
    class C2687b implements Runnable {
        C2687b() {
        }

        public void run() {
            FrameLayout frameLayout = TwinklingRefreshLayout.this.f4609f;
            if (frameLayout != null) {
                frameLayout.bringToFront();
            }
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$c */
    class C2688c implements C3688c {
        C2688c() {
        }

        /* renamed from: a */
        public void mo20261a() {
            TwinklingRefreshLayout.this.f4589A.mo20303j();
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d */
    public class C2689d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C3806a f4644a = new C3806a(this);

        /* renamed from: b */
        private int f4645b = 0;

        /* renamed from: c */
        private boolean f4646c = true;

        /* renamed from: d */
        private boolean f4647d = false;

        /* renamed from: e */
        private boolean f4648e = false;

        /* renamed from: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d$a */
        class C2690a implements Runnable {
            C2690a() {
            }

            public void run() {
                C2689d.this.mo20292c0();
                TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
                if (!twinklingRefreshLayout.f4634t && twinklingRefreshLayout.f4607e != null) {
                    C2689d.this.mo20285X(true);
                    C2689d.this.f4644a.mo26274y();
                }
            }
        }

        public C2689d() {
        }

        /* renamed from: A */
        public boolean mo20262A() {
            return TwinklingRefreshLayout.this.f4623m;
        }

        /* renamed from: B */
        public boolean mo20263B() {
            return TwinklingRefreshLayout.this.f4636v;
        }

        /* renamed from: C */
        public boolean mo20264C() {
            return TwinklingRefreshLayout.this.f4633s;
        }

        /* renamed from: D */
        public boolean mo20265D() {
            return TwinklingRefreshLayout.this.f4632r;
        }

        /* renamed from: E */
        public boolean mo20266E() {
            return this.f4648e;
        }

        /* renamed from: F */
        public boolean mo20267F() {
            return this.f4647d;
        }

        /* renamed from: G */
        public boolean mo20268G() {
            return TwinklingRefreshLayout.this.f4634t;
        }

        /* renamed from: H */
        public boolean mo20269H() {
            return TwinklingRefreshLayout.this.f4621l;
        }

        /* renamed from: I */
        public boolean mo20270I() {
            return TwinklingRefreshLayout.this.f4625n;
        }

        /* renamed from: J */
        public boolean mo20271J() {
            return 1 == this.f4645b;
        }

        /* renamed from: K */
        public boolean mo20272K() {
            return this.f4645b == 0;
        }

        /* renamed from: L */
        public void mo20273L() {
            TwinklingRefreshLayout.this.f4591C.mo20232h();
        }

        /* renamed from: M */
        public void mo20274M() {
            TwinklingRefreshLayout.this.f4591C.mo20223a(TwinklingRefreshLayout.this);
        }

        /* renamed from: N */
        public void mo20275N() {
            TwinklingRefreshLayout.this.f4591C.mo20226d();
        }

        /* renamed from: O */
        public void mo20276O(float f) {
            C3690e m = TwinklingRefreshLayout.this.f4591C;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            m.mo20230g(twinklingRefreshLayout, f / twinklingRefreshLayout.f4603c);
        }

        /* renamed from: P */
        public void mo20277P(float f) {
            C3690e m = TwinklingRefreshLayout.this.f4591C;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            m.mo20224b(twinklingRefreshLayout, f / twinklingRefreshLayout.f4617j);
        }

        /* renamed from: Q */
        public void mo20278Q(float f) {
            C3690e m = TwinklingRefreshLayout.this.f4591C;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            m.mo20225c(twinklingRefreshLayout, f / twinklingRefreshLayout.f4603c);
        }

        /* renamed from: R */
        public void mo20279R(float f) {
            C3690e m = TwinklingRefreshLayout.this.f4591C;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            m.mo20229f(twinklingRefreshLayout, f / twinklingRefreshLayout.f4617j);
        }

        /* renamed from: S */
        public void mo20280S() {
            TwinklingRefreshLayout.this.f4591C.mo20228e(TwinklingRefreshLayout.this);
        }

        /* renamed from: T */
        public void mo20281T() {
            TwinklingRefreshLayout.this.f4591C.mo20233i();
        }

        /* renamed from: U */
        public void mo20282U() {
            if (TwinklingRefreshLayout.this.f4615i != null) {
                TwinklingRefreshLayout.this.f4615i.reset();
            }
        }

        /* renamed from: V */
        public void mo20283V() {
            if (TwinklingRefreshLayout.this.f4613h != null) {
                TwinklingRefreshLayout.this.f4613h.reset();
            }
        }

        /* renamed from: W */
        public void mo20284W(boolean z) {
            TwinklingRefreshLayout.this.f4623m = z;
        }

        /* renamed from: X */
        public void mo20285X(boolean z) {
            TwinklingRefreshLayout.this.f4627o = z;
        }

        /* renamed from: Y */
        public void mo20286Y(boolean z) {
            this.f4648e = z;
        }

        /* renamed from: Z */
        public void mo20287Z(boolean z) {
            this.f4647d = z;
        }

        /* renamed from: a0 */
        public void mo20288a0(boolean z) {
            TwinklingRefreshLayout.this.f4621l = z;
        }

        /* renamed from: b */
        public boolean mo20289b() {
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            return !twinklingRefreshLayout.f4621l && !twinklingRefreshLayout.f4623m;
        }

        /* renamed from: b0 */
        public void mo20290b0(boolean z) {
            TwinklingRefreshLayout.this.f4625n = z;
        }

        /* renamed from: c */
        public boolean mo20291c() {
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            return twinklingRefreshLayout.f4631q || twinklingRefreshLayout.f4637w;
        }

        /* renamed from: c0 */
        public void mo20292c0() {
            this.f4645b = 1;
        }

        /* renamed from: d */
        public boolean mo20293d() {
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            return twinklingRefreshLayout.f4629p || twinklingRefreshLayout.f4637w;
        }

        /* renamed from: d0 */
        public void mo20294d0() {
            this.f4645b = 0;
        }

        /* renamed from: e */
        public boolean mo20295e() {
            return TwinklingRefreshLayout.this.f4635u;
        }

        /* renamed from: e0 */
        public boolean mo20296e0() {
            return TwinklingRefreshLayout.this.f4640z;
        }

        /* renamed from: f */
        public boolean mo20297f(MotionEvent motionEvent) {
            return TwinklingRefreshLayout.super.dispatchTouchEvent(motionEvent);
        }

        /* renamed from: f0 */
        public boolean mo20298f0() {
            return TwinklingRefreshLayout.this.f4639y;
        }

        /* renamed from: g */
        public boolean mo20299g() {
            return TwinklingRefreshLayout.this.f4629p;
        }

        /* renamed from: g0 */
        public void mo20300g0() {
            TwinklingRefreshLayout.this.post(new C2690a());
        }

        /* renamed from: h */
        public boolean mo20301h() {
            return TwinklingRefreshLayout.this.f4637w;
        }

        /* renamed from: i */
        public boolean mo20302i() {
            return TwinklingRefreshLayout.this.f4631q;
        }

        /* renamed from: j */
        public void mo20303j() {
            if (TwinklingRefreshLayout.this.f4607e != null) {
                this.f4644a.mo26275z(true);
            }
        }

        /* renamed from: k */
        public void mo20304k() {
            mo20273L();
        }

        /* renamed from: l */
        public C3806a mo20305l() {
            return this.f4644a;
        }

        /* renamed from: m */
        public int mo20306m() {
            return (int) TwinklingRefreshLayout.this.f4617j;
        }

        /* renamed from: n */
        public View mo20307n() {
            return TwinklingRefreshLayout.this.f4611g;
        }

        /* renamed from: o */
        public View mo20308o() {
            return TwinklingRefreshLayout.this.f4619k;
        }

        /* renamed from: p */
        public int mo20309p() {
            return (int) TwinklingRefreshLayout.this.f4603c;
        }

        /* renamed from: q */
        public View mo20310q() {
            return TwinklingRefreshLayout.this.f4609f;
        }

        /* renamed from: r */
        public int mo20311r() {
            return (int) TwinklingRefreshLayout.this.f4601b;
        }

        /* renamed from: s */
        public float mo20312s() {
            return TwinklingRefreshLayout.this.f4599a;
        }

        /* renamed from: t */
        public int mo20313t() {
            return (int) TwinklingRefreshLayout.this.f4605d;
        }

        /* renamed from: u */
        public View mo20314u() {
            return TwinklingRefreshLayout.this.f4607e;
        }

        /* renamed from: v */
        public int mo20315v() {
            return TwinklingRefreshLayout.this.f4590B;
        }

        /* renamed from: w */
        public void mo20316w() {
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            if (twinklingRefreshLayout.f4634t) {
                twinklingRefreshLayout.setOverScrollTopShow(false);
                TwinklingRefreshLayout.this.setOverScrollBottomShow(false);
                FrameLayout frameLayout = TwinklingRefreshLayout.this.f4609f;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                if (TwinklingRefreshLayout.this.f4619k != null) {
                    TwinklingRefreshLayout.this.f4619k.setVisibility(8);
                }
            }
        }

        /* renamed from: x */
        public boolean mo20317x() {
            return TwinklingRefreshLayout.this.f4638x;
        }

        /* renamed from: y */
        public boolean mo20318y() {
            return this.f4646c;
        }

        /* renamed from: z */
        public boolean mo20319z() {
            return TwinklingRefreshLayout.this.f4627o;
        }
    }

    public TwinklingRefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public TwinklingRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4621l = false;
        this.f4623m = false;
        this.f4625n = false;
        this.f4627o = false;
        this.f4629p = true;
        this.f4631q = true;
        this.f4632r = true;
        this.f4633s = true;
        this.f4634t = false;
        this.f4635u = false;
        this.f4636v = false;
        this.f4637w = true;
        this.f4638x = true;
        this.f4639y = true;
        this.f4640z = true;
        int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f4590B = scaledTouchSlop;
        this.f4591C = this;
        this.f4606d0 = ViewConfiguration.getMaximumFlingVelocity();
        this.f4608e0 = ViewConfiguration.getMinimumFlingVelocity();
        this.f4614h0 = scaledTouchSlop * scaledTouchSlop;
        this.f4616i0 = new int[2];
        this.f4618j0 = new int[2];
        this.f4620k0 = new int[2];
        this.f4622l0 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TwinklingRefreshLayout, i, 0);
        try {
            this.f4599a = (float) obtainStyledAttributes.getDimensionPixelSize(R$styleable.TwinklingRefreshLayout_tr_max_head_height, C3894a.m11093a(context, 120.0f));
            this.f4603c = (float) obtainStyledAttributes.getDimensionPixelSize(R$styleable.TwinklingRefreshLayout_tr_head_height, C3894a.m11093a(context, 80.0f));
            this.f4601b = (float) obtainStyledAttributes.getDimensionPixelSize(R$styleable.TwinklingRefreshLayout_tr_max_bottom_height, C3894a.m11093a(context, 120.0f));
            this.f4617j = (float) obtainStyledAttributes.getDimensionPixelSize(R$styleable.TwinklingRefreshLayout_tr_bottom_height, C3894a.m11093a(context, 60.0f));
            this.f4605d = (float) obtainStyledAttributes.getDimensionPixelSize(R$styleable.TwinklingRefreshLayout_tr_overscroll_height, (int) this.f4603c);
            this.f4631q = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_enable_refresh, true);
            this.f4629p = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_enable_loadmore, true);
            this.f4634t = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_pureScrollMode_on, false);
            this.f4632r = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_overscroll_top_show, true);
            this.f4633s = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_overscroll_bottom_show, true);
            this.f4637w = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_enable_overscroll, true);
            this.f4636v = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_floatRefresh, false);
            this.f4635u = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_autoLoadMore, false);
            this.f4638x = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_enable_keepIView, true);
            this.f4639y = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_showRefreshingWhenOverScroll, true);
            this.f4640z = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_showLoadingWhenOverScroll, true);
            obtainStyledAttributes.recycle();
            this.f4589A = new C2689d();
            m7415x();
            m7414w();
            setFloatRefresh(this.f4636v);
            setAutoLoadMore(this.f4635u);
            setEnableRefresh(this.f4631q);
            setEnableLoadmore(this.f4629p);
            this.f4592Q = new NestedScrollingChildHelper(this);
            setNestedScrollingEnabled(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: B */
    private void m7400B() {
        this.f4594S = new C2686a();
    }

    public static void setDefaultFooter(String str) {
        f4588r0 = str;
    }

    public static void setDefaultHeader(String str) {
        f4587q0 = str;
    }

    /* renamed from: w */
    private void m7414w() {
        C3704a aVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 0);
        layoutParams.addRule(12);
        frameLayout.setLayoutParams(layoutParams);
        this.f4619k = frameLayout;
        addView(frameLayout);
        if (this.f4615i != null) {
            return;
        }
        if (!TextUtils.isEmpty(f4588r0)) {
            try {
                setBottomView((C3686a) Class.forName(f4588r0).getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{getContext()}));
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("setDefaultFooter classname=");
                sb.append(e.getMessage());
                aVar = new C3704a(getContext());
            }
        } else {
            aVar = new C3704a(getContext());
            setBottomView(aVar);
        }
    }

    /* renamed from: x */
    private void m7415x() {
        C3720a aVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 0);
        layoutParams.addRule(10);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(R$id.ex_header);
        addView(frameLayout2, new RelativeLayout.LayoutParams(-1, -2));
        addView(frameLayout, layoutParams);
        this.f4611g = frameLayout2;
        this.f4609f = frameLayout;
        if (this.f4613h != null) {
            return;
        }
        if (!TextUtils.isEmpty(f4587q0)) {
            try {
                setHeaderView((C3687b) Class.forName(f4587q0).getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{getContext()}));
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("setDefaultHeader classname=");
                sb.append(e.getMessage());
                aVar = new C3720a(getContext());
            }
        } else {
            aVar = new C3720a(getContext());
            setHeaderView(aVar);
        }
    }

    /* renamed from: y */
    private void m7416y(MotionEvent motionEvent, C3689d dVar) {
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        if (this.f4597V == null) {
            this.f4597V = VelocityTracker.obtain();
        }
        this.f4597V.addMovement(motionEvent);
        int i = action & 255;
        boolean z = true;
        boolean z2 = i == 6;
        int actionIndex = z2 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (actionIndex != i2) {
                f += motionEvent.getX(i2);
                f2 += motionEvent.getY(i2);
            }
        }
        float f3 = (float) (z2 ? pointerCount - 1 : pointerCount);
        float f4 = f / f3;
        float f5 = f2 / f3;
        if (i != 0) {
            if (i == 1) {
                int pointerId = motionEvent.getPointerId(0);
                this.f4597V.computeCurrentVelocity(1000, (float) this.f4606d0);
                this.f4596U = this.f4597V.getYVelocity(pointerId);
                this.f4595T = this.f4597V.getXVelocity(pointerId);
                if (Math.abs(this.f4596U) > ((float) this.f4608e0) || Math.abs(this.f4595T) > ((float) this.f4608e0)) {
                    dVar.onFling(this.f4610f0, motionEvent, this.f4595T, this.f4596U);
                } else {
                    z = false;
                }
                dVar.mo20256a(motionEvent, z);
                velocityTracker = this.f4597V;
                if (velocityTracker == null) {
                    return;
                }
            } else if (i == 2) {
                float f6 = this.f4598W - f4;
                float f7 = this.f4600a0 - f5;
                if (this.f4612g0) {
                    int i3 = (int) (f4 - this.f4602b0);
                    int i4 = (int) (f5 - this.f4604c0);
                    if ((i3 * i3) + (i4 * i4) > this.f4614h0) {
                        dVar.onScroll(this.f4610f0, motionEvent, f6, f7);
                        this.f4598W = f4;
                        this.f4600a0 = f5;
                        this.f4612g0 = false;
                        return;
                    }
                    return;
                } else if (Math.abs(f6) >= 1.0f || Math.abs(f7) >= 1.0f) {
                    dVar.onScroll(this.f4610f0, motionEvent, f6, f7);
                    this.f4598W = f4;
                    this.f4600a0 = f5;
                    return;
                } else {
                    return;
                }
            } else if (i == 3) {
                this.f4612g0 = false;
                velocityTracker = this.f4597V;
                if (velocityTracker == null) {
                    return;
                }
            } else if (i == 5) {
                this.f4598W = f4;
                this.f4602b0 = f4;
                this.f4600a0 = f5;
                this.f4604c0 = f5;
                return;
            } else if (i == 6) {
                this.f4598W = f4;
                this.f4602b0 = f4;
                this.f4600a0 = f5;
                this.f4604c0 = f5;
                this.f4597V.computeCurrentVelocity(1000, (float) this.f4606d0);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity = this.f4597V.getXVelocity(pointerId2);
                float yVelocity = this.f4597V.getYVelocity(pointerId2);
                for (int i5 = 0; i5 < pointerCount; i5++) {
                    if (i5 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i5);
                        if ((this.f4597V.getXVelocity(pointerId3) * xVelocity) + (this.f4597V.getYVelocity(pointerId3) * yVelocity) < 0.0f) {
                            this.f4597V.clear();
                            return;
                        }
                    }
                }
                return;
            } else {
                return;
            }
            velocityTracker.recycle();
            this.f4597V = null;
            return;
        }
        this.f4598W = f4;
        this.f4602b0 = f4;
        this.f4600a0 = f5;
        this.f4604c0 = f5;
        MotionEvent motionEvent2 = this.f4610f0;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f4610f0 = MotionEvent.obtain(motionEvent);
        this.f4612g0 = true;
        dVar.onDown(motionEvent);
    }

    /* renamed from: z */
    private boolean m7417z(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (actionMasked == 0) {
            int[] iArr = this.f4620k0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.f4620k0;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f4622l0);
                    if (findPointerIndex < 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error processing scroll; pointer index for id ");
                        sb.append(this.f4622l0);
                        sb.append(" not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int x = this.f4624m0 - ((int) motionEvent.getX(findPointerIndex));
                    int i = this.f4626n0 - y;
                    if (dispatchNestedPreScroll(x, i, this.f4618j0, this.f4616i0)) {
                        int[] iArr3 = this.f4618j0;
                        int i2 = iArr3[0];
                        i -= iArr3[1];
                        int[] iArr4 = this.f4616i0;
                        obtain.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                        int[] iArr5 = this.f4620k0;
                        int i3 = iArr5[0];
                        int[] iArr6 = this.f4616i0;
                        iArr5[0] = i3 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                    }
                    if (!this.f4628o0 && Math.abs(i) > this.f4590B) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f4628o0 = true;
                        int i4 = this.f4590B;
                        i = i > 0 ? i - i4 : i + i4;
                    }
                    if (this.f4628o0) {
                        int[] iArr7 = this.f4616i0;
                        this.f4626n0 = y - iArr7[1];
                        if (dispatchNestedScroll(0, 0, 0, i + 0, iArr7)) {
                            int i5 = this.f4624m0;
                            int[] iArr8 = this.f4616i0;
                            this.f4624m0 = i5 - iArr8[0];
                            this.f4626n0 -= iArr8[1];
                            obtain.offsetLocation((float) iArr8[0], (float) iArr8[1]);
                            int[] iArr9 = this.f4620k0;
                            int i6 = iArr9[0];
                            int[] iArr10 = this.f4616i0;
                            iArr9[0] = i6 + iArr10[0];
                            iArr9[1] = iArr9[1] + iArr10[1];
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        this.f4622l0 = motionEvent.getPointerId(actionIndex);
                        this.f4624m0 = (int) motionEvent.getX(actionIndex);
                        this.f4626n0 = (int) motionEvent.getY(actionIndex);
                    }
                }
            }
            stopNestedScroll();
            this.f4628o0 = false;
            this.f4622l0 = -1;
        } else {
            this.f4622l0 = motionEvent.getPointerId(0);
            this.f4624m0 = (int) motionEvent.getX();
            this.f4626n0 = (int) motionEvent.getY();
            startNestedScroll(2);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: A */
    public void mo20222A() {
        this.f4589A.mo20304k();
    }

    /* renamed from: a */
    public void mo20223a(TwinklingRefreshLayout twinklingRefreshLayout) {
        this.f4615i.mo26093a(this.f4601b, this.f4617j);
        C3691f fVar = this.f4630p0;
        if (fVar != null) {
            fVar.mo20223a(twinklingRefreshLayout);
        }
    }

    /* renamed from: b */
    public void mo20224b(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        C3691f fVar;
        this.f4615i.mo26094b(f, this.f4601b, this.f4617j);
        if (this.f4629p && (fVar = this.f4630p0) != null) {
            fVar.mo20224b(twinklingRefreshLayout, f);
        }
    }

    /* renamed from: c */
    public void mo20225c(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        C3691f fVar;
        this.f4613h.mo26101d(f, this.f4599a, this.f4603c);
        if (this.f4631q && (fVar = this.f4630p0) != null) {
            fVar.mo20225c(twinklingRefreshLayout, f);
        }
    }

    /* renamed from: d */
    public void mo20226d() {
        C3691f fVar = this.f4630p0;
        if (fVar != null) {
            fVar.mo20226d();
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f4592Q.dispatchNestedFling(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f4592Q.dispatchNestedPreFling(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f4592Q.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f4592Q.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = this.f4593R.dispatchTouchEvent(motionEvent);
        m7416y(motionEvent, this.f4594S);
        m7417z(motionEvent);
        return dispatchTouchEvent;
    }

    /* renamed from: e */
    public void mo20228e(TwinklingRefreshLayout twinklingRefreshLayout) {
        this.f4613h.mo26098a(this.f4599a, this.f4603c);
        C3691f fVar = this.f4630p0;
        if (fVar != null) {
            fVar.mo20228e(twinklingRefreshLayout);
        }
    }

    /* renamed from: f */
    public void mo20229f(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        C3691f fVar;
        this.f4615i.mo26095c(f, this.f4599a, this.f4603c);
        if (this.f4629p && (fVar = this.f4630p0) != null) {
            fVar.mo20229f(twinklingRefreshLayout, f);
        }
    }

    /* renamed from: g */
    public void mo20230g(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        C3691f fVar;
        this.f4613h.mo26099b(f, this.f4599a, this.f4603c);
        if (this.f4631q && (fVar = this.f4630p0) != null) {
            fVar.mo20230g(twinklingRefreshLayout, f);
        }
    }

    public View getExtraHeaderView() {
        return this.f4611g;
    }

    /* renamed from: h */
    public void mo20232h() {
        C3691f fVar = this.f4630p0;
        if (fVar != null) {
            fVar.mo20232h();
        }
        if (this.f4589A.mo20317x() || this.f4589A.mo20270I()) {
            this.f4613h.mo26100c(new C2688c());
        }
    }

    public boolean hasNestedScrollingParent() {
        return this.f4592Q.hasNestedScrollingParent();
    }

    /* renamed from: i */
    public void mo20233i() {
        C3691f fVar = this.f4630p0;
        if (fVar != null) {
            fVar.mo20233i();
        }
    }

    public boolean isNestedScrollingEnabled() {
        return this.f4592Q.isNestedScrollingEnabled();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f4607e = getChildAt(3);
        this.f4589A.mo20316w();
        C2689d dVar = this.f4589A;
        this.f4593R = new C3824d(dVar, new C3826e(dVar));
        m7400B();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4593R.mo26292b(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f4593R.mo26296e(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void setAutoLoadMore(boolean z) {
        this.f4635u = z;
        if (z) {
            setEnableLoadmore(true);
        }
    }

    public void setBottomHeight(float f) {
        this.f4617j = (float) C3894a.m11093a(getContext(), f);
    }

    public void setBottomView(C3686a aVar) {
        if (aVar != null) {
            this.f4619k.removeAllViewsInLayout();
            this.f4619k.addView(aVar.getView());
            this.f4615i = aVar;
        }
    }

    public void setDecorator(C3823c cVar) {
        if (cVar != null) {
            this.f4593R = cVar;
        }
    }

    public void setEnableKeepIView(boolean z) {
        this.f4638x = z;
    }

    public void setEnableLoadmore(boolean z) {
        View view;
        int i;
        this.f4629p = z;
        C3686a aVar = this.f4615i;
        if (aVar != null) {
            if (z) {
                view = aVar.getView();
                i = 0;
            } else {
                view = aVar.getView();
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setEnableOverScroll(boolean z) {
        this.f4637w = z;
    }

    public void setEnableRefresh(boolean z) {
        View view;
        int i;
        this.f4631q = z;
        C3687b bVar = this.f4613h;
        if (bVar != null) {
            if (z) {
                view = bVar.getView();
                i = 0;
            } else {
                view = bVar.getView();
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setFloatRefresh(boolean z) {
        this.f4636v = z;
        if (z) {
            post(new C2687b());
        }
    }

    public void setHeaderHeight(float f) {
        this.f4603c = (float) C3894a.m11093a(getContext(), f);
    }

    public void setHeaderView(C3687b bVar) {
        if (bVar != null) {
            this.f4609f.removeAllViewsInLayout();
            this.f4609f.addView(bVar.getView());
            this.f4613h = bVar;
        }
    }

    public void setMaxBottomHeight(float f) {
        this.f4601b = (float) C3894a.m11093a(getContext(), f);
    }

    public void setMaxHeadHeight(float f) {
        this.f4599a = (float) C3894a.m11093a(getContext(), f);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f4592Q.setNestedScrollingEnabled(z);
    }

    public void setOnRefreshListener(C3691f fVar) {
        if (fVar != null) {
            this.f4630p0 = fVar;
        }
    }

    public void setOverScrollBottomShow(boolean z) {
        this.f4633s = z;
    }

    public void setOverScrollHeight(float f) {
        this.f4605d = (float) C3894a.m11093a(getContext(), f);
    }

    public void setOverScrollRefreshShow(boolean z) {
        this.f4632r = z;
        this.f4633s = z;
    }

    public void setOverScrollTopShow(boolean z) {
        this.f4632r = z;
    }

    public void setTargetView(View view) {
        if (view != null) {
            this.f4607e = view;
        }
    }

    public boolean startNestedScroll(int i) {
        return this.f4592Q.startNestedScroll(i);
    }

    public void stopNestedScroll() {
        this.f4592Q.stopNestedScroll();
    }
}
