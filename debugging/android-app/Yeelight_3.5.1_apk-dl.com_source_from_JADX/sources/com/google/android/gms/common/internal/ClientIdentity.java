package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.xiaomi.mipush.sdk.Constants;
import p109w.C3847j;
import p113x.C3897a;

@KeepForSdk
@SafeParcelable.Class(creator = "ClientIdentityCreator")
@SafeParcelable.Reserved({1000})
public class ClientIdentity extends AbstractSafeParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C3847j();
    @SafeParcelable.Field(defaultValueUnchecked = "0", mo12312id = 1)
    @KeepForSdk

    /* renamed from: a */
    public final int f932a;
    @SafeParcelable.Field(defaultValueUnchecked = "null", mo12312id = 2)
    @KeepForSdk
    @Nullable

    /* renamed from: b */
    public final String f933b;

    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) @Nullable String str) {
        this.f932a = i;
        this.f933b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f932a == this.f932a && C0914h.m1402a(clientIdentity.f933b, this.f933b);
    }

    public final int hashCode() {
        return this.f932a;
    }

    @NonNull
    public final String toString() {
        int i = this.f932a;
        String str = this.f933b;
        return i + Constants.COLON_SEPARATOR + str;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f932a);
        C3897a.m11122r(parcel, 2, this.f933b, false);
        C3897a.m11106b(parcel, a);
    }
}
