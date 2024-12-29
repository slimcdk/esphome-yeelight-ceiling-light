package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.stats.e */
public final class C1644e implements Parcelable.Creator<WakeLockEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int K = C1602a.m4406K(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            switch (C1602a.m4429u(C)) {
                case 1:
                    i = C1602a.m4400E(parcel2, C);
                    break;
                case 2:
                    j = C1602a.m4402G(parcel2, C);
                    break;
                case 4:
                    str = C1602a.m4423o(parcel2, C);
                    break;
                case 5:
                    i3 = C1602a.m4400E(parcel2, C);
                    break;
                case 6:
                    arrayList = C1602a.m4425q(parcel2, C);
                    break;
                case 8:
                    j2 = C1602a.m4402G(parcel2, C);
                    break;
                case 10:
                    str3 = C1602a.m4423o(parcel2, C);
                    break;
                case 11:
                    i2 = C1602a.m4400E(parcel2, C);
                    break;
                case 12:
                    str2 = C1602a.m4423o(parcel2, C);
                    break;
                case 13:
                    str4 = C1602a.m4423o(parcel2, C);
                    break;
                case 14:
                    i4 = C1602a.m4400E(parcel2, C);
                    break;
                case 15:
                    f = C1602a.m4396A(parcel2, C);
                    break;
                case 16:
                    j3 = C1602a.m4402G(parcel2, C);
                    break;
                case 17:
                    str5 = C1602a.m4423o(parcel2, C);
                    break;
                case 18:
                    z = C1602a.m4430v(parcel2, C);
                    break;
                default:
                    C1602a.m4405J(parcel2, C);
                    break;
            }
        }
        C1602a.m4428t(parcel2, K);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
