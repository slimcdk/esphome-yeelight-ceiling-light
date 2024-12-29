package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.wearable.internal.c */
public final class C1912c implements Parcelable.Creator<zzd> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        IBinder iBinder = null;
        IntentFilter[] intentFilterArr = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                iBinder = SafeParcelReader.m1456D(parcel, C);
            } else if (u == 3) {
                intentFilterArr = (IntentFilter[]) SafeParcelReader.m1482r(parcel, C, IntentFilter.CREATOR);
            } else if (u == 4) {
                str = SafeParcelReader.m1479o(parcel, C);
            } else if (u != 5) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                str2 = SafeParcelReader.m1479o(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzd(iBinder, intentFilterArr, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzd[i];
    }
}
