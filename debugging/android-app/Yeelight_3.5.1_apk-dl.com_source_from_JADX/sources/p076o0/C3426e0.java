package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzdv;

/* renamed from: o0.e0 */
public final class C3426e0 implements Parcelable.Creator<zzdv> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                z = SafeParcelReader.m1486v(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzdv(i, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzdv[i];
    }
}
