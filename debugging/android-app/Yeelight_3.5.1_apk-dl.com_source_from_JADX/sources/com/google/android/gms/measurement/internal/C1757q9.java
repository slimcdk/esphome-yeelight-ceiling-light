package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.internal.measurement.zzcl;
import com.miot.common.device.parser.xml.DddTag;

/* renamed from: com.google.android.gms.measurement.internal.q9 */
public final class C1757q9 {

    /* renamed from: a */
    private final Context f2543a;

    public C1757q9(Context context) {
        C0917i.m1419j(context);
        this.f2543a = context;
    }

    /* renamed from: k */
    private final C1574c4 m4574k() {
        return C1717n5.m4485H(this.f2543a, (zzcl) null, (Long) null).mo14228b();
    }

    @MainThread
    /* renamed from: a */
    public final int mo14432a(Intent intent, int i, int i2) {
        C1717n5 H = C1717n5.m4485H(this.f2543a, (zzcl) null, (Long) null);
        C1574c4 b = H.mo14228b();
        if (intent == null) {
            b.mo14040w().mo14693a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.mo14230d();
        b.mo14039v().mo14695c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            mo14439h(new C1721n9(this, i2, b, intent));
        }
        return 2;
    }

    @MainThread
    /* renamed from: b */
    public final IBinder mo14433b(Intent intent) {
        if (intent == null) {
            m4574k().mo14035r().mo14693a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C1628g6(C1770ra.m4630e0(this.f2543a), (String) null);
        }
        m4574k().mo14040w().mo14694b("onBind received unknown action", action);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo14434c(int i, C1574c4 c4Var, Intent intent) {
        if (((C1745p9) this.f2543a).mo13979k(i)) {
            c4Var.mo14039v().mo14694b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m4574k().mo14039v().mo14693a("Completed wakeful intent.");
            ((C1745p9) this.f2543a).mo13977a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo14435d(C1574c4 c4Var, JobParameters jobParameters) {
        c4Var.mo14039v().mo14693a("AppMeasurementJobService processed last upload request.");
        ((C1745p9) this.f2543a).mo13978b(jobParameters, false);
    }

    @MainThread
    /* renamed from: e */
    public final void mo14436e() {
        C1717n5 H = C1717n5.m4485H(this.f2543a, (zzcl) null, (Long) null);
        C1574c4 b = H.mo14228b();
        H.mo14230d();
        b.mo14039v().mo14693a("Local AppMeasurementService is starting up");
    }

    @MainThread
    /* renamed from: f */
    public final void mo14437f() {
        C1717n5 H = C1717n5.m4485H(this.f2543a, (zzcl) null, (Long) null);
        C1574c4 b = H.mo14228b();
        H.mo14230d();
        b.mo14039v().mo14693a("Local AppMeasurementService is shutting down");
    }

    @MainThread
    /* renamed from: g */
    public final void mo14438g(Intent intent) {
        if (intent == null) {
            m4574k().mo14035r().mo14693a("onRebind called with null intent");
            return;
        }
        m4574k().mo14039v().mo14694b("onRebind called. action", intent.getAction());
    }

    /* renamed from: h */
    public final void mo14439h(Runnable runnable) {
        C1770ra e0 = C1770ra.m4630e0(this.f2543a);
        e0.mo14227a().mo14310z(new C1733o9(this, e0, runnable));
    }

    @TargetApi(24)
    @MainThread
    /* renamed from: i */
    public final boolean mo14440i(JobParameters jobParameters) {
        C1717n5 H = C1717n5.m4485H(this.f2543a, (zzcl) null, (Long) null);
        C1574c4 b = H.mo14228b();
        String string = jobParameters.getExtras().getString(DddTag.ACTION);
        H.mo14230d();
        b.mo14039v().mo14694b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        mo14439h(new C1709m9(this, b, jobParameters));
        return true;
    }

    @MainThread
    /* renamed from: j */
    public final boolean mo14441j(Intent intent) {
        if (intent == null) {
            m4574k().mo14035r().mo14693a("onUnbind called with null intent");
            return true;
        }
        m4574k().mo14039v().mo14694b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
