package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C0911g;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p113x.C3897a;

@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new C0925p();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f1078a;
    @SafeParcelable.Field(mo12312id = 2)
    @Nullable

    /* renamed from: b */
    final IBinder f1079b;
    @SafeParcelable.Field(getter = "getConnectionResult", mo12312id = 3)

    /* renamed from: c */
    private final ConnectionResult f1080c;
    @SafeParcelable.Field(getter = "getSaveDefaultAccount", mo12312id = 4)

    /* renamed from: d */
    private final boolean f1081d;
    @SafeParcelable.Field(getter = "isFromCrossClientAuth", mo12312id = 5)

    /* renamed from: e */
    private final boolean f1082e;

    @SafeParcelable.Constructor
    zav(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) @Nullable IBinder iBinder, @SafeParcelable.Param(mo12315id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(mo12315id = 4) boolean z, @SafeParcelable.Param(mo12315id = 5) boolean z2) {
        this.f1078a = i;
        this.f1079b = iBinder;
        this.f1080c = connectionResult;
        this.f1081d = z;
        this.f1082e = z2;
    }

    /* renamed from: V */
    public final ConnectionResult mo12335V() {
        return this.f1080c;
    }

    @Nullable
    /* renamed from: W */
    public final C0911g mo12336W() {
        IBinder iBinder = this.f1079b;
        if (iBinder == null) {
            return null;
        }
        return C0911g.C0912a.m1394e(iBinder);
    }

    /* renamed from: c0 */
    public final boolean mo12337c0() {
        return this.f1081d;
    }

    /* renamed from: d0 */
    public final boolean mo12338d0() {
        return this.f1082e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zav = (zav) obj;
        return this.f1080c.equals(zav.f1080c) && C0914h.m1402a(mo12336W(), zav.mo12336W());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f1078a);
        C3897a.m11115k(parcel, 2, this.f1079b, false);
        C3897a.m11121q(parcel, 3, this.f1080c, i, false);
        C3897a.m11107c(parcel, 4, this.f1081d);
        C3897a.m11107c(parcel, 5, this.f1082e);
        C3897a.m11106b(parcel, a);
    }
}
