package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.common.u */
public final class C1646u implements Parcelable.Creator<zzk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                str = C1602a.m4423o(parcel, C);
            } else if (u == 2) {
                iBinder = C1602a.m4399D(parcel, C);
            } else if (u == 3) {
                z = C1602a.m4430v(parcel, C);
            } else if (u != 4) {
                C1602a.m4405J(parcel, C);
            } else {
                z2 = C1602a.m4430v(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzk(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
