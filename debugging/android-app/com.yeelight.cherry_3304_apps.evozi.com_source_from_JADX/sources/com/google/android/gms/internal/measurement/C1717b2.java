package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.b2 */
public final class C1717b2 {

    /* renamed from: a */
    final Uri f3235a;

    /* renamed from: b */
    final String f3236b;

    /* renamed from: c */
    final String f3237c;

    public C1717b2(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (C1793g2<Context, Boolean>) null);
    }

    private C1717b2(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable C1793g2<Context, Boolean> g2Var) {
        this.f3235a = uri;
        this.f3236b = str2;
        this.f3237c = str3;
    }

    /* renamed from: a */
    public final C2026v1<Double> mo11452a(String str, double d) {
        return C2026v1.m6110i(this, str, -3.0d, false);
    }

    /* renamed from: b */
    public final C2026v1<Long> mo11453b(String str, long j) {
        return C2026v1.m6111j(this, str, j, false);
    }

    /* renamed from: c */
    public final C2026v1<String> mo11454c(String str, String str2) {
        return C2026v1.m6112k(this, str, str2, false);
    }

    /* renamed from: d */
    public final C2026v1<Boolean> mo11455d(String str, boolean z) {
        return C2026v1.m6113l(this, str, z, false);
    }
}
