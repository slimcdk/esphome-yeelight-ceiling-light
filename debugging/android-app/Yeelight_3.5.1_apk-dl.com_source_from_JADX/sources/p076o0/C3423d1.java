package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzfj;

/* renamed from: o0.d1 */
public final class C3423d1 implements Parcelable.Creator<zzfj> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 3) {
                str = SafeParcelReader.m1479o(parcel, C);
            } else if (u == 4) {
                bArr = SafeParcelReader.m1471g(parcel, C);
            } else if (u != 5) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                str2 = SafeParcelReader.m1479o(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzfj(i, str, bArr, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzfj[i];
    }
}
