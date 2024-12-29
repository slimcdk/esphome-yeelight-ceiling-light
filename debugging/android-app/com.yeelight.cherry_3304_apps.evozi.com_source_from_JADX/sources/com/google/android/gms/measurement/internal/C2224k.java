package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1609u;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.k */
public final class C2224k {

    /* renamed from: a */
    final String f4253a;

    /* renamed from: b */
    final String f4254b;

    /* renamed from: c */
    private final String f4255c;

    /* renamed from: d */
    final long f4256d;

    /* renamed from: e */
    final long f4257e;

    /* renamed from: f */
    final zzal f4258f;

    C2224k(C2111a5 a5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzal zzal;
        C1609u.m4471g(str2);
        C1609u.m4471g(str3);
        this.f4253a = str2;
        this.f4254b = str3;
        this.f4255c = TextUtils.isEmpty(str) ? null : str;
        this.f4256d = j;
        this.f4257e = j2;
        if (j2 != 0 && j2 > j) {
            a5Var.mo12427b().mo13099J().mo13131b("Event created with reverse previous/current timestamps. appId", C2361w3.m7696w(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzal = new zzal(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    a5Var.mo12427b().mo13096F().mo13130a("Param name can't be null");
                } else {
                    Object F = a5Var.mo12412G().mo12949F(str4, bundle2.get(str4));
                    if (F == null) {
                        a5Var.mo12427b().mo13099J().mo13131b("Param value can't be null", a5Var.mo12413H().mo12996y(str4));
                    } else {
                        a5Var.mo12412G().mo12956M(bundle2, str4, F);
                    }
                }
                it.remove();
            }
            zzal = new zzal(bundle2);
        }
        this.f4258f = zzal;
    }

    private C2224k(C2111a5 a5Var, String str, String str2, String str3, long j, long j2, zzal zzal) {
        C1609u.m4471g(str2);
        C1609u.m4471g(str3);
        C1609u.m4475k(zzal);
        this.f4253a = str2;
        this.f4254b = str3;
        this.f4255c = TextUtils.isEmpty(str) ? null : str;
        this.f4256d = j;
        this.f4257e = j2;
        if (j2 != 0 && j2 > j) {
            a5Var.mo12427b().mo13099J().mo13132c("Event created with reverse previous/current timestamps. appId, name", C2361w3.m7696w(str2), C2361w3.m7696w(str3));
        }
        this.f4258f = zzal;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2224k mo12781a(C2111a5 a5Var, long j) {
        return new C2224k(a5Var, this.f4255c, this.f4253a, this.f4254b, this.f4256d, j, this.f4258f);
    }

    public final String toString() {
        String str = this.f4253a;
        String str2 = this.f4254b;
        String valueOf = String.valueOf(this.f4258f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
