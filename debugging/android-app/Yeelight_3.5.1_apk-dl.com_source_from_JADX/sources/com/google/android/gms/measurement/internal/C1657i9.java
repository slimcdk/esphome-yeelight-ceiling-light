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
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C0897c;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.stats.C0956a;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.i9 */
public final class C1657i9 implements ServiceConnection, C0897c.C0898a, C0897c.C0899b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile boolean f2166a;

    /* renamed from: b */
    private volatile C1835x3 f2167b;

    /* renamed from: c */
    final /* synthetic */ C1670j9 f2168c;

    protected C1657i9(C1670j9 j9Var) {
        this.f2168c = j9Var;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14247b(Intent intent) {
        this.f2168c.mo14009h();
        Context f = this.f2168c.f2143a.mo14231f();
        C0956a b = C0956a.m1580b();
        synchronized (this) {
            if (this.f2166a) {
                this.f2168c.f2143a.mo14228b().mo14039v().mo14693a("Connection attempt already in progress");
                return;
            }
            this.f2168c.f2143a.mo14228b().mo14039v().mo14693a("Using local app measurement service");
            this.f2166a = true;
            b.mo12423a(f, intent, this.f2168c.f2203c, 129);
        }
    }

    @MainThread
    /* renamed from: c */
    public final void mo12239c(int i) {
        C0917i.m1414e("MeasurementServiceConnection.onConnectionSuspended");
        this.f2168c.f2143a.mo14228b().mo14034q().mo14693a("Service connection suspended");
        this.f2168c.f2143a.mo14227a().mo14310z(new C1631g9(this));
    }

    @WorkerThread
    /* renamed from: d */
    public final void mo14248d() {
        this.f2168c.mo14009h();
        Context f = this.f2168c.f2143a.mo14231f();
        synchronized (this) {
            if (this.f2166a) {
                this.f2168c.f2143a.mo14228b().mo14039v().mo14693a("Connection attempt already in progress");
            } else if (this.f2167b == null || (!this.f2167b.mo12216d() && !this.f2167b.isConnected())) {
                this.f2167b = new C1835x3(f, Looper.getMainLooper(), this, this);
                this.f2168c.f2143a.mo14228b().mo14039v().mo14693a("Connecting to remote service");
                this.f2166a = true;
                C0917i.m1419j(this.f2167b);
                this.f2167b.mo12231s();
            } else {
                this.f2168c.f2143a.mo14228b().mo14039v().mo14693a("Already awaiting connection attempt");
            }
        }
    }

    @MainThread
    /* renamed from: e */
    public final void mo12241e(@NonNull ConnectionResult connectionResult) {
        C0917i.m1414e("MeasurementServiceConnection.onConnectionFailed");
        C1574c4 E = this.f2168c.f2143a.mo14374E();
        if (E != null) {
            E.mo14040w().mo14694b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f2166a = false;
            this.f2167b = null;
        }
        this.f2168c.f2143a.mo14227a().mo14310z(new C1644h9(this));
    }

    @MainThread
    /* renamed from: f */
    public final void mo12240f(Bundle bundle) {
        C0917i.m1414e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C0917i.m1419j(this.f2167b);
                this.f2168c.f2143a.mo14227a().mo14310z(new C1618f9(this, (C1763r3) this.f2167b.mo12197F()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f2167b = null;
                this.f2166a = false;
            }
        }
    }

    @WorkerThread
    /* renamed from: g */
    public final void mo14249g() {
        if (this.f2167b != null && (this.f2167b.isConnected() || this.f2167b.mo12216d())) {
            this.f2167b.disconnect();
        }
        this.f2167b = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f2168c.f2143a.mo14228b().mo14035r().mo14693a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0065 */
    @androidx.annotation.MainThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C0917i.m1414e(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001e
            r3.f2166a = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.j9 r4 = r3.f2168c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.n5 r4 = r4.f2143a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo14228b()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14035r()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo14693a(r5)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x001e:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0065 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C1763r3     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.internal.r3 r1 = (com.google.android.gms.measurement.internal.C1763r3) r1     // Catch:{ RemoteException -> 0x0065 }
        L_0x0037:
            r0 = r1
            goto L_0x003f
        L_0x0039:
            com.google.android.gms.measurement.internal.p3 r1 = new com.google.android.gms.measurement.internal.p3     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0037
        L_0x003f:
            com.google.android.gms.measurement.internal.j9 r5 = r3.f2168c     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.n5 r5 = r5.f2143a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo14228b()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14039v()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo14693a(r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0051:
            com.google.android.gms.measurement.internal.j9 r5 = r3.f2168c     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.n5 r5 = r5.f2143a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo14228b()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo14694b(r2, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0063:
            r4 = move-exception
            goto L_0x00a2
        L_0x0065:
            com.google.android.gms.measurement.internal.j9 r5 = r3.f2168c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.n5 r5 = r5.f2143a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo14228b()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo14693a(r1)     // Catch:{ all -> 0x0063 }
        L_0x0076:
            if (r0 != 0) goto L_0x0090
            r3.f2166a = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.common.stats.a r4 = com.google.android.gms.common.stats.C0956a.m1580b()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.j9 r5 = r3.f2168c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.n5 r5 = r5.f2143a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            android.content.Context r5 = r5.mo14231f()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.j9 r0 = r3.f2168c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.i9 r0 = r0.f2203c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.mo12424c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a0
        L_0x0090:
            com.google.android.gms.measurement.internal.j9 r4 = r3.f2168c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.n5 r4 = r4.f2143a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.k5 r4 = r4.mo14227a()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.c9 r5 = new com.google.android.gms.measurement.internal.c9     // Catch:{ all -> 0x0063 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0063 }
            r4.mo14310z(r5)     // Catch:{ all -> 0x0063 }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            goto L_0x00a5
        L_0x00a4:
            throw r4
        L_0x00a5:
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1657i9.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        C0917i.m1414e("MeasurementServiceConnection.onServiceDisconnected");
        this.f2168c.f2143a.mo14228b().mo14034q().mo14693a("Service disconnected");
        this.f2168c.f2143a.mo14227a().mo14310z(new C1592d9(this, componentName));
    }
}
