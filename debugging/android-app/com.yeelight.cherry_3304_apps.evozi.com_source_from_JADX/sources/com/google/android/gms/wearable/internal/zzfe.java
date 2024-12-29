package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.C2521j;
import com.xiaomi.mipush.sdk.Constants;

@SafeParcelable.Class(creator = "MessageEventParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzfe extends AbstractSafeParcelable implements C2521j {
    public static final Parcelable.Creator<zzfe> CREATOR = new C2457h1();
    @SafeParcelable.Field(getter = "getRequestId", mo11280id = 2)

    /* renamed from: a */
    private final int f4980a;
    @SafeParcelable.Field(getter = "getPath", mo11280id = 3)

    /* renamed from: b */
    private final String f4981b;
    @SafeParcelable.Field(getter = "getData", mo11280id = 4)

    /* renamed from: c */
    private final byte[] f4982c;
    @SafeParcelable.Field(getter = "getSourceNodeId", mo11280id = 5)

    /* renamed from: d */
    private final String f4983d;

    @SafeParcelable.Constructor
    public zzfe(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) String str, @SafeParcelable.Param(mo11283id = 4) byte[] bArr, @SafeParcelable.Param(mo11283id = 5) String str2) {
        this.f4980a = i;
        this.f4981b = str;
        this.f4982c = bArr;
        this.f4983d = str2;
    }

    /* renamed from: J */
    public final String mo13429J() {
        return this.f4981b;
    }

    /* renamed from: g */
    public final int mo13430g() {
        return this.f4980a;
    }

    /* renamed from: h */
    public final byte[] mo13431h() {
        return this.f4982c;
    }

    /* renamed from: s */
    public final String mo13432s() {
        return this.f4983d;
    }

    public final String toString() {
        int i = this.f4980a;
        String str = this.f4981b;
        byte[] bArr = this.f4982c;
        String valueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(valueOf).length());
        sb.append("MessageEventParcelable[");
        sb.append(i);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(str);
        sb.append(", size=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, mo13430g());
        C1604b.m4452r(parcel, 3, mo13429J(), false);
        C1604b.m4441g(parcel, 4, mo13431h(), false);
        C1604b.m4452r(parcel, 5, mo13432s(), false);
        C1604b.m4436b(parcel, a);
    }
}
