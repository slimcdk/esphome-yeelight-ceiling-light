package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.measurement.internal.d4 */
public final class C1587d4 {
    @NonNull

    /* renamed from: a */
    public final String f2000a;
    @NonNull

    /* renamed from: b */
    public final String f2001b;

    /* renamed from: c */
    public final long f2002c;
    @NonNull

    /* renamed from: d */
    public final Bundle f2003d;

    public C1587d4(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.f2000a = str;
        this.f2001b = str2;
        this.f2003d = bundle;
        this.f2002c = j;
    }

    /* renamed from: b */
    public static C1587d4 m4105b(zzaw zzaw) {
        return new C1587d4(zzaw.f2855a, zzaw.f2857c, zzaw.f2856b.mo14704c0(), zzaw.f2858d);
    }

    /* renamed from: a */
    public final zzaw mo14052a() {
        return new zzaw(this.f2000a, new zzau(new Bundle(this.f2003d)), this.f2001b, this.f2002c);
    }

    public final String toString() {
        String str = this.f2001b;
        String str2 = this.f2000a;
        String obj = this.f2003d.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}
