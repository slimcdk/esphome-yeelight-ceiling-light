package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.internal.y */
public final class C2515y implements Parcelable.Creator<zzdd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        Uri uri = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 2) {
                uri = (Uri) C1602a.m4422n(parcel, C, Uri.CREATOR);
            } else if (u == 4) {
                bundle = C1602a.m4414f(parcel, C);
            } else if (u != 5) {
                C1602a.m4405J(parcel, C);
            } else {
                bArr = C1602a.m4415g(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzdd(uri, bundle, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdd[i];
    }
}
