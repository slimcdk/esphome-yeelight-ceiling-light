package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.wearable.c */
public final class C1906c implements Parcelable.Creator<Asset> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        byte[] bArr = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                bArr = SafeParcelReader.m1471g(parcel, C);
            } else if (u == 3) {
                str = SafeParcelReader.m1479o(parcel, C);
            } else if (u == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m1478n(parcel, C, ParcelFileDescriptor.CREATOR);
            } else if (u != 5) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                uri = (Uri) SafeParcelReader.m1478n(parcel, C, Uri.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new Asset(bArr, str, parcelFileDescriptor, uri);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Asset[i];
    }
}
