package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.C0988a;
import com.google.android.gms.internal.common.C0997j;
import p032f0.C3155a;

/* renamed from: com.google.android.gms.dynamite.q */
public final class C0985q extends C0988a {
    C0985q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: D0 */
    public final int mo12448D0(C3155a aVar, String str, boolean z) {
        Parcel e = mo12459e();
        C0997j.m1656e(e, aVar);
        e.writeString(str);
        C0997j.m1654c(e, z);
        Parcel c = mo12458c(5, e);
        int readInt = c.readInt();
        c.recycle();
        return readInt;
    }

    /* renamed from: E0 */
    public final C3155a mo12449E0(C3155a aVar, String str, int i) {
        Parcel e = mo12459e();
        C0997j.m1656e(e, aVar);
        e.writeString(str);
        e.writeInt(i);
        Parcel c = mo12458c(2, e);
        C3155a e2 = C3155a.C3156a.m8426e(c.readStrongBinder());
        c.recycle();
        return e2;
    }

    /* renamed from: F0 */
    public final C3155a mo12450F0(C3155a aVar, String str, int i, C3155a aVar2) {
        Parcel e = mo12459e();
        C0997j.m1656e(e, aVar);
        e.writeString(str);
        e.writeInt(i);
        C0997j.m1656e(e, aVar2);
        Parcel c = mo12458c(8, e);
        C3155a e2 = C3155a.C3156a.m8426e(c.readStrongBinder());
        c.recycle();
        return e2;
    }

    /* renamed from: G0 */
    public final C3155a mo12451G0(C3155a aVar, String str, int i) {
        Parcel e = mo12459e();
        C0997j.m1656e(e, aVar);
        e.writeString(str);
        e.writeInt(i);
        Parcel c = mo12458c(4, e);
        C3155a e2 = C3155a.C3156a.m8426e(c.readStrongBinder());
        c.recycle();
        return e2;
    }

    /* renamed from: H0 */
    public final C3155a mo12452H0(C3155a aVar, String str, boolean z, long j) {
        Parcel e = mo12459e();
        C0997j.m1656e(e, aVar);
        e.writeString(str);
        C0997j.m1654c(e, z);
        e.writeLong(j);
        Parcel c = mo12458c(7, e);
        C3155a e2 = C3155a.C3156a.m8426e(c.readStrongBinder());
        c.recycle();
        return e2;
    }

    /* renamed from: T */
    public final int mo12453T(C3155a aVar, String str, boolean z) {
        Parcel e = mo12459e();
        C0997j.m1656e(e, aVar);
        e.writeString(str);
        C0997j.m1654c(e, z);
        Parcel c = mo12458c(3, e);
        int readInt = c.readInt();
        c.recycle();
        return readInt;
    }

    /* renamed from: f */
    public final int mo12454f() {
        Parcel c = mo12458c(6, mo12459e());
        int readInt = c.readInt();
        c.recycle();
        return readInt;
    }
}
