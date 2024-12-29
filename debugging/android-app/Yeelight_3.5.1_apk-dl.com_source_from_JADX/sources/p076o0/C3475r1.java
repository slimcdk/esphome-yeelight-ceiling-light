package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzgm;

/* renamed from: o0.r1 */
public final class C3475r1 implements Parcelable.Creator<zzgm> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                i2 = SafeParcelReader.m1457E(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzgm(i, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzgm[i];
    }
}
