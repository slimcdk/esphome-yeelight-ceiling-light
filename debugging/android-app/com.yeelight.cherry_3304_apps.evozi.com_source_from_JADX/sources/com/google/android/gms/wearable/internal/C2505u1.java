package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.internal.u1 */
public final class C2505u1 implements Parcelable.Creator<zzga> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 2) {
                i = C1602a.m4400E(parcel, C);
            } else if (u != 3) {
                C1602a.m4405J(parcel, C);
            } else {
                i2 = C1602a.m4400E(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzga(i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzga[i];
    }
}
