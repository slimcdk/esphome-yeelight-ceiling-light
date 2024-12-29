package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import p011c.p012a.p019b.p028b.p031b.C0561a;
import p011c.p012a.p019b.p028b.p032c.p034b.C0571a;

/* renamed from: com.google.android.gms.common.internal.q0 */
public final class C1596q0 extends C0571a implements C1592o0 {
    C1596q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: D */
    public final C0561a mo11266D() {
        Parcel e = mo8547e(1, mo8546c());
        C0561a c = C0561a.C0562a.m333c(e.readStrongBinder());
        e.recycle();
        return c;
    }

    /* renamed from: E */
    public final int mo11267E() {
        Parcel e = mo8547e(2, mo8546c());
        int readInt = e.readInt();
        e.recycle();
        return readInt;
    }
}
