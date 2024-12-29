package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.C1584m;
import com.google.android.gms.internal.base.C1690a;
import com.google.android.gms.internal.base.C1692c;

/* renamed from: com.google.android.gms.signin.internal.g */
public final class C2407g extends C1690a implements C2406f {
    C2407g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: R */
    public final void mo13170R(C1584m mVar, int i, boolean z) {
        Parcel c = mo11401c();
        C1692c.m4686c(c, mVar);
        c.writeInt(i);
        C1692c.m4684a(c, z);
        mo11402e(9, c);
    }

    /* renamed from: Y */
    public final void mo13171Y(zah zah, C2404d dVar) {
        Parcel c = mo11401c();
        C1692c.m4687d(c, zah);
        C1692c.m4686c(c, dVar);
        mo11402e(12, c);
    }

    /* renamed from: t */
    public final void mo13172t(int i) {
        Parcel c = mo11401c();
        c.writeInt(i);
        mo11402e(7, c);
    }
}
