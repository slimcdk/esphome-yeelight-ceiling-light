package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.wearable.internal.b */
public final class C1911b implements Parcelable.Creator<zzdd> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        Uri uri = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                uri = (Uri) SafeParcelReader.m1478n(parcel, C, Uri.CREATOR);
            } else if (u == 4) {
                bundle = SafeParcelReader.m1470f(parcel, C);
            } else if (u != 5) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                bArr = SafeParcelReader.m1471g(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzdd(uri, bundle, bArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzdd[i];
    }
}
