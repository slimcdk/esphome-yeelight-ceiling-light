package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.measurement.internal.n */
public final class C2258n implements Parcelable.Creator<zzal> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            if (C1602a.m4429u(C) != 2) {
                C1602a.m4405J(parcel, C);
            } else {
                bundle = C1602a.m4414f(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzal(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzal[i];
    }
}
