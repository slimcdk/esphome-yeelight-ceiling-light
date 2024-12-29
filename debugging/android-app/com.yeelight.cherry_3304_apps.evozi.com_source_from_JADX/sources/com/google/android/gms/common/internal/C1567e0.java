package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.C1602a;

/* renamed from: com.google.android.gms.common.internal.e0 */
public final class C1567e0 implements Parcelable.Creator<ResolveAccountRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u == 2) {
                account = (Account) C1602a.m4422n(parcel, C, Account.CREATOR);
            } else if (u == 3) {
                i2 = C1602a.m4400E(parcel, C);
            } else if (u != 4) {
                C1602a.m4405J(parcel, C);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C1602a.m4422n(parcel, C, GoogleSignInAccount.CREATOR);
            }
        }
        C1602a.m4428t(parcel, K);
        return new ResolveAccountRequest(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }
}
