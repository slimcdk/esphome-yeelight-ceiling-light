package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzga;
import com.google.android.gms.wearable.internal.zzgq;
import java.util.ArrayList;

/* renamed from: o0.t1 */
public final class C3481t1 implements Parcelable.Creator<zzgq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        long j = 0;
        ArrayList<zzga> arrayList = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 3) {
                j = SafeParcelReader.m1458F(parcel, C);
            } else if (u != 4) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                arrayList = SafeParcelReader.m1483s(parcel, C, zzga.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzgq(i, j, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzgq[i];
    }
}
