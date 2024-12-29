package com.chauthai.swipereveallayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;

@SuppressLint({"RtlHardcoded"})
public class SwipeRevealLayout extends ViewGroup {

    /* renamed from: A */
    private final ViewDragHelper.Callback f2215A = new C1258b();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public View f2216a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public View f2217b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Rect f2218c = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Rect f2219d = new Rect();

    /* renamed from: e */
    private Rect f2220e = new Rect();

    /* renamed from: f */
    private Rect f2221f = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f2222g = 0;

    /* renamed from: h */
    private boolean f2223h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile boolean f2224i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile boolean f2225j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f2226k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f2227l = 300;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f2228m = 0;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f2229n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f2230o = 0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f2231p = 0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f2232q = 1;

    /* renamed from: r */
    private float f2233r = 0.0f;

    /* renamed from: s */
    private float f2234s = -1.0f;

    /* renamed from: t */
    private float f2235t = -1.0f;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public ViewDragHelper f2236u;

    /* renamed from: v */
    private GestureDetectorCompat f2237v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C1259c f2238w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C1260d f2239x;

    /* renamed from: y */
    private int f2240y = 0;

    /* renamed from: z */
    private final GestureDetector.OnGestureListener f2241z = new C1257a();

    /* renamed from: com.chauthai.swipereveallayout.SwipeRevealLayout$a */
    class C1257a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        boolean f2242a = false;

        C1257a() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            boolean unused = SwipeRevealLayout.this.f2225j = false;
            this.f2242a = false;
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean unused = SwipeRevealLayout.this.f2225j = true;
            return false;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z = true;
            boolean unused = SwipeRevealLayout.this.f2225j = true;
            if (SwipeRevealLayout.this.getParent() != null) {
                if (!this.f2242a) {
                    boolean z2 = SwipeRevealLayout.this.getDistToClosestEdge() >= SwipeRevealLayout.this.f2222g;
                    if (z2) {
                        this.f2242a = true;
                    }
                    z = z2;
                }
                SwipeRevealLayout.this.getParent().requestDisallowInterceptTouchEvent(z);
            }
            return false;
        }
    }

    /* renamed from: com.chauthai.swipereveallayout.SwipeRevealLayout$b */
    class C1258b extends ViewDragHelper.Callback {
        C1258b() {
        }

        /* renamed from: a */
        private float m3282a() {
            int left;
            int i;
            float f;
            int width;
            int top;
            int i2;
            int x = SwipeRevealLayout.this.f2232q;
            if (x == 1) {
                left = SwipeRevealLayout.this.f2216a.getLeft();
                i = SwipeRevealLayout.this.f2218c.left;
                f = (float) (left - i);
                width = SwipeRevealLayout.this.f2217b.getWidth();
            } else if (x != 2) {
                if (x == 4) {
                    top = SwipeRevealLayout.this.f2216a.getTop();
                    i2 = SwipeRevealLayout.this.f2218c.top;
                } else if (x != 8) {
                    return 0.0f;
                } else {
                    top = SwipeRevealLayout.this.f2218c.top;
                    i2 = SwipeRevealLayout.this.f2216a.getTop();
                }
                f = (float) (top - i2);
                width = SwipeRevealLayout.this.f2217b.getHeight();
            } else {
                left = SwipeRevealLayout.this.f2218c.left;
                i = SwipeRevealLayout.this.f2216a.getLeft();
                f = (float) (left - i);
                width = SwipeRevealLayout.this.f2217b.getWidth();
            }
            return f / ((float) width);
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            int min;
            int i3;
            int x = SwipeRevealLayout.this.f2232q;
            if (x == 1) {
                min = Math.min(i, SwipeRevealLayout.this.f2218c.left + SwipeRevealLayout.this.f2217b.getWidth());
                i3 = SwipeRevealLayout.this.f2218c.left;
            } else if (x != 2) {
                return view.getLeft();
            } else {
                min = Math.min(i, SwipeRevealLayout.this.f2218c.left);
                i3 = SwipeRevealLayout.this.f2218c.left - SwipeRevealLayout.this.f2217b.getWidth();
            }
            return Math.max(min, i3);
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            int min;
            int i3;
            int x = SwipeRevealLayout.this.f2232q;
            if (x == 4) {
                min = Math.min(i, SwipeRevealLayout.this.f2218c.top + SwipeRevealLayout.this.f2217b.getHeight());
                i3 = SwipeRevealLayout.this.f2218c.top;
            } else if (x != 8) {
                return view.getTop();
            } else {
                min = Math.min(i, SwipeRevealLayout.this.f2218c.top);
                i3 = SwipeRevealLayout.this.f2218c.top - SwipeRevealLayout.this.f2217b.getHeight();
            }
            return Math.max(min, i3);
        }

        public void onEdgeDragStarted(int i, int i2) {
            super.onEdgeDragStarted(i, i2);
            if (!SwipeRevealLayout.this.f2226k) {
                boolean z = false;
                boolean z2 = SwipeRevealLayout.this.f2232q == 2 && i == 1;
                boolean z3 = SwipeRevealLayout.this.f2232q == 1 && i == 2;
                boolean z4 = SwipeRevealLayout.this.f2232q == 8 && i == 4;
                if (SwipeRevealLayout.this.f2232q == 4 && i == 8) {
                    z = true;
                }
                if (z2 || z3 || z4 || z) {
                    SwipeRevealLayout.this.f2236u.captureChildView(SwipeRevealLayout.this.f2216a, i2);
                }
            }
        }

        public void onViewDragStateChanged(int i) {
            super.onViewDragStateChanged(i);
            int o = SwipeRevealLayout.this.f2228m;
            if (i != 0) {
                if (i == 1) {
                    int unused = SwipeRevealLayout.this.f2228m = 4;
                }
            } else if (SwipeRevealLayout.this.f2232q == 1 || SwipeRevealLayout.this.f2232q == 2 ? SwipeRevealLayout.this.f2216a.getLeft() != SwipeRevealLayout.this.f2218c.left : SwipeRevealLayout.this.f2216a.getTop() != SwipeRevealLayout.this.f2218c.top) {
                int unused2 = SwipeRevealLayout.this.f2228m = 2;
            } else {
                int unused3 = SwipeRevealLayout.this.f2228m = 0;
            }
            if (SwipeRevealLayout.this.f2238w != null && !SwipeRevealLayout.this.f2224i && o != SwipeRevealLayout.this.f2228m) {
                SwipeRevealLayout.this.f2238w.onDragStateChanged(SwipeRevealLayout.this.f2228m);
            }
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            super.onViewPositionChanged(view, i, i2, i3, i4);
            boolean z = true;
            if (SwipeRevealLayout.this.f2229n == 1) {
                if (SwipeRevealLayout.this.f2232q == 1 || SwipeRevealLayout.this.f2232q == 2) {
                    SwipeRevealLayout.this.f2217b.offsetLeftAndRight(i3);
                } else {
                    SwipeRevealLayout.this.f2217b.offsetTopAndBottom(i4);
                }
            }
            if (SwipeRevealLayout.this.f2216a.getLeft() == SwipeRevealLayout.this.f2230o && SwipeRevealLayout.this.f2216a.getTop() == SwipeRevealLayout.this.f2231p) {
                z = false;
            }
            if (SwipeRevealLayout.this.f2239x != null && z) {
                if (SwipeRevealLayout.this.f2216a.getLeft() == SwipeRevealLayout.this.f2218c.left && SwipeRevealLayout.this.f2216a.getTop() == SwipeRevealLayout.this.f2218c.top) {
                    SwipeRevealLayout.this.f2239x.mo10108c(SwipeRevealLayout.this);
                } else if (SwipeRevealLayout.this.f2216a.getLeft() == SwipeRevealLayout.this.f2219d.left && SwipeRevealLayout.this.f2216a.getTop() == SwipeRevealLayout.this.f2219d.top) {
                    SwipeRevealLayout.this.f2239x.mo10107b(SwipeRevealLayout.this);
                } else {
                    SwipeRevealLayout.this.f2239x.mo10106a(SwipeRevealLayout.this, m3282a());
                }
            }
            SwipeRevealLayout swipeRevealLayout = SwipeRevealLayout.this;
            int unused = swipeRevealLayout.f2230o = swipeRevealLayout.f2216a.getLeft();
            SwipeRevealLayout swipeRevealLayout2 = SwipeRevealLayout.this;
            int unused2 = swipeRevealLayout2.f2231p = swipeRevealLayout2.f2216a.getTop();
            ViewCompat.postInvalidateOnAnimation(SwipeRevealLayout.this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
            if (com.chauthai.swipereveallayout.SwipeRevealLayout.m3272v(r6.f2244a).getBottom() < r3) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
            if (com.chauthai.swipereveallayout.SwipeRevealLayout.m3272v(r6.f2244a).getTop() < r3) goto L_0x008f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
            if (com.chauthai.swipereveallayout.SwipeRevealLayout.m3272v(r6.f2244a).getRight() >= r9) goto L_0x008f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ba, code lost:
            if (com.chauthai.swipereveallayout.SwipeRevealLayout.m3272v(r6.f2244a).getLeft() >= r9) goto L_0x00a7;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onViewReleased(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                com.chauthai.swipereveallayout.SwipeRevealLayout r7 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                int r8 = (int) r8
                int r7 = r7.m3250J(r8)
                com.chauthai.swipereveallayout.SwipeRevealLayout r0 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                int r0 = r0.f2227l
                r1 = 0
                r2 = 1
                if (r7 < r0) goto L_0x0013
                r7 = 1
                goto L_0x0014
            L_0x0013:
                r7 = 0
            L_0x0014:
                com.chauthai.swipereveallayout.SwipeRevealLayout r0 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                int r8 = r0.m3250J(r8)
                com.chauthai.swipereveallayout.SwipeRevealLayout r0 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                int r0 = r0.f2227l
                int r0 = -r0
                if (r8 > r0) goto L_0x0025
                r8 = 1
                goto L_0x0026
            L_0x0025:
                r8 = 0
            L_0x0026:
                com.chauthai.swipereveallayout.SwipeRevealLayout r0 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                int r9 = (int) r9
                int r0 = r0.m3250J(r9)
                com.chauthai.swipereveallayout.SwipeRevealLayout r3 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                int r3 = r3.f2227l
                int r3 = -r3
                if (r0 > r3) goto L_0x0038
                r0 = 1
                goto L_0x0039
            L_0x0038:
                r0 = 0
            L_0x0039:
                com.chauthai.swipereveallayout.SwipeRevealLayout r3 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                int r9 = r3.m3250J(r9)
                com.chauthai.swipereveallayout.SwipeRevealLayout r3 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                int r3 = r3.f2227l
                if (r9 < r3) goto L_0x0048
                r1 = 1
            L_0x0048:
                com.chauthai.swipereveallayout.SwipeRevealLayout r9 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                int r9 = r9.getHalfwayPivotHorizontal()
                com.chauthai.swipereveallayout.SwipeRevealLayout r3 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                int r3 = r3.getHalfwayPivotVertical()
                com.chauthai.swipereveallayout.SwipeRevealLayout r4 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                int r4 = r4.f2232q
                if (r4 == r2) goto L_0x00a5
                r5 = 2
                if (r4 == r5) goto L_0x008d
                r7 = 4
                if (r4 == r7) goto L_0x007a
                r7 = 8
                if (r4 == r7) goto L_0x0067
                goto L_0x00bd
            L_0x0067:
                if (r0 == 0) goto L_0x006a
                goto L_0x00a7
            L_0x006a:
                if (r1 == 0) goto L_0x006d
                goto L_0x008f
            L_0x006d:
                com.chauthai.swipereveallayout.SwipeRevealLayout r7 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                android.view.View r7 = r7.f2216a
                int r7 = r7.getBottom()
                if (r7 >= r3) goto L_0x008f
                goto L_0x00a7
            L_0x007a:
                if (r0 == 0) goto L_0x007d
                goto L_0x008f
            L_0x007d:
                if (r1 == 0) goto L_0x0080
                goto L_0x00a7
            L_0x0080:
                com.chauthai.swipereveallayout.SwipeRevealLayout r7 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                android.view.View r7 = r7.f2216a
                int r7 = r7.getTop()
                if (r7 >= r3) goto L_0x00a7
                goto L_0x008f
            L_0x008d:
                if (r7 == 0) goto L_0x0095
            L_0x008f:
                com.chauthai.swipereveallayout.SwipeRevealLayout r7 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                r7.mo10084B(r2)
                goto L_0x00bd
            L_0x0095:
                if (r8 == 0) goto L_0x0098
                goto L_0x00a7
            L_0x0098:
                com.chauthai.swipereveallayout.SwipeRevealLayout r7 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                android.view.View r7 = r7.f2216a
                int r7 = r7.getRight()
                if (r7 >= r9) goto L_0x008f
                goto L_0x00a7
            L_0x00a5:
                if (r7 == 0) goto L_0x00ad
            L_0x00a7:
                com.chauthai.swipereveallayout.SwipeRevealLayout r7 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                r7.mo10086I(r2)
                goto L_0x00bd
            L_0x00ad:
                if (r8 == 0) goto L_0x00b0
                goto L_0x008f
            L_0x00b0:
                com.chauthai.swipereveallayout.SwipeRevealLayout r7 = com.chauthai.swipereveallayout.SwipeRevealLayout.this
                android.view.View r7 = r7.f2216a
                int r7 = r7.getLeft()
                if (r7 >= r9) goto L_0x00a7
                goto L_0x008f
            L_0x00bd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chauthai.swipereveallayout.SwipeRevealLayout.C1258b.onViewReleased(android.view.View, float, float):void");
        }

        public boolean tryCaptureView(View view, int i) {
            boolean unused = SwipeRevealLayout.this.f2224i = false;
            if (SwipeRevealLayout.this.f2226k) {
                return false;
            }
            SwipeRevealLayout.this.f2236u.captureChildView(SwipeRevealLayout.this.f2216a, i);
            return false;
        }
    }

    /* renamed from: com.chauthai.swipereveallayout.SwipeRevealLayout$c */
    interface C1259c {
        void onDragStateChanged(int i);
    }

    /* renamed from: com.chauthai.swipereveallayout.SwipeRevealLayout$d */
    public interface C1260d {
        /* renamed from: a */
        void mo10106a(SwipeRevealLayout swipeRevealLayout, float f);

        /* renamed from: b */
        void mo10107b(SwipeRevealLayout swipeRevealLayout);

        /* renamed from: c */
        void mo10108c(SwipeRevealLayout swipeRevealLayout);
    }

    public SwipeRevealLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3247E(context, attributeSet);
    }

    /* renamed from: A */
    private void m3244A(MotionEvent motionEvent) {
        float f;
        float f2;
        if (motionEvent.getAction() == 0) {
            this.f2233r = 0.0f;
            return;
        }
        boolean z = true;
        if (!(getDragEdge() == 1 || getDragEdge() == 2)) {
            z = false;
        }
        if (z) {
            f = motionEvent.getX();
            f2 = this.f2234s;
        } else {
            f = motionEvent.getY();
            f2 = this.f2235t;
        }
        this.f2233r += Math.abs(f - f2);
    }

    /* renamed from: C */
    private boolean m3245C(MotionEvent motionEvent) {
        return m3249H(motionEvent) && !m3251K();
    }

    /* renamed from: D */
    private int m3246D(int i) {
        return (int) (((float) i) * (((float) getContext().getResources().getDisplayMetrics().densityDpi) / 160.0f));
    }

    /* renamed from: E */
    private void m3247E(Context context, AttributeSet attributeSet) {
        if (!(attributeSet == null || context == null)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SwipeRevealLayout, 0, 0);
            this.f2232q = obtainStyledAttributes.getInteger(R$styleable.SwipeRevealLayout_dragEdge, 1);
            this.f2227l = obtainStyledAttributes.getInteger(R$styleable.SwipeRevealLayout_flingVelocity, 300);
            this.f2229n = obtainStyledAttributes.getInteger(R$styleable.SwipeRevealLayout_modeSwipe, 0);
            this.f2222g = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SwipeRevealLayout_minDistRequestDisallowParent, m3246D(1));
        }
        ViewDragHelper create = ViewDragHelper.create(this, 1.0f, this.f2215A);
        this.f2236u = create;
        create.setEdgeTrackingEnabled(15);
        this.f2237v = new GestureDetectorCompat(context, this.f2241z);
    }

    /* renamed from: F */
    private void m3248F() {
        this.f2218c.set(this.f2216a.getLeft(), this.f2216a.getTop(), this.f2216a.getRight(), this.f2216a.getBottom());
        this.f2220e.set(this.f2217b.getLeft(), this.f2217b.getTop(), this.f2217b.getRight(), this.f2217b.getBottom());
        this.f2219d.set(getMainOpenLeft(), getMainOpenTop(), getMainOpenLeft() + this.f2216a.getWidth(), getMainOpenTop() + this.f2216a.getHeight());
        this.f2221f.set(getSecOpenLeft(), getSecOpenTop(), getSecOpenLeft() + this.f2217b.getWidth(), getSecOpenTop() + this.f2217b.getHeight());
    }

    /* renamed from: H */
    private boolean m3249H(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return ((((float) this.f2216a.getTop()) > y ? 1 : (((float) this.f2216a.getTop()) == y ? 0 : -1)) <= 0 && (y > ((float) this.f2216a.getBottom()) ? 1 : (y == ((float) this.f2216a.getBottom()) ? 0 : -1)) <= 0) && ((((float) this.f2216a.getLeft()) > x ? 1 : (((float) this.f2216a.getLeft()) == x ? 0 : -1)) <= 0 && (x > ((float) this.f2216a.getRight()) ? 1 : (x == ((float) this.f2216a.getRight()) ? 0 : -1)) <= 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public int m3250J(int i) {
        return (int) (((float) i) / (((float) getContext().getResources().getDisplayMetrics().densityDpi) / 160.0f));
    }

    /* renamed from: K */
    private boolean m3251K() {
        return this.f2233r >= ((float) this.f2236u.getTouchSlop());
    }

    /* access modifiers changed from: private */
    public int getDistToClosestEdge() {
        int i = this.f2232q;
        if (i == 1) {
            return Math.min(this.f2216a.getLeft() - this.f2218c.left, (this.f2218c.left + this.f2217b.getWidth()) - this.f2216a.getLeft());
        } else if (i == 2) {
            return Math.min(this.f2216a.getRight() - (this.f2218c.right - this.f2217b.getWidth()), this.f2218c.right - this.f2216a.getRight());
        } else if (i == 4) {
            int height = this.f2218c.top + this.f2217b.getHeight();
            return Math.min(this.f2216a.getBottom() - height, height - this.f2216a.getTop());
        } else if (i != 8) {
            return 0;
        } else {
            return Math.min(this.f2218c.bottom - this.f2216a.getBottom(), this.f2216a.getBottom() - (this.f2218c.bottom - this.f2217b.getHeight()));
        }
    }

    /* access modifiers changed from: private */
    public int getHalfwayPivotHorizontal() {
        return this.f2232q == 1 ? this.f2218c.left + (this.f2217b.getWidth() / 2) : this.f2218c.right - (this.f2217b.getWidth() / 2);
    }

    /* access modifiers changed from: private */
    public int getHalfwayPivotVertical() {
        return this.f2232q == 4 ? this.f2218c.top + (this.f2217b.getHeight() / 2) : this.f2218c.bottom - (this.f2217b.getHeight() / 2);
    }

    private int getMainOpenLeft() {
        int i = this.f2232q;
        if (i == 1) {
            return this.f2218c.left + this.f2217b.getWidth();
        }
        if (i == 2) {
            return this.f2218c.left - this.f2217b.getWidth();
        }
        if (i == 4) {
            return this.f2218c.left;
        }
        if (i != 8) {
            return 0;
        }
        return this.f2218c.left;
    }

    private int getMainOpenTop() {
        int i = this.f2232q;
        if (i == 1) {
            return this.f2218c.top;
        }
        if (i == 2) {
            return this.f2218c.top;
        }
        if (i == 4) {
            return this.f2218c.top + this.f2217b.getHeight();
        }
        if (i != 8) {
            return 0;
        }
        return this.f2218c.top - this.f2217b.getHeight();
    }

    private int getSecOpenLeft() {
        int i;
        return (this.f2229n == 0 || (i = this.f2232q) == 8 || i == 4) ? this.f2220e.left : i == 1 ? this.f2220e.left + this.f2217b.getWidth() : this.f2220e.left - this.f2217b.getWidth();
    }

    private int getSecOpenTop() {
        int i;
        return (this.f2229n == 0 || (i = this.f2232q) == 1 || i == 2) ? this.f2220e.top : i == 4 ? this.f2220e.top + this.f2217b.getHeight() : this.f2220e.top - this.f2217b.getHeight();
    }

    /* renamed from: B */
    public void mo10084B(boolean z) {
        this.f2223h = false;
        this.f2224i = false;
        if (z) {
            this.f2228m = 1;
            ViewDragHelper viewDragHelper = this.f2236u;
            View view = this.f2216a;
            Rect rect = this.f2218c;
            viewDragHelper.smoothSlideViewTo(view, rect.left, rect.top);
            C1259c cVar = this.f2238w;
            if (cVar != null) {
                cVar.onDragStateChanged(this.f2228m);
            }
        } else {
            this.f2228m = 0;
            this.f2236u.abort();
            View view2 = this.f2216a;
            Rect rect2 = this.f2218c;
            view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            View view3 = this.f2217b;
            Rect rect3 = this.f2220e;
            view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* renamed from: G */
    public boolean mo10085G() {
        return this.f2226k;
    }

    /* renamed from: I */
    public void mo10086I(boolean z) {
        this.f2223h = true;
        this.f2224i = false;
        if (z) {
            this.f2228m = 3;
            ViewDragHelper viewDragHelper = this.f2236u;
            View view = this.f2216a;
            Rect rect = this.f2219d;
            viewDragHelper.smoothSlideViewTo(view, rect.left, rect.top);
            C1259c cVar = this.f2238w;
            if (cVar != null) {
                cVar.onDragStateChanged(this.f2228m);
            }
        } else {
            this.f2228m = 2;
            this.f2236u.abort();
            View view2 = this.f2216a;
            Rect rect2 = this.f2219d;
            view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            View view3 = this.f2217b;
            Rect rect3 = this.f2221f;
            view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public boolean mo10087L() {
        return this.f2240y < 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10088a() {
        this.f2224i = true;
        this.f2236u.abort();
    }

    public void computeScroll() {
        if (this.f2236u.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public int getDragEdge() {
        return this.f2232q;
    }

    public int getMinFlingVelocity() {
        return this.f2227l;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        View childAt;
        super.onFinishInflate();
        if (getChildCount() >= 2) {
            this.f2217b = getChildAt(0);
            childAt = getChildAt(1);
        } else if (getChildCount() == 1) {
            childAt = getChildAt(0);
        } else {
            return;
        }
        this.f2216a = childAt;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (mo10085G()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.f2236u.processTouchEvent(motionEvent);
        this.f2237v.onTouchEvent(motionEvent);
        m3244A(motionEvent);
        boolean C = m3245C(motionEvent);
        boolean z = this.f2236u.getViewDragState() == 2;
        boolean z2 = this.f2236u.getViewDragState() == 0 && this.f2225j;
        this.f2234s = motionEvent.getX();
        this.f2235t = motionEvent.getY();
        return !C && (z || z2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View view;
        int i6;
        View view2;
        boolean z2;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        this.f2224i = false;
        int i12 = 0;
        while (i12 < getChildCount()) {
            View childAt = getChildAt(i12);
            int paddingLeft = getPaddingLeft();
            int max = Math.max((i3 - getPaddingRight()) - i, i11);
            int paddingTop = getPaddingTop();
            int max2 = Math.max((i4 - getPaddingBottom()) - i2, i11);
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredWidth = childAt.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                int i13 = layoutParams.height;
                z2 = i13 == -1 || i13 == -1;
                int i14 = layoutParams.width;
                z3 = i14 == -1 || i14 == -1;
            } else {
                z3 = false;
                z2 = false;
            }
            if (z2) {
                measuredHeight = max2 - paddingTop;
                layoutParams.height = measuredHeight;
            }
            if (z3) {
                measuredWidth = max - paddingLeft;
                layoutParams.width = measuredWidth;
            }
            int i15 = this.f2232q;
            if (i15 != 1) {
                if (i15 == 2) {
                    i10 = Math.max(((i3 - measuredWidth) - getPaddingRight()) - i, paddingLeft);
                    i9 = Math.min(getPaddingTop(), max2);
                    i8 = Math.max((i3 - getPaddingRight()) - i, paddingLeft);
                    i7 = Math.min(measuredHeight + getPaddingTop(), max2);
                    childAt.layout(i10, i9, i8, i7);
                    i12++;
                    i11 = 0;
                } else if (i15 != 4) {
                    if (i15 != 8) {
                        i10 = 0;
                        i9 = 0;
                        i8 = 0;
                        i7 = 0;
                    } else {
                        i10 = Math.min(getPaddingLeft(), max);
                        i9 = Math.max(((i4 - measuredHeight) - getPaddingBottom()) - i2, paddingTop);
                        i8 = Math.min(measuredWidth + getPaddingLeft(), max);
                        i7 = Math.max((i4 - getPaddingBottom()) - i2, paddingTop);
                    }
                    childAt.layout(i10, i9, i8, i7);
                    i12++;
                    i11 = 0;
                }
            }
            i10 = Math.min(getPaddingLeft(), max);
            i9 = Math.min(getPaddingTop(), max2);
            i8 = Math.min(measuredWidth + getPaddingLeft(), max);
            i7 = Math.min(measuredHeight + getPaddingTop(), max2);
            childAt.layout(i10, i9, i8, i7);
            i12++;
            i11 = 0;
        }
        if (this.f2229n == 1) {
            int i16 = this.f2232q;
            if (i16 == 1) {
                view = this.f2217b;
                i5 = -view.getWidth();
            } else if (i16 != 2) {
                if (i16 == 4) {
                    view2 = this.f2217b;
                    i6 = -view2.getHeight();
                } else if (i16 == 8) {
                    view2 = this.f2217b;
                    i6 = view2.getHeight();
                }
                view2.offsetTopAndBottom(i6);
            } else {
                view = this.f2217b;
                i5 = view.getWidth();
            }
            view.offsetLeftAndRight(i5);
        }
        m3248F();
        if (this.f2223h) {
            mo10086I(false);
        } else {
            mo10084B(false);
        }
        this.f2230o = this.f2216a.getLeft();
        this.f2231p = this.f2216a.getTop();
        this.f2240y++;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (getChildCount() >= 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                measureChild(childAt, i, i2);
                i3 = Math.max(childAt.getMeasuredWidth(), i3);
                i4 = Math.max(childAt.getMeasuredHeight(), i4);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, mode);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, mode2);
            int size = View.MeasureSpec.getSize(makeMeasureSpec);
            int size2 = View.MeasureSpec.getSize(makeMeasureSpec2);
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt2 = getChildAt(i6);
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                if (layoutParams2 != null) {
                    if (layoutParams2.height == -1) {
                        childAt2.setMinimumHeight(size2);
                    }
                    if (layoutParams2.width == -1) {
                        childAt2.setMinimumWidth(size);
                    }
                }
                measureChild(childAt2, makeMeasureSpec, makeMeasureSpec2);
                i3 = Math.max(childAt2.getMeasuredWidth(), i3);
                i4 = Math.max(childAt2.getMeasuredHeight(), i4);
            }
            int paddingLeft = i3 + getPaddingLeft() + getPaddingRight();
            int paddingTop = i4 + getPaddingTop() + getPaddingBottom();
            if (mode != 1073741824) {
                if (layoutParams.width == -1) {
                    paddingLeft = size;
                }
                if (mode != Integer.MIN_VALUE || paddingLeft <= size) {
                    size = paddingLeft;
                }
            }
            if (mode2 != 1073741824) {
                if (layoutParams.height == -1) {
                    paddingTop = size2;
                }
                if (mode2 != Integer.MIN_VALUE || paddingTop <= size2) {
                    size2 = paddingTop;
                }
            }
            setMeasuredDimension(size, size2);
            return;
        }
        throw new RuntimeException("Layout must have two children");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f2237v.onTouchEvent(motionEvent);
        this.f2236u.processTouchEvent(motionEvent);
        return true;
    }

    public void setDragEdge(int i) {
        this.f2232q = i;
    }

    /* access modifiers changed from: package-private */
    public void setDragStateChangeListener(C1259c cVar) {
        this.f2238w = cVar;
    }

    public void setLockDrag(boolean z) {
        this.f2226k = z;
    }

    public void setMinFlingVelocity(int i) {
        this.f2227l = i;
    }

    public void setSwipeListener(C1260d dVar) {
        this.f2239x = dVar;
    }
}
