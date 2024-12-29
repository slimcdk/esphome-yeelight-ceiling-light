package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzag;
import com.google.android.gms.wearable.internal.zzdk;

/* renamed from: o0.z */
public final class C3497z implements Parcelable.Creator<zzdk> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        zzag zzag = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                zzag = (zzag) SafeParcelReader.m1478n(parcel, C, zzag.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzdk(i, zzag);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzdk[i];
    }
}
