package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p113x.C3897a;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMapPairCreator")
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new C0952b();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f1148a;
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: b */
    final String f1149b;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: c */
    final FastJsonResponse.Field f1150c;

    @SafeParcelable.Constructor
    zam(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) String str, @SafeParcelable.Param(mo12315id = 3) FastJsonResponse.Field field) {
        this.f1148a = i;
        this.f1149b = str;
        this.f1150c = field;
    }

    zam(String str, FastJsonResponse.Field field) {
        this.f1148a = 1;
        this.f1149b = str;
        this.f1150c = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f1148a);
        C3897a.m11122r(parcel, 2, this.f1149b, false);
        C3897a.m11121q(parcel, 3, this.f1150c, i, false);
        C3897a.m11106b(parcel, a);
    }
}
