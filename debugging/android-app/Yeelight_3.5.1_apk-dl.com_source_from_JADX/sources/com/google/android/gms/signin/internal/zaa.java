package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0744h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p113x.C3897a;

@SafeParcelable.Class(creator = "AuthAccountResultCreator")
public final class zaa extends AbstractSafeParcelable implements C0744h {
    public static final Parcelable.Creator<zaa> CREATOR = new C1868b();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f2895a;
    @SafeParcelable.Field(getter = "getConnectionResultCode", mo12312id = 2)

    /* renamed from: b */
    private int f2896b;
    @SafeParcelable.Field(getter = "getRawAuthResolutionIntent", mo12312id = 3)
    @Nullable

    /* renamed from: c */
    private Intent f2897c;

    public zaa() {
        this(2, 0, (Intent) null);
    }

    @SafeParcelable.Constructor
    zaa(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) int i2, @SafeParcelable.Param(mo12315id = 3) @Nullable Intent intent) {
        this.f2895a = i;
        this.f2896b = i2;
        this.f2897c = intent;
    }

    /* renamed from: N */
    public final Status mo11805N() {
        return this.f2896b == 0 ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f2895a);
        C3897a.m11116l(parcel, 2, this.f2896b);
        C3897a.m11121q(parcel, 3, this.f2897c, i, false);
        C3897a.m11106b(parcel, a);
    }
}
