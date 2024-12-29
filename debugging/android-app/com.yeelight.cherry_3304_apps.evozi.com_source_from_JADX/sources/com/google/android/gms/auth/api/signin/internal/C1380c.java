package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.c */
public final class C1380c implements Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        Bundle bundle = null;
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
                bundle = C1602a.m4414f(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new GoogleSignInOptionsExtensionParcelable(i, i2, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptionsExtensionParcelable[i];
    }
}
