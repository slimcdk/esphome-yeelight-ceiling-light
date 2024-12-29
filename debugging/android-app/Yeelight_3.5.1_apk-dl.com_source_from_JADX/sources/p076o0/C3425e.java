package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzag;
import com.google.android.gms.wearable.internal.zzfw;
import java.util.ArrayList;

/* renamed from: o0.e */
public final class C3425e implements Parcelable.Creator<zzag> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        ArrayList<zzfw> arrayList = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                str = SafeParcelReader.m1479o(parcel, C);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                arrayList = SafeParcelReader.m1483s(parcel, C, zzfw.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzag(str, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzag[i];
    }
}
