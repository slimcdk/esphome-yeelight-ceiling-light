package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;
import p076o0.C3452k2;
import p113x.C3897a;

@SafeParcelable.Class(creator = "AncsNotificationParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C3452k2();
    @SafeParcelable.Field(getter = "getId", mo12312id = 2)

    /* renamed from: a */
    private final int f3087a;
    @SafeParcelable.Field(getter = "getAppId", mo12312id = 3)

    /* renamed from: b */
    private final String f3088b;
    @SafeParcelable.Field(getter = "getDateTime", mo12312id = 4)
    @Nullable

    /* renamed from: c */
    private final String f3089c;
    @SafeParcelable.Field(getter = "getNotificationText", mo12312id = 5)

    /* renamed from: d */
    private final String f3090d;
    @SafeParcelable.Field(getter = "getTitle", mo12312id = 6)

    /* renamed from: e */
    private final String f3091e;
    @SafeParcelable.Field(getter = "getSubtitle", mo12312id = 7)

    /* renamed from: f */
    private final String f3092f;
    @SafeParcelable.Field(getter = "getDisplayName", mo12312id = 8)
    @Nullable

    /* renamed from: g */
    private final String f3093g;
    @SafeParcelable.Field(getter = "getEventId", mo12312id = 9)

    /* renamed from: h */
    private final byte f3094h;
    @SafeParcelable.Field(getter = "getEventFlags", mo12312id = 10)

    /* renamed from: i */
    private final byte f3095i;
    @SafeParcelable.Field(getter = "getCategoryId", mo12312id = 11)

    /* renamed from: j */
    private final byte f3096j;
    @SafeParcelable.Field(getter = "getCategoryCount", mo12312id = 12)

    /* renamed from: k */
    private final byte f3097k;
    @SafeParcelable.Field(getter = "getPackageName", mo12312id = 13)
    @Nullable

    /* renamed from: l */
    private final String f3098l;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) String str, @SafeParcelable.Param(mo12315id = 4) @Nullable String str2, @SafeParcelable.Param(mo12315id = 5) String str3, @SafeParcelable.Param(mo12315id = 6) String str4, @SafeParcelable.Param(mo12315id = 7) String str5, @SafeParcelable.Param(mo12315id = 8) @Nullable String str6, @SafeParcelable.Param(mo12315id = 9) byte b, @SafeParcelable.Param(mo12315id = 10) byte b2, @SafeParcelable.Param(mo12315id = 11) byte b3, @SafeParcelable.Param(mo12315id = 12) byte b4, @SafeParcelable.Param(mo12315id = 13) @Nullable String str7) {
        this.f3087a = i;
        this.f3088b = str;
        this.f3089c = str2;
        this.f3090d = str3;
        this.f3091e = str4;
        this.f3092f = str5;
        this.f3093g = str6;
        this.f3094h = b;
        this.f3095i = b2;
        this.f3096j = b3;
        this.f3097k = b4;
        this.f3098l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzl.class != obj.getClass()) {
            return false;
        }
        zzl zzl = (zzl) obj;
        if (this.f3087a != zzl.f3087a || this.f3094h != zzl.f3094h || this.f3095i != zzl.f3095i || this.f3096j != zzl.f3096j || this.f3097k != zzl.f3097k || !this.f3088b.equals(zzl.f3088b)) {
            return false;
        }
        String str = this.f3089c;
        if (str == null ? zzl.f3089c != null : !str.equals(zzl.f3089c)) {
            return false;
        }
        if (!this.f3090d.equals(zzl.f3090d) || !this.f3091e.equals(zzl.f3091e) || !this.f3092f.equals(zzl.f3092f)) {
            return false;
        }
        String str2 = this.f3093g;
        if (str2 == null ? zzl.f3093g != null : !str2.equals(zzl.f3093g)) {
            return false;
        }
        String str3 = this.f3098l;
        String str4 = zzl.f3098l;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    public final int hashCode() {
        int hashCode = (((this.f3087a + 31) * 31) + this.f3088b.hashCode()) * 31;
        String str = this.f3089c;
        int i = 0;
        int hashCode2 = (((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f3090d.hashCode()) * 31) + this.f3091e.hashCode()) * 31) + this.f3092f.hashCode()) * 31;
        String str2 = this.f3093g;
        int hashCode3 = (((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f3094h) * 31) + this.f3095i) * 31) + this.f3096j) * 31) + this.f3097k) * 31;
        String str3 = this.f3098l;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        int i = this.f3087a;
        String str = this.f3088b;
        String str2 = this.f3089c;
        String str3 = this.f3090d;
        String str4 = this.f3091e;
        String str5 = this.f3092f;
        String str6 = this.f3093g;
        byte b = this.f3094h;
        byte b2 = this.f3095i;
        byte b3 = this.f3096j;
        byte b4 = this.f3097k;
        String str7 = this.f3098l;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length + 211 + length2 + length3 + length4 + length5 + String.valueOf(str6).length() + String.valueOf(str7).length());
        sb.append("AncsNotificationParcelable{, id=");
        sb.append(i);
        sb.append(", appId='");
        sb.append(str);
        sb.append("', dateTime='");
        sb.append(str2);
        sb.append("', notificationText='");
        sb.append(str3);
        sb.append("', title='");
        sb.append(str4);
        sb.append("', subtitle='");
        sb.append(str5);
        sb.append("', displayName='");
        sb.append(str6);
        sb.append("', eventId=");
        sb.append(b);
        sb.append(", eventFlags=");
        sb.append(b2);
        sb.append(", categoryId=");
        sb.append(b3);
        sb.append(", categoryCount=");
        sb.append(b4);
        sb.append(", packageName='");
        sb.append(str7);
        sb.append("'}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3087a);
        C3897a.m11122r(parcel, 3, this.f3088b, false);
        C3897a.m11122r(parcel, 4, this.f3089c, false);
        C3897a.m11122r(parcel, 5, this.f3090d, false);
        C3897a.m11122r(parcel, 6, this.f3091e, false);
        C3897a.m11122r(parcel, 7, this.f3092f, false);
        String str = this.f3093g;
        if (str == null) {
            str = this.f3088b;
        }
        C3897a.m11122r(parcel, 8, str, false);
        C3897a.m11110f(parcel, 9, this.f3094h);
        C3897a.m11110f(parcel, 10, this.f3095i);
        C3897a.m11110f(parcel, 11, this.f3096j);
        C3897a.m11110f(parcel, 12, this.f3097k);
        C3897a.m11122r(parcel, 13, this.f3098l, false);
        C3897a.m11106b(parcel, a);
    }
}
