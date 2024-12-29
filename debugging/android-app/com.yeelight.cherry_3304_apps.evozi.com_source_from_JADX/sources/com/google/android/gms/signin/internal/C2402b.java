package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.signin.internal.b */
public final class C2402b implements Parcelable.Creator<zaa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u == 2) {
                i2 = C1602a.m4400E(parcel, C);
            } else if (u != 3) {
                C1602a.m4405J(parcel, C);
            } else {
                intent = (Intent) C1602a.m4422n(parcel, C, Intent.CREATOR);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zaa(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
