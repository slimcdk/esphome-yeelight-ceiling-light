package com.yeelight.yeelib.p142ui.view;

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
import java.util.Objects;

/* renamed from: com.yeelight.yeelib.ui.view.NumberPickerView */
public class NumberPickerView extends View {

    /* renamed from: A */
    private int f15982A = 0;

    /* renamed from: A0 */
    private int f15983A0;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f15984B = 0;

    /* renamed from: B0 */
    private int f15985B0;

    /* renamed from: C */
    private int f15986C = 150;

    /* renamed from: C0 */
    private int f15987C0;

    /* renamed from: D0 */
    private int f15988D0;

    /* renamed from: E0 */
    private float f15989E0 = 0.0f;

    /* renamed from: F0 */
    private float f15990F0 = 0.0f;

    /* renamed from: G0 */
    private float f15991G0 = 0.0f;

    /* renamed from: H0 */
    private boolean f15992H0 = false;

    /* renamed from: I0 */
    private int f15993I0;

    /* renamed from: J0 */
    private int f15994J0;
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public int f15995K0;

    /* renamed from: L0 */
    private float f15996L0;

    /* renamed from: M0 */
    private float f15997M0;

    /* renamed from: N0 */
    private float f15998N0;

    /* renamed from: O0 */
    private int f15999O0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: P0 */
    public int f16000P0 = 0;

    /* renamed from: Q */
    private int f16001Q = 8;
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public int f16002Q0 = 0;

    /* renamed from: R */
    private String f16003R;

    /* renamed from: R0 */
    private int f16004R0 = 0;

    /* renamed from: S */
    private String f16005S;

    /* renamed from: S0 */
    private int f16006S0 = 0;

    /* renamed from: T */
    private String f16007T;

    /* renamed from: U */
    private String f16008U;

    /* renamed from: V */
    private float f16009V = 1.0f;

    /* renamed from: W */
    private float f16010W = 0.0f;

    /* renamed from: a */
    private int f16011a = -13421773;

    /* renamed from: a0 */
    private float f16012a0 = 0.0f;

    /* renamed from: b */
    private int f16013b = -695533;

    /* renamed from: b0 */
    private float f16014b0 = 0.0f;

    /* renamed from: c */
    private int f16015c = -695533;

    /* renamed from: c0 */
    private boolean f16016c0 = true;

    /* renamed from: d */
    private int f16017d = 0;

    /* renamed from: d0 */
    private boolean f16018d0 = true;

    /* renamed from: e */
    private int f16019e = 0;

    /* renamed from: e0 */
    private boolean f16020e0 = false;

    /* renamed from: f */
    private int f16021f = 0;

    /* renamed from: f0 */
    private boolean f16022f0 = false;

    /* renamed from: g */
    private int f16023g = 0;

    /* renamed from: g0 */
    private boolean f16024g0 = true;

    /* renamed from: h */
    private int f16025h = 0;

    /* renamed from: h0 */
    private boolean f16026h0 = false;

    /* renamed from: i */
    private int f16027i = 0;

    /* renamed from: i0 */
    private boolean f16028i0 = false;

    /* renamed from: j */
    private int f16029j = 0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public boolean f16030j0 = true;

    /* renamed from: k */
    private int f16031k = 0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public ScrollerCompat f16032k0;

    /* renamed from: l */
    private int f16033l = 0;

    /* renamed from: l0 */
    private VelocityTracker f16034l0;

    /* renamed from: m */
    private int f16035m = -695533;

    /* renamed from: m0 */
    private Paint f16036m0 = new Paint();

    /* renamed from: n */
    private int f16037n = 2;

    /* renamed from: n0 */
    private TextPaint f16038n0 = new TextPaint();

    /* renamed from: o */
    private int f16039o = 0;

    /* renamed from: o0 */
    private Paint f16040o0 = new Paint();

    /* renamed from: p */
    private int f16041p = 0;

    /* renamed from: p0 */
    private String[] f16042p0;

    /* renamed from: q */
    private int f16043q = 3;

    /* renamed from: q0 */
    private CharSequence[] f16044q0;

    /* renamed from: r */
    private int f16045r = 0;

    /* renamed from: r0 */
    private CharSequence[] f16046r0;

    /* renamed from: s */
    private int f16047s = 0;

    /* renamed from: s0 */
    private HandlerThread f16048s0;

    /* renamed from: t */
    private int f16049t = -1;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public Handler f16050t0;

    /* renamed from: u */
    private int f16051u = -1;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public Handler f16052u0;

    /* renamed from: v */
    private int f16053v = 0;

    /* renamed from: v0 */
    private C8854f f16054v0;

    /* renamed from: w */
    private int f16055w = 0;

    /* renamed from: w0 */
    private C8852d f16056w0;

    /* renamed from: x */
    private int f16057x = 0;

    /* renamed from: x0 */
    private C8851c f16058x0;

    /* renamed from: y */
    private int f16059y = 0;

    /* renamed from: y0 */
    private C8853e f16060y0;

    /* renamed from: z */
    private int f16061z = 0;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public int f16062z0 = 0;

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPickerView$a */
    class C8849a extends Handler {
        C8849a(Looper looper) {
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
                if (!NumberPickerView.this.f16032k0.isFinished()) {
                    if (NumberPickerView.this.f16062z0 == 0) {
                        NumberPickerView.this.m21028O(1);
                    }
                    d = NumberPickerView.this.f16050t0;
                    g = NumberPickerView.this.m21015B(1, 0, 0, message.obj);
                    j = 32;
                } else {
                    if (NumberPickerView.this.f16000P0 != 0) {
                        if (NumberPickerView.this.f16062z0 == 0) {
                            NumberPickerView.this.m21028O(1);
                        }
                        if (NumberPickerView.this.f16000P0 < (-NumberPickerView.this.f15995K0) / 2) {
                            i3 = (int) ((((float) (NumberPickerView.this.f15995K0 + NumberPickerView.this.f16000P0)) * 300.0f) / ((float) NumberPickerView.this.f15995K0));
                            NumberPickerView.this.f16032k0.startScroll(0, NumberPickerView.this.f16002Q0, 0, NumberPickerView.this.f16000P0 + NumberPickerView.this.f15995K0, i3 * 3);
                            numberPickerView = NumberPickerView.this;
                            i2 = numberPickerView.f16002Q0 + NumberPickerView.this.f15995K0;
                        } else {
                            i3 = (int) ((((float) (-NumberPickerView.this.f16000P0)) * 300.0f) / ((float) NumberPickerView.this.f15995K0));
                            NumberPickerView.this.f16032k0.startScroll(0, NumberPickerView.this.f16002Q0, 0, NumberPickerView.this.f16000P0, i3 * 3);
                            numberPickerView = NumberPickerView.this;
                            i2 = numberPickerView.f16002Q0;
                        }
                        i = numberPickerView.m21018E(i2 + NumberPickerView.this.f16000P0);
                        i5 = i3;
                        NumberPickerView.this.postInvalidate();
                    } else {
                        NumberPickerView.this.m21028O(0);
                        NumberPickerView numberPickerView2 = NumberPickerView.this;
                        i = numberPickerView2.m21018E(numberPickerView2.f16002Q0);
                    }
                    NumberPickerView numberPickerView3 = NumberPickerView.this;
                    g = numberPickerView3.m21015B(2, numberPickerView3.f15984B, i, message.obj);
                    d = NumberPickerView.this.f16030j0 ? NumberPickerView.this.f16052u0 : NumberPickerView.this.f16050t0;
                    j = (long) (i5 * 2);
                }
                d.sendMessageDelayed(g, j);
            } else if (i4 == 2) {
                NumberPickerView.this.m21030Q(message.arg1, message.arg2, message.obj);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPickerView$b */
    class C8850b extends Handler {
        C8850b() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 2) {
                NumberPickerView.this.m21030Q(message.arg1, message.arg2, message.obj);
            } else if (i == 3) {
                NumberPickerView.this.requestLayout();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPickerView$c */
    public interface C8851c {
        /* renamed from: a */
        void mo36473a(NumberPickerView numberPickerView, int i);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPickerView$d */
    public interface C8852d {
        /* renamed from: a */
        void mo36230a(NumberPickerView numberPickerView, int i, int i2);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPickerView$e */
    public interface C8853e {
        /* renamed from: a */
        void mo36231a(NumberPickerView numberPickerView, int i, int i2);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPickerView$f */
    public interface C8854f {
        /* renamed from: a */
        void mo36474a(NumberPickerView numberPickerView, int i, int i2, String[] strArr);
    }

    public NumberPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m21021H(context, attributeSet);
        m21020G(context);
    }

    /* renamed from: A */
    private Message m21014A(int i) {
        return m21015B(i, 0, 0, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public Message m21015B(int i, int i2, int i3, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        return obtain;
    }

    /* renamed from: C */
    private float m21016C(Paint.FontMetrics fontMetrics) {
        if (fontMetrics == null) {
            return 0.0f;
        }
        return Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    /* renamed from: D */
    private int m21017D(CharSequence charSequence, Paint paint) {
        if (!TextUtils.isEmpty(charSequence)) {
            return (int) (paint.measureText(charSequence.toString()) + 0.5f);
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public int m21018E(int i) {
        int i2 = this.f15995K0;
        boolean z = false;
        if (i2 == 0) {
            return 0;
        }
        int i3 = (i / i2) + (this.f16043q / 2);
        int oneRecycleSize = getOneRecycleSize();
        if (this.f16018d0 && this.f16024g0) {
            z = true;
        }
        int y = m21069y(i3, oneRecycleSize, z);
        if (y >= 0 && y < getOneRecycleSize()) {
            return y + this.f16049t;
        }
        throw new IllegalArgumentException("getWillPickIndexByGlobalY illegal index : " + y + " getOneRecycleSize() : " + getOneRecycleSize() + " mWrapSelectorWheel : " + this.f16018d0);
    }

    /* renamed from: F */
    private void m21019F() {
        if (this.f16042p0 == null) {
            String[] strArr = new String[1];
            this.f16042p0 = strArr;
            strArr[0] = TimerCodec.DISENABLE;
        }
    }

    /* renamed from: G */
    private void m21020G(Context context) {
        this.f16032k0 = ScrollerCompat.create(context);
        this.f15986C = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        this.f16001Q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.f16017d == 0) {
            this.f16017d = m21034W(context, 14.0f);
        }
        if (this.f16019e == 0) {
            this.f16019e = m21034W(context, 16.0f);
        }
        if (this.f16021f == 0) {
            this.f16021f = m21034W(context, 14.0f);
        }
        if (this.f16027i == 0) {
            this.f16027i = m21063s(context, 8.0f);
        }
        if (this.f16029j == 0) {
            this.f16029j = m21063s(context, 8.0f);
        }
        this.f16036m0.setColor(this.f16035m);
        this.f16036m0.setAntiAlias(true);
        this.f16036m0.setStyle(Paint.Style.STROKE);
        this.f16036m0.setStrokeWidth((float) this.f16037n);
        this.f16038n0.setColor(this.f16011a);
        this.f16038n0.setAntiAlias(true);
        this.f16038n0.setTextAlign(Paint.Align.CENTER);
        this.f16040o0.setColor(this.f16015c);
        this.f16040o0.setAntiAlias(true);
        this.f16040o0.setTextAlign(Paint.Align.CENTER);
        this.f16040o0.setTextSize((float) this.f16021f);
        int i = this.f16043q;
        if (i % 2 == 0) {
            this.f16043q = i + 1;
        }
        if (this.f16049t == -1 || this.f16051u == -1) {
            m21050g0();
        }
        m21022I();
    }

    /* renamed from: H */
    private void m21021H(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NumberPickerView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.NumberPickerView_npv_ShowCount) {
                    this.f16043q = obtainStyledAttributes.getInt(index, 3);
                } else if (index == R$styleable.NumberPickerView_npv_DividerColor) {
                    this.f16035m = obtainStyledAttributes.getColor(index, -695533);
                } else if (index == R$styleable.NumberPickerView_npv_DividerHeight) {
                    this.f16037n = obtainStyledAttributes.getDimensionPixelSize(index, 2);
                } else if (index == R$styleable.NumberPickerView_npv_DividerMarginLeft) {
                    this.f16039o = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.NumberPickerView_npv_DividerMarginRight) {
                    this.f16041p = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.NumberPickerView_npv_TextArray) {
                    this.f16042p0 = m21061q(obtainStyledAttributes.getTextArray(index));
                } else if (index == R$styleable.NumberPickerView_npv_TextColorNormal) {
                    this.f16011a = obtainStyledAttributes.getColor(index, -13421773);
                } else if (index == R$styleable.NumberPickerView_npv_TextColorSelected) {
                    this.f16013b = obtainStyledAttributes.getColor(index, -695533);
                } else if (index == R$styleable.NumberPickerView_npv_TextColorHint) {
                    this.f16015c = obtainStyledAttributes.getColor(index, -695533);
                } else if (index == R$styleable.NumberPickerView_npv_TextSizeNormal) {
                    this.f16017d = obtainStyledAttributes.getDimensionPixelSize(index, m21034W(context, 14.0f));
                } else if (index == R$styleable.NumberPickerView_npv_TextSizeSelected) {
                    this.f16019e = obtainStyledAttributes.getDimensionPixelSize(index, m21034W(context, 16.0f));
                } else if (index == R$styleable.NumberPickerView_npv_TextSizeHint) {
                    this.f16021f = obtainStyledAttributes.getDimensionPixelSize(index, m21034W(context, 14.0f));
                } else if (index == R$styleable.NumberPickerView_npv_MinValue) {
                    this.f16049t = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == R$styleable.NumberPickerView_npv_MaxValue) {
                    this.f16051u = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == R$styleable.NumberPickerView_npv_WrapSelectorWheel) {
                    this.f16018d0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == R$styleable.NumberPickerView_npv_ShowDivider) {
                    this.f16016c0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == R$styleable.NumberPickerView_npv_HintText) {
                    this.f16003R = obtainStyledAttributes.getString(index);
                } else if (index == R$styleable.NumberPickerView_npv_AlternativeHint) {
                    this.f16008U = obtainStyledAttributes.getString(index);
                } else if (index == R$styleable.NumberPickerView_npv_EmptyItemHint) {
                    this.f16007T = obtainStyledAttributes.getString(index);
                } else if (index == R$styleable.NumberPickerView_npv_MarginStartOfHint) {
                    this.f16027i = obtainStyledAttributes.getDimensionPixelSize(index, m21063s(context, 8.0f));
                } else if (index == R$styleable.NumberPickerView_npv_MarginEndOfHint) {
                    this.f16029j = obtainStyledAttributes.getDimensionPixelSize(index, m21063s(context, 8.0f));
                } else if (index == R$styleable.NumberPickerView_npv_ItemPaddingVertical) {
                    this.f16031k = obtainStyledAttributes.getDimensionPixelSize(index, m21063s(context, 2.0f));
                } else if (index == R$styleable.NumberPickerView_npv_ItemPaddingHorizontal) {
                    this.f16033l = obtainStyledAttributes.getDimensionPixelSize(index, m21063s(context, 5.0f));
                } else if (index == R$styleable.NumberPickerView_npv_AlternativeTextArrayWithMeasureHint) {
                    this.f16044q0 = obtainStyledAttributes.getTextArray(index);
                } else if (index == R$styleable.NumberPickerView_npv_AlternativeTextArrayWithoutMeasureHint) {
                    this.f16046r0 = obtainStyledAttributes.getTextArray(index);
                } else if (index == R$styleable.NumberPickerView_npv_RespondChangeOnDetached) {
                    this.f16028i0 = obtainStyledAttributes.getBoolean(index, false);
                } else if (index == R$styleable.NumberPickerView_npv_RespondChangeInMainThread) {
                    this.f16030j0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == R$styleable.NumberPickerView_npv_TextEllipsize) {
                    this.f16005S = obtainStyledAttributes.getString(index);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: I */
    private void m21022I() {
        HandlerThread handlerThread = new HandlerThread("HandlerThread-For-Refreshing");
        this.f16048s0 = handlerThread;
        handlerThread.start();
        this.f16050t0 = new C8849a(this.f16048s0.getLooper());
        this.f16052u0 = new C8850b();
    }

    /* renamed from: J */
    private void m21023J() {
        m21062r(getPickedIndexRelativeToRaw() - this.f16049t, false);
        this.f16018d0 = false;
        postInvalidate();
    }

    /* renamed from: K */
    private boolean m21024K(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r0 = r1.f15987C0;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m21025L(int r2) {
        /*
            r1 = this;
            boolean r0 = r1.f16018d0
            if (r0 == 0) goto L_0x0009
            boolean r0 = r1.f16024g0
            if (r0 == 0) goto L_0x0009
            return r2
        L_0x0009:
            int r0 = r1.f15988D0
            if (r2 >= r0) goto L_0x000f
        L_0x000d:
            r2 = r0
            goto L_0x0014
        L_0x000f:
            int r0 = r1.f15987C0
            if (r2 <= r0) goto L_0x0014
            goto L_0x000d
        L_0x0014:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.view.NumberPickerView.m21025L(int):int");
    }

    /* renamed from: M */
    private int m21026M(int i) {
        int mode = View.MeasureSpec.getMode(i);
        this.f16006S0 = mode;
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom() + (this.f16043q * (this.f16059y + (this.f16031k * 2)));
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    /* renamed from: N */
    private int m21027N(int i) {
        int mode = View.MeasureSpec.getMode(i);
        this.f16004R0 = mode;
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int i2 = 0;
        int i3 = Math.max(this.f16023g, this.f16025h) == 0 ? 0 : this.f16029j;
        if (Math.max(this.f16023g, this.f16025h) != 0) {
            i2 = this.f16027i;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight() + Math.max(this.f16061z, Math.max(this.f16057x, this.f15982A) + ((i2 + Math.max(this.f16023g, this.f16025h) + i3 + (this.f16033l * 2)) * 2));
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m21028O(int i) {
        if (this.f16062z0 != i) {
            this.f16062z0 = i;
            C8851c cVar = this.f16058x0;
            if (cVar != null) {
                cVar.mo36473a(this, i);
            }
        }
    }

    /* renamed from: P */
    private void m21029P() {
        VelocityTracker velocityTracker = this.f16034l0;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f16034l0.recycle();
            this.f16034l0 = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m21030Q(int i, int i2, Object obj) {
        m21028O(0);
        if (i != i2 && (obj == null || !(obj instanceof Boolean) || ((Boolean) obj).booleanValue())) {
            C8852d dVar = this.f16056w0;
            if (dVar != null) {
                int i3 = this.f16053v;
                dVar.mo36230a(this, i + i3, i3 + i2);
            }
            C8854f fVar = this.f16054v0;
            if (fVar != null) {
                fVar.mo36474a(this, i, i2, this.f16042p0);
            }
        }
        this.f15984B = i2;
        if (this.f16026h0) {
            this.f16026h0 = false;
            m21023J();
        }
    }

    /* renamed from: R */
    private void m21031R(int i, int i2) {
        this.f16060y0.mo36231a(this, i, i2);
    }

    /* renamed from: S */
    private void m21032S(int i) {
        m21033T(i, true);
    }

    /* renamed from: T */
    private void m21033T(int i, boolean z) {
        int i2;
        int pickedIndexRelativeToRaw;
        int i3;
        int i4;
        if ((!this.f16018d0 || !this.f16024g0) && ((i3 = pickedIndexRelativeToRaw + i) > (i4 = this.f16051u) || i3 < (i4 = this.f16049t))) {
            i = i4 - (pickedIndexRelativeToRaw = getPickedIndexRelativeToRaw());
        }
        int i5 = this.f16000P0;
        int i6 = this.f15995K0;
        if (i5 < (-i6) / 2) {
            int i7 = i6 + i5;
            int i8 = (int) ((((float) (i5 + i6)) * 300.0f) / ((float) i6));
            int i9 = i7;
            i2 = i < 0 ? (-i8) - (i * 300) : i8 + (i * 300);
            i5 = i9;
        } else {
            int i10 = (int) ((((float) (-i5)) * 300.0f) / ((float) i6));
            int i11 = i * 300;
            i2 = i < 0 ? i10 - i11 : i10 + i11;
        }
        int i12 = i5 + (i * i6);
        if (i2 < 300) {
            i2 = 300;
        }
        if (i2 > 600) {
            i2 = 600;
        }
        this.f16032k0.startScroll(0, this.f16002Q0, 0, i12, i2);
        if (z) {
            this.f16050t0.sendMessageDelayed(m21014A(1), (long) (i2 / 4));
        } else {
            this.f16050t0.sendMessageDelayed(m21015B(1, 0, 0, new Boolean(z)), (long) (i2 / 4));
        }
        postInvalidate();
    }

    /* renamed from: W */
    private int m21034W(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* renamed from: X */
    private void m21035X() {
        Handler handler = this.f16050t0;
        if (handler != null) {
            handler.removeMessages(1);
        }
    }

    /* renamed from: Z */
    private void m21036Z(String[] strArr) {
        this.f16042p0 = strArr;
        m21052h0();
    }

    /* renamed from: a0 */
    private void m21038a0() {
        int i = this.f16043q;
        int i2 = i / 2;
        this.f16045r = i2;
        int i3 = i2 + 1;
        this.f16047s = i3;
        int i4 = this.f15994J0;
        this.f15996L0 = (float) ((i2 * i4) / i);
        this.f15997M0 = (float) ((i3 * i4) / i);
        if (this.f16039o < 0) {
            this.f16039o = 0;
        }
        if (this.f16041p < 0) {
            this.f16041p = 0;
        }
        if (this.f16039o + this.f16041p != 0 && getPaddingLeft() + this.f16039o >= (this.f15993I0 - getPaddingRight()) - this.f16041p) {
            int paddingLeft = getPaddingLeft() + this.f16039o + getPaddingRight();
            int i5 = this.f16041p;
            int i6 = (paddingLeft + i5) - this.f15993I0;
            int i7 = this.f16039o;
            float f = (float) i6;
            int i8 = (int) (((float) i7) - ((((float) i7) * f) / ((float) (i7 + i5))));
            this.f16039o = i8;
            this.f16041p = (int) (((float) i5) - ((f * ((float) i5)) / ((float) (i8 + i5))));
        }
    }

    /* renamed from: b0 */
    private void m21040b0() {
        int i = this.f16017d;
        int i2 = this.f15995K0;
        if (i > i2) {
            this.f16017d = i2;
        }
        if (this.f16019e > i2) {
            this.f16019e = i2;
        }
        Paint paint = this.f16040o0;
        if (paint != null) {
            paint.setTextSize((float) this.f16021f);
            this.f16014b0 = m21016C(this.f16040o0.getFontMetrics());
            this.f16023g = m21017D(this.f16003R, this.f16040o0);
            TextPaint textPaint = this.f16038n0;
            if (textPaint != null) {
                textPaint.setTextSize((float) this.f16019e);
                this.f16012a0 = m21016C(this.f16038n0.getFontMetrics());
                this.f16038n0.setTextSize((float) this.f16017d);
                this.f16010W = m21016C(this.f16038n0.getFontMetrics());
                return;
            }
            throw new IllegalArgumentException("mPaintText should not be null.");
        }
        throw new IllegalArgumentException("mPaintHint should not be null.");
    }

    /* renamed from: c0 */
    private void m21042c0() {
        float textSize = this.f16038n0.getTextSize();
        this.f16038n0.setTextSize((float) this.f16019e);
        double d = (double) (this.f16038n0.getFontMetrics().bottom - this.f16038n0.getFontMetrics().top);
        Double.isNaN(d);
        this.f16059y = (int) (d + 0.5d);
        this.f16038n0.setTextSize(textSize);
    }

    /* renamed from: d0 */
    private void m21044d0(boolean z) {
        m21046e0();
        m21042c0();
        if (!z) {
            return;
        }
        if (this.f16004R0 == Integer.MIN_VALUE || this.f16006S0 == Integer.MIN_VALUE) {
            this.f16052u0.sendEmptyMessage(3);
        }
    }

    /* renamed from: e0 */
    private void m21046e0() {
        float textSize = this.f16038n0.getTextSize();
        this.f16038n0.setTextSize((float) this.f16019e);
        this.f16057x = m21070z(this.f16042p0, this.f16038n0);
        this.f16061z = m21070z(this.f16044q0, this.f16038n0);
        this.f15982A = m21070z(this.f16046r0, this.f16038n0);
        this.f16038n0.setTextSize((float) this.f16021f);
        this.f16025h = m21017D(this.f16008U, this.f16038n0);
        this.f16038n0.setTextSize(textSize);
    }

    /* renamed from: f0 */
    private void m21048f0() {
        this.f15987C0 = 0;
        this.f15988D0 = (-this.f16043q) * this.f15995K0;
        if (this.f16042p0 != null) {
            int oneRecycleSize = getOneRecycleSize();
            int i = this.f16043q;
            int i2 = this.f15995K0;
            this.f15987C0 = ((oneRecycleSize - (i / 2)) - 1) * i2;
            this.f15988D0 = (-(i / 2)) * i2;
        }
    }

    /* renamed from: g0 */
    private void m21050g0() {
        m21019F();
        m21052h0();
        if (this.f16049t == -1) {
            this.f16049t = 0;
        }
        if (this.f16051u == -1) {
            this.f16051u = this.f16042p0.length - 1;
        }
        mo36433V(this.f16049t, this.f16051u, false);
    }

    private TextUtils.TruncateAt getEllipsizeType() {
        String str = this.f16005S;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1074341483:
                if (str.equals("middle")) {
                    c = 0;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 1;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return TextUtils.TruncateAt.MIDDLE;
            case 1:
                return TextUtils.TruncateAt.END;
            case 2:
                return TextUtils.TruncateAt.START;
            default:
                throw new IllegalArgumentException("Illegal text ellipsize type.");
        }
    }

    /* renamed from: h0 */
    private void m21052h0() {
        this.f16024g0 = this.f16042p0.length > this.f16043q;
    }

    /* renamed from: n */
    private void m21058n() {
        int floor = (int) Math.floor((double) (((float) this.f16002Q0) / ((float) this.f15995K0)));
        this.f15999O0 = floor;
        int i = this.f16002Q0;
        int i2 = this.f15995K0;
        int i3 = -(i - (floor * i2));
        this.f16000P0 = i3;
        if (this.f16060y0 != null) {
            if ((-i3) > i2 / 2) {
                floor++;
            }
            this.f15985B0 = floor + (this.f16043q / 2);
            int oneRecycleSize = this.f15985B0 % getOneRecycleSize();
            this.f15985B0 = oneRecycleSize;
            if (oneRecycleSize < 0) {
                this.f15985B0 = oneRecycleSize + getOneRecycleSize();
            }
            int i4 = this.f15983A0;
            int i5 = this.f15985B0;
            if (i4 != i5) {
                m21031R(i5, i4);
            }
            this.f15983A0 = this.f15985B0;
        }
    }

    /* renamed from: o */
    private void m21059o(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        int i = 0;
        while (i < this.f16043q) {
            int i2 = this.f15995K0;
            if (((float) (i2 * i)) > y || y >= ((float) (i2 * (i + 1)))) {
                i++;
            } else {
                m21060p(i);
                return;
            }
        }
    }

    /* renamed from: p */
    private void m21060p(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f16043q)) {
            m21032S(i - (i2 / 2));
        }
    }

    /* renamed from: q */
    private String[] m21061q(CharSequence[] charSequenceArr) {
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
    private void m21062r(int i, boolean z) {
        int i2 = i - ((this.f16043q - 1) / 2);
        this.f15999O0 = i2;
        int y = m21069y(i2, getOneRecycleSize(), z);
        this.f15999O0 = y;
        int i3 = this.f15995K0;
        if (i3 == 0) {
            this.f16020e0 = true;
            return;
        }
        this.f16002Q0 = i3 * y;
        int i4 = y + (this.f16043q / 2);
        this.f15983A0 = i4;
        int oneRecycleSize = i4 % getOneRecycleSize();
        this.f15983A0 = oneRecycleSize;
        if (oneRecycleSize < 0) {
            this.f15983A0 = oneRecycleSize + getOneRecycleSize();
        }
        this.f15985B0 = this.f15983A0;
        m21058n();
    }

    /* renamed from: s */
    private int m21063s(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: t */
    private void m21064t(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        String str;
        float f4 = 0.0f;
        int i2 = 0;
        while (i2 < this.f16043q + 1) {
            float f5 = (float) (this.f16000P0 + (this.f15995K0 * i2));
            int y = m21069y(this.f15999O0 + i2, getOneRecycleSize(), this.f16018d0 && this.f16024g0);
            int i3 = this.f16043q;
            if (i2 == i3 / 2) {
                int i4 = this.f15995K0;
                f3 = ((float) (this.f16000P0 + i4)) / ((float) i4);
                i = m21067w(f3, this.f16011a, this.f16013b);
                f2 = m21068x(f3, (float) this.f16017d, (float) this.f16019e);
                f = m21068x(f3, this.f16010W, this.f16012a0);
            } else if (i2 == (i3 / 2) + 1) {
                float f6 = 1.0f - f4;
                int w = m21067w(f6, this.f16011a, this.f16013b);
                float x = m21068x(f6, (float) this.f16017d, (float) this.f16019e);
                float x2 = m21068x(f6, this.f16010W, this.f16012a0);
                f3 = f4;
                i = w;
                f2 = x;
                f = x2;
            } else {
                int i5 = this.f16011a;
                f2 = (float) this.f16017d;
                f = this.f16010W;
                int i6 = i5;
                f3 = f4;
                i = i6;
            }
            this.f16038n0.setColor(i);
            this.f16038n0.setTextSize(f2);
            if (y >= 0 && y < getOneRecycleSize()) {
                CharSequence charSequence = this.f16042p0[y + this.f16049t];
                if (this.f16005S != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f16038n0, (float) (getWidth() - (this.f16033l * 2)), getEllipsizeType());
                }
                str = charSequence.toString();
            } else if (!TextUtils.isEmpty(this.f16007T)) {
                str = this.f16007T;
            } else {
                i2++;
                f4 = f3;
            }
            canvas.drawText(str, this.f15998N0, f5 + ((float) (this.f15995K0 / 2)) + f, this.f16038n0);
            i2++;
            f4 = f3;
        }
    }

    /* renamed from: u */
    private void m21065u(Canvas canvas) {
        if (!TextUtils.isEmpty(this.f16003R)) {
            canvas.drawText(this.f16003R, this.f15998N0 + ((float) ((this.f16057x + this.f16023g) / 2)) + ((float) this.f16027i), ((this.f15996L0 + this.f15997M0) / 2.0f) + this.f16014b0, this.f16040o0);
        }
    }

    /* renamed from: v */
    private void m21066v(Canvas canvas) {
        if (this.f16016c0) {
            canvas.drawLine((float) (getPaddingLeft() + this.f16039o), this.f15996L0, (float) ((this.f15993I0 - getPaddingRight()) - this.f16041p), this.f15996L0, this.f16036m0);
            canvas.drawLine((float) (getPaddingLeft() + this.f16039o), this.f15997M0, (float) ((this.f15993I0 - getPaddingRight()) - this.f16041p), this.f15997M0, this.f16036m0);
        }
    }

    /* renamed from: w */
    private int m21067w(float f, int i, int i2) {
        int i3 = (i & ViewCompat.MEASURED_STATE_MASK) >>> 24;
        int i4 = (i & 16711680) >>> 16;
        int i5 = (i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
        int i6 = (i & 255) >>> 0;
        return ((int) (((float) i6) + (((float) (((i2 & 255) >>> 0) - i6)) * f))) | (((int) (((float) i3) + (((float) (((-16777216 & i2) >>> 24) - i3)) * f))) << 24) | (((int) (((float) i4) + (((float) (((16711680 & i2) >>> 16) - i4)) * f))) << 16) | (((int) (((float) i5) + (((float) (((65280 & i2) >>> 8) - i5)) * f))) << 8);
    }

    /* renamed from: x */
    private float m21068x(float f, float f2, float f3) {
        return f2 + ((f3 - f2) * f);
    }

    /* renamed from: y */
    private int m21069y(int i, int i2, boolean z) {
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
    private int m21070z(CharSequence[] charSequenceArr, Paint paint) {
        if (charSequenceArr == null) {
            return 0;
        }
        int i = 0;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence != null) {
                i = Math.max(m21017D(charSequence, paint), i);
            }
        }
        return i;
    }

    /* renamed from: U */
    public void mo36432U(int i, int i2) {
        mo36433V(i, i2, true);
    }

    /* renamed from: V */
    public void mo36433V(int i, int i2, boolean z) {
        if (i <= i2) {
            String[] strArr = this.f16042p0;
            if (strArr == null) {
                throw new IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
            } else if (i >= 0) {
                boolean z2 = true;
                if (i > strArr.length - 1) {
                    throw new IllegalArgumentException("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f16042p0.length - 1) + " minShowIndex is " + i);
                } else if (i2 < 0) {
                    throw new IllegalArgumentException("maxShowIndex should not be less than 0, now maxShowIndex is " + i2);
                } else if (i2 <= strArr.length - 1) {
                    this.f16049t = i;
                    this.f16051u = i2;
                    if (z) {
                        this.f15984B = i + 0;
                        if (!this.f16018d0 || !this.f16024g0) {
                            z2 = false;
                        }
                        m21062r(0, z2);
                        postInvalidate();
                    }
                } else {
                    throw new IllegalArgumentException("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f16042p0.length - 1) + " maxShowIndex is " + i2);
                }
            } else {
                throw new IllegalArgumentException("minShowIndex should not be less than 0, now minShowIndex is " + i);
            }
        } else {
            throw new IllegalArgumentException("minShowIndex should be less than maxShowIndex, minShowIndex is " + i + ", maxShowIndex is " + i2 + ".");
        }
    }

    /* renamed from: Y */
    public void mo36434Y() {
        ScrollerCompat scrollerCompat = this.f16032k0;
        if (scrollerCompat != null && !scrollerCompat.isFinished()) {
            ScrollerCompat scrollerCompat2 = this.f16032k0;
            scrollerCompat2.startScroll(0, scrollerCompat2.getCurrY(), 0, 0, 1);
            this.f16032k0.abortAnimation();
            postInvalidate();
        }
    }

    public void computeScroll() {
        if (this.f15995K0 != 0 && this.f16032k0.computeScrollOffset()) {
            this.f16002Q0 = this.f16032k0.getCurrY();
            m21058n();
            postInvalidate();
        }
    }

    public String getContentByCurrValue() {
        return this.f16042p0[getValue() - this.f16053v];
    }

    public String[] getDisplayedValues() {
        return this.f16042p0;
    }

    public int getMaxValue() {
        return this.f16055w;
    }

    public int getMinValue() {
        return this.f16053v;
    }

    public int getOneRecycleSize() {
        return (this.f16051u - this.f16049t) + 1;
    }

    public int getPickedIndexRelativeToRaw() {
        int i = this.f16000P0;
        if (i == 0) {
            return m21018E(this.f16002Q0);
        }
        int i2 = this.f15995K0;
        return i < (-i2) / 2 ? m21018E(this.f16002Q0 + i2 + i) : m21018E(this.f16002Q0 + i);
    }

    public int getRawContentSize() {
        String[] strArr = this.f16042p0;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public int getValue() {
        return getPickedIndexRelativeToRaw() + this.f16053v;
    }

    public boolean getWrapSelectorWheel() {
        return this.f16018d0;
    }

    public boolean getWrapSelectorWheelAbsolutely() {
        return this.f16018d0 && this.f16024g0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerThread handlerThread = this.f16048s0;
        if (handlerThread == null || !handlerThread.isAlive()) {
            m21022I();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16048s0.quit();
        if (this.f15995K0 != 0) {
            if (!this.f16032k0.isFinished()) {
                this.f16032k0.abortAnimation();
                this.f16002Q0 = this.f16032k0.getCurrY();
                m21058n();
                int i = this.f16000P0;
                if (i != 0) {
                    int i2 = this.f15995K0;
                    if (i < (-i2) / 2) {
                        this.f16002Q0 = this.f16002Q0 + i2 + i;
                    } else {
                        this.f16002Q0 += i;
                    }
                    m21058n();
                }
                m21028O(0);
            }
            int E = m21018E(this.f16002Q0);
            int i3 = this.f15984B;
            if (E != i3 && this.f16028i0) {
                try {
                    C8852d dVar = this.f16056w0;
                    if (dVar != null) {
                        int i4 = this.f16053v;
                        dVar.mo36230a(this, i3 + i4, i4 + E);
                    }
                    C8854f fVar = this.f16054v0;
                    if (fVar != null) {
                        fVar.mo36474a(this, this.f15984B, E, this.f16042p0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f15984B = E;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m21064t(canvas);
        m21066v(canvas);
        m21065u(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m21044d0(false);
        setMeasuredDimension(m21027N(i), m21026M(i2));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        this.f15993I0 = i;
        this.f15994J0 = i2;
        this.f15995K0 = i2 / this.f16043q;
        this.f15998N0 = ((float) ((i + getPaddingLeft()) - getPaddingRight())) / 2.0f;
        boolean z = false;
        if (getOneRecycleSize() > 1) {
            if (this.f16022f0) {
                i5 = getValue() - this.f16053v;
            } else if (this.f16020e0) {
                i5 = this.f15999O0 + ((this.f16043q - 1) / 2);
            }
            if (this.f16018d0 && this.f16024g0) {
                z = true;
            }
            m21062r(i5, z);
            m21040b0();
            m21048f0();
            m21038a0();
            this.f16022f0 = true;
        }
        i5 = 0;
        z = true;
        m21062r(i5, z);
        m21040b0();
        m21048f0();
        m21038a0();
        this.f16022f0 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r1 < ((float) r3)) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f15995K0
            r2 = 1
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            android.view.VelocityTracker r1 = r0.f16034l0
            if (r1 != 0) goto L_0x0012
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.f16034l0 = r1
        L_0x0012:
            android.view.VelocityTracker r1 = r0.f16034l0
            r3 = r18
            r1.addMovement(r3)
            float r1 = r18.getY()
            r0.f15991G0 = r1
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
            int r1 = r0.f16002Q0
            float r1 = (float) r1
            r0.f15989E0 = r1
            r17.mo36434Y()
            android.os.Handler r1 = r0.f16050t0
            android.os.Message r3 = r0.m21014A(r2)
            r1.sendMessageDelayed(r3, r5)
            goto L_0x00de
        L_0x0045:
            float r1 = r0.f15990F0
            float r3 = r0.f15991G0
            float r1 = r1 - r3
            boolean r3 = r0.f15992H0
            if (r3 == 0) goto L_0x005c
            int r3 = r0.f16001Q
            int r5 = -r3
            float r5 = (float) r5
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x005c
            float r3 = (float) r3
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x005c
            goto L_0x006e
        L_0x005c:
            r0.f15992H0 = r4
            float r3 = r0.f15989E0
            float r3 = r3 + r1
            int r1 = (int) r3
            int r1 = r0.m21025L(r1)
            r0.f16002Q0 = r1
            r17.m21058n()
            r17.invalidate()
        L_0x006e:
            r0.m21028O(r2)
            goto L_0x00de
        L_0x0072:
            boolean r1 = r0.f15992H0
            if (r1 == 0) goto L_0x007a
            r17.m21059o(r18)
            goto L_0x00de
        L_0x007a:
            android.view.VelocityTracker r1 = r0.f16034l0
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            float r1 = r1.getYVelocity()
            float r3 = r0.f16009V
            float r1 = r1 * r3
            int r1 = (int) r1
            int r3 = java.lang.Math.abs(r1)
            int r4 = r0.f15986C
            if (r3 <= r4) goto L_0x00b4
            androidx.core.widget.ScrollerCompat r8 = r0.f16032k0
            r9 = 0
            int r10 = r0.f16002Q0
            r11 = 0
            int r12 = -r1
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 2147483647(0x7fffffff, float:NaN)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r15 = r0.m21025L(r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r16 = r0.m21025L(r1)
            r8.fling(r9, r10, r11, r12, r13, r14, r15, r16)
            r17.invalidate()
            r0.m21028O(r7)
        L_0x00b4:
            android.os.Handler r1 = r0.f16050t0
            android.os.Message r3 = r0.m21014A(r2)
            r1.sendMessageDelayed(r3, r5)
            r17.m21029P()
            goto L_0x00de
        L_0x00c1:
            r0.f15992H0 = r2
            android.os.Handler r1 = r0.f16050t0
            r1.removeMessages(r2)
            r17.mo36434Y()
            float r1 = r0.f15991G0
            r0.f15990F0 = r1
            int r1 = r0.f16002Q0
            float r1 = (float) r1
            r0.f15989E0 = r1
            r0.m21028O(r4)
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r2)
        L_0x00de:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.view.NumberPickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setContentTextTypeface(Typeface typeface) {
        this.f16038n0.setTypeface(typeface);
    }

    public void setDisplayedValues(String[] strArr) {
        m21035X();
        mo36434Y();
        if (strArr != null) {
            boolean z = true;
            if ((this.f16055w - this.f16053v) + 1 <= strArr.length) {
                m21036Z(strArr);
                m21044d0(true);
                this.f15984B = this.f16049t + 0;
                if (!this.f16018d0 || !this.f16024g0) {
                    z = false;
                }
                m21062r(0, z);
                postInvalidate();
                this.f16052u0.sendEmptyMessage(3);
                return;
            }
            throw new IllegalArgumentException("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is " + ((this.f16055w - this.f16053v) + 1) + " newDisplayedValues.length is " + strArr.length + ", you need to set MaxValue and MinValue before setDisplayedValues(String[])");
        }
        throw new IllegalArgumentException("newDisplayedValues should not be null.");
    }

    public void setDividerColor(int i) {
        if (this.f16035m != i) {
            this.f16035m = i;
            this.f16036m0.setColor(i);
            postInvalidate();
        }
    }

    public void setFriction(float f) {
        if (f > 0.0f) {
            ViewConfiguration.get(getContext());
            this.f16009V = ViewConfiguration.getScrollFriction() / f;
            return;
        }
        throw new IllegalArgumentException("you should set a a positive float friction, now friction is " + f);
    }

    public void setHintText(String str) {
        if (!m21024K(this.f16003R, str)) {
            this.f16003R = str;
            this.f16014b0 = m21016C(this.f16040o0.getFontMetrics());
            this.f16023g = m21017D(this.f16003R, this.f16040o0);
            this.f16052u0.sendEmptyMessage(3);
        }
    }

    public void setHintTextColor(int i) {
        if (this.f16015c != i) {
            this.f16015c = i;
            this.f16040o0.setColor(i);
            postInvalidate();
        }
    }

    public void setHintTextTypeface(Typeface typeface) {
        this.f16040o0.setTypeface(typeface);
    }

    public void setMaxValue(int i) {
        String[] strArr = this.f16042p0;
        Objects.requireNonNull(strArr, "mDisplayedValues should not be null");
        int i2 = this.f16053v;
        if ((i - i2) + 1 <= strArr.length) {
            this.f16055w = i;
            int i3 = this.f16049t;
            int i4 = (i - i2) + i3;
            this.f16051u = i4;
            mo36432U(i3, i4);
            m21048f0();
            return;
        }
        throw new IllegalArgumentException("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is " + ((i - this.f16053v) + 1) + " and mDisplayedValues.length is " + this.f16042p0.length);
    }

    public void setMinValue(int i) {
        this.f16053v = i;
        this.f16049t = 0;
        m21048f0();
    }

    public void setNormalTextColor(int i) {
        if (this.f16011a != i) {
            this.f16011a = i;
            postInvalidate();
        }
    }

    public void setOnScrollListener(C8851c cVar) {
        this.f16058x0 = cVar;
    }

    public void setOnValueChangeListenerInScrolling(C8853e eVar) {
        this.f16060y0 = eVar;
    }

    public void setOnValueChangedListener(C8852d dVar) {
        this.f16056w0 = dVar;
    }

    public void setOnValueChangedListenerRelativeToRaw(C8854f fVar) {
        this.f16054v0 = fVar;
    }

    public void setPickedIndexRelativeToMin(int i) {
        if (i >= 0 && i < getOneRecycleSize()) {
            this.f15984B = this.f16049t + i;
            m21062r(i, this.f16018d0 && this.f16024g0);
            postInvalidate();
        }
    }

    public void setPickedIndexRelativeToRaw(int i) {
        int i2 = this.f16049t;
        if (i2 > -1 && i2 <= i && i <= this.f16051u) {
            this.f15984B = i;
            m21062r(i - i2, this.f16018d0 && this.f16024g0);
            postInvalidate();
        }
    }

    public void setSelectedTextColor(int i) {
        if (this.f16013b != i) {
            this.f16013b = i;
            postInvalidate();
        }
    }

    public void setValue(int i) {
        int i2 = this.f16053v;
        if (i < i2) {
            throw new IllegalArgumentException("should not set a value less than mMinValue, value is " + i);
        } else if (i <= this.f16055w) {
            setPickedIndexRelativeToRaw(i - i2);
        } else {
            throw new IllegalArgumentException("should not set a value greater than mMaxValue, value is " + i);
        }
    }

    public void setWrapSelectorWheel(boolean z) {
        if (this.f16018d0 == z) {
            return;
        }
        if (z) {
            this.f16018d0 = z;
            m21052h0();
            postInvalidate();
        } else if (this.f16062z0 == 0) {
            m21023J();
        } else {
            this.f16026h0 = true;
        }
    }
}
