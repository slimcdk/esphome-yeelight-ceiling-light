package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient$Channel;
import p076o0.C3437h;
import p113x.C3897a;

@SafeParcelable.Class(creator = "ChannelImplCreator")
@SafeParcelable.Reserved({1})
public final class zzbi extends AbstractSafeParcelable implements Channel, ChannelClient$Channel {
    public static final Parcelable.Creator<zzbi> CREATOR = new C3437h();
    @SafeParcelable.Field(getter = "getToken", mo12312id = 2)

    /* renamed from: a */
    private final String f3009a;
    @SafeParcelable.Field(getter = "getNodeId", mo12312id = 3)

    /* renamed from: b */
    private final String f3010b;
    @SafeParcelable.Field(getter = "getPath", mo12312id = 4)

    /* renamed from: c */
    private final String f3011c;

    @SafeParcelable.Constructor
    public zzbi(@SafeParcelable.Param(mo12315id = 2) String str, @SafeParcelable.Param(mo12315id = 3) String str2, @SafeParcelable.Param(mo12315id = 4) String str3) {
        this.f3009a = (String) C0917i.m1419j(str);
        this.f3010b = (String) C0917i.m1419j(str2);
        this.f3011c = (String) C0917i.m1419j(str3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbi)) {
            return false;
        }
        zzbi zzbi = (zzbi) obj;
        return this.f3009a.equals(zzbi.f3009a) && C0914h.m1402a(zzbi.f3010b, this.f3010b) && C0914h.m1402a(zzbi.f3011c, this.f3011c);
    }

    public final int hashCode() {
        return this.f3009a.hashCode();
    }

    public final String toString() {
        int i = 0;
        for (char c : this.f3009a.toCharArray()) {
            i += c;
        }
        String trim = this.f3009a.trim();
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
        String str = this.f3010b;
        String str2 = this.f3011c;
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
        int a = C3897a.m11105a(parcel);
        C3897a.m11122r(parcel, 2, this.f3009a, false);
        C3897a.m11122r(parcel, 3, this.f3010b, false);
        C3897a.m11122r(parcel, 4, this.f3011c, false);
        C3897a.m11106b(parcel, a);
    }
}
