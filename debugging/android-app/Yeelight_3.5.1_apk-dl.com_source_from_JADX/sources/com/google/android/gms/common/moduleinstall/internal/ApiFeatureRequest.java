package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import p001a0.C0002a;
import p001a0.C0003b;
import p113x.C3897a;

@KeepForSdk
@SafeParcelable.Class(creator = "ApiFeatureRequestCreator")
public class ApiFeatureRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new C0003b();
    @SafeParcelable.Field(getter = "getApiFeatures", mo12312id = 1)

    /* renamed from: a */
    private final List f1102a;
    @SafeParcelable.Field(getter = "getIsUrgent", mo12312id = 2)

    /* renamed from: b */
    private final boolean f1103b;
    @SafeParcelable.Field(getter = "getFeatureRequestSessionId", mo12312id = 3)
    @Nullable

    /* renamed from: c */
    private final String f1104c;
    @SafeParcelable.Field(getter = "getCallingPackage", mo12312id = 4)
    @Nullable

    /* renamed from: d */
    private final String f1105d;

    static {
        C0002a aVar = C0002a.f0a;
    }

    @SafeParcelable.Constructor
    public ApiFeatureRequest(@SafeParcelable.Param(mo12315id = 1) @NonNull List list, @SafeParcelable.Param(mo12315id = 2) boolean z, @SafeParcelable.Param(mo12315id = 3) @Nullable String str, @SafeParcelable.Param(mo12315id = 4) @Nullable String str2) {
        C0917i.m1419j(list);
        this.f1102a = list;
        this.f1103b = z;
        this.f1104c = str;
        this.f1105d = str2;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: V */
    public List<Feature> mo12356V() {
        return this.f1102a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f1103b == apiFeatureRequest.f1103b && C0914h.m1402a(this.f1102a, apiFeatureRequest.f1102a) && C0914h.m1402a(this.f1104c, apiFeatureRequest.f1104c) && C0914h.m1402a(this.f1105d, apiFeatureRequest.f1105d);
    }

    public final int hashCode() {
        return C0914h.m1403b(Boolean.valueOf(this.f1103b), this.f1102a, this.f1104c, this.f1105d);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11126v(parcel, 1, mo12356V(), false);
        C3897a.m11107c(parcel, 2, this.f1103b);
        C3897a.m11122r(parcel, 3, this.f1104c, false);
        C3897a.m11122r(parcel, 4, this.f1105d, false);
        C3897a.m11106b(parcel, a);
    }
}
