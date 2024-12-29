package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: com.google.android.gms.common.server.response.b */
public final class C1636b implements Parcelable.Creator<zam> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        String str = null;
        FastJsonResponse.Field field = null;
        int i = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u == 2) {
                str = C1602a.m4423o(parcel, C);
            } else if (u != 3) {
                C1602a.m4405J(parcel, C);
            } else {
                field = (FastJsonResponse.Field) C1602a.m4422n(parcel, C, FastJsonResponse.Field.CREATOR);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zam(i, str, field);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zam[i];
    }
}
