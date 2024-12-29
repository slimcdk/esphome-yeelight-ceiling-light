package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "FavaDiagnosticsEntityCreator")
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new C1630a();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f3111a;
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: b */
    private final String f3112b;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: c */
    private final int f3113c;

    @SafeParcelable.Constructor
    public FavaDiagnosticsEntity(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) int i2) {
        this.f3111a = i;
        this.f3112b = str;
        this.f3113c = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f3111a);
        C1604b.m4452r(parcel, 2, this.f3112b, false);
        C1604b.m4446l(parcel, 3, this.f3113c);
        C1604b.m4436b(parcel, a);
    }
}
