package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ResolveAccountRequestCreator")
public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new C1567e0();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f2955a;
    @SafeParcelable.Field(getter = "getAccount", mo11280id = 2)

    /* renamed from: b */
    private final Account f2956b;
    @SafeParcelable.Field(getter = "getSessionId", mo11280id = 3)

    /* renamed from: c */
    private final int f2957c;
    @SafeParcelable.Field(getter = "getSignInAccountHint", mo11280id = 4)

    /* renamed from: d */
    private final GoogleSignInAccount f2958d;

    @SafeParcelable.Constructor
    ResolveAccountRequest(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) Account account, @SafeParcelable.Param(mo11283id = 3) int i2, @SafeParcelable.Param(mo11283id = 4) GoogleSignInAccount googleSignInAccount) {
        this.f2955a = i;
        this.f2956b = account;
        this.f2957c = i2;
        this.f2958d = googleSignInAccount;
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    /* renamed from: Q */
    public int mo11122Q() {
        return this.f2957c;
    }

    @Nullable
    /* renamed from: R */
    public GoogleSignInAccount mo11123R() {
        return this.f2958d;
    }

    /* renamed from: j */
    public Account mo11124j() {
        return this.f2956b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f2955a);
        C1604b.m4451q(parcel, 2, mo11124j(), i, false);
        C1604b.m4446l(parcel, 3, mo11122Q());
        C1604b.m4451q(parcel, 4, mo11123R(), i, false);
        C1604b.m4436b(parcel, a);
    }
}
