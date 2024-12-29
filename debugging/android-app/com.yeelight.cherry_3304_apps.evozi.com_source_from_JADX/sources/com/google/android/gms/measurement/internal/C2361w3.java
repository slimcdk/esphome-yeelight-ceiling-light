package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.google.android.gms.measurement.internal.w3 */
public final class C2361w3 extends C2352v5 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public char f4677c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f4678d = -1;
    @GuardedBy("this")

    /* renamed from: e */
    private String f4679e;

    /* renamed from: f */
    private final C2383y3 f4680f = new C2383y3(this, 6, false, false);

    /* renamed from: g */
    private final C2383y3 f4681g = new C2383y3(this, 6, true, false);

    /* renamed from: h */
    private final C2383y3 f4682h = new C2383y3(this, 6, false, true);

    /* renamed from: i */
    private final C2383y3 f4683i = new C2383y3(this, 5, false, false);

    /* renamed from: j */
    private final C2383y3 f4684j = new C2383y3(this, 5, true, false);

    /* renamed from: k */
    private final C2383y3 f4685k = new C2383y3(this, 5, false, true);

    /* renamed from: l */
    private final C2383y3 f4686l = new C2383y3(this, 4, false, false);

    /* renamed from: m */
    private final C2383y3 f4687m = new C2383y3(this, 3, false, false);

    /* renamed from: n */
    private final C2383y3 f4688n = new C2383y3(this, 2, false, false);

    C2361w3(C2111a5 a5Var) {
        super(a5Var);
    }

    @VisibleForTesting
    /* renamed from: C */
    private final String m7690C() {
        String str;
        String str2;
        synchronized (this) {
            if (this.f4679e == null) {
                if (this.f4689a.mo12419N() != null) {
                    str2 = this.f4689a.mo12419N();
                } else {
                    mo13112m().mo12414I();
                    str2 = "FA";
                }
                this.f4679e = str2;
            }
            str = this.f4679e;
        }
        return str;
    }

    /* renamed from: E */
    private static String m7692E(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: w */
    protected static Object m7696w(String str) {
        if (str == null) {
            return null;
        }
        return new C2122b4(str);
    }

    @VisibleForTesting
    /* renamed from: x */
    private static String m7697x(boolean z, Object obj) {
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
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof C2122b4 ? ((C2122b4) obj).f3965a : z ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : String.valueOf(obj);
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String E = m7692E(C2111a5.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m7692E(className).equals(E)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb2.toString();
        }
    }

    /* renamed from: y */
    static String m7698y(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String x = m7697x(z, obj);
        String x2 = m7697x(z, obj2);
        String x3 = m7697x(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(x)) {
            sb.append(str2);
            sb.append(x);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(x2)) {
            sb.append(str2);
            sb.append(x2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(x3)) {
            sb.append(str3);
            sb.append(x3);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo13094A(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z && mo13095B(i)) {
            mo13106z(i, m7698y(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C1609u.m4475k(str);
            C2373x4 E = this.f4689a.mo12410E();
            if (E == null) {
                str2 = "Scheduler not set. Not logging error/warn";
            } else if (!E.mo13082s()) {
                str2 = "Scheduler not initialized. Not logging error/warn";
            } else {
                if (i < 0) {
                    i = 0;
                }
                E.mo13122y(new C2394z3(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
                return;
            }
            mo13106z(6, str2);
        }
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: B */
    public final boolean mo13095B(int i) {
        return Log.isLoggable(m7690C(), i);
    }

    /* renamed from: F */
    public final C2383y3 mo13096F() {
        return this.f4680f;
    }

    /* renamed from: G */
    public final C2383y3 mo13097G() {
        return this.f4681g;
    }

    /* renamed from: H */
    public final C2383y3 mo13098H() {
        return this.f4682h;
    }

    /* renamed from: J */
    public final C2383y3 mo13099J() {
        return this.f4683i;
    }

    /* renamed from: K */
    public final C2383y3 mo13100K() {
        return this.f4684j;
    }

    /* renamed from: L */
    public final C2383y3 mo13101L() {
        return this.f4685k;
    }

    /* renamed from: M */
    public final C2383y3 mo13102M() {
        return this.f4686l;
    }

    /* renamed from: N */
    public final C2383y3 mo13103N() {
        return this.f4687m;
    }

    /* renamed from: O */
    public final C2383y3 mo13104O() {
        return this.f4688n;
    }

    /* renamed from: P */
    public final String mo13105P() {
        Pair<String, Long> a = mo13111l().f4221d.mo12897a();
        if (a == null || a == C2218j4.f4215E) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(Constants.COLON_SEPARATOR);
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo12683r() {
        return false;
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: z */
    public final void mo13106z(int i, String str) {
        Log.println(i, m7690C(), str);
    }
}
