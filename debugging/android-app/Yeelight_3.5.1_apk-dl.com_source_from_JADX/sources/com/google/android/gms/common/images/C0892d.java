package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.images.d */
public final class C0892d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        Uri uri = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 2) {
                uri = (Uri) SafeParcelReader.m1478n(parcel, C, Uri.CREATOR);
            } else if (u == 3) {
                i2 = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 4) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                i3 = SafeParcelReader.m1457E(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new WebImage(i, uri, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WebImage[i];
    }
}
