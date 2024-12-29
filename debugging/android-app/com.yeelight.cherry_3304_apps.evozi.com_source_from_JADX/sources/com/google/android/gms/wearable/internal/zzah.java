package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.C2419b;
import com.google.android.gms.wearable.C2522k;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

@SafeParcelable.Class(creator = "CapabilityInfoParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzah extends AbstractSafeParcelable implements C2419b {
    public static final Parcelable.Creator<zzah> CREATOR = new C2447f();

    /* renamed from: a */
    private final Object f4929a = new Object();
    @SafeParcelable.Field(getter = "getName", mo11280id = 2)

    /* renamed from: b */
    private final String f4930b;
    @SafeParcelable.Field(getter = "getNodeParcelables", mo11280id = 3)

    /* renamed from: c */
    private final List<zzfo> f4931c;
    @GuardedBy("lock")

    /* renamed from: d */
    private Set<C2522k> f4932d;

    @SafeParcelable.Constructor
    public zzah(@SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) List<zzfo> list) {
        this.f4930b = str;
        this.f4931c = list;
        this.f4932d = null;
        C1609u.m4475k(str);
        C1609u.m4475k(this.f4931c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzah.class != obj.getClass()) {
            return false;
        }
        zzah zzah = (zzah) obj;
        String str = this.f4930b;
        if (str == null ? zzah.f4930b != null : !str.equals(zzah.f4930b)) {
            return false;
        }
        List<zzfo> list = this.f4931c;
        List<zzfo> list2 = zzah.f4931c;
        return list == null ? list2 == null : list.equals(list2);
    }

    public final String getName() {
        return this.f4930b;
    }

    public final int hashCode() {
        String str = this.f4930b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List<zzfo> list = this.f4931c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public final Set<C2522k> mo13219i() {
        Set<C2522k> set;
        synchronized (this.f4929a) {
            if (this.f4932d == null) {
                this.f4932d = new HashSet(this.f4931c);
            }
            set = this.f4932d;
        }
        return set;
    }

    public final String toString() {
        String str = this.f4930b;
        String valueOf = String.valueOf(this.f4931c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(valueOf).length());
        sb.append("CapabilityInfo{");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4452r(parcel, 2, getName(), false);
        C1604b.m4456v(parcel, 3, this.f4931c, false);
        C1604b.m4436b(parcel, a);
    }
}
