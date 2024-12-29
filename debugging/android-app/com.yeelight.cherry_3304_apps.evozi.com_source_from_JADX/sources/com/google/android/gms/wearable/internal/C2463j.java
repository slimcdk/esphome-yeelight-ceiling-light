package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.internal.j */
public final class C2463j implements Parcelable.Creator<zzbp> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            if (C1602a.m4429u(C) != 2) {
                C1602a.m4405J(parcel, C);
            } else {
                i = C1602a.m4400E(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzbp(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbp[i];
    }
}
