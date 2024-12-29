package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.measurement.internal.C2333t8;
import com.miot.common.device.parser.xml.DddTag;

/* renamed from: com.google.android.gms.measurement.internal.p8 */
public final class C2289p8<T extends Context & C2333t8> {

    /* renamed from: a */
    private final T f4439a;

    public C2289p8(T t) {
        C1609u.m4475k(t);
        this.f4439a = t;
    }

    /* renamed from: f */
    private final void m7327f(Runnable runnable) {
        C2245l9 g = C2245l9.m7229g(this.f4439a);
        g.mo12426a().mo13122y(new C2344u8(this, g, runnable));
    }

    /* renamed from: j */
    private final C2361w3 m7328j() {
        return C2111a5.m6707d(this.f4439a, (zzaa) null, (Long) null).mo12427b();
    }

    @MainThread
    /* renamed from: a */
    public final int mo12874a(Intent intent, int i, int i2) {
        C2111a5 d = C2111a5.m6707d(this.f4439a, (zzaa) null, (Long) null);
        C2361w3 b = d.mo12427b();
        if (intent == null) {
            b.mo13099J().mo13130a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        d.mo12414I();
        b.mo13104O().mo13132c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m7327f(new C2322s8(this, i2, b, intent));
        }
        return 2;
    }

    @MainThread
    /* renamed from: b */
    public final IBinder mo12875b(Intent intent) {
        if (intent == null) {
            m7328j().mo13096F().mo13130a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C2183g5(C2245l9.m7229g(this.f4439a));
        }
        m7328j().mo13099J().mo13131b("onBind received unknown action", action);
        return null;
    }

    @MainThread
    /* renamed from: c */
    public final void mo12876c() {
        C2111a5 d = C2111a5.m6707d(this.f4439a, (zzaa) null, (Long) null);
        C2361w3 b = d.mo12427b();
        d.mo12414I();
        b.mo13104O().mo13130a("Local AppMeasurementService is starting up");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo12877d(int i, C2361w3 w3Var, Intent intent) {
        if (((C2333t8) this.f4439a).mo12383a(i)) {
            w3Var.mo13104O().mo13131b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m7328j().mo13104O().mo13130a("Completed wakeful intent.");
            ((C2333t8) this.f4439a).mo12384b(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo12878e(C2361w3 w3Var, JobParameters jobParameters) {
        w3Var.mo13104O().mo13130a("AppMeasurementJobService processed last upload request.");
        ((C2333t8) this.f4439a).mo12385c(jobParameters, false);
    }

    @TargetApi(24)
    @MainThread
    /* renamed from: g */
    public final boolean mo12879g(JobParameters jobParameters) {
        C2111a5 d = C2111a5.m6707d(this.f4439a, (zzaa) null, (Long) null);
        C2361w3 b = d.mo12427b();
        String string = jobParameters.getExtras().getString(DddTag.ACTION);
        d.mo12414I();
        b.mo13104O().mo13131b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m7327f(new C2311r8(this, b, jobParameters));
        return true;
    }

    @MainThread
    /* renamed from: h */
    public final void mo12880h() {
        C2111a5 d = C2111a5.m6707d(this.f4439a, (zzaa) null, (Long) null);
        C2361w3 b = d.mo12427b();
        d.mo12414I();
        b.mo13104O().mo13130a("Local AppMeasurementService is shutting down");
    }

    @MainThread
    /* renamed from: i */
    public final boolean mo12881i(Intent intent) {
        if (intent == null) {
            m7328j().mo13096F().mo13130a("onUnbind called with null intent");
            return true;
        }
        m7328j().mo13104O().mo13131b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @MainThread
    /* renamed from: k */
    public final void mo12882k(Intent intent) {
        if (intent == null) {
            m7328j().mo13096F().mo13130a("onRebind called with null intent");
            return;
        }
        m7328j().mo13104O().mo13131b("onRebind called. action", intent.getAction());
    }
}
