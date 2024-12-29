package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.C1640a;
import com.google.android.gms.internal.measurement.C1778f2;
import com.google.android.gms.internal.measurement.C1944p9;

/* renamed from: com.google.android.gms.measurement.internal.u4 */
final class C2340u4 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1778f2 f4638a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnection f4639b;

    /* renamed from: c */
    private final /* synthetic */ C2307r4 f4640c;

    C2340u4(C2307r4 r4Var, C1778f2 f2Var, ServiceConnection serviceConnection) {
        this.f4640c = r4Var;
        this.f4638a = f2Var;
        this.f4639b = serviceConnection;
    }

    public final void run() {
        C2383y3 F;
        String str;
        C2307r4 r4Var = this.f4640c;
        C2318s4 s4Var = r4Var.f4557b;
        String a = r4Var.f4556a;
        C1778f2 f2Var = this.f4638a;
        ServiceConnection serviceConnection = this.f4639b;
        Bundle a2 = s4Var.mo12938a(a, f2Var);
        s4Var.f4578a.mo12426a().mo12567h();
        if (a2 != null) {
            long j = a2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                F = s4Var.f4578a.mo12427b().mo13096F();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = a2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    F = s4Var.f4578a.mo12427b().mo13096F();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    s4Var.f4578a.mo12427b().mo13104O().mo13131b("InstallReferrer API result", string);
                    C2323s9 G = s4Var.f4578a.mo12412G();
                    String valueOf = String.valueOf(string);
                    Bundle z = G.mo12979z(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (z == null) {
                        F = s4Var.f4578a.mo12427b().mo13096F();
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = z.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                F = s4Var.f4578a.mo12427b().mo13096F();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                z.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == s4Var.f4578a.mo12406A().f4228k.mo12849a()) {
                            s4Var.f4578a.mo12414I();
                            F = s4Var.f4578a.mo12427b().mo13104O();
                            str = "Install Referrer campaign has already been logged";
                        } else if (!C1944p9.m5815a() || !s4Var.f4578a.mo12443x().mo12474s(C2302r.f4462C0) || s4Var.f4578a.mo12436p()) {
                            s4Var.f4578a.mo12406A().f4228k.mo12850b(j);
                            s4Var.f4578a.mo12414I();
                            s4Var.f4578a.mo12427b().mo13104O().mo13131b("Logging Install Referrer campaign from sdk with ", "referrer API");
                            z.putString("_cis", "referrer API");
                            s4Var.f4578a.mo12411F().mo12709S("auto", "_cmp", z);
                        }
                    }
                }
            }
            F.mo13130a(str);
        }
        if (serviceConnection != null) {
            C1640a.m4551b().mo11371c(s4Var.f4578a.mo12428c(), serviceConnection);
        }
    }
}
