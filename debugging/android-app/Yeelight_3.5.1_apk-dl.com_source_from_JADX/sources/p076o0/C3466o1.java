package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzdd;
import com.google.android.gms.wearable.internal.zzge;

/* renamed from: o0.o1 */
public final class C3466o1 implements Parcelable.Creator<zzge> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        zzdd zzdd = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                zzdd = (zzdd) SafeParcelReader.m1478n(parcel, C, zzdd.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzge(i, zzdd);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzge[i];
    }
}
