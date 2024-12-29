package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzek;
import com.google.android.gms.wearable.internal.zzfw;

/* renamed from: o0.m0 */
public final class C3458m0 implements Parcelable.Creator<zzek> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        zzfw zzfw = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                zzfw = (zzfw) SafeParcelReader.m1478n(parcel, C, zzfw.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzek(i, zzfw);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzek[i];
    }
}
