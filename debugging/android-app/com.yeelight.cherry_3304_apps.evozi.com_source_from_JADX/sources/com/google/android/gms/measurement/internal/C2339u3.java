package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.internal.measurement.C2065x8;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.u3 */
public final class C2339u3 extends C2352v5 {

    /* renamed from: c */
    private static final AtomicReference<String[]> f4635c = new AtomicReference<>();

    /* renamed from: d */
    private static final AtomicReference<String[]> f4636d = new AtomicReference<>();

    /* renamed from: e */
    private static final AtomicReference<String[]> f4637e = new AtomicReference<>();

    C2339u3(C2111a5 a5Var) {
        super(a5Var);
    }

    /* renamed from: A */
    private final boolean m7647A() {
        mo12414I();
        return this.f4689a.mo12416K() && this.f4689a.mo12427b().mo13095B(3);
    }

    @Nullable
    /* renamed from: w */
    private static String m7648w(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C1609u.m4475k(strArr);
        C1609u.m4475k(strArr2);
        C1609u.m4475k(atomicReference);
        C1609u.m4465a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C2323s9.m7583y0(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    @Nullable
    /* renamed from: x */
    private final String m7649x(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            String t = bundle instanceof Bundle ? mo12993t(bundle) : String.valueOf(bundle);
            if (t != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(t);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo12683r() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: t */
    public final String mo12993t(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m7647A()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo12996y(str));
            sb.append("=");
            if (!C2065x8.m6570a() || !mo13112m().mo12474s(C2302r.f4468F0)) {
                sb.append(bundle.get(str));
            } else {
                Object obj = bundle.get(str);
                sb.append(obj instanceof Bundle ? m7649x(new Object[]{obj}) : obj instanceof Object[] ? m7649x((Object[]) obj) : obj instanceof ArrayList ? m7649x(((ArrayList) obj).toArray()) : String.valueOf(obj));
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: u */
    public final String mo12994u(zzaq zzaq) {
        String str = null;
        if (zzaq == null) {
            return null;
        }
        if (!m7647A()) {
            return zzaq.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzaq.f4768c);
        sb.append(",name=");
        sb.append(mo12995v(zzaq.f4766a));
        sb.append(",params=");
        zzal zzal = zzaq.f4767b;
        if (zzal != null) {
            str = !m7647A() ? zzal.toString() : mo12993t(zzal.mo13151T());
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: v */
    public final String mo12995v(String str) {
        if (str == null) {
            return null;
        }
        return !m7647A() ? str : m7648w(str, C2112a6.f3944b, C2112a6.f3943a, f4635c);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: y */
    public final String mo12996y(String str) {
        if (str == null) {
            return null;
        }
        return !m7647A() ? str : m7648w(str, C2396z5.f4755b, C2396z5.f4754a, f4636d);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: z */
    public final String mo12997z(String str) {
        if (str == null) {
            return null;
        }
        if (!m7647A()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m7648w(str, C2136c6.f3998b, C2136c6.f3997a, f4637e);
        }
        return "experiment_id" + "(" + str + ")";
    }
}
