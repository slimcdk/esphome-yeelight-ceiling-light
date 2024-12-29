package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.common.internal.g0 */
public final class C1571g0 implements Parcelable.Creator<SignInButtonConfig> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u == 2) {
                i2 = C1602a.m4400E(parcel, C);
            } else if (u == 3) {
                i3 = C1602a.m4400E(parcel, C);
            } else if (u != 4) {
                C1602a.m4405J(parcel, C);
            } else {
                scopeArr = (Scope[]) C1602a.m4426r(parcel, C, Scope.CREATOR);
            }
        }
        C1602a.m4428t(parcel, K);
        return new SignInButtonConfig(i, i2, i3, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInButtonConfig[i];
    }
}
