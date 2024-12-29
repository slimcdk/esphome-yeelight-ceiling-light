package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p109w.C3860t;
import p113x.C3897a;

@KeepForSdk
@SafeParcelable.Class(creator = "MethodInvocationCreator")
public class MethodInvocation extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C3860t();
    @SafeParcelable.Field(getter = "getMethodKey", mo12312id = 1)

    /* renamed from: a */
    private final int f956a;
    @SafeParcelable.Field(getter = "getResultStatusCode", mo12312id = 2)

    /* renamed from: b */
    private final int f957b;
    @SafeParcelable.Field(getter = "getConnectionResultStatusCode", mo12312id = 3)

    /* renamed from: c */
    private final int f958c;
    @SafeParcelable.Field(getter = "getStartTimeMillis", mo12312id = 4)

    /* renamed from: d */
    private final long f959d;
    @SafeParcelable.Field(getter = "getEndTimeMillis", mo12312id = 5)

    /* renamed from: e */
    private final long f960e;
    @SafeParcelable.Field(getter = "getCallingModuleId", mo12312id = 6)
    @Nullable

    /* renamed from: f */
    private final String f961f;
    @SafeParcelable.Field(getter = "getCallingEntryPoint", mo12312id = 7)
    @Nullable

    /* renamed from: g */
    private final String f962g;
    @SafeParcelable.Field(defaultValue = "0", getter = "getServiceId", mo12312id = 8)

    /* renamed from: h */
    private final int f963h;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLatencyMillis", mo12312id = 9)

    /* renamed from: i */
    private final int f964i;

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) int i2, @SafeParcelable.Param(mo12315id = 3) int i3, @SafeParcelable.Param(mo12315id = 4) long j, @SafeParcelable.Param(mo12315id = 5) long j2, @SafeParcelable.Param(mo12315id = 6) @Nullable String str, @SafeParcelable.Param(mo12315id = 7) @Nullable String str2, @SafeParcelable.Param(mo12315id = 8) int i4, @SafeParcelable.Param(mo12315id = 9) int i5) {
        this.f956a = i;
        this.f957b = i2;
        this.f958c = i3;
        this.f959d = j;
        this.f960e = j2;
        this.f961f = str;
        this.f962g = str2;
        this.f963h = i4;
        this.f964i = i5;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f956a);
        C3897a.m11116l(parcel, 2, this.f957b);
        C3897a.m11116l(parcel, 3, this.f958c);
        C3897a.m11118n(parcel, 4, this.f959d);
        C3897a.m11118n(parcel, 5, this.f960e);
        C3897a.m11122r(parcel, 6, this.f961f, false);
        C3897a.m11122r(parcel, 7, this.f962g, false);
        C3897a.m11116l(parcel, 8, this.f963h);
        C3897a.m11116l(parcel, 9, this.f964i);
        C3897a.m11106b(parcel, a);
    }
}
