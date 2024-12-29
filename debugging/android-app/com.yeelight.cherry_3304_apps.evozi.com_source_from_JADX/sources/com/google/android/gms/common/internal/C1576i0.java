package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.common.internal.i0 */
public final class C1576i0 implements Parcelable.Creator<zzb> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                bundle = C1602a.m4414f(parcel, C);
            } else if (u != 2) {
                C1602a.m4405J(parcel, C);
            } else {
                featureArr = (Feature[]) C1602a.m4426r(parcel, C, Feature.CREATOR);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzb(bundle, featureArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }
}
