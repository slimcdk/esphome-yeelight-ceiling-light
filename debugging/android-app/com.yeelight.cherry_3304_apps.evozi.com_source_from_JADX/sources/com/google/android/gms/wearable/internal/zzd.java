package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

@SafeParcelable.Class(creator = "AddListenerRequestCreator")
@SafeParcelable.Reserved({1})
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C2468k0();
    @SafeParcelable.Field(getter = "getListenerAsBinder", mo11280id = 2, type = "android.os.IBinder")

    /* renamed from: a */
    private final C2495r0 f4943a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    private final IntentFilter[] f4944b;
    @SafeParcelable.Field(mo11280id = 4)
    @Nullable

    /* renamed from: c */
    private final String f4945c;
    @SafeParcelable.Field(mo11280id = 5)
    @Nullable

    /* renamed from: d */
    private final String f4946d;

    @SafeParcelable.Constructor
    zzd(@SafeParcelable.Param(mo11283id = 2) IBinder iBinder, @SafeParcelable.Param(mo11283id = 3) IntentFilter[] intentFilterArr, @SafeParcelable.Param(mo11283id = 4) @Nullable String str, @SafeParcelable.Param(mo11283id = 5) @Nullable String str2) {
        C2495r0 r0Var = null;
        if (!(iBinder == null || iBinder == null)) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            r0Var = queryLocalInterface instanceof C2495r0 ? (C2495r0) queryLocalInterface : new C2501t0(iBinder);
        }
        this.f4943a = r0Var;
        this.f4944b = intentFilterArr;
        this.f4945c = str;
        this.f4946d = str2;
    }

    public zzd(C2458h2 h2Var) {
        this.f4943a = h2Var;
        this.f4944b = h2Var.mo13321Q0();
        this.f4945c = h2Var.mo13322R0();
        this.f4946d = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C2495r0 r0Var = this.f4943a;
        C1604b.m4445k(parcel, 2, r0Var == null ? null : r0Var.asBinder(), false);
        C1604b.m4455u(parcel, 3, this.f4944b, i, false);
        C1604b.m4452r(parcel, 4, this.f4945c, false);
        C1604b.m4452r(parcel, 5, this.f4946d, false);
        C1604b.m4436b(parcel, a);
    }
}
