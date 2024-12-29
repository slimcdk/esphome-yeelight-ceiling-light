package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.measurement.internal.a4 */
public final class C2110a4 {
    @NonNull

    /* renamed from: a */
    public String f3906a;
    @NonNull

    /* renamed from: b */
    public String f3907b;

    /* renamed from: c */
    public long f3908c;
    @NonNull

    /* renamed from: d */
    public Bundle f3909d;

    public C2110a4(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.f3906a = str;
        this.f3907b = str2;
        this.f3909d = bundle == null ? new Bundle() : bundle;
        this.f3908c = j;
    }

    public final String toString() {
        String str = this.f3907b;
        String str2 = this.f3906a;
        String valueOf = String.valueOf(this.f3909d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }
}
