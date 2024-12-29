package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AmsEntityUpdateParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new C2482n2();
    @SafeParcelable.Field(getter = "getEntityId", mo11280id = 2)

    /* renamed from: a */
    private byte f5003a;
    @SafeParcelable.Field(getter = "getAttributeId", mo11280id = 3)

    /* renamed from: b */
    private final byte f5004b;
    @SafeParcelable.Field(getter = "getValue", mo11280id = 4)

    /* renamed from: c */
    private final String f5005c;

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(mo11283id = 2) byte b, @SafeParcelable.Param(mo11283id = 3) byte b2, @SafeParcelable.Param(mo11283id = 4) String str) {
        this.f5003a = b;
        this.f5004b = b2;
        this.f5005c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzi.class != obj.getClass()) {
            return false;
        }
        zzi zzi = (zzi) obj;
        return this.f5003a == zzi.f5003a && this.f5004b == zzi.f5004b && this.f5005c.equals(zzi.f5005c);
    }

    public final int hashCode() {
        return ((((this.f5003a + 31) * 31) + this.f5004b) * 31) + this.f5005c.hashCode();
    }

    public final String toString() {
        byte b = this.f5003a;
        byte b2 = this.f5004b;
        String str = this.f5005c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 73);
        sb.append("AmsEntityUpdateParcelable{, mEntityId=");
        sb.append(b);
        sb.append(", mAttributeId=");
        sb.append(b2);
        sb.append(", mValue='");
        sb.append(str);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4440f(parcel, 2, this.f5003a);
        C1604b.m4440f(parcel, 3, this.f5004b);
        C1604b.m4452r(parcel, 4, this.f5005c, false);
        C1604b.m4436b(parcel, a);
    }
}
