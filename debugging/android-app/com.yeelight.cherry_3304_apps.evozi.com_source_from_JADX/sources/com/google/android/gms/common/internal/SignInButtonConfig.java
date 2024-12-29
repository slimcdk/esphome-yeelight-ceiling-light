package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInButtonConfigCreator")
public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInButtonConfig> CREATOR = new C1571g0();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f2964a;
    @SafeParcelable.Field(getter = "getButtonSize", mo11280id = 2)

    /* renamed from: b */
    private final int f2965b;
    @SafeParcelable.Field(getter = "getColorScheme", mo11280id = 3)

    /* renamed from: c */
    private final int f2966c;
    @SafeParcelable.Field(getter = "getScopes", mo11280id = 4)
    @Deprecated

    /* renamed from: d */
    private final Scope[] f2967d;

    @SafeParcelable.Constructor
    SignInButtonConfig(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) int i2, @SafeParcelable.Param(mo11283id = 3) int i3, @SafeParcelable.Param(mo11283id = 4) Scope[] scopeArr) {
        this.f2964a = i;
        this.f2965b = i2;
        this.f2966c = i3;
        this.f2967d = scopeArr;
    }

    /* renamed from: Q */
    public int mo11132Q() {
        return this.f2965b;
    }

    /* renamed from: R */
    public int mo11133R() {
        return this.f2966c;
    }

    @Deprecated
    /* renamed from: S */
    public Scope[] mo11134S() {
        return this.f2967d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f2964a);
        C1604b.m4446l(parcel, 2, mo11132Q());
        C1604b.m4446l(parcel, 3, mo11133R());
        C1604b.m4455u(parcel, 4, mo11134S(), i, false);
        C1604b.m4436b(parcel, a);
    }
}
