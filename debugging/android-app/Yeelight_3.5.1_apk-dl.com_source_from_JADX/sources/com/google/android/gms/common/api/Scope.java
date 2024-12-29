package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p113x.C3897a;

@SafeParcelable.Class(creator = "ScopeCreator")
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new C0875n();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f511a;
    @SafeParcelable.Field(getter = "getScopeUri", mo12312id = 2)

    /* renamed from: b */
    private final String f512b;

    @SafeParcelable.Constructor
    Scope(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) String str) {
        C0917i.m1416g(str, "scopeUri must not be null or empty");
        this.f511a = i;
        this.f512b = str;
    }

    public Scope(@NonNull String str) {
        this(1, str);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: V */
    public String mo11800V() {
        return this.f512b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f512b.equals(((Scope) obj).f512b);
    }

    public int hashCode() {
        return this.f512b.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f512b;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f511a);
        C3897a.m11122r(parcel, 2, mo11800V(), false);
        C3897a.m11106b(parcel, a);
    }
}
