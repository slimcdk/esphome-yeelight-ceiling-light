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
import com.google.android.gms.internal.measurement.C1767e6;
import com.miot.common.device.parser.xml.DddTag;

/* renamed from: com.google.android.gms.measurement.internal.h9 */
public final class C2199h9 extends C2211i9 {

    /* renamed from: d */
    private final AlarmManager f4176d = ((AlarmManager) mo12428c().getSystemService(NotificationCompat.CATEGORY_ALARM));

    /* renamed from: e */
    private final C2213j f4177e;

    /* renamed from: f */
    private Integer f4178f;

    protected C2199h9(C2245l9 l9Var) {
        super(l9Var);
        this.f4177e = new C2187g9(this, l9Var.mo12829f0(), l9Var);
    }

    @TargetApi(24)
    /* renamed from: w */
    private final void m7122w() {
        ((JobScheduler) mo12428c().getSystemService("jobscheduler")).cancel(m7123x());
    }

    /* renamed from: x */
    private final int m7123x() {
        if (this.f4178f == null) {
            String valueOf = String.valueOf(mo12428c().getPackageName());
            this.f4178f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f4178f.intValue();
    }

    /* renamed from: y */
    private final PendingIntent m7124y() {
        Context c = mo12428c();
        return PendingIntent.getBroadcast(c, 0, new Intent().setClassName(c, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo12453t() {
        this.f4176d.cancel(m7124y());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m7122w();
        return false;
    }

    /* renamed from: u */
    public final void mo12737u(long j) {
        mo12749r();
        mo12414I();
        Context c = mo12428c();
        if (!C2329t4.m7638b(c)) {
            mo12427b().mo13103N().mo13130a("Receiver not registered/enabled");
        }
        if (!C2323s9.m7562W(c, false)) {
            mo12427b().mo13103N().mo13130a("Service not registered/enabled");
        }
        mo12738v();
        mo12427b().mo13104O().mo13131b("Scheduling upload, millis", Long.valueOf(j));
        long b = mo12429f().mo11379b() + j;
        if (j < Math.max(0, C2302r.f4547x.mo12867a(null).longValue()) && !this.f4177e.mo12752d()) {
            this.f4177e.mo12751c(j);
        }
        mo12414I();
        if (Build.VERSION.SDK_INT >= 24) {
            Context c2 = mo12428c();
            ComponentName componentName = new ComponentName(c2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int x = m7123x();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(DddTag.ACTION, "com.google.android.gms.measurement.UPLOAD");
            C1767e6.m5022b(c2, new JobInfo.Builder(x, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        this.f4176d.setInexactRepeating(2, b, Math.max(C2302r.f4537s.mo12867a(null).longValue(), j), m7124y());
    }

    /* renamed from: v */
    public final void mo12738v() {
        mo12749r();
        mo12427b().mo13104O().mo13130a("Unscheduling upload");
        this.f4176d.cancel(m7124y());
        this.f4177e.mo12753e();
        if (Build.VERSION.SDK_INT >= 24) {
            m7122w();
        }
    }
}
