package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.internal.g */
public final class C2451g implements Parcelable.Creator<zzaw> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        zzay zzay = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 2) {
                zzay = (zzay) C1602a.m4422n(parcel, C, zzay.CREATOR);
            } else if (u == 3) {
                i = C1602a.m4400E(parcel, C);
            } else if (u == 4) {
                i2 = C1602a.m4400E(parcel, C);
            } else if (u != 5) {
                C1602a.m4405J(parcel, C);
            } else {
                i3 = C1602a.m4400E(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzaw(zzay, i, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaw[i];
    }
}
