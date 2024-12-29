package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.C0988a;
import com.google.android.gms.internal.common.C0997j;
import p032f0.C3155a;

/* renamed from: com.google.android.gms.dynamite.r */
public final class C0986r extends C0988a {
    C0986r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: T */
    public final C3155a mo12455T(C3155a aVar, String str, int i, C3155a aVar2) {
        Parcel e = mo12459e();
        C0997j.m1656e(e, aVar);
        e.writeString(str);
        e.writeInt(i);
        C0997j.m1656e(e, aVar2);
        Parcel c = mo12458c(3, e);
        C3155a e2 = C3155a.C3156a.m8426e(c.readStrongBinder());
        c.recycle();
        return e2;
    }

    /* renamed from: f */
    public final C3155a mo12456f(C3155a aVar, String str, int i, C3155a aVar2) {
        Parcel e = mo12459e();
        C0997j.m1656e(e, aVar);
        e.writeString(str);
        e.writeInt(i);
        C0997j.m1656e(e, aVar2);
        Parcel c = mo12458c(2, e);
        C3155a e2 = C3155a.C3156a.m8426e(c.readStrongBinder());
        c.recycle();
        return e2;
    }
}
