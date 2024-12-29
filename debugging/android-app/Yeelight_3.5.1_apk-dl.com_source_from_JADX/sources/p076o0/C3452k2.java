package p076o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.internal.zzl;

/* renamed from: o0.k2 */
public final class C3452k2 implements Parcelable.Creator<zzl> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            switch (SafeParcelReader.m1485u(C)) {
                case 2:
                    i = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 3:
                    str = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 4:
                    str2 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 5:
                    str3 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 6:
                    str4 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 7:
                    str5 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 8:
                    str6 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 9:
                    b = SafeParcelReader.m1488x(parcel2, C);
                    break;
                case 10:
                    b2 = SafeParcelReader.m1488x(parcel2, C);
                    break;
                case 11:
                    b3 = SafeParcelReader.m1488x(parcel2, C);
                    break;
                case 12:
                    b4 = SafeParcelReader.m1488x(parcel2, C);
                    break;
                case 13:
                    str7 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m1461I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m1484t(parcel2, J);
        return new zzl(i, str, str2, str3, str4, str5, str6, b, b2, b3, b4, str7);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
