package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.r0 */
public abstract class C1278r0 extends C1230o0 implements C1294s0 {
    /* renamed from: e */
    public static C1294s0 m2598e(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof C1294s0 ? (C1294s0) queryLocalInterface : new C1262q0(iBinder);
    }
}
