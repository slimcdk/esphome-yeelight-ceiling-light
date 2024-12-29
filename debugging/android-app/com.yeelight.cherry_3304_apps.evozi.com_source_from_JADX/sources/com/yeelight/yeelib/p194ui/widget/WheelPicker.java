package com.yeelight.yeelib.p194ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import androidx.appcompat.widget.ActivityChooserView;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$dimen;
import com.yeelight.yeelib.R$styleable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.widget.WheelPicker */
public class WheelPicker extends View implements Runnable {

    /* renamed from: m0 */
    private static final String f19902m0 = WheelPicker.class.getSimpleName();

    /* renamed from: A */
    private int f19903A;

    /* renamed from: B */
    private int f19904B;

    /* renamed from: G */
    private int f19905G;

    /* renamed from: H */
    private int f19906H;

    /* renamed from: I */
    private int f19907I;

    /* renamed from: J */
    private int f19908J;

    /* renamed from: K */
    private int f19909K;

    /* renamed from: L */
    private int f19910L;

    /* renamed from: M */
    private int f19911M;

    /* renamed from: N */
    private int f19912N;

    /* renamed from: O */
    private int f19913O = 50;

    /* renamed from: P */
    private int f19914P = 8000;

    /* renamed from: Q */
    private int f19915Q;

    /* renamed from: R */
    private int f19916R;

    /* renamed from: S */
    private int f19917S;

    /* renamed from: T */
    private int f19918T;

    /* renamed from: U */
    private int f19919U;

    /* renamed from: V */
    private int f19920V;

    /* renamed from: W */
    private int f19921W;

    /* renamed from: a */
    private final Handler f19922a = new Handler();

    /* renamed from: a0 */
    private int f19923a0;

    /* renamed from: b */
    private Paint f19924b;

    /* renamed from: b0 */
    private int f19925b0 = 8;

    /* renamed from: c */
    private Scroller f19926c;

    /* renamed from: c0 */
    private boolean f19927c0;

    /* renamed from: d */
    private VelocityTracker f19928d;

    /* renamed from: d0 */
    private boolean f19929d0;

    /* renamed from: e */
    private boolean f19930e;

    /* renamed from: e0 */
    private boolean f19931e0;

    /* renamed from: f */
    private C10501a f19932f;

    /* renamed from: f0 */
    private boolean f19933f0;

    /* renamed from: g */
    private C10502b f19934g;

    /* renamed from: g0 */
    private boolean f19935g0;

    /* renamed from: h */
    private Rect f19936h;

    /* renamed from: h0 */
    private boolean f19937h0;

    /* renamed from: i */
    private Rect f19938i;

    /* renamed from: i0 */
    private boolean f19939i0;

    /* renamed from: j */
    private Rect f19940j;

    /* renamed from: j0 */
    private boolean f19941j0;

    /* renamed from: k */
    private Rect f19942k;

    /* renamed from: k0 */
    private String f19943k0;

    /* renamed from: l */
    private Camera f19944l;

    /* renamed from: l0 */
    private boolean f19945l0;

    /* renamed from: m */
    private Matrix f19946m;

    /* renamed from: n */
    private Matrix f19947n;

    /* renamed from: o */
    private List f19948o;

    /* renamed from: p */
    private String f19949p;

    /* renamed from: q */
    private int f19950q;

    /* renamed from: r */
    private int f19951r;

    /* renamed from: s */
    private int f19952s;

    /* renamed from: t */
    private int f19953t;

    /* renamed from: u */
    private int f19954u;

    /* renamed from: v */
    private int f19955v;

    /* renamed from: w */
    private int f19956w;

    /* renamed from: x */
    private int f19957x;

    /* renamed from: y */
    private int f19958y;

    /* renamed from: z */
    private int f19959z;

    /* renamed from: com.yeelight.yeelib.ui.widget.WheelPicker$a */
    public interface C10501a {
        /* renamed from: a */
        void mo32260a(WheelPicker wheelPicker, Object obj, int i);
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.WheelPicker$b */
    public interface C10502b {
        /* renamed from: a */
        void mo33247a(int i);

        /* renamed from: b */
        void mo33248b(int i);

        /* renamed from: c */
        void mo33249c(int i);
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WheelPicker);
        this.f19948o = Arrays.asList(getResources().getStringArray(obtainStyledAttributes.getResourceId(R$styleable.WheelPicker_wheel_data, 0)));
        this.f19957x = obtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelPicker_wheel_item_text_size, getResources().getDimensionPixelSize(R$dimen.WheelItemTextSize));
        this.f19950q = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_visible_item_count, 7);
        this.f19909K = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_selected_item_position, 0);
        this.f19927c0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_same_width, false);
        this.f19920V = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_maximum_width_text_position, -1);
        this.f19949p = obtainStyledAttributes.getString(R$styleable.WheelPicker_wheel_maximum_width_text);
        this.f19956w = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_selected_item_text_color, -1);
        this.f19955v = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_item_text_color, -7829368);
        this.f19904B = obtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelPicker_wheel_item_space, getResources().getDimensionPixelSize(R$dimen.WheelItemSpace));
        this.f19935g0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_cyclic, false);
        this.f19929d0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_indicator, false);
        this.f19959z = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_indicator_color, -1166541);
        this.f19958y = obtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelPicker_wheel_indicator_size, getResources().getDimensionPixelSize(R$dimen.WheelIndicatorSize));
        this.f19931e0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_curtain, false);
        this.f19903A = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_curtain_color, -1996488705);
        this.f19933f0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_atmospheric, false);
        this.f19937h0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_curved, false);
        this.f19905G = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_item_align, 0);
        this.f19943k0 = obtainStyledAttributes.getString(R$styleable.WheelPicker_wheel_font_path);
        obtainStyledAttributes.recycle();
        m25536n();
        Paint paint = new Paint(69);
        this.f19924b = paint;
        paint.setTextSize((float) this.f19957x);
        if (this.f19943k0 != null) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), this.f19943k0));
        }
        m25535m();
        m25532i();
        this.f19926c = new Scroller(getContext());
        if (Build.VERSION.SDK_INT >= 4) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            this.f19913O = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f19914P = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f19925b0 = viewConfiguration.getScaledTouchSlop();
        }
        this.f19936h = new Rect();
        this.f19938i = new Rect();
        this.f19940j = new Rect();
        this.f19942k = new Rect();
        this.f19944l = new Camera();
        this.f19946m = new Matrix();
        this.f19947n = new Matrix();
    }

    /* renamed from: b */
    private void m25525b() {
        if (this.f19931e0 || this.f19956w != -1) {
            Rect rect = this.f19942k;
            Rect rect2 = this.f19936h;
            int i = rect2.left;
            int i2 = this.f19916R;
            int i3 = this.f19907I;
            rect.set(i, i2 - i3, rect2.right, i2 + i3);
        }
    }

    /* renamed from: c */
    private int m25526c(int i) {
        double d = (double) this.f19908J;
        double cos = Math.cos(Math.toRadians((double) i));
        double d2 = (double) this.f19908J;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (int) (d - (cos * d2));
    }

    /* renamed from: d */
    private int m25527d(int i) {
        if (Math.abs(i) <= this.f19907I) {
            return -i;
        }
        return (this.f19919U < 0 ? -this.f19906H : this.f19906H) - i;
    }

    /* renamed from: e */
    private void m25528e() {
        int i = this.f19905G;
        this.f19917S = i != 1 ? i != 2 ? this.f19915Q : this.f19936h.right : this.f19936h.left;
        this.f19918T = (int) (((float) this.f19916R) - ((this.f19924b.ascent() + this.f19924b.descent()) / 2.0f));
    }

    /* renamed from: f */
    private void m25529f() {
        int i = this.f19909K;
        int i2 = this.f19906H;
        int i3 = i * i2;
        this.f19911M = this.f19935g0 ? Integer.MIN_VALUE : ((-i2) * (this.f19948o.size() - 1)) + i3;
        if (this.f19935g0) {
            i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        this.f19912N = i3;
    }

    /* renamed from: g */
    private void m25530g() {
        if (this.f19929d0) {
            int i = this.f19958y / 2;
            int i2 = this.f19916R;
            int i3 = this.f19907I;
            int i4 = i2 + i3;
            int i5 = i2 - i3;
            Rect rect = this.f19938i;
            Rect rect2 = this.f19936h;
            rect.set(rect2.left, i4 - i, rect2.right, i4 + i);
            Rect rect3 = this.f19940j;
            Rect rect4 = this.f19936h;
            rect3.set(rect4.left, i5 - i, rect4.right, i5 + i);
        }
    }

    /* renamed from: h */
    private int m25531h(int i) {
        double sin = Math.sin(Math.toRadians((double) i));
        double d = (double) this.f19908J;
        Double.isNaN(d);
        return (int) (sin * d);
    }

    /* renamed from: i */
    private void m25532i() {
        Paint paint;
        String str;
        float measureText;
        this.f19954u = 0;
        this.f19953t = 0;
        if (this.f19927c0) {
            measureText = this.f19924b.measureText(String.valueOf(this.f19948o.get(0)));
        } else {
            if (m25533j(this.f19920V)) {
                paint = this.f19924b;
                str = String.valueOf(this.f19948o.get(this.f19920V));
            } else if (!TextUtils.isEmpty(this.f19949p)) {
                paint = this.f19924b;
                str = this.f19949p;
            } else {
                for (Object valueOf : this.f19948o) {
                    String valueOf2 = String.valueOf(valueOf);
                    this.f19953t = Math.max(this.f19953t, (int) this.f19924b.measureText(valueOf2));
                }
                Paint.FontMetrics fontMetrics = this.f19924b.getFontMetrics();
                this.f19954u = (int) (fontMetrics.bottom - fontMetrics.top);
            }
            measureText = paint.measureText(str);
        }
        this.f19953t = (int) measureText;
        Paint.FontMetrics fontMetrics2 = this.f19924b.getFontMetrics();
        this.f19954u = (int) (fontMetrics2.bottom - fontMetrics2.top);
    }

    /* renamed from: j */
    private boolean m25533j(int i) {
        return i >= 0 && i < this.f19948o.size();
    }

    /* renamed from: k */
    private int m25534k(int i, int i2, int i3) {
        return i == 1073741824 ? i2 : i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* renamed from: m */
    private void m25535m() {
        Paint.Align align;
        Paint paint;
        int i = this.f19905G;
        if (i == 1) {
            paint = this.f19924b;
            align = Paint.Align.LEFT;
        } else if (i != 2) {
            paint = this.f19924b;
            align = Paint.Align.CENTER;
        } else {
            paint = this.f19924b;
            align = Paint.Align.RIGHT;
        }
        paint.setTextAlign(align);
    }

    /* renamed from: n */
    private void m25536n() {
        int i = this.f19950q;
        if (i >= 2) {
            if (i % 2 == 0) {
                this.f19950q = i + 1;
            }
            int i2 = this.f19950q + 2;
            this.f19951r = i2;
            this.f19952s = i2 / 2;
            return;
        }
        throw new ArithmeticException("Wheel's visible item count can not be less than 2!");
    }

    public int getCurrentItemPosition() {
        return this.f19910L;
    }

    public int getCurtainColor() {
        return this.f19903A;
    }

    public List getData() {
        return this.f19948o;
    }

    public int getIndicatorColor() {
        return this.f19959z;
    }

    public int getIndicatorSize() {
        return this.f19958y;
    }

    public int getItemAlign() {
        return this.f19905G;
    }

    public int getItemSpace() {
        return this.f19904B;
    }

    public int getItemTextColor() {
        return this.f19955v;
    }

    public int getItemTextSize() {
        return this.f19957x;
    }

    public String getMaximumWidthText() {
        return this.f19949p;
    }

    public int getMaximumWidthTextPosition() {
        return this.f19920V;
    }

    public int getSelectedItemPosition() {
        return this.f19909K;
    }

    public int getSelectedItemTextColor() {
        return this.f19956w;
    }

    public Typeface getTypeface() {
        Paint paint = this.f19924b;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    public int getVisibleItemCount() {
        return this.f19950q;
    }

    /* renamed from: l */
    public void mo33217l(int i, boolean z) {
        this.f19930e = false;
        if (!z || !this.f19926c.isFinished()) {
            if (!this.f19926c.isFinished()) {
                this.f19926c.abortAnimation();
            }
            int max = Math.max(Math.min(i, this.f19948o.size() - 1), 0);
            this.f19909K = max;
            this.f19910L = max;
            this.f19919U = 0;
            m25529f();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i2 = i - this.f19910L;
        if (i2 != 0) {
            if (this.f19935g0 && Math.abs(i2) > size / 2) {
                if (i2 > 0) {
                    size = -size;
                }
                i2 += size;
            }
            Scroller scroller = this.f19926c;
            scroller.startScroll(0, scroller.getCurrY(), 0, (-i2) * this.f19906H);
            this.f19922a.post(this);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r17) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            com.yeelight.yeelib.ui.widget.WheelPicker$b r1 = r0.f19934g
            if (r1 == 0) goto L_0x000d
            int r2 = r0.f19919U
            r1.mo33247a(r2)
        L_0x000d:
            int r1 = r0.f19919U
            int r1 = -r1
            int r2 = r0.f19906H
            int r1 = r1 / r2
            int r2 = r0.f19952s
            int r8 = r1 - r2
            int r1 = r0.f19909K
            int r1 = r1 + r8
            int r2 = -r2
            r9 = r1
            r10 = r2
        L_0x001d:
            int r1 = r0.f19909K
            int r1 = r1 + r8
            int r2 = r0.f19951r
            int r1 = r1 + r2
            if (r9 >= r1) goto L_0x01fb
            boolean r1 = r0.f19935g0
            if (r1 == 0) goto L_0x0041
            java.util.List r1 = r0.f19948o
            int r1 = r1.size()
            int r1 = r9 % r1
            if (r1 >= 0) goto L_0x003a
            java.util.List r2 = r0.f19948o
            int r2 = r2.size()
            int r1 = r1 + r2
        L_0x003a:
            java.util.List r2 = r0.f19948o
            java.lang.Object r1 = r2.get(r1)
            goto L_0x004d
        L_0x0041:
            boolean r1 = r0.m25533j(r9)
            if (r1 == 0) goto L_0x0052
            java.util.List r1 = r0.f19948o
            java.lang.Object r1 = r1.get(r9)
        L_0x004d:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0054
        L_0x0052:
            java.lang.String r1 = ""
        L_0x0054:
            android.graphics.Paint r2 = r0.f19924b
            int r3 = r0.f19955v
            r2.setColor(r3)
            android.graphics.Paint r2 = r0.f19924b
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            int r2 = r0.f19918T
            int r3 = r0.f19906H
            int r4 = r10 * r3
            int r4 = r4 + r2
            int r5 = r0.f19919U
            int r5 = r5 % r3
            int r4 = r4 + r5
            boolean r3 = r0.f19937h0
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0119
            int r3 = r2 - r4
            int r3 = java.lang.Math.abs(r3)
            int r2 = r2 - r3
            android.graphics.Rect r3 = r0.f19936h
            int r3 = r3.top
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r6
            int r12 = r0.f19918T
            int r3 = r12 - r3
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1
            if (r4 <= r12) goto L_0x008d
            r12 = 1
            goto L_0x0092
        L_0x008d:
            if (r4 >= r12) goto L_0x0091
            r12 = -1
            goto L_0x0092
        L_0x0091:
            r12 = 0
        L_0x0092:
            float r2 = r6 - r2
            float r2 = -r2
            r13 = 1119092736(0x42b40000, float:90.0)
            float r2 = r2 * r13
            float r12 = (float) r12
            float r2 = r2 * r12
            r12 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x00a4
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
        L_0x00a4:
            int r12 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r13 = r2
        L_0x00aa:
            int r2 = (int) r13
            int r12 = r0.m25531h(r2)
            int r14 = r0.f19915Q
            int r15 = r0.f19905G
            if (r15 == r3) goto L_0x00be
            r3 = 2
            if (r15 == r3) goto L_0x00b9
            goto L_0x00c2
        L_0x00b9:
            android.graphics.Rect r3 = r0.f19936h
            int r14 = r3.right
            goto L_0x00c2
        L_0x00be:
            android.graphics.Rect r3 = r0.f19936h
            int r14 = r3.left
        L_0x00c2:
            int r3 = r0.f19916R
            int r3 = r3 - r12
            android.graphics.Camera r15 = r0.f19944l
            r15.save()
            android.graphics.Camera r15 = r0.f19944l
            r15.rotateX(r13)
            android.graphics.Camera r13 = r0.f19944l
            android.graphics.Matrix r15 = r0.f19946m
            r13.getMatrix(r15)
            android.graphics.Camera r13 = r0.f19944l
            r13.restore()
            android.graphics.Matrix r13 = r0.f19946m
            int r15 = -r14
            float r15 = (float) r15
            int r11 = -r3
            float r11 = (float) r11
            r13.preTranslate(r15, r11)
            android.graphics.Matrix r13 = r0.f19946m
            float r14 = (float) r14
            float r3 = (float) r3
            r13.postTranslate(r14, r3)
            android.graphics.Camera r13 = r0.f19944l
            r13.save()
            android.graphics.Camera r13 = r0.f19944l
            int r2 = r0.m25526c(r2)
            float r2 = (float) r2
            r5 = 0
            r13.translate(r5, r5, r2)
            android.graphics.Camera r2 = r0.f19944l
            android.graphics.Matrix r5 = r0.f19947n
            r2.getMatrix(r5)
            android.graphics.Camera r2 = r0.f19944l
            r2.restore()
            android.graphics.Matrix r2 = r0.f19947n
            r2.preTranslate(r15, r11)
            android.graphics.Matrix r2 = r0.f19947n
            r2.postTranslate(r14, r3)
            android.graphics.Matrix r2 = r0.f19946m
            android.graphics.Matrix r3 = r0.f19947n
            r2.postConcat(r3)
            goto L_0x011a
        L_0x0119:
            r12 = 0
        L_0x011a:
            boolean r2 = r0.f19933f0
            if (r2 == 0) goto L_0x013d
            int r2 = r0.f19918T
            int r3 = r2 - r4
            int r3 = java.lang.Math.abs(r3)
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r6
            int r3 = r0.f19918T
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            if (r2 >= 0) goto L_0x0137
            r11 = 0
            goto L_0x0138
        L_0x0137:
            r11 = r2
        L_0x0138:
            android.graphics.Paint r2 = r0.f19924b
            r2.setAlpha(r11)
        L_0x013d:
            boolean r2 = r0.f19937h0
            if (r2 == 0) goto L_0x0145
            int r2 = r0.f19918T
            int r4 = r2 - r12
        L_0x0145:
            int r2 = r0.f19956w
            r3 = -1
            r17.save()
            if (r2 == r3) goto L_0x0185
            boolean r2 = r0.f19937h0
            if (r2 == 0) goto L_0x0156
            android.graphics.Matrix r2 = r0.f19946m
            r7.concat(r2)
        L_0x0156:
            android.graphics.Rect r2 = r0.f19942k
            android.graphics.Region$Op r3 = android.graphics.Region.Op.DIFFERENCE
            r7.clipRect(r2, r3)
            int r2 = r0.f19917S
            float r2 = (float) r2
            float r3 = (float) r4
            android.graphics.Paint r4 = r0.f19924b
            r7.drawText(r1, r2, r3, r4)
            r17.restore()
            android.graphics.Paint r2 = r0.f19924b
            int r4 = r0.f19956w
            r2.setColor(r4)
            r17.save()
            boolean r2 = r0.f19937h0
            if (r2 == 0) goto L_0x017c
            android.graphics.Matrix r2 = r0.f19946m
            r7.concat(r2)
        L_0x017c:
            android.graphics.Rect r2 = r0.f19942k
            r7.clipRect(r2)
            int r2 = r0.f19917S
            float r2 = (float) r2
            goto L_0x0197
        L_0x0185:
            android.graphics.Rect r2 = r0.f19936h
            r7.clipRect(r2)
            boolean r2 = r0.f19937h0
            if (r2 == 0) goto L_0x0193
            android.graphics.Matrix r2 = r0.f19946m
            r7.concat(r2)
        L_0x0193:
            int r2 = r0.f19917S
            float r2 = (float) r2
            float r3 = (float) r4
        L_0x0197:
            android.graphics.Paint r4 = r0.f19924b
            r7.drawText(r1, r2, r3, r4)
            r17.restore()
            boolean r1 = r0.f19945l0
            if (r1 == 0) goto L_0x01f5
            r17.save()
            android.graphics.Rect r1 = r0.f19936h
            r7.clipRect(r1)
            android.graphics.Paint r1 = r0.f19924b
            r2 = -1166541(0xffffffffffee3333, float:NaN)
            r1.setColor(r2)
            int r1 = r0.f19916R
            int r2 = r0.f19906H
            int r2 = r2 * r10
            int r11 = r1 + r2
            android.graphics.Rect r1 = r0.f19936h
            int r2 = r1.left
            float r2 = (float) r2
            float r5 = (float) r11
            int r1 = r1.right
            float r4 = (float) r1
            android.graphics.Paint r6 = r0.f19924b
            r1 = r17
            r3 = r5
            r1.drawLine(r2, r3, r4, r5, r6)
            android.graphics.Paint r1 = r0.f19924b
            r2 = -13421586(0xffffffffff3333ee, float:-2.3820145E38)
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f19924b
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            int r1 = r0.f19907I
            int r11 = r11 - r1
            android.graphics.Rect r1 = r0.f19936h
            int r2 = r1.left
            float r2 = (float) r2
            float r3 = (float) r11
            int r1 = r1.right
            float r4 = (float) r1
            int r1 = r0.f19906H
            int r11 = r11 + r1
            float r5 = (float) r11
            android.graphics.Paint r6 = r0.f19924b
            r1 = r17
            r1.drawRect(r2, r3, r4, r5, r6)
            r17.restore()
        L_0x01f5:
            int r9 = r9 + 1
            int r10 = r10 + 1
            goto L_0x001d
        L_0x01fb:
            boolean r1 = r0.f19931e0
            if (r1 == 0) goto L_0x0214
            android.graphics.Paint r1 = r0.f19924b
            int r2 = r0.f19903A
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f19924b
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Rect r1 = r0.f19942k
            android.graphics.Paint r2 = r0.f19924b
            r7.drawRect(r1, r2)
        L_0x0214:
            boolean r1 = r0.f19929d0
            if (r1 == 0) goto L_0x0234
            android.graphics.Paint r1 = r0.f19924b
            int r2 = r0.f19959z
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f19924b
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Rect r1 = r0.f19938i
            android.graphics.Paint r2 = r0.f19924b
            r7.drawRect(r1, r2)
            android.graphics.Rect r1 = r0.f19940j
            android.graphics.Paint r2 = r0.f19924b
            r7.drawRect(r1, r2)
        L_0x0234:
            boolean r1 = r0.f19945l0
            if (r1 == 0) goto L_0x02a2
            android.graphics.Paint r1 = r0.f19924b
            r2 = 1144254003(0x4433ee33, float:719.72186)
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f19924b
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            r2 = 0
            r3 = 0
            int r1 = r16.getPaddingLeft()
            float r4 = (float) r1
            int r1 = r16.getHeight()
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f19924b
            r1 = r17
            r1.drawRect(r2, r3, r4, r5, r6)
            int r1 = r16.getWidth()
            float r4 = (float) r1
            int r1 = r16.getPaddingTop()
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f19924b
            r1 = r17
            r1.drawRect(r2, r3, r4, r5, r6)
            int r1 = r16.getWidth()
            int r2 = r16.getPaddingRight()
            int r1 = r1 - r2
            float r2 = (float) r1
            int r1 = r16.getWidth()
            float r4 = (float) r1
            int r1 = r16.getHeight()
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f19924b
            r1 = r17
            r1.drawRect(r2, r3, r4, r5, r6)
            r2 = 0
            int r1 = r16.getHeight()
            int r3 = r16.getPaddingBottom()
            int r1 = r1 - r3
            float r3 = (float) r1
            int r1 = r16.getWidth()
            float r4 = (float) r1
            int r1 = r16.getHeight()
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f19924b
            r1 = r17
            r1.drawRect(r2, r3, r4, r5, r6)
        L_0x02a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.widget.WheelPicker.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f19953t;
        int i4 = this.f19954u;
        int i5 = this.f19950q;
        int i6 = (i4 * i5) + (this.f19904B * (i5 - 1));
        if (this.f19937h0) {
            double d = (double) (i6 * 2);
            Double.isNaN(d);
            i6 = (int) (d / 3.141592653589793d);
        }
        if (this.f19945l0) {
            "Wheel's content size is (" + i3 + Constants.COLON_SEPARATOR + i6 + ")";
        }
        int paddingLeft = i3 + getPaddingLeft() + getPaddingRight();
        int paddingTop = i6 + getPaddingTop() + getPaddingBottom();
        if (this.f19945l0) {
            "Wheel's size is (" + paddingLeft + Constants.COLON_SEPARATOR + paddingTop + ")";
        }
        setMeasuredDimension(m25534k(mode, size, paddingLeft), m25534k(mode2, size2, paddingTop));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f19936h.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.f19945l0) {
            "Wheel's drawn rect size is (" + this.f19936h.width() + Constants.COLON_SEPARATOR + this.f19936h.height() + ") and location is (" + this.f19936h.left + Constants.COLON_SEPARATOR + this.f19936h.top + ")";
        }
        this.f19915Q = this.f19936h.centerX();
        this.f19916R = this.f19936h.centerY();
        m25528e();
        this.f19908J = this.f19936h.height() / 2;
        int height = this.f19936h.height() / this.f19950q;
        this.f19906H = height;
        this.f19907I = height / 2;
        m25529f();
        m25530g();
        m25525b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r14 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0115, code lost:
        if (r14 != null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            int r0 = r14.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x0119
            r2 = 0
            r3 = 0
            if (r0 == r1) goto L_0x0077
            r4 = 2
            if (r0 == r4) goto L_0x002b
            r14 = 3
            if (r0 == r14) goto L_0x0013
            goto L_0x0153
        L_0x0013:
            android.view.ViewParent r14 = r13.getParent()
            if (r14 == 0) goto L_0x0020
            android.view.ViewParent r14 = r13.getParent()
            r14.requestDisallowInterceptTouchEvent(r3)
        L_0x0020:
            android.view.VelocityTracker r14 = r13.f19928d
            if (r14 == 0) goto L_0x0153
        L_0x0024:
            r14.recycle()
            r13.f19928d = r2
            goto L_0x0153
        L_0x002b:
            int r0 = r13.f19923a0
            float r0 = (float) r0
            float r2 = r14.getY()
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r13.f19925b0
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0042
            r13.f19939i0 = r1
            goto L_0x0153
        L_0x0042:
            r13.f19939i0 = r3
            android.view.VelocityTracker r0 = r13.f19928d
            r0.addMovement(r14)
            com.yeelight.yeelib.ui.widget.WheelPicker$b r0 = r13.f19934g
            if (r0 == 0) goto L_0x0050
            r0.mo33248b(r1)
        L_0x0050:
            float r0 = r14.getY()
            int r2 = r13.f19921W
            float r2 = (float) r2
            float r0 = r0 - r2
            float r2 = java.lang.Math.abs(r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0064
            goto L_0x0153
        L_0x0064:
            int r2 = r13.f19919U
            float r2 = (float) r2
            float r2 = r2 + r0
            int r0 = (int) r2
            r13.f19919U = r0
            float r14 = r14.getY()
            int r14 = (int) r14
            r13.f19921W = r14
            r13.invalidate()
            goto L_0x0153
        L_0x0077:
            android.view.ViewParent r0 = r13.getParent()
            if (r0 == 0) goto L_0x0084
            android.view.ViewParent r0 = r13.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L_0x0084:
            boolean r0 = r13.f19939i0
            if (r0 == 0) goto L_0x008e
            boolean r0 = r13.f19941j0
            if (r0 != 0) goto L_0x008e
            goto L_0x0153
        L_0x008e:
            android.view.VelocityTracker r0 = r13.f19928d
            r0.addMovement(r14)
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 4
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r14 < r0) goto L_0x00a3
            android.view.VelocityTracker r14 = r13.f19928d
            int r0 = r13.f19914P
            float r0 = (float) r0
            r14.computeCurrentVelocity(r4, r0)
            goto L_0x00a8
        L_0x00a3:
            android.view.VelocityTracker r14 = r13.f19928d
            r14.computeCurrentVelocity(r4)
        L_0x00a8:
            r13.f19941j0 = r3
            android.view.VelocityTracker r14 = r13.f19928d
            float r14 = r14.getYVelocity()
            int r8 = (int) r14
            int r14 = java.lang.Math.abs(r8)
            int r0 = r13.f19913O
            if (r14 <= r0) goto L_0x00e0
            android.widget.Scroller r4 = r13.f19926c
            r5 = 0
            int r6 = r13.f19919U
            r7 = 0
            r9 = 0
            r10 = 0
            int r11 = r13.f19911M
            int r12 = r13.f19912N
            r4.fling(r5, r6, r7, r8, r9, r10, r11, r12)
            android.widget.Scroller r14 = r13.f19926c
            int r0 = r14.getFinalY()
            android.widget.Scroller r3 = r13.f19926c
            int r3 = r3.getFinalY()
            int r4 = r13.f19906H
            int r3 = r3 % r4
            int r3 = r13.m25527d(r3)
            int r0 = r0 + r3
            r14.setFinalY(r0)
            goto L_0x00ef
        L_0x00e0:
            android.widget.Scroller r14 = r13.f19926c
            int r0 = r13.f19919U
            int r4 = r13.f19906H
            int r4 = r0 % r4
            int r4 = r13.m25527d(r4)
            r14.startScroll(r3, r0, r3, r4)
        L_0x00ef:
            boolean r14 = r13.f19935g0
            if (r14 != 0) goto L_0x010e
            android.widget.Scroller r14 = r13.f19926c
            int r14 = r14.getFinalY()
            int r0 = r13.f19912N
            if (r14 <= r0) goto L_0x0103
        L_0x00fd:
            android.widget.Scroller r14 = r13.f19926c
            r14.setFinalY(r0)
            goto L_0x010e
        L_0x0103:
            android.widget.Scroller r14 = r13.f19926c
            int r14 = r14.getFinalY()
            int r0 = r13.f19911M
            if (r14 >= r0) goto L_0x010e
            goto L_0x00fd
        L_0x010e:
            android.os.Handler r14 = r13.f19922a
            r14.post(r13)
            android.view.VelocityTracker r14 = r13.f19928d
            if (r14 == 0) goto L_0x0153
            goto L_0x0024
        L_0x0119:
            r13.f19930e = r1
            android.view.ViewParent r0 = r13.getParent()
            if (r0 == 0) goto L_0x0128
            android.view.ViewParent r0 = r13.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0128:
            android.view.VelocityTracker r0 = r13.f19928d
            if (r0 != 0) goto L_0x0133
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r13.f19928d = r0
            goto L_0x0136
        L_0x0133:
            r0.clear()
        L_0x0136:
            android.view.VelocityTracker r0 = r13.f19928d
            r0.addMovement(r14)
            android.widget.Scroller r0 = r13.f19926c
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x014a
            android.widget.Scroller r0 = r13.f19926c
            r0.abortAnimation()
            r13.f19941j0 = r1
        L_0x014a:
            float r14 = r14.getY()
            int r14 = (int) r14
            r13.f19921W = r14
            r13.f19923a0 = r14
        L_0x0153:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.widget.WheelPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void run() {
        List list = this.f19948o;
        if (list != null && list.size() != 0) {
            if (this.f19926c.isFinished() && !this.f19941j0) {
                int i = this.f19906H;
                if (i != 0) {
                    int size = (((-this.f19919U) / i) + this.f19909K) % this.f19948o.size();
                    if (size < 0) {
                        size += this.f19948o.size();
                    }
                    if (this.f19945l0) {
                        size + Constants.COLON_SEPARATOR + this.f19948o.get(size) + Constants.COLON_SEPARATOR + this.f19919U;
                    }
                    this.f19910L = size;
                    C10501a aVar = this.f19932f;
                    if (aVar != null && this.f19930e) {
                        aVar.mo32260a(this, this.f19948o.get(size), size);
                    }
                    C10502b bVar = this.f19934g;
                    if (bVar != null && this.f19930e) {
                        bVar.mo33249c(size);
                        this.f19934g.mo33248b(0);
                    }
                } else {
                    return;
                }
            }
            if (this.f19926c.computeScrollOffset()) {
                C10502b bVar2 = this.f19934g;
                if (bVar2 != null) {
                    bVar2.mo33248b(2);
                }
                this.f19919U = this.f19926c.getCurrY();
                postInvalidate();
                this.f19922a.postDelayed(this, 16);
            }
        }
    }

    public void setAtmospheric(boolean z) {
        this.f19933f0 = z;
        invalidate();
    }

    public void setCurtain(boolean z) {
        this.f19931e0 = z;
        m25525b();
        invalidate();
    }

    public void setCurtainColor(int i) {
        this.f19903A = i;
        invalidate();
    }

    public void setCurved(boolean z) {
        this.f19937h0 = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f19935g0 = z;
        m25529f();
        invalidate();
    }

    public void setData(List list) {
        int i;
        if (list != null) {
            this.f19948o = list;
            if (this.f19909K > list.size() - 1 || this.f19910L > list.size() - 1) {
                i = list.size() - 1;
                this.f19910L = i;
            } else {
                i = this.f19910L;
            }
            this.f19909K = i;
            this.f19919U = 0;
            m25532i();
            m25529f();
            requestLayout();
            invalidate();
            return;
        }
        throw new NullPointerException("WheelPicker's data can not be null!");
    }

    public void setDebug(boolean z) {
        this.f19945l0 = z;
    }

    public void setIndicator(boolean z) {
        this.f19929d0 = z;
        m25530g();
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f19959z = i;
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f19958y = i;
        m25530g();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f19905G = i;
        m25535m();
        m25528e();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f19904B = i;
        requestLayout();
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f19955v = i;
        invalidate();
    }

    public void setItemTextSize(int i) {
        this.f19957x = i;
        this.f19924b.setTextSize((float) i);
        m25532i();
        requestLayout();
        invalidate();
    }

    public void setMaxValue(int i) {
        if (i < this.f19948o.size() && i > 0) {
            this.f19948o = new ArrayList(this.f19948o.subList(0, i + 1));
            invalidate();
        }
    }

    public void setMaximumWidthText(String str) {
        if (str != null) {
            this.f19949p = str;
            m25532i();
            requestLayout();
            invalidate();
            return;
        }
        throw new NullPointerException("Maximum width text can not be null!");
    }

    public void setMaximumWidthTextPosition(int i) {
        if (m25533j(i)) {
            this.f19920V = i;
            m25532i();
            requestLayout();
            invalidate();
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Maximum width text Position must in [0, " + this.f19948o.size() + "), but current is " + i);
    }

    public void setOnItemSelectedListener(C10501a aVar) {
        this.f19932f = aVar;
    }

    public void setOnWheelChangeListener(C10502b bVar) {
        this.f19934g = bVar;
    }

    public void setSameWidth(boolean z) {
        this.f19927c0 = z;
        m25532i();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i) {
        mo33217l(i, true);
    }

    public void setSelectedItemTextColor(int i) {
        this.f19956w = i;
        m25525b();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f19924b;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        m25532i();
        requestLayout();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f19950q = i;
        m25536n();
        requestLayout();
    }
}
