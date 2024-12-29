package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wearable.internal.l0 */
public final class C2472l0 implements Parcelable.Creator<zzea> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        ArrayList<zzfo> arrayList = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 2) {
                i = C1602a.m4400E(parcel, C);
            } else if (u != 3) {
                C1602a.m4405J(parcel, C);
            } else {
                arrayList = C1602a.m4427s(parcel, C, zzfo.CREATOR);
            }
        }
        C1602a.m4428t(parcel, K);
        return new zzea(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzea[i];
    }
}
