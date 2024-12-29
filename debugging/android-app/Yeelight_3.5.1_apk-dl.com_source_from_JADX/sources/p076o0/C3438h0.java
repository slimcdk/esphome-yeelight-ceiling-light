package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.zzea;

/* renamed from: o0.h0 */
public final class C3438h0 implements Parcelable.Creator<zzea> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        ConnectionConfiguration[] connectionConfigurationArr = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                connectionConfigurationArr = (ConnectionConfiguration[]) SafeParcelReader.m1482r(parcel, C, ConnectionConfiguration.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzea(i, connectionConfigurationArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzea[i];
    }
}
