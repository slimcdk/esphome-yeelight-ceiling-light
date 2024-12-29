package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1520d;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1584m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C1579j0();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f2944a;
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: b */
    private final int f2945b;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: c */
    private int f2946c;
    @SafeParcelable.Field(mo11280id = 4)

    /* renamed from: d */
    String f2947d;
    @SafeParcelable.Field(mo11280id = 5)

    /* renamed from: e */
    IBinder f2948e;
    @SafeParcelable.Field(mo11280id = 6)

    /* renamed from: f */
    Scope[] f2949f;
    @SafeParcelable.Field(mo11280id = 7)

    /* renamed from: g */
    Bundle f2950g;
    @SafeParcelable.Field(mo11280id = 8)

    /* renamed from: h */
    Account f2951h;
    @SafeParcelable.Field(mo11280id = 10)

    /* renamed from: i */
    Feature[] f2952i;
    @SafeParcelable.Field(mo11280id = 11)

    /* renamed from: j */
    Feature[] f2953j;
    @SafeParcelable.Field(mo11280id = 12)

    /* renamed from: k */
    private boolean f2954k;

    public GetServiceRequest(int i) {
        this.f2944a = 4;
        this.f2946c = C1520d.f2875a;
        this.f2945b = i;
        this.f2954k = true;
    }

    @SafeParcelable.Constructor
    GetServiceRequest(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) int i2, @SafeParcelable.Param(mo11283id = 3) int i3, @SafeParcelable.Param(mo11283id = 4) String str, @SafeParcelable.Param(mo11283id = 5) IBinder iBinder, @SafeParcelable.Param(mo11283id = 6) Scope[] scopeArr, @SafeParcelable.Param(mo11283id = 7) Bundle bundle, @SafeParcelable.Param(mo11283id = 8) Account account, @SafeParcelable.Param(mo11283id = 10) Feature[] featureArr, @SafeParcelable.Param(mo11283id = 11) Feature[] featureArr2, @SafeParcelable.Param(mo11283id = 12) boolean z) {
        this.f2944a = i;
        this.f2945b = i2;
        this.f2946c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f2947d = "com.google.android.gms";
        } else {
            this.f2947d = str;
        }
        if (i < 2) {
            this.f2951h = iBinder != null ? C1544a.m4197e(C1584m.C1585a.m4365c(iBinder)) : null;
        } else {
            this.f2948e = iBinder;
            this.f2951h = account;
        }
        this.f2949f = scopeArr;
        this.f2950g = bundle;
        this.f2952i = featureArr;
        this.f2953j = featureArr2;
        this.f2954k = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f2944a);
        C1604b.m4446l(parcel, 2, this.f2945b);
        C1604b.m4446l(parcel, 3, this.f2946c);
        C1604b.m4452r(parcel, 4, this.f2947d, false);
        C1604b.m4445k(parcel, 5, this.f2948e, false);
        C1604b.m4455u(parcel, 6, this.f2949f, i, false);
        C1604b.m4439e(parcel, 7, this.f2950g, false);
        C1604b.m4451q(parcel, 8, this.f2951h, i, false);
        C1604b.m4455u(parcel, 10, this.f2952i, i, false);
        C1604b.m4455u(parcel, 11, this.f2953j, i, false);
        C1604b.m4437c(parcel, 12, this.f2954k);
        C1604b.m4436b(parcel, a);
    }
}
