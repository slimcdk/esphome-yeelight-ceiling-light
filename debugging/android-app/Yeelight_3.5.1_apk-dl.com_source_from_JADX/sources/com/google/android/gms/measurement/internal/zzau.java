package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import p113x.C3897a;

@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new C1783t();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "z", mo12312id = 2)

    /* renamed from: a */
    public final Bundle f2854a;

    @SafeParcelable.Constructor
    zzau(@SafeParcelable.Param(mo12315id = 2) Bundle bundle) {
        this.f2854a = bundle;
    }

    /* renamed from: V */
    public final int mo14703V() {
        return this.f2854a.size();
    }

    /* renamed from: c0 */
    public final Bundle mo14704c0() {
        return new Bundle(this.f2854a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final Double mo14705d0(String str) {
        return Double.valueOf(this.f2854a.getDouble("value"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final Long mo14706f0(String str) {
        return Long.valueOf(this.f2854a.getLong("value"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final Object mo14707g0(String str) {
        return this.f2854a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final String mo14708h0(String str) {
        return this.f2854a.getString(str);
    }

    public final Iterator iterator() {
        return new C1771s(this);
    }

    public final String toString() {
        return this.f2854a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11109e(parcel, 2, mo14704c0(), false);
        C3897a.m11106b(parcel, a);
    }
}
