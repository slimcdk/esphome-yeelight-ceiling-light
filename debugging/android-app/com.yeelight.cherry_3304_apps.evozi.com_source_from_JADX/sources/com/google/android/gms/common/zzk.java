package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1594p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;
import p011c.p012a.p019b.p028b.p031b.C0561a;
import p011c.p012a.p019b.p028b.p031b.C0564b;

@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C1646u();
    @SafeParcelable.Field(getter = "getCallingPackage", mo11280id = 1)

    /* renamed from: a */
    private final String f3199a;
    @SafeParcelable.Field(getter = "getCallingCertificateBinder", mo11280id = 2, type = "android.os.IBinder")
    @Nullable

    /* renamed from: b */
    private final C1625o f3200b;
    @SafeParcelable.Field(getter = "getAllowTestKeys", mo11280id = 3)

    /* renamed from: c */
    private final boolean f3201c;
    @SafeParcelable.Field(defaultValue = "false", getter = "getForbidTestKeys", mo11280id = 4)

    /* renamed from: d */
    private final boolean f3202d;

    @SafeParcelable.Constructor
    zzk(@SafeParcelable.Param(mo11283id = 1) String str, @SafeParcelable.Param(mo11283id = 2) @Nullable IBinder iBinder, @SafeParcelable.Param(mo11283id = 3) boolean z, @SafeParcelable.Param(mo11283id = 4) boolean z2) {
        this.f3199a = str;
        this.f3200b = m4643Q(iBinder);
        this.f3201c = z;
        this.f3202d = z2;
    }

    zzk(String str, @Nullable C1625o oVar, boolean z, boolean z2) {
        this.f3199a = str;
        this.f3200b = oVar;
        this.f3201c = z;
        this.f3202d = z2;
    }

    @Nullable
    /* renamed from: Q */
    private static C1625o m4643Q(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            C0561a D = C1594p0.m4380c(iBinder).mo11266D();
            byte[] bArr = D == null ? null : (byte[]) C0564b.m334e(D);
            if (bArr != null) {
                return new C1626p(bArr);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4452r(parcel, 1, this.f3199a, false);
        C1625o oVar = this.f3200b;
        if (oVar == null) {
            oVar = null;
        } else {
            oVar.asBinder();
        }
        C1604b.m4445k(parcel, 2, oVar, false);
        C1604b.m4437c(parcel, 3, this.f3201c);
        C1604b.m4437c(parcel, 4, this.f3202d);
        C1604b.m4436b(parcel, a);
    }
}
