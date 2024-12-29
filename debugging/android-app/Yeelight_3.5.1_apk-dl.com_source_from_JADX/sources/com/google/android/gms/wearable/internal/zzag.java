package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;
import p069n0.C3356b;
import p069n0.C3367m;
import p076o0.C3425e;
import p113x.C3897a;

@SafeParcelable.Class(creator = "CapabilityInfoParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzag extends AbstractSafeParcelable implements C3356b {
    public static final Parcelable.Creator<zzag> CREATOR = new C3425e();

    /* renamed from: a */
    private final Object f3001a = new Object();
    @SafeParcelable.Field(getter = "getName", mo12312id = 2)

    /* renamed from: b */
    private final String f3002b;
    @SafeParcelable.Field(getter = "getNodeParcelables", mo12312id = 3)

    /* renamed from: c */
    private final List<zzfw> f3003c;
    @GuardedBy("lock")

    /* renamed from: d */
    private Set<C3367m> f3004d;

    @SafeParcelable.Constructor
    public zzag(@SafeParcelable.Param(mo12315id = 2) String str, @SafeParcelable.Param(mo12315id = 3) List<zzfw> list) {
        this.f3002b = str;
        this.f3003c = list;
        this.f3004d = null;
        C0917i.m1419j(str);
        C0917i.m1419j(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzag.class != obj.getClass()) {
            return false;
        }
        zzag zzag = (zzag) obj;
        String str = this.f3002b;
        if (str == null ? zzag.f3002b != null : !str.equals(zzag.f3002b)) {
            return false;
        }
        List<zzfw> list = this.f3003c;
        List<zzfw> list2 = zzag.f3003c;
        return list == null ? list2 == null : list.equals(list2);
    }

    public final int hashCode() {
        String str = this.f3002b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List<zzfw> list = this.f3003c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: n */
    public final Set<C3367m> mo14854n() {
        Set<C3367m> set;
        synchronized (this.f3001a) {
            if (this.f3004d == null) {
                this.f3004d = new HashSet(this.f3003c);
            }
            set = this.f3004d;
        }
        return set;
    }

    public final String toString() {
        String str = this.f3002b;
        String valueOf = String.valueOf(this.f3003c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + valueOf.length());
        sb.append("CapabilityInfo{");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11122r(parcel, 2, this.f3002b, false);
        C3897a.m11126v(parcel, 3, this.f3003c, false);
        C3897a.m11106b(parcel, a);
    }
}
