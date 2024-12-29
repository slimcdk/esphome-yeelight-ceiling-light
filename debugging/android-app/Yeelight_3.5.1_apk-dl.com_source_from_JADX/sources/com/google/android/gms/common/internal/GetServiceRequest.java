package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0911g;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
public class GetServiceRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C0906d0();

    /* renamed from: o */
    static final Scope[] f940o = new Scope[0];

    /* renamed from: p */
    static final Feature[] f941p = new Feature[0];
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f942a;
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: b */
    final int f943b;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: c */
    int f944c;
    @SafeParcelable.Field(mo12312id = 4)

    /* renamed from: d */
    String f945d;
    @SafeParcelable.Field(mo12312id = 5)
    @Nullable

    /* renamed from: e */
    IBinder f946e;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", mo12312id = 6)

    /* renamed from: f */
    Scope[] f947f;
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", mo12312id = 7)

    /* renamed from: g */
    Bundle f948g;
    @SafeParcelable.Field(mo12312id = 8)
    @Nullable

    /* renamed from: h */
    Account f949h;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", mo12312id = 10)

    /* renamed from: i */
    Feature[] f950i;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", mo12312id = 11)

    /* renamed from: j */
    Feature[] f951j;
    @SafeParcelable.Field(mo12312id = 12)

    /* renamed from: k */
    boolean f952k;
    @SafeParcelable.Field(defaultValue = "0", mo12312id = 13)

    /* renamed from: l */
    int f953l;
    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", mo12312id = 14)

    /* renamed from: m */
    boolean f954m;
    @SafeParcelable.Field(getter = "getAttributionTag", mo12312id = 15)
    @Nullable

    /* renamed from: n */
    private String f955n;

    @SafeParcelable.Constructor
    GetServiceRequest(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) int i2, @SafeParcelable.Param(mo12315id = 3) int i3, @SafeParcelable.Param(mo12315id = 4) String str, @SafeParcelable.Param(mo12315id = 5) @Nullable IBinder iBinder, @SafeParcelable.Param(mo12315id = 6) Scope[] scopeArr, @SafeParcelable.Param(mo12315id = 7) Bundle bundle, @SafeParcelable.Param(mo12315id = 8) @Nullable Account account, @SafeParcelable.Param(mo12315id = 10) Feature[] featureArr, @SafeParcelable.Param(mo12315id = 11) Feature[] featureArr2, @SafeParcelable.Param(mo12315id = 12) boolean z, @SafeParcelable.Param(mo12315id = 13) int i4, @SafeParcelable.Param(mo12315id = 14) boolean z2, @SafeParcelable.Param(mo12315id = 15) @Nullable String str2) {
        scopeArr = scopeArr == null ? f940o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f941p : featureArr;
        featureArr2 = featureArr2 == null ? f941p : featureArr2;
        this.f942a = i;
        this.f943b = i2;
        this.f944c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f945d = "com.google.android.gms";
        } else {
            this.f945d = str;
        }
        if (i < 2) {
            this.f949h = iBinder != null ? C0893a.m1284f(C0911g.C0912a.m1394e(iBinder)) : null;
        } else {
            this.f946e = iBinder;
            this.f949h = account;
        }
        this.f947f = scopeArr;
        this.f948g = bundle;
        this.f950i = featureArr;
        this.f951j = featureArr2;
        this.f952k = z;
        this.f953l = i4;
        this.f954m = z2;
        this.f955n = str2;
    }

    @Nullable
    /* renamed from: V */
    public final String mo12175V() {
        return this.f955n;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        C0906d0.m1370a(this, parcel, i);
    }
}
