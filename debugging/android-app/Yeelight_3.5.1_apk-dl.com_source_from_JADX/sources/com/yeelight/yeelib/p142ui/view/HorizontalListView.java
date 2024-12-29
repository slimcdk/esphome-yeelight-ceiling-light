package com.yeelight.yeelib.p142ui.view;

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
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
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
    public boolean f15800A;

    /* renamed from: B */
    private boolean f15801B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public View.OnClickListener f15802C;

    /* renamed from: Q */
    private DataSetObserver f15803Q;

    /* renamed from: R */
    private Runnable f15804R;

    /* renamed from: a */
    protected Scroller f15805a = new Scroller(getContext());

    /* renamed from: b */
    private final C8815d f15806b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public GestureDetector f15807c;

    /* renamed from: d */
    private int f15808d;

    /* renamed from: e */
    protected ListAdapter f15809e;

    /* renamed from: f */
    private List<Queue<View>> f15810f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f15811g;

    /* renamed from: h */
    private Rect f15812h;

    /* renamed from: i */
    private View f15813i;

    /* renamed from: j */
    private int f15814j;

    /* renamed from: k */
    private Drawable f15815k;

    /* renamed from: l */
    protected int f15816l;

    /* renamed from: m */
    protected int f15817m;

    /* renamed from: n */
    private Integer f15818n;

    /* renamed from: o */
    private int f15819o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f15820p;

    /* renamed from: q */
    private int f15821q;

    /* renamed from: r */
    private int f15822r;

    /* renamed from: s */
    private C8818g f15823s;

    /* renamed from: t */
    private int f15824t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f15825u;

    /* renamed from: v */
    private OnScrollStateChangedListener f15826v;

    /* renamed from: w */
    private OnScrollStateChangedListener.ScrollState f15827w;

    /* renamed from: x */
    private EdgeEffectCompat f15828x;

    /* renamed from: y */
    private EdgeEffectCompat f15829y;

    /* renamed from: z */
    private int f15830z;

    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$OnScrollStateChangedListener */
    public interface OnScrollStateChangedListener {

        /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$OnScrollStateChangedListener$ScrollState */
        public enum ScrollState {
            SCROLL_STATE_IDLE,
            SCROLL_STATE_TOUCH_SCROLL,
            SCROLL_STATE_FLING
        }

        /* renamed from: a */
        void mo36332a(ScrollState scrollState);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$a */
    class C8812a implements View.OnTouchListener {
        C8812a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return HorizontalListView.this.f15807c.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$b */
    class C8813b extends DataSetObserver {
        C8813b() {
        }

        public void onChanged() {
            boolean unused = HorizontalListView.this.f15811g = true;
            boolean unused2 = HorizontalListView.this.f15825u = false;
            HorizontalListView.this.m20850Q();
            HorizontalListView.this.invalidate();
            HorizontalListView.this.requestLayout();
        }

        public void onInvalidated() {
            boolean unused = HorizontalListView.this.f15825u = false;
            HorizontalListView.this.m20850Q();
            HorizontalListView.this.m20848O();
            HorizontalListView.this.invalidate();
            HorizontalListView.this.requestLayout();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$c */
    class C8814c implements Runnable {
        C8814c() {
        }

        public void run() {
            HorizontalListView.this.requestLayout();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$d */
    private class C8815d extends GestureDetector.SimpleOnGestureListener {
        private C8815d() {
        }

        /* synthetic */ C8815d(HorizontalListView horizontalListView, C8812a aVar) {
            this();
        }

        public boolean onDown(MotionEvent motionEvent) {
            return HorizontalListView.this.mo36309H(motionEvent);
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return HorizontalListView.this.mo36310I(motionEvent, motionEvent2, f, f2);
        }

        public void onLongPress(MotionEvent motionEvent) {
            HorizontalListView.this.m20850Q();
            int l = HorizontalListView.this.m20876y((int) motionEvent.getX(), (int) motionEvent.getY());
            if (l >= 0 && !HorizontalListView.this.f15800A) {
                View childAt = HorizontalListView.this.getChildAt(l);
                AdapterView.OnItemLongClickListener onItemLongClickListener = HorizontalListView.this.getOnItemLongClickListener();
                if (onItemLongClickListener != null) {
                    int c = HorizontalListView.this.f15820p + l;
                    HorizontalListView horizontalListView = HorizontalListView.this;
                    if (onItemLongClickListener.onItemLongClick(horizontalListView, childAt, c, horizontalListView.f15809e.getItemId(c))) {
                        HorizontalListView.this.performHapticFeedback(0);
                    }
                }
            }
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            HorizontalListView.this.m20847N(Boolean.TRUE);
            HorizontalListView.this.setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_TOUCH_SCROLL);
            HorizontalListView.this.m20850Q();
            HorizontalListView horizontalListView = HorizontalListView.this;
            horizontalListView.f15817m += (int) f;
            horizontalListView.m20851R(Math.round(f));
            HorizontalListView.this.requestLayout();
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            HorizontalListView.this.m20850Q();
            AdapterView.OnItemClickListener onItemClickListener = HorizontalListView.this.getOnItemClickListener();
            int l = HorizontalListView.this.m20876y((int) motionEvent.getX(), (int) motionEvent.getY());
            if (l >= 0 && !HorizontalListView.this.f15800A) {
                View childAt = HorizontalListView.this.getChildAt(l);
                int c = HorizontalListView.this.f15820p + l;
                if (onItemClickListener != null) {
                    HorizontalListView horizontalListView = HorizontalListView.this;
                    onItemClickListener.onItemClick(horizontalListView, childAt, c, horizontalListView.f15809e.getItemId(c));
                    return true;
                }
            }
            if (HorizontalListView.this.f15802C == null || HorizontalListView.this.f15800A) {
                return false;
            }
            HorizontalListView.this.f15802C.onClick(HorizontalListView.this);
            return false;
        }
    }

    @TargetApi(11)
    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$e */
    private static final class C8816e {
        static {
            if (Build.VERSION.SDK_INT < 11) {
                throw new RuntimeException("Should not get to HoneycombPlus class unless sdk is >= 11!");
            }
        }

        /* renamed from: a */
        public static void m20881a(Scroller scroller, float f) {
            if (scroller != null) {
                scroller.setFriction(f);
            }
        }
    }

    @TargetApi(14)
    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$f */
    private static final class C8817f {
        static {
            if (Build.VERSION.SDK_INT < 14) {
                throw new RuntimeException("Should not get to IceCreamSandwichPlus class unless sdk is >= 14!");
            }
        }

        /* renamed from: a */
        public static float m20882a(Scroller scroller) {
            return scroller.getCurrVelocity();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.HorizontalListView$g */
    public interface C8818g {
        /* renamed from: a */
        void mo36342a();
    }

    public HorizontalListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8815d dVar = new C8815d(this, (C8812a) null);
        this.f15806b = dVar;
        this.f15810f = new ArrayList();
        this.f15811g = false;
        this.f15812h = new Rect();
        this.f15813i = null;
        this.f15814j = 0;
        this.f15815k = null;
        this.f15818n = null;
        this.f15819o = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f15823s = null;
        this.f15824t = 0;
        this.f15825u = false;
        this.f15826v = null;
        this.f15827w = OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE;
        this.f15800A = false;
        this.f15801B = false;
        this.f15803Q = new C8813b();
        this.f15804R = new C8814c();
        this.f15828x = new EdgeEffectCompat(context);
        this.f15829y = new EdgeEffectCompat(context);
        this.f15807c = new GestureDetector(context, dVar);
        m20865n();
        m20837B();
        m20849P(context, attributeSet);
        setWillNotDraw(false);
        if (Build.VERSION.SDK_INT >= 11) {
            C8816e.m20881a(this.f15805a, 0.009f);
        }
    }

    /* renamed from: A */
    private View m20836A(int i) {
        int itemViewType = this.f15809e.getItemViewType(i);
        if (m20840E(itemViewType)) {
            return (View) this.f15810f.get(itemViewType).poll();
        }
        return null;
    }

    /* renamed from: B */
    private void m20837B() {
        this.f15820p = -1;
        this.f15821q = -1;
        this.f15808d = 0;
        this.f15816l = 0;
        this.f15817m = 0;
        this.f15819o = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
    }

    /* renamed from: C */
    private void m20838C(int i) {
        this.f15810f.clear();
        for (int i2 = 0; i2 < i; i2++) {
            this.f15810f.add(new LinkedList());
        }
    }

    /* renamed from: D */
    private boolean m20839D() {
        ListAdapter listAdapter = this.f15809e;
        return listAdapter != null && !listAdapter.isEmpty() && this.f15819o > 0;
    }

    /* renamed from: E */
    private boolean m20840E(int i) {
        return i < this.f15810f.size();
    }

    /* renamed from: F */
    private boolean m20841F(int i) {
        return i == this.f15809e.getCount() - 1;
    }

    /* renamed from: G */
    private void m20842G(View view) {
        ViewGroup.LayoutParams z = m20877z(view);
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f15830z, getPaddingTop() + getPaddingBottom(), z.height);
        int i = z.width;
        view.measure(i > 0 ? View.MeasureSpec.makeMeasureSpec(i, BasicMeasure.EXACTLY) : View.MeasureSpec.makeMeasureSpec(0, 0), childMeasureSpec);
    }

    /* renamed from: J */
    private void m20843J(int i) {
        int childCount = getChildCount();
        if (childCount > 0) {
            int i2 = this.f15808d + i;
            this.f15808d = i2;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                int paddingLeft = getPaddingLeft() + i2;
                int paddingTop = getPaddingTop();
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                i2 += childAt.getMeasuredWidth() + this.f15814j;
            }
        }
    }

    /* renamed from: K */
    private void m20844K(int i, View view) {
        int itemViewType = this.f15809e.getItemViewType(i);
        if (m20840E(itemViewType)) {
            this.f15810f.get(itemViewType).offer(view);
        }
    }

    /* renamed from: L */
    private void m20845L() {
        EdgeEffectCompat edgeEffectCompat = this.f15828x;
        if (edgeEffectCompat != null) {
            edgeEffectCompat.onRelease();
        }
        EdgeEffectCompat edgeEffectCompat2 = this.f15829y;
        if (edgeEffectCompat2 != null) {
            edgeEffectCompat2.onRelease();
        }
    }

    /* renamed from: M */
    private void m20846M(int i) {
        while (true) {
            View leftmostChild = getLeftmostChild();
            if (leftmostChild != null && leftmostChild.getRight() + i <= 0) {
                this.f15808d += m20841F(this.f15820p) ? leftmostChild.getMeasuredWidth() : this.f15814j + leftmostChild.getMeasuredWidth();
                m20844K(this.f15820p, leftmostChild);
                removeViewInLayout(leftmostChild);
                this.f15820p++;
            }
        }
        while (true) {
            View rightmostChild = getRightmostChild();
            if (rightmostChild != null && rightmostChild.getLeft() + i >= getWidth()) {
                m20844K(this.f15821q, rightmostChild);
                removeViewInLayout(rightmostChild);
                this.f15821q--;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m20847N(Boolean bool) {
        if (this.f15801B != bool.booleanValue()) {
            for (View view = this; view.getParent() instanceof View; view = (View) view.getParent()) {
                if ((view.getParent() instanceof ListView) || (view.getParent() instanceof ScrollView)) {
                    view.getParent().requestDisallowInterceptTouchEvent(bool.booleanValue());
                    this.f15801B = bool.booleanValue();
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m20848O() {
        m20837B();
        removeAllViewsInLayout();
        requestLayout();
    }

    /* renamed from: P */
    private void m20849P(Context context, AttributeSet attributeSet) {
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
    public void m20850Q() {
        View view = this.f15813i;
        if (view != null) {
            view.setPressed(false);
            refreshDrawableState();
            this.f15813i = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m20851R(int i) {
        EdgeEffectCompat edgeEffectCompat;
        if (this.f15828x != null && this.f15829y != null) {
            int i2 = this.f15816l + i;
            Scroller scroller = this.f15805a;
            if (scroller == null || scroller.isFinished()) {
                if (i2 < 0) {
                    this.f15828x.onPull(((float) Math.abs(i)) / ((float) getRenderWidth()));
                    if (!this.f15829y.isFinished()) {
                        edgeEffectCompat = this.f15829y;
                    } else {
                        return;
                    }
                } else if (i2 > this.f15819o) {
                    this.f15829y.onPull(((float) Math.abs(i)) / ((float) getRenderWidth()));
                    if (!this.f15828x.isFinished()) {
                        edgeEffectCompat = this.f15828x;
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
    private void m20864m(View view, int i) {
        addViewInLayout(view, i, m20877z(view), true);
        m20842G(view);
    }

    /* renamed from: n */
    private void m20865n() {
        setOnTouchListener(new C8812a());
    }

    /* renamed from: o */
    private float m20866o() {
        if (Build.VERSION.SDK_INT >= 14) {
            return C8817f.m20882a(this.f15805a);
        }
        return 30.0f;
    }

    /* renamed from: p */
    private void m20867p() {
        ListAdapter listAdapter;
        if (this.f15823s != null && (listAdapter = this.f15809e) != null && listAdapter.getCount() - (this.f15821q + 1) < this.f15824t && !this.f15825u) {
            this.f15825u = true;
            this.f15823s.mo36342a();
        }
    }

    /* renamed from: q */
    private boolean m20868q() {
        View rightmostChild;
        if (m20841F(this.f15821q) && (rightmostChild = getRightmostChild()) != null) {
            int i = this.f15819o;
            int right = (this.f15816l + (rightmostChild.getRight() - getPaddingLeft())) - getRenderWidth();
            this.f15819o = right;
            if (right < 0) {
                this.f15819o = 0;
            }
            if (this.f15819o != i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    private void m20869r(Canvas canvas, Rect rect) {
        Drawable drawable = this.f15815k;
        if (drawable != null) {
            drawable.setBounds(rect);
            this.f15815k.draw(canvas);
        }
    }

    /* renamed from: s */
    private void m20870s(Canvas canvas) {
        int childCount = getChildCount();
        Rect rect = this.f15812h;
        rect.top = getPaddingTop();
        Rect rect2 = this.f15812h;
        rect2.bottom = rect2.top + getRenderHeight();
        for (int i = 0; i < childCount; i++) {
            if (i != childCount - 1 || !m20841F(this.f15821q)) {
                View childAt = getChildAt(i);
                rect.left = childAt.getRight();
                rect.right = childAt.getRight() + this.f15814j;
                if (rect.left < getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                }
                if (rect.right > getWidth() - getPaddingRight()) {
                    rect.right = getWidth() - getPaddingRight();
                }
                m20869r(canvas, rect);
                if (i == 0 && childAt.getLeft() > getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                    rect.right = childAt.getLeft();
                    m20869r(canvas, rect);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void setCurrentScrollState(OnScrollStateChangedListener.ScrollState scrollState) {
        OnScrollStateChangedListener onScrollStateChangedListener;
        if (!(this.f15827w == scrollState || (onScrollStateChangedListener = this.f15826v) == null)) {
            onScrollStateChangedListener.mo36332a(scrollState);
        }
        this.f15827w = scrollState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007e, code lost:
        if (r4.f15829y.draw(r5) != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        if (r4.f15828x.draw(r5) != false) goto L_0x003d;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20871t(android.graphics.Canvas r5) {
        /*
            r4 = this;
            androidx.core.widget.EdgeEffectCompat r0 = r4.f15828x
            r1 = 0
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0044
            boolean r0 = r4.m20839D()
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
            androidx.core.widget.EdgeEffectCompat r1 = r4.f15828x
            int r2 = r4.getRenderHeight()
            int r3 = r4.getRenderWidth()
            r1.setSize(r2, r3)
            androidx.core.widget.EdgeEffectCompat r1 = r4.f15828x
            boolean r1 = r1.draw(r5)
            if (r1 == 0) goto L_0x0040
        L_0x003d:
            r4.invalidate()
        L_0x0040:
            r5.restoreToCount(r0)
            goto L_0x0081
        L_0x0044:
            androidx.core.widget.EdgeEffectCompat r0 = r4.f15829y
            if (r0 == 0) goto L_0x0081
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0081
            boolean r0 = r4.m20839D()
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
            androidx.core.widget.EdgeEffectCompat r1 = r4.f15829y
            int r2 = r4.getRenderHeight()
            int r3 = r4.getRenderWidth()
            r1.setSize(r2, r3)
            androidx.core.widget.EdgeEffectCompat r1 = r4.f15829y
            boolean r1 = r1.draw(r5)
            if (r1 == 0) goto L_0x0040
            goto L_0x003d
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.view.HorizontalListView.m20871t(android.graphics.Canvas):void");
    }

    /* renamed from: u */
    private void m20872u(int i) {
        View rightmostChild = getRightmostChild();
        int i2 = 0;
        m20874w(rightmostChild != null ? rightmostChild.getRight() : 0, i);
        View leftmostChild = getLeftmostChild();
        if (leftmostChild != null) {
            i2 = leftmostChild.getLeft();
        }
        m20873v(i2, i);
    }

    /* renamed from: v */
    private void m20873v(int i, int i2) {
        int i3;
        while ((i + i2) - this.f15814j > 0 && (i3 = this.f15820p) >= 1) {
            int i4 = i3 - 1;
            this.f15820p = i4;
            View view = this.f15809e.getView(i4, m20836A(i4), this);
            m20864m(view, 0);
            i -= this.f15820p == 0 ? view.getMeasuredWidth() : this.f15814j + view.getMeasuredWidth();
            this.f15808d -= i + i2 == 0 ? view.getMeasuredWidth() : view.getMeasuredWidth() + this.f15814j;
        }
    }

    /* renamed from: w */
    private void m20874w(int i, int i2) {
        while (i + i2 + this.f15814j < getWidth() && this.f15821q + 1 < this.f15809e.getCount()) {
            int i3 = this.f15821q + 1;
            this.f15821q = i3;
            if (this.f15820p < 0) {
                this.f15820p = i3;
            }
            View view = this.f15809e.getView(i3, m20836A(i3), this);
            m20864m(view, -1);
            i += (this.f15821q == 0 ? 0 : this.f15814j) + view.getMeasuredWidth();
            m20867p();
        }
    }

    /* renamed from: x */
    private View m20875x(int i) {
        int i2 = this.f15820p;
        if (i < i2 || i > this.f15821q) {
            return null;
        }
        return getChildAt(i - i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public int m20876y(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getHitRect(this.f15812h);
            if (this.f15812h.contains(i, i2)) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: z */
    private ViewGroup.LayoutParams m20877z(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-2, -1) : layoutParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo36309H(MotionEvent motionEvent) {
        int y;
        this.f15800A = !this.f15805a.isFinished();
        this.f15805a.forceFinished(true);
        setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
        m20850Q();
        if (!this.f15800A && (y = m20876y((int) motionEvent.getX(), (int) motionEvent.getY())) >= 0) {
            View childAt = getChildAt(y);
            this.f15813i = childAt;
            if (childAt != null) {
                childAt.setPressed(true);
                refreshDrawableState();
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo36310I(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f15805a.fling(this.f15817m, 0, (int) (-f), 0, 0, this.f15819o, 0, 0);
        setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_FLING);
        requestLayout();
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m20871t(canvas);
    }

    /* access modifiers changed from: protected */
    public void dispatchSetPressed(boolean z) {
    }

    public ListAdapter getAdapter() {
        return this.f15809e;
    }

    public int getFirstVisiblePosition() {
        return this.f15820p;
    }

    public int getLastVisiblePosition() {
        return this.f15821q;
    }

    /* access modifiers changed from: protected */
    public float getLeftFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i = this.f15816l;
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
        int i = this.f15816l;
        int i2 = this.f15819o;
        if (i == i2) {
            return 0.0f;
        }
        if (i2 - i < horizontalFadingEdgeLength) {
            return ((float) (i2 - i)) / ((float) horizontalFadingEdgeLength);
        }
        return 1.0f;
    }

    public View getSelectedView() {
        return m20875x(this.f15822r);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m20870s(canvas);
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
            android.widget.ListAdapter r0 = r3.f15809e
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            r3.invalidate()
            boolean r0 = r3.f15811g
            r1 = 0
            if (r0 == 0) goto L_0x001c
            int r0 = r3.f15816l
            r3.m20837B()
            r3.removeAllViewsInLayout()
            r3.f15817m = r0
            r3.f15811g = r1
        L_0x001c:
            java.lang.Integer r0 = r3.f15818n
            if (r0 == 0) goto L_0x0029
            int r0 = r0.intValue()
            r3.f15817m = r0
            r0 = 0
            r3.f15818n = r0
        L_0x0029:
            android.widget.Scroller r0 = r3.f15805a
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x0039
            android.widget.Scroller r0 = r3.f15805a
            int r0 = r0.getCurrX()
            r3.f15817m = r0
        L_0x0039:
            int r0 = r3.f15817m
            r2 = 1
            if (r0 >= 0) goto L_0x005d
            r3.f15817m = r1
            androidx.core.widget.EdgeEffectCompat r0 = r3.f15828x
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0052
            androidx.core.widget.EdgeEffectCompat r0 = r3.f15828x
        L_0x004a:
            float r1 = r3.m20866o()
            int r1 = (int) r1
            r0.onAbsorb(r1)
        L_0x0052:
            android.widget.Scroller r0 = r3.f15805a
            r0.forceFinished(r2)
            com.yeelight.yeelib.ui.view.HorizontalListView$OnScrollStateChangedListener$ScrollState r0 = com.yeelight.yeelib.p142ui.view.HorizontalListView.OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE
            r3.setCurrentScrollState(r0)
            goto L_0x006e
        L_0x005d:
            int r1 = r3.f15819o
            if (r0 <= r1) goto L_0x006e
            r3.f15817m = r1
            androidx.core.widget.EdgeEffectCompat r0 = r3.f15829y
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0052
            androidx.core.widget.EdgeEffectCompat r0 = r3.f15829y
            goto L_0x004a
        L_0x006e:
            int r0 = r3.f15816l
            int r1 = r3.f15817m
            int r0 = r0 - r1
            r3.m20846M(r0)
            r3.m20872u(r0)
            r3.m20843J(r0)
            int r0 = r3.f15817m
            r3.f15816l = r0
            boolean r0 = r3.m20868q()
            if (r0 == 0) goto L_0x008a
            r3.onLayout(r4, r5, r6, r7, r8)
            return
        L_0x008a:
            android.widget.Scroller r4 = r3.f15805a
            boolean r4 = r4.isFinished()
            if (r4 == 0) goto L_0x009e
            com.yeelight.yeelib.ui.view.HorizontalListView$OnScrollStateChangedListener$ScrollState r4 = r3.f15827w
            com.yeelight.yeelib.ui.view.HorizontalListView$OnScrollStateChangedListener$ScrollState r5 = com.yeelight.yeelib.p142ui.view.HorizontalListView.OnScrollStateChangedListener.ScrollState.SCROLL_STATE_FLING
            if (r4 != r5) goto L_0x00a3
            com.yeelight.yeelib.ui.view.HorizontalListView$OnScrollStateChangedListener$ScrollState r4 = com.yeelight.yeelib.p142ui.view.HorizontalListView.OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE
            r3.setCurrentScrollState(r4)
            goto L_0x00a3
        L_0x009e:
            java.lang.Runnable r4 = r3.f15804R
            androidx.core.view.ViewCompat.postOnAnimation(r3, r4)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.view.HorizontalListView.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f15830z = i2;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f15818n = Integer.valueOf(bundle.getInt("BUNDLE_ID_CURRENT_X"));
            super.onRestoreInstanceState(bundle.getParcelable("BUNDLE_ID_PARENT_STATE"));
        }
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("BUNDLE_ID_PARENT_STATE", super.onSaveInstanceState());
        bundle.putInt("BUNDLE_ID_CURRENT_X", this.f15816l);
        return bundle;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Scroller scroller = this.f15805a;
            if (scroller == null || scroller.isFinished()) {
                setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
            }
            m20847N(Boolean.FALSE);
            m20845L();
        } else if (motionEvent.getAction() == 3) {
            m20850Q();
            m20845L();
            m20847N(Boolean.FALSE);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.f15809e;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this.f15803Q);
        }
        if (listAdapter != null) {
            this.f15825u = false;
            this.f15809e = listAdapter;
            listAdapter.registerDataSetObserver(this.f15803Q);
        }
        m20838C(this.f15809e.getViewTypeCount());
        m20848O();
    }

    public void setDivider(Drawable drawable) {
        this.f15815k = drawable;
        setDividerWidth(drawable != null ? drawable.getIntrinsicWidth() : 0);
    }

    public void setDividerWidth(int i) {
        this.f15814j = i;
        requestLayout();
        invalidate();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f15802C = onClickListener;
    }

    public void setOnScrollStateChangedListener(OnScrollStateChangedListener onScrollStateChangedListener) {
        this.f15826v = onScrollStateChangedListener;
    }

    public void setSelection(int i) {
        this.f15822r = i;
    }
}
