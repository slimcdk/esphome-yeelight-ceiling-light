package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.internal.measurement.d */
public final class C1745d implements Parcelable.Creator<zzaa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int K = C1602a.m4406K(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            switch (C1602a.m4429u(C)) {
                case 1:
                    j = C1602a.m4402G(parcel2, C);
                    break;
                case 2:
                    j2 = C1602a.m4402G(parcel2, C);
                    break;
                case 3:
                    z = C1602a.m4430v(parcel2, C);
                    break;
                case 4:
                    str = C1602a.m4423o(parcel2, C);
                    break;
                case 5:
                    str2 = C1602a.m4423o(parcel2, C);
                    break;
                case 6:
                    str3 = C1602a.m4423o(parcel2, C);
                    break;
                case 7:
                    bundle = C1602a.m4414f(parcel2, C);
                    break;
                default:
                    C1602a.m4405J(parcel2, C);
                    break;
            }
        }
        C1602a.m4428t(parcel2, K);
        return new zzaa(j, j2, z, str, str2, str3, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaa[i];
    }
}
