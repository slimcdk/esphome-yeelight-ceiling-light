package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0897c;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.VisibleForTesting;
import p014c0.C0613b;
import p065m0.C3335c;
import p065m0.C3339g;
import p109w.C3838f;

/* renamed from: com.google.android.gms.common.api.internal.t1 */
final class C0845t1 implements C3335c {

    /* renamed from: a */
    private final C0778g f780a;

    /* renamed from: b */
    private final int f781b;

    /* renamed from: c */
    private final C0752b f782c;

    /* renamed from: d */
    private final long f783d;

    /* renamed from: e */
    private final long f784e;

    @VisibleForTesting
    C0845t1(C0778g gVar, int i, C0752b bVar, long j, long j2, @Nullable String str, @Nullable String str2) {
        this.f780a = gVar;
        this.f781b = i;
        this.f782c = bVar;
        this.f783d = j;
        this.f784e = j2;
    }

    @Nullable
    /* renamed from: b */
    static C0845t1 m1075b(C0778g gVar, int i, C0752b bVar) {
        boolean z;
        if (!gVar.mo11963f()) {
            return null;
        }
        RootTelemetryConfiguration a = C3838f.m10936b().mo26308a();
        if (a == null) {
            z = true;
        } else if (!a.mo12180c0()) {
            return null;
        } else {
            z = a.mo12181d0();
            C0785h1 w = gVar.mo11967w(bVar);
            if (w != null) {
                if (!(w.mo11994v() instanceof C0897c)) {
                    return null;
                }
                C0897c cVar = (C0897c) w.mo11994v();
                if (cVar.mo12203L() && !cVar.mo12216d()) {
                    ConnectionTelemetryConfiguration c = m1076c(w, cVar, i);
                    if (c == null) {
                        return null;
                    }
                    w.mo11980G();
                    z = c.mo12172f0();
                }
            }
        }
        return new C0845t1(gVar, i, bVar, z ? System.currentTimeMillis() : 0, z ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    @Nullable
    /* renamed from: c */
    private static ConnectionTelemetryConfiguration m1076c(C0785h1 h1Var, C0897c cVar, int i) {
        int[] W;
        int[] c0;
        ConnectionTelemetryConfiguration J = cVar.mo12201J();
        if (J == null || !J.mo12171d0() || ((W = J.mo12169W()) != null ? !C0613b.m188b(W, i) : !((c0 = J.mo12170c0()) == null || !C0613b.m188b(c0, i))) || h1Var.mo11992s() >= J.mo12168V()) {
            return null;
        }
        return J;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo12083a(@NonNull C3339g gVar) {
        C0785h1 w;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        if (this.f780a.mo11963f()) {
            RootTelemetryConfiguration a = C3838f.m10936b().mo26308a();
            if ((a == null || a.mo12180c0()) && (w = this.f780a.mo11967w(this.f782c)) != null && (w.mo11994v() instanceof C0897c)) {
                C0897c cVar = (C0897c) w.mo11994v();
                boolean z = true;
                boolean z2 = this.f783d > 0;
                int B = cVar.mo12193B();
                if (a != null) {
                    boolean d0 = z2 & a.mo12181d0();
                    int V = a.mo12178V();
                    int W = a.mo12179W();
                    i3 = a.mo12182f0();
                    if (cVar.mo12203L() && !cVar.mo12216d()) {
                        ConnectionTelemetryConfiguration c = m1076c(w, cVar, this.f781b);
                        if (c != null) {
                            if (!c.mo12172f0() || this.f783d <= 0) {
                                z = false;
                            }
                            W = c.mo12168V();
                            d0 = z;
                        } else {
                            return;
                        }
                    }
                    i2 = V;
                    i = W;
                } else {
                    i3 = 0;
                    i2 = 5000;
                    i = 100;
                }
                C0778g gVar2 = this.f780a;
                if (gVar.mo14771n()) {
                    i5 = 0;
                    i4 = 0;
                } else {
                    if (gVar.mo14769l()) {
                        i5 = 100;
                    } else {
                        Exception j3 = gVar.mo14767j();
                        if (j3 instanceof ApiException) {
                            Status status = ((ApiException) j3).getStatus();
                            int c0 = status.mo11808c0();
                            ConnectionResult V2 = status.mo11806V();
                            i4 = V2 == null ? -1 : V2.mo11751V();
                            i5 = c0;
                        } else {
                            i5 = 101;
                        }
                    }
                    i4 = -1;
                }
                if (z2) {
                    long j4 = this.f783d;
                    j = System.currentTimeMillis();
                    j2 = j4;
                    i6 = (int) (SystemClock.elapsedRealtime() - this.f784e);
                } else {
                    j2 = 0;
                    j = 0;
                    i6 = -1;
                }
                gVar2.mo11957H(new MethodInvocation(this.f781b, i5, i4, j2, j, (String) null, (String) null, B, i6), i3, (long) i2, i);
            }
        }
    }
}
