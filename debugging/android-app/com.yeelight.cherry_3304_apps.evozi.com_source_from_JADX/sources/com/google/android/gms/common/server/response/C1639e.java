package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.common.server.response.e */
public final class C1639e implements Parcelable.Creator<SafeParcelResponse> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        Parcel parcel2 = null;
        zak zak = null;
        int i = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u == 2) {
                parcel2 = C1602a.m4420l(parcel, C);
            } else if (u != 3) {
                C1602a.m4405J(parcel, C);
            } else {
                zak = (zak) C1602a.m4422n(parcel, C, zak.CREATOR);
            }
        }
        C1602a.m4428t(parcel, K);
        return new SafeParcelResponse(i, parcel2, zak);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
