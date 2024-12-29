package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.xiaomi.mipush.sdk.Constants;
import p069n0.C3366l;
import p076o0.C3423d1;
import p113x.C3897a;

@SafeParcelable.Class(creator = "MessageEventParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzfj extends AbstractSafeParcelable implements C3366l {
    public static final Parcelable.Creator<zzfj> CREATOR = new C3423d1();
    @SafeParcelable.Field(getter = "getRequestId", mo12312id = 2)

    /* renamed from: a */
    private final int f3056a;
    @SafeParcelable.Field(getter = "getPath", mo12312id = 3)

    /* renamed from: b */
    private final String f3057b;
    @SafeParcelable.Field(getter = "getData", mo12312id = 4)

    /* renamed from: c */
    private final byte[] f3058c;
    @SafeParcelable.Field(getter = "getSourceNodeId", mo12312id = 5)

    /* renamed from: d */
    private final String f3059d;

    @SafeParcelable.Constructor
    public zzfj(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) String str, @SafeParcelable.Param(mo12315id = 4) byte[] bArr, @SafeParcelable.Param(mo12315id = 5) String str2) {
        this.f3056a = i;
        this.f3057b = str;
        this.f3058c = bArr;
        this.f3059d = str2;
    }

    /* renamed from: J */
    public final String mo14890J() {
        return this.f3057b;
    }

    /* renamed from: l */
    public final int mo14891l() {
        return this.f3056a;
    }

    /* renamed from: m */
    public final byte[] mo14892m() {
        return this.f3058c;
    }

    public final String toString() {
        int i = this.f3056a;
        String str = this.f3057b;
        byte[] bArr = this.f3058c;
        String valueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + valueOf.length());
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
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3056a);
        C3897a.m11122r(parcel, 3, this.f3057b, false);
        C3897a.m11111g(parcel, 4, this.f3058c, false);
        C3897a.m11122r(parcel, 5, this.f3059d, false);
        C3897a.m11106b(parcel, a);
    }

    /* renamed from: z */
    public final String mo14895z() {
        return this.f3059d;
    }
}
