package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.xiaomi.mipush.sdk.Constants;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.google.android.gms.measurement.internal.c4 */
public final class C1574c4 extends C1654i6 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public char f1967c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f1968d = -1;
    @GuardedBy("this")

    /* renamed from: e */
    private String f1969e;

    /* renamed from: f */
    private final C1859z3 f1970f = new C1859z3(this, 6, false, false);

    /* renamed from: g */
    private final C1859z3 f1971g = new C1859z3(this, 6, true, false);

    /* renamed from: h */
    private final C1859z3 f1972h = new C1859z3(this, 6, false, true);

    /* renamed from: i */
    private final C1859z3 f1973i = new C1859z3(this, 5, false, false);

    /* renamed from: j */
    private final C1859z3 f1974j = new C1859z3(this, 5, true, false);

    /* renamed from: k */
    private final C1859z3 f1975k = new C1859z3(this, 5, false, true);

    /* renamed from: l */
    private final C1859z3 f1976l = new C1859z3(this, 4, false, false);

    /* renamed from: m */
    private final C1859z3 f1977m = new C1859z3(this, 3, false, false);

    /* renamed from: n */
    private final C1859z3 f1978n = new C1859z3(this, 2, false, false);

    C1574c4(C1717n5 n5Var) {
        super(n5Var);
    }

    /* renamed from: A */
    static String m4076A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String B = m4077B(z, obj);
        String B2 = m4077B(z, obj2);
        String B3 = m4077B(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb.append(str2);
            sb.append(B);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(B2)) {
            sb.append(str2);
            sb.append(B2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(B3)) {
            sb.append(str3);
            sb.append(B3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    /* renamed from: B */
    static String m4077B(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof C1548a4 ? ((C1548a4) obj).f1916a : z ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : obj.toString();
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String G = m4080G(C1717n5.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m4080G(className).equals(G)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb.toString();
        }
    }

    /* renamed from: G */
    private static String m4080G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: z */
    protected static Object m4083z(String str) {
        if (str == null) {
            return null;
        }
        return new C1548a4(str);
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    @VisibleForTesting
    /* renamed from: C */
    public final String mo14031C() {
        String str;
        synchronized (this) {
            if (this.f1969e == null) {
                this.f1969e = this.f2143a.mo14385Q() != null ? this.f2143a.mo14385Q() : this.f2143a.mo14402z().mo14182w();
            }
            C0917i.m1419j(this.f1969e);
            str = this.f1969e;
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo14032F(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(mo14031C(), i)) {
            Log.println(i, mo14031C(), m4076A(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C0917i.m1419j(str);
            C1679k5 G = this.f2143a.mo14376G();
            if (G == null) {
                Log.println(6, mo14031C(), "Scheduler not set. Not logging error/warn");
            } else if (!G.mo14244n()) {
                Log.println(6, mo14031C(), "Scheduler not initialized. Not logging error/warn");
            } else {
                G.mo14310z(new C1847y3(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo14033j() {
        return false;
    }

    /* renamed from: q */
    public final C1859z3 mo14034q() {
        return this.f1977m;
    }

    /* renamed from: r */
    public final C1859z3 mo14035r() {
        return this.f1970f;
    }

    /* renamed from: s */
    public final C1859z3 mo14036s() {
        return this.f1972h;
    }

    /* renamed from: t */
    public final C1859z3 mo14037t() {
        return this.f1971g;
    }

    /* renamed from: u */
    public final C1859z3 mo14038u() {
        return this.f1976l;
    }

    /* renamed from: v */
    public final C1859z3 mo14039v() {
        return this.f1978n;
    }

    /* renamed from: w */
    public final C1859z3 mo14040w() {
        return this.f1973i;
    }

    /* renamed from: x */
    public final C1859z3 mo14041x() {
        return this.f1975k;
    }

    /* renamed from: y */
    public final C1859z3 mo14042y() {
        return this.f1974j;
    }
}
