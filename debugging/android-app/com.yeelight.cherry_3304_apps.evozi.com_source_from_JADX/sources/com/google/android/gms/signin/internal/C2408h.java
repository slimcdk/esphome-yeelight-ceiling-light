package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.signin.internal.h */
public final class C2408h implements Parcelable.Creator<zah> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u != 2) {
                C1602a.m4405J(parcel, C);
            } else {
                resolveAccountRequest = (ResolveAccountRequest) C1602a.m4422n(parcel, C, ResolveAccountRequest.CREATOR);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zah(i, resolveAccountRequest);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zah[i];
    }
}
