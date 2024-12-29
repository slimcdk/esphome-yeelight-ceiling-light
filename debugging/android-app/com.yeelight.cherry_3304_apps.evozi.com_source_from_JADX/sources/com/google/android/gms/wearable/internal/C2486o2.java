package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.internal.o2 */
public final class C2486o2 implements Parcelable.Creator<zzl> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int K = C1602a.m4406K(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            switch (C1602a.m4429u(C)) {
                case 2:
                    i = C1602a.m4400E(parcel2, C);
                    break;
                case 3:
                    str = C1602a.m4423o(parcel2, C);
                    break;
                case 4:
                    str2 = C1602a.m4423o(parcel2, C);
                    break;
                case 5:
                    str3 = C1602a.m4423o(parcel2, C);
                    break;
                case 6:
                    str4 = C1602a.m4423o(parcel2, C);
                    break;
                case 7:
                    str5 = C1602a.m4423o(parcel2, C);
                    break;
                case 8:
                    str6 = C1602a.m4423o(parcel2, C);
                    break;
                case 9:
                    b = C1602a.m4432x(parcel2, C);
                    break;
                case 10:
                    b2 = C1602a.m4432x(parcel2, C);
                    break;
                case 11:
                    b3 = C1602a.m4432x(parcel2, C);
                    break;
                case 12:
                    b4 = C1602a.m4432x(parcel2, C);
                    break;
                case 13:
                    str7 = C1602a.m4423o(parcel2, C);
                    break;
                default:
                    C1602a.m4405J(parcel2, C);
                    break;
            }
        }
        C1602a.m4428t(parcel2, K);
        return new zzl(i, str, str2, str3, str4, str5, str6, b, b2, b3, b4, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
