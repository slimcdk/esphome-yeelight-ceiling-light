package com.yeelight.yeelib.p194ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ScrollerCompat;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$styleable;

/* renamed from: com.yeelight.yeelib.ui.view.NumberPickerView */
public class NumberPickerView extends View {

    /* renamed from: A */
    private int f19724A = 0;

    /* renamed from: A0 */
    private int f19725A0;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f19726B = 0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public int f19727B0;

    /* renamed from: C0 */
    private float f19728C0;

    /* renamed from: D0 */
    private float f19729D0;

    /* renamed from: E0 */
    private float f19730E0;

    /* renamed from: F0 */
    private int f19731F0 = 0;

    /* renamed from: G */
    private int f19732G = 150;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public int f19733G0 = 0;

    /* renamed from: H */
    private int f19734H = 8;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public int f19735H0 = 0;

    /* renamed from: I */
    private String f19736I;

    /* renamed from: I0 */
    private int f19737I0 = 0;

    /* renamed from: J */
    private String f19738J;

    /* renamed from: J0 */
    private int f19739J0 = 0;

    /* renamed from: K */
    private String f19740K;

    /* renamed from: L */
    private String f19741L;

    /* renamed from: M */
    private float f19742M = 1.0f;

    /* renamed from: N */
    private float f19743N = 0.0f;

    /* renamed from: O */
    private float f19744O = 0.0f;

    /* renamed from: P */
    private float f19745P = 0.0f;

    /* renamed from: Q */
    private boolean f19746Q = true;

    /* renamed from: R */
    private boolean f19747R = true;

    /* renamed from: S */
    private boolean f19748S = false;

    /* renamed from: T */
    private boolean f19749T = false;

    /* renamed from: U */
    private boolean f19750U = true;

    /* renamed from: V */
    private boolean f19751V = false;

    /* renamed from: W */
    private boolean f19752W = false;

    /* renamed from: a */
    private int f19753a = -13421773;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public boolean f19754a0 = true;

    /* renamed from: b */
    private int f19755b = -695533;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public ScrollerCompat f19756b0;

    /* renamed from: c */
    private int f19757c = -695533;

    /* renamed from: c0 */
    private VelocityTracker f19758c0;

    /* renamed from: d */
    private int f19759d = 0;

    /* renamed from: d0 */
    private Paint f19760d0 = new Paint();

    /* renamed from: e */
    private int f19761e = 0;

    /* renamed from: e0 */
    private TextPaint f19762e0 = new TextPaint();

    /* renamed from: f */
    private int f19763f = 0;

    /* renamed from: f0 */
    private Paint f19764f0 = new Paint();

    /* renamed from: g */
    private int f19765g = 0;

    /* renamed from: g0 */
    private String[] f19766g0;

    /* renamed from: h */
    private int f19767h = 0;

    /* renamed from: h0 */
    private CharSequence[] f19768h0;

    /* renamed from: i */
    private int f19769i = 0;

    /* renamed from: i0 */
    private CharSequence[] f19770i0;

    /* renamed from: j */
    private int f19771j = 0;

    /* renamed from: j0 */
    private HandlerThread f19772j0;

    /* renamed from: k */
    private int f19773k = 0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public Handler f19774k0;

    /* renamed from: l */
    private int f19775l = 0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public Handler f19776l0;

    /* renamed from: m */
    private int f19777m = -695533;

    /* renamed from: m0 */
    private C10477f f19778m0;

    /* renamed from: n */
    private int f19779n = 2;

    /* renamed from: n0 */
    private C10475d f19780n0;

    /* renamed from: o */
    private int f19781o = 0;

    /* renamed from: o0 */
    private C10474c f19782o0;

    /* renamed from: p */
    private int f19783p = 0;

    /* renamed from: p0 */
    private C10476e f19784p0;

    /* renamed from: q */
    private int f19785q = 3;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public int f19786q0 = 0;

    /* renamed from: r */
    private int f19787r = 0;

    /* renamed from: r0 */
    private int f19788r0;

    /* renamed from: s */
    private int f19789s = 0;

    /* renamed from: s0 */
    private int f19790s0;

    /* renamed from: t */
    private int f19791t = -1;

    /* renamed from: t0 */
    private int f19792t0;

    /* renamed from: u */
    private int f19793u = -1;

    /* renamed from: u0 */
    private int f19794u0;

    /* renamed from: v */
    private int f19795v = 0;

    /* renamed from: v0 */
    private float f19796v0 = 0.0f;

    /* renamed from: w */
    private int f19797w = 0;

    /* renamed from: w0 */
    private float f19798w0 = 0.0f;

    /* renamed from: x */
    private int f19799x = 0;

    /* renamed from: x0 */
    private float f19800x0 = 0.0f;

    /* renamed from: y */
    private int f19801y = 0;

    /* renamed from: y0 */
    private boolean f19802y0 = false;

    /* renamed from: z */
    private int f19803z = 0;

    /* renamed from: z0 */
    private int f19804z0;

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPickerView$a */
    class C10472a extends Handler {
        C10472a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i;
            Message g;
            Handler d;
            long j;
            int i2;
            NumberPickerView numberPickerView;
            int i3;
            int i4 = message.what;
            if (i4 == 1) {
                int i5 = 0;
                if (!NumberPickerView.this.f19756b0.isFinished()) {
                    if (NumberPickerView.this.f19786q0 == 0) {
                        NumberPickerView.this.m25414O(1);
                    }
                    d = NumberPickerView.this.f19774k0;
                    g = NumberPickerView.this.m25401B(1, 0, 0, message.obj);
                    j = 32;
                } else {
                    if (NumberPickerView.this.f19733G0 != 0) {
                        if (NumberPickerView.this.f19786q0 == 0) {
                            NumberPickerView.this.m25414O(1);
                        }
                        if (NumberPickerView.this.f19733G0 < (-NumberPickerView.this.f19727B0) / 2) {
                            i3 = (int) ((((float) (NumberPickerView.this.f19727B0 + NumberPickerView.this.f19733G0)) * 300.0f) / ((float) NumberPickerView.this.f19727B0));
                            NumberPickerView.this.f19756b0.startScroll(0, NumberPickerView.this.f19735H0, 0, NumberPickerView.this.f19733G0 + NumberPickerView.this.f19727B0, i3 * 3);
                            numberPickerView = NumberPickerView.this;
                            i2 = numberPickerView.f19735H0 + NumberPickerView.this.f19727B0;
                        } else {
                            i3 = (int) ((((float) (-NumberPickerView.this.f19733G0)) * 300.0f) / ((float) NumberPickerView.this.f19727B0));
                            NumberPickerView.this.f19756b0.startScroll(0, NumberPickerView.this.f19735H0, 0, NumberPickerView.this.f19733G0, i3 * 3);
                            numberPickerView = NumberPickerView.this;
                            i2 = numberPickerView.f19735H0;
                        }
                        i = numberPickerView.m25404E(i2 + NumberPickerView.this.f19733G0);
                        i5 = i3;
                        NumberPickerView.this.postInvalidate();
                    } else {
                        NumberPickerView.this.m25414O(0);
                        NumberPickerView numberPickerView2 = NumberPickerView.this;
                        i = numberPickerView2.m25404E(numberPickerView2.f19735H0);
                    }
                    NumberPickerView numberPickerView3 = NumberPickerView.this;
                    g = numberPickerView3.m25401B(2, numberPickerView3.f19726B, i, message.obj);
                    d = NumberPickerView.this.f19754a0 ? NumberPickerView.this.f19776l0 : NumberPickerView.this.f19774k0;
                    j = (long) (i5 * 2);
                }
                d.sendMessageDelayed(g, j);
            } else if (i4 == 2) {
                NumberPickerView.this.m25416Q(message.arg1, message.arg2, message.obj);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPickerView$b */
    class C10473b extends Handler {
        C10473b() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 2) {
                NumberPickerView.this.m25416Q(message.arg1, message.arg2, message.obj);
            } else if (i == 3) {
                NumberPickerView.this.requestLayout();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPickerView$c */
    public interface C10474c {
        /* renamed from: a */
        void mo33104a(NumberPickerView numberPickerView, int i);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPickerView$d */
    public interface C10475d {
        /* renamed from: a */
        void mo32860a(NumberPickerView numberPickerView, int i, int i2);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPickerView$e */
    public interface C10476e {
        /* renamed from: a */
        void mo32861a(NumberPickerView numberPickerView, int i, int i2);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPickerView$f */
    public interface C10477f {
        /* renamed from: a */
        void mo33105a(NumberPickerView numberPickerView, int i, int i2, String[] strArr);
    }

    public NumberPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25407H(context, attributeSet);
        m25406G(context);
    }

    /* renamed from: A */
    private Message m25400A(int i) {
        return m25401B(i, 0, 0, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public Message m25401B(int i, int i2, int i3, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        return obtain;
    }

    /* renamed from: C */
    private float m25402C(Paint.FontMetrics fontMetrics) {
        if (fontMetrics == null) {
            return 0.0f;
        }
        return Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    /* renamed from: D */
    private int m25403D(CharSequence charSequence, Paint paint) {
        if (!TextUtils.isEmpty(charSequence)) {
            return (int) (paint.measureText(charSequence.toString()) + 0.5f);
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public int m25404E(int i) {
        int i2 = this.f19727B0;
        boolean z = false;
        if (i2 == 0) {
            return 0;
        }
        int i3 = (i / i2) + (this.f19785q / 2);
        int oneRecycleSize = getOneRecycleSize();
        if (this.f19747R && this.f19750U) {
            z = true;
        }
        int y = m25455y(i3, oneRecycleSize, z);
        if (y >= 0 && y < getOneRecycleSize()) {
            return y + this.f19791t;
        }
        throw new IllegalArgumentException("getWillPickIndexByGlobalY illegal index : " + y + " getOneRecycleSize() : " + getOneRecycleSize() + " mWrapSelectorWheel : " + this.f19747R);
    }

    /* renamed from: F */
    private void m25405F() {
        if (this.f19766g0 == null) {
            String[] strArr = new String[1];
            this.f19766g0 = strArr;
            strArr[0] = TimerCodec.DISENABLE;
        }
    }

    /* renamed from: G */
    private void m25406G(Context context) {
        this.f19756b0 = ScrollerCompat.create(context);
        this.f19732G = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        this.f19734H = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.f19759d == 0) {
            this.f19759d = m25420W(context, 14.0f);
        }
        if (this.f19761e == 0) {
            this.f19761e = m25420W(context, 16.0f);
        }
        if (this.f19763f == 0) {
            this.f19763f = m25420W(context, 14.0f);
        }
        if (this.f19769i == 0) {
            this.f19769i = m25449s(context, 8.0f);
        }
        if (this.f19771j == 0) {
            this.f19771j = m25449s(context, 8.0f);
        }
        this.f19760d0.setColor(this.f19777m);
        this.f19760d0.setAntiAlias(true);
        this.f19760d0.setStyle(Paint.Style.STROKE);
        this.f19760d0.setStrokeWidth((float) this.f19779n);
        this.f19762e0.setColor(this.f19753a);
        this.f19762e0.setAntiAlias(true);
        this.f19762e0.setTextAlign(Paint.Align.CENTER);
        this.f19764f0.setColor(this.f19757c);
        this.f19764f0.setAntiAlias(true);
        this.f19764f0.setTextAlign(Paint.Align.CENTER);
        this.f19764f0.setTextSize((float) this.f19763f);
        int i = this.f19785q;
        if (i % 2 == 0) {
            this.f19785q = i + 1;
        }
        if (this.f19791t == -1 || this.f19793u == -1) {
            m25436g0();
        }
        m25408I();
    }

    /* renamed from: H */
    private void m25407H(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NumberPickerView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.NumberPickerView_npv_ShowCount) {
                    this.f19785q = obtainStyledAttributes.getInt(index, 3);
                } else if (index == R$styleable.NumberPickerView_npv_DividerColor) {
                    this.f19777m = obtainStyledAttributes.getColor(index, -695533);
                } else if (index == R$styleable.NumberPickerView_npv_DividerHeight) {
                    this.f19779n = obtainStyledAttributes.getDimensionPixelSize(index, 2);
                } else if (index == R$styleable.NumberPickerView_npv_DividerMarginLeft) {
                    this.f19781o = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.NumberPickerView_npv_DividerMarginRight) {
                    this.f19783p = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.NumberPickerView_npv_TextArray) {
                    this.f19766g0 = m25447q(obtainStyledAttributes.getTextArray(index));
                } else if (index == R$styleable.NumberPickerView_npv_TextColorNormal) {
                    this.f19753a = obtainStyledAttributes.getColor(index, -13421773);
                } else if (index == R$styleable.NumberPickerView_npv_TextColorSelected) {
                    this.f19755b = obtainStyledAttributes.getColor(index, -695533);
                } else if (index == R$styleable.NumberPickerView_npv_TextColorHint) {
                    this.f19757c = obtainStyledAttributes.getColor(index, -695533);
                } else if (index == R$styleable.NumberPickerView_npv_TextSizeNormal) {
                    this.f19759d = obtainStyledAttributes.getDimensionPixelSize(index, m25420W(context, 14.0f));
                } else if (index == R$styleable.NumberPickerView_npv_TextSizeSelected) {
                    this.f19761e = obtainStyledAttributes.getDimensionPixelSize(index, m25420W(context, 16.0f));
                } else if (index == R$styleable.NumberPickerView_npv_TextSizeHint) {
                    this.f19763f = obtainStyledAttributes.getDimensionPixelSize(index, m25420W(context, 14.0f));
                } else if (index == R$styleable.NumberPickerView_npv_MinValue) {
                    this.f19791t = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == R$styleable.NumberPickerView_npv_MaxValue) {
                    this.f19793u = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == R$styleable.NumberPickerView_npv_WrapSelectorWheel) {
                    this.f19747R = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == R$styleable.NumberPickerView_npv_ShowDivider) {
                    this.f19746Q = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == R$styleable.NumberPickerView_npv_HintText) {
                    this.f19736I = obtainStyledAttributes.getString(index);
                } else if (index == R$styleable.NumberPickerView_npv_AlternativeHint) {
                    this.f19741L = obtainStyledAttributes.getString(index);
                } else if (index == R$styleable.NumberPickerView_npv_EmptyItemHint) {
                    this.f19740K = obtainStyledAttributes.getString(index);
                } else if (index == R$styleable.NumberPickerView_npv_MarginStartOfHint) {
                    this.f19769i = obtainStyledAttributes.getDimensionPixelSize(index, m25449s(context, 8.0f));
                } else if (index == R$styleable.NumberPickerView_npv_MarginEndOfHint) {
                    this.f19771j = obtainStyledAttributes.getDimensionPixelSize(index, m25449s(context, 8.0f));
                } else if (index == R$styleable.NumberPickerView_npv_ItemPaddingVertical) {
                    this.f19773k = obtainStyledAttributes.getDimensionPixelSize(index, m25449s(context, 2.0f));
                } else if (index == R$styleable.NumberPickerView_npv_ItemPaddingHorizontal) {
                    this.f19775l = obtainStyledAttributes.getDimensionPixelSize(index, m25449s(context, 5.0f));
                } else if (index == R$styleable.NumberPickerView_npv_AlternativeTextArrayWithMeasureHint) {
                    this.f19768h0 = obtainStyledAttributes.getTextArray(index);
                } else if (index == R$styleable.NumberPickerView_npv_AlternativeTextArrayWithoutMeasureHint) {
                    this.f19770i0 = obtainStyledAttributes.getTextArray(index);
                } else if (index == R$styleable.NumberPickerView_npv_RespondChangeOnDetached) {
                    this.f19752W = obtainStyledAttributes.getBoolean(index, false);
                } else if (index == R$styleable.NumberPickerView_npv_RespondChangeInMainThread) {
                    this.f19754a0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == R$styleable.NumberPickerView_npv_TextEllipsize) {
                    this.f19738J = obtainStyledAttributes.getString(index);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: I */
    private void m25408I() {
        HandlerThread handlerThread = new HandlerThread("HandlerThread-For-Refreshing");
        this.f19772j0 = handlerThread;
        handlerThread.start();
        this.f19774k0 = new C10472a(this.f19772j0.getLooper());
        this.f19776l0 = new C10473b();
    }

    /* renamed from: J */
    private void m25409J() {
        m25448r(getPickedIndexRelativeToRaw() - this.f19791t, false);
        this.f19747R = false;
        postInvalidate();
    }

    /* renamed from: K */
    private boolean m25410K(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r0 = r1.f19792t0;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m25411L(int r2) {
        /*
            r1 = this;
            boolean r0 = r1.f19747R
            if (r0 == 0) goto L_0x0009
            boolean r0 = r1.f19750U
            if (r0 == 0) goto L_0x0009
            return r2
        L_0x0009:
            int r0 = r1.f19794u0
            if (r2 >= r0) goto L_0x000f
        L_0x000d:
            r2 = r0
            goto L_0x0014
        L_0x000f:
            int r0 = r1.f19792t0
            if (r2 <= r0) goto L_0x0014
            goto L_0x000d
        L_0x0014:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.view.NumberPickerView.m25411L(int):int");
    }

    /* renamed from: M */
    private int m25412M(int i) {
        int mode = View.MeasureSpec.getMode(i);
        this.f19739J0 = mode;
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom() + (this.f19785q * (this.f19801y + (this.f19773k * 2)));
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    /* renamed from: N */
    private int m25413N(int i) {
        int mode = View.MeasureSpec.getMode(i);
        this.f19737I0 = mode;
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int i2 = 0;
        int i3 = Math.max(this.f19765g, this.f19767h) == 0 ? 0 : this.f19771j;
        if (Math.max(this.f19765g, this.f19767h) != 0) {
            i2 = this.f19769i;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight() + Math.max(this.f19803z, Math.max(this.f19799x, this.f19724A) + ((i2 + Math.max(this.f19765g, this.f19767h) + i3 + (this.f19775l * 2)) * 2));
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m25414O(int i) {
        if (this.f19786q0 != i) {
            this.f19786q0 = i;
            C10474c cVar = this.f19782o0;
            if (cVar != null) {
                cVar.mo33104a(this, i);
            }
        }
    }

    /* renamed from: P */
    private void m25415P() {
        VelocityTracker velocityTracker = this.f19758c0;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f19758c0.recycle();
            this.f19758c0 = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m25416Q(int i, int i2, Object obj) {
        m25414O(0);
        if (i != i2 && (obj == null || !(obj instanceof Boolean) || ((Boolean) obj).booleanValue())) {
            C10475d dVar = this.f19780n0;
            if (dVar != null) {
                int i3 = this.f19795v;
                dVar.mo32860a(this, i + i3, i3 + i2);
            }
            C10477f fVar = this.f19778m0;
            if (fVar != null) {
                fVar.mo33105a(this, i, i2, this.f19766g0);
            }
        }
        this.f19726B = i2;
        if (this.f19751V) {
            this.f19751V = false;
            m25409J();
        }
    }

    /* renamed from: R */
    private void m25417R(int i, int i2) {
        this.f19784p0.mo32861a(this, i, i2);
    }

    /* renamed from: S */
    private void m25418S(int i) {
        m25419T(i, true);
    }

    /* renamed from: T */
    private void m25419T(int i, boolean z) {
        int i2;
        int pickedIndexRelativeToRaw;
        int i3;
        int i4;
        if ((!this.f19747R || !this.f19750U) && ((i3 = pickedIndexRelativeToRaw + i) > (i4 = this.f19793u) || i3 < (i4 = this.f19791t))) {
            i = i4 - (pickedIndexRelativeToRaw = getPickedIndexRelativeToRaw());
        }
        int i5 = this.f19733G0;
        int i6 = this.f19727B0;
        if (i5 < (-i6) / 2) {
            int i7 = i6 + i5;
            int i8 = (int) ((((float) (i5 + i6)) * 300.0f) / ((float) i6));
            i2 = i < 0 ? (-i8) - (i * 300) : i8 + (i * 300);
            i5 = i7;
        } else {
            int i9 = (int) ((((float) (-i5)) * 300.0f) / ((float) i6));
            int i10 = i * 300;
            i2 = i < 0 ? i9 - i10 : i9 + i10;
        }
        int i11 = i5 + (i * this.f19727B0);
        if (i2 < 300) {
            i2 = 300;
        }
        if (i2 > 600) {
            i2 = 600;
        }
        this.f19756b0.startScroll(0, this.f19735H0, 0, i11, i2);
        if (z) {
            this.f19774k0.sendMessageDelayed(m25400A(1), (long) (i2 / 4));
        } else {
            this.f19774k0.sendMessageDelayed(m25401B(1, 0, 0, new Boolean(z)), (long) (i2 / 4));
        }
        postInvalidate();
    }

    /* renamed from: W */
    private int m25420W(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* renamed from: X */
    private void m25421X() {
        Handler handler = this.f19774k0;
        if (handler != null) {
            handler.removeMessages(1);
        }
    }

    /* renamed from: Z */
    private void m25422Z(String[] strArr) {
        this.f19766g0 = strArr;
        m25438h0();
    }

    /* renamed from: a0 */
    private void m25424a0() {
        int i = this.f19785q;
        int i2 = i / 2;
        this.f19787r = i2;
        int i3 = i2 + 1;
        this.f19789s = i3;
        int i4 = this.f19725A0;
        this.f19728C0 = (float) ((i2 * i4) / i);
        this.f19729D0 = (float) ((i3 * i4) / i);
        if (this.f19781o < 0) {
            this.f19781o = 0;
        }
        if (this.f19783p < 0) {
            this.f19783p = 0;
        }
        if (this.f19781o + this.f19783p != 0 && getPaddingLeft() + this.f19781o >= (this.f19804z0 - getPaddingRight()) - this.f19783p) {
            int paddingLeft = getPaddingLeft() + this.f19781o + getPaddingRight();
            int i5 = this.f19783p;
            int i6 = (paddingLeft + i5) - this.f19804z0;
            int i7 = this.f19781o;
            float f = (float) i6;
            int i8 = (int) (((float) i7) - ((((float) i7) * f) / ((float) (i7 + i5))));
            this.f19781o = i8;
            this.f19783p = (int) (((float) i5) - ((f * ((float) i5)) / ((float) (i8 + i5))));
        }
    }

    /* renamed from: b0 */
    private void m25426b0() {
        int i = this.f19759d;
        int i2 = this.f19727B0;
        if (i > i2) {
            this.f19759d = i2;
        }
        int i3 = this.f19761e;
        int i4 = this.f19727B0;
        if (i3 > i4) {
            this.f19761e = i4;
        }
        Paint paint = this.f19764f0;
        if (paint != null) {
            paint.setTextSize((float) this.f19763f);
            this.f19745P = m25402C(this.f19764f0.getFontMetrics());
            this.f19765g = m25403D(this.f19736I, this.f19764f0);
            TextPaint textPaint = this.f19762e0;
            if (textPaint != null) {
                textPaint.setTextSize((float) this.f19761e);
                this.f19744O = m25402C(this.f19762e0.getFontMetrics());
                this.f19762e0.setTextSize((float) this.f19759d);
                this.f19743N = m25402C(this.f19762e0.getFontMetrics());
                return;
            }
            throw new IllegalArgumentException("mPaintText should not be null.");
        }
        throw new IllegalArgumentException("mPaintHint should not be null.");
    }

    /* renamed from: c0 */
    private void m25428c0() {
        float textSize = this.f19762e0.getTextSize();
        this.f19762e0.setTextSize((float) this.f19761e);
        double d = (double) (this.f19762e0.getFontMetrics().bottom - this.f19762e0.getFontMetrics().top);
        Double.isNaN(d);
        this.f19801y = (int) (d + 0.5d);
        this.f19762e0.setTextSize(textSize);
    }

    /* renamed from: d0 */
    private void m25430d0(boolean z) {
        m25432e0();
        m25428c0();
        if (!z) {
            return;
        }
        if (this.f19737I0 == Integer.MIN_VALUE || this.f19739J0 == Integer.MIN_VALUE) {
            this.f19776l0.sendEmptyMessage(3);
        }
    }

    /* renamed from: e0 */
    private void m25432e0() {
        float textSize = this.f19762e0.getTextSize();
        this.f19762e0.setTextSize((float) this.f19761e);
        this.f19799x = m25456z(this.f19766g0, this.f19762e0);
        this.f19803z = m25456z(this.f19768h0, this.f19762e0);
        this.f19724A = m25456z(this.f19770i0, this.f19762e0);
        this.f19762e0.setTextSize((float) this.f19763f);
        this.f19767h = m25403D(this.f19741L, this.f19762e0);
        this.f19762e0.setTextSize(textSize);
    }

    /* renamed from: f0 */
    private void m25434f0() {
        this.f19792t0 = 0;
        this.f19794u0 = (-this.f19785q) * this.f19727B0;
        if (this.f19766g0 != null) {
            int oneRecycleSize = getOneRecycleSize();
            int i = this.f19785q;
            int i2 = this.f19727B0;
            this.f19792t0 = ((oneRecycleSize - (i / 2)) - 1) * i2;
            this.f19794u0 = (-(i / 2)) * i2;
        }
    }

    /* renamed from: g0 */
    private void m25436g0() {
        m25405F();
        m25438h0();
        if (this.f19791t == -1) {
            this.f19791t = 0;
        }
        if (this.f19793u == -1) {
            this.f19793u = this.f19766g0.length - 1;
        }
        mo33064V(this.f19791t, this.f19793u, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.text.TextUtils.TruncateAt getEllipsizeType() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f19738J
            int r1 = r0.hashCode()
            r2 = -1074341483(0xffffffffbff6d995, float:-1.9285151)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = 100571(0x188db, float:1.4093E-40)
            if (r1 == r2) goto L_0x0022
            r2 = 109757538(0x68ac462, float:5.219839E-35)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "start"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "end"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "middle"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x004b
            if (r0 == r4) goto L_0x0048
            if (r0 != r3) goto L_0x0040
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            return r0
        L_0x0040:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Illegal text ellipsize type."
            r0.<init>(r1)
            throw r0
        L_0x0048:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            return r0
        L_0x004b:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.view.NumberPickerView.getEllipsizeType():android.text.TextUtils$TruncateAt");
    }

    /* renamed from: h0 */
    private void m25438h0() {
        this.f19750U = this.f19766g0.length > this.f19785q;
    }

    /* renamed from: n */
    private void m25444n() {
        int floor = (int) Math.floor((double) (((float) this.f19735H0) / ((float) this.f19727B0)));
        this.f19731F0 = floor;
        int i = this.f19735H0;
        int i2 = this.f19727B0;
        int i3 = -(i - (floor * i2));
        this.f19733G0 = i3;
        if (this.f19784p0 != null) {
            if ((-i3) > i2 / 2) {
                floor++;
            }
            this.f19790s0 = floor + (this.f19785q / 2);
            int oneRecycleSize = this.f19790s0 % getOneRecycleSize();
            this.f19790s0 = oneRecycleSize;
            if (oneRecycleSize < 0) {
                this.f19790s0 = oneRecycleSize + getOneRecycleSize();
            }
            int i4 = this.f19788r0;
            int i5 = this.f19790s0;
            if (i4 != i5) {
                m25417R(i5, i4);
            }
            this.f19788r0 = this.f19790s0;
        }
    }

    /* renamed from: o */
    private void m25445o(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        int i = 0;
        while (i < this.f19785q) {
            int i2 = this.f19727B0;
            if (((float) (i2 * i)) > y || y >= ((float) (i2 * (i + 1)))) {
                i++;
            } else {
                m25446p(i);
                return;
            }
        }
    }

    /* renamed from: p */
    private void m25446p(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f19785q)) {
            m25418S(i - (i2 / 2));
        }
    }

    /* renamed from: q */
    private String[] m25447q(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            return null;
        }
        String[] strArr = new String[charSequenceArr.length];
        for (int i = 0; i < charSequenceArr.length; i++) {
            strArr[i] = charSequenceArr[i].toString();
        }
        return strArr;
    }

    /* renamed from: r */
    private void m25448r(int i, boolean z) {
        int i2 = i - ((this.f19785q - 1) / 2);
        this.f19731F0 = i2;
        int y = m25455y(i2, getOneRecycleSize(), z);
        this.f19731F0 = y;
        int i3 = this.f19727B0;
        if (i3 == 0) {
            this.f19748S = true;
            return;
        }
        this.f19735H0 = i3 * y;
        int i4 = y + (this.f19785q / 2);
        this.f19788r0 = i4;
        int oneRecycleSize = i4 % getOneRecycleSize();
        this.f19788r0 = oneRecycleSize;
        if (oneRecycleSize < 0) {
            this.f19788r0 = oneRecycleSize + getOneRecycleSize();
        }
        this.f19790s0 = this.f19788r0;
        m25444n();
    }

    /* renamed from: s */
    private int m25449s(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: t */
    private void m25450t(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        String str;
        float f4 = 0.0f;
        int i2 = 0;
        while (i2 < this.f19785q + 1) {
            float f5 = (float) (this.f19733G0 + (this.f19727B0 * i2));
            int y = m25455y(this.f19731F0 + i2, getOneRecycleSize(), this.f19747R && this.f19750U);
            int i3 = this.f19785q;
            if (i2 == i3 / 2) {
                int i4 = this.f19727B0;
                f3 = ((float) (this.f19733G0 + i4)) / ((float) i4);
                i = m25453w(f3, this.f19753a, this.f19755b);
                f2 = m25454x(f3, (float) this.f19759d, (float) this.f19761e);
                f = m25454x(f3, this.f19743N, this.f19744O);
            } else if (i2 == (i3 / 2) + 1) {
                float f6 = 1.0f - f4;
                int w = m25453w(f6, this.f19753a, this.f19755b);
                float x = m25454x(f6, (float) this.f19759d, (float) this.f19761e);
                float x2 = m25454x(f6, this.f19743N, this.f19744O);
                f3 = f4;
                i = w;
                f2 = x;
                f = x2;
            } else {
                int i5 = this.f19753a;
                f2 = (float) this.f19759d;
                f = this.f19743N;
                int i6 = i5;
                f3 = f4;
                i = i6;
            }
            this.f19762e0.setColor(i);
            this.f19762e0.setTextSize(f2);
            if (y >= 0 && y < getOneRecycleSize()) {
                CharSequence charSequence = this.f19766g0[y + this.f19791t];
                if (this.f19738J != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f19762e0, (float) (getWidth() - (this.f19775l * 2)), getEllipsizeType());
                }
                str = charSequence.toString();
            } else if (!TextUtils.isEmpty(this.f19740K)) {
                str = this.f19740K;
            } else {
                i2++;
                f4 = f3;
            }
            canvas.drawText(str, this.f19730E0, f5 + ((float) (this.f19727B0 / 2)) + f, this.f19762e0);
            i2++;
            f4 = f3;
        }
    }

    /* renamed from: u */
    private void m25451u(Canvas canvas) {
        if (!TextUtils.isEmpty(this.f19736I)) {
            canvas.drawText(this.f19736I, this.f19730E0 + ((float) ((this.f19799x + this.f19765g) / 2)) + ((float) this.f19769i), ((this.f19728C0 + this.f19729D0) / 2.0f) + this.f19745P, this.f19764f0);
        }
    }

    /* renamed from: v */
    private void m25452v(Canvas canvas) {
        if (this.f19746Q) {
            canvas.drawLine((float) (getPaddingLeft() + this.f19781o), this.f19728C0, (float) ((this.f19804z0 - getPaddingRight()) - this.f19783p), this.f19728C0, this.f19760d0);
            canvas.drawLine((float) (getPaddingLeft() + this.f19781o), this.f19729D0, (float) ((this.f19804z0 - getPaddingRight()) - this.f19783p), this.f19729D0, this.f19760d0);
        }
    }

    /* renamed from: w */
    private int m25453w(float f, int i, int i2) {
        int i3 = (i & ViewCompat.MEASURED_STATE_MASK) >>> 24;
        int i4 = (i & 16711680) >>> 16;
        int i5 = (i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
        int i6 = (i & 255) >>> 0;
        return ((int) (((float) i6) + (((float) (((i2 & 255) >>> 0) - i6)) * f))) | (((int) (((float) i3) + (((float) (((-16777216 & i2) >>> 24) - i3)) * f))) << 24) | (((int) (((float) i4) + (((float) (((16711680 & i2) >>> 16) - i4)) * f))) << 16) | (((int) (((float) i5) + (((float) (((65280 & i2) >>> 8) - i5)) * f))) << 8);
    }

    /* renamed from: x */
    private float m25454x(float f, float f2, float f3) {
        return f2 + ((f3 - f2) * f);
    }

    /* renamed from: y */
    private int m25455y(int i, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (!z) {
            return i;
        }
        int i3 = i % i2;
        return i3 < 0 ? i3 + i2 : i3;
    }

    /* renamed from: z */
    private int m25456z(CharSequence[] charSequenceArr, Paint paint) {
        if (charSequenceArr == null) {
            return 0;
        }
        int i = 0;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence != null) {
                i = Math.max(m25403D(charSequence, paint), i);
            }
        }
        return i;
    }

    /* renamed from: U */
    public void mo33063U(int i, int i2) {
        mo33064V(i, i2, true);
    }

    /* renamed from: V */
    public void mo33064V(int i, int i2, boolean z) {
        if (i <= i2) {
            String[] strArr = this.f19766g0;
            if (strArr == null) {
                throw new IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
            } else if (i >= 0) {
                boolean z2 = true;
                if (i > strArr.length - 1) {
                    throw new IllegalArgumentException("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f19766g0.length - 1) + " minShowIndex is " + i);
                } else if (i2 < 0) {
                    throw new IllegalArgumentException("maxShowIndex should not be less than 0, now maxShowIndex is " + i2);
                } else if (i2 <= strArr.length - 1) {
                    this.f19791t = i;
                    this.f19793u = i2;
                    if (z) {
                        this.f19726B = i + 0;
                        if (!this.f19747R || !this.f19750U) {
                            z2 = false;
                        }
                        m25448r(0, z2);
                        postInvalidate();
                    }
                } else {
                    throw new IllegalArgumentException("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f19766g0.length - 1) + " maxShowIndex is " + i2);
                }
            } else {
                throw new IllegalArgumentException("minShowIndex should not be less than 0, now minShowIndex is " + i);
            }
        } else {
            throw new IllegalArgumentException("minShowIndex should be less than maxShowIndex, minShowIndex is " + i + ", maxShowIndex is " + i2 + ".");
        }
    }

    /* renamed from: Y */
    public void mo33065Y() {
        ScrollerCompat scrollerCompat = this.f19756b0;
        if (scrollerCompat != null && !scrollerCompat.isFinished()) {
            ScrollerCompat scrollerCompat2 = this.f19756b0;
            scrollerCompat2.startScroll(0, scrollerCompat2.getCurrY(), 0, 0, 1);
            this.f19756b0.abortAnimation();
            postInvalidate();
        }
    }

    public void computeScroll() {
        if (this.f19727B0 != 0 && this.f19756b0.computeScrollOffset()) {
            this.f19735H0 = this.f19756b0.getCurrY();
            m25444n();
            postInvalidate();
        }
    }

    public String getContentByCurrValue() {
        return this.f19766g0[getValue() - this.f19795v];
    }

    public String[] getDisplayedValues() {
        return this.f19766g0;
    }

    public int getMaxValue() {
        return this.f19797w;
    }

    public int getMinValue() {
        return this.f19795v;
    }

    public int getOneRecycleSize() {
        return (this.f19793u - this.f19791t) + 1;
    }

    public int getPickedIndexRelativeToRaw() {
        int i = this.f19733G0;
        if (i == 0) {
            return m25404E(this.f19735H0);
        }
        int i2 = this.f19727B0;
        return i < (-i2) / 2 ? m25404E(this.f19735H0 + i2 + i) : m25404E(this.f19735H0 + i);
    }

    public int getRawContentSize() {
        String[] strArr = this.f19766g0;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public int getValue() {
        return getPickedIndexRelativeToRaw() + this.f19795v;
    }

    public boolean getWrapSelectorWheel() {
        return this.f19747R;
    }

    public boolean getWrapSelectorWheelAbsolutely() {
        return this.f19747R && this.f19750U;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerThread handlerThread = this.f19772j0;
        if (handlerThread == null || !handlerThread.isAlive()) {
            m25408I();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19772j0.quit();
        if (this.f19727B0 != 0) {
            if (!this.f19756b0.isFinished()) {
                this.f19756b0.abortAnimation();
                this.f19735H0 = this.f19756b0.getCurrY();
                m25444n();
                int i = this.f19733G0;
                if (i != 0) {
                    int i2 = this.f19727B0;
                    if (i < (-i2) / 2) {
                        this.f19735H0 = this.f19735H0 + i2 + i;
                    } else {
                        this.f19735H0 += i;
                    }
                    m25444n();
                }
                m25414O(0);
            }
            int E = m25404E(this.f19735H0);
            int i3 = this.f19726B;
            if (E != i3 && this.f19752W) {
                try {
                    if (this.f19780n0 != null) {
                        this.f19780n0.mo32860a(this, i3 + this.f19795v, this.f19795v + E);
                    }
                    if (this.f19778m0 != null) {
                        this.f19778m0.mo33105a(this, this.f19726B, E, this.f19766g0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f19726B = E;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m25450t(canvas);
        m25452v(canvas);
        m25451u(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m25430d0(false);
        setMeasuredDimension(m25413N(i), m25412M(i2));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        this.f19804z0 = i;
        this.f19725A0 = i2;
        this.f19727B0 = i2 / this.f19785q;
        this.f19730E0 = ((float) ((i + getPaddingLeft()) - getPaddingRight())) / 2.0f;
        boolean z = false;
        if (getOneRecycleSize() > 1) {
            if (this.f19749T) {
                i5 = getValue() - this.f19795v;
            } else if (this.f19748S) {
                i5 = this.f19731F0 + ((this.f19785q - 1) / 2);
            }
            if (this.f19747R && this.f19750U) {
                z = true;
            }
            m25448r(i5, z);
            m25426b0();
            m25434f0();
            m25424a0();
            this.f19749T = true;
        }
        i5 = 0;
        z = true;
        m25448r(i5, z);
        m25426b0();
        m25434f0();
        m25424a0();
        this.f19749T = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r1 < ((float) r3)) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f19727B0
            r2 = 1
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            android.view.VelocityTracker r1 = r0.f19758c0
            if (r1 != 0) goto L_0x0012
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.f19758c0 = r1
        L_0x0012:
            android.view.VelocityTracker r1 = r0.f19758c0
            r3 = r18
            r1.addMovement(r3)
            float r1 = r18.getY()
            r0.f19800x0 = r1
            int r1 = r18.getAction()
            r4 = 0
            if (r1 == 0) goto L_0x00c1
            r5 = 0
            r7 = 2
            if (r1 == r2) goto L_0x0072
            if (r1 == r7) goto L_0x0045
            r3 = 3
            if (r1 == r3) goto L_0x0032
            goto L_0x00de
        L_0x0032:
            int r1 = r0.f19735H0
            float r1 = (float) r1
            r0.f19796v0 = r1
            r17.mo33065Y()
            android.os.Handler r1 = r0.f19774k0
            android.os.Message r3 = r0.m25400A(r2)
            r1.sendMessageDelayed(r3, r5)
            goto L_0x00de
        L_0x0045:
            float r1 = r0.f19798w0
            float r3 = r0.f19800x0
            float r1 = r1 - r3
            boolean r3 = r0.f19802y0
            if (r3 == 0) goto L_0x005c
            int r3 = r0.f19734H
            int r5 = -r3
            float r5 = (float) r5
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x005c
            float r3 = (float) r3
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x005c
            goto L_0x006e
        L_0x005c:
            r0.f19802y0 = r4
            float r3 = r0.f19796v0
            float r3 = r3 + r1
            int r1 = (int) r3
            int r1 = r0.m25411L(r1)
            r0.f19735H0 = r1
            r17.m25444n()
            r17.invalidate()
        L_0x006e:
            r0.m25414O(r2)
            goto L_0x00de
        L_0x0072:
            boolean r1 = r0.f19802y0
            if (r1 == 0) goto L_0x007a
            r17.m25445o(r18)
            goto L_0x00de
        L_0x007a:
            android.view.VelocityTracker r1 = r0.f19758c0
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            float r1 = r1.getYVelocity()
            float r3 = r0.f19742M
            float r1 = r1 * r3
            int r1 = (int) r1
            int r3 = java.lang.Math.abs(r1)
            int r4 = r0.f19732G
            if (r3 <= r4) goto L_0x00b4
            androidx.core.widget.ScrollerCompat r8 = r0.f19756b0
            r9 = 0
            int r10 = r0.f19735H0
            r11 = 0
            int r12 = -r1
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 2147483647(0x7fffffff, float:NaN)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r15 = r0.m25411L(r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r16 = r0.m25411L(r1)
            r8.fling(r9, r10, r11, r12, r13, r14, r15, r16)
            r17.invalidate()
            r0.m25414O(r7)
        L_0x00b4:
            android.os.Handler r1 = r0.f19774k0
            android.os.Message r3 = r0.m25400A(r2)
            r1.sendMessageDelayed(r3, r5)
            r17.m25415P()
            goto L_0x00de
        L_0x00c1:
            r0.f19802y0 = r2
            android.os.Handler r1 = r0.f19774k0
            r1.removeMessages(r2)
            r17.mo33065Y()
            float r1 = r0.f19800x0
            r0.f19798w0 = r1
            int r1 = r0.f19735H0
            float r1 = (float) r1
            r0.f19796v0 = r1
            r0.m25414O(r4)
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r2)
        L_0x00de:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.view.NumberPickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setContentTextTypeface(Typeface typeface) {
        this.f19762e0.setTypeface(typeface);
    }

    public void setDisplayedValues(String[] strArr) {
        m25421X();
        mo33065Y();
        if (strArr != null) {
            boolean z = true;
            if ((this.f19797w - this.f19795v) + 1 <= strArr.length) {
                m25422Z(strArr);
                m25430d0(true);
                this.f19726B = this.f19791t + 0;
                if (!this.f19747R || !this.f19750U) {
                    z = false;
                }
                m25448r(0, z);
                postInvalidate();
                this.f19776l0.sendEmptyMessage(3);
                return;
            }
            throw new IllegalArgumentException("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is " + ((this.f19797w - this.f19795v) + 1) + " newDisplayedValues.length is " + strArr.length + ", you need to set MaxValue and MinValue before setDisplayedValues(String[])");
        }
        throw new IllegalArgumentException("newDisplayedValues should not be null.");
    }

    public void setDividerColor(int i) {
        if (this.f19777m != i) {
            this.f19777m = i;
            this.f19760d0.setColor(i);
            postInvalidate();
        }
    }

    public void setFriction(float f) {
        if (f > 0.0f) {
            ViewConfiguration.get(getContext());
            this.f19742M = ViewConfiguration.getScrollFriction() / f;
            return;
        }
        throw new IllegalArgumentException("you should set a a positive float friction, now friction is " + f);
    }

    public void setHintText(String str) {
        if (!m25410K(this.f19736I, str)) {
            this.f19736I = str;
            this.f19745P = m25402C(this.f19764f0.getFontMetrics());
            this.f19765g = m25403D(this.f19736I, this.f19764f0);
            this.f19776l0.sendEmptyMessage(3);
        }
    }

    public void setHintTextColor(int i) {
        if (this.f19757c != i) {
            this.f19757c = i;
            this.f19764f0.setColor(i);
            postInvalidate();
        }
    }

    public void setHintTextTypeface(Typeface typeface) {
        this.f19764f0.setTypeface(typeface);
    }

    public void setMaxValue(int i) {
        String[] strArr = this.f19766g0;
        if (strArr != null) {
            int i2 = this.f19795v;
            if ((i - i2) + 1 <= strArr.length) {
                this.f19797w = i;
                int i3 = this.f19791t;
                int i4 = (i - i2) + i3;
                this.f19793u = i4;
                mo33063U(i3, i4);
                m25434f0();
                return;
            }
            throw new IllegalArgumentException("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is " + ((i - this.f19795v) + 1) + " and mDisplayedValues.length is " + this.f19766g0.length);
        }
        throw new NullPointerException("mDisplayedValues should not be null");
    }

    public void setMinValue(int i) {
        this.f19795v = i;
        this.f19791t = 0;
        m25434f0();
    }

    public void setNormalTextColor(int i) {
        if (this.f19753a != i) {
            this.f19753a = i;
            postInvalidate();
        }
    }

    public void setOnScrollListener(C10474c cVar) {
        this.f19782o0 = cVar;
    }

    public void setOnValueChangeListenerInScrolling(C10476e eVar) {
        this.f19784p0 = eVar;
    }

    public void setOnValueChangedListener(C10475d dVar) {
        this.f19780n0 = dVar;
    }

    public void setOnValueChangedListenerRelativeToRaw(C10477f fVar) {
        this.f19778m0 = fVar;
    }

    public void setPickedIndexRelativeToMin(int i) {
        if (i >= 0 && i < getOneRecycleSize()) {
            this.f19726B = this.f19791t + i;
            m25448r(i, this.f19747R && this.f19750U);
            postInvalidate();
        }
    }

    public void setPickedIndexRelativeToRaw(int i) {
        int i2 = this.f19791t;
        if (i2 > -1 && i2 <= i && i <= this.f19793u) {
            this.f19726B = i;
            m25448r(i - i2, this.f19747R && this.f19750U);
            postInvalidate();
        }
    }

    public void setSelectedTextColor(int i) {
        if (this.f19755b != i) {
            this.f19755b = i;
            postInvalidate();
        }
    }

    public void setValue(int i) {
        int i2 = this.f19795v;
        if (i < i2) {
            throw new IllegalArgumentException("should not set a value less than mMinValue, value is " + i);
        } else if (i <= this.f19797w) {
            setPickedIndexRelativeToRaw(i - i2);
        } else {
            throw new IllegalArgumentException("should not set a value greater than mMaxValue, value is " + i);
        }
    }

    public void setWrapSelectorWheel(boolean z) {
        if (this.f19747R == z) {
            return;
        }
        if (z) {
            this.f19747R = z;
            m25438h0();
            postInvalidate();
        } else if (this.f19786q0 == 0) {
            m25409J();
        } else {
            this.f19751V = true;
        }
    }
}
