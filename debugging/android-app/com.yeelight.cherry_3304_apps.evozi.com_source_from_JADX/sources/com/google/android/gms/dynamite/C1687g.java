package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import p011c.p012a.p019b.p028b.p031b.C0561a;
import p011c.p012a.p019b.p028b.p032c.p034b.C0571a;
import p011c.p012a.p019b.p028b.p032c.p034b.C0573c;

/* renamed from: com.google.android.gms.dynamite.g */
public final class C1687g extends C0571a implements C1686f {
    C1687g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: J0 */
    public final int mo11393J0() {
        Parcel e = mo8547e(6, mo8546c());
        int readInt = e.readInt();
        e.recycle();
        return readInt;
    }

    /* renamed from: P */
    public final C0561a mo11394P(C0561a aVar, String str, int i) {
        Parcel c = mo8546c();
        C0573c.m348c(c, aVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel e = mo8547e(2, c);
        C0561a c2 = C0561a.C0562a.m333c(e.readStrongBinder());
        e.recycle();
        return c2;
    }

    /* renamed from: j0 */
    public final int mo11395j0(C0561a aVar, String str, boolean z) {
        Parcel c = mo8546c();
        C0573c.m348c(c, aVar);
        c.writeString(str);
        C0573c.m346a(c, z);
        Parcel e = mo8547e(5, c);
        int readInt = e.readInt();
        e.recycle();
        return readInt;
    }

    /* renamed from: t0 */
    public final int mo11396t0(C0561a aVar, String str, boolean z) {
        Parcel c = mo8546c();
        C0573c.m348c(c, aVar);
        c.writeString(str);
        C0573c.m346a(c, z);
        Parcel e = mo8547e(3, c);
        int readInt = e.readInt();
        e.recycle();
        return readInt;
    }

    /* renamed from: y0 */
    public final C0561a mo11397y0(C0561a aVar, String str, int i) {
        Parcel c = mo8546c();
        C0573c.m348c(c, aVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel e = mo8547e(4, c);
        C0561a c2 = C0561a.C0562a.m333c(e.readStrongBinder());
        e.recycle();
        return c2;
    }
}
