package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C1550d;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.stats.C1640a;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.j8 */
public final class C2222j8 implements ServiceConnection, C1550d.C1551a, C1550d.C1552b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile boolean f4249a;

    /* renamed from: b */
    private volatile C2372x3 f4250b;

    /* renamed from: c */
    final /* synthetic */ C2310r7 f4251c;

    protected C2222j8(C2310r7 r7Var) {
        this.f4251c = r7Var;
    }

    @MainThread
    /* renamed from: a */
    public final void mo11136a(int i) {
        C1609u.m4470f("MeasurementServiceConnection.onConnectionSuspended");
        this.f4251c.mo12427b().mo13103N().mo13130a("Service connection suspended");
        this.f4251c.mo12426a().mo13122y(new C2267n8(this));
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo12773b() {
        if (this.f4250b != null && (this.f4250b.isConnected() || this.f4250b.mo11159e())) {
            this.f4250b.disconnect();
        }
        this.f4250b = null;
    }

    @MainThread
    /* renamed from: c */
    public final void mo11137c(@Nullable Bundle bundle) {
        C1609u.m4470f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f4251c.mo12426a().mo13122y(new C2278o8(this, (C2273o3) this.f4250b.mo11144E()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f4250b = null;
                this.f4249a = false;
            }
        }
    }

    @WorkerThread
    /* renamed from: d */
    public final void mo12774d(Intent intent) {
        this.f4251c.mo12567h();
        Context c = this.f4251c.mo12428c();
        C1640a b = C1640a.m4551b();
        synchronized (this) {
            if (this.f4249a) {
                this.f4251c.mo12427b().mo13104O().mo13130a("Connection attempt already in progress");
                return;
            }
            this.f4251c.mo12427b().mo13104O().mo13130a("Using local app measurement service");
            this.f4249a = true;
            b.mo11370a(c, intent, this.f4251c.f4562c, 129);
        }
    }

    @MainThread
    /* renamed from: f */
    public final void mo11138f(@NonNull ConnectionResult connectionResult) {
        C1609u.m4470f("MeasurementServiceConnection.onConnectionFailed");
        C2361w3 B = this.f4251c.f4689a.mo12407B();
        if (B != null) {
            B.mo13099J().mo13131b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f4249a = false;
            this.f4250b = null;
        }
        this.f4251c.mo12426a().mo13122y(new C2300q8(this));
    }

    @WorkerThread
    /* renamed from: g */
    public final void mo12775g() {
        this.f4251c.mo12567h();
        Context c = this.f4251c.mo12428c();
        synchronized (this) {
            if (this.f4249a) {
                this.f4251c.mo12427b().mo13104O().mo13130a("Connection attempt already in progress");
            } else if (this.f4250b == null || (!this.f4250b.mo11159e() && !this.f4250b.isConnected())) {
                this.f4250b = new C2372x3(c, Looper.getMainLooper(), this, this);
                this.f4251c.mo12427b().mo13104O().mo13130a("Connecting to remote service");
                this.f4249a = true;
                this.f4250b.mo11174v();
            } else {
                this.f4251c.mo12427b().mo13104O().mo13130a("Already awaiting connection attempt");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f4251c.mo12427b().mo13096F().mo13130a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0062 */
    @androidx.annotation.MainThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C1609u.m4470f(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f4249a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.r7 r4 = r3.f4251c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13096F()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo13130a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0099
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x0052
            if (r5 != 0) goto L_0x002f
            goto L_0x0042
        L_0x002f:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0062 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C2273o3     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.o3 r1 = (com.google.android.gms.measurement.internal.C2273o3) r1     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0041
        L_0x003c:
            com.google.android.gms.measurement.internal.q3 r1 = new com.google.android.gms.measurement.internal.q3     // Catch:{ RemoteException -> 0x0062 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0062 }
        L_0x0041:
            r0 = r1
        L_0x0042:
            com.google.android.gms.measurement.internal.r7 r5 = r3.f4251c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.w3 r5 = r5.mo12427b()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo13104O()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo13130a(r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0052:
            com.google.android.gms.measurement.internal.r7 r5 = r3.f4251c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.w3 r5 = r5.mo12427b()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo13096F()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo13131b(r2, r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0062:
            com.google.android.gms.measurement.internal.r7 r5 = r3.f4251c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.w3 r5 = r5.mo12427b()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo13096F()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo13130a(r1)     // Catch:{ all -> 0x001c }
        L_0x0071:
            if (r0 != 0) goto L_0x0089
            r3.f4249a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.common.stats.a r4 = com.google.android.gms.common.stats.C1640a.m4551b()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.r7 r5 = r3.f4251c     // Catch:{ IllegalArgumentException -> 0x0097 }
            android.content.Context r5 = r5.mo12428c()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.r7 r0 = r3.f4251c     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.j8 r0 = r0.f4562c     // Catch:{ IllegalArgumentException -> 0x0097 }
            r4.mo11371c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0097 }
            goto L_0x0097
        L_0x0089:
            com.google.android.gms.measurement.internal.r7 r4 = r3.f4251c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.x4 r4 = r4.mo12426a()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.m8 r5 = new com.google.android.gms.measurement.internal.m8     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.mo13122y(r5)     // Catch:{ all -> 0x001c }
        L_0x0097:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0099:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2222j8.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        C1609u.m4470f("MeasurementServiceConnection.onServiceDisconnected");
        this.f4251c.mo12427b().mo13103N().mo13130a("Service disconnected");
        this.f4251c.mo12426a().mo13122y(new C2244l8(this, componentName));
    }
}
