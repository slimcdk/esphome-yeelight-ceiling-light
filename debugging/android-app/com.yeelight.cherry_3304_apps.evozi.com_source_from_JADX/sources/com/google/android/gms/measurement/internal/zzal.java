package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
public final class zzal extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzal> CREATOR = new C2258n();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "z", mo11280id = 2)

    /* renamed from: a */
    public final Bundle f4765a;

    @SafeParcelable.Constructor
    zzal(@SafeParcelable.Param(mo11283id = 2) Bundle bundle) {
        this.f4765a = bundle;
    }

    /* renamed from: Q */
    public final int mo13149Q() {
        return this.f4765a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final Object mo13150S(String str) {
        return this.f4765a.get(str);
    }

    /* renamed from: T */
    public final Bundle mo13151T() {
        return new Bundle(this.f4765a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final Long mo13152V(String str) {
        return Long.valueOf(this.f4765a.getLong(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final Double mo13153W(String str) {
        return Double.valueOf(this.f4765a.getDouble(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final String mo13154X(String str) {
        return this.f4765a.getString(str);
    }

    public final Iterator<String> iterator() {
        return new C2269o(this);
    }

    public final String toString() {
        return this.f4765a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4439e(parcel, 2, mo13151T(), false);
        C1604b.m4436b(parcel, a);
    }
}
