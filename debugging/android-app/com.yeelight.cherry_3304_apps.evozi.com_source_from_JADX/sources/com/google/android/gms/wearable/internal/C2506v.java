package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.internal.v */
public final class C2506v implements Parcelable.Creator<DataItemAssetParcelable> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 2) {
                str = C1602a.m4423o(parcel, C);
            } else if (u != 3) {
                C1602a.m4405J(parcel, C);
            } else {
                str2 = C1602a.m4423o(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new DataItemAssetParcelable(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataItemAssetParcelable[i];
    }
}
