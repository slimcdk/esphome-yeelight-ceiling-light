package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMapPairCreator")
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new C1636b();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f3146a;
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: b */
    final String f3147b;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: c */
    final FastJsonResponse.Field<?, ?> f3148c;

    @SafeParcelable.Constructor
    zam(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) FastJsonResponse.Field<?, ?> field) {
        this.f3146a = i;
        this.f3147b = str;
        this.f3148c = field;
    }

    zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.f3146a = 1;
        this.f3147b = str;
        this.f3148c = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f3146a);
        C1604b.m4452r(parcel, 2, this.f3147b, false);
        C1604b.m4451q(parcel, 3, this.f3148c, i, false);
        C1604b.m4436b(parcel, a);
    }
}
