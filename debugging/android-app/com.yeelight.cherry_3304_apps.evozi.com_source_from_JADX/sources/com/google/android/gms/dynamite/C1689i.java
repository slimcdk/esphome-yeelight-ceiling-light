package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import p011c.p012a.p019b.p028b.p031b.C0561a;
import p011c.p012a.p019b.p028b.p032c.p034b.C0571a;
import p011c.p012a.p019b.p028b.p032c.p034b.C0573c;

/* renamed from: com.google.android.gms.dynamite.i */
public final class C1689i extends C0571a implements C1688h {
    C1689i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: s */
    public final C0561a mo11398s(C0561a aVar, String str, int i, C0561a aVar2) {
        Parcel c = mo8546c();
        C0573c.m348c(c, aVar);
        c.writeString(str);
        c.writeInt(i);
        C0573c.m348c(c, aVar2);
        Parcel e = mo8547e(2, c);
        C0561a c2 = C0561a.C0562a.m333c(e.readStrongBinder());
        e.recycle();
        return c2;
    }

    /* renamed from: u */
    public final C0561a mo11399u(C0561a aVar, String str, int i, C0561a aVar2) {
        Parcel c = mo8546c();
        C0573c.m348c(c, aVar);
        c.writeString(str);
        c.writeInt(i);
        C0573c.m348c(c, aVar2);
        Parcel e = mo8547e(3, c);
        C0561a c2 = C0561a.C0562a.m333c(e.readStrongBinder());
        e.recycle();
        return c2;
    }
}
