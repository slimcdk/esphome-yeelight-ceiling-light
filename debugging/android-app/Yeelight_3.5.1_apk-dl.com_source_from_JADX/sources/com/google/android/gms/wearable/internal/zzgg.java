package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3474r0;
import p113x.C3897a;

@SafeParcelable.Class(creator = "RemoveListenerRequestCreator")
public final class zzgg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgg> CREATOR = new C1914e();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f3073a;
    @SafeParcelable.Field(getter = "getListenerAsBinder", mo12312id = 2, type = "android.os.IBinder")

    /* renamed from: b */
    public final C3474r0 f3074b;

    @SafeParcelable.Constructor
    zzgg(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) IBinder iBinder) {
        this.f3073a = i;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.f3074b = queryLocalInterface instanceof C3474r0 ? (C3474r0) queryLocalInterface : new C1913d(iBinder);
            return;
        }
        this.f3074b = null;
    }

    public zzgg(C3474r0 r0Var) {
        this.f3073a = 1;
        this.f3074b = r0Var;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f3073a);
        C3474r0 r0Var = this.f3074b;
        C3897a.m11115k(parcel, 2, r0Var == null ? null : r0Var.asBinder(), false);
        C3897a.m11106b(parcel, a);
    }
}
