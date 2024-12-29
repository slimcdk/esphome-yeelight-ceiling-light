package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C1584m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new C1569f0();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f2959a;
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: b */
    private IBinder f2960b;
    @SafeParcelable.Field(getter = "getConnectionResult", mo11280id = 3)

    /* renamed from: c */
    private ConnectionResult f2961c;
    @SafeParcelable.Field(getter = "getSaveDefaultAccount", mo11280id = 4)

    /* renamed from: d */
    private boolean f2962d;
    @SafeParcelable.Field(getter = "isFromCrossClientAuth", mo11280id = 5)

    /* renamed from: e */
    private boolean f2963e;

    @SafeParcelable.Constructor
    ResolveAccountResponse(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) IBinder iBinder, @SafeParcelable.Param(mo11283id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(mo11283id = 4) boolean z, @SafeParcelable.Param(mo11283id = 5) boolean z2) {
        this.f2959a = i;
        this.f2960b = iBinder;
        this.f2961c = connectionResult;
        this.f2962d = z;
        this.f2963e = z2;
    }

    /* renamed from: Q */
    public C1584m mo11126Q() {
        return C1584m.C1585a.m4365c(this.f2960b);
    }

    /* renamed from: R */
    public ConnectionResult mo11127R() {
        return this.f2961c;
    }

    /* renamed from: S */
    public boolean mo11128S() {
        return this.f2962d;
    }

    /* renamed from: T */
    public boolean mo11129T() {
        return this.f2963e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f2961c.equals(resolveAccountResponse.f2961c) && mo11126Q().equals(resolveAccountResponse.mo11126Q());
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f2959a);
        C1604b.m4445k(parcel, 2, this.f2960b, false);
        C1604b.m4451q(parcel, 3, mo11127R(), i, false);
        C1604b.m4437c(parcel, 4, mo11128S());
        C1604b.m4437c(parcel, 5, mo11129T());
        C1604b.m4436b(parcel, a);
    }
}
