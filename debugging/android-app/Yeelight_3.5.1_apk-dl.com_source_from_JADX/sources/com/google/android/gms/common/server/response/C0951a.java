package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: com.google.android.gms.common.server.response.a */
public final class C0951a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        String str2 = null;
        zaa zaa = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            switch (SafeParcelReader.m1485u(C)) {
                case 1:
                    i = SafeParcelReader.m1457E(parcel, C);
                    break;
                case 2:
                    i2 = SafeParcelReader.m1457E(parcel, C);
                    break;
                case 3:
                    z = SafeParcelReader.m1486v(parcel, C);
                    break;
                case 4:
                    i3 = SafeParcelReader.m1457E(parcel, C);
                    break;
                case 5:
                    z2 = SafeParcelReader.m1486v(parcel, C);
                    break;
                case 6:
                    str = SafeParcelReader.m1479o(parcel, C);
                    break;
                case 7:
                    i4 = SafeParcelReader.m1457E(parcel, C);
                    break;
                case 8:
                    str2 = SafeParcelReader.m1479o(parcel, C);
                    break;
                case 9:
                    zaa = (zaa) SafeParcelReader.m1478n(parcel, C, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.m1461I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new FastJsonResponse.Field(i, i2, z, i3, z2, str, i4, str2, zaa);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
