package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.zc */
public final class C2101zc extends C1698a implements C2069xc {
    C2101zc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: C */
    public final int mo11540C() {
        Parcel e = mo11410e(2, mo11409c());
        int readInt = e.readInt();
        e.recycle();
        return readInt;
    }

    /* renamed from: p0 */
    public final void mo11541p0(String str, String str2, Bundle bundle, long j) {
        Parcel c = mo11409c();
        c.writeString(str);
        c.writeString(str2);
        C1978s.m5922c(c, bundle);
        c.writeLong(j);
        mo11411f(1, c);
    }
}
