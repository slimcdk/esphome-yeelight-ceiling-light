package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzk;
import p011c.p012a.p019b.p028b.p031b.C0561a;
import p011c.p012a.p019b.p028b.p032c.p034b.C0571a;
import p011c.p012a.p019b.p028b.p032c.p034b.C0573c;

/* renamed from: com.google.android.gms.common.internal.t0 */
public final class C1608t0 extends C0571a implements C1598r0 {
    C1608t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: F */
    public final boolean mo11271F(zzk zzk, C0561a aVar) {
        Parcel c = mo8546c();
        C0573c.m349d(c, zzk);
        C0573c.m348c(c, aVar);
        Parcel e = mo8547e(5, c);
        boolean e2 = C0573c.m350e(e);
        e.recycle();
        return e2;
    }
}
