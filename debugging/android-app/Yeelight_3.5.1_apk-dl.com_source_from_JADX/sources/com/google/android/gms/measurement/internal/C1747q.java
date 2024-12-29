package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0917i;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.q */
public final class C1747q {

    /* renamed from: a */
    final String f2520a;

    /* renamed from: b */
    final String f2521b;

    /* renamed from: c */
    final String f2522c;

    /* renamed from: d */
    final long f2523d;

    /* renamed from: e */
    final long f2524e;

    /* renamed from: f */
    final zzau f2525f;

    C1747q(C1717n5 n5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzau zzau;
        C0917i.m1415f(str2);
        C0917i.m1415f(str3);
        this.f2520a = str2;
        this.f2521b = str3;
        this.f2522c = true == TextUtils.isEmpty(str) ? null : str;
        this.f2523d = j;
        this.f2524e = j2;
        if (j2 != 0 && j2 > j) {
            n5Var.mo14228b().mo14040w().mo14694b("Event created with reverse previous/current timestamps. appId", C1574c4.m4083z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzau = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    n5Var.mo14228b().mo14035r().mo14693a("Param name can't be null");
                } else {
                    Object o = n5Var.mo14382N().mo14673o(str4, bundle2.get(str4));
                    if (o == null) {
                        n5Var.mo14228b().mo14040w().mo14694b("Param value can't be null", n5Var.mo14373D().mo14618e(str4));
                    } else {
                        n5Var.mo14382N().mo14646C(bundle2, str4, o);
                    }
                }
                it.remove();
            }
            zzau = new zzau(bundle2);
        }
        this.f2525f = zzau;
    }

    private C1747q(C1717n5 n5Var, String str, String str2, String str3, long j, long j2, zzau zzau) {
        C0917i.m1415f(str2);
        C0917i.m1415f(str3);
        C0917i.m1419j(zzau);
        this.f2520a = str2;
        this.f2521b = str3;
        this.f2522c = true == TextUtils.isEmpty(str) ? null : str;
        this.f2523d = j;
        this.f2524e = j2;
        if (j2 != 0 && j2 > j) {
            n5Var.mo14228b().mo14040w().mo14695c("Event created with reverse previous/current timestamps. appId, name", C1574c4.m4083z(str2), C1574c4.m4083z(str3));
        }
        this.f2525f = zzau;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1747q mo14424a(C1717n5 n5Var, long j) {
        return new C1747q(n5Var, this.f2522c, this.f2520a, this.f2521b, this.f2523d, j, this.f2525f);
    }

    public final String toString() {
        String str = this.f2520a;
        String str2 = this.f2521b;
        String obj = this.f2525f.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + obj + "}";
    }
}
