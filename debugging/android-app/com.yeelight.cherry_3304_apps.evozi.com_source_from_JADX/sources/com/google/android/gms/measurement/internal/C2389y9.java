package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.y9 */
public final class C2389y9 implements Parcelable.Creator<zzm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int K = C1602a.m4406K(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            switch (C1602a.m4429u(C)) {
                case 2:
                    str = C1602a.m4423o(parcel2, C);
                    break;
                case 3:
                    str2 = C1602a.m4423o(parcel2, C);
                    break;
                case 4:
                    str3 = C1602a.m4423o(parcel2, C);
                    break;
                case 5:
                    str4 = C1602a.m4423o(parcel2, C);
                    break;
                case 6:
                    j = C1602a.m4402G(parcel2, C);
                    break;
                case 7:
                    j2 = C1602a.m4402G(parcel2, C);
                    break;
                case 8:
                    str5 = C1602a.m4423o(parcel2, C);
                    break;
                case 9:
                    z = C1602a.m4430v(parcel2, C);
                    break;
                case 10:
                    z2 = C1602a.m4430v(parcel2, C);
                    break;
                case 11:
                    j6 = C1602a.m4402G(parcel2, C);
                    break;
                case 12:
                    str6 = C1602a.m4423o(parcel2, C);
                    break;
                case 13:
                    j3 = C1602a.m4402G(parcel2, C);
                    break;
                case 14:
                    j4 = C1602a.m4402G(parcel2, C);
                    break;
                case 15:
                    i = C1602a.m4400E(parcel2, C);
                    break;
                case 16:
                    z3 = C1602a.m4430v(parcel2, C);
                    break;
                case 17:
                    z4 = C1602a.m4430v(parcel2, C);
                    break;
                case 18:
                    z5 = C1602a.m4430v(parcel2, C);
                    break;
                case 19:
                    str7 = C1602a.m4423o(parcel2, C);
                    break;
                case 21:
                    bool = C1602a.m4431w(parcel2, C);
                    break;
                case 22:
                    j5 = C1602a.m4402G(parcel2, C);
                    break;
                case 23:
                    arrayList = C1602a.m4425q(parcel2, C);
                    break;
                case 24:
                    str8 = C1602a.m4423o(parcel2, C);
                    break;
                default:
                    C1602a.m4405J(parcel2, C);
                    break;
            }
        }
        C1602a.m4428t(parcel2, K);
        return new zzm(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, (List<String>) arrayList, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
