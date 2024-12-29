package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RemoveListenerRequestCreator")
public final class zzfw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfw> CREATOR = new C2496r1();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f4995a;
    @SafeParcelable.Field(getter = "getListenerAsBinder", mo11280id = 2, type = "android.os.IBinder")

    /* renamed from: b */
    private final C2495r0 f4996b;

    @SafeParcelable.Constructor
    zzfw(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) IBinder iBinder) {
        this.f4995a = i;
        C2495r0 r0Var = null;
        if (iBinder != null) {
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
                r0Var = queryLocalInterface instanceof C2495r0 ? (C2495r0) queryLocalInterface : new C2501t0(iBinder);
            }
            this.f4996b = r0Var;
            return;
        }
        this.f4996b = null;
    }

    public zzfw(C2495r0 r0Var) {
        this.f4995a = 1;
        this.f4996b = r0Var;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f4995a);
        C2495r0 r0Var = this.f4996b;
        C1604b.m4445k(parcel, 2, r0Var == null ? null : r0Var.asBinder(), false);
        C1604b.m4436b(parcel, a);
    }
}
