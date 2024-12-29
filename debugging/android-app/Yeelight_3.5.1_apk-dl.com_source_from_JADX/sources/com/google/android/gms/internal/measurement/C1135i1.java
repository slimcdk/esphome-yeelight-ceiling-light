package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.i1 */
public final class C1135i1 extends C1214n0 implements C1167k1 {
    C1135i1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: b */
    public final int mo12871b() {
        Parcel e = mo13003e(2, mo13002c());
        int readInt = e.readInt();
        e.recycle();
        return readInt;
    }

    /* renamed from: g */
    public final void mo12872g(String str, String str2, Bundle bundle, long j) {
        Parcel c = mo13002c();
        c.writeString(str);
        c.writeString(str2);
        C1246p0.m2432e(c, bundle);
        c.writeLong(j);
        mo13004f(1, c);
    }
}
