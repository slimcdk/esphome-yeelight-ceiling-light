package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.CheckReturnValue;
import javax.annotation.Nullable;
import p101u.C3710e;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.w */
class C0964w {

    /* renamed from: d */
    private static final C0964w f1176d = new C0964w(true, 3, 1, (String) null, (Throwable) null);

    /* renamed from: a */
    final boolean f1177a;
    @Nullable

    /* renamed from: b */
    final String f1178b;
    @Nullable

    /* renamed from: c */
    final Throwable f1179c;

    private C0964w(boolean z, int i, int i2, @Nullable String str, @Nullable Throwable th) {
        this.f1177a = z;
        this.f1178b = str;
        this.f1179c = th;
    }

    /* synthetic */ C0964w(boolean z, int i, int i2, String str, Throwable th, C3710e eVar) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }

    @Deprecated
    /* renamed from: b */
    static C0964w m1592b() {
        return f1176d;
    }

    /* renamed from: c */
    static C0964w m1593c(@NonNull String str) {
        return new C0964w(false, 1, 5, str, (Throwable) null);
    }

    /* renamed from: d */
    static C0964w m1594d(@NonNull String str, @NonNull Throwable th) {
        return new C0964w(false, 1, 5, str, th);
    }

    /* renamed from: f */
    static C0964w m1595f(int i) {
        return new C0964w(true, i, 1, (String) null, (Throwable) null);
    }

    /* renamed from: g */
    static C0964w m1596g(int i, int i2, @NonNull String str, @Nullable Throwable th) {
        return new C0964w(false, i, i2, str, th);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public String mo12432a() {
        return this.f1178b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo12433e() {
        if (!this.f1177a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th = this.f1179c;
            mo12432a();
        }
    }
}
