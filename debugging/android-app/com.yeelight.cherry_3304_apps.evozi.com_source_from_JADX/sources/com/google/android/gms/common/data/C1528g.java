package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.common.data.g */
public final class C1528g implements Parcelable.Creator<BitmapTeleporter> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i2 = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) C1602a.m4422n(parcel, C, ParcelFileDescriptor.CREATOR);
            } else if (u != 3) {
                C1602a.m4405J(parcel, C);
            } else {
                i2 = C1602a.m4400E(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new BitmapTeleporter(i, parcelFileDescriptor, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BitmapTeleporter[i];
    }
}
