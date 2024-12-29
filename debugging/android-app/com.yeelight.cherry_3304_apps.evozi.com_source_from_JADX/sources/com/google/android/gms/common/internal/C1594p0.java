package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p011c.p012a.p019b.p028b.p031b.C0561a;
import p011c.p012a.p019b.p028b.p032c.p034b.C0572b;
import p011c.p012a.p019b.p028b.p032c.p034b.C0573c;

/* renamed from: com.google.android.gms.common.internal.p0 */
public abstract class C1594p0 extends C0572b implements C1592o0 {
    public C1594p0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: c */
    public static C1592o0 m4380c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof C1592o0 ? (C1592o0) queryLocalInterface : new C1596q0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8548a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C0561a D = mo11266D();
            parcel2.writeNoException();
            C0573c.m348c(parcel2, D);
        } else if (i != 2) {
            return false;
        } else {
            int E = mo11267E();
            parcel2.writeNoException();
            parcel2.writeInt(E);
        }
        return true;
    }
}
