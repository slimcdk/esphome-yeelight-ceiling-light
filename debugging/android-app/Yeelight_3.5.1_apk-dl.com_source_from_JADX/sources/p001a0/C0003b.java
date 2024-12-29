package p001a0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.ArrayList;

/* renamed from: a0.b */
public final class C0003b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        ArrayList<Feature> arrayList = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                arrayList = SafeParcelReader.m1483s(parcel, C, Feature.CREATOR);
            } else if (u == 2) {
                z = SafeParcelReader.m1486v(parcel, C);
            } else if (u == 3) {
                str = SafeParcelReader.m1479o(parcel, C);
            } else if (u != 4) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                str2 = SafeParcelReader.m1479o(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new ApiFeatureRequest(arrayList, z, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ApiFeatureRequest[i];
    }
}
