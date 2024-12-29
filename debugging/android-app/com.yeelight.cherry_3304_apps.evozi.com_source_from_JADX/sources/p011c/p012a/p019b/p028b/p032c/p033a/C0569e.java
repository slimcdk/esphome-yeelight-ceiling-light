package p011c.p012a.p019b.p028b.p032c.p033a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.a.b.b.c.a.e */
public abstract class C0569e extends C0566b implements C0568d {
    /* renamed from: a */
    public static C0568d m341a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C0568d ? (C0568d) queryLocalInterface : new C0570f(iBinder);
    }
}
