package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzbq;

/* renamed from: o0.j */
public final class C3445j implements Parcelable.Creator<zzbq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            if (SafeParcelReader.m1485u(C) != 2) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                i = SafeParcelReader.m1457E(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzbq(i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzbq[i];
    }
}