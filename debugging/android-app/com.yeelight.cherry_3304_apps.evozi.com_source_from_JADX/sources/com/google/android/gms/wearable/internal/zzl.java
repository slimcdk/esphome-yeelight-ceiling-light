package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

@SafeParcelable.Class(creator = "AncsNotificationParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C2486o2();
    @SafeParcelable.Field(getter = "getId", mo11280id = 2)

    /* renamed from: a */
    private int f5006a;
    @SafeParcelable.Field(getter = "getAppId", mo11280id = 3)

    /* renamed from: b */
    private final String f5007b;
    @SafeParcelable.Field(getter = "getDateTime", mo11280id = 4)
    @Nullable

    /* renamed from: c */
    private final String f5008c;
    @SafeParcelable.Field(getter = "getNotificationText", mo11280id = 5)

    /* renamed from: d */
    private final String f5009d;
    @SafeParcelable.Field(getter = "getTitle", mo11280id = 6)

    /* renamed from: e */
    private final String f5010e;
    @SafeParcelable.Field(getter = "getSubtitle", mo11280id = 7)

    /* renamed from: f */
    private final String f5011f;
    @SafeParcelable.Field(getter = "getDisplayName", mo11280id = 8)
    @Nullable

    /* renamed from: g */
    private final String f5012g;
    @SafeParcelable.Field(getter = "getEventId", mo11280id = 9)

    /* renamed from: h */
    private final byte f5013h;
    @SafeParcelable.Field(getter = "getEventFlags", mo11280id = 10)

    /* renamed from: i */
    private final byte f5014i;
    @SafeParcelable.Field(getter = "getCategoryId", mo11280id = 11)

    /* renamed from: j */
    private final byte f5015j;
    @SafeParcelable.Field(getter = "getCategoryCount", mo11280id = 12)

    /* renamed from: k */
    private final byte f5016k;
    @SafeParcelable.Field(getter = "getPackageName", mo11280id = 13)
    @Nullable

    /* renamed from: l */
    private final String f5017l;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) String str, @SafeParcelable.Param(mo11283id = 4) @Nullable String str2, @SafeParcelable.Param(mo11283id = 5) String str3, @SafeParcelable.Param(mo11283id = 6) String str4, @SafeParcelable.Param(mo11283id = 7) String str5, @SafeParcelable.Param(mo11283id = 8) @Nullable String str6, @SafeParcelable.Param(mo11283id = 9) byte b, @SafeParcelable.Param(mo11283id = 10) byte b2, @SafeParcelable.Param(mo11283id = 11) byte b3, @SafeParcelable.Param(mo11283id = 12) byte b4, @SafeParcelable.Param(mo11283id = 13) @Nullable String str7) {
        this.f5006a = i;
        this.f5007b = str;
        this.f5008c = str2;
        this.f5009d = str3;
        this.f5010e = str4;
        this.f5011f = str5;
        this.f5012g = str6;
        this.f5013h = b;
        this.f5014i = b2;
        this.f5015j = b3;
        this.f5016k = b4;
        this.f5017l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzl.class == obj.getClass()) {
            zzl zzl = (zzl) obj;
            if (this.f5006a != zzl.f5006a || this.f5013h != zzl.f5013h || this.f5014i != zzl.f5014i || this.f5015j != zzl.f5015j || this.f5016k != zzl.f5016k || !this.f5007b.equals(zzl.f5007b)) {
                return false;
            }
            String str = this.f5008c;
            if (str == null ? zzl.f5008c != null : !str.equals(zzl.f5008c)) {
                return false;
            }
            if (!this.f5009d.equals(zzl.f5009d) || !this.f5010e.equals(zzl.f5010e) || !this.f5011f.equals(zzl.f5011f)) {
                return false;
            }
            String str2 = this.f5012g;
            if (str2 == null ? zzl.f5012g != null : !str2.equals(zzl.f5012g)) {
                return false;
            }
            String str3 = this.f5017l;
            String str4 = zzl.f5017l;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f5006a + 31) * 31) + this.f5007b.hashCode()) * 31;
        String str = this.f5008c;
        int i = 0;
        int hashCode2 = (((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f5009d.hashCode()) * 31) + this.f5010e.hashCode()) * 31) + this.f5011f.hashCode()) * 31;
        String str2 = this.f5012g;
        int hashCode3 = (((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f5013h) * 31) + this.f5014i) * 31) + this.f5015j) * 31) + this.f5016k) * 31;
        String str3 = this.f5017l;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        int i = this.f5006a;
        String str = this.f5007b;
        String str2 = this.f5008c;
        String str3 = this.f5009d;
        String str4 = this.f5010e;
        String str5 = this.f5011f;
        String str6 = this.f5012g;
        byte b = this.f5013h;
        byte b2 = this.f5014i;
        byte b3 = this.f5015j;
        byte b4 = this.f5016k;
        String str7 = this.f5017l;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 211 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length());
        sb.append("AncsNotificationParcelable{, id=");
        sb.append(i);
        sb.append(", appId='");
        sb.append(str);
        sb.append('\'');
        sb.append(", dateTime='");
        sb.append(str2);
        sb.append('\'');
        sb.append(", notificationText='");
        sb.append(str3);
        sb.append('\'');
        sb.append(", title='");
        sb.append(str4);
        sb.append('\'');
        sb.append(", subtitle='");
        sb.append(str5);
        sb.append('\'');
        sb.append(", displayName='");
        sb.append(str6);
        sb.append('\'');
        sb.append(", eventId=");
        sb.append(b);
        sb.append(", eventFlags=");
        sb.append(b2);
        sb.append(", categoryId=");
        sb.append(b3);
        sb.append(", categoryCount=");
        sb.append(b4);
        sb.append(", packageName='");
        sb.append(str7);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f5006a);
        C1604b.m4452r(parcel, 3, this.f5007b, false);
        C1604b.m4452r(parcel, 4, this.f5008c, false);
        C1604b.m4452r(parcel, 5, this.f5009d, false);
        C1604b.m4452r(parcel, 6, this.f5010e, false);
        C1604b.m4452r(parcel, 7, this.f5011f, false);
        String str = this.f5012g;
        if (str == null) {
            str = this.f5007b;
        }
        C1604b.m4452r(parcel, 8, str, false);
        C1604b.m4440f(parcel, 9, this.f5013h);
        C1604b.m4440f(parcel, 10, this.f5014i);
        C1604b.m4440f(parcel, 11, this.f5015j);
        C1604b.m4440f(parcel, 12, this.f5016k);
        C1604b.m4452r(parcel, 13, this.f5017l, false);
        C1604b.m4436b(parcel, a);
    }
}
