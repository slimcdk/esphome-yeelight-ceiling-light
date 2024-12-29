package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzgk;

/* renamed from: o0.q1 */
public final class C3472q1 implements Parcelable.Creator<zzgk> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 2) {
                i2 = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                bArr = SafeParcelReader.m1471g(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzgk(i, i2, bArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzgk[i];
    }
}
