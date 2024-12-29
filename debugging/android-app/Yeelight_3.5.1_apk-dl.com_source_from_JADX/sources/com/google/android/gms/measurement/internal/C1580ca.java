package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.C1310t0;
import com.google.android.gms.internal.measurement.C1325u0;
import com.miot.common.device.parser.xml.DddTag;

/* renamed from: com.google.android.gms.measurement.internal.ca */
public final class C1580ca extends C1606ea {

    /* renamed from: d */
    private final AlarmManager f1991d = ((AlarmManager) this.f2143a.mo14231f().getSystemService(NotificationCompat.CATEGORY_ALARM));

    /* renamed from: e */
    private C1723o f1992e;

    /* renamed from: f */
    private Integer f1993f;

    protected C1580ca(C1770ra raVar) {
        super(raVar);
    }

    /* renamed from: o */
    private final int m4097o() {
        if (this.f1993f == null) {
            this.f1993f = Integer.valueOf("measurement".concat(String.valueOf(this.f2143a.mo14231f().getPackageName())).hashCode());
        }
        return this.f1993f.intValue();
    }

    /* renamed from: p */
    private final PendingIntent m4098p() {
        Context f = this.f2143a.mo14231f();
        return PendingIntent.getBroadcast(f, 0, new Intent().setClassName(f, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C1310t0.f1645a);
    }

    /* renamed from: q */
    private final C1723o m4099q() {
        if (this.f1992e == null) {
            this.f1992e = new C1567ba(this, this.f2045b.mo14471b0());
        }
        return this.f1992e;
    }

    @TargetApi(24)
    /* renamed from: r */
    private final void m4100r() {
        JobScheduler jobScheduler = (JobScheduler) this.f2143a.mo14231f().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m4097o());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo14018l() {
        AlarmManager alarmManager = this.f1991d;
        if (alarmManager != null) {
            alarmManager.cancel(m4098p());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m4100r();
        return false;
    }

    /* renamed from: m */
    public final void mo14047m() {
        mo14128i();
        this.f2143a.mo14228b().mo14039v().mo14693a("Unscheduling upload");
        AlarmManager alarmManager = this.f1991d;
        if (alarmManager != null) {
            alarmManager.cancel(m4098p());
        }
        m4099q().mo14406b();
        if (Build.VERSION.SDK_INT >= 24) {
            m4100r();
        }
    }

    /* renamed from: n */
    public final void mo14048n(long j) {
        mo14128i();
        this.f2143a.mo14230d();
        Context f = this.f2143a.mo14231f();
        if (!C1854ya.m4833Y(f)) {
            this.f2143a.mo14228b().mo14034q().mo14693a("Receiver not registered/enabled");
        }
        if (!C1854ya.m4834Z(f, false)) {
            this.f2143a.mo14228b().mo14034q().mo14693a("Service not registered/enabled");
        }
        mo14047m();
        this.f2143a.mo14228b().mo14039v().mo14694b("Scheduling upload, millis", Long.valueOf(j));
        long b = this.f2143a.mo14229c().mo11030b() + j;
        this.f2143a.mo14402z();
        if (j < Math.max(0, ((Long) C1727o3.f2475x.mo14366a((Object) null)).longValue()) && !m4099q().mo14408e()) {
            m4099q().mo14407d(j);
        }
        this.f2143a.mo14230d();
        if (Build.VERSION.SDK_INT >= 24) {
            Context f2 = this.f2143a.mo14231f();
            ComponentName componentName = new ComponentName(f2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int o = m4097o();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(DddTag.ACTION, "com.google.android.gms.measurement.UPLOAD");
            C1325u0.m3058a(f2, new JobInfo.Builder(o, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f1991d;
        if (alarmManager != null) {
            this.f2143a.mo14402z();
            alarmManager.setInexactRepeating(2, b, Math.max(((Long) C1727o3.f2465s.mo14366a((Object) null)).longValue(), j), m4098p());
        }
    }
}
