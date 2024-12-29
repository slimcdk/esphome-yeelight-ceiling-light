package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;
import p032f0.C3155a;
import p032f0.C3157b;
import p109w.C3850k0;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C0959u();
    @SafeParcelable.Field(getter = "getCallingPackage", mo12312id = 1)

    /* renamed from: a */
    private final String f1189a;
    @SafeParcelable.Field(getter = "getCallingCertificateBinder", mo12312id = 2, type = "android.os.IBinder")
    @Nullable

    /* renamed from: b */
    private final C0941n f1190b;
    @SafeParcelable.Field(getter = "getAllowTestKeys", mo12312id = 3)

    /* renamed from: c */
    private final boolean f1191c;
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", mo12312id = 4)

    /* renamed from: d */
    private final boolean f1192d;

    @SafeParcelable.Constructor
    zzs(@SafeParcelable.Param(mo12315id = 1) String str, @SafeParcelable.Param(mo12315id = 2) @Nullable IBinder iBinder, @SafeParcelable.Param(mo12315id = 3) boolean z, @SafeParcelable.Param(mo12315id = 4) boolean z2) {
        this.f1189a = str;
        C0942o oVar = null;
        if (iBinder != null) {
            try {
                C3155a b = C3850k0.m10954e(iBinder).mo12362b();
                byte[] bArr = b == null ? null : (byte[]) C3157b.m8428f(b);
                if (bArr != null) {
                    oVar = new C0942o(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.f1190b = oVar;
        this.f1191c = z;
        this.f1192d = z2;
    }

    zzs(String str, @Nullable C0941n nVar, boolean z, boolean z2) {
        this.f1189a = str;
        this.f1190b = nVar;
        this.f1191c = z;
        this.f1192d = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11122r(parcel, 1, this.f1189a, false);
        C0941n nVar = this.f1190b;
        if (nVar == null) {
            nVar = null;
        }
        C3897a.m11115k(parcel, 2, nVar, false);
        C3897a.m11107c(parcel, 3, this.f1191c);
        C3897a.m11107c(parcel, 4, this.f1192d);
        C3897a.m11106b(parcel, a);
    }
}
