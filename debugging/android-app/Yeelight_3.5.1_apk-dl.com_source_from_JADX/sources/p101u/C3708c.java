package p101u;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: u.c */
public final class C3708c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                str = SafeParcelReader.m1479o(parcel, C);
            } else if (u == 2) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                j = SafeParcelReader.m1458F(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new Feature(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Feature[i];
    }
}
