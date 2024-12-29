package p011c.p012a.p019b.p028b.p032c.p033a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: c.a.b.b.c.a.f */
public final class C0570f extends C0565a implements C0568d {
    C0570f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: d */
    public final boolean mo8543d(boolean z) {
        Parcel c = mo8541c();
        C0567c.m338a(c, true);
        Parcel e = mo8542e(2, c);
        boolean b = C0567c.m339b(e);
        e.recycle();
        return b;
    }

    public final String getId() {
        Parcel e = mo8542e(1, mo8541c());
        String readString = e.readString();
        e.recycle();
        return readString;
    }
}
