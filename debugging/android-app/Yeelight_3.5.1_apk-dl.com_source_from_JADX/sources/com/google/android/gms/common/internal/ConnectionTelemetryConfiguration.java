package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p109w.C3837e0;
import p113x.C3897a;

@KeepForSdk
@SafeParcelable.Class(creator = "ConnectionTelemetryConfigurationCreator")
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new C3837e0();
    @SafeParcelable.Field(getter = "getRootTelemetryConfiguration", mo12312id = 1)

    /* renamed from: a */
    private final RootTelemetryConfiguration f934a;
    @SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", mo12312id = 2)

    /* renamed from: b */
    private final boolean f935b;
    @SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", mo12312id = 3)

    /* renamed from: c */
    private final boolean f936c;
    @SafeParcelable.Field(getter = "getMethodInvocationMethodKeyAllowlist", mo12312id = 4)
    @Nullable

    /* renamed from: d */
    private final int[] f937d;
    @SafeParcelable.Field(getter = "getMaxMethodInvocationsLogged", mo12312id = 5)

    /* renamed from: e */
    private final int f938e;
    @SafeParcelable.Field(getter = "getMethodInvocationMethodKeyDisallowlist", mo12312id = 6)
    @Nullable

    /* renamed from: f */
    private final int[] f939f;

    @SafeParcelable.Constructor
    public ConnectionTelemetryConfiguration(@SafeParcelable.Param(mo12315id = 1) @NonNull RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.Param(mo12315id = 2) boolean z, @SafeParcelable.Param(mo12315id = 3) boolean z2, @SafeParcelable.Param(mo12315id = 4) @Nullable int[] iArr, @SafeParcelable.Param(mo12315id = 5) int i, @SafeParcelable.Param(mo12315id = 6) @Nullable int[] iArr2) {
        this.f934a = rootTelemetryConfiguration;
        this.f935b = z;
        this.f936c = z2;
        this.f937d = iArr;
        this.f938e = i;
        this.f939f = iArr2;
    }

    @KeepForSdk
    /* renamed from: V */
    public int mo12168V() {
        return this.f938e;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: W */
    public int[] mo12169W() {
        return this.f937d;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: c0 */
    public int[] mo12170c0() {
        return this.f939f;
    }

    @KeepForSdk
    /* renamed from: d0 */
    public boolean mo12171d0() {
        return this.f935b;
    }

    @KeepForSdk
    /* renamed from: f0 */
    public boolean mo12172f0() {
        return this.f936c;
    }

    @NonNull
    /* renamed from: g0 */
    public final RootTelemetryConfiguration mo12173g0() {
        return this.f934a;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11121q(parcel, 1, this.f934a, i, false);
        C3897a.m11107c(parcel, 2, mo12171d0());
        C3897a.m11107c(parcel, 3, mo12172f0());
        C3897a.m11117m(parcel, 4, mo12169W(), false);
        C3897a.m11116l(parcel, 5, mo12168V());
        C3897a.m11117m(parcel, 6, mo12170c0(), false);
        C3897a.m11106b(parcel, a);
    }
}
