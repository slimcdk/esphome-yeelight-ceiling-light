package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C1426e;

/* renamed from: com.google.android.gms.common.api.internal.w0 */
final class C1496w0 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f2825a;

    /* renamed from: b */
    private final /* synthetic */ C1426e.C1427a f2826b;

    C1496w0(C1426e.C1427a aVar, ConnectionResult connectionResult) {
        this.f2826b = aVar;
        this.f2825a = connectionResult;
    }

    public final void run() {
        this.f2826b.mo10838f(this.f2825a);
    }
}
