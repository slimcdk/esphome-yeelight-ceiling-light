package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p113x.C3897a;
import p120z.C3921c;

@SafeParcelable.Class(creator = "ModuleInstallResponseCreator")
public class ModuleInstallResponse extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new C3921c();
    @SafeParcelable.Field(getter = "getSessionId", mo12312id = 1)

    /* renamed from: a */
    private final int f1095a;
    @SafeParcelable.Field(defaultValue = "false", getter = "getShouldUnregisterListener", mo12312id = 2)

    /* renamed from: b */
    private final boolean f1096b;

    @SafeParcelable.Constructor
    public ModuleInstallResponse(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) boolean z) {
        this.f1095a = i;
        this.f1096b = z;
    }

    /* renamed from: V */
    public int mo12350V() {
        return this.f1095a;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, mo12350V());
        C3897a.m11107c(parcel, 2, this.f1096b);
        C3897a.m11106b(parcel, a);
    }
}
