package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p113x.C3897a;
import p120z.C3920b;

@SafeParcelable.Class(creator = "ModuleInstallIntentResponseCreator")
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new C3920b();
    @SafeParcelable.Field(getter = "getPendingIntent", mo12312id = 1)
    @Nullable

    /* renamed from: a */
    private final PendingIntent f1094a;

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleInstallIntentResponse(@SafeParcelable.Param(mo12315id = 1) @Nullable PendingIntent pendingIntent) {
        this.f1094a = pendingIntent;
    }

    @Nullable
    /* renamed from: V */
    public PendingIntent mo12348V() {
        return this.f1094a;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11121q(parcel, 1, mo12348V(), i, false);
        C3897a.m11106b(parcel, a);
    }
}
