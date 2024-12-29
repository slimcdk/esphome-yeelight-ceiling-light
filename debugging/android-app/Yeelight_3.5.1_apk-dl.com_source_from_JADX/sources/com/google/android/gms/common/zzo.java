package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p032f0.C3155a;
import p032f0.C3157b;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C0946s();
    @SafeParcelable.Field(getter = "getCallingPackage", mo12312id = 1)

    /* renamed from: a */
    private final String f1180a;
    @SafeParcelable.Field(getter = "getAllowTestKeys", mo12312id = 2)

    /* renamed from: b */
    private final boolean f1181b;
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", mo12312id = 3)

    /* renamed from: c */
    private final boolean f1182c;
    @SafeParcelable.Field(getter = "getCallingContextBinder", mo12312id = 4, type = "android.os.IBinder")

    /* renamed from: d */
    private final Context f1183d;
    @SafeParcelable.Field(getter = "getIsChimeraPackage", mo12312id = 5)

    /* renamed from: e */
    private final boolean f1184e;

    @SafeParcelable.Constructor
    zzo(@SafeParcelable.Param(mo12315id = 1) String str, @SafeParcelable.Param(mo12315id = 2) boolean z, @SafeParcelable.Param(mo12315id = 3) boolean z2, @SafeParcelable.Param(mo12315id = 4) IBinder iBinder, @SafeParcelable.Param(mo12315id = 5) boolean z3) {
        this.f1180a = str;
        this.f1181b = z;
        this.f1182c = z2;
        this.f1183d = (Context) C3157b.m8428f(C3155a.C3156a.m8426e(iBinder));
        this.f1184e = z3;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [f0.a, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11122r(parcel, 1, this.f1180a, false);
        C3897a.m11107c(parcel, 2, this.f1181b);
        C3897a.m11107c(parcel, 3, this.f1182c);
        C3897a.m11115k(parcel, 4, C3157b.m8427T(this.f1183d), false);
        C3897a.m11107c(parcel, 5, this.f1184e);
        C3897a.m11106b(parcel, a);
    }
}
