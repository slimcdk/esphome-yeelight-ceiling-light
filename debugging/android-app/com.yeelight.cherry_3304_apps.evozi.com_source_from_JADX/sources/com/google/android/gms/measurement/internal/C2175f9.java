package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1770e9;

/* renamed from: com.google.android.gms.measurement.internal.f9 */
final class C2175f9 {

    /* renamed from: a */
    final /* synthetic */ C2366w8 f4124a;

    C2175f9(C2366w8 w8Var) {
        this.f4124a = w8Var;
    }

    @WorkerThread
    @VisibleForTesting
    /* renamed from: c */
    private final void m7018c(long j, boolean z) {
        this.f4124a.mo12567h();
        if (this.f4124a.f4689a.mo12436p()) {
            this.f4124a.mo13111l().f4239v.mo12850b(j);
            this.f4124a.mo12427b().mo13104O().mo13131b("Session started, time", Long.valueOf(this.f4124a.mo12429f().mo11379b()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f4124a.mo12570p().mo12712V("auto", "_sid", valueOf, j);
            this.f4124a.mo13111l().f4235r.mo12795a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f4124a.mo13112m().mo12474s(C2302r.f4536r0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f4124a.mo12570p().mo12707P("auto", "_s", j, bundle);
            if (C1770e9.m5039a() && this.f4124a.mo13112m().mo12474s(C2302r.f4546w0)) {
                String a = this.f4124a.mo13111l().f4216A.mo12869a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f4124a.mo12570p().mo12707P("auto", "_ssr", j, bundle2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo12662a() {
        this.f4124a.mo12567h();
        if (this.f4124a.mo13111l().mo12766v(this.f4124a.mo12429f().mo11378a())) {
            this.f4124a.mo13111l().f4235r.mo12795a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f4124a.mo12427b().mo13104O().mo13130a("Detected application was in foreground");
                m7018c(this.f4124a.mo12429f().mo11378a(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo12663b(long j, boolean z) {
        this.f4124a.mo12567h();
        this.f4124a.m7730F();
        if (this.f4124a.mo13111l().mo12766v(j)) {
            this.f4124a.mo13111l().f4235r.mo12795a(true);
        }
        this.f4124a.mo13111l().f4239v.mo12850b(j);
        if (this.f4124a.mo13111l().f4235r.mo12796b()) {
            m7018c(j, z);
        }
    }
}
