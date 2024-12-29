package p109w;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: w.t */
public final class C3860t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            switch (SafeParcelReader.m1485u(C)) {
                case 1:
                    i = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 2:
                    i2 = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 3:
                    i3 = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 4:
                    j = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 5:
                    j2 = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 6:
                    str = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 7:
                    str2 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 8:
                    i4 = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 9:
                    i5 = SafeParcelReader.m1457E(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m1461I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m1484t(parcel2, J);
        return new MethodInvocation(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
