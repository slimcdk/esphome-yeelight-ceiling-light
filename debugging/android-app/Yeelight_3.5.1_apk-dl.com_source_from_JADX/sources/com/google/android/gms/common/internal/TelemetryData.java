package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import p109w.C3849k;
import p113x.C3897a;

@KeepForSdk
@SafeParcelable.Class(creator = "TelemetryDataCreator")
public class TelemetryData extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C3849k();
    @SafeParcelable.Field(getter = "getTelemetryConfigVersion", mo12312id = 1)

    /* renamed from: a */
    private final int f970a;
    @SafeParcelable.Field(getter = "getMethodInvocations", mo12312id = 2)
    @Nullable

    /* renamed from: b */
    private List f971b;

    @SafeParcelable.Constructor
    public TelemetryData(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) @Nullable List list) {
        this.f970a = i;
        this.f971b = list;
    }

    /* renamed from: V */
    public final int mo12184V() {
        return this.f970a;
    }

    @androidx.annotation.Nullable
    /* renamed from: W */
    public final List mo12185W() {
        return this.f971b;
    }

    /* renamed from: c0 */
    public final void mo12186c0(@NonNull MethodInvocation methodInvocation) {
        if (this.f971b == null) {
            this.f971b = new ArrayList();
        }
        this.f971b.add(methodInvocation);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f970a);
        C3897a.m11126v(parcel, 2, this.f971b, false);
        C3897a.m11106b(parcel, a);
    }
}
