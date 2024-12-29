package p120z;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;

/* renamed from: z.a */
public final class C3919a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                z = SafeParcelReader.m1486v(parcel, C);
            } else if (u != 2) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                i = SafeParcelReader.m1457E(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new ModuleAvailabilityResponse(z, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ModuleAvailabilityResponse[i];
    }
}
