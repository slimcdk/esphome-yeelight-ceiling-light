package com.xiaomi.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4663fc;

/* renamed from: com.xiaomi.push.fd */
class C4665fd implements C4663fc.C4664a {

    /* renamed from: a */
    private volatile long f8615a = 0;

    /* renamed from: a */
    private PendingIntent f8616a = null;

    /* renamed from: a */
    protected Context f8617a = null;

    public C4665fd(Context context) {
        this.f8617a = context;
    }

    /* renamed from: a */
    private void m14169a(AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        Class<AlarmManager> cls = AlarmManager.class;
        try {
            cls.getMethod("setExact", new Class[]{Integer.TYPE, Long.TYPE, PendingIntent.class}).invoke(alarmManager, new Object[]{0, Long.valueOf(j), pendingIntent});
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo25066a() {
        return (long) C4687fy.m14331b();
    }

    /* renamed from: a */
    public void m14171a() {
        if (this.f8616a != null) {
            try {
                ((AlarmManager) this.f8617a.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.f8616a);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f8616a = null;
                C3989b.m10680c("unregister timer");
                this.f8615a = 0;
                throw th;
            }
            this.f8616a = null;
            C3989b.m10680c("unregister timer");
            this.f8615a = 0;
        }
        this.f8615a = 0;
    }

    /* renamed from: a */
    public void mo25068a(Intent intent, long j) {
        AlarmManager alarmManager = (AlarmManager) this.f8617a.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f8617a, 0, intent, 0);
        this.f8616a = broadcast;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            C4525ba.m13403a((Object) alarmManager, "setExactAndAllowWhileIdle", 0, Long.valueOf(j), this.f8616a);
        } else if (i >= 19) {
            m14169a(alarmManager, j, broadcast);
        } else {
            alarmManager.set(0, j, broadcast);
        }
        C3989b.m10680c("register timer " + j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r7.f8615a < java.lang.System.currentTimeMillis()) goto L_0x0033;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25067a(boolean r8) {
        /*
            r7 = this;
            long r0 = r7.mo25066a()
            r2 = 0
            if (r8 != 0) goto L_0x000f
            long r4 = r7.f8615a
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x000f
            return
        L_0x000f:
            if (r8 == 0) goto L_0x0014
            r7.mo25066a()
        L_0x0014:
            if (r8 != 0) goto L_0x002d
            long r4 = r7.f8615a
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x001d
            goto L_0x002d
        L_0x001d:
            long r2 = r7.f8615a
            long r2 = r2 + r0
            r7.f8615a = r2
            long r2 = r7.f8615a
            long r4 = java.lang.System.currentTimeMillis()
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x003a
            goto L_0x0033
        L_0x002d:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 % r0
            long r0 = r0 - r2
        L_0x0033:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r0
            r7.f8615a = r2
        L_0x003a:
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r0 = com.xiaomi.push.service.C4870at.f10040o
            r8.<init>(r0)
            android.content.Context r0 = r7.f8617a
            java.lang.String r0 = r0.getPackageName()
            r8.setPackage(r0)
            long r0 = r7.f8615a
            r7.mo25068a(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4665fd.mo25067a(boolean):void");
    }

    /* renamed from: a */
    public boolean m14174a() {
        return this.f8615a != 0;
    }
}
