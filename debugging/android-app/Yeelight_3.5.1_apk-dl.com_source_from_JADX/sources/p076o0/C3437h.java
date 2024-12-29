package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzbi;

/* renamed from: o0.h */
public final class C3437h implements Parcelable.Creator<zzbi> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
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
                str3 = SafeParcelReader.m1479o(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzbi(str, str2, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzbi[i];
    }
}
