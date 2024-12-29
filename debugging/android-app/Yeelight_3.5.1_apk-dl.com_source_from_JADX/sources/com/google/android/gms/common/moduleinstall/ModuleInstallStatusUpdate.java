package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p113x.C3897a;
import p120z.C3922d;

@SafeParcelable.Class(creator = "ModuleInstallStatusUpdateCreator")
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new C3922d();
    @SafeParcelable.Field(getter = "getSessionId", mo12312id = 1)

    /* renamed from: a */
    private final int f1097a;
    @SafeParcelable.Field(getter = "getInstallState", mo12312id = 2)
    @InstallState

    /* renamed from: b */
    private final int f1098b;
    @SafeParcelable.Field(getter = "getBytesDownloaded", mo12312id = 3)
    @Nullable

    /* renamed from: c */
    private final Long f1099c;
    @SafeParcelable.Field(getter = "getTotalBytesToDownload", mo12312id = 4)
    @Nullable

    /* renamed from: d */
    private final Long f1100d;
    @SafeParcelable.Field(getter = "getErrorCode", mo12312id = 5)

    /* renamed from: e */
    private final int f1101e;

    @Retention(RetentionPolicy.CLASS)
    public @interface InstallState {
        public static final int STATE_CANCELED = 3;
        public static final int STATE_COMPLETED = 4;
        public static final int STATE_DOWNLOADING = 2;
        public static final int STATE_DOWNLOAD_PAUSED = 7;
        public static final int STATE_FAILED = 5;
        public static final int STATE_INSTALLING = 6;
        public static final int STATE_PENDING = 1;
        public static final int STATE_UNKNOWN = 0;
    }

    /* renamed from: com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$a */
    public static class C0940a {
        C0940a(long j, long j2) {
            C0917i.m1422m(j2);
        }
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleInstallStatusUpdate(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) @InstallState int i2, @SafeParcelable.Param(mo12315id = 3) @Nullable Long l, @SafeParcelable.Param(mo12315id = 4) @Nullable Long l2, @SafeParcelable.Param(mo12315id = 5) int i3) {
        this.f1097a = i;
        this.f1098b = i2;
        this.f1099c = l;
        this.f1100d = l2;
        this.f1101e = i3;
        if (l != null && l2 != null && l2.longValue() != 0) {
            new C0940a(l.longValue(), l2.longValue());
        }
    }

    /* renamed from: V */
    public int mo12352V() {
        return this.f1101e;
    }

    @InstallState
    /* renamed from: W */
    public int mo12353W() {
        return this.f1098b;
    }

    /* renamed from: c0 */
    public int mo12354c0() {
        return this.f1097a;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, mo12354c0());
        C3897a.m11116l(parcel, 2, mo12353W());
        C3897a.m11119o(parcel, 3, this.f1099c, false);
        C3897a.m11119o(parcel, 4, this.f1100d, false);
        C3897a.m11116l(parcel, 5, mo12352V());
        C3897a.m11106b(parcel, a);
    }
}
