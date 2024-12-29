package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import p011c.p012a.p019b.p028b.p032c.p034b.C0572b;

/* renamed from: com.google.android.gms.common.internal.s0 */
public abstract class C1601s0 extends C0572b implements C1598r0 {
    /* renamed from: c */
    public static C1598r0 m4392c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof C1598r0 ? (C1598r0) queryLocalInterface : new C1608t0(iBinder);
    }
}
