package p109w;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.internal.common.C0996i;
import com.google.android.gms.internal.common.C0997j;

/* renamed from: w.x */
public abstract class C3864x extends C0996i implements C3831c {
    public C3864x() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo12468c(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C0997j.m1653b(parcel);
            mo12330X(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C0997j.m1652a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            C0997j.m1653b(parcel);
            mo12329F(parcel.readInt(), (Bundle) C0997j.m1652a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            C0997j.m1653b(parcel);
            mo12331d0(parcel.readInt(), parcel.readStrongBinder(), (zzj) C0997j.m1652a(parcel, zzj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
