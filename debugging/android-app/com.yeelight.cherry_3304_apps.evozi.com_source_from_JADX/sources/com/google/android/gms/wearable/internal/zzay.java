package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1599s;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient$Channel;

@SafeParcelable.Class(creator = "ChannelImplCreator")
@SafeParcelable.Reserved({1})
public final class zzay extends AbstractSafeParcelable implements Channel, ChannelClient$Channel {
    public static final Parcelable.Creator<zzay> CREATOR = new C2455h();
    @SafeParcelable.Field(getter = "getToken", mo11280id = 2)

    /* renamed from: a */
    private final String f4937a;
    @SafeParcelable.Field(getter = "getNodeId", mo11280id = 3)

    /* renamed from: b */
    private final String f4938b;
    @SafeParcelable.Field(getter = "getPath", mo11280id = 4)

    /* renamed from: c */
    private final String f4939c;

    @SafeParcelable.Constructor
    public zzay(@SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) String str2, @SafeParcelable.Param(mo11283id = 4) String str3) {
        C1609u.m4475k(str);
        this.f4937a = str;
        C1609u.m4475k(str2);
        this.f4938b = str2;
        C1609u.m4475k(str3);
        this.f4939c = str3;
    }

    /* renamed from: J */
    public final String mo13402J() {
        return this.f4939c;
    }

    /* renamed from: Q */
    public final String mo13403Q() {
        return this.f4938b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzay)) {
            return false;
        }
        zzay zzay = (zzay) obj;
        return this.f4937a.equals(zzay.f4937a) && C1599s.m4388a(zzay.f4938b, this.f4938b) && C1599s.m4388a(zzay.f4939c, this.f4939c);
    }

    public final int hashCode() {
        return this.f4937a.hashCode();
    }

    public final String toString() {
        int i = 0;
        for (char c : this.f4937a.toCharArray()) {
            i += c;
        }
        String trim = this.f4937a.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 16 + String.valueOf(substring2).length());
            sb.append(substring);
            sb.append("...");
            sb.append(substring2);
            sb.append("::");
            sb.append(i);
            trim = sb.toString();
        }
        String str = this.f4938b;
        String str2 = this.f4939c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(trim).length() + 31 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb2.append("Channel{token=");
        sb2.append(trim);
        sb2.append(", nodeId=");
        sb2.append(str);
        sb2.append(", path=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4452r(parcel, 2, this.f4937a, false);
        C1604b.m4452r(parcel, 3, mo13403Q(), false);
        C1604b.m4452r(parcel, 4, mo13402J(), false);
        C1604b.m4436b(parcel, a);
    }
}
