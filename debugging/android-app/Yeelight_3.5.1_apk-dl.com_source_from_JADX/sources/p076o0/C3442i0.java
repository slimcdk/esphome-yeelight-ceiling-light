package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzec;
import com.google.android.gms.wearable.internal.zzfw;
import java.util.ArrayList;

/* renamed from: o0.i0 */
public final class C3442i0 implements Parcelable.Creator<zzec> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        ArrayList<zzfw> arrayList = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                arrayList = SafeParcelReader.m1483s(parcel, C, zzfw.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzec(i, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzec[i];
    }
}