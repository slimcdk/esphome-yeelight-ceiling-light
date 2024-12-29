package p120z;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* renamed from: z.d */
public final class C3922d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        Long l = null;
        Long l2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 2) {
                i2 = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 3) {
                l = SafeParcelReader.m1459G(parcel, C);
            } else if (u == 4) {
                l2 = SafeParcelReader.m1459G(parcel, C);
            } else if (u != 5) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                i3 = SafeParcelReader.m1457E(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new ModuleInstallStatusUpdate(i, i2, l, l2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ModuleInstallStatusUpdate[i];
    }
}
