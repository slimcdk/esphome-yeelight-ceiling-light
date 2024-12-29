package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1066dc;
import com.google.android.gms.internal.measurement.C1338ud;

/* renamed from: com.google.android.gms.measurement.internal.y9 */
final class C1853y9 {

    /* renamed from: a */
    final /* synthetic */ C1865z9 f2803a;

    C1853y9(C1865z9 z9Var) {
        this.f2803a = z9Var;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14641a() {
        this.f2803a.mo14009h();
        if (this.f2803a.f2143a.mo14375F().mo14452v(this.f2803a.f2143a.mo14229c().mo11029a())) {
            this.f2803a.f2143a.mo14375F().f2570l.mo14350a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f2803a.f2143a.mo14228b().mo14039v().mo14693a("Detected application was in foreground");
                mo14643c(this.f2803a.f2143a.mo14229c().mo11029a(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo14642b(long j, boolean z) {
        this.f2803a.mo14009h();
        this.f2803a.m4913s();
        if (this.f2803a.f2143a.mo14375F().mo14452v(j)) {
            this.f2803a.f2143a.mo14375F().f2570l.mo14350a(true);
            C1338ud.m3082b();
            if (this.f2803a.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2403G0)) {
                this.f2803a.f2143a.mo14371B().mo14511v();
            }
        }
        this.f2803a.f2143a.mo14375F().f2573o.mo14369b(j);
        if (this.f2803a.f2143a.mo14375F().f2570l.mo14351b()) {
            mo14643c(j, z);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: c */
    public final void mo14643c(long j, boolean z) {
        this.f2803a.mo14009h();
        if (this.f2803a.f2143a.mo14395o()) {
            this.f2803a.f2143a.mo14375F().f2573o.mo14369b(j);
            this.f2803a.f2143a.mo14228b().mo14039v().mo14694b("Session started, time", Long.valueOf(this.f2803a.f2143a.mo14229c().mo11030b()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f2803a.f2143a.mo14377I().mo14549O("auto", "_sid", valueOf, j);
            this.f2803a.f2143a.mo14375F().f2570l.mo14350a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f2803a.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2432b0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f2803a.f2143a.mo14377I().mo14571w("auto", "_s", j, bundle);
            C1066dc.m1863b();
            if (this.f2803a.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2438e0)) {
                String a = this.f2803a.f2143a.mo14375F().f2578t.mo14426a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f2803a.f2143a.mo14377I().mo14571w("auto", "_ssr", j, bundle2);
                }
            }
        }
    }
}
