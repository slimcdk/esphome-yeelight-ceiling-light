package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p113x.C3897a;

/* renamed from: com.google.android.gms.measurement.internal.ua */
public final class C1806ua implements Parcelable.Creator {
    /* renamed from: a */
    static void m4800a(zzlo zzlo, Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, zzlo.f2859a);
        C3897a.m11122r(parcel, 2, zzlo.f2860b, false);
        C3897a.m11118n(parcel, 3, zzlo.f2861c);
        C3897a.m11119o(parcel, 4, zzlo.f2862d, false);
        C3897a.m11114j(parcel, 5, (Float) null, false);
        C3897a.m11122r(parcel, 6, zzlo.f2863e, false);
        C3897a.m11122r(parcel, 7, zzlo.f2864f, false);
        C3897a.m11112h(parcel, 8, zzlo.f2865g, false);
        C3897a.m11106b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            switch (SafeParcelReader.m1485u(C)) {
                case 1:
                    i = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 2:
                    str = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 3:
                    j = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 4:
                    l = SafeParcelReader.m1459G(parcel2, C);
                    break;
                case 5:
                    f = SafeParcelReader.m1454B(parcel2, C);
                    break;
                case 6:
                    str2 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 7:
                    str3 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 8:
                    d = SafeParcelReader.m1490z(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m1461I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m1484t(parcel2, J);
        return new zzlo(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzlo[i];
    }
}
