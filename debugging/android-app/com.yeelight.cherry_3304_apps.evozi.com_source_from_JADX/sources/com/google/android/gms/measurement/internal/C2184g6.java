package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1916na;

/* renamed from: com.google.android.gms.measurement.internal.g6 */
final /* synthetic */ class C2184g6 implements Runnable {

    /* renamed from: a */
    private final C2196h6 f4132a;

    /* renamed from: b */
    private final Bundle f4133b;

    C2184g6(C2196h6 h6Var, Bundle bundle) {
        this.f4132a = h6Var;
        this.f4133b = bundle;
    }

    public final void run() {
        C2196h6 h6Var = this.f4132a;
        Bundle bundle = this.f4133b;
        if (C1916na.m5614a() && h6Var.mo13112m().mo12474s(C2302r.f4486O0)) {
            if (bundle == null) {
                h6Var.mo13111l().f4219D.mo12859b(new Bundle());
                return;
            }
            Bundle a = h6Var.mo13111l().f4219D.mo12858a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    h6Var.mo13110k();
                    if (C2323s9.m7566a0(obj)) {
                        h6Var.mo13110k().mo12953J(27, (String) null, (String) null, 0);
                    }
                    h6Var.mo12427b().mo13101L().mo13132c("Invalid default event parameter type. Name, value", str, obj);
                } else if (C2323s9.m7550A0(str)) {
                    h6Var.mo12427b().mo13101L().mo13131b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    a.remove(str);
                } else if (h6Var.mo13110k().mo12969f0("param", str, 100, obj)) {
                    h6Var.mo13110k().mo12956M(a, str, obj);
                }
            }
            h6Var.mo13110k();
            if (C2323s9.m7564Y(a, h6Var.mo13112m().mo12481z())) {
                h6Var.mo13110k().mo12953J(26, (String) null, (String) null, 0);
                h6Var.mo12427b().mo13101L().mo13130a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            h6Var.mo13111l().f4219D.mo12859b(a);
        }
    }
}
