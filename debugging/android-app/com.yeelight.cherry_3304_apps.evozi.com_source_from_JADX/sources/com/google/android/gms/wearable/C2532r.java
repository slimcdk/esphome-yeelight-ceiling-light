package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.wearable.r */
public final class C2532r implements Parcelable.Creator<ConnectionConfiguration> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            switch (C1602a.m4429u(C)) {
                case 2:
                    str = C1602a.m4423o(parcel, C);
                    break;
                case 3:
                    str2 = C1602a.m4423o(parcel, C);
                    break;
                case 4:
                    i = C1602a.m4400E(parcel, C);
                    break;
                case 5:
                    i2 = C1602a.m4400E(parcel, C);
                    break;
                case 6:
                    z = C1602a.m4430v(parcel, C);
                    break;
                case 7:
                    z2 = C1602a.m4430v(parcel, C);
                    break;
                case 8:
                    str3 = C1602a.m4423o(parcel, C);
                    break;
                case 9:
                    z3 = C1602a.m4430v(parcel, C);
                    break;
                case 10:
                    str4 = C1602a.m4423o(parcel, C);
                    break;
                default:
                    C1602a.m4405J(parcel, C);
                    break;
            }
        }
        C1602a.m4428t(parcel, K);
        return new ConnectionConfiguration(str, str2, i, i2, z, z2, str3, z3, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
