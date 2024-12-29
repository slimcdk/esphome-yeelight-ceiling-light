package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.c */
public final class C0717c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        ArrayList<Scope> arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            switch (SafeParcelReader.m1485u(C)) {
                case 1:
                    i = SafeParcelReader.m1457E(parcel, C);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m1483s(parcel, C, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m1478n(parcel, C, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m1486v(parcel, C);
                    break;
                case 5:
                    z2 = SafeParcelReader.m1486v(parcel, C);
                    break;
                case 6:
                    z3 = SafeParcelReader.m1486v(parcel, C);
                    break;
                case 7:
                    str = SafeParcelReader.m1479o(parcel, C);
                    break;
                case 8:
                    str2 = SafeParcelReader.m1479o(parcel, C);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m1483s(parcel, C, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.m1479o(parcel, C);
                    break;
                default:
                    SafeParcelReader.m1461I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new GoogleSignInOptions(i, (ArrayList) arrayList, account, z, z2, z3, str, str2, (ArrayList) arrayList2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
