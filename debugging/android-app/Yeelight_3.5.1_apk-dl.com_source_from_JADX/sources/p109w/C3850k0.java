package p109w;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.C0996i;
import com.google.android.gms.internal.common.C0997j;
import p032f0.C3155a;

/* renamed from: w.k0 */
public abstract class C3850k0 extends C0996i implements C3852l0 {
    public C3850k0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: e */
    public static C3852l0 m10954e(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof C3852l0 ? (C3852l0) queryLocalInterface : new C3848j0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo12468c(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C3155a b = mo12362b();
            parcel2.writeNoException();
            C0997j.m1656e(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            int E = mo12360E();
            parcel2.writeNoException();
            parcel2.writeInt(E);
        }
        return true;
    }
}
