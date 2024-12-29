package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.measurement.internal.r9 */
public final class C2312r9 implements Parcelable.Creator<zzkn> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int K = C1602a.m4406K(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            switch (C1602a.m4429u(C)) {
                case 1:
                    i = C1602a.m4400E(parcel2, C);
                    break;
                case 2:
                    str = C1602a.m4423o(parcel2, C);
                    break;
                case 3:
                    j = C1602a.m4402G(parcel2, C);
                    break;
                case 4:
                    l = C1602a.m4403H(parcel2, C);
                    break;
                case 5:
                    f = C1602a.m4397B(parcel2, C);
                    break;
                case 6:
                    str2 = C1602a.m4423o(parcel2, C);
                    break;
                case 7:
                    str3 = C1602a.m4423o(parcel2, C);
                    break;
                case 8:
                    d = C1602a.m4434z(parcel2, C);
                    break;
                default:
                    C1602a.m4405J(parcel2, C);
                    break;
            }
        }
        C1602a.m4428t(parcel2, K);
        return new zzkn(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzkn[i];
    }
}
