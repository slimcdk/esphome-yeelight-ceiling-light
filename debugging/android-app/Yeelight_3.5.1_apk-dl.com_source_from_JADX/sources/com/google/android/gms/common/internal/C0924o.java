package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.o */
public final class C0924o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 2) {
                account = (Account) SafeParcelReader.m1478n(parcel, C, Account.CREATOR);
            } else if (u == 3) {
                i2 = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 4) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m1478n(parcel, C, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zat(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zat[i];
    }
}
