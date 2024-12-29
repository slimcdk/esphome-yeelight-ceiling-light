package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.common.api.s */
public final class C1516s implements Parcelable.Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i2 = C1602a.m4400E(parcel, C);
            } else if (u == 2) {
                str = C1602a.m4423o(parcel, C);
            } else if (u == 3) {
                pendingIntent = (PendingIntent) C1602a.m4422n(parcel, C, PendingIntent.CREATOR);
            } else if (u != 1000) {
                C1602a.m4405J(parcel, C);
            } else {
                i = C1602a.m4400E(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
