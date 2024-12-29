package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.C0956a;
import com.google.android.gms.internal.measurement.C1294s0;
import com.google.android.gms.internal.measurement.C1366wb;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.google.android.gms.measurement.internal.s4 */
final class C1776s4 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1294s0 f2652a;

    /* renamed from: b */
    final /* synthetic */ ServiceConnection f2653b;

    /* renamed from: c */
    final /* synthetic */ C1788t4 f2654c;

    C1776s4(C1788t4 t4Var, C1294s0 s0Var, ServiceConnection serviceConnection) {
        this.f2654c = t4Var;
        this.f2652a = s0Var;
        this.f2653b = serviceConnection;
    }

    public final void run() {
        Bundle bundle;
        C1859z3 r;
        String str;
        C1788t4 t4Var = this.f2654c;
        C1800u4 u4Var = t4Var.f2672b;
        String a = t4Var.f2671a;
        C1294s0 s0Var = this.f2652a;
        ServiceConnection serviceConnection = this.f2653b;
        u4Var.f2703a.mo14227a().mo14009h();
        Bundle bundle2 = new Bundle();
        bundle2.putString(Constants.PACKAGE_NAME, a);
        try {
            bundle = s0Var.mo13075a(bundle2);
            if (bundle == null) {
                u4Var.f2703a.mo14228b().mo14035r().mo14693a("Install Referrer Service returned a null response");
                bundle = null;
            }
        } catch (Exception e) {
            u4Var.f2703a.mo14228b().mo14035r().mo14694b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        u4Var.f2703a.mo14227a().mo14009h();
        C1717n5.m4487t();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                r = u4Var.f2703a.mo14228b().mo14040w();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    r = u4Var.f2703a.mo14228b().mo14035r();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    u4Var.f2703a.mo14228b().mo14039v().mo14694b("InstallReferrer API result", string);
                    C1854ya N = u4Var.f2703a.mo14382N();
                    Uri parse = Uri.parse("?".concat(string));
                    C1366wb.m3180b();
                    boolean B = u4Var.f2703a.mo14402z().mo14163B((String) null, C1727o3.f2466s0);
                    C1366wb.m3180b();
                    Bundle t0 = N.mo14682t0(parse, B, u4Var.f2703a.mo14402z().mo14163B((String) null, C1727o3.f2472v0));
                    if (t0 == null) {
                        r = u4Var.f2703a.mo14228b().mo14035r();
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = t0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                r = u4Var.f2703a.mo14228b().mo14035r();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                t0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == u4Var.f2703a.mo14375F().f2564f.mo14368a()) {
                            u4Var.f2703a.mo14228b().mo14039v().mo14693a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (u4Var.f2703a.mo14395o()) {
                            u4Var.f2703a.mo14375F().f2564f.mo14369b(j);
                            u4Var.f2703a.mo14228b().mo14039v().mo14694b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            t0.putString("_cis", "referrer API v2");
                            u4Var.f2703a.mo14377I().mo14569u("auto", "_cmp", t0, a);
                        }
                    }
                }
            }
            r.mo14693a(str);
        }
        C0956a.m1580b().mo12424c(u4Var.f2703a.mo14231f(), serviceConnection);
    }
}
