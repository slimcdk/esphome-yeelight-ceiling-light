package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzeg;

/* renamed from: o0.k0 */
public final class C3450k0 implements Parcelable.Creator<zzeg> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                str = SafeParcelReader.m1479o(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzeg(i, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzeg[i];
    }
}
