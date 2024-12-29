package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.signin.internal.i */
public final class C2409i implements Parcelable.Creator<zaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        ConnectionResult connectionResult = null;
        ResolveAccountResponse resolveAccountResponse = null;
        int i = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u == 2) {
                connectionResult = (ConnectionResult) C1602a.m4422n(parcel, C, ConnectionResult.CREATOR);
            } else if (u != 3) {
                C1602a.m4405J(parcel, C);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) C1602a.m4422n(parcel, C, ResolveAccountResponse.CREATOR);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zaj(i, connectionResult, resolveAccountResponse);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaj[i];
    }
}
