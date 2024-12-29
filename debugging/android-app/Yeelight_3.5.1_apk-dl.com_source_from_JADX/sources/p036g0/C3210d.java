package p036g0;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: g0.d */
public final class C3210d extends C3207a implements C3212f {
    C3210d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: E */
    public final String mo23774E() {
        Parcel e = mo23773e(1, mo23772c());
        String readString = e.readString();
        e.recycle();
        return readString;
    }

    /* renamed from: s */
    public final boolean mo23775s(boolean z) {
        Parcel c = mo23772c();
        C3209c.m8637a(c, true);
        Parcel e = mo23773e(2, c);
        boolean b = C3209c.m8638b(e);
        e.recycle();
        return b;
    }
}
