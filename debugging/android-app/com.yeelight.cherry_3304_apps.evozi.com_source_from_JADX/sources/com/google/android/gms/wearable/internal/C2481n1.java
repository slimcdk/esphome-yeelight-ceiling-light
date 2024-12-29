package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.internal.n1 */
public final class C2481n1 implements Parcelable.Creator<zzfo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        boolean z = false;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 2) {
                str = C1602a.m4423o(parcel, C);
            } else if (u == 3) {
                str2 = C1602a.m4423o(parcel, C);
            } else if (u == 4) {
                i = C1602a.m4400E(parcel, C);
            } else if (u != 5) {
                C1602a.m4405J(parcel, C);
            } else {
                z = C1602a.m4430v(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzfo(str, str2, i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfo[i];
    }
}
