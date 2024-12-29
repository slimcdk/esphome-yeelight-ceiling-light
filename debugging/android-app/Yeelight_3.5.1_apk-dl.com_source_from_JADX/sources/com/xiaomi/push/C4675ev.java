package com.xiaomi.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4673eu;

/* renamed from: com.xiaomi.push.ev */
class C4675ev implements C4673eu.C4674a {

    /* renamed from: a */
    private volatile long f8022a = 0;

    /* renamed from: a */
    private PendingIntent f8023a = null;

    /* renamed from: a */
    protected Context f8024a = null;

    public C4675ev(Context context) {
        this.f8024a = context;
    }

    /* renamed from: a */
    private void m13761a(AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        Class<AlarmManager> cls = AlarmManager.class;
        try {
            cls.getMethod("setExact", new Class[]{Integer.TYPE, Long.TYPE, PendingIntent.class}).invoke(alarmManager, new Object[]{2, Long.valueOf(j), pendingIntent});
        } catch (Exception e) {
            C4408b.m12483d("[Alarm] invoke setExact method meet error. " + e);
        }
    }

    /* renamed from: a */
    public void mo29085a() {
        if (this.f8023a != null) {
            try {
                ((AlarmManager) this.f8024a.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.f8023a);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f8023a = null;
                C4408b.m12482c("[Alarm] unregister timer");
                this.f8022a = 0;
                throw th;
            }
            this.f8023a = null;
            C4408b.m12482c("[Alarm] unregister timer");
            this.f8022a = 0;
        }
        this.f8022a = 0;
    }

    /* renamed from: a */
    public void mo29087a(Intent intent, long j) {
        AlarmManager alarmManager = (AlarmManager) this.f8024a.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i = Build.VERSION.SDK_INT;
        this.f8023a = i >= 31 ? PendingIntent.getBroadcast(this.f8024a, 0, intent, 33554432) : PendingIntent.getBroadcast(this.f8024a, 0, intent, 0);
        if (i >= 23) {
            C4554bk.m13012a((Object) alarmManager, "setExactAndAllowWhileIdle", 2, Long.valueOf(j), this.f8023a);
        } else {
            m13761a(alarmManager, j, this.f8023a);
        }
        C4408b.m12482c("[Alarm] register timer " + j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r8.f8022a < r4) goto L_0x003c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29086a(boolean r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f8024a
            com.xiaomi.push.service.o r0 = com.xiaomi.push.service.C4972o.m15587a((android.content.Context) r0)
            long r0 = r0.mo30056a()
            r2 = 0
            if (r9 != 0) goto L_0x0015
            long r4 = r8.f8022a
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0015
            return
        L_0x0015:
            if (r9 == 0) goto L_0x001a
            r8.mo29085a()
        L_0x001a:
            long r4 = android.os.SystemClock.elapsedRealtime()
            if (r9 != 0) goto L_0x0039
            long r6 = r8.f8022a
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            long r2 = r8.f8022a
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x003f
            long r2 = r8.f8022a
            long r2 = r2 + r0
            r8.f8022a = r2
            long r2 = r8.f8022a
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x003f
            goto L_0x003c
        L_0x0039:
            long r2 = r4 % r0
            long r0 = r0 - r2
        L_0x003c:
            long r4 = r4 + r0
            r8.f8022a = r4
        L_0x003f:
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r0 = com.xiaomi.push.service.C4916bk.f9594p
            r9.<init>(r0)
            android.content.Context r0 = r8.f8024a
            java.lang.String r0 = r0.getPackageName()
            r9.setPackage(r0)
            long r0 = r8.f8022a
            r8.mo29087a(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4675ev.mo29086a(boolean):void");
    }

    /* renamed from: a */
    public boolean m13765a() {
        return this.f8022a != 0;
    }
}
