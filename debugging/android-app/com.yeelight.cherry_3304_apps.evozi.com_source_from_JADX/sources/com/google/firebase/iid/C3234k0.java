package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.p106s.C1666b;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p011c.p012a.p019b.p028b.p038e.C0619h;

/* renamed from: com.google.firebase.iid.k0 */
public final class C3234k0 implements ServiceConnection {

    /* renamed from: a */
    private final Context f6254a;

    /* renamed from: b */
    private final Intent f6255b;

    /* renamed from: c */
    private final ScheduledExecutorService f6256c;

    /* renamed from: d */
    private final Queue<C3232j0> f6257d;
    @Nullable

    /* renamed from: e */
    private C3220f0 f6258e;
    @GuardedBy("this")

    /* renamed from: f */
    private boolean f6259f;

    public C3234k0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C1666b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @VisibleForTesting
    private C3234k0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f6257d = new ArrayDeque();
        this.f6259f = false;
        this.f6254a = context.getApplicationContext();
        this.f6255b = new Intent(str).setPackage(this.f6254a.getPackageName());
        this.f6256c = scheduledExecutorService;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:20|21|22|(2:24|25)|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0071 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m10082b() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x007a }
        L_0x0008:
            java.util.Queue<com.google.firebase.iid.j0> r0 = r5.f6257d     // Catch:{ all -> 0x007a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0078
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x007a }
            com.google.firebase.iid.f0 r0 = r5.f6258e     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0036
            com.google.firebase.iid.f0 r0 = r5.f6258e     // Catch:{ all -> 0x007a }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x007a }
            java.util.Queue<com.google.firebase.iid.j0> r0 = r5.f6257d     // Catch:{ all -> 0x007a }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x007a }
            com.google.firebase.iid.j0 r0 = (com.google.firebase.iid.C3232j0) r0     // Catch:{ all -> 0x007a }
            com.google.firebase.iid.f0 r2 = r5.f6258e     // Catch:{ all -> 0x007a }
            r2.mo17829a(r0)     // Catch:{ all -> 0x007a }
            goto L_0x0008
        L_0x0036:
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x007a }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0059
            boolean r0 = r5.f6259f     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            r3 = 39
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            r4.<init>(r3)     // Catch:{ all -> 0x007a }
            java.lang.String r3 = "binder is dead. start connection? "
            r4.append(r3)     // Catch:{ all -> 0x007a }
            r4.append(r0)     // Catch:{ all -> 0x007a }
            r4.toString()     // Catch:{ all -> 0x007a }
        L_0x0059:
            boolean r0 = r5.f6259f     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0076
            r5.f6259f = r2     // Catch:{ all -> 0x007a }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C1640a.m4551b()     // Catch:{ SecurityException -> 0x0071 }
            android.content.Context r2 = r5.f6254a     // Catch:{ SecurityException -> 0x0071 }
            android.content.Intent r3 = r5.f6255b     // Catch:{ SecurityException -> 0x0071 }
            r4 = 65
            boolean r0 = r0.mo11370a(r2, r3, r5, r4)     // Catch:{ SecurityException -> 0x0071 }
            if (r0 == 0) goto L_0x0071
            monitor-exit(r5)
            return
        L_0x0071:
            r5.f6259f = r1     // Catch:{ all -> 0x007a }
            r5.m10083c()     // Catch:{ all -> 0x007a }
        L_0x0076:
            monitor-exit(r5)
            return
        L_0x0078:
            monitor-exit(r5)
            return
        L_0x007a:
            r0 = move-exception
            monitor-exit(r5)
            goto L_0x007e
        L_0x007d:
            throw r0
        L_0x007e:
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C3234k0.m10082b():void");
    }

    @GuardedBy("this")
    /* renamed from: c */
    private final void m10083c() {
        while (!this.f6257d.isEmpty()) {
            this.f6257d.poll().mo17838b();
        }
    }

    /* renamed from: a */
    public final synchronized C0619h<Void> mo17841a(Intent intent) {
        C3232j0 j0Var;
        boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
        j0Var = new C3232j0(intent);
        ScheduledExecutorService scheduledExecutorService = this.f6256c;
        j0Var.mo17837a().mo8642c(scheduledExecutorService, new C3236l0(scheduledExecutorService.schedule(new C3238m0(j0Var), 9000, TimeUnit.MILLISECONDS)));
        this.f6257d.add(j0Var);
        m10082b();
        return j0Var.mo17837a();
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            sb.toString();
        }
        this.f6259f = false;
        if (!(iBinder instanceof C3220f0)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            sb2.toString();
            m10083c();
            return;
        }
        this.f6258e = (C3220f0) iBinder;
        m10082b();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            sb.toString();
        }
        m10082b();
    }
}
