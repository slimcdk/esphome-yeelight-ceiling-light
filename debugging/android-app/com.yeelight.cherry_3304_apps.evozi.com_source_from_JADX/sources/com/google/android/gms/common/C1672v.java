package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.C1647a;
import com.google.android.gms.common.util.C1656j;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.v */
class C1672v {

    /* renamed from: d */
    private static final C1672v f3194d = new C1672v(true, (String) null, (Throwable) null);

    /* renamed from: a */
    final boolean f3195a;

    /* renamed from: b */
    private final String f3196b;

    /* renamed from: c */
    private final Throwable f3197c;

    C1672v(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.f3195a = z;
        this.f3196b = str;
        this.f3197c = th;
    }

    /* renamed from: b */
    static C1672v m4635b(@NonNull String str, @NonNull Throwable th) {
        return new C1672v(false, str, th);
    }

    /* renamed from: c */
    static C1672v m4636c(Callable<String> callable) {
        return new C1674x(callable);
    }

    /* renamed from: d */
    static C1672v m4637d(@NonNull String str) {
        return new C1672v(false, str, (Throwable) null);
    }

    /* renamed from: e */
    static String m4638e(String str, C1625o oVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, C1656j.m4596a(C1647a.m4564b("SHA-1").digest(oVar.mo11313e())), Boolean.valueOf(z), "12451009.false"});
    }

    /* renamed from: f */
    static C1672v m4639f() {
        return f3194d;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public String mo11385a() {
        return this.f3196b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo11386g() {
        if (!this.f3195a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th = this.f3197c;
            mo11385a();
            if (th != null) {
            }
        }
    }
}
