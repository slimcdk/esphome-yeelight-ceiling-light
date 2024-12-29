package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzga;

/* renamed from: o0.m1 */
public final class C3459m1 implements Parcelable.Creator<zzga> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        long j = 0;
        String str2 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                str = SafeParcelReader.m1479o(parcel, C);
            } else if (u == 3) {
                str2 = SafeParcelReader.m1479o(parcel, C);
            } else if (u != 4) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                j = SafeParcelReader.m1458F(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzga(str, str2, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzga[i];
    }
}
