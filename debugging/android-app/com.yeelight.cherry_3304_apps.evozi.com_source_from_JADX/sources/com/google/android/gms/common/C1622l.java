package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.common.l */
public final class C1622l implements Parcelable.Creator<Feature> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                str = C1602a.m4423o(parcel, C);
            } else if (u == 2) {
                i = C1602a.m4400E(parcel, C);
            } else if (u != 3) {
                C1602a.m4405J(parcel, C);
            } else {
                j = C1602a.m4402G(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new Feature(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Feature[i];
    }
}
