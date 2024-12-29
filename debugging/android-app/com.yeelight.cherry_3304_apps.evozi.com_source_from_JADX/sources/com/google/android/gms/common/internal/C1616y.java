package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.common.internal.y */
public final class C1616y implements Parcelable.Creator<ClientIdentity> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u != 2) {
                C1602a.m4405J(parcel, C);
            } else {
                str = C1602a.m4423o(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new ClientIdentity(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientIdentity[i];
    }
}
