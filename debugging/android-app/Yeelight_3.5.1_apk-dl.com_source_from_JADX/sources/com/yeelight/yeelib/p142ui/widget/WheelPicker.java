package com.yeelight.yeelib.p142ui.widget;

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
import java.util.Objects;

/* renamed from: com.yeelight.yeelib.ui.widget.WheelPicker */
public class WheelPicker extends View implements Runnable {

    /* renamed from: v0 */
    private static final String f16160v0 = WheelPicker.class.getSimpleName();

    /* renamed from: A */
    private int f16161A;

    /* renamed from: B */
    private int f16162B;

    /* renamed from: C */
    private int f16163C;

    /* renamed from: Q */
    private int f16164Q;

    /* renamed from: R */
    private int f16165R;

    /* renamed from: S */
    private int f16166S;

    /* renamed from: T */
    private int f16167T;

    /* renamed from: U */
    private int f16168U;

    /* renamed from: V */
    private int f16169V;

    /* renamed from: W */
    private int f16170W;

    /* renamed from: a */
    private final Handler f16171a = new Handler();

    /* renamed from: a0 */
    private int f16172a0 = 50;

    /* renamed from: b */
    private Paint f16173b;

    /* renamed from: b0 */
    private int f16174b0 = 8000;

    /* renamed from: c */
    private Scroller f16175c;

    /* renamed from: c0 */
    private int f16176c0;

    /* renamed from: d */
    private VelocityTracker f16177d;

    /* renamed from: d0 */
    private int f16178d0;

    /* renamed from: e */
    private boolean f16179e;

    /* renamed from: e0 */
    private int f16180e0;

    /* renamed from: f */
    private C8878a f16181f;

    /* renamed from: f0 */
    private int f16182f0;

    /* renamed from: g */
    private C8879b f16183g;

    /* renamed from: g0 */
    private int f16184g0;

    /* renamed from: h */
    private Rect f16185h;

    /* renamed from: h0 */
    private int f16186h0;

    /* renamed from: i */
    private Rect f16187i;

    /* renamed from: i0 */
    private int f16188i0;

    /* renamed from: j */
    private Rect f16189j;

    /* renamed from: j0 */
    private int f16190j0;

    /* renamed from: k */
    private Rect f16191k;

    /* renamed from: k0 */
    private int f16192k0 = 8;

    /* renamed from: l */
    private Camera f16193l;

    /* renamed from: l0 */
    private boolean f16194l0;

    /* renamed from: m */
    private Matrix f16195m;

    /* renamed from: m0 */
    private boolean f16196m0;

    /* renamed from: n */
    private Matrix f16197n;

    /* renamed from: n0 */
    private boolean f16198n0;

    /* renamed from: o */
    private List f16199o;

    /* renamed from: o0 */
    private boolean f16200o0;

    /* renamed from: p */
    private String f16201p;

    /* renamed from: p0 */
    private boolean f16202p0;

    /* renamed from: q */
    private int f16203q;

    /* renamed from: q0 */
    private boolean f16204q0;

    /* renamed from: r */
    private int f16205r;

    /* renamed from: r0 */
    private boolean f16206r0;

    /* renamed from: s */
    private int f16207s;

    /* renamed from: s0 */
    private boolean f16208s0;

    /* renamed from: t */
    private int f16209t;

    /* renamed from: t0 */
    private String f16210t0;

    /* renamed from: u */
    private int f16211u;

    /* renamed from: u0 */
    private boolean f16212u0;

    /* renamed from: v */
    private int f16213v;

    /* renamed from: w */
    private int f16214w;

    /* renamed from: x */
    private int f16215x;

    /* renamed from: y */
    private int f16216y;

    /* renamed from: z */
    private int f16217z;

    /* renamed from: com.yeelight.yeelib.ui.widget.WheelPicker$a */
    public interface C8878a {
        /* renamed from: a */
        void mo35700a(WheelPicker wheelPicker, Object obj, int i);
    }

    /* renamed from: com.yeelight.yeelib.ui.widget.WheelPicker$b */
    public interface C8879b {
        /* renamed from: a */
        void mo36616a(int i);

        /* renamed from: b */
        void mo36617b(int i);

        /* renamed from: c */
        void mo36618c(int i);
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WheelPicker);
        this.f16199o = Arrays.asList(getResources().getStringArray(obtainStyledAttributes.getResourceId(R$styleable.WheelPicker_wheel_data, 0)));
        this.f16215x = obtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelPicker_wheel_item_text_size, getResources().getDimensionPixelSize(R$dimen.WheelItemTextSize));
        this.f16203q = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_visible_item_count, 7);
        this.f16167T = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_selected_item_position, 0);
        this.f16194l0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_same_width, false);
        this.f16186h0 = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_maximum_width_text_position, -1);
        this.f16201p = obtainStyledAttributes.getString(R$styleable.WheelPicker_wheel_maximum_width_text);
        this.f16214w = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_selected_item_text_color, -1);
        this.f16213v = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_item_text_color, -7829368);
        this.f16162B = obtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelPicker_wheel_item_space, getResources().getDimensionPixelSize(R$dimen.WheelItemSpace));
        this.f16202p0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_cyclic, false);
        this.f16196m0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_indicator, false);
        this.f16217z = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_indicator_color, -1166541);
        this.f16216y = obtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelPicker_wheel_indicator_size, getResources().getDimensionPixelSize(R$dimen.WheelIndicatorSize));
        this.f16198n0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_curtain, false);
        this.f16161A = obtainStyledAttributes.getColor(R$styleable.WheelPicker_wheel_curtain_color, -1996488705);
        this.f16200o0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_atmospheric, false);
        this.f16204q0 = obtainStyledAttributes.getBoolean(R$styleable.WheelPicker_wheel_curved, false);
        this.f16163C = obtainStyledAttributes.getInt(R$styleable.WheelPicker_wheel_item_align, 0);
        this.f16210t0 = obtainStyledAttributes.getString(R$styleable.WheelPicker_wheel_font_path);
        obtainStyledAttributes.recycle();
        m21150n();
        Paint paint = new Paint(69);
        this.f16173b = paint;
        paint.setTextSize((float) this.f16215x);
        if (this.f16210t0 != null) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), this.f16210t0));
        }
        m21149m();
        m21146i();
        this.f16175c = new Scroller(getContext());
        if (Build.VERSION.SDK_INT >= 4) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            this.f16172a0 = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f16174b0 = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f16192k0 = viewConfiguration.getScaledTouchSlop();
        }
        this.f16185h = new Rect();
        this.f16187i = new Rect();
        this.f16189j = new Rect();
        this.f16191k = new Rect();
        this.f16193l = new Camera();
        this.f16195m = new Matrix();
        this.f16197n = new Matrix();
    }

    /* renamed from: b */
    private void m21139b() {
        if (this.f16198n0 || this.f16214w != -1) {
            Rect rect = this.f16191k;
            Rect rect2 = this.f16185h;
            int i = rect2.left;
            int i2 = this.f16178d0;
            int i3 = this.f16165R;
            rect.set(i, i2 - i3, rect2.right, i2 + i3);
        }
    }

    /* renamed from: c */
    private int m21140c(int i) {
        double d = (double) this.f16166S;
        double cos = Math.cos(Math.toRadians((double) i));
        double d2 = (double) this.f16166S;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (int) (d - (cos * d2));
    }

    /* renamed from: d */
    private int m21141d(int i) {
        if (Math.abs(i) <= this.f16165R) {
            return -i;
        }
        return (this.f16184g0 < 0 ? -this.f16164Q : this.f16164Q) - i;
    }

    /* renamed from: e */
    private void m21142e() {
        int i = this.f16163C;
        this.f16180e0 = i != 1 ? i != 2 ? this.f16176c0 : this.f16185h.right : this.f16185h.left;
        this.f16182f0 = (int) (((float) this.f16178d0) - ((this.f16173b.ascent() + this.f16173b.descent()) / 2.0f));
    }

    /* renamed from: f */
    private void m21143f() {
        int i = this.f16167T;
        int i2 = this.f16164Q;
        int i3 = i * i2;
        this.f16169V = this.f16202p0 ? Integer.MIN_VALUE : ((-i2) * (this.f16199o.size() - 1)) + i3;
        if (this.f16202p0) {
            i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        this.f16170W = i3;
    }

    /* renamed from: g */
    private void m21144g() {
        if (this.f16196m0) {
            int i = this.f16216y / 2;
            int i2 = this.f16178d0;
            int i3 = this.f16165R;
            int i4 = i2 + i3;
            int i5 = i2 - i3;
            Rect rect = this.f16187i;
            Rect rect2 = this.f16185h;
            rect.set(rect2.left, i4 - i, rect2.right, i4 + i);
            Rect rect3 = this.f16189j;
            Rect rect4 = this.f16185h;
            rect3.set(rect4.left, i5 - i, rect4.right, i5 + i);
        }
    }

    /* renamed from: h */
    private int m21145h(int i) {
        double sin = Math.sin(Math.toRadians((double) i));
        double d = (double) this.f16166S;
        Double.isNaN(d);
        return (int) (sin * d);
    }

    /* renamed from: i */
    private void m21146i() {
        Paint paint;
        String str;
        float measureText;
        this.f16211u = 0;
        this.f16209t = 0;
        if (this.f16194l0) {
            measureText = this.f16173b.measureText(String.valueOf(this.f16199o.get(0)));
        } else {
            if (m21147j(this.f16186h0)) {
                paint = this.f16173b;
                str = String.valueOf(this.f16199o.get(this.f16186h0));
            } else if (!TextUtils.isEmpty(this.f16201p)) {
                paint = this.f16173b;
                str = this.f16201p;
            } else {
                for (Object valueOf : this.f16199o) {
                    String valueOf2 = String.valueOf(valueOf);
                    this.f16209t = Math.max(this.f16209t, (int) this.f16173b.measureText(valueOf2));
                }
                Paint.FontMetrics fontMetrics = this.f16173b.getFontMetrics();
                this.f16211u = (int) (fontMetrics.bottom - fontMetrics.top);
            }
            measureText = paint.measureText(str);
        }
        this.f16209t = (int) measureText;
        Paint.FontMetrics fontMetrics2 = this.f16173b.getFontMetrics();
        this.f16211u = (int) (fontMetrics2.bottom - fontMetrics2.top);
    }

    /* renamed from: j */
    private boolean m21147j(int i) {
        return i >= 0 && i < this.f16199o.size();
    }

    /* renamed from: k */
    private int m21148k(int i, int i2, int i3) {
        return i == 1073741824 ? i2 : i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* renamed from: m */
    private void m21149m() {
        Paint.Align align;
        Paint paint;
        int i = this.f16163C;
        if (i == 1) {
            paint = this.f16173b;
            align = Paint.Align.LEFT;
        } else if (i != 2) {
            paint = this.f16173b;
            align = Paint.Align.CENTER;
        } else {
            paint = this.f16173b;
            align = Paint.Align.RIGHT;
        }
        paint.setTextAlign(align);
    }

    /* renamed from: n */
    private void m21150n() {
        int i = this.f16203q;
        if (i >= 2) {
            if (i % 2 == 0) {
                this.f16203q = i + 1;
            }
            int i2 = this.f16203q + 2;
            this.f16205r = i2;
            this.f16207s = i2 / 2;
            return;
        }
        throw new ArithmeticException("Wheel's visible item count can not be less than 2!");
    }

    public int getCurrentItemPosition() {
        return this.f16168U;
    }

    public int getCurtainColor() {
        return this.f16161A;
    }

    public List getData() {
        return this.f16199o;
    }

    public int getIndicatorColor() {
        return this.f16217z;
    }

    public int getIndicatorSize() {
        return this.f16216y;
    }

    public int getItemAlign() {
        return this.f16163C;
    }

    public int getItemSpace() {
        return this.f16162B;
    }

    public int getItemTextColor() {
        return this.f16213v;
    }

    public int getItemTextSize() {
        return this.f16215x;
    }

    public String getMaximumWidthText() {
        return this.f16201p;
    }

    public int getMaximumWidthTextPosition() {
        return this.f16186h0;
    }

    public int getSelectedItemPosition() {
        return this.f16167T;
    }

    public int getSelectedItemTextColor() {
        return this.f16214w;
    }

    public Typeface getTypeface() {
        Paint paint = this.f16173b;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    public int getVisibleItemCount() {
        return this.f16203q;
    }

    /* renamed from: l */
    public void mo36586l(int i, boolean z) {
        this.f16179e = false;
        if (!z || !this.f16175c.isFinished()) {
            if (!this.f16175c.isFinished()) {
                this.f16175c.abortAnimation();
            }
            int max = Math.max(Math.min(i, this.f16199o.size() - 1), 0);
            this.f16167T = max;
            this.f16168U = max;
            this.f16184g0 = 0;
            m21143f();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i2 = i - this.f16168U;
        if (i2 != 0) {
            if (this.f16202p0 && Math.abs(i2) > size / 2) {
                if (i2 > 0) {
                    size = -size;
                }
                i2 += size;
            }
            Scroller scroller = this.f16175c;
            scroller.startScroll(0, scroller.getCurrY(), 0, (-i2) * this.f16164Q);
            this.f16171a.post(this);
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
            com.yeelight.yeelib.ui.widget.WheelPicker$b r1 = r0.f16183g
            if (r1 == 0) goto L_0x000d
            int r2 = r0.f16184g0
            r1.mo36616a(r2)
        L_0x000d:
            int r1 = r0.f16184g0
            int r1 = -r1
            int r2 = r0.f16164Q
            int r1 = r1 / r2
            int r2 = r0.f16207s
            int r8 = r1 - r2
            int r1 = r0.f16167T
            int r1 = r1 + r8
            int r2 = -r2
            r9 = r1
            r10 = r2
        L_0x001d:
            int r1 = r0.f16167T
            int r1 = r1 + r8
            int r2 = r0.f16205r
            int r1 = r1 + r2
            if (r9 >= r1) goto L_0x01fb
            boolean r1 = r0.f16202p0
            if (r1 == 0) goto L_0x0041
            java.util.List r1 = r0.f16199o
            int r1 = r1.size()
            int r1 = r9 % r1
            if (r1 >= 0) goto L_0x003a
            java.util.List r2 = r0.f16199o
            int r2 = r2.size()
            int r1 = r1 + r2
        L_0x003a:
            java.util.List r2 = r0.f16199o
            java.lang.Object r1 = r2.get(r1)
            goto L_0x004d
        L_0x0041:
            boolean r1 = r0.m21147j(r9)
            if (r1 == 0) goto L_0x0052
            java.util.List r1 = r0.f16199o
            java.lang.Object r1 = r1.get(r9)
        L_0x004d:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0054
        L_0x0052:
            java.lang.String r1 = ""
        L_0x0054:
            android.graphics.Paint r2 = r0.f16173b
            int r3 = r0.f16213v
            r2.setColor(r3)
            android.graphics.Paint r2 = r0.f16173b
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            int r2 = r0.f16182f0
            int r3 = r0.f16164Q
            int r4 = r10 * r3
            int r4 = r4 + r2
            int r5 = r0.f16184g0
            int r5 = r5 % r3
            int r4 = r4 + r5
            boolean r3 = r0.f16204q0
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0119
            int r3 = r2 - r4
            int r3 = java.lang.Math.abs(r3)
            int r2 = r2 - r3
            android.graphics.Rect r3 = r0.f16185h
            int r3 = r3.top
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r6
            int r12 = r0.f16182f0
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
            int r12 = r0.m21145h(r2)
            int r14 = r0.f16176c0
            int r15 = r0.f16163C
            if (r15 == r3) goto L_0x00be
            r3 = 2
            if (r15 == r3) goto L_0x00b9
            goto L_0x00c2
        L_0x00b9:
            android.graphics.Rect r3 = r0.f16185h
            int r14 = r3.right
            goto L_0x00c2
        L_0x00be:
            android.graphics.Rect r3 = r0.f16185h
            int r14 = r3.left
        L_0x00c2:
            int r3 = r0.f16178d0
            int r3 = r3 - r12
            android.graphics.Camera r15 = r0.f16193l
            r15.save()
            android.graphics.Camera r15 = r0.f16193l
            r15.rotateX(r13)
            android.graphics.Camera r13 = r0.f16193l
            android.graphics.Matrix r15 = r0.f16195m
            r13.getMatrix(r15)
            android.graphics.Camera r13 = r0.f16193l
            r13.restore()
            android.graphics.Matrix r13 = r0.f16195m
            int r15 = -r14
            float r15 = (float) r15
            int r11 = -r3
            float r11 = (float) r11
            r13.preTranslate(r15, r11)
            android.graphics.Matrix r13 = r0.f16195m
            float r14 = (float) r14
            float r3 = (float) r3
            r13.postTranslate(r14, r3)
            android.graphics.Camera r13 = r0.f16193l
            r13.save()
            android.graphics.Camera r13 = r0.f16193l
            int r2 = r0.m21140c(r2)
            float r2 = (float) r2
            r5 = 0
            r13.translate(r5, r5, r2)
            android.graphics.Camera r2 = r0.f16193l
            android.graphics.Matrix r5 = r0.f16197n
            r2.getMatrix(r5)
            android.graphics.Camera r2 = r0.f16193l
            r2.restore()
            android.graphics.Matrix r2 = r0.f16197n
            r2.preTranslate(r15, r11)
            android.graphics.Matrix r2 = r0.f16197n
            r2.postTranslate(r14, r3)
            android.graphics.Matrix r2 = r0.f16195m
            android.graphics.Matrix r3 = r0.f16197n
            r2.postConcat(r3)
            goto L_0x011a
        L_0x0119:
            r12 = 0
        L_0x011a:
            boolean r2 = r0.f16200o0
            if (r2 == 0) goto L_0x013d
            int r2 = r0.f16182f0
            int r3 = r2 - r4
            int r3 = java.lang.Math.abs(r3)
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r6
            int r3 = r0.f16182f0
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
            android.graphics.Paint r2 = r0.f16173b
            r2.setAlpha(r11)
        L_0x013d:
            boolean r2 = r0.f16204q0
            if (r2 == 0) goto L_0x0145
            int r2 = r0.f16182f0
            int r4 = r2 - r12
        L_0x0145:
            int r2 = r0.f16214w
            r3 = -1
            r17.save()
            if (r2 == r3) goto L_0x0185
            boolean r2 = r0.f16204q0
            if (r2 == 0) goto L_0x0156
            android.graphics.Matrix r2 = r0.f16195m
            r7.concat(r2)
        L_0x0156:
            android.graphics.Rect r2 = r0.f16191k
            android.graphics.Region$Op r3 = android.graphics.Region.Op.DIFFERENCE
            r7.clipRect(r2, r3)
            int r2 = r0.f16180e0
            float r2 = (float) r2
            float r3 = (float) r4
            android.graphics.Paint r4 = r0.f16173b
            r7.drawText(r1, r2, r3, r4)
            r17.restore()
            android.graphics.Paint r2 = r0.f16173b
            int r4 = r0.f16214w
            r2.setColor(r4)
            r17.save()
            boolean r2 = r0.f16204q0
            if (r2 == 0) goto L_0x017c
            android.graphics.Matrix r2 = r0.f16195m
            r7.concat(r2)
        L_0x017c:
            android.graphics.Rect r2 = r0.f16191k
            r7.clipRect(r2)
            int r2 = r0.f16180e0
            float r2 = (float) r2
            goto L_0x0197
        L_0x0185:
            android.graphics.Rect r2 = r0.f16185h
            r7.clipRect(r2)
            boolean r2 = r0.f16204q0
            if (r2 == 0) goto L_0x0193
            android.graphics.Matrix r2 = r0.f16195m
            r7.concat(r2)
        L_0x0193:
            int r2 = r0.f16180e0
            float r2 = (float) r2
            float r3 = (float) r4
        L_0x0197:
            android.graphics.Paint r4 = r0.f16173b
            r7.drawText(r1, r2, r3, r4)
            r17.restore()
            boolean r1 = r0.f16212u0
            if (r1 == 0) goto L_0x01f5
            r17.save()
            android.graphics.Rect r1 = r0.f16185h
            r7.clipRect(r1)
            android.graphics.Paint r1 = r0.f16173b
            r2 = -1166541(0xffffffffffee3333, float:NaN)
            r1.setColor(r2)
            int r1 = r0.f16178d0
            int r2 = r0.f16164Q
            int r2 = r2 * r10
            int r11 = r1 + r2
            android.graphics.Rect r1 = r0.f16185h
            int r2 = r1.left
            float r2 = (float) r2
            float r5 = (float) r11
            int r1 = r1.right
            float r4 = (float) r1
            android.graphics.Paint r6 = r0.f16173b
            r1 = r17
            r3 = r5
            r1.drawLine(r2, r3, r4, r5, r6)
            android.graphics.Paint r1 = r0.f16173b
            r2 = -13421586(0xffffffffff3333ee, float:-2.3820145E38)
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f16173b
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            int r1 = r0.f16165R
            int r11 = r11 - r1
            android.graphics.Rect r1 = r0.f16185h
            int r2 = r1.left
            float r2 = (float) r2
            float r3 = (float) r11
            int r1 = r1.right
            float r4 = (float) r1
            int r1 = r0.f16164Q
            int r11 = r11 + r1
            float r5 = (float) r11
            android.graphics.Paint r6 = r0.f16173b
            r1 = r17
            r1.drawRect(r2, r3, r4, r5, r6)
            r17.restore()
        L_0x01f5:
            int r9 = r9 + 1
            int r10 = r10 + 1
            goto L_0x001d
        L_0x01fb:
            boolean r1 = r0.f16198n0
            if (r1 == 0) goto L_0x0214
            android.graphics.Paint r1 = r0.f16173b
            int r2 = r0.f16161A
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f16173b
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Rect r1 = r0.f16191k
            android.graphics.Paint r2 = r0.f16173b
            r7.drawRect(r1, r2)
        L_0x0214:
            boolean r1 = r0.f16196m0
            if (r1 == 0) goto L_0x0234
            android.graphics.Paint r1 = r0.f16173b
            int r2 = r0.f16217z
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f16173b
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Rect r1 = r0.f16187i
            android.graphics.Paint r2 = r0.f16173b
            r7.drawRect(r1, r2)
            android.graphics.Rect r1 = r0.f16189j
            android.graphics.Paint r2 = r0.f16173b
            r7.drawRect(r1, r2)
        L_0x0234:
            boolean r1 = r0.f16212u0
            if (r1 == 0) goto L_0x02a2
            android.graphics.Paint r1 = r0.f16173b
            r2 = 1144254003(0x4433ee33, float:719.72186)
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f16173b
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            r2 = 0
            r3 = 0
            int r1 = r16.getPaddingLeft()
            float r4 = (float) r1
            int r1 = r16.getHeight()
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f16173b
            r1 = r17
            r1.drawRect(r2, r3, r4, r5, r6)
            int r1 = r16.getWidth()
            float r4 = (float) r1
            int r1 = r16.getPaddingTop()
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f16173b
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
            android.graphics.Paint r6 = r0.f16173b
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
            android.graphics.Paint r6 = r0.f16173b
            r1 = r17
            r1.drawRect(r2, r3, r4, r5, r6)
        L_0x02a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.widget.WheelPicker.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f16209t;
        int i4 = this.f16211u;
        int i5 = this.f16203q;
        int i6 = (i4 * i5) + (this.f16162B * (i5 - 1));
        if (this.f16204q0) {
            double d = (double) (i6 * 2);
            Double.isNaN(d);
            i6 = (int) (d / 3.141592653589793d);
        }
        if (this.f16212u0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Wheel's content size is (");
            sb.append(i3);
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(i6);
            sb.append(")");
        }
        int paddingLeft = i3 + getPaddingLeft() + getPaddingRight();
        int paddingTop = i6 + getPaddingTop() + getPaddingBottom();
        if (this.f16212u0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Wheel's size is (");
            sb2.append(paddingLeft);
            sb2.append(Constants.COLON_SEPARATOR);
            sb2.append(paddingTop);
            sb2.append(")");
        }
        setMeasuredDimension(m21148k(mode, size, paddingLeft), m21148k(mode2, size2, paddingTop));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f16185h.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.f16212u0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Wheel's drawn rect size is (");
            sb.append(this.f16185h.width());
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(this.f16185h.height());
            sb.append(") and location is (");
            sb.append(this.f16185h.left);
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(this.f16185h.top);
            sb.append(")");
        }
        this.f16176c0 = this.f16185h.centerX();
        this.f16178d0 = this.f16185h.centerY();
        m21142e();
        this.f16166S = this.f16185h.height() / 2;
        int height = this.f16185h.height() / this.f16203q;
        this.f16164Q = height;
        this.f16165R = height / 2;
        m21143f();
        m21144g();
        m21139b();
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
            android.view.VelocityTracker r14 = r13.f16177d
            if (r14 == 0) goto L_0x0153
        L_0x0024:
            r14.recycle()
            r13.f16177d = r2
            goto L_0x0153
        L_0x002b:
            int r0 = r13.f16190j0
            float r0 = (float) r0
            float r2 = r14.getY()
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r13.f16192k0
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0042
            r13.f16206r0 = r1
            goto L_0x0153
        L_0x0042:
            r13.f16206r0 = r3
            android.view.VelocityTracker r0 = r13.f16177d
            r0.addMovement(r14)
            com.yeelight.yeelib.ui.widget.WheelPicker$b r0 = r13.f16183g
            if (r0 == 0) goto L_0x0050
            r0.mo36617b(r1)
        L_0x0050:
            float r0 = r14.getY()
            int r2 = r13.f16188i0
            float r2 = (float) r2
            float r0 = r0 - r2
            float r2 = java.lang.Math.abs(r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0064
            goto L_0x0153
        L_0x0064:
            int r2 = r13.f16184g0
            float r2 = (float) r2
            float r2 = r2 + r0
            int r0 = (int) r2
            r13.f16184g0 = r0
            float r14 = r14.getY()
            int r14 = (int) r14
            r13.f16188i0 = r14
            r13.invalidate()
            goto L_0x0153
        L_0x0077:
            android.view.ViewParent r0 = r13.getParent()
            if (r0 == 0) goto L_0x0084
            android.view.ViewParent r0 = r13.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L_0x0084:
            boolean r0 = r13.f16206r0
            if (r0 == 0) goto L_0x008e
            boolean r0 = r13.f16208s0
            if (r0 != 0) goto L_0x008e
            goto L_0x0153
        L_0x008e:
            android.view.VelocityTracker r0 = r13.f16177d
            r0.addMovement(r14)
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 4
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r14 < r0) goto L_0x00a3
            android.view.VelocityTracker r14 = r13.f16177d
            int r0 = r13.f16174b0
            float r0 = (float) r0
            r14.computeCurrentVelocity(r4, r0)
            goto L_0x00a8
        L_0x00a3:
            android.view.VelocityTracker r14 = r13.f16177d
            r14.computeCurrentVelocity(r4)
        L_0x00a8:
            r13.f16208s0 = r3
            android.view.VelocityTracker r14 = r13.f16177d
            float r14 = r14.getYVelocity()
            int r8 = (int) r14
            int r14 = java.lang.Math.abs(r8)
            int r0 = r13.f16172a0
            if (r14 <= r0) goto L_0x00e0
            android.widget.Scroller r4 = r13.f16175c
            r5 = 0
            int r6 = r13.f16184g0
            r7 = 0
            r9 = 0
            r10 = 0
            int r11 = r13.f16169V
            int r12 = r13.f16170W
            r4.fling(r5, r6, r7, r8, r9, r10, r11, r12)
            android.widget.Scroller r14 = r13.f16175c
            int r0 = r14.getFinalY()
            android.widget.Scroller r3 = r13.f16175c
            int r3 = r3.getFinalY()
            int r4 = r13.f16164Q
            int r3 = r3 % r4
            int r3 = r13.m21141d(r3)
            int r0 = r0 + r3
            r14.setFinalY(r0)
            goto L_0x00ef
        L_0x00e0:
            android.widget.Scroller r14 = r13.f16175c
            int r0 = r13.f16184g0
            int r4 = r13.f16164Q
            int r4 = r0 % r4
            int r4 = r13.m21141d(r4)
            r14.startScroll(r3, r0, r3, r4)
        L_0x00ef:
            boolean r14 = r13.f16202p0
            if (r14 != 0) goto L_0x010e
            android.widget.Scroller r14 = r13.f16175c
            int r14 = r14.getFinalY()
            int r0 = r13.f16170W
            if (r14 <= r0) goto L_0x0103
        L_0x00fd:
            android.widget.Scroller r14 = r13.f16175c
            r14.setFinalY(r0)
            goto L_0x010e
        L_0x0103:
            android.widget.Scroller r14 = r13.f16175c
            int r14 = r14.getFinalY()
            int r0 = r13.f16169V
            if (r14 >= r0) goto L_0x010e
            goto L_0x00fd
        L_0x010e:
            android.os.Handler r14 = r13.f16171a
            r14.post(r13)
            android.view.VelocityTracker r14 = r13.f16177d
            if (r14 == 0) goto L_0x0153
            goto L_0x0024
        L_0x0119:
            r13.f16179e = r1
            android.view.ViewParent r0 = r13.getParent()
            if (r0 == 0) goto L_0x0128
            android.view.ViewParent r0 = r13.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0128:
            android.view.VelocityTracker r0 = r13.f16177d
            if (r0 != 0) goto L_0x0133
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r13.f16177d = r0
            goto L_0x0136
        L_0x0133:
            r0.clear()
        L_0x0136:
            android.view.VelocityTracker r0 = r13.f16177d
            r0.addMovement(r14)
            android.widget.Scroller r0 = r13.f16175c
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x014a
            android.widget.Scroller r0 = r13.f16175c
            r0.abortAnimation()
            r13.f16208s0 = r1
        L_0x014a:
            float r14 = r14.getY()
            int r14 = (int) r14
            r13.f16188i0 = r14
            r13.f16190j0 = r14
        L_0x0153:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.widget.WheelPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void run() {
        List list = this.f16199o;
        if (list != null && list.size() != 0) {
            if (this.f16175c.isFinished() && !this.f16208s0) {
                int i = this.f16164Q;
                if (i != 0) {
                    int size = (((-this.f16184g0) / i) + this.f16167T) % this.f16199o.size();
                    if (size < 0) {
                        size += this.f16199o.size();
                    }
                    if (this.f16212u0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(size);
                        sb.append(Constants.COLON_SEPARATOR);
                        sb.append(this.f16199o.get(size));
                        sb.append(Constants.COLON_SEPARATOR);
                        sb.append(this.f16184g0);
                    }
                    this.f16168U = size;
                    C8878a aVar = this.f16181f;
                    if (aVar != null && this.f16179e) {
                        aVar.mo35700a(this, this.f16199o.get(size), size);
                    }
                    C8879b bVar = this.f16183g;
                    if (bVar != null && this.f16179e) {
                        bVar.mo36618c(size);
                        this.f16183g.mo36617b(0);
                    }
                } else {
                    return;
                }
            }
            if (this.f16175c.computeScrollOffset()) {
                C8879b bVar2 = this.f16183g;
                if (bVar2 != null) {
                    bVar2.mo36617b(2);
                }
                this.f16184g0 = this.f16175c.getCurrY();
                postInvalidate();
                this.f16171a.postDelayed(this, 16);
            }
        }
    }

    public void setAtmospheric(boolean z) {
        this.f16200o0 = z;
        invalidate();
    }

    public void setCurtain(boolean z) {
        this.f16198n0 = z;
        m21139b();
        invalidate();
    }

    public void setCurtainColor(int i) {
        this.f16161A = i;
        invalidate();
    }

    public void setCurved(boolean z) {
        this.f16204q0 = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f16202p0 = z;
        m21143f();
        invalidate();
    }

    public void setData(List list) {
        int i;
        Objects.requireNonNull(list, "WheelPicker's data can not be null!");
        this.f16199o = list;
        if (this.f16167T > list.size() - 1 || this.f16168U > list.size() - 1) {
            i = list.size() - 1;
            this.f16168U = i;
        } else {
            i = this.f16168U;
        }
        this.f16167T = i;
        this.f16184g0 = 0;
        m21146i();
        m21143f();
        requestLayout();
        invalidate();
    }

    public void setDebug(boolean z) {
        this.f16212u0 = z;
    }

    public void setIndicator(boolean z) {
        this.f16196m0 = z;
        m21144g();
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f16217z = i;
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f16216y = i;
        m21144g();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f16163C = i;
        m21149m();
        m21142e();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f16162B = i;
        requestLayout();
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f16213v = i;
        invalidate();
    }

    public void setItemTextSize(int i) {
        this.f16215x = i;
        this.f16173b.setTextSize((float) i);
        m21146i();
        requestLayout();
        invalidate();
    }

    public void setMaxValue(int i) {
        if (i < this.f16199o.size() && i > 0) {
            this.f16199o = new ArrayList(this.f16199o.subList(0, i + 1));
            invalidate();
        }
    }

    public void setMaximumWidthText(String str) {
        Objects.requireNonNull(str, "Maximum width text can not be null!");
        this.f16201p = str;
        m21146i();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthTextPosition(int i) {
        if (m21147j(i)) {
            this.f16186h0 = i;
            m21146i();
            requestLayout();
            invalidate();
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Maximum width text Position must in [0, " + this.f16199o.size() + "), but current is " + i);
    }

    public void setOnItemSelectedListener(C8878a aVar) {
        this.f16181f = aVar;
    }

    public void setOnWheelChangeListener(C8879b bVar) {
        this.f16183g = bVar;
    }

    public void setSameWidth(boolean z) {
        this.f16194l0 = z;
        m21146i();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i) {
        mo36586l(i, true);
    }

    public void setSelectedItemTextColor(int i) {
        this.f16214w = i;
        m21139b();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f16173b;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        m21146i();
        requestLayout();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f16203q = i;
        m21150n();
        requestLayout();
    }
}
