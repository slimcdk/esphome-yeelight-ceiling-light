package p109w;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: w.c0 */
public final class C3832c0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 2) {
                z = SafeParcelReader.m1486v(parcel, C);
            } else if (u == 3) {
                z2 = SafeParcelReader.m1486v(parcel, C);
            } else if (u == 4) {
                i2 = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 5) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                i3 = SafeParcelReader.m1457E(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new RootTelemetryConfiguration(i, z, z2, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RootTelemetryConfiguration[i];
    }
}
