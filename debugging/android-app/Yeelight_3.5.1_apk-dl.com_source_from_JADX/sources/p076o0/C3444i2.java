package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzi;

/* renamed from: o0.i2 */
public final class C3444i2 implements Parcelable.Creator<zzi> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        byte b = 0;
        String str = null;
        byte b2 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                b = SafeParcelReader.m1488x(parcel, C);
            } else if (u == 3) {
                b2 = SafeParcelReader.m1488x(parcel, C);
            } else if (u != 4) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                str = SafeParcelReader.m1479o(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzi(b, b2, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzi[i];
    }
}
