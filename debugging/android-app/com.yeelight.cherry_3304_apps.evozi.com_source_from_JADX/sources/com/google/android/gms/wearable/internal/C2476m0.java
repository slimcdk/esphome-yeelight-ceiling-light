package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.internal.m0 */
public final class C2476m0 implements Parcelable.Creator<zzec> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        zzdd zzdd = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 2) {
                i = C1602a.m4400E(parcel, C);
            } else if (u != 3) {
                C1602a.m4405J(parcel, C);
            } else {
                zzdd = (zzdd) C1602a.m4422n(parcel, C, zzdd.CREATOR);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzec(i, zzdd);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzec[i];
    }
}
