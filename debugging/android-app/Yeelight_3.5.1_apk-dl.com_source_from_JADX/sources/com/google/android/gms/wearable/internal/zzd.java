package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;
import p076o0.C3474r0;
import p113x.C3897a;

@SafeParcelable.Class(creator = "AddListenerRequestCreator")
@SafeParcelable.Reserved({1})
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C1912c();
    @SafeParcelable.Field(getter = "getListenerAsBinder", mo12312id = 2, type = "android.os.IBinder")

    /* renamed from: a */
    public final C3474r0 f3015a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final IntentFilter[] f3016b;
    @SafeParcelable.Field(mo12312id = 4)
    @Nullable

    /* renamed from: c */
    public final String f3017c;
    @SafeParcelable.Field(mo12312id = 5)
    @Nullable

    /* renamed from: d */
    public final String f3018d;

    @SafeParcelable.Constructor
    zzd(@SafeParcelable.Param(mo12315id = 2) IBinder iBinder, @SafeParcelable.Param(mo12315id = 3) IntentFilter[] intentFilterArr, @SafeParcelable.Param(mo12315id = 4) @Nullable String str, @SafeParcelable.Param(mo12315id = 5) @Nullable String str2) {
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.f3015a = queryLocalInterface instanceof C3474r0 ? (C3474r0) queryLocalInterface : new C1913d(iBinder);
        } else {
            this.f3015a = null;
        }
        this.f3016b = intentFilterArr;
        this.f3017c = str;
        this.f3018d = str2;
    }

    public zzd(C1919j jVar) {
        this.f3015a = jVar;
        this.f3016b = jVar.mo14841E0();
        this.f3017c = jVar.mo14842F0();
        this.f3018d = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3474r0 r0Var = this.f3015a;
        C3897a.m11115k(parcel, 2, r0Var == null ? null : r0Var.asBinder(), false);
        C3897a.m11125u(parcel, 3, this.f3016b, i, false);
        C3897a.m11122r(parcel, 4, this.f3017c, false);
        C3897a.m11122r(parcel, 5, this.f3018d, false);
        C3897a.m11106b(parcel, a);
    }
}
