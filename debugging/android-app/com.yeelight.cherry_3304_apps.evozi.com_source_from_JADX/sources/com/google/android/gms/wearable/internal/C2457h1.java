package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.internal.h1 */
public final class C2457h1 implements Parcelable.Creator<zzfe> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 2) {
                i = C1602a.m4400E(parcel, C);
            } else if (u == 3) {
                str = C1602a.m4423o(parcel, C);
            } else if (u == 4) {
                bArr = C1602a.m4415g(parcel, C);
            } else if (u != 5) {
                C1602a.m4405J(parcel, C);
            } else {
                str2 = C1602a.m4423o(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzfe(i, str, bArr, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfe[i];
    }
}
