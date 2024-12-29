package com.yeelight.yeelib.p194ui.view;

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
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.p107ar.core.ImageMetadata;
import com.yeelight.yeelib.R$attr;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$raw;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yeelight.yeelib.ui.view.NumberPicker */
public class NumberPicker extends LinearLayout {

    /* renamed from: p0 */
    private static final String f19642p0 = NumberPicker.class.getSimpleName();

    /* renamed from: q0 */
    public static final C10466f f19643q0 = new C10461a();

    /* renamed from: r0 */
    private static final int[] f19644r0 = {16842919};
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public static final char[] f19645s0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /* renamed from: A */
    private int f19646A;

    /* renamed from: B */
    private C10471k f19647B;

    /* renamed from: G */
    private C10465e f19648G;

    /* renamed from: H */
    private C10464d f19649H;

    /* renamed from: I */
    private float f19650I;

    /* renamed from: J */
    private long f19651J;

    /* renamed from: K */
    private float f19652K;

    /* renamed from: L */
    private VelocityTracker f19653L;

    /* renamed from: M */
    private int f19654M;

    /* renamed from: N */
    private int f19655N;

    /* renamed from: O */
    private int f19656O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public boolean f19657P;

    /* renamed from: Q */
    private final boolean f19658Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final int f19659R;

    /* renamed from: S */
    private int f19660S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public boolean f19661T;

    /* renamed from: U */
    private boolean f19662U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public int f19663V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public int f19664W;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final EditText f19665a;

    /* renamed from: a0 */
    private int f19666a0;

    /* renamed from: b */
    private final int f19667b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public boolean f19668b0;

    /* renamed from: c */
    private final int f19669c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public boolean f19670c0;

    /* renamed from: d */
    private final int f19671d;

    /* renamed from: d0 */
    private C10463c f19672d0;

    /* renamed from: e */
    private final int f19673e;

    /* renamed from: e0 */
    private final C10470j f19674e0;

    /* renamed from: f */
    private int f19675f;

    /* renamed from: f0 */
    private int f19676f0;

    /* renamed from: g */
    private final boolean f19677g;

    /* renamed from: g0 */
    private Paint f19678g0;

    /* renamed from: h */
    private final int f19679h;

    /* renamed from: h0 */
    private float f19680h0;

    /* renamed from: i */
    private int f19681i;

    /* renamed from: i0 */
    private int f19682i0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String[] f19683j;

    /* renamed from: j0 */
    private int f19684j0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f19685k;

    /* renamed from: k0 */
    private int f19686k0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f19687l;

    /* renamed from: l0 */
    private float f19688l0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f19689m;

    /* renamed from: m0 */
    private CharSequence f19690m0;

    /* renamed from: n */
    private C10469i f19691n;

    /* renamed from: n0 */
    private SoundPool f19692n0;

    /* renamed from: o */
    private C10468h f19693o;

    /* renamed from: o0 */
    private int f19694o0;

    /* renamed from: p */
    private C10466f f19695p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f19696q;

    /* renamed from: r */
    private final SparseArray<String> f19697r;

    /* renamed from: s */
    private final int[] f19698s;

    /* renamed from: t */
    private final Paint f19699t;

    /* renamed from: u */
    private final Drawable f19700u;

    /* renamed from: v */
    private int f19701v;

    /* renamed from: w */
    private int f19702w;

    /* renamed from: x */
    private int f19703x;

    /* renamed from: y */
    private final Scroller f19704y;

    /* renamed from: z */
    private final Scroller f19705z;

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
    static class C10461a implements C10466f {

        /* renamed from: a */
        final StringBuilder f19706a = new StringBuilder();

        /* renamed from: b */
        final Formatter f19707b = new Formatter(this.f19706a, Locale.US);

        /* renamed from: c */
        final Object[] f19708c = new Object[1];

        C10461a() {
        }

        /* renamed from: a */
        public String mo33046a(int i) {
            this.f19708c[0] = Integer.valueOf(i);
            StringBuilder sb = this.f19706a;
            sb.delete(0, sb.length());
            this.f19707b.format("%02d", new Object[]{(Integer) this.f19708c[0]});
            return this.f19707b.toString();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$b */
    class C10462b implements View.OnFocusChangeListener {
        C10462b() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                NumberPicker.this.f19665a.selectAll();
                return;
            }
            NumberPicker.this.f19665a.setSelection(0, 0);
            NumberPicker.this.m25352a0(view);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$c */
    class C10463c extends AccessibilityNodeProvider {

        /* renamed from: a */
        private final Rect f19710a = new Rect();

        /* renamed from: b */
        private final int[] f19711b = new int[2];

        /* renamed from: c */
        private int f19712c = Integer.MIN_VALUE;

        C10463c() {
        }

        /* renamed from: a */
        private AccessibilityNodeInfo m25379a(int i, int i2, int i3, int i4) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            obtain.setClassName(NumberPicker.class.getName());
            obtain.setPackageName(NumberPicker.this.getContext().getPackageName());
            obtain.setSource(NumberPicker.this);
            if (m25385g()) {
                obtain.addChild(NumberPicker.this, 3);
            }
            obtain.addChild(NumberPicker.this, 2);
            if (m25386h()) {
                obtain.addChild(NumberPicker.this, 1);
            }
            obtain.setParent((View) NumberPicker.this.getParentForAccessibility());
            obtain.setEnabled(NumberPicker.this.isEnabled());
            obtain.setScrollable(true);
            Rect rect = this.f19710a;
            rect.set(i, i2, i3, i4);
            obtain.setBoundsInParent(rect);
            obtain.setVisibleToUser(NumberPicker.this.getVisibility() == 0);
            int[] iArr = this.f19711b;
            NumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            obtain.setBoundsInScreen(rect);
            if (this.f19712c != -1) {
                obtain.addAction(64);
            }
            if (this.f19712c == -1) {
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
        private AccessibilityNodeInfo m25380b(int i, String str, int i2, int i3, int i4, int i5) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            obtain.setClassName(Button.class.getName());
            obtain.setPackageName(NumberPicker.this.getContext().getPackageName());
            obtain.setSource(NumberPicker.this, i);
            obtain.setParent(NumberPicker.this);
            obtain.setText(str);
            obtain.setClickable(true);
            obtain.setLongClickable(true);
            obtain.setEnabled(NumberPicker.this.isEnabled());
            Rect rect = this.f19710a;
            rect.set(i2, i3, i4, i5);
            obtain.setVisibleToUser(NumberPicker.this.getVisibility() == 0);
            obtain.setBoundsInParent(rect);
            int[] iArr = this.f19711b;
            NumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            obtain.setBoundsInScreen(rect);
            if (this.f19712c != i) {
                obtain.addAction(64);
            }
            if (this.f19712c == i) {
                obtain.addAction(128);
            }
            if (NumberPicker.this.isEnabled()) {
                obtain.addAction(16);
            }
            return obtain;
        }

        /* renamed from: c */
        private AccessibilityNodeInfo m25381c(int i, int i2, int i3, int i4) {
            AccessibilityNodeInfo createAccessibilityNodeInfo = NumberPicker.this.f19665a.createAccessibilityNodeInfo();
            createAccessibilityNodeInfo.setSource(NumberPicker.this, 2);
            if (this.f19712c != 2) {
                createAccessibilityNodeInfo.addAction(64);
            }
            if (this.f19712c == 2) {
                createAccessibilityNodeInfo.addAction(128);
            }
            Rect rect = this.f19710a;
            rect.set(i, i2, i3, i4);
            createAccessibilityNodeInfo.setVisibleToUser(NumberPicker.this.getVisibility() == 0);
            createAccessibilityNodeInfo.setBoundsInParent(rect);
            int[] iArr = this.f19711b;
            NumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            createAccessibilityNodeInfo.setBoundsInScreen(rect);
            return createAccessibilityNodeInfo;
        }

        /* renamed from: d */
        private void m25382d(String str, int i, List<AccessibilityNodeInfo> list) {
            if (i == 1) {
                String f = m25384f();
                if (!TextUtils.isEmpty(f) && f.toLowerCase().contains(str)) {
                    list.add(createAccessibilityNodeInfo(1));
                }
            } else if (i == 2) {
                Editable text = NumberPicker.this.f19665a.getText();
                if (TextUtils.isEmpty(text) || !text.toString().toLowerCase().contains(str)) {
                    Editable text2 = NumberPicker.this.f19665a.getText();
                    if (TextUtils.isEmpty(text2) || !text2.toString().toLowerCase().contains(str)) {
                        return;
                    }
                }
                list.add(createAccessibilityNodeInfo(2));
            } else if (i == 3) {
                String e = m25383e();
                if (!TextUtils.isEmpty(e) && e.toLowerCase().contains(str)) {
                    list.add(createAccessibilityNodeInfo(3));
                }
            }
        }

        /* renamed from: e */
        private String m25383e() {
            int m = NumberPicker.this.f19689m - 1;
            if (NumberPicker.this.f19657P) {
                m = NumberPicker.this.m25330F(m);
            }
            if (m >= NumberPicker.this.f19685k) {
                return NumberPicker.this.f19683j == null ? NumberPicker.this.m25326B(m) : NumberPicker.this.f19683j[m - NumberPicker.this.f19685k];
            }
            return null;
        }

        /* renamed from: f */
        private String m25384f() {
            int m = NumberPicker.this.f19689m + 1;
            if (NumberPicker.this.f19657P) {
                m = NumberPicker.this.m25330F(m);
            }
            if (m <= NumberPicker.this.f19687l) {
                return NumberPicker.this.f19683j == null ? NumberPicker.this.m25326B(m) : NumberPicker.this.f19683j[m - NumberPicker.this.f19685k];
            }
            return null;
        }

        /* renamed from: g */
        private boolean m25385g() {
            return NumberPicker.this.getWrapSelectorWheel() || NumberPicker.this.getValue() > NumberPicker.this.getMinValue();
        }

        /* renamed from: h */
        private boolean m25386h() {
            return NumberPicker.this.getWrapSelectorWheel() || NumberPicker.this.getValue() < NumberPicker.this.getMaxValue();
        }

        /* renamed from: i */
        private void m25387i(int i, int i2, String str) {
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
        private void m25388j(int i) {
            if (((AccessibilityManager) NumberPicker.this.getContext().getSystemService("accessibility")).isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
                NumberPicker.this.f19665a.onInitializeAccessibilityEvent(obtain);
                NumberPicker.this.f19665a.onPopulateAccessibilityEvent(obtain);
                obtain.setSource(NumberPicker.this, 2);
                NumberPicker numberPicker = NumberPicker.this;
                numberPicker.requestSendAccessibilityEvent(numberPicker, obtain);
            }
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            if (i == -1) {
                return m25379a(NumberPicker.this.getScrollX(), NumberPicker.this.getScrollY(), NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.getScrollY() + (NumberPicker.this.getBottom() - NumberPicker.this.getTop()));
            }
            if (i == 1) {
                return m25380b(1, m25384f(), NumberPicker.this.getScrollX(), NumberPicker.this.f19664W - NumberPicker.this.f19659R, NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.getScrollY() + (NumberPicker.this.getBottom() - NumberPicker.this.getTop()));
            } else if (i == 2) {
                return m25381c(NumberPicker.this.getScrollX(), NumberPicker.this.f19663V + NumberPicker.this.f19659R, NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.f19664W - NumberPicker.this.f19659R);
            } else {
                if (i != 3) {
                    return super.createAccessibilityNodeInfo(i);
                }
                return m25380b(3, m25383e(), NumberPicker.this.getScrollX(), NumberPicker.this.getScrollY(), NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.f19663V + NumberPicker.this.f19659R);
            }
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            if (TextUtils.isEmpty(str)) {
                return Collections.emptyList();
            }
            String lowerCase = str.toLowerCase();
            ArrayList arrayList = new ArrayList();
            if (i == -1) {
                m25382d(lowerCase, 3, arrayList);
                m25382d(lowerCase, 2, arrayList);
                m25382d(lowerCase, 1, arrayList);
                return arrayList;
            } else if (i != 1 && i != 2 && i != 3) {
                return super.findAccessibilityNodeInfosByText(str, i);
            } else {
                m25382d(lowerCase, i, arrayList);
                return arrayList;
            }
        }

        /* renamed from: k */
        public void mo33050k(int i, int i2) {
            String str;
            if (i != 1) {
                if (i == 2) {
                    m25388j(i2);
                    return;
                } else if (i == 3 && m25385g()) {
                    str = m25383e();
                } else {
                    return;
                }
            } else if (m25386h()) {
                str = m25384f();
            } else {
                return;
            }
            m25387i(i, i2, str);
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            if (i != -1) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (i2 != 16) {
                                if (i2 != 64) {
                                    if (i2 != 128 || this.f19712c != i) {
                                        return false;
                                    }
                                    this.f19712c = Integer.MIN_VALUE;
                                    mo33050k(i, 65536);
                                    NumberPicker numberPicker = NumberPicker.this;
                                    numberPicker.invalidate(0, 0, numberPicker.getRight(), NumberPicker.this.f19663V);
                                    return true;
                                } else if (this.f19712c == i) {
                                    return false;
                                } else {
                                    this.f19712c = i;
                                    mo33050k(i, 32768);
                                    NumberPicker numberPicker2 = NumberPicker.this;
                                    numberPicker2.invalidate(0, 0, numberPicker2.getRight(), NumberPicker.this.f19663V);
                                    return true;
                                }
                            } else if (!NumberPicker.this.isEnabled()) {
                                return false;
                            } else {
                                NumberPicker.this.m25374w(false);
                                mo33050k(i, 1);
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
                                    return NumberPicker.this.f19665a.performAccessibilityAction(i2, bundle);
                                }
                                if (this.f19712c != i) {
                                    return false;
                                }
                                this.f19712c = Integer.MIN_VALUE;
                                mo33050k(i, 65536);
                                NumberPicker.this.f19665a.invalidate();
                                return true;
                            } else if (this.f19712c == i) {
                                return false;
                            } else {
                                this.f19712c = i;
                                mo33050k(i, 32768);
                                NumberPicker.this.f19665a.invalidate();
                                return true;
                            }
                        } else if (!NumberPicker.this.isEnabled() || !NumberPicker.this.f19665a.isFocused()) {
                            return false;
                        } else {
                            NumberPicker.this.f19665a.clearFocus();
                            return true;
                        }
                    } else if (!NumberPicker.this.isEnabled() || NumberPicker.this.f19665a.isFocused()) {
                        return false;
                    } else {
                        return NumberPicker.this.f19665a.requestFocus();
                    }
                } else if (i2 != 16) {
                    if (i2 != 64) {
                        if (i2 != 128 || this.f19712c != i) {
                            return false;
                        }
                        this.f19712c = Integer.MIN_VALUE;
                        mo33050k(i, 65536);
                        NumberPicker numberPicker3 = NumberPicker.this;
                        numberPicker3.invalidate(0, numberPicker3.f19664W, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                        return true;
                    } else if (this.f19712c == i) {
                        return false;
                    } else {
                        this.f19712c = i;
                        mo33050k(i, 32768);
                        NumberPicker numberPicker4 = NumberPicker.this;
                        numberPicker4.invalidate(0, numberPicker4.f19664W, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                        return true;
                    }
                } else if (!NumberPicker.this.isEnabled()) {
                    return false;
                } else {
                    NumberPicker.this.m25374w(true);
                    mo33050k(i, 1);
                    return true;
                }
            } else if (i2 != 64) {
                if (i2 != 128) {
                    if (i2 != 4096) {
                        if (i2 == 8192) {
                            if (!NumberPicker.this.isEnabled() || (!NumberPicker.this.getWrapSelectorWheel() && NumberPicker.this.getValue() <= NumberPicker.this.getMinValue())) {
                                return false;
                            }
                            NumberPicker.this.m25374w(false);
                            return true;
                        }
                    } else if (!NumberPicker.this.isEnabled() || (!NumberPicker.this.getWrapSelectorWheel() && NumberPicker.this.getValue() >= NumberPicker.this.getMaxValue())) {
                        return false;
                    } else {
                        NumberPicker.this.m25374w(true);
                        return true;
                    }
                } else if (this.f19712c != i) {
                    return false;
                } else {
                    this.f19712c = Integer.MIN_VALUE;
                    return true;
                }
            } else if (this.f19712c == i) {
                return false;
            } else {
                this.f19712c = i;
                return true;
            }
            return super.performAction(i, i2, bundle);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$d */
    class C10464d implements Runnable {
        C10464d() {
        }

        public void run() {
            boolean unused = NumberPicker.this.f19661T = true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$e */
    class C10465e implements Runnable {

        /* renamed from: a */
        private boolean f19715a;

        C10465e() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m25391c(boolean z) {
            this.f19715a = z;
        }

        public void run() {
            NumberPicker.this.m25374w(this.f19715a);
            NumberPicker numberPicker = NumberPicker.this;
            numberPicker.postDelayed(this, numberPicker.f19696q);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$f */
    public interface C10466f {
        /* renamed from: a */
        String mo33046a(int i);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$g */
    class C10467g extends NumberKeyListener {
        C10467g() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (NumberPicker.this.f19683j == null) {
                CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
                if (filter == null) {
                    filter = charSequence.subSequence(i, i2);
                }
                String str = String.valueOf(spanned.subSequence(0, i3)) + filter + spanned.subSequence(i4, spanned.length());
                return "".equals(str) ? str : (NumberPicker.this.m25328D(str) > NumberPicker.this.f19687l || str.length() > String.valueOf(NumberPicker.this.f19687l).length()) ? "" : filter;
            }
            String valueOf = String.valueOf(charSequence.subSequence(i, i2));
            if (TextUtils.isEmpty(valueOf)) {
                return "";
            }
            String str2 = String.valueOf(spanned.subSequence(0, i3)) + valueOf + spanned.subSequence(i4, spanned.length());
            String lowerCase = String.valueOf(str2).toLowerCase();
            for (String str3 : NumberPicker.this.f19683j) {
                if (str3.toLowerCase().startsWith(lowerCase)) {
                    NumberPicker.this.m25342R(str2.length(), str3.length());
                    return str3.subSequence(i3, str3.length());
                }
            }
            return "";
        }

        /* access modifiers changed from: protected */
        public char[] getAcceptedChars() {
            return NumberPicker.f19645s0;
        }

        public int getInputType() {
            return 1;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$h */
    public interface C10468h {
        /* renamed from: a */
        void mo33057a(NumberPicker numberPicker, int i);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$i */
    public interface C10469i {
        /* renamed from: a */
        void mo32336a(NumberPicker numberPicker, int i, int i2);
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$j */
    class C10470j implements Runnable {

        /* renamed from: a */
        private int f19718a;

        /* renamed from: b */
        private int f19719b;

        C10470j() {
        }

        /* renamed from: b */
        public void mo33058b(int i) {
            mo33060d();
            this.f19719b = 1;
            this.f19718a = i;
            NumberPicker.this.postDelayed(this, (long) ViewConfiguration.getTapTimeout());
        }

        /* renamed from: c */
        public void mo33059c(int i) {
            mo33060d();
            this.f19719b = 2;
            this.f19718a = i;
            NumberPicker.this.post(this);
        }

        /* renamed from: d */
        public void mo33060d() {
            this.f19719b = 0;
            this.f19718a = 0;
            NumberPicker.this.removeCallbacks(this);
            if (NumberPicker.this.f19668b0) {
                boolean unused = NumberPicker.this.f19668b0 = false;
                NumberPicker numberPicker = NumberPicker.this;
                numberPicker.invalidate(0, numberPicker.f19664W, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
            }
            if (NumberPicker.this.f19670c0) {
                boolean unused2 = NumberPicker.this.f19670c0 = false;
                NumberPicker numberPicker2 = NumberPicker.this;
                numberPicker2.invalidate(0, 0, numberPicker2.getRight(), NumberPicker.this.f19663V);
            }
        }

        public void run() {
            int i = this.f19719b;
            if (i == 1) {
                int i2 = this.f19718a;
                if (i2 == 1) {
                    boolean unused = NumberPicker.this.f19668b0 = true;
                    NumberPicker numberPicker = NumberPicker.this;
                    numberPicker.invalidate(0, numberPicker.f19664W, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                    return;
                } else if (i2 == 2) {
                    boolean unused2 = NumberPicker.this.f19670c0 = true;
                } else {
                    return;
                }
            } else if (i == 2) {
                int i3 = this.f19718a;
                if (i3 == 1) {
                    if (!NumberPicker.this.f19668b0) {
                        NumberPicker.this.postDelayed(this, (long) ViewConfiguration.getPressedStateDuration());
                    }
                    NumberPicker numberPicker2 = NumberPicker.this;
                    boolean unused3 = numberPicker2.f19668b0 = !numberPicker2.f19668b0;
                    NumberPicker numberPicker3 = NumberPicker.this;
                    numberPicker3.invalidate(0, numberPicker3.f19664W, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                    return;
                } else if (i3 == 2) {
                    if (!NumberPicker.this.f19670c0) {
                        NumberPicker.this.postDelayed(this, (long) ViewConfiguration.getPressedStateDuration());
                    }
                    NumberPicker numberPicker4 = NumberPicker.this;
                    boolean unused4 = numberPicker4.f19670c0 = !numberPicker4.f19670c0;
                } else {
                    return;
                }
            } else {
                return;
            }
            NumberPicker numberPicker5 = NumberPicker.this;
            numberPicker5.invalidate(0, 0, numberPicker5.getRight(), NumberPicker.this.f19663V);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.NumberPicker$k */
    class C10471k implements Runnable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f19721a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f19722b;

        C10471k() {
        }

        public void run() {
            NumberPicker.this.f19665a.setSelection(this.f19721a, this.f19722b);
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.numberPickerStyle);
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f19696q = 300;
        this.f19697r = new SparseArray<>();
        this.f19698s = new int[5];
        this.f19702w = Integer.MIN_VALUE;
        this.f19660S = 0;
        this.f19676f0 = -1;
        this.f19682i0 = 25;
        this.f19684j0 = 14;
        this.f19686k0 = 10;
        float f = getResources().getDisplayMetrics().density;
        float f2 = 56.0f;
        int i2 = 260;
        if (f != 1.0f) {
            this.f19684j0 = (int) (((float) this.f19684j0) * f);
            this.f19682i0 = (int) (((float) this.f19682i0) * f);
            this.f19686k0 = (int) (((float) this.f19686k0) * f);
            f2 = 56.0f * f;
            i2 = (int) (((float) 260) * f);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842901, 16843087}, 0, 0);
        this.f19690m0 = obtainStyledAttributes.getText(1);
        this.f19682i0 = obtainStyledAttributes.getDimensionPixelSize(0, this.f19682i0);
        obtainStyledAttributes.recycle();
        SoundPool soundPool = new SoundPool(1, 1, 0);
        this.f19692n0 = soundPool;
        this.f19694o0 = soundPool.load(getContext(), R$raw.numberpicker_value_change, 1);
        int i3 = R$layout.numberpicker_layout;
        this.f19658Q = true;
        this.f19659R = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.f19667b = (int) f2;
        this.f19669c = -1;
        this.f19671d = i2;
        this.f19673e = -1;
        this.f19675f = -1;
        this.f19677g = true;
        this.f19700u = ContextCompat.getDrawable(getContext(), R$drawable.virtual_button);
        this.f19674e0 = new C10470j();
        setWillNotDraw(false);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(i3, this, true);
        EditText editText = (EditText) findViewById(R$id.numberpicker_input);
        this.f19665a = editText;
        editText.setOnFocusChangeListener(new C10462b());
        this.f19665a.setFilters(new InputFilter[]{new C10467g()});
        this.f19665a.setRawInputType(2);
        this.f19665a.setImeOptions(6);
        this.f19665a.setVisibility(4);
        this.f19665a.setGravity(3);
        if (Build.VERSION.SDK_INT >= 14) {
            this.f19665a.setScaleX(0.0f);
        }
        this.f19665a.setSaveEnabled(false);
        EditText editText2 = this.f19665a;
        editText2.setPadding(30, editText2.getPaddingTop(), 30, this.f19665a.getPaddingRight());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f19654M = viewConfiguration.getScaledTouchSlop();
        this.f19655N = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f19656O = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.f19679h = (int) this.f19665a.getTextSize();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize((float) this.f19682i0);
        paint.setTypeface(this.f19665a.getTypeface());
        paint.setColor(this.f19665a.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.f19699t = paint;
        this.f19688l0 = paint.ascent();
        Paint paint2 = new Paint();
        this.f19678g0 = paint2;
        paint2.setAntiAlias(true);
        this.f19678g0.setFakeBoldText(true);
        this.f19678g0.setColor(ContextCompat.getColor(getContext(), R$color.class_text_14));
        this.f19678g0.setTextSize((float) this.f19686k0);
        this.f19704y = Build.VERSION.SDK_INT >= 14 ? new Scroller(getContext(), (Interpolator) null, true) : new Scroller(getContext(), (Interpolator) null);
        this.f19705z = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        m25350Z();
        if (Build.VERSION.SDK_INT >= 16 && getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: A */
    private void m25325A(int i) {
        this.f19646A = 0;
        this.f19704y.fling(0, i > 0 ? 0 : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, i, 0, 0, 0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public String m25326B(int i) {
        C10466f fVar = this.f19695p;
        return fVar != null ? fVar.mo33046a(i) : String.valueOf(i);
    }

    /* renamed from: C */
    private int m25327C(float f, int i, boolean z) {
        if (f >= 1.0f) {
            return i;
        }
        return (((int) (z ? ((-f) * ((float) Color.alpha(i))) + ((float) Color.alpha(i)) : f * ((float) Color.alpha(i)))) << 24) | (i & ViewCompat.MEASURED_SIZE_MASK);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public int m25328D(String str) {
        if (this.f19683j == null) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return this.f19685k;
            }
        } else {
            for (int i = 0; i < this.f19683j.length; i++) {
                str = str.toLowerCase();
                if (this.f19683j[i].toLowerCase().startsWith(str)) {
                    return this.f19685k + i;
                }
            }
            return Integer.parseInt(str);
        }
    }

    /* renamed from: E */
    private float m25329E(float f, int i, int i2) {
        return f >= 1.0f ? (float) i2 : (f * ((float) (i2 - i))) + ((float) i);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public int m25330F(int i) {
        int i2 = this.f19687l;
        int i3 = this.f19685k;
        return i > i2 ? (i3 + ((i - i2) % (i2 - i3))) - 1 : i < i3 ? (i2 - ((i3 - i) % (i2 - i3))) + 1 : i;
    }

    /* renamed from: G */
    private void m25331G(int[] iArr) {
        System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
        int i = iArr[iArr.length - 2] + 1;
        if (this.f19657P && i > this.f19687l) {
            i = this.f19685k;
        }
        iArr[iArr.length - 1] = i;
        m25376y(i);
    }

    /* renamed from: H */
    private void m25332H() {
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(((getBottom() - getTop()) - this.f19679h) / 2);
    }

    /* renamed from: I */
    private void m25333I() {
        m25334J();
        int[] iArr = this.f19698s;
        int bottom = (int) ((((float) ((getBottom() - getTop()) - (iArr.length * this.f19679h))) / ((float) iArr.length)) + 0.5f);
        this.f19681i = bottom;
        this.f19701v = this.f19679h + bottom;
        int baseline = (this.f19665a.getBaseline() + this.f19665a.getTop()) - (this.f19701v * 2);
        this.f19702w = baseline;
        this.f19703x = baseline;
        m25350Z();
    }

    /* renamed from: J */
    private void m25334J() {
        this.f19697r.clear();
        int[] iArr = this.f19698s;
        int value = getValue();
        for (int i = 0; i < this.f19698s.length; i++) {
            int i2 = (i - 2) + value;
            if (this.f19657P) {
                i2 = m25330F(i2);
            }
            iArr[i] = i2;
            m25376y(iArr[i]);
        }
    }

    /* renamed from: K */
    private int m25335K(int i, int i2) {
        if (i2 == -1) {
            return i;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i2), 1073741824);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        if (mode == 1073741824) {
            return i;
        }
        String str = f19642p0;
        C4308b.m12139r(str, "Unknown measure mode: " + mode);
        return -1;
    }

    /* renamed from: L */
    private boolean m25336L(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i = this.f19702w - ((this.f19703x + finalY) % this.f19701v);
        if (i == 0) {
            return false;
        }
        int abs = Math.abs(i);
        int i2 = this.f19701v;
        if (abs > i2 / 2) {
            i = i > 0 ? i - i2 : i + i2;
        }
        scrollBy(0, finalY + i);
        return true;
    }

    /* renamed from: M */
    private void m25337M(int i, int i2) {
        this.f19692n0.play(this.f19694o0, 1.0f, 1.0f, 0, 0, 1.0f);
        C10469i iVar = this.f19691n;
        if (iVar != null) {
            iVar.mo32336a(this, i, this.f19689m);
        }
    }

    /* renamed from: N */
    private void m25338N(int i) {
        if (this.f19660S != i) {
            this.f19660S = i;
            C10468h hVar = this.f19693o;
            if (hVar != null) {
                hVar.mo33057a(this, i);
            }
        }
    }

    /* renamed from: O */
    private void m25339O(Scroller scroller) {
        if (scroller == this.f19704y) {
            if (!m25377z()) {
                m25350Z();
            }
            m25338N(0);
        } else if (this.f19660S != 1) {
            m25350Z();
        }
    }

    /* renamed from: P */
    private void m25340P() {
        C10464d dVar = this.f19649H;
        if (dVar == null) {
            this.f19649H = new C10464d();
        } else {
            removeCallbacks(dVar);
        }
        postDelayed(this.f19649H, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: Q */
    private void m25341Q(boolean z, long j) {
        C10465e eVar = this.f19648G;
        if (eVar == null) {
            this.f19648G = new C10465e();
        } else {
            removeCallbacks(eVar);
        }
        this.f19648G.m25391c(z);
        postDelayed(this.f19648G, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m25342R(int i, int i2) {
        C10471k kVar = this.f19647B;
        if (kVar == null) {
            this.f19647B = new C10471k();
        } else {
            removeCallbacks(kVar);
        }
        int unused = this.f19647B.f19721a = i;
        int unused2 = this.f19647B.f19722b = i2;
        post(this.f19647B);
    }

    /* renamed from: S */
    private void m25343S() {
        m25334J();
        invalidate();
    }

    /* renamed from: T */
    private void m25344T() {
        C10465e eVar = this.f19648G;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
        C10471k kVar = this.f19647B;
        if (kVar != null) {
            removeCallbacks(kVar);
        }
        C10464d dVar = this.f19649H;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f19674e0.mo33060d();
    }

    /* renamed from: U */
    private void m25345U() {
        C10464d dVar = this.f19649H;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
    }

    /* renamed from: V */
    private void m25346V() {
        C10465e eVar = this.f19648G;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
    }

    /* renamed from: W */
    private int m25347W(int i, int i2, int i3) {
        return i != -1 ? LinearLayout.resolveSizeAndState(Math.max(i, i2), i3, 0) : i2;
    }

    /* renamed from: X */
    private void m25348X(int i, boolean z) {
        if (this.f19689m != i) {
            int F = this.f19657P ? m25330F(i) : Math.min(Math.max(i, this.f19685k), this.f19687l);
            int i2 = this.f19689m;
            this.f19689m = F;
            m25350Z();
            if (z) {
                m25337M(i2, F);
            }
            m25334J();
            invalidate();
        }
    }

    /* renamed from: Y */
    private void m25349Y() {
        if (this.f19677g) {
            float f = -1.0f;
            this.f19699t.setTextSize((float) this.f19682i0);
            String[] strArr = this.f19683j;
            int i = 0;
            if (strArr == null) {
                float f2 = 0.0f;
                while (i < 9) {
                    float measureText = this.f19699t.measureText(String.valueOf(i));
                    if (measureText > f2) {
                        f2 = measureText;
                    }
                    i++;
                }
                f = (float) ((int) (((float) m25326B(this.f19687l).length()) * f2));
            } else {
                int length = strArr.length;
                while (i < length) {
                    float measureText2 = this.f19699t.measureText(strArr[i]);
                    if (measureText2 > f) {
                        f = measureText2;
                    }
                    i++;
                }
            }
            this.f19680h0 = f;
            float paddingLeft = f + ((float) (this.f19665a.getPaddingLeft() + this.f19665a.getPaddingRight())) + ((float) getPaddingLeft()) + ((float) getPaddingRight());
            if (((float) this.f19675f) != paddingLeft) {
                int i2 = this.f19673e;
                if (paddingLeft > ((float) i2)) {
                    this.f19675f = (int) paddingLeft;
                } else {
                    this.f19675f = i2;
                }
            }
        }
    }

    /* renamed from: Z */
    private boolean m25350Z() {
        String[] strArr = this.f19683j;
        String B = strArr == null ? m25326B(this.f19689m) : strArr[this.f19689m - this.f19685k];
        if (TextUtils.isEmpty(B) || B.equals(this.f19665a.getText().toString())) {
            return false;
        }
        this.f19665a.setText(B);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m25352a0(View view) {
        String valueOf = String.valueOf(((TextView) view).getText());
        if (TextUtils.isEmpty(valueOf)) {
            m25350Z();
        } else {
            m25348X(m25328D(valueOf), true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m25374w(boolean z) {
        if (this.f19658Q) {
            this.f19665a.setVisibility(4);
            if (!m25336L(this.f19704y)) {
                m25336L(this.f19705z);
            }
            this.f19646A = 0;
            if (z) {
                this.f19704y.startScroll(0, 0, 0, -this.f19701v, 300);
            } else {
                this.f19704y.startScroll(0, 0, 0, this.f19701v, 300);
            }
            invalidate();
            return;
        }
        m25348X(z ? this.f19689m + 1 : this.f19689m - 1, true);
    }

    /* renamed from: x */
    private void m25375x(int[] iArr) {
        System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
        int i = iArr[1] - 1;
        if (this.f19657P && i < this.f19685k) {
            i = this.f19687l;
        }
        iArr[0] = i;
        m25376y(i);
    }

    /* renamed from: y */
    private void m25376y(int i) {
        String str;
        SparseArray<String> sparseArray = this.f19697r;
        if (sparseArray.get(i) == null) {
            int i2 = this.f19685k;
            if (i < i2 || i > this.f19687l) {
                str = "";
            } else {
                String[] strArr = this.f19683j;
                str = strArr != null ? strArr[i - i2] : m25326B(i);
            }
            sparseArray.put(i, str);
        }
    }

    /* renamed from: z */
    private boolean m25377z() {
        int i = this.f19702w - this.f19703x;
        if (i == 0) {
            return false;
        }
        this.f19646A = 0;
        int abs = Math.abs(i);
        int i2 = this.f19701v;
        if (abs > i2 / 2) {
            if (i > 0) {
                i2 = -i2;
            }
            i += i2;
        }
        this.f19705z.startScroll(0, 0, 0, i, 800);
        invalidate();
        return true;
    }

    public void computeScroll() {
        Scroller scroller = this.f19704y;
        if (scroller.isFinished()) {
            scroller = this.f19705z;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (this.f19646A == 0) {
            this.f19646A = scroller.getStartY();
        }
        scrollBy(0, currY - this.f19646A);
        this.f19646A = currY;
        if (scroller.isFinished()) {
            m25339O(scroller);
        } else {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f19658Q) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            return false;
        }
        int y = (int) motionEvent.getY();
        int i = y < this.f19663V ? 3 : y > this.f19664W ? 1 : 2;
        int actionMasked = motionEvent.getActionMasked();
        C10463c cVar = (C10463c) getAccessibilityNodeProvider();
        if (actionMasked == 7) {
            int i2 = this.f19666a0;
            if (i2 == i || i2 == -1) {
                return false;
            }
            cVar.mo33050k(i2, 256);
        } else if (actionMasked != 9) {
            if (actionMasked != 10) {
                return false;
            }
            cVar.mo33050k(i, 256);
            this.f19666a0 = -1;
            return false;
        }
        cVar.mo33050k(i, 128);
        this.f19666a0 = i;
        cVar.performAction(i, 64, (Bundle) null);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        requestFocus();
        r5.f19676f0 = r0;
        m25344T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r5.f19704y.isFinished() == false) goto L_0x0064;
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
        m25374w(r6);
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
            r5.m25344T()
            goto L_0x0065
        L_0x0019:
            boolean r1 = r5.f19658Q
            if (r1 != 0) goto L_0x001e
            goto L_0x0065
        L_0x001e:
            int r1 = r6.getAction()
            r3 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r3) goto L_0x0028
            goto L_0x0065
        L_0x0028:
            int r1 = r5.f19676f0
            if (r1 != r0) goto L_0x0065
            r6 = -1
            r5.f19676f0 = r6
            return r3
        L_0x0030:
            boolean r1 = r5.f19657P
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
            r5.f19676f0 = r0
            r5.m25344T()
            android.widget.Scroller r6 = r5.f19704y
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x0064
            if (r0 != r2) goto L_0x0060
            r6 = 1
            goto L_0x0061
        L_0x0060:
            r6 = 0
        L_0x0061:
            r5.m25374w(r6)
        L_0x0064:
            return r3
        L_0x0065:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.view.NumberPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            m25344T();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            m25344T();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (!this.f19658Q) {
            return super.getAccessibilityNodeProvider();
        }
        if (this.f19672d0 == null) {
            this.f19672d0 = new C10463c();
        }
        return this.f19672d0;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.f19683j;
    }

    public int getMaxValue() {
        return this.f19687l;
    }

    public int getMinValue() {
        return this.f19685k;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public int getValue() {
        return this.f19689m;
    }

    public boolean getWrapSelectorWheel() {
        return this.f19657P;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m25344T();
        this.f19692n0.release();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (!this.f19658Q) {
            super.onDraw(canvas);
            return;
        }
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float right = (float) ((((getRight() - getLeft()) + paddingLeft) - paddingRight) / 2);
        float f = (float) this.f19703x;
        Drawable drawable = this.f19700u;
        boolean z = false;
        if (drawable != null && this.f19660S == 0) {
            if (this.f19670c0) {
                drawable.setState(f19644r0);
                this.f19700u.setBounds(paddingLeft, 0, width - paddingRight, this.f19663V);
                this.f19700u.draw(canvas2);
            }
            if (this.f19668b0) {
                this.f19700u.setState(f19644r0);
                this.f19700u.setBounds(paddingLeft, this.f19664W, width - paddingRight, getBottom());
                this.f19700u.draw(canvas2);
            }
        }
        float f2 = (float) (this.f19702w + (this.f19701v * 2));
        SparseArray<String> sparseArray = this.f19697r;
        int[] iArr = this.f19698s;
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            String str = sparseArray.get(iArr[i]);
            float abs = Math.abs(f2 - f) / ((float) this.f19701v);
            float E = m25329E(abs, this.f19682i0, this.f19684j0);
            this.f19699t.setTextSize(E);
            this.f19699t.setColor(m25327C(abs, 2130706432, z));
            canvas2.drawText(str, right, ((E - ((float) this.f19684j0)) / 2.0f) + f, this.f19699t);
            if (abs < 1.0f) {
                this.f19699t.setColor(m25327C(abs, ContextCompat.getColor(getContext(), R$color.class_text_14), true));
                canvas2.drawText(str, right, ((E - ((float) this.f19684j0)) / 2.0f) + f, this.f19699t);
            }
            f += (float) this.f19701v;
            i++;
            z = false;
        }
        if (!TextUtils.isEmpty(this.f19690m0)) {
            canvas2.drawText(this.f19690m0.toString(), right + (this.f19680h0 / 2.0f), f2 + ((float) ((this.f19682i0 - this.f19684j0) / 2)) + this.f19688l0 + ((float) this.f19686k0), this.f19678g0);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(NumberPicker.class.getName());
        accessibilityEvent.setScrollable(true);
        accessibilityEvent.setScrollY((this.f19685k + this.f19689m) * this.f19701v);
        accessibilityEvent.setMaxScrollY((this.f19687l - this.f19685k) * this.f19701v);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f19658Q || !isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        m25344T();
        this.f19665a.setVisibility(4);
        float y = motionEvent.getY();
        this.f19650I = y;
        this.f19652K = y;
        this.f19651J = motionEvent.getEventTime();
        this.f19661T = false;
        this.f19662U = false;
        float f = this.f19650I;
        if (f < ((float) this.f19663V)) {
            if (this.f19660S == 0) {
                this.f19674e0.mo33058b(2);
            }
        } else if (f > ((float) this.f19664W) && this.f19660S == 0) {
            this.f19674e0.mo33058b(1);
        }
        if (!this.f19704y.isFinished()) {
            this.f19704y.forceFinished(true);
            this.f19705z.forceFinished(true);
            m25338N(0);
        } else if (!this.f19705z.isFinished()) {
            this.f19704y.forceFinished(true);
            this.f19705z.forceFinished(true);
        } else {
            float f2 = this.f19650I;
            if (f2 < ((float) this.f19663V)) {
                m25341Q(false, (long) ViewConfiguration.getLongPressTimeout());
            } else if (f2 > ((float) this.f19664W)) {
                m25341Q(true, (long) ViewConfiguration.getLongPressTimeout());
            } else {
                this.f19662U = true;
                m25340P();
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.f19658Q) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f19665a.getMeasuredWidth();
        int measuredHeight2 = this.f19665a.getMeasuredHeight();
        int i5 = (measuredWidth - measuredWidth2) / 2;
        int i6 = (measuredHeight - measuredHeight2) / 2;
        this.f19665a.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
        if (z) {
            m25333I();
            m25332H();
            int height = getHeight();
            int i7 = this.f19667b;
            int i8 = this.f19659R;
            int i9 = ((height - i7) / 2) - i8;
            this.f19663V = i9;
            this.f19664W = i9 + (i8 * 2) + i7;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!this.f19658Q) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(m25335K(i, this.f19675f), m25335K(i2, this.f19671d));
        setMeasuredDimension(m25347W(this.f19673e, getMeasuredWidth(), i), m25347W(this.f19669c, getMeasuredHeight(), i2));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.f19658Q) {
            return false;
        }
        if (this.f19653L == null) {
            this.f19653L = VelocityTracker.obtain();
        }
        this.f19653L.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            m25345U();
            m25346V();
            this.f19674e0.mo33060d();
            VelocityTracker velocityTracker = this.f19653L;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f19656O);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.f19655N) {
                m25325A(yVelocity);
                m25338N(2);
            } else {
                int y = (int) motionEvent.getY();
                int abs = (int) Math.abs(((float) y) - this.f19650I);
                long eventTime = motionEvent.getEventTime() - this.f19651J;
                if (abs > this.f19654M || eventTime >= ((long) ViewConfiguration.getTapTimeout())) {
                    m25377z();
                } else if (this.f19662U) {
                    this.f19662U = false;
                } else {
                    int i = (y / this.f19701v) - 2;
                    if (i > 0) {
                        m25374w(true);
                        this.f19674e0.mo33059c(1);
                    } else if (i < 0) {
                        m25374w(false);
                        this.f19674e0.mo33059c(2);
                    }
                }
                m25338N(0);
            }
            this.f19653L.recycle();
            this.f19653L = null;
        } else if (actionMasked == 2 && !this.f19661T) {
            float y2 = motionEvent.getY();
            if (this.f19660S == 1) {
                scrollBy(0, (int) (y2 - this.f19652K));
                invalidate();
            } else if (((int) Math.abs(y2 - this.f19650I)) > this.f19654M) {
                m25344T();
                m25338N(1);
            }
            this.f19652K = y2;
        }
        return true;
    }

    public void scrollBy(int i, int i2) {
        int[] iArr = this.f19698s;
        if ((this.f19657P || i2 <= 0 || iArr[2] > this.f19685k) && (this.f19657P || i2 >= 0 || iArr[2] < this.f19687l)) {
            this.f19703x += i2;
            while (true) {
                int i3 = this.f19703x;
                if (i3 - this.f19702w <= this.f19681i) {
                    break;
                }
                this.f19703x = i3 - this.f19701v;
                m25375x(iArr);
                m25348X(iArr[2], true);
                if (!this.f19657P && iArr[2] <= this.f19685k) {
                    this.f19703x = this.f19702w;
                }
            }
            while (true) {
                int i4 = this.f19703x;
                if (i4 - this.f19702w < (-this.f19681i)) {
                    this.f19703x = i4 + this.f19701v;
                    m25331G(iArr);
                    m25348X(iArr[2], true);
                    if (!this.f19657P && iArr[2] >= this.f19687l) {
                        this.f19703x = this.f19702w;
                    }
                } else {
                    return;
                }
            }
        } else {
            this.f19703x = this.f19702w;
        }
    }

    public void setDisplayedValues(String[] strArr) {
        EditText editText;
        int i;
        if (this.f19683j != strArr) {
            this.f19683j = strArr;
            if (strArr != null) {
                editText = this.f19665a;
                i = ImageMetadata.LENS_FILTER_DENSITY;
            } else {
                editText = this.f19665a;
                i = 2;
            }
            editText.setRawInputType(i);
            m25350Z();
            m25334J();
            m25349Y();
        }
    }

    public void setFormatter(C10466f fVar) {
        if (fVar != this.f19695p) {
            this.f19695p = fVar;
            m25334J();
            m25350Z();
        }
    }

    public void setLabel(String str) {
        CharSequence charSequence;
        if ((this.f19690m0 == null && str != null) || ((charSequence = this.f19690m0) != null && !charSequence.equals(str))) {
            this.f19690m0 = str;
            invalidate();
        }
    }

    public void setMaxValue(int i) {
        if (this.f19687l != i) {
            if (i < 0) {
                C4308b.m12139r(f19642p0, "maxValue must be >= 0");
            }
            this.f19687l = i;
            if (i < this.f19689m) {
                this.f19689m = i;
            }
            setWrapSelectorWheel(this.f19687l - this.f19685k > this.f19698s.length);
            m25334J();
            m25350Z();
            m25349Y();
            invalidate();
        }
    }

    public void setMinValue(int i) {
        if (this.f19685k != i) {
            if (i < 0) {
                C4308b.m12139r(f19642p0, "minValue must be >= 0");
            }
            this.f19685k = i;
            if (i > this.f19689m) {
                this.f19689m = i;
            }
            setWrapSelectorWheel(this.f19687l - this.f19685k > this.f19698s.length);
            m25334J();
            m25350Z();
            m25349Y();
            invalidate();
        }
    }

    public void setOnLongPressUpdateInterval(long j) {
        this.f19696q = j;
    }

    public void setOnScrollListener(C10468h hVar) {
        this.f19693o = hVar;
    }

    public void setOnValueChangedListener(C10469i iVar) {
        this.f19691n = iVar;
    }

    public void setValue(int i) {
        m25348X(i, false);
    }

    public void setWrapSelectorWheel(boolean z) {
        boolean z2 = this.f19687l - this.f19685k >= this.f19698s.length;
        if ((!z || z2) && z != this.f19657P) {
            this.f19657P = z;
        }
        m25343S();
    }
}
