package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p010b0.C0579a;
import p113x.C3897a;

@KeepForSdk
@SafeParcelable.Class(creator = "FavaDiagnosticsEntityCreator")
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new C0579a();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f1116a;
    @SafeParcelable.Field(mo12312id = 2)
    @NonNull

    /* renamed from: b */
    public final String f1117b;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: c */
    public final int f1118c;

    @SafeParcelable.Constructor
    public FavaDiagnosticsEntity(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) @NonNull String str, @SafeParcelable.Param(mo12315id = 3) int i2) {
        this.f1116a = i;
        this.f1117b = str;
        this.f1118c = i2;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f1116a);
        C3897a.m11122r(parcel, 2, this.f1117b, false);
        C3897a.m11116l(parcel, 3, this.f1118c);
        C3897a.m11106b(parcel, a);
    }
}
