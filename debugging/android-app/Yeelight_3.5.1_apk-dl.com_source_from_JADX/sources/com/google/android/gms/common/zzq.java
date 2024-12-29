package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupResponseCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C0958t();
    @SafeParcelable.Field(getter = "getResult", mo12312id = 1)

    /* renamed from: a */
    private final boolean f1185a;
    @SafeParcelable.Field(getter = "getErrorMessage", mo12312id = 2)
    @Nullable

    /* renamed from: b */
    private final String f1186b;
    @SafeParcelable.Field(getter = "getStatusValue", mo12312id = 3)

    /* renamed from: c */
    private final int f1187c;
    @SafeParcelable.Field(getter = "getFirstPartyStatusValue", mo12312id = 4)

    /* renamed from: d */
    private final int f1188d;

    @SafeParcelable.Constructor
    zzq(@SafeParcelable.Param(mo12315id = 1) boolean z, @SafeParcelable.Param(mo12315id = 2) String str, @SafeParcelable.Param(mo12315id = 3) int i, @SafeParcelable.Param(mo12315id = 4) int i2) {
        this.f1185a = z;
        this.f1186b = str;
        this.f1187c = C0965x.m1599a(i) - 1;
        this.f1188d = C0887h.m1252a(i2) - 1;
    }

    @Nullable
    /* renamed from: V */
    public final String mo12435V() {
        return this.f1186b;
    }

    /* renamed from: W */
    public final boolean mo12436W() {
        return this.f1185a;
    }

    /* renamed from: c0 */
    public final int mo12437c0() {
        return C0887h.m1252a(this.f1188d);
    }

    /* renamed from: d0 */
    public final int mo12438d0() {
        return C0965x.m1599a(this.f1187c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11107c(parcel, 1, this.f1185a);
        C3897a.m11122r(parcel, 2, this.f1186b, false);
        C3897a.m11116l(parcel, 3, this.f1187c);
        C3897a.m11116l(parcel, 4, this.f1188d);
        C3897a.m11106b(parcel, a);
    }
}
