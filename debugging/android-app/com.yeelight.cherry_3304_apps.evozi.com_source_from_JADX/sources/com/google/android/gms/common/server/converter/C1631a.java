package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.common.server.converter.a */
public final class C1631a implements Parcelable.Creator<zaa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        StringToIntConverter stringToIntConverter = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u != 2) {
                C1602a.m4405J(parcel, C);
            } else {
                stringToIntConverter = (StringToIntConverter) C1602a.m4422n(parcel, C, StringToIntConverter.CREATOR);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zaa(i, stringToIntConverter);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
