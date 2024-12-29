package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.internal.h */
public final class C2455h implements Parcelable.Creator<zzay> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 2) {
                str = C1602a.m4423o(parcel, C);
            } else if (u == 3) {
                str2 = C1602a.m4423o(parcel, C);
            } else if (u != 4) {
                C1602a.m4405J(parcel, C);
            } else {
                str3 = C1602a.m4423o(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzay(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzay[i];
    }
}
