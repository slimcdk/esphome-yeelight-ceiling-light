package com.yeelight.yeelib.p194ui.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.widget.EdgeEffectCompat;
import com.yeelight.yeelib.R$styleable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView */
public class HorizontalListView extends AdapterView<ListAdapter> {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f19538A = false;

    /* renamed from: B */
    private boolean f19539B = false;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public View.OnClickListener f19540G;

    /* renamed from: H */
    private DataSetObserver f19541H = new C10434b();

    /* renamed from: I */
    private Runnable f19542I = new C10435c();

    /* renamed from: a */
    protected Scroller f19543a = new Scroller(getContext());

    /* renamed from: b */
    private final C10436d f19544b = new C10436d(this, (C10433a) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public GestureDetector f19545c;

    /* renamed from: d */
    private int f19546d;

    /* renamed from: e */
    protected ListAdapter f19547e;

    /* renamed from: f */
    private List<Queue<View>> f19548f = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f19549g = false;

    /* renamed from: h */
    private Rect f19550h = new Rect();

    /* renamed from: i */
    private View f19551i = null;

    /* renamed from: j */
    private int f19552j = 0;

    /* renamed from: k */
    private Drawable f19553k = null;

    /* renamed from: l */
    protected int f19554l;

    /* renamed from: m */
    protected int f19555m;

    /* renamed from: n */
    private Integer f19556n = null;

    /* renamed from: o */
    private int f19557o = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f19558p;

    /* renamed from: q */
    private int f19559q;

    /* renamed from: r */
    private int f19560r;

    /* renamed from: s */
    private C10441h f19561s = null;

    /* renamed from: t */
    private int f19562t = 0;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f19563u = false;

    /* renamed from: v */
    private C10439g f19564v = null;

    /* renamed from: w */
    private C10439g.C10440a f19565w = C10439g.C10440a.SCROLL_STATE_IDLE;

    /* renamed from: x */
    private EdgeEffectCompat f19566x;

    /* renamed from: y */
    private EdgeEffectCompat f19567y;

    /* renamed from: z */
    private int f19568z;

    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$a */
    class C10433a implements View.OnTouchListener {
        C10433a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return HorizontalListView.this.f19545c.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$b */
    class C10434b extends DataSetObserver {
        C10434b() {
        }

        public void onChanged() {
            boolean unused = HorizontalListView.this.f19549g = true;
            boolean unused2 = HorizontalListView.this.f19563u = false;
            HorizontalListView.this.m25239Q();
            HorizontalListView.this.invalidate();
            HorizontalListView.this.requestLayout();
        }

        public void onInvalidated() {
            boolean unused = HorizontalListView.this.f19563u = false;
            HorizontalListView.this.m25239Q();
            HorizontalListView.this.m25237O();
            HorizontalListView.this.invalidate();
            HorizontalListView.this.requestLayout();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$c */
    class C10435c implements Runnable {
        C10435c() {
        }

        public void run() {
            HorizontalListView.this.requestLayout();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$d */
    private class C10436d extends GestureDetector.SimpleOnGestureListener {
        private C10436d() {
        }

        /* synthetic */ C10436d(HorizontalListView horizontalListView, C10433a aVar) {
            this();
        }

        public boolean onDown(MotionEvent motionEvent) {
            return HorizontalListView.this.mo32939H(motionEvent);
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return HorizontalListView.this.mo32940I(motionEvent, motionEvent2, f, f2);
        }

        public void onLongPress(MotionEvent motionEvent) {
            HorizontalListView.this.m25239Q();
            int l = HorizontalListView.this.m25265y((int) motionEvent.getX(), (int) motionEvent.getY());
            if (l >= 0 && !HorizontalListView.this.f19538A) {
                View childAt = HorizontalListView.this.getChildAt(l);
                AdapterView.OnItemLongClickListener onItemLongClickListener = HorizontalListView.this.getOnItemLongClickListener();
                if (onItemLongClickListener != null) {
                    int c = HorizontalListView.this.f19558p + l;
                    HorizontalListView horizontalListView = HorizontalListView.this;
                    if (onItemLongClickListener.onItemLongClick(horizontalListView, childAt, c, horizontalListView.f19547e.getItemId(c))) {
                        HorizontalListView.this.performHapticFeedback(0);
                    }
                }
            }
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            HorizontalListView.this.m25236N(Boolean.TRUE);
            HorizontalListView.this.setCurrentScrollState(C10439g.C10440a.SCROLL_STATE_TOUCH_SCROLL);
            HorizontalListView.this.m25239Q();
            HorizontalListView horizontalListView = HorizontalListView.this;
            horizontalListView.f19555m += (int) f;
            horizontalListView.m25240R(Math.round(f));
            HorizontalListView.this.requestLayout();
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            HorizontalListView.this.m25239Q();
            AdapterView.OnItemClickListener onItemClickListener = HorizontalListView.this.getOnItemClickListener();
            int l = HorizontalListView.this.m25265y((int) motionEvent.getX(), (int) motionEvent.getY());
            if (l >= 0 && !HorizontalListView.this.f19538A) {
                View childAt = HorizontalListView.this.getChildAt(l);
                int c = HorizontalListView.this.f19558p + l;
                if (onItemClickListener != null) {
                    HorizontalListView horizontalListView = HorizontalListView.this;
                    onItemClickListener.onItemClick(horizontalListView, childAt, c, horizontalListView.f19547e.getItemId(c));
                    return true;
                }
            }
            if (HorizontalListView.this.f19540G == null || HorizontalListView.this.f19538A) {
                return false;
            }
            HorizontalListView.this.f19540G.onClick(HorizontalListView.this);
            return false;
        }
    }

    @TargetApi(11)
    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$e */
    private static final class C10437e {
        static {
            if (Build.VERSION.SDK_INT < 11) {
                throw new RuntimeException("Should not get to HoneycombPlus class unless sdk is >= 11!");
            }
        }

        /* renamed from: a */
        public static void m25269a(Scroller scroller, float f) {
            if (scroller != null) {
                scroller.setFriction(f);
            }
        }
    }

    @TargetApi(14)
    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$f */
    private static final class C10438f {
        static {
            if (Build.VERSION.SDK_INT < 14) {
                throw new RuntimeException("Should not get to IceCreamSandwichPlus class unless sdk is >= 14!");
            }
        }

        /* renamed from: a */
        public static float m25270a(Scroller scroller) {
            return scroller.getCurrVelocity();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$g */
    public interface C10439g {

        /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$g$a */
        public enum C10440a {
            SCROLL_STATE_IDLE,
            SCROLL_STATE_TOUCH_SCROLL,
            SCROLL_STATE_FLING
        }

        /* renamed from: a */
        void mo32971a(C10440a aVar);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$h */
    public interface C10441h {
        /* renamed from: a */
        void mo32972a();
    }

    public HorizontalListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19566x = new EdgeEffectCompat(context);
        this.f19567y = new EdgeEffectCompat(context);
        this.f19545c = new GestureDetector(context, this.f19544b);
        m25254n();
        m25226B();
        m25238P(context, attributeSet);
        setWillNotDraw(false);
        if (Build.VERSION.SDK_INT >= 11) {
            C10437e.m25269a(this.f19543a, 0.009f);
        }
    }

    /* renamed from: A */
    private View m25225A(int i) {
        int itemViewType = this.f19547e.getItemViewType(i);
        if (m25229E(itemViewType)) {
            return (View) this.f19548f.get(itemViewType).poll();
        }
        return null;
    }

    /* renamed from: B */
    private void m25226B() {
        this.f19558p = -1;
        this.f19559q = -1;
        this.f19546d = 0;
        this.f19554l = 0;
        this.f19555m = 0;
        this.f19557o = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        setCurrentScrollState(C10439g.C10440a.SCROLL_STATE_IDLE);
    }

    /* renamed from: C */
    private void m25227C(int i) {
        this.f19548f.clear();
        for (int i2 = 0; i2 < i; i2++) {
            this.f19548f.add(new LinkedList());
        }
    }

    /* renamed from: D */
    private boolean m25228D() {
        ListAdapter listAdapter = this.f19547e;
        return listAdapter != null && !listAdapter.isEmpty() && this.f19557o > 0;
    }

    /* renamed from: E */
    private boolean m25229E(int i) {
        return i < this.f19548f.size();
    }

    /* renamed from: F */
    private boolean m25230F(int i) {
        return i == this.f19547e.getCount() - 1;
    }

    /* renamed from: G */
    private void m25231G(View view) {
        ViewGroup.LayoutParams z = m25266z(view);
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f19568z, getPaddingTop() + getPaddingBottom(), z.height);
        int i = z.width;
        view.measure(i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0), childMeasureSpec);
    }

    /* renamed from: J */
    private void m25232J(int i) {
        int childCount = getChildCount();
        if (childCount > 0) {
            int i2 = this.f19546d + i;
            this.f19546d = i2;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                int paddingLeft = getPaddingLeft() + i2;
                int paddingTop = getPaddingTop();
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                i2 += childAt.getMeasuredWidth() + this.f19552j;
            }
        }
    }

    /* renamed from: K */
    private void m25233K(int i, View view) {
        int itemViewType = this.f19547e.getItemViewType(i);
        if (m25229E(itemViewType)) {
            this.f19548f.get(itemViewType).offer(view);
        }
    }

    /* renamed from: L */
    private void m25234L() {
        EdgeEffectCompat edgeEffectCompat = this.f19566x;
        if (edgeEffectCompat != null) {
            edgeEffectCompat.onRelease();
        }
        EdgeEffectCompat edgeEffectCompat2 = this.f19567y;
        if (edgeEffectCompat2 != null) {
            edgeEffectCompat2.onRelease();
        }
    }

    /* renamed from: M */
    private void m25235M(int i) {
        while (true) {
            View leftmostChild = getLeftmostChild();
            if (leftmostChild != null && leftmostChild.getRight() + i <= 0) {
                this.f19546d += m25230F(this.f19558p) ? leftmostChild.getMeasuredWidth() : this.f19552j + leftmostChild.getMeasuredWidth();
                m25233K(this.f19558p, leftmostChild);
                removeViewInLayout(leftmostChild);
                this.f19558p++;
            }
        }
        while (true) {
            View rightmostChild = getRightmostChild();
            if (rightmostChild != null && rightmostChild.getLeft() + i >= getWidth()) {
                m25233K(this.f19559q, rightmostChild);
                removeViewInLayout(rightmostChild);
                this.f19559q--;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m25236N(Boolean bool) {
        if (this.f19539B != bool.booleanValue()) {
            for (View view = this; view.getParent() instanceof View; view = (View) view.getParent()) {
                if ((view.getParent() instanceof ListView) || (view.getParent() instanceof ScrollView)) {
                    view.getParent().requestDisallowInterceptTouchEvent(bool.booleanValue());
                    this.f19539B = bool.booleanValue();
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m25237O() {
        m25226B();
        removeAllViewsInLayout();
        requestLayout();
    }

    /* renamed from: P */
    private void m25238P(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.HorizontalListView);
            Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.HorizontalListView_android_divider);
            if (drawable != null) {
                setDivider(drawable);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.HorizontalListView_dividerWidth, 0);
            if (dimensionPixelSize != 0) {
                setDividerWidth(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m25239Q() {
        View view = this.f19551i;
        if (view != null) {
            view.setPressed(false);
            refreshDrawableState();
            this.f19551i = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m25240R(int i) {
        EdgeEffectCompat edgeEffectCompat;
        if (this.f19566x != null && this.f19567y != null) {
            int i2 = this.f19554l + i;
            Scroller scroller = this.f19543a;
            if (scroller == null || scroller.isFinished()) {
                if (i2 < 0) {
                    this.f19566x.onPull(((float) Math.abs(i)) / ((float) getRenderWidth()));
                    if (!this.f19567y.isFinished()) {
                        edgeEffectCompat = this.f19567y;
                    } else {
                        return;
                    }
                } else if (i2 > this.f19557o) {
                    this.f19567y.onPull(((float) Math.abs(i)) / ((float) getRenderWidth()));
                    if (!this.f19566x.isFinished()) {
                        edgeEffectCompat = this.f19566x;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                edgeEffectCompat.onRelease();
            }
        }
    }

    private View getLeftmostChild() {
        return getChildAt(0);
    }

    private int getRenderHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getRenderWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private View getRightmostChild() {
        return getChildAt(getChildCount() - 1);
    }

    /* renamed from: m */
    private void m25253m(View view, int i) {
        addViewInLayout(view, i, m25266z(view), true);
        m25231G(view);
    }

    /* renamed from: n */
    private void m25254n() {
        setOnTouchListener(new C10433a());
    }

    /* renamed from: o */
    private float m25255o() {
        if (Build.VERSION.SDK_INT >= 14) {
            return C10438f.m25270a(this.f19543a);
        }
        return 30.0f;
    }

    /* renamed from: p */
    private void m25256p() {
        ListAdapter listAdapter;
        if (this.f19561s != null && (listAdapter = this.f19547e) != null && listAdapter.getCount() - (this.f19559q + 1) < this.f19562t && !this.f19563u) {
            this.f19563u = true;
            this.f19561s.mo32972a();
        }
    }

    /* renamed from: q */
    private boolean m25257q() {
        View rightmostChild;
        if (m25230F(this.f19559q) && (rightmostChild = getRightmostChild()) != null) {
            int i = this.f19557o;
            int right = (this.f19554l + (rightmostChild.getRight() - getPaddingLeft())) - getRenderWidth();
            this.f19557o = right;
            if (right < 0) {
                this.f19557o = 0;
            }
            if (this.f19557o != i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    private void m25258r(Canvas canvas, Rect rect) {
        Drawable drawable = this.f19553k;
        if (drawable != null) {
            drawable.setBounds(rect);
            this.f19553k.draw(canvas);
        }
    }

    /* renamed from: s */
    private void m25259s(Canvas canvas) {
        int childCount = getChildCount();
        Rect rect = this.f19550h;
        rect.top = getPaddingTop();
        Rect rect2 = this.f19550h;
        rect2.bottom = rect2.top + getRenderHeight();
        for (int i = 0; i < childCount; i++) {
            if (i != childCount - 1 || !m25230F(this.f19559q)) {
                View childAt = getChildAt(i);
                rect.left = childAt.getRight();
                rect.right = childAt.getRight() + this.f19552j;
                if (rect.left < getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                }
                if (rect.right > getWidth() - getPaddingRight()) {
                    rect.right = getWidth() - getPaddingRight();
                }
                m25258r(canvas, rect);
                if (i == 0 && childAt.getLeft() > getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                    rect.right = childAt.getLeft();
                    m25258r(canvas, rect);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void setCurrentScrollState(C10439g.C10440a aVar) {
        C10439g gVar;
        if (!(this.f19565w == aVar || (gVar = this.f19564v) == null)) {
            gVar.mo32971a(aVar);
        }
        this.f19565w = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007e, code lost:
        if (r4.f19567y.draw(r5) != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        if (r4.f19566x.draw(r5) != false) goto L_0x003d;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25260t(android.graphics.Canvas r5) {
        /*
            r4 = this;
            androidx.core.widget.EdgeEffectCompat r0 = r4.f19566x
            r1 = 0
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0044
            boolean r0 = r4.m25228D()
            if (r0 == 0) goto L_0x0044
            int r0 = r5.save()
            int r2 = r4.getHeight()
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5.rotate(r3, r1, r1)
            int r2 = -r2
            int r3 = r4.getPaddingBottom()
            int r2 = r2 + r3
            float r2 = (float) r2
            r5.translate(r2, r1)
            androidx.core.widget.EdgeEffectCompat r1 = r4.f19566x
            int r2 = r4.getRenderHeight()
            int r3 = r4.getRenderWidth()
            r1.setSize(r2, r3)
            androidx.core.widget.EdgeEffectCompat r1 = r4.f19566x
            boolean r1 = r1.draw(r5)
            if (r1 == 0) goto L_0x0040
        L_0x003d:
            r4.invalidate()
        L_0x0040:
            r5.restoreToCount(r0)
            goto L_0x0081
        L_0x0044:
            androidx.core.widget.EdgeEffectCompat r0 = r4.f19567y
            if (r0 == 0) goto L_0x0081
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0081
            boolean r0 = r4.m25228D()
            if (r0 == 0) goto L_0x0081
            int r0 = r5.save()
            int r2 = r4.getWidth()
            r3 = 1119092736(0x42b40000, float:90.0)
            r5.rotate(r3, r1, r1)
            int r1 = r4.getPaddingTop()
            float r1 = (float) r1
            int r2 = -r2
            float r2 = (float) r2
            r5.translate(r1, r2)
            androidx.core.widget.EdgeEffectCompat r1 = r4.f19567y
            int r2 = r4.getRenderHeight()
            int r3 = r4.getRenderWidth()
            r1.setSize(r2, r3)
            androidx.core.widget.EdgeEffectCompat r1 = r4.f19567y
            boolean r1 = r1.draw(r5)
            if (r1 == 0) goto L_0x0040
            goto L_0x003d
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.view.HorizontalListView.m25260t(android.graphics.Canvas):void");
    }

    /* renamed from: u */
    private void m25261u(int i) {
        View rightmostChild = getRightmostChild();
        int i2 = 0;
        m25263w(rightmostChild != null ? rightmostChild.getRight() : 0, i);
        View leftmostChild = getLeftmostChild();
        if (leftmostChild != null) {
            i2 = leftmostChild.getLeft();
        }
        m25262v(i2, i);
    }

    /* renamed from: v */
    private void m25262v(int i, int i2) {
        int i3;
        while ((i + i2) - this.f19552j > 0 && (i3 = this.f19558p) >= 1) {
            int i4 = i3 - 1;
            this.f19558p = i4;
            View view = this.f19547e.getView(i4, m25225A(i4), this);
            m25253m(view, 0);
            i -= this.f19558p == 0 ? view.getMeasuredWidth() : this.f19552j + view.getMeasuredWidth();
            this.f19546d -= i + i2 == 0 ? view.getMeasuredWidth() : view.getMeasuredWidth() + this.f19552j;
        }
    }

    /* renamed from: w */
    private void m25263w(int i, int i2) {
        while (i + i2 + this.f19552j < getWidth() && this.f19559q + 1 < this.f19547e.getCount()) {
            int i3 = this.f19559q + 1;
            this.f19559q = i3;
            if (this.f19558p < 0) {
                this.f19558p = i3;
            }
            ListAdapter listAdapter = this.f19547e;
            int i4 = this.f19559q;
            View view = listAdapter.getView(i4, m25225A(i4), this);
            m25253m(view, -1);
            i += (this.f19559q == 0 ? 0 : this.f19552j) + view.getMeasuredWidth();
            m25256p();
        }
    }

    /* renamed from: x */
    private View m25264x(int i) {
        int i2 = this.f19558p;
        if (i < i2 || i > this.f19559q) {
            return null;
        }
        return getChildAt(i - i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public int m25265y(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getHitRect(this.f19550h);
            if (this.f19550h.contains(i, i2)) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: z */
    private ViewGroup.LayoutParams m25266z(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-2, -1) : layoutParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo32939H(MotionEvent motionEvent) {
        int y;
        this.f19538A = !this.f19543a.isFinished();
        this.f19543a.forceFinished(true);
        setCurrentScrollState(C10439g.C10440a.SCROLL_STATE_IDLE);
        m25239Q();
        if (!this.f19538A && (y = m25265y((int) motionEvent.getX(), (int) motionEvent.getY())) >= 0) {
            View childAt = getChildAt(y);
            this.f19551i = childAt;
            if (childAt != null) {
                childAt.setPressed(true);
                refreshDrawableState();
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo32940I(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f19543a.fling(this.f19555m, 0, (int) (-f), 0, 0, this.f19557o, 0, 0);
        setCurrentScrollState(C10439g.C10440a.SCROLL_STATE_FLING);
        requestLayout();
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m25260t(canvas);
    }

    /* access modifiers changed from: protected */
    public void dispatchSetPressed(boolean z) {
    }

    public ListAdapter getAdapter() {
        return this.f19547e;
    }

    public int getFirstVisiblePosition() {
        return this.f19558p;
    }

    public int getLastVisiblePosition() {
        return this.f19559q;
    }

    /* access modifiers changed from: protected */
    public float getLeftFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i = this.f19554l;
        if (i == 0) {
            return 0.0f;
        }
        if (i < horizontalFadingEdgeLength) {
            return ((float) i) / ((float) horizontalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public float getRightFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i = this.f19554l;
        int i2 = this.f19557o;
        if (i == i2) {
            return 0.0f;
        }
        if (i2 - i < horizontalFadingEdgeLength) {
            return ((float) (i2 - i)) / ((float) horizontalFadingEdgeLength);
        }
        return 1.0f;
    }

    public View getSelectedView() {
        return m25264x(this.f19560r);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m25259s(canvas);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a  */
    @android.annotation.SuppressLint({"WrongCall"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            super.onLayout(r4, r5, r6, r7, r8)
            android.widget.ListAdapter r0 = r3.f19547e
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            r3.invalidate()
            boolean r0 = r3.f19549g
            r1 = 0
            if (r0 == 0) goto L_0x001c
            int r0 = r3.f19554l
            r3.m25226B()
            r3.removeAllViewsInLayout()
            r3.f19555m = r0
            r3.f19549g = r1
        L_0x001c:
            java.lang.Integer r0 = r3.f19556n
            if (r0 == 0) goto L_0x0029
            int r0 = r0.intValue()
            r3.f19555m = r0
            r0 = 0
            r3.f19556n = r0
        L_0x0029:
            android.widget.Scroller r0 = r3.f19543a
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x0039
            android.widget.Scroller r0 = r3.f19543a
            int r0 = r0.getCurrX()
            r3.f19555m = r0
        L_0x0039:
            int r0 = r3.f19555m
            r2 = 1
            if (r0 >= 0) goto L_0x005d
            r3.f19555m = r1
            androidx.core.widget.EdgeEffectCompat r0 = r3.f19566x
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0052
            androidx.core.widget.EdgeEffectCompat r0 = r3.f19566x
        L_0x004a:
            float r1 = r3.m25255o()
            int r1 = (int) r1
            r0.onAbsorb(r1)
        L_0x0052:
            android.widget.Scroller r0 = r3.f19543a
            r0.forceFinished(r2)
            com.yeelight.yeelib.ui.view.HorizontalListView$g$a r0 = com.yeelight.yeelib.p194ui.view.HorizontalListView.C10439g.C10440a.SCROLL_STATE_IDLE
            r3.setCurrentScrollState(r0)
            goto L_0x006e
        L_0x005d:
            int r1 = r3.f19557o
            if (r0 <= r1) goto L_0x006e
            r3.f19555m = r1
            androidx.core.widget.EdgeEffectCompat r0 = r3.f19567y
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0052
            androidx.core.widget.EdgeEffectCompat r0 = r3.f19567y
            goto L_0x004a
        L_0x006e:
            int r0 = r3.f19554l
            int r1 = r3.f19555m
            int r0 = r0 - r1
            r3.m25235M(r0)
            r3.m25261u(r0)
            r3.m25232J(r0)
            int r0 = r3.f19555m
            r3.f19554l = r0
            boolean r0 = r3.m25257q()
            if (r0 == 0) goto L_0x008a
            r3.onLayout(r4, r5, r6, r7, r8)
            return
        L_0x008a:
            android.widget.Scroller r4 = r3.f19543a
            boolean r4 = r4.isFinished()
            if (r4 == 0) goto L_0x009e
            com.yeelight.yeelib.ui.view.HorizontalListView$g$a r4 = r3.f19565w
            com.yeelight.yeelib.ui.view.HorizontalListView$g$a r5 = com.yeelight.yeelib.p194ui.view.HorizontalListView.C10439g.C10440a.SCROLL_STATE_FLING
            if (r4 != r5) goto L_0x00a3
            com.yeelight.yeelib.ui.view.HorizontalListView$g$a r4 = com.yeelight.yeelib.p194ui.view.HorizontalListView.C10439g.C10440a.SCROLL_STATE_IDLE
            r3.setCurrentScrollState(r4)
            goto L_0x00a3
        L_0x009e:
            java.lang.Runnable r4 = r3.f19542I
            androidx.core.view.ViewCompat.postOnAnimation(r3, r4)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.view.HorizontalListView.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f19568z = i2;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f19556n = Integer.valueOf(bundle.getInt("BUNDLE_ID_CURRENT_X"));
            super.onRestoreInstanceState(bundle.getParcelable("BUNDLE_ID_PARENT_STATE"));
        }
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("BUNDLE_ID_PARENT_STATE", super.onSaveInstanceState());
        bundle.putInt("BUNDLE_ID_CURRENT_X", this.f19554l);
        return bundle;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Scroller scroller = this.f19543a;
            if (scroller == null || scroller.isFinished()) {
                setCurrentScrollState(C10439g.C10440a.SCROLL_STATE_IDLE);
            }
            m25236N(Boolean.FALSE);
            m25234L();
        } else if (motionEvent.getAction() == 3) {
            m25239Q();
            m25234L();
            m25236N(Boolean.FALSE);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.f19547e;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this.f19541H);
        }
        if (listAdapter != null) {
            this.f19563u = false;
            this.f19547e = listAdapter;
            listAdapter.registerDataSetObserver(this.f19541H);
        }
        m25227C(this.f19547e.getViewTypeCount());
        m25237O();
    }

    public void setDivider(Drawable drawable) {
        this.f19553k = drawable;
        setDividerWidth(drawable != null ? drawable.getIntrinsicWidth() : 0);
    }

    public void setDividerWidth(int i) {
        this.f19552j = i;
        requestLayout();
        invalidate();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f19540G = onClickListener;
    }

    public void setOnScrollStateChangedListener(C10439g gVar) {
        this.f19564v = gVar;
    }

    public void setSelection(int i) {
        this.f19560r = i;
    }
}
