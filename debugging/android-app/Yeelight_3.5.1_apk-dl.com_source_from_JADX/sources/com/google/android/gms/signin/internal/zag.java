package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0744h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import p060l0.C3309d;
import p113x.C3897a;

@SafeParcelable.Class(creator = "RecordConsentByConsentResultResponseCreator")
public final class zag extends AbstractSafeParcelable implements C0744h {
    public static final Parcelable.Creator<zag> CREATOR = new C3309d();
    @SafeParcelable.Field(getter = "getGrantedScopes", mo12312id = 1)

    /* renamed from: a */
    private final List f2898a;
    @SafeParcelable.Field(getter = "getToken", mo12312id = 2)
    @Nullable

    /* renamed from: b */
    private final String f2899b;

    @SafeParcelable.Constructor
    public zag(@SafeParcelable.Param(mo12315id = 1) List list, @SafeParcelable.Param(mo12315id = 2) @Nullable String str) {
        this.f2898a = list;
        this.f2899b = str;
    }

    /* renamed from: N */
    public final Status mo11805N() {
        return this.f2899b != null ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11124t(parcel, 1, this.f2898a, false);
        C3897a.m11122r(parcel, 2, this.f2899b, false);
        C3897a.m11106b(parcel, a);
    }
}
