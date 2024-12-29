package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.internal.r1 */
public final class C2496r1 implements Parcelable.Creator<zzfw> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u != 2) {
                C1602a.m4405J(parcel, C);
            } else {
                iBinder = C1602a.m4399D(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzfw(i, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfw[i];
    }
}
