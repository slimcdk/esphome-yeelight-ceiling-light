package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.internal.g0 */
public final class C2452g0 implements Parcelable.Creator<zzdt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 2) {
                i = C1602a.m4400E(parcel, C);
            } else if (u == 3) {
                z = C1602a.m4430v(parcel, C);
            } else if (u != 4) {
                C1602a.m4405J(parcel, C);
            } else {
                z2 = C1602a.m4430v(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzdt(i, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdt[i];
    }
}
