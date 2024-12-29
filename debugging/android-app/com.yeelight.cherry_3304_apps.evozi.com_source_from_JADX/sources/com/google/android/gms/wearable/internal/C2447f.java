package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wearable.internal.f */
public final class C2447f implements Parcelable.Creator<zzah> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        String str = null;
        ArrayList<zzfo> arrayList = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 2) {
                str = C1602a.m4423o(parcel, C);
            } else if (u != 3) {
                C1602a.m4405J(parcel, C);
            } else {
                arrayList = C1602a.m4427s(parcel, C, zzfo.CREATOR);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzah(str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzah[i];
    }
}
