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
import com.lcodecore.tkrefreshlayout.p141g.C3393a;
import com.lcodecore.tkrefreshlayout.p142h.C3395a;
import com.lcodecore.tkrefreshlayout.p143i.C3400a;
import com.lcodecore.tkrefreshlayout.p143i.C3417c;
import com.lcodecore.tkrefreshlayout.p143i.C3418d;
import com.lcodecore.tkrefreshlayout.p143i.C3420e;
import com.lcodecore.tkrefreshlayout.p144j.C3421a;

public class TwinklingRefreshLayout extends RelativeLayout implements C3391e, NestedScrollingChild {

    /* renamed from: h0 */
    private static String f6525h0 = "";

    /* renamed from: i0 */
    private static String f6526i0 = "";
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C3385d f6527A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final int f6528B;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C3391e f6529G;

    /* renamed from: H */
    private final NestedScrollingChildHelper f6530H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C3417c f6531I;

    /* renamed from: J */
    private C3390d f6532J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public float f6533K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public float f6534L;

    /* renamed from: M */
    private VelocityTracker f6535M;

    /* renamed from: N */
    private float f6536N;

    /* renamed from: O */
    private float f6537O;

    /* renamed from: P */
    private float f6538P;

    /* renamed from: Q */
    private float f6539Q;

    /* renamed from: R */
    private int f6540R;

    /* renamed from: S */
    private int f6541S;

    /* renamed from: T */
    private MotionEvent f6542T;

    /* renamed from: U */
    private boolean f6543U;

    /* renamed from: V */
    private int f6544V;

    /* renamed from: W */
    private final int[] f6545W;

    /* renamed from: a */
    protected float f6546a;

    /* renamed from: a0 */
    private final int[] f6547a0;

    /* renamed from: b */
    protected float f6548b;

    /* renamed from: b0 */
    private final int[] f6549b0;

    /* renamed from: c */
    protected float f6550c;

    /* renamed from: c0 */
    private int f6551c0;

    /* renamed from: d */
    protected float f6552d;

    /* renamed from: d0 */
    private int f6553d0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public View f6554e;

    /* renamed from: e0 */
    private int f6555e0;

    /* renamed from: f */
    protected FrameLayout f6556f;

    /* renamed from: f0 */
    private boolean f6557f0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public FrameLayout f6558g;

    /* renamed from: g0 */
    private C3392f f6559g0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3388b f6560h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C3387a f6561i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f6562j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public FrameLayout f6563k;

    /* renamed from: l */
    protected boolean f6564l;

    /* renamed from: m */
    protected boolean f6565m;

    /* renamed from: n */
    protected boolean f6566n;

    /* renamed from: o */
    protected boolean f6567o;

    /* renamed from: p */
    protected boolean f6568p;

    /* renamed from: q */
    protected boolean f6569q;

    /* renamed from: r */
    protected boolean f6570r;

    /* renamed from: s */
    protected boolean f6571s;

    /* renamed from: t */
    protected boolean f6572t;

    /* renamed from: u */
    protected boolean f6573u;

    /* renamed from: v */
    protected boolean f6574v;

    /* renamed from: w */
    protected boolean f6575w;

    /* renamed from: x */
    protected boolean f6576x;

    /* renamed from: y */
    protected boolean f6577y;

    /* renamed from: z */
    protected boolean f6578z;

    /* renamed from: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$a */
    class C3382a implements C3390d {
        C3382a() {
        }

        /* renamed from: a */
        public void mo18643a(MotionEvent motionEvent, boolean z) {
            TwinklingRefreshLayout.this.f6531I.mo18782d(motionEvent, z);
        }

        public void onDown(MotionEvent motionEvent) {
            TwinklingRefreshLayout.this.f6531I.mo18785f(motionEvent);
        }

        public void onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            TwinklingRefreshLayout.this.f6531I.mo18781c(motionEvent, motionEvent2, f, f2);
        }

        public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            TwinklingRefreshLayout.this.f6531I.mo18779a(motionEvent, motionEvent2, f, f2, TwinklingRefreshLayout.this.f6533K, TwinklingRefreshLayout.this.f6534L);
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$b */
    class C3383b implements Runnable {
        C3383b() {
        }

        public void run() {
            FrameLayout frameLayout = TwinklingRefreshLayout.this.f6556f;
            if (frameLayout != null) {
                frameLayout.bringToFront();
            }
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$c */
    class C3384c implements C3389c {
        C3384c() {
        }

        /* renamed from: a */
        public void mo18648a() {
            TwinklingRefreshLayout.this.f6527A.mo18690j();
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d */
    public class C3385d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C3400a f6582a = new C3400a(this);

        /* renamed from: b */
        private int f6583b = 0;

        /* renamed from: c */
        private boolean f6584c = true;

        /* renamed from: d */
        private boolean f6585d = false;

        /* renamed from: e */
        private boolean f6586e = false;

        /* renamed from: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$d$a */
        class C3386a implements Runnable {
            C3386a() {
            }

            public void run() {
                C3385d.this.mo18679c0();
                TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
                if (!twinklingRefreshLayout.f6572t && twinklingRefreshLayout.f6554e != null) {
                    C3385d.this.mo18672X(true);
                    C3385d.this.f6582a.mo18762y();
                }
            }
        }

        public C3385d() {
        }

        /* renamed from: A */
        public boolean mo18649A() {
            return TwinklingRefreshLayout.this.f6565m;
        }

        /* renamed from: B */
        public boolean mo18650B() {
            return TwinklingRefreshLayout.this.f6574v;
        }

        /* renamed from: C */
        public boolean mo18651C() {
            return TwinklingRefreshLayout.this.f6571s;
        }

        /* renamed from: D */
        public boolean mo18652D() {
            return TwinklingRefreshLayout.this.f6570r;
        }

        /* renamed from: E */
        public boolean mo18653E() {
            return this.f6586e;
        }

        /* renamed from: F */
        public boolean mo18654F() {
            return this.f6585d;
        }

        /* renamed from: G */
        public boolean mo18655G() {
            return TwinklingRefreshLayout.this.f6572t;
        }

        /* renamed from: H */
        public boolean mo18656H() {
            return TwinklingRefreshLayout.this.f6564l;
        }

        /* renamed from: I */
        public boolean mo18657I() {
            return TwinklingRefreshLayout.this.f6566n;
        }

        /* renamed from: J */
        public boolean mo18658J() {
            return 1 == this.f6583b;
        }

        /* renamed from: K */
        public boolean mo18659K() {
            return this.f6583b == 0;
        }

        /* renamed from: L */
        public void mo18660L() {
            TwinklingRefreshLayout.this.f6529G.mo18619h();
        }

        /* renamed from: M */
        public void mo18661M() {
            TwinklingRefreshLayout.this.f6529G.mo18610a(TwinklingRefreshLayout.this);
        }

        /* renamed from: N */
        public void mo18662N() {
            TwinklingRefreshLayout.this.f6529G.mo18613d();
        }

        /* renamed from: O */
        public void mo18663O(float f) {
            C3391e m = TwinklingRefreshLayout.this.f6529G;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            m.mo18617g(twinklingRefreshLayout, f / twinklingRefreshLayout.f6550c);
        }

        /* renamed from: P */
        public void mo18664P(float f) {
            C3391e m = TwinklingRefreshLayout.this.f6529G;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            m.mo18611b(twinklingRefreshLayout, f / twinklingRefreshLayout.f6562j);
        }

        /* renamed from: Q */
        public void mo18665Q(float f) {
            C3391e m = TwinklingRefreshLayout.this.f6529G;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            m.mo18612c(twinklingRefreshLayout, f / twinklingRefreshLayout.f6550c);
        }

        /* renamed from: R */
        public void mo18666R(float f) {
            C3391e m = TwinklingRefreshLayout.this.f6529G;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            m.mo18616f(twinklingRefreshLayout, f / twinklingRefreshLayout.f6562j);
        }

        /* renamed from: S */
        public void mo18667S() {
            TwinklingRefreshLayout.this.f6529G.mo18615e(TwinklingRefreshLayout.this);
        }

        /* renamed from: T */
        public void mo18668T() {
            TwinklingRefreshLayout.this.f6529G.mo18620i();
        }

        /* renamed from: U */
        public void mo18669U() {
            if (TwinklingRefreshLayout.this.f6561i != null) {
                TwinklingRefreshLayout.this.f6561i.reset();
            }
        }

        /* renamed from: V */
        public void mo18670V() {
            if (TwinklingRefreshLayout.this.f6560h != null) {
                TwinklingRefreshLayout.this.f6560h.reset();
            }
        }

        /* renamed from: W */
        public void mo18671W(boolean z) {
            TwinklingRefreshLayout.this.f6565m = z;
        }

        /* renamed from: X */
        public void mo18672X(boolean z) {
            TwinklingRefreshLayout.this.f6567o = z;
        }

        /* renamed from: Y */
        public void mo18673Y(boolean z) {
            this.f6586e = z;
        }

        /* renamed from: Z */
        public void mo18674Z(boolean z) {
            this.f6585d = z;
        }

        /* renamed from: a0 */
        public void mo18675a0(boolean z) {
            TwinklingRefreshLayout.this.f6564l = z;
        }

        /* renamed from: b */
        public boolean mo18676b() {
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            return !twinklingRefreshLayout.f6564l && !twinklingRefreshLayout.f6565m;
        }

        /* renamed from: b0 */
        public void mo18677b0(boolean z) {
            TwinklingRefreshLayout.this.f6566n = z;
        }

        /* renamed from: c */
        public boolean mo18678c() {
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            return twinklingRefreshLayout.f6569q || twinklingRefreshLayout.f6575w;
        }

        /* renamed from: c0 */
        public void mo18679c0() {
            this.f6583b = 1;
        }

        /* renamed from: d */
        public boolean mo18680d() {
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            return twinklingRefreshLayout.f6568p || twinklingRefreshLayout.f6575w;
        }

        /* renamed from: d0 */
        public void mo18681d0() {
            this.f6583b = 0;
        }

        /* renamed from: e */
        public boolean mo18682e() {
            return TwinklingRefreshLayout.this.f6573u;
        }

        /* renamed from: e0 */
        public boolean mo18683e0() {
            return TwinklingRefreshLayout.this.f6578z;
        }

        /* renamed from: f */
        public boolean mo18684f(MotionEvent motionEvent) {
            return TwinklingRefreshLayout.super.dispatchTouchEvent(motionEvent);
        }

        /* renamed from: f0 */
        public boolean mo18685f0() {
            return TwinklingRefreshLayout.this.f6577y;
        }

        /* renamed from: g */
        public boolean mo18686g() {
            return TwinklingRefreshLayout.this.f6568p;
        }

        /* renamed from: g0 */
        public void mo18687g0() {
            TwinklingRefreshLayout.this.post(new C3386a());
        }

        /* renamed from: h */
        public boolean mo18688h() {
            return TwinklingRefreshLayout.this.f6575w;
        }

        /* renamed from: i */
        public boolean mo18689i() {
            return TwinklingRefreshLayout.this.f6569q;
        }

        /* renamed from: j */
        public void mo18690j() {
            if (TwinklingRefreshLayout.this.f6554e != null) {
                this.f6582a.mo18763z(true);
            }
        }

        /* renamed from: k */
        public void mo18691k() {
            mo18660L();
        }

        /* renamed from: l */
        public C3400a mo18692l() {
            return this.f6582a;
        }

        /* renamed from: m */
        public int mo18693m() {
            return (int) TwinklingRefreshLayout.this.f6562j;
        }

        /* renamed from: n */
        public View mo18694n() {
            return TwinklingRefreshLayout.this.f6558g;
        }

        /* renamed from: o */
        public View mo18695o() {
            return TwinklingRefreshLayout.this.f6563k;
        }

        /* renamed from: p */
        public int mo18696p() {
            return (int) TwinklingRefreshLayout.this.f6550c;
        }

        /* renamed from: q */
        public View mo18697q() {
            return TwinklingRefreshLayout.this.f6556f;
        }

        /* renamed from: r */
        public int mo18698r() {
            return (int) TwinklingRefreshLayout.this.f6548b;
        }

        /* renamed from: s */
        public float mo18699s() {
            return TwinklingRefreshLayout.this.f6546a;
        }

        /* renamed from: t */
        public int mo18700t() {
            return (int) TwinklingRefreshLayout.this.f6552d;
        }

        /* renamed from: u */
        public View mo18701u() {
            return TwinklingRefreshLayout.this.f6554e;
        }

        /* renamed from: v */
        public int mo18702v() {
            return TwinklingRefreshLayout.this.f6528B;
        }

        /* renamed from: w */
        public void mo18703w() {
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            if (twinklingRefreshLayout.f6572t) {
                twinklingRefreshLayout.setOverScrollTopShow(false);
                TwinklingRefreshLayout.this.setOverScrollBottomShow(false);
                FrameLayout frameLayout = TwinklingRefreshLayout.this.f6556f;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                if (TwinklingRefreshLayout.this.f6563k != null) {
                    TwinklingRefreshLayout.this.f6563k.setVisibility(8);
                }
            }
        }

        /* renamed from: x */
        public boolean mo18704x() {
            return TwinklingRefreshLayout.this.f6576x;
        }

        /* renamed from: y */
        public boolean mo18705y() {
            return this.f6584c;
        }

        /* renamed from: z */
        public boolean mo18706z() {
            return TwinklingRefreshLayout.this.f6567o;
        }
    }

    public TwinklingRefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public TwinklingRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6564l = false;
        this.f6565m = false;
        this.f6566n = false;
        this.f6567o = false;
        this.f6568p = true;
        this.f6569q = true;
        this.f6570r = true;
        this.f6571s = true;
        this.f6572t = false;
        this.f6573u = false;
        this.f6574v = false;
        this.f6575w = true;
        this.f6576x = true;
        this.f6577y = true;
        this.f6578z = true;
        this.f6528B = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f6529G = this;
        this.f6540R = ViewConfiguration.getMaximumFlingVelocity();
        this.f6541S = ViewConfiguration.getMinimumFlingVelocity();
        int i2 = this.f6528B;
        this.f6544V = i2 * i2;
        this.f6545W = new int[2];
        this.f6547a0 = new int[2];
        this.f6549b0 = new int[2];
        this.f6551c0 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TwinklingRefreshLayout, i, 0);
        try {
            this.f6546a = (float) obtainStyledAttributes.getDimensionPixelSize(R$styleable.TwinklingRefreshLayout_tr_max_head_height, C3421a.m10616a(context, 120.0f));
            this.f6550c = (float) obtainStyledAttributes.getDimensionPixelSize(R$styleable.TwinklingRefreshLayout_tr_head_height, C3421a.m10616a(context, 80.0f));
            this.f6548b = (float) obtainStyledAttributes.getDimensionPixelSize(R$styleable.TwinklingRefreshLayout_tr_max_bottom_height, C3421a.m10616a(context, 120.0f));
            this.f6562j = (float) obtainStyledAttributes.getDimensionPixelSize(R$styleable.TwinklingRefreshLayout_tr_bottom_height, C3421a.m10616a(context, 60.0f));
            this.f6552d = (float) obtainStyledAttributes.getDimensionPixelSize(R$styleable.TwinklingRefreshLayout_tr_overscroll_height, (int) this.f6550c);
            this.f6569q = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_enable_refresh, true);
            this.f6568p = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_enable_loadmore, true);
            this.f6572t = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_pureScrollMode_on, false);
            this.f6570r = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_overscroll_top_show, true);
            this.f6571s = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_overscroll_bottom_show, true);
            this.f6575w = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_enable_overscroll, true);
            this.f6574v = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_floatRefresh, false);
            this.f6573u = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_autoLoadMore, false);
            this.f6576x = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_enable_keepIView, true);
            this.f6577y = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_showRefreshingWhenOverScroll, true);
            this.f6578z = obtainStyledAttributes.getBoolean(R$styleable.TwinklingRefreshLayout_tr_showLoadingWhenOverScroll, true);
            obtainStyledAttributes.recycle();
            this.f6527A = new C3385d();
            m10430x();
            m10429w();
            setFloatRefresh(this.f6574v);
            setAutoLoadMore(this.f6573u);
            setEnableRefresh(this.f6569q);
            setEnableLoadmore(this.f6568p);
            this.f6530H = new NestedScrollingChildHelper(this);
            setNestedScrollingEnabled(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: B */
    private void m10415B() {
        this.f6532J = new C3382a();
    }

    public static void setDefaultFooter(String str) {
        f6526i0 = str;
    }

    public static void setDefaultHeader(String str) {
        f6525h0 = str;
    }

    /* renamed from: w */
    private void m10429w() {
        C3393a aVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 0);
        layoutParams.addRule(12);
        frameLayout.setLayoutParams(layoutParams);
        this.f6563k = frameLayout;
        addView(frameLayout);
        if (this.f6561i != null) {
            return;
        }
        if (!TextUtils.isEmpty(f6526i0)) {
            try {
                setBottomView((C3387a) Class.forName(f6526i0).getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{getContext()}));
            } catch (Exception e) {
                "setDefaultFooter classname=" + e.getMessage();
                aVar = new C3393a(getContext());
            }
        } else {
            aVar = new C3393a(getContext());
            setBottomView(aVar);
        }
    }

    /* renamed from: x */
    private void m10430x() {
        C3395a aVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 0);
        layoutParams.addRule(10);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(R$id.ex_header);
        addView(frameLayout2, new RelativeLayout.LayoutParams(-1, -2));
        addView(frameLayout, layoutParams);
        this.f6558g = frameLayout2;
        this.f6556f = frameLayout;
        if (this.f6560h != null) {
            return;
        }
        if (!TextUtils.isEmpty(f6525h0)) {
            try {
                setHeaderView((C3388b) Class.forName(f6525h0).getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{getContext()}));
            } catch (Exception e) {
                "setDefaultHeader classname=" + e.getMessage();
                aVar = new C3395a(getContext());
            }
        } else {
            aVar = new C3395a(getContext());
            setHeaderView(aVar);
        }
    }

    /* renamed from: y */
    private void m10431y(MotionEvent motionEvent, C3390d dVar) {
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        if (this.f6535M == null) {
            this.f6535M = VelocityTracker.obtain();
        }
        this.f6535M.addMovement(motionEvent);
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
                this.f6535M.computeCurrentVelocity(1000, (float) this.f6540R);
                this.f6534L = this.f6535M.getYVelocity(pointerId);
                this.f6533K = this.f6535M.getXVelocity(pointerId);
                if (Math.abs(this.f6534L) > ((float) this.f6541S) || Math.abs(this.f6533K) > ((float) this.f6541S)) {
                    dVar.onFling(this.f6542T, motionEvent, this.f6533K, this.f6534L);
                } else {
                    z = false;
                }
                dVar.mo18643a(motionEvent, z);
                velocityTracker = this.f6535M;
                if (velocityTracker == null) {
                    return;
                }
            } else if (i == 2) {
                float f6 = this.f6536N - f4;
                float f7 = this.f6537O - f5;
                if (this.f6543U) {
                    int i3 = (int) (f4 - this.f6538P);
                    int i4 = (int) (f5 - this.f6539Q);
                    if ((i3 * i3) + (i4 * i4) > this.f6544V) {
                        dVar.onScroll(this.f6542T, motionEvent, f6, f7);
                        this.f6536N = f4;
                        this.f6537O = f5;
                        this.f6543U = false;
                        return;
                    }
                    return;
                } else if (Math.abs(f6) >= 1.0f || Math.abs(f7) >= 1.0f) {
                    dVar.onScroll(this.f6542T, motionEvent, f6, f7);
                    this.f6536N = f4;
                    this.f6537O = f5;
                    return;
                } else {
                    return;
                }
            } else if (i == 3) {
                this.f6543U = false;
                velocityTracker = this.f6535M;
                if (velocityTracker == null) {
                    return;
                }
            } else if (i == 5) {
                this.f6536N = f4;
                this.f6538P = f4;
                this.f6537O = f5;
                this.f6539Q = f5;
                return;
            } else if (i == 6) {
                this.f6536N = f4;
                this.f6538P = f4;
                this.f6537O = f5;
                this.f6539Q = f5;
                this.f6535M.computeCurrentVelocity(1000, (float) this.f6540R);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity = this.f6535M.getXVelocity(pointerId2);
                float yVelocity = this.f6535M.getYVelocity(pointerId2);
                for (int i5 = 0; i5 < pointerCount; i5++) {
                    if (i5 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i5);
                        if ((this.f6535M.getXVelocity(pointerId3) * xVelocity) + (this.f6535M.getYVelocity(pointerId3) * yVelocity) < 0.0f) {
                            this.f6535M.clear();
                            return;
                        }
                    }
                }
                return;
            } else {
                return;
            }
            velocityTracker.recycle();
            this.f6535M = null;
            return;
        }
        this.f6536N = f4;
        this.f6538P = f4;
        this.f6537O = f5;
        this.f6539Q = f5;
        MotionEvent motionEvent2 = this.f6542T;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f6542T = MotionEvent.obtain(motionEvent);
        this.f6543U = true;
        dVar.onDown(motionEvent);
    }

    /* renamed from: z */
    private boolean m10432z(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (actionMasked == 0) {
            int[] iArr = this.f6549b0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.f6549b0;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f6551c0);
                    if (findPointerIndex < 0) {
                        "Error processing scroll; pointer index for id " + this.f6551c0 + " not found. Did any MotionEvents get skipped?";
                        return false;
                    }
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int x = this.f6553d0 - ((int) motionEvent.getX(findPointerIndex));
                    int i = this.f6555e0 - y;
                    if (dispatchNestedPreScroll(x, i, this.f6547a0, this.f6545W)) {
                        int[] iArr3 = this.f6547a0;
                        int i2 = iArr3[0];
                        i -= iArr3[1];
                        int[] iArr4 = this.f6545W;
                        obtain.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                        int[] iArr5 = this.f6549b0;
                        int i3 = iArr5[0];
                        int[] iArr6 = this.f6545W;
                        iArr5[0] = i3 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                    }
                    if (!this.f6557f0 && Math.abs(i) > this.f6528B) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f6557f0 = true;
                        int i4 = this.f6528B;
                        i = i > 0 ? i - i4 : i + i4;
                    }
                    if (this.f6557f0) {
                        int[] iArr7 = this.f6545W;
                        this.f6555e0 = y - iArr7[1];
                        if (dispatchNestedScroll(0, 0, 0, i + 0, iArr7)) {
                            int i5 = this.f6553d0;
                            int[] iArr8 = this.f6545W;
                            this.f6553d0 = i5 - iArr8[0];
                            this.f6555e0 -= iArr8[1];
                            obtain.offsetLocation((float) iArr8[0], (float) iArr8[1]);
                            int[] iArr9 = this.f6549b0;
                            int i6 = iArr9[0];
                            int[] iArr10 = this.f6545W;
                            iArr9[0] = i6 + iArr10[0];
                            iArr9[1] = iArr9[1] + iArr10[1];
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        this.f6551c0 = motionEvent.getPointerId(actionIndex);
                        this.f6553d0 = (int) motionEvent.getX(actionIndex);
                        this.f6555e0 = (int) motionEvent.getY(actionIndex);
                    }
                }
            }
            stopNestedScroll();
            this.f6557f0 = false;
            this.f6551c0 = -1;
        } else {
            this.f6551c0 = motionEvent.getPointerId(0);
            this.f6553d0 = (int) motionEvent.getX();
            this.f6555e0 = (int) motionEvent.getY();
            startNestedScroll(2);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: A */
    public void mo18609A() {
        this.f6527A.mo18691k();
    }

    /* renamed from: a */
    public void mo18610a(TwinklingRefreshLayout twinklingRefreshLayout) {
        this.f6561i.mo18708a(this.f6548b, this.f6562j);
        C3392f fVar = this.f6559g0;
        if (fVar != null) {
            fVar.mo18610a(twinklingRefreshLayout);
        }
    }

    /* renamed from: b */
    public void mo18611b(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        C3392f fVar;
        this.f6561i.mo18709b(f, this.f6548b, this.f6562j);
        if (this.f6568p && (fVar = this.f6559g0) != null) {
            fVar.mo18611b(twinklingRefreshLayout, f);
        }
    }

    /* renamed from: c */
    public void mo18612c(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        C3392f fVar;
        this.f6560h.mo18715c(f, this.f6546a, this.f6550c);
        if (this.f6569q && (fVar = this.f6559g0) != null) {
            fVar.mo18612c(twinklingRefreshLayout, f);
        }
    }

    /* renamed from: d */
    public void mo18613d() {
        C3392f fVar = this.f6559g0;
        if (fVar != null) {
            fVar.mo18613d();
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f6530H.dispatchNestedFling(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f6530H.dispatchNestedPreFling(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f6530H.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f6530H.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = this.f6531I.dispatchTouchEvent(motionEvent);
        m10431y(motionEvent, this.f6532J);
        m10432z(motionEvent);
        return dispatchTouchEvent;
    }

    /* renamed from: e */
    public void mo18615e(TwinklingRefreshLayout twinklingRefreshLayout) {
        this.f6560h.mo18713a(this.f6546a, this.f6550c);
        C3392f fVar = this.f6559g0;
        if (fVar != null) {
            fVar.mo18615e(twinklingRefreshLayout);
        }
    }

    /* renamed from: f */
    public void mo18616f(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        C3392f fVar;
        this.f6561i.mo18710c(f, this.f6546a, this.f6550c);
        if (this.f6568p && (fVar = this.f6559g0) != null) {
            fVar.mo18616f(twinklingRefreshLayout, f);
        }
    }

    /* renamed from: g */
    public void mo18617g(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        C3392f fVar;
        this.f6560h.mo18714b(f, this.f6546a, this.f6550c);
        if (this.f6569q && (fVar = this.f6559g0) != null) {
            fVar.mo18617g(twinklingRefreshLayout, f);
        }
    }

    public View getExtraHeaderView() {
        return this.f6558g;
    }

    /* renamed from: h */
    public void mo18619h() {
        C3392f fVar = this.f6559g0;
        if (fVar != null) {
            fVar.mo18619h();
        }
        if (this.f6527A.mo18704x() || this.f6527A.mo18657I()) {
            this.f6560h.mo18716d(new C3384c());
        }
    }

    public boolean hasNestedScrollingParent() {
        return this.f6530H.hasNestedScrollingParent();
    }

    /* renamed from: i */
    public void mo18620i() {
        C3392f fVar = this.f6559g0;
        if (fVar != null) {
            fVar.mo18620i();
        }
    }

    public boolean isNestedScrollingEnabled() {
        return this.f6530H.isNestedScrollingEnabled();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f6554e = getChildAt(3);
        this.f6527A.mo18703w();
        C3385d dVar = this.f6527A;
        this.f6531I = new C3418d(dVar, new C3420e(dVar));
        m10415B();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f6531I.mo18780b(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f6531I.mo18784e(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void setAutoLoadMore(boolean z) {
        this.f6573u = z;
        if (z) {
            setEnableLoadmore(true);
        }
    }

    public void setBottomHeight(float f) {
        this.f6562j = (float) C3421a.m10616a(getContext(), f);
    }

    public void setBottomView(C3387a aVar) {
        if (aVar != null) {
            this.f6563k.removeAllViewsInLayout();
            this.f6563k.addView(aVar.getView());
            this.f6561i = aVar;
        }
    }

    public void setDecorator(C3417c cVar) {
        if (cVar != null) {
            this.f6531I = cVar;
        }
    }

    public void setEnableKeepIView(boolean z) {
        this.f6576x = z;
    }

    public void setEnableLoadmore(boolean z) {
        View view;
        int i;
        this.f6568p = z;
        C3387a aVar = this.f6561i;
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
        this.f6575w = z;
    }

    public void setEnableRefresh(boolean z) {
        View view;
        int i;
        this.f6569q = z;
        C3388b bVar = this.f6560h;
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
        this.f6574v = z;
        if (z) {
            post(new C3383b());
        }
    }

    public void setHeaderHeight(float f) {
        this.f6550c = (float) C3421a.m10616a(getContext(), f);
    }

    public void setHeaderView(C3388b bVar) {
        if (bVar != null) {
            this.f6556f.removeAllViewsInLayout();
            this.f6556f.addView(bVar.getView());
            this.f6560h = bVar;
        }
    }

    public void setMaxBottomHeight(float f) {
        this.f6548b = (float) C3421a.m10616a(getContext(), f);
    }

    public void setMaxHeadHeight(float f) {
        this.f6546a = (float) C3421a.m10616a(getContext(), f);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f6530H.setNestedScrollingEnabled(z);
    }

    public void setOnRefreshListener(C3392f fVar) {
        if (fVar != null) {
            this.f6559g0 = fVar;
        }
    }

    public void setOverScrollBottomShow(boolean z) {
        this.f6571s = z;
    }

    public void setOverScrollHeight(float f) {
        this.f6552d = (float) C3421a.m10616a(getContext(), f);
    }

    public void setOverScrollRefreshShow(boolean z) {
        this.f6570r = z;
        this.f6571s = z;
    }

    public void setOverScrollTopShow(boolean z) {
        this.f6570r = z;
    }

    public void setTargetView(View view) {
        if (view != null) {
            this.f6554e = view;
        }
    }

    public boolean startNestedScroll(int i) {
        return this.f6530H.startNestedScroll(i);
    }

    public void stopNestedScroll() {
        this.f6530H.stopNestedScroll();
    }
}
