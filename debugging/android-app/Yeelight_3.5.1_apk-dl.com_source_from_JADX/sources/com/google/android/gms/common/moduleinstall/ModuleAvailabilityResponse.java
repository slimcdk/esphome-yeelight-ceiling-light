package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p113x.C3897a;
import p120z.C3919a;

@SafeParcelable.Class(creator = "ModuleAvailabilityResponseCreator")
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new C3919a();
    @SafeParcelable.Field(getter = "areModulesAvailable", mo12312id = 1)

    /* renamed from: a */
    private final boolean f1092a;
    @SafeParcelable.Field(getter = "getAvailabilityStatus", mo12312id = 2)

    /* renamed from: b */
    private final int f1093b;

    @Retention(RetentionPolicy.CLASS)
    public @interface AvailabilityStatus {
        public static final int STATUS_ALREADY_AVAILABLE = 0;
        public static final int STATUS_READY_TO_DOWNLOAD = 1;
        public static final int STATUS_UNKNOWN_MODULE = 2;
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleAvailabilityResponse(@SafeParcelable.Param(mo12315id = 1) boolean z, @SafeParcelable.Param(mo12315id = 2) int i) {
        this.f1092a = z;
        this.f1093b = i;
    }

    /* renamed from: V */
    public boolean mo12345V() {
        return this.f1092a;
    }

    @AvailabilityStatus
    /* renamed from: W */
    public int mo12346W() {
        return this.f1093b;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11107c(parcel, 1, mo12345V());
        C3897a.m11116l(parcel, 2, mo12346W());
        C3897a.m11106b(parcel, a);
    }
}
