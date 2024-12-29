package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.measurement.n1 */
public final class C1215n1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m1462J(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            switch (SafeParcelReader.m1485u(C)) {
                case 1:
                    j = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 2:
                    j2 = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 3:
                    z = SafeParcelReader.m1486v(parcel2, C);
                    break;
                case 4:
                    str = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 5:
                    str2 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 6:
                    str3 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 7:
                    bundle = SafeParcelReader.m1470f(parcel2, C);
                    break;
                case 8:
                    str4 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m1461I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m1484t(parcel2, J);
        return new zzcl(j, j2, z, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcl[i];
    }
}
