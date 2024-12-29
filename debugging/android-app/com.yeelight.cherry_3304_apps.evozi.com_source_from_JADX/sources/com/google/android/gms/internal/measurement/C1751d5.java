package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.d5 */
public abstract class C1751d5 extends C1762e1 implements C1778f2 {
    /* renamed from: c */
    public static C1778f2 m4969c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof C1778f2 ? (C1778f2) queryLocalInterface : new C1750d4(iBinder);
    }
}
