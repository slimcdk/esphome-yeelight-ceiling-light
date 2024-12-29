package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p113x.C3897a;

@SafeParcelable.Class(creator = "SignInButtonConfigCreator")
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new C0926q();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f1083a;
    @SafeParcelable.Field(getter = "getButtonSize", mo12312id = 2)

    /* renamed from: b */
    private final int f1084b;
    @SafeParcelable.Field(getter = "getColorScheme", mo12312id = 3)

    /* renamed from: c */
    private final int f1085c;
    @SafeParcelable.Field(getter = "getScopes", mo12312id = 4)
    @Deprecated
    @Nullable

    /* renamed from: d */
    private final Scope[] f1086d;

    @SafeParcelable.Constructor
    zax(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) int i2, @SafeParcelable.Param(mo12315id = 3) int i3, @SafeParcelable.Param(mo12315id = 4) @Nullable Scope[] scopeArr) {
        this.f1083a = i;
        this.f1084b = i2;
        this.f1085c = i3;
        this.f1086d = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f1083a);
        C3897a.m11116l(parcel, 2, this.f1084b);
        C3897a.m11116l(parcel, 3, this.f1085c);
        C3897a.m11125u(parcel, 4, this.f1086d, i, false);
        C3897a.m11106b(parcel, a);
    }
}
