package p109w;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: w.e0 */
public final class C3837e0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            switch (SafeParcelReader.m1485u(C)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.m1478n(parcel, C, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.m1486v(parcel, C);
                    break;
                case 3:
                    z2 = SafeParcelReader.m1486v(parcel, C);
                    break;
                case 4:
                    iArr = SafeParcelReader.m1474j(parcel, C);
                    break;
                case 5:
                    i = SafeParcelReader.m1457E(parcel, C);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.m1474j(parcel, C);
                    break;
                default:
                    SafeParcelReader.m1461I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
