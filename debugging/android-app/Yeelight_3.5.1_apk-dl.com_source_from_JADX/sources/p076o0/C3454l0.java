package p076o0;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzei;

/* renamed from: o0.l0 */
public final class C3454l0 implements Parcelable.Creator<zzei> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m1478n(parcel, C, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzei(i, parcelFileDescriptor);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzei[i];
    }
}