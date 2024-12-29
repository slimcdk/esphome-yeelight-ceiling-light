package p036g0;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g0.e */
public abstract class C3211e extends C3208b implements C3212f {
    /* renamed from: c */
    public static C3212f m8641c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C3212f ? (C3212f) queryLocalInterface : new C3210d(iBinder);
    }
}
