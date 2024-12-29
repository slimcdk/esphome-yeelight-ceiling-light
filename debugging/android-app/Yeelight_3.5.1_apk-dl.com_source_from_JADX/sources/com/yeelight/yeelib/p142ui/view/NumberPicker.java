package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.p017ar.core.ImageMetadata;
import com.yeelight.yeelib.R$attr;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$raw;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yeelight.yeelib.ui.view.NumberPicker */
public class NumberPicker extends LinearLayout {

    /* renamed from: A0 */
    private static final int[] f15900A0 = {16842919};
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public static final char[] f15901B0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /* renamed from: y0 */
    private static final String f15902y0 = NumberPicker.class.getSimpleName();

    /* renamed from: z0 */
    public static final C8843f f15903z0 = new C8838a();

    /* renamed from: A */
    private int f15904A;

    /* renamed from: B */
    private C8848k f15905B;

    /* renamed from: C */
    private C8842e f15906C;

    /* renamed from: Q */
    private C8841d f15907Q;

    /* renamed from: R */
    private float f15908R;

    /* renamed from: S */
    private long f15909S;

    /* renamed from: T */
    private float f15910T;

    /* renamed from: U */
    private VelocityTracker f15911U;

    /* renamed from: V */
    private int f15912V;

    /* renamed from: W */
    private int f15913W;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final EditText f15914a;

    /* renamed from: a0 */
    private int f15915a0;

    /* renamed from: b */
    private final int f15916b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public boolean f15917b0;

    /* renamed from: c */
    private final int f15918c;

    /* renamed from: c0 */
    private final boolean f15919c0;

    /* renamed from: d */
    private final int f15920d;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final int f15921d0;

    /* renamed from: e */
    private final int f15922e;

    /* renamed from: e0 */
    private int f15923e0;

    /* renamed from: f */
    private int f15924f;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public boolean f15925f0;

    /* renamed from: g */
    private final boolean f15926g;

    /* renamed from: g0 */
    private boolean f15927g0;

    /* renamed from: h */
    private final int f15928h;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public int f15929h0;

    /* renamed from: i */
    private int f15930i;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public int f15931i0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String[] f15932j;

    /* renamed from: j0 */
    private int f15933j0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f15934k;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public boolean f15935k0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f15936l;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public boolean f15937l0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f15938m;

    /* renamed from: m0 */
    private C8840c f15939m0;

    /* renamed from: n */
    private C8846i f15940n;

    /* renamed from: n0 */
    private final C8847j f15941n0;

    /* renamed from: o */
    private C8845h f15942o;

    /* renamed from: o0 */
    private int f15943o0;

    /* renamed from: p */
    private C8843f f15944p;

    /* renamed from: p0 */
    private Paint f15945p0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f15946q;

    /* renamed from: q0 */
    private float f15947q0;

    /* renamed from: r */
    private final SparseArray<String> f15948r;

    /* renamed from: r0 */
    private int f15949r0;

    /* renamed from: s */
    private final int[] f15950s;

    /* renamed from: s0 */
    private int f15951s0;

    /* renamed from: t */
    private final Paint f15952t;

    /* renamed from: t0 */
    private int f15953t0;

    /* renamed from: u */
    private final Drawable f15954u;

    /* renamed from: u0 */
    private float f15955u0;

    /* renamed from: v */
    private int f15956v;

    /* renamed from: v0 */
    private CharSequence f15957v0;

    /* renamed from: w */
    private int f15958w;

    /* renamed from: w0 */
    private SoundPool f15959w0;

    /* renamed from: x */
    private int f15960x;

    /* renamed from: x0 */
    private int f15961x0;

    /* renamed from: y */
    private final Scroller f15962y;

    /* renamed from: z */
    private final Scroller f15963z;

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$CustomEditText */
    public static class CustomEditText extends EditText {
        public CustomEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void onEditorAction(int i) {
            super.onEditorAction(i);
            if (i == 6) {
                clearFocus();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$a */
    class C8838a implements C8843f {

        /* renamed from: a */
        final StringBuilder f15964a;

        /* renamed from: b */
        final Formatter f15965b;

        /* renamed from: c */
        final Object[] f15966c = new Object[1];

        C8838a() {
            StringBuilder sb = new StringBuilder();
            this.f15964a = sb;
            this.f15965b = new Formatter(sb, Locale.US);
        }

        /* renamed from: a */
        public String mo36415a(int i) {
            this.f15966c[0] = Integer.valueOf(i);
            StringBuilder sb = this.f15964a;
            sb.delete(0, sb.length());
            this.f15965b.format("%02d", new Object[]{(Integer) this.f15966c[0]});
            return this.f15965b.toString();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$b */
    class C8839b implements View.OnFocusChangeListener {
        C8839b() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                NumberPicker.this.f15914a.selectAll();
                return;
            }
            NumberPicker.this.f15914a.setSelection(0, 0);
            NumberPicker.this.m20968c0(view);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$c */
    class C8840c extends AccessibilityNodeProvider {

        /* renamed from: a */
        private final Rect f15968a = new Rect();

        /* renamed from: b */
        private final int[] f15969b = new int[2];

        /* renamed from: c */
        private int f15970c = Integer.MIN_VALUE;

        C8840c() {
        }

        /* renamed from: a */
        private AccessibilityNodeInfo m20993a(int i, int i2, int i3, int i4) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            obtain.setClassName(NumberPicker.class.getName());
            obtain.setPackageName(NumberPicker.this.getContext().getPackageName());
            obtain.setSource(NumberPicker.this);
            if (m20999g()) {
                obtain.addChild(NumberPicker.this, 3);
            }
            obtain.addChild(NumberPicker.this, 2);
            if (m21000h()) {
                obtain.addChild(NumberPicker.this, 1);
            }
            obtain.setParent((View) NumberPicker.this.getParentForAccessibility());
            obtain.setEnabled(NumberPicker.this.isEnabled());
            obtain.setScrollable(true);
            Rect rect = this.f15968a;
            rect.set(i, i2, i3, i4);
            obtain.setBoundsInParent(rect);
            obtain.setVisibleToUser(NumberPicker.this.getVisibility() == 0);
            int[] iArr = this.f15969b;
            NumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            obtain.setBoundsInScreen(rect);
            if (this.f15970c != -1) {
                obtain.addAction(64);
            }
            if (this.f15970c == -1) {
                obtain.addAction(128);
            }
            if (NumberPicker.this.isEnabled()) {
                if (NumberPicker.this.getWrapSelectorWheel() || NumberPicker.this.getValue() < NumberPicker.this.getMaxValue()) {
                    obtain.addAction(4096);
                }
                if (NumberPicker.this.getWrapSelectorWheel() || NumberPicker.this.getValue() > NumberPicker.this.getMinValue()) {
                    obtain.addAction(8192);
                }
            }
            return obtain;
        }

        /* renamed from: b */
        private AccessibilityNodeInfo m20994b(int i, String str, int i2, int i3, int i4, int i5) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            obtain.setClassName(Button.class.getName());
            obtain.setPackageName(NumberPicker.this.getContext().getPackageName());
            obtain.setSource(NumberPicker.this, i);
            obtain.setParent(NumberPicker.this);
            obtain.setText(str);
            obtain.setClickable(true);
            obtain.setLongClickable(true);
            obtain.setEnabled(NumberPicker.this.isEnabled());
            Rect rect = this.f15968a;
            rect.set(i2, i3, i4, i5);
            obtain.setVisibleToUser(NumberPicker.this.getVisibility() == 0);
            obtain.setBoundsInParent(rect);
            int[] iArr = this.f15969b;
            NumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            obtain.setBoundsInScreen(rect);
            if (this.f15970c != i) {
                obtain.addAction(64);
            }
            if (this.f15970c == i) {
                obtain.addAction(128);
            }
            if (NumberPicker.this.isEnabled()) {
                obtain.addAction(16);
            }
            return obtain;
        }

        /* renamed from: c */
        private AccessibilityNodeInfo m20995c(int i, int i2, int i3, int i4) {
            AccessibilityNodeInfo createAccessibilityNodeInfo = NumberPicker.this.f15914a.createAccessibilityNodeInfo();
            createAccessibilityNodeInfo.setSource(NumberPicker.this, 2);
            if (this.f15970c != 2) {
                createAccessibilityNodeInfo.addAction(64);
            }
            if (this.f15970c == 2) {
                createAccessibilityNodeInfo.addAction(128);
            }
            Rect rect = this.f15968a;
            rect.set(i, i2, i3, i4);
            createAccessibilityNodeInfo.setVisibleToUser(NumberPicker.this.getVisibility() == 0);
            createAccessibilityNodeInfo.setBoundsInParent(rect);
            int[] iArr = this.f15969b;
            NumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            createAccessibilityNodeInfo.setBoundsInScreen(rect);
            return createAccessibilityNodeInfo;
        }

        /* renamed from: d */
        private void m20996d(String str, int i, List<AccessibilityNodeInfo> list) {
            if (i == 1) {
                String f = m20998f();
                if (!TextUtils.isEmpty(f) && f.toLowerCase().contains(str)) {
                    list.add(createAccessibilityNodeInfo(1));
                }
            } else if (i == 2) {
                Editable text = NumberPicker.this.f15914a.getText();
                if (TextUtils.isEmpty(text) || !text.toString().toLowerCase().contains(str)) {
                    Editable text2 = NumberPicker.this.f15914a.getText();
                    if (TextUtils.isEmpty(text2) || !text2.toString().toLowerCase().contains(str)) {
                        return;
                    }
                }
                list.add(createAccessibilityNodeInfo(2));
            } else if (i == 3) {
                String e = m20997e();
                if (!TextUtils.isEmpty(e) && e.toLowerCase().contains(str)) {
                    list.add(createAccessibilityNodeInfo(3));
                }
            }
        }

        /* renamed from: e */
        private String m20997e() {
            int o = NumberPicker.this.f15938m - 1;
            if (NumberPicker.this.f15917b0) {
                o = NumberPicker.this.m20944H(o);
            }
            if (o >= NumberPicker.this.f15934k) {
                return NumberPicker.this.f15932j == null ? NumberPicker.this.m20940D(o) : NumberPicker.this.f15932j[o - NumberPicker.this.f15934k];
            }
            return null;
        }

        /* renamed from: f */
        private String m20998f() {
            int o = NumberPicker.this.f15938m + 1;
            if (NumberPicker.this.f15917b0) {
                o = NumberPicker.this.m20944H(o);
            }
            if (o <= NumberPicker.this.f15936l) {
                return NumberPicker.this.f15932j == null ? NumberPicker.this.m20940D(o) : NumberPicker.this.f15932j[o - NumberPicker.this.f15934k];
            }
            return null;
        }

        /* renamed from: g */
        private boolean m20999g() {
            return NumberPicker.this.getWrapSelectorWheel() || NumberPicker.this.getValue() > NumberPicker.this.getMinValue();
        }

        /* renamed from: h */
        private boolean m21000h() {
            return NumberPicker.this.getWrapSelectorWheel() || NumberPicker.this.getValue() < NumberPicker.this.getMaxValue();
        }

        /* renamed from: i */
        private void m21001i(int i, int i2, String str) {
            if (((AccessibilityManager) NumberPicker.this.getContext().getSystemService("accessibility")).isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
                obtain.setClassName(Button.class.getName());
                obtain.setPackageName(NumberPicker.this.getContext().getPackageName());
                obtain.getText().add(str);
                obtain.setEnabled(NumberPicker.this.isEnabled());
                obtain.setSource(NumberPicker.this, i);
                NumberPicker numberPicker = NumberPicker.this;
                numberPicker.requestSendAccessibilityEvent(numberPicker, obtain);
            }
        }

        /* renamed from: j */
        private void m21002j(int i) {
            if (((AccessibilityManager) NumberPicker.this.getContext().getSystemService("accessibility")).isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
                NumberPicker.this.f15914a.onInitializeAccessibilityEvent(obtain);
                NumberPicker.this.f15914a.onPopulateAccessibilityEvent(obtain);
                obtain.setSource(NumberPicker.this, 2);
                NumberPicker numberPicker = NumberPicker.this;
                numberPicker.requestSendAccessibilityEvent(numberPicker, obtain);
            }
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            if (i == -1) {
                return m20993a(NumberPicker.this.getScrollX(), NumberPicker.this.getScrollY(), NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.getScrollY() + (NumberPicker.this.getBottom() - NumberPicker.this.getTop()));
            }
            if (i == 1) {
                return m20994b(1, m20998f(), NumberPicker.this.getScrollX(), NumberPicker.this.f15931i0 - NumberPicker.this.f15921d0, NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.getScrollY() + (NumberPicker.this.getBottom() - NumberPicker.this.getTop()));
            } else if (i == 2) {
                return m20995c(NumberPicker.this.getScrollX(), NumberPicker.this.f15929h0 + NumberPicker.this.f15921d0, NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.f15931i0 - NumberPicker.this.f15921d0);
            } else {
                if (i != 3) {
                    return super.createAccessibilityNodeInfo(i);
                }
                return m20994b(3, m20997e(), NumberPicker.this.getScrollX(), NumberPicker.this.getScrollY(), NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.f15929h0 + NumberPicker.this.f15921d0);
            }
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            if (TextUtils.isEmpty(str)) {
                return Collections.emptyList();
            }
            String lowerCase = str.toLowerCase();
            ArrayList arrayList = new ArrayList();
            if (i == -1) {
                m20996d(lowerCase, 3, arrayList);
                m20996d(lowerCase, 2, arrayList);
                m20996d(lowerCase, 1, arrayList);
                return arrayList;
            } else if (i != 1 && i != 2 && i != 3) {
                return super.findAccessibilityNodeInfosByText(str, i);
            } else {
                m20996d(lowerCase, i, arrayList);
                return arrayList;
            }
        }

        /* renamed from: k */
        public void mo36419k(int i, int i2) {
            String str;
            if (i != 1) {
                if (i == 2) {
                    m21002j(i2);
                    return;
                } else if (i == 3 && m20999g()) {
                    str = m20997e();
                } else {
                    return;
                }
            } else if (m21000h()) {
                str = m20998f();
            } else {
                return;
            }
            m21001i(i, i2, str);
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            if (i != -1) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (i2 != 16) {
                                if (i2 != 64) {
                                    if (i2 != 128 || this.f15970c != i) {
                                        return false;
                                    }
                                    this.f15970c = Integer.MIN_VALUE;
                                    mo36419k(i, 65536);
                                    NumberPicker numberPicker = NumberPicker.this;
                                    numberPicker.invalidate(0, 0, numberPicker.getRight(), NumberPicker.this.f15929h0);
                                    return true;
                                } else if (this.f15970c == i) {
                                    return false;
                                } else {
                                    this.f15970c = i;
                                    mo36419k(i, 32768);
                                    NumberPicker numberPicker2 = NumberPicker.this;
                                    numberPicker2.invalidate(0, 0, numberPicker2.getRight(), NumberPicker.this.f15929h0);
                                    return true;
                                }
                            } else if (!NumberPicker.this.isEnabled()) {
                                return false;
                            } else {
                                NumberPicker.this.m20990y(false);
                                mo36419k(i, 1);
                                return true;
                            }
                        }
                    } else if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 16) {
                                return NumberPicker.this.isEnabled();
                            }
                            if (i2 != 64) {
                                if (i2 != 128) {
                                    return NumberPicker.this.f15914a.performAccessibilityAction(i2, bundle);
                                }
                                if (this.f15970c != i) {
                                    return false;
                                }
                                this.f15970c = Integer.MIN_VALUE;
                                mo36419k(i, 65536);
                                NumberPicker.this.f15914a.invalidate();
                                return true;
                            } else if (this.f15970c == i) {
                                return false;
                            } else {
                                this.f15970c = i;
                                mo36419k(i, 32768);
                                NumberPicker.this.f15914a.invalidate();
                                return true;
                            }
                        } else if (!NumberPicker.this.isEnabled() || !NumberPicker.this.f15914a.isFocused()) {
                            return false;
                        } else {
                            NumberPicker.this.f15914a.clearFocus();
                            return true;
                        }
                    } else if (!NumberPicker.this.isEnabled() || NumberPicker.this.f15914a.isFocused()) {
                        return false;
                    } else {
                        return NumberPicker.this.f15914a.requestFocus();
                    }
                } else if (i2 != 16) {
                    if (i2 != 64) {
                        if (i2 != 128 || this.f15970c != i) {
                            return false;
                        }
                        this.f15970c = Integer.MIN_VALUE;
                        mo36419k(i, 65536);
                        NumberPicker numberPicker3 = NumberPicker.this;
                        numberPicker3.invalidate(0, numberPicker3.f15931i0, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                        return true;
                    } else if (this.f15970c == i) {
                        return false;
                    } else {
                        this.f15970c = i;
                        mo36419k(i, 32768);
                        NumberPicker numberPicker4 = NumberPicker.this;
                        numberPicker4.invalidate(0, numberPicker4.f15931i0, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                        return true;
                    }
                } else if (!NumberPicker.this.isEnabled()) {
                    return false;
                } else {
                    NumberPicker.this.m20990y(true);
                    mo36419k(i, 1);
                    return true;
                }
            } else if (i2 != 64) {
                if (i2 != 128) {
                    if (i2 != 4096) {
                        if (i2 == 8192) {
                            if (!NumberPicker.this.isEnabled() || (!NumberPicker.this.getWrapSelectorWheel() && NumberPicker.this.getValue() <= NumberPicker.this.getMinValue())) {
                                return false;
                            }
                            NumberPicker.this.m20990y(false);
                            return true;
                        }
                    } else if (!NumberPicker.this.isEnabled() || (!NumberPicker.this.getWrapSelectorWheel() && NumberPicker.this.getValue() >= NumberPicker.this.getMaxValue())) {
                        return false;
                    } else {
                        NumberPicker.this.m20990y(true);
                        return true;
                    }
                } else if (this.f15970c != i) {
                    return false;
                } else {
                    this.f15970c = Integer.MIN_VALUE;
                    return true;
                }
            } else if (this.f15970c == i) {
                return false;
            } else {
                this.f15970c = i;
                return true;
            }
            return super.performAction(i, i2, bundle);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$d */
    class C8841d implements Runnable {
        C8841d() {
        }

        public void run() {
            boolean unused = NumberPicker.this.f15925f0 = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$e */
    class C8842e implements Runnable {

        /* renamed from: a */
        private boolean f15973a;

        C8842e() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m21005c(boolean z) {
            this.f15973a = z;
        }

        public void run() {
            NumberPicker.this.m20990y(this.f15973a);
            NumberPicker numberPicker = NumberPicker.this;
            numberPicker.postDelayed(this, numberPicker.f15946q);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$f */
    public interface C8843f {
        /* renamed from: a */
        String mo36415a(int i);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$g */
    class C8844g extends NumberKeyListener {
        C8844g() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (NumberPicker.this.f15932j == null) {
                CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
                if (filter == null) {
                    filter = charSequence.subSequence(i, i2);
                }
                String str = String.valueOf(spanned.subSequence(0, i3)) + filter + spanned.subSequence(i4, spanned.length());
                return "".equals(str) ? str : (NumberPicker.this.m20942F(str) > NumberPicker.this.f15936l || str.length() > String.valueOf(NumberPicker.this.f15936l).length()) ? "" : filter;
            }
            String valueOf = String.valueOf(charSequence.subSequence(i, i2));
            if (TextUtils.isEmpty(valueOf)) {
                return "";
            }
            String str2 = String.valueOf(spanned.subSequence(0, i3)) + valueOf + spanned.subSequence(i4, spanned.length());
            String lowerCase = String.valueOf(str2).toLowerCase();
            for (String str3 : NumberPicker.this.f15932j) {
                if (str3.toLowerCase().startsWith(lowerCase)) {
                    NumberPicker.this.m20956T(str2.length(), str3.length());
                    return str3.subSequence(i3, str3.length());
                }
            }
            return "";
        }

        /* access modifiers changed from: protected */
        public char[] getAcceptedChars() {
            return NumberPicker.f15901B0;
        }

        public int getInputType() {
            return 1;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$h */
    public interface C8845h {
        /* renamed from: a */
        void mo36426a(NumberPicker numberPicker, int i);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$i */
    public interface C8846i {
        /* renamed from: a */
        void mo35772a(NumberPicker numberPicker, int i, int i2);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$j */
    class C8847j implements Runnable {

        /* renamed from: a */
        private int f15976a;

        /* renamed from: b */
        private int f15977b;

        C8847j() {
        }

        /* renamed from: b */
        public void mo36427b(int i) {
            mo36429d();
            this.f15977b = 1;
            this.f15976a = i;
            NumberPicker.this.postDelayed(this, (long) ViewConfiguration.getTapTimeout());
        }

        /* renamed from: c */
        public void mo36428c(int i) {
            mo36429d();
            this.f15977b = 2;
            this.f15976a = i;
            NumberPicker.this.post(this);
        }

        /* renamed from: d */
        public void mo36429d() {
            this.f15977b = 0;
            this.f15976a = 0;
            NumberPicker.this.removeCallbacks(this);
            if (NumberPicker.this.f15935k0) {
                boolean unused = NumberPicker.this.f15935k0 = false;
                NumberPicker numberPicker = NumberPicker.this;
                numberPicker.invalidate(0, numberPicker.f15931i0, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
            }
            if (NumberPicker.this.f15937l0) {
                boolean unused2 = NumberPicker.this.f15937l0 = false;
                NumberPicker numberPicker2 = NumberPicker.this;
                numberPicker2.invalidate(0, 0, numberPicker2.getRight(), NumberPicker.this.f15929h0);
            }
        }

        public void run() {
            int i = this.f15977b;
            if (i == 1) {
                int i2 = this.f15976a;
                if (i2 == 1) {
                    boolean unused = NumberPicker.this.f15935k0 = true;
                    NumberPicker numberPicker = NumberPicker.this;
                    numberPicker.invalidate(0, numberPicker.f15931i0, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                    return;
                } else if (i2 == 2) {
                    boolean unused2 = NumberPicker.this.f15937l0 = true;
                } else {
                    return;
                }
            } else if (i == 2) {
                int i3 = this.f15976a;
                if (i3 == 1) {
                    if (!NumberPicker.this.f15935k0) {
                        NumberPicker.this.postDelayed(this, (long) ViewConfiguration.getPressedStateDuration());
                    }
                    NumberPicker.m20970e(NumberPicker.this, 1);
                    NumberPicker numberPicker2 = NumberPicker.this;
                    numberPicker2.invalidate(0, numberPicker2.f15931i0, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                    return;
                } else if (i3 == 2) {
                    if (!NumberPicker.this.f15937l0) {
                        NumberPicker.this.postDelayed(this, (long) ViewConfiguration.getPressedStateDuration());
                    }
                    NumberPicker.m20974i(NumberPicker.this, 1);
                } else {
                    return;
                }
            } else {
                return;
            }
            NumberPicker numberPicker3 = NumberPicker.this;
            numberPicker3.invalidate(0, 0, numberPicker3.getRight(), NumberPicker.this.f15929h0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$k */
    class C8848k implements Runnable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f15979a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f15980b;

        C8848k() {
        }

        public void run() {
            NumberPicker.this.f15914a.setSelection(this.f15979a, this.f15980b);
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.numberPickerStyle);
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Scroller scroller;
        this.f15946q = 300;
        this.f15948r = new SparseArray<>();
        this.f15950s = new int[5];
        this.f15958w = Integer.MIN_VALUE;
        this.f15923e0 = 0;
        this.f15943o0 = -1;
        this.f15949r0 = 25;
        this.f15951s0 = 14;
        this.f15953t0 = 10;
        float f = getResources().getDisplayMetrics().density;
        float f2 = 56.0f;
        int i2 = 260;
        if (f != 1.0f) {
            this.f15951s0 = (int) (((float) this.f15951s0) * f);
            this.f15949r0 = (int) (((float) this.f15949r0) * f);
            this.f15953t0 = (int) (((float) this.f15953t0) * f);
            f2 = 56.0f * f;
            i2 = (int) (((float) 260) * f);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842901, 16843087}, 0, 0);
        this.f15957v0 = obtainStyledAttributes.getText(1);
        this.f15949r0 = obtainStyledAttributes.getDimensionPixelSize(0, this.f15949r0);
        obtainStyledAttributes.recycle();
        SoundPool soundPool = new SoundPool(1, 1, 0);
        this.f15959w0 = soundPool;
        this.f15961x0 = soundPool.load(getContext(), R$raw.numberpicker_value_change, 1);
        int i3 = R$layout.numberpicker_layout;
        this.f15919c0 = true;
        this.f15921d0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.f15916b = (int) f2;
        this.f15918c = -1;
        this.f15920d = i2;
        this.f15922e = -1;
        this.f15924f = -1;
        this.f15926g = true;
        this.f15954u = ContextCompat.getDrawable(getContext(), R$drawable.virtual_button);
        this.f15941n0 = new C8847j();
        setWillNotDraw(false);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(i3, this, true);
        EditText editText = (EditText) findViewById(R$id.numberpicker_input);
        this.f15914a = editText;
        editText.setOnFocusChangeListener(new C8839b());
        editText.setFilters(new InputFilter[]{new C8844g()});
        editText.setRawInputType(2);
        editText.setImeOptions(6);
        editText.setVisibility(4);
        editText.setGravity(3);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 14) {
            editText.setScaleX(0.0f);
        }
        editText.setSaveEnabled(false);
        editText.setPadding(30, editText.getPaddingTop(), 30, editText.getPaddingRight());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f15912V = viewConfiguration.getScaledTouchSlop();
        this.f15913W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f15915a0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.f15928h = (int) editText.getTextSize();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize((float) this.f15949r0);
        paint.setTypeface(editText.getTypeface());
        paint.setColor(editText.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.f15952t = paint;
        this.f15955u0 = paint.ascent();
        Paint paint2 = new Paint();
        this.f15945p0 = paint2;
        paint2.setAntiAlias(true);
        this.f15945p0.setFakeBoldText(true);
        this.f15945p0.setColor(ContextCompat.getColor(getContext(), R$color.class_text_14));
        this.f15945p0.setTextSize((float) this.f15953t0);
        Context context2 = getContext();
        if (i4 < 14) {
            scroller = new Scroller(context2, (Interpolator) null);
        }
        this.f15962y = scroller;
        this.f15963z = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        m20966b0();
        if (i4 >= 16 && getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: A */
    private void m20937A(int i) {
        String str;
        SparseArray<String> sparseArray = this.f15948r;
        if (sparseArray.get(i) == null) {
            int i2 = this.f15934k;
            if (i < i2 || i > this.f15936l) {
                str = "";
            } else {
                String[] strArr = this.f15932j;
                str = strArr != null ? strArr[i - i2] : m20940D(i);
            }
            sparseArray.put(i, str);
        }
    }

    /* renamed from: B */
    private boolean m20938B() {
        int i = this.f15958w - this.f15960x;
        if (i == 0) {
            return false;
        }
        this.f15904A = 0;
        int abs = Math.abs(i);
        int i2 = this.f15956v;
        if (abs > i2 / 2) {
            if (i > 0) {
                i2 = -i2;
            }
            i += i2;
        }
        this.f15963z.startScroll(0, 0, 0, i, 800);
        invalidate();
        return true;
    }

    /* renamed from: C */
    private void m20939C(int i) {
        this.f15904A = 0;
        this.f15962y.fling(0, i > 0 ? 0 : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, i, 0, 0, 0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public String m20940D(int i) {
        C8843f fVar = this.f15944p;
        return fVar != null ? fVar.mo36415a(i) : String.valueOf(i);
    }

    /* renamed from: E */
    private int m20941E(float f, int i, boolean z) {
        if (f >= 1.0f) {
            return i;
        }
        return (((int) (z ? ((-f) * ((float) Color.alpha(i))) + ((float) Color.alpha(i)) : f * ((float) Color.alpha(i)))) << 24) | (i & ViewCompat.MEASURED_SIZE_MASK);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public int m20942F(String str) {
        if (this.f15932j == null) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return this.f15934k;
            }
        } else {
            for (int i = 0; i < this.f15932j.length; i++) {
                str = str.toLowerCase();
                if (this.f15932j[i].toLowerCase().startsWith(str)) {
                    return this.f15934k + i;
                }
            }
            return Integer.parseInt(str);
        }
    }

    /* renamed from: G */
    private float m20943G(float f, int i, int i2) {
        return f >= 1.0f ? (float) i2 : (f * ((float) (i2 - i))) + ((float) i);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public int m20944H(int i) {
        int i2 = this.f15936l;
        int i3 = this.f15934k;
        return i > i2 ? (i3 + ((i - i2) % (i2 - i3))) - 1 : i < i3 ? (i2 - ((i3 - i) % (i2 - i3))) + 1 : i;
    }

    /* renamed from: I */
    private void m20945I(int[] iArr) {
        System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
        int i = iArr[iArr.length - 2] + 1;
        if (this.f15917b0 && i > this.f15936l) {
            i = this.f15934k;
        }
        iArr[iArr.length - 1] = i;
        m20937A(i);
    }

    /* renamed from: J */
    private void m20946J() {
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(((getBottom() - getTop()) - this.f15928h) / 2);
    }

    /* renamed from: K */
    private void m20947K() {
        m20948L();
        int[] iArr = this.f15950s;
        int bottom = (int) ((((float) ((getBottom() - getTop()) - (iArr.length * this.f15928h))) / ((float) iArr.length)) + 0.5f);
        this.f15930i = bottom;
        this.f15956v = this.f15928h + bottom;
        int baseline = (this.f15914a.getBaseline() + this.f15914a.getTop()) - (this.f15956v * 2);
        this.f15958w = baseline;
        this.f15960x = baseline;
        m20966b0();
    }

    /* renamed from: L */
    private void m20948L() {
        this.f15948r.clear();
        int[] iArr = this.f15950s;
        int value = getValue();
        for (int i = 0; i < this.f15950s.length; i++) {
            int i2 = (i - 2) + value;
            if (this.f15917b0) {
                i2 = m20944H(i2);
            }
            iArr[i] = i2;
            m20937A(iArr[i]);
        }
    }

    /* renamed from: M */
    private int m20949M(int i, int i2) {
        if (i2 == -1) {
            return i;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i2), BasicMeasure.EXACTLY);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(i2, BasicMeasure.EXACTLY);
        }
        if (mode == 1073741824) {
            return i;
        }
        String str = f15902y0;
        AppUtils.m8300u(str, "Unknown measure mode: " + mode);
        return -1;
    }

    /* renamed from: N */
    private boolean m20950N(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i = this.f15958w - ((this.f15960x + finalY) % this.f15956v);
        if (i == 0) {
            return false;
        }
        int abs = Math.abs(i);
        int i2 = this.f15956v;
        if (abs > i2 / 2) {
            i = i > 0 ? i - i2 : i + i2;
        }
        scrollBy(0, finalY + i);
        return true;
    }

    /* renamed from: O */
    private void m20951O(int i, int i2) {
        this.f15959w0.play(this.f15961x0, 1.0f, 1.0f, 0, 0, 1.0f);
        C8846i iVar = this.f15940n;
        if (iVar != null) {
            iVar.mo35772a(this, i, this.f15938m);
        }
    }

    /* renamed from: P */
    private void m20952P(int i) {
        if (this.f15923e0 != i) {
            this.f15923e0 = i;
            C8845h hVar = this.f15942o;
            if (hVar != null) {
                hVar.mo36426a(this, i);
            }
        }
    }

    /* renamed from: Q */
    private void m20953Q(Scroller scroller) {
        if (scroller == this.f15962y) {
            if (!m20938B()) {
                m20966b0();
            }
            m20952P(0);
        } else if (this.f15923e0 != 1) {
            m20966b0();
        }
    }

    /* renamed from: R */
    private void m20954R() {
        C8841d dVar = this.f15907Q;
        if (dVar == null) {
            this.f15907Q = new C8841d();
        } else {
            removeCallbacks(dVar);
        }
        postDelayed(this.f15907Q, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: S */
    private void m20955S(boolean z, long j) {
        C8842e eVar = this.f15906C;
        if (eVar == null) {
            this.f15906C = new C8842e();
        } else {
            removeCallbacks(eVar);
        }
        this.f15906C.m21005c(z);
        postDelayed(this.f15906C, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m20956T(int i, int i2) {
        C8848k kVar = this.f15905B;
        if (kVar == null) {
            this.f15905B = new C8848k();
        } else {
            removeCallbacks(kVar);
        }
        int unused = this.f15905B.f15979a = i;
        int unused2 = this.f15905B.f15980b = i2;
        post(this.f15905B);
    }

    /* renamed from: U */
    private void m20957U() {
        m20948L();
        invalidate();
    }

    /* renamed from: V */
    private void m20958V() {
        C8842e eVar = this.f15906C;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
        C8848k kVar = this.f15905B;
        if (kVar != null) {
            removeCallbacks(kVar);
        }
        C8841d dVar = this.f15907Q;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f15941n0.mo36429d();
    }

    /* renamed from: W */
    private void m20959W() {
        C8841d dVar = this.f15907Q;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
    }

    /* renamed from: X */
    private void m20960X() {
        C8842e eVar = this.f15906C;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
    }

    /* renamed from: Y */
    private int m20961Y(int i, int i2, int i3) {
        return i != -1 ? LinearLayout.resolveSizeAndState(Math.max(i, i2), i3, 0) : i2;
    }

    /* renamed from: Z */
    private void m20962Z(int i, boolean z) {
        if (this.f15938m != i) {
            int H = this.f15917b0 ? m20944H(i) : Math.min(Math.max(i, this.f15934k), this.f15936l);
            int i2 = this.f15938m;
            this.f15938m = H;
            m20966b0();
            if (z) {
                m20951O(i2, H);
            }
            m20948L();
            invalidate();
        }
    }

    /* renamed from: a0 */
    private void m20964a0() {
        if (this.f15926g) {
            float f = -1.0f;
            this.f15952t.setTextSize((float) this.f15949r0);
            String[] strArr = this.f15932j;
            int i = 0;
            if (strArr == null) {
                float f2 = 0.0f;
                while (i < 9) {
                    float measureText = this.f15952t.measureText(String.valueOf(i));
                    if (measureText > f2) {
                        f2 = measureText;
                    }
                    i++;
                }
                f = (float) ((int) (((float) m20940D(this.f15936l).length()) * f2));
            } else {
                int length = strArr.length;
                while (i < length) {
                    float measureText2 = this.f15952t.measureText(strArr[i]);
                    if (measureText2 > f) {
                        f = measureText2;
                    }
                    i++;
                }
            }
            this.f15947q0 = f;
            float paddingLeft = f + ((float) (this.f15914a.getPaddingLeft() + this.f15914a.getPaddingRight())) + ((float) getPaddingLeft()) + ((float) getPaddingRight());
            if (((float) this.f15924f) != paddingLeft) {
                int i2 = this.f15922e;
                if (paddingLeft > ((float) i2)) {
                    this.f15924f = (int) paddingLeft;
                } else {
                    this.f15924f = i2;
                }
            }
        }
    }

    /* renamed from: b0 */
    private boolean m20966b0() {
        String[] strArr = this.f15932j;
        String D = strArr == null ? m20940D(this.f15938m) : strArr[this.f15938m - this.f15934k];
        if (TextUtils.isEmpty(D) || D.equals(this.f15914a.getText().toString())) {
            return false;
        }
        this.f15914a.setText(D);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m20968c0(View view) {
        String valueOf = String.valueOf(((TextView) view).getText());
        if (TextUtils.isEmpty(valueOf)) {
            m20966b0();
        } else {
            m20962Z(m20942F(valueOf), true);
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [boolean, byte] */
    /* renamed from: e */
    static /* synthetic */ boolean m20970e(NumberPicker numberPicker, int i) {
        ? r2 = (byte) (i ^ numberPicker.f15935k0);
        numberPicker.f15935k0 = r2;
        return r2;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [boolean, byte] */
    /* renamed from: i */
    static /* synthetic */ boolean m20974i(NumberPicker numberPicker, int i) {
        ? r2 = (byte) (i ^ numberPicker.f15937l0);
        numberPicker.f15937l0 = r2;
        return r2;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m20990y(boolean z) {
        if (this.f15919c0) {
            this.f15914a.setVisibility(4);
            if (!m20950N(this.f15962y)) {
                m20950N(this.f15963z);
            }
            this.f15904A = 0;
            if (z) {
                this.f15962y.startScroll(0, 0, 0, -this.f15956v, 300);
            } else {
                this.f15962y.startScroll(0, 0, 0, this.f15956v, 300);
            }
            invalidate();
            return;
        }
        m20962Z(z ? this.f15938m + 1 : this.f15938m - 1, true);
    }

    /* renamed from: z */
    private void m20991z(int[] iArr) {
        System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
        int i = iArr[1] - 1;
        if (this.f15917b0 && i < this.f15934k) {
            i = this.f15936l;
        }
        iArr[0] = i;
        m20937A(i);
    }

    public void computeScroll() {
        Scroller scroller = this.f15962y;
        if (scroller.isFinished()) {
            scroller = this.f15963z;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (this.f15904A == 0) {
            this.f15904A = scroller.getStartY();
        }
        scrollBy(0, currY - this.f15904A);
        this.f15904A = currY;
        if (scroller.isFinished()) {
            m20953Q(scroller);
        } else {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f15919c0) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            return false;
        }
        int y = (int) motionEvent.getY();
        int i = y < this.f15929h0 ? 3 : y > this.f15931i0 ? 1 : 2;
        int actionMasked = motionEvent.getActionMasked();
        C8840c cVar = (C8840c) getAccessibilityNodeProvider();
        if (actionMasked == 7) {
            int i2 = this.f15933j0;
            if (i2 == i || i2 == -1) {
                return false;
            }
            cVar.mo36419k(i2, 256);
        } else if (actionMasked != 9) {
            if (actionMasked != 10) {
                return false;
            }
            cVar.mo36419k(i, 256);
            this.f15933j0 = -1;
            return false;
        }
        cVar.mo36419k(i, 128);
        this.f15933j0 = i;
        cVar.performAction(i, 64, (Bundle) null);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        requestFocus();
        r5.f15943o0 = r0;
        m20958V();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r5.f15962y.isFinished() == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r0 != 20) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        m20990y(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getKeyCode()
            r1 = 19
            r2 = 20
            if (r0 == r1) goto L_0x0019
            if (r0 == r2) goto L_0x0019
            r1 = 23
            if (r0 == r1) goto L_0x0015
            r1 = 66
            if (r0 == r1) goto L_0x0015
            goto L_0x0065
        L_0x0015:
            r5.m20958V()
            goto L_0x0065
        L_0x0019:
            boolean r1 = r5.f15919c0
            if (r1 != 0) goto L_0x001e
            goto L_0x0065
        L_0x001e:
            int r1 = r6.getAction()
            r3 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r3) goto L_0x0028
            goto L_0x0065
        L_0x0028:
            int r1 = r5.f15943o0
            if (r1 != r0) goto L_0x0065
            r6 = -1
            r5.f15943o0 = r6
            return r3
        L_0x0030:
            boolean r1 = r5.f15917b0
            if (r1 != 0) goto L_0x0042
            if (r0 != r2) goto L_0x0037
            goto L_0x0042
        L_0x0037:
            int r1 = r5.getValue()
            int r4 = r5.getMinValue()
            if (r1 <= r4) goto L_0x0065
            goto L_0x004c
        L_0x0042:
            int r1 = r5.getValue()
            int r4 = r5.getMaxValue()
            if (r1 >= r4) goto L_0x0065
        L_0x004c:
            r5.requestFocus()
            r5.f15943o0 = r0
            r5.m20958V()
            android.widget.Scroller r6 = r5.f15962y
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x0064
            if (r0 != r2) goto L_0x0060
            r6 = 1
            goto L_0x0061
        L_0x0060:
            r6 = 0
        L_0x0061:
            r5.m20990y(r6)
        L_0x0064:
            return r3
        L_0x0065:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.view.NumberPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            m20958V();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            m20958V();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (!this.f15919c0) {
            return super.getAccessibilityNodeProvider();
        }
        if (this.f15939m0 == null) {
            this.f15939m0 = new C8840c();
        }
        return this.f15939m0;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.f15932j;
    }

    public int getMaxValue() {
        return this.f15936l;
    }

    public int getMinValue() {
        return this.f15934k;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public int getValue() {
        return this.f15938m;
    }

    public boolean getWrapSelectorWheel() {
        return this.f15917b0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m20958V();
        this.f15959w0.release();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (!this.f15919c0) {
            super.onDraw(canvas);
            return;
        }
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float right = (float) ((((getRight() - getLeft()) + paddingLeft) - paddingRight) / 2);
        float f = (float) this.f15960x;
        Drawable drawable = this.f15954u;
        boolean z = false;
        if (drawable != null && this.f15923e0 == 0) {
            if (this.f15937l0) {
                drawable.setState(f15900A0);
                this.f15954u.setBounds(paddingLeft, 0, width - paddingRight, this.f15929h0);
                this.f15954u.draw(canvas2);
            }
            if (this.f15935k0) {
                this.f15954u.setState(f15900A0);
                this.f15954u.setBounds(paddingLeft, this.f15931i0, width - paddingRight, getBottom());
                this.f15954u.draw(canvas2);
            }
        }
        float f2 = (float) (this.f15958w + (this.f15956v * 2));
        SparseArray<String> sparseArray = this.f15948r;
        int[] iArr = this.f15950s;
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            String str = sparseArray.get(iArr[i]);
            float abs = Math.abs(f2 - f) / ((float) this.f15956v);
            float G = m20943G(abs, this.f15949r0, this.f15951s0);
            this.f15952t.setTextSize(G);
            this.f15952t.setColor(m20941E(abs, 2130706432, z));
            canvas2.drawText(str, right, ((G - ((float) this.f15951s0)) / 2.0f) + f, this.f15952t);
            if (abs < 1.0f) {
                this.f15952t.setColor(m20941E(abs, ContextCompat.getColor(getContext(), R$color.class_text_14), true));
                canvas2.drawText(str, right, ((G - ((float) this.f15951s0)) / 2.0f) + f, this.f15952t);
            }
            f += (float) this.f15956v;
            i++;
            z = false;
        }
        if (!TextUtils.isEmpty(this.f15957v0)) {
            canvas2.drawText(this.f15957v0.toString(), right + (this.f15947q0 / 2.0f), f2 + ((float) ((this.f15949r0 - this.f15951s0) / 2)) + this.f15955u0 + ((float) this.f15953t0), this.f15945p0);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(NumberPicker.class.getName());
        accessibilityEvent.setScrollable(true);
        accessibilityEvent.setScrollY((this.f15934k + this.f15938m) * this.f15956v);
        accessibilityEvent.setMaxScrollY((this.f15936l - this.f15934k) * this.f15956v);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f15919c0 || !isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        m20958V();
        this.f15914a.setVisibility(4);
        float y = motionEvent.getY();
        this.f15908R = y;
        this.f15910T = y;
        this.f15909S = motionEvent.getEventTime();
        this.f15925f0 = false;
        this.f15927g0 = false;
        float f = this.f15908R;
        if (f < ((float) this.f15929h0)) {
            if (this.f15923e0 == 0) {
                this.f15941n0.mo36427b(2);
            }
        } else if (f > ((float) this.f15931i0) && this.f15923e0 == 0) {
            this.f15941n0.mo36427b(1);
        }
        if (!this.f15962y.isFinished()) {
            this.f15962y.forceFinished(true);
            this.f15963z.forceFinished(true);
            m20952P(0);
        } else if (!this.f15963z.isFinished()) {
            this.f15962y.forceFinished(true);
            this.f15963z.forceFinished(true);
        } else {
            float f2 = this.f15908R;
            if (f2 < ((float) this.f15929h0)) {
                m20955S(false, (long) ViewConfiguration.getLongPressTimeout());
            } else if (f2 > ((float) this.f15931i0)) {
                m20955S(true, (long) ViewConfiguration.getLongPressTimeout());
            } else {
                this.f15927g0 = true;
                m20954R();
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.f15919c0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f15914a.getMeasuredWidth();
        int measuredHeight2 = this.f15914a.getMeasuredHeight();
        int i5 = (measuredWidth - measuredWidth2) / 2;
        int i6 = (measuredHeight - measuredHeight2) / 2;
        this.f15914a.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
        if (z) {
            m20947K();
            m20946J();
            int height = getHeight();
            int i7 = this.f15916b;
            int i8 = this.f15921d0;
            int i9 = ((height - i7) / 2) - i8;
            this.f15929h0 = i9;
            this.f15931i0 = i9 + (i8 * 2) + i7;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!this.f15919c0) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(m20949M(i, this.f15924f), m20949M(i2, this.f15920d));
        setMeasuredDimension(m20961Y(this.f15922e, getMeasuredWidth(), i), m20961Y(this.f15918c, getMeasuredHeight(), i2));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.f15919c0) {
            return false;
        }
        if (this.f15911U == null) {
            this.f15911U = VelocityTracker.obtain();
        }
        this.f15911U.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            m20959W();
            m20960X();
            this.f15941n0.mo36429d();
            VelocityTracker velocityTracker = this.f15911U;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f15915a0);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.f15913W) {
                m20939C(yVelocity);
                m20952P(2);
            } else {
                int y = (int) motionEvent.getY();
                int abs = (int) Math.abs(((float) y) - this.f15908R);
                long eventTime = motionEvent.getEventTime() - this.f15909S;
                if (abs > this.f15912V || eventTime >= ((long) ViewConfiguration.getTapTimeout())) {
                    m20938B();
                } else if (this.f15927g0) {
                    this.f15927g0 = false;
                } else {
                    int i = (y / this.f15956v) - 2;
                    if (i > 0) {
                        m20990y(true);
                        this.f15941n0.mo36428c(1);
                    } else if (i < 0) {
                        m20990y(false);
                        this.f15941n0.mo36428c(2);
                    }
                }
                m20952P(0);
            }
            this.f15911U.recycle();
            this.f15911U = null;
        } else if (actionMasked == 2 && !this.f15925f0) {
            float y2 = motionEvent.getY();
            if (this.f15923e0 == 1) {
                scrollBy(0, (int) (y2 - this.f15910T));
                invalidate();
            } else if (((int) Math.abs(y2 - this.f15908R)) > this.f15912V) {
                m20958V();
                m20952P(1);
            }
            this.f15910T = y2;
        }
        return true;
    }

    public void scrollBy(int i, int i2) {
        int[] iArr = this.f15950s;
        boolean z = this.f15917b0;
        if ((z || i2 <= 0 || iArr[2] > this.f15934k) && (z || i2 >= 0 || iArr[2] < this.f15936l)) {
            this.f15960x += i2;
            while (true) {
                int i3 = this.f15960x;
                if (i3 - this.f15958w <= this.f15930i) {
                    break;
                }
                this.f15960x = i3 - this.f15956v;
                m20991z(iArr);
                m20962Z(iArr[2], true);
                if (!this.f15917b0 && iArr[2] <= this.f15934k) {
                    this.f15960x = this.f15958w;
                }
            }
            while (true) {
                int i4 = this.f15960x;
                if (i4 - this.f15958w < (-this.f15930i)) {
                    this.f15960x = i4 + this.f15956v;
                    m20945I(iArr);
                    m20962Z(iArr[2], true);
                    if (!this.f15917b0 && iArr[2] >= this.f15936l) {
                        this.f15960x = this.f15958w;
                    }
                } else {
                    return;
                }
            }
        } else {
            this.f15960x = this.f15958w;
        }
    }

    public void setDisplayedValues(String[] strArr) {
        EditText editText;
        int i;
        if (this.f15932j != strArr) {
            this.f15932j = strArr;
            if (strArr != null) {
                editText = this.f15914a;
                i = ImageMetadata.LENS_FILTER_DENSITY;
            } else {
                editText = this.f15914a;
                i = 2;
            }
            editText.setRawInputType(i);
            m20966b0();
            m20948L();
            m20964a0();
        }
    }

    public void setFormatter(C8843f fVar) {
        if (fVar != this.f15944p) {
            this.f15944p = fVar;
            m20948L();
            m20966b0();
        }
    }

    public void setLabel(String str) {
        CharSequence charSequence = this.f15957v0;
        if ((charSequence == null && str != null) || (charSequence != null && !charSequence.equals(str))) {
            this.f15957v0 = str;
            invalidate();
        }
    }

    public void setMaxValue(int i) {
        if (this.f15936l != i) {
            if (i < 0) {
                AppUtils.m8300u(f15902y0, "maxValue must be >= 0");
            }
            this.f15936l = i;
            if (i < this.f15938m) {
                this.f15938m = i;
            }
            setWrapSelectorWheel(i - this.f15934k > this.f15950s.length);
            m20948L();
            m20966b0();
            m20964a0();
            invalidate();
        }
    }

    public void setMinValue(int i) {
        if (this.f15934k != i) {
            if (i < 0) {
                AppUtils.m8300u(f15902y0, "minValue must be >= 0");
            }
            this.f15934k = i;
            if (i > this.f15938m) {
                this.f15938m = i;
            }
            setWrapSelectorWheel(this.f15936l - i > this.f15950s.length);
            m20948L();
            m20966b0();
            m20964a0();
            invalidate();
        }
    }

    public void setOnLongPressUpdateInterval(long j) {
        this.f15946q = j;
    }

    public void setOnScrollListener(C8845h hVar) {
        this.f15942o = hVar;
    }

    public void setOnValueChangedListener(C8846i iVar) {
        this.f15940n = iVar;
    }

    public void setValue(int i) {
        m20962Z(i, false);
    }

    public void setWrapSelectorWheel(boolean z) {
        boolean z2 = this.f15936l - this.f15934k >= this.f15950s.length;
        if ((!z || z2) && z != this.f15917b0) {
            this.f15917b0 = z;
        }
        m20957U();
    }
}
