package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.C0988a;
import com.google.android.gms.internal.common.C0997j;

/* renamed from: com.google.android.gms.common.internal.i0 */
public final class C0918i0 extends C0988a implements C0911g {
    C0918i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    /* renamed from: D */
    public final Account mo12278D() {
        Parcel c = mo12458c(2, mo12459e());
        Account account = (Account) C0997j.m1652a(c, Account.CREATOR);
        c.recycle();
        return account;
    }
}
