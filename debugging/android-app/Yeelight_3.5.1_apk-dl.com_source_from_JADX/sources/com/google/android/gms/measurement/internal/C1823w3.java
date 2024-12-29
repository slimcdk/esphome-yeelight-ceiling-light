package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C0917i;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.w3 */
public final class C1823w3 {

    /* renamed from: b */
    protected static final AtomicReference f2739b = new AtomicReference();

    /* renamed from: c */
    protected static final AtomicReference f2740c = new AtomicReference();

    /* renamed from: d */
    protected static final AtomicReference f2741d = new AtomicReference();

    /* renamed from: a */
    private final C1811v3 f2742a;

    public C1823w3(C1811v3 v3Var) {
        this.f2742a = v3Var;
    }

    /* renamed from: g */
    private static final String m4804g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        C0917i.m1419j(strArr);
        C0917i.m1419j(strArr2);
        C0917i.m1419j(atomicReference);
        C0917i.m1410a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo14614a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            String b = bundle instanceof Bundle ? mo14615b(bundle) : String.valueOf(bundle);
            if (b != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(b);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo14615b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f2742a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo14618e(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? mo14614a(new Object[]{obj}) : obj instanceof Object[] ? mo14614a((Object[]) obj) : obj instanceof ArrayList ? mo14614a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo14616c(zzaw zzaw) {
        if (!this.f2742a.zza()) {
            return zzaw.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzaw.f2857c);
        sb.append(",name=");
        sb.append(mo14617d(zzaw.f2855a));
        sb.append(",params=");
        zzau zzau = zzaw.f2856b;
        sb.append(zzau == null ? null : !this.f2742a.zza() ? zzau.toString() : mo14615b(zzau.mo14704c0()));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo14617d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f2742a.zza() ? str : m4804g(str, C1693l6.f2271c, C1693l6.f2269a, f2739b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo14618e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f2742a.zza() ? str : m4804g(str, C1706m6.f2304b, C1706m6.f2303a, f2740c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo14619f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f2742a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m4804g(str, C1718n6.f2368b, C1718n6.f2367a, f2741d);
        }
        return "experiment_id(" + str + ")";
    }
}
