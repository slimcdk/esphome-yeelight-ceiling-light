package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.q */
public final class C2531q implements Parcelable.Creator<Asset> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        byte[] bArr = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 2) {
                bArr = C1602a.m4415g(parcel, C);
            } else if (u == 3) {
                str = C1602a.m4423o(parcel, C);
            } else if (u == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) C1602a.m4422n(parcel, C, ParcelFileDescriptor.CREATOR);
            } else if (u != 5) {
                C1602a.m4405J(parcel, C);
            } else {
                uri = (Uri) C1602a.m4422n(parcel, C, Uri.CREATOR);
            }
        }
        C1602a.m4428t(parcel, K);
        return new Asset(bArr, str, parcelFileDescriptor, uri);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Asset[i];
    }
}
