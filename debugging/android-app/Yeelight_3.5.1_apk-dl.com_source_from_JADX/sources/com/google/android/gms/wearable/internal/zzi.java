package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3444i2;
import p113x.C3897a;

@SafeParcelable.Class(creator = "AmsEntityUpdateParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new C3444i2();
    @SafeParcelable.Field(getter = "getEntityId", mo12312id = 2)

    /* renamed from: a */
    private final byte f3084a;
    @SafeParcelable.Field(getter = "getAttributeId", mo12312id = 3)

    /* renamed from: b */
    private final byte f3085b;
    @SafeParcelable.Field(getter = "getValue", mo12312id = 4)

    /* renamed from: c */
    private final String f3086c;

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(mo12315id = 2) byte b, @SafeParcelable.Param(mo12315id = 3) byte b2, @SafeParcelable.Param(mo12315id = 4) String str) {
        this.f3084a = b;
        this.f3085b = b2;
        this.f3086c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzi.class != obj.getClass()) {
            return false;
        }
        zzi zzi = (zzi) obj;
        return this.f3084a == zzi.f3084a && this.f3085b == zzi.f3085b && this.f3086c.equals(zzi.f3086c);
    }

    public final int hashCode() {
        return ((((this.f3084a + 31) * 31) + this.f3085b) * 31) + this.f3086c.hashCode();
    }

    public final String toString() {
        byte b = this.f3084a;
        byte b2 = this.f3085b;
        String str = this.f3086c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 73);
        sb.append("AmsEntityUpdateParcelable{, mEntityId=");
        sb.append(b);
        sb.append(", mAttributeId=");
        sb.append(b2);
        sb.append(", mValue='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11110f(parcel, 2, this.f3084a);
        C3897a.m11110f(parcel, 3, this.f3085b);
        C3897a.m11122r(parcel, 4, this.f3086c, false);
        C3897a.m11106b(parcel, a);
    }
}
