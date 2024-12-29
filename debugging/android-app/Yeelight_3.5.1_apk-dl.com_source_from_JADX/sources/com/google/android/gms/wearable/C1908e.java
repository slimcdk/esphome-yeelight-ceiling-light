package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.wearable.e */
public final class C1908e implements Parcelable.Creator<PutDataRequest> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        Uri uri = null;
        Bundle bundle = null;
        byte[] bArr = null;
        long j = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                uri = (Uri) SafeParcelReader.m1478n(parcel, C, Uri.CREATOR);
            } else if (u == 4) {
                bundle = SafeParcelReader.m1470f(parcel, C);
            } else if (u == 5) {
                bArr = SafeParcelReader.m1471g(parcel, C);
            } else if (u != 6) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                j = SafeParcelReader.m1458F(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new PutDataRequest(uri, bundle, bArr, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PutDataRequest[i];
    }
}
