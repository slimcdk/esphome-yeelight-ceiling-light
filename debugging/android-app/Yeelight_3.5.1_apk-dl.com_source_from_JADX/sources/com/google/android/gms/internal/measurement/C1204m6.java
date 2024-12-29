package com.google.android.gms.internal.measurement;

import android.net.Uri;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.m6 */
public final class C1204m6 {

    /* renamed from: a */
    final String f1419a;

    /* renamed from: b */
    final Uri f1420b;

    /* renamed from: c */
    final String f1421c;

    /* renamed from: d */
    final String f1422d;

    /* renamed from: e */
    final boolean f1423e;

    /* renamed from: f */
    final boolean f1424f;

    /* renamed from: g */
    final boolean f1425g;

    /* renamed from: h */
    final boolean f1426h;
    @Nullable

    /* renamed from: i */
    final C1316t6 f1427i;

    public C1204m6(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (C1316t6) null);
    }

    private C1204m6(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable C1316t6 t6Var) {
        this.f1419a = null;
        this.f1420b = uri;
        this.f1421c = "";
        this.f1422d = "";
        this.f1423e = z;
        this.f1424f = false;
        this.f1425g = z3;
        this.f1426h = false;
        this.f1427i = null;
    }

    /* renamed from: a */
    public final C1204m6 mo12977a() {
        return new C1204m6((String) null, this.f1420b, this.f1421c, this.f1422d, this.f1423e, false, true, false, (C1316t6) null);
    }

    /* renamed from: b */
    public final C1204m6 mo12978b() {
        if (this.f1421c.isEmpty()) {
            return new C1204m6((String) null, this.f1420b, this.f1421c, this.f1422d, true, false, this.f1425g, false, (C1316t6) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: c */
    public final C1252p6 mo12979c(String str, double d) {
        return new C1172k6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: d */
    public final C1252p6 mo12980d(String str, long j) {
        return new C1140i6(this, str, Long.valueOf(j), true);
    }

    /* renamed from: e */
    public final C1252p6 mo12981e(String str, String str2) {
        return new C1188l6(this, str, str2, true);
    }

    /* renamed from: f */
    public final C1252p6 mo12982f(String str, boolean z) {
        return new C1156j6(this, str, Boolean.valueOf(z), true);
    }
}
