package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.c0 */
public final class C0903c0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                bundle = SafeParcelReader.m1470f(parcel, C);
            } else if (u == 2) {
                featureArr = (Feature[]) SafeParcelReader.m1482r(parcel, C, Feature.CREATOR);
            } else if (u == 3) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 4) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.m1478n(parcel, C, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzj(bundle, featureArr, i, connectionTelemetryConfiguration);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
