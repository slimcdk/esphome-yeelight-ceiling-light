package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.common.k */
public final class C1621k implements Parcelable.Creator<ConnectionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u == 2) {
                i2 = C1602a.m4400E(parcel, C);
            } else if (u == 3) {
                pendingIntent = (PendingIntent) C1602a.m4422n(parcel, C, PendingIntent.CREATOR);
            } else if (u != 4) {
                C1602a.m4405J(parcel, C);
            } else {
                str = C1602a.m4423o(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new ConnectionResult(i, i2, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
