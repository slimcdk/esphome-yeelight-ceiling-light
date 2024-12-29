package p109w;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.C0996i;

/* renamed from: w.z */
public abstract class C3866z extends C0996i implements C3828a0 {
    /* renamed from: e */
    public static C3828a0 m10972e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof C3828a0 ? (C3828a0) queryLocalInterface : new C3865y(iBinder);
    }
}
