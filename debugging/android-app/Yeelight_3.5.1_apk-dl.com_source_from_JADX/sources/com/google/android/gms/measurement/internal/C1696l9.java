package com.google.android.gms.measurement.internal;

import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.C1081eb;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p093s.C3676a;

/* renamed from: com.google.android.gms.measurement.internal.l9 */
public final class C1696l9 extends C1606ea {

    /* renamed from: d */
    private final Map f2279d = new HashMap();

    /* renamed from: e */
    private String f2280e;

    /* renamed from: f */
    private boolean f2281f;

    /* renamed from: g */
    private long f2282g;

    /* renamed from: h */
    public final C1716n4 f2283h;

    /* renamed from: i */
    public final C1716n4 f2284i;

    /* renamed from: j */
    public final C1716n4 f2285j;

    /* renamed from: k */
    public final C1716n4 f2286k;

    /* renamed from: l */
    public final C1716n4 f2287l;

    C1696l9(C1770ra raVar) {
        super(raVar);
        C1764r4 F = this.f2143a.mo14375F();
        F.getClass();
        this.f2283h = new C1716n4(F, "last_delete_stale", 0);
        C1764r4 F2 = this.f2143a.mo14375F();
        F2.getClass();
        this.f2284i = new C1716n4(F2, "backoff", 0);
        C1764r4 F3 = this.f2143a.mo14375F();
        F3.getClass();
        this.f2285j = new C1716n4(F3, "last_upload", 0);
        C1764r4 F4 = this.f2143a.mo14375F();
        F4.getClass();
        this.f2286k = new C1716n4(F4, "last_upload_attempt", 0);
        C1764r4 F5 = this.f2143a.mo14375F();
        F5.getClass();
        this.f2287l = new C1716n4(F5, "midnight_offset", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo14018l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @Deprecated
    /* renamed from: m */
    public final Pair mo14354m(String str) {
        C1683k9 k9Var;
        mo14009h();
        long b = this.f2143a.mo14229c().mo11030b();
        C1081eb.m1900b();
        if (this.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2460p0)) {
            C1683k9 k9Var2 = (C1683k9) this.f2279d.get(str);
            if (k9Var2 != null && b < k9Var2.f2240c) {
                return new Pair(k9Var2.f2238a, Boolean.valueOf(k9Var2.f2239b));
            }
            C3676a.m10513b(true);
            long r = b + this.f2143a.mo14402z().mo14177r(str, C1727o3.f2431b);
            try {
                C3676a.C3677a a = C3676a.m10512a(this.f2143a.mo14231f());
                if (a == null) {
                    return new Pair("", Boolean.FALSE);
                }
                String a2 = a.mo26085a();
                k9Var = a2 != null ? new C1683k9(a2, a.mo26086b(), r) : new C1683k9("", a.mo26086b(), r);
                this.f2279d.put(str, k9Var);
                C3676a.m10513b(false);
                return new Pair(k9Var.f2238a, Boolean.valueOf(k9Var.f2239b));
            } catch (Exception e) {
                this.f2143a.mo14228b().mo14034q().mo14694b("Unable to get advertising id", e);
                k9Var = new C1683k9("", false, r);
            }
        } else {
            String str2 = this.f2280e;
            if (str2 != null && b < this.f2282g) {
                return new Pair(str2, Boolean.valueOf(this.f2281f));
            }
            this.f2282g = b + this.f2143a.mo14402z().mo14177r(str, C1727o3.f2431b);
            C3676a.m10513b(true);
            try {
                C3676a.C3677a a3 = C3676a.m10512a(this.f2143a.mo14231f());
                if (a3 == null) {
                    return new Pair("", Boolean.FALSE);
                }
                this.f2280e = "";
                String a4 = a3.mo26085a();
                if (a4 != null) {
                    this.f2280e = a4;
                }
                this.f2281f = a3.mo26086b();
                C3676a.m10513b(false);
                return new Pair(this.f2280e, Boolean.valueOf(this.f2281f));
            } catch (Exception e2) {
                this.f2143a.mo14228b().mo14034q().mo14694b("Unable to get advertising id", e2);
                this.f2280e = "";
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: n */
    public final Pair mo14355n(String str, C1634h hVar) {
        return hVar.mo14221i(zzah.AD_STORAGE) ? mo14354m(str) : new Pair("", Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @Deprecated
    /* renamed from: o */
    public final String mo14356o(String str) {
        mo14009h();
        String str2 = (String) mo14354m(str).first;
        MessageDigest t = C1854ya.m4843t();
        if (t == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, t.digest(str2.getBytes()))});
    }
}
