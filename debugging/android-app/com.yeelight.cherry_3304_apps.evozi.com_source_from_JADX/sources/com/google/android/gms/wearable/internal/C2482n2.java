package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.internal.n2 */
public final class C2482n2 implements Parcelable.Creator<zzi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        byte b = 0;
        String str = null;
        byte b2 = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 2) {
                b = C1602a.m4432x(parcel, C);
            } else if (u == 3) {
                b2 = C1602a.m4432x(parcel, C);
            } else if (u != 4) {
                C1602a.m4405J(parcel, C);
            } else {
                str = C1602a.m4423o(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzi(b, b2, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzi[i];
    }
}
