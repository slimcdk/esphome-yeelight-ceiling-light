package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.common.images.c */
public final class C1543c implements Parcelable.Creator<WebImage> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        Uri uri = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u == 2) {
                uri = (Uri) C1602a.m4422n(parcel, C, Uri.CREATOR);
            } else if (u == 3) {
                i2 = C1602a.m4400E(parcel, C);
            } else if (u != 4) {
                C1602a.m4405J(parcel, C);
            } else {
                i3 = C1602a.m4400E(parcel, C);
            }
        }
        C1602a.m4428t(parcel, K);
        return new WebImage(i, uri, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WebImage[i];
    }
}
