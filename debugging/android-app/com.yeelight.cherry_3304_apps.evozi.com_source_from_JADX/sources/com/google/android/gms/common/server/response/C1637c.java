package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.response.c */
public final class C1637c implements Parcelable.Creator<zak> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        ArrayList<zal> arrayList = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u == 2) {
                arrayList = C1602a.m4427s(parcel, C, zal.CREATOR);
            } else if (u != 3) {
                C1602a.m4405J(parcel, C);
            } else {
                str = C1602a.m4423o(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zak(i, arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
