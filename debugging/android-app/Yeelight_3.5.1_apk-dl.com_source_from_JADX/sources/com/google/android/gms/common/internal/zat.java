package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p113x.C3897a;

@SafeParcelable.Class(creator = "ResolveAccountRequestCreator")
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new C0924o();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f1074a;
    @SafeParcelable.Field(getter = "getAccount", mo12312id = 2)

    /* renamed from: b */
    private final Account f1075b;
    @SafeParcelable.Field(getter = "getSessionId", mo12312id = 3)

    /* renamed from: c */
    private final int f1076c;
    @SafeParcelable.Field(getter = "getSignInAccountHint", mo12312id = 4)
    @Nullable

    /* renamed from: d */
    private final GoogleSignInAccount f1077d;

    @SafeParcelable.Constructor
    zat(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) Account account, @SafeParcelable.Param(mo12315id = 3) int i2, @SafeParcelable.Param(mo12315id = 4) @Nullable GoogleSignInAccount googleSignInAccount) {
        this.f1074a = i;
        this.f1075b = account;
        this.f1076c = i2;
        this.f1077d = googleSignInAccount;
    }

    public zat(Account account, int i, @Nullable GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f1074a);
        C3897a.m11121q(parcel, 2, this.f1075b, i, false);
        C3897a.m11116l(parcel, 3, this.f1076c);
        C3897a.m11121q(parcel, 4, this.f1077d, i, false);
        C3897a.m11106b(parcel, a);
    }
}
