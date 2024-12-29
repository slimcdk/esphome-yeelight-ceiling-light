package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AuthAccountRequestCreator")
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new C1615x();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f2935a;
    @SafeParcelable.Field(mo11280id = 2)
    @Deprecated

    /* renamed from: b */
    private final IBinder f2936b;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: c */
    private final Scope[] f2937c;
    @SafeParcelable.Field(mo11280id = 4)

    /* renamed from: d */
    private Integer f2938d;
    @SafeParcelable.Field(mo11280id = 5)

    /* renamed from: e */
    private Integer f2939e;
    @SafeParcelable.Field(mo11280id = 6, type = "android.accounts.Account")

    /* renamed from: f */
    private Account f2940f;

    @SafeParcelable.Constructor
    AuthAccountRequest(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) IBinder iBinder, @SafeParcelable.Param(mo11283id = 3) Scope[] scopeArr, @SafeParcelable.Param(mo11283id = 4) Integer num, @SafeParcelable.Param(mo11283id = 5) Integer num2, @SafeParcelable.Param(mo11283id = 6) Account account) {
        this.f2935a = i;
        this.f2936b = iBinder;
        this.f2937c = scopeArr;
        this.f2938d = num;
        this.f2939e = num2;
        this.f2940f = account;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f2935a);
        C1604b.m4445k(parcel, 2, this.f2936b, false);
        C1604b.m4455u(parcel, 3, this.f2937c, i, false);
        C1604b.m4447m(parcel, 4, this.f2938d, false);
        C1604b.m4447m(parcel, 5, this.f2939e, false);
        C1604b.m4451q(parcel, 6, this.f2940f, i, false);
        C1604b.m4436b(parcel, a);
    }
}
