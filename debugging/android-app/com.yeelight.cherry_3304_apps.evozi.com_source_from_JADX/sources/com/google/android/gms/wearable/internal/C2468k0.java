package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.internal.k0 */
public final class C2468k0 implements Parcelable.Creator<zzd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        IBinder iBinder = null;
        IntentFilter[] intentFilterArr = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 2) {
                iBinder = C1602a.m4399D(parcel, C);
            } else if (u == 3) {
                intentFilterArr = (IntentFilter[]) C1602a.m4426r(parcel, C, IntentFilter.CREATOR);
            } else if (u == 4) {
                str = C1602a.m4423o(parcel, C);
            } else if (u != 5) {
                C1602a.m4405J(parcel, C);
            } else {
                str2 = C1602a.m4423o(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzd(iBinder, intentFilterArr, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzd[i];
    }
}
