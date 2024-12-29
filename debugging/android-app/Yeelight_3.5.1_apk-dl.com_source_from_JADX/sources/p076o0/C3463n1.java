package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzgc;

/* renamed from: o0.n1 */
public final class C3463n1 implements Parcelable.Creator<zzgc> {
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
        return new zzgc(i, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzgc[i];
    }
}
