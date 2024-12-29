package com.google.android.gms.signin.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInResponseCreator")
public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaj> CREATOR = new C2409i();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f4820a;
    @SafeParcelable.Field(getter = "getConnectionResult", mo11280id = 2)

    /* renamed from: b */
    private final ConnectionResult f4821b;
    @SafeParcelable.Field(getter = "getResolveAccountResponse", mo11280id = 3)

    /* renamed from: c */
    private final ResolveAccountResponse f4822c;

    public zaj(int i) {
        this(new ConnectionResult(8, (PendingIntent) null), (ResolveAccountResponse) null);
    }

    @SafeParcelable.Constructor
    zaj(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) ConnectionResult connectionResult, @SafeParcelable.Param(mo11283id = 3) ResolveAccountResponse resolveAccountResponse) {
        this.f4820a = i;
        this.f4821b = connectionResult;
        this.f4822c = resolveAccountResponse;
    }

    private zaj(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, (ResolveAccountResponse) null);
    }

    /* renamed from: Q */
    public final ConnectionResult mo13179Q() {
        return this.f4821b;
    }

    /* renamed from: R */
    public final ResolveAccountResponse mo13180R() {
        return this.f4822c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f4820a);
        C1604b.m4451q(parcel, 2, this.f4821b, i, false);
        C1604b.m4451q(parcel, 3, this.f4822c, i, false);
        C1604b.m4436b(parcel, a);
    }
}
