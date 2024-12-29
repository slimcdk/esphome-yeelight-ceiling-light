package com.google.android.gms.common.internal;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.k */
public final class C1580k {

    /* renamed from: a */
    private final String f3053a;

    /* renamed from: b */
    private final String f3054b;

    public C1580k(String str, String str2) {
        C1609u.m4476l(str, "log tag cannot be null");
        C1609u.m4467c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f3053a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f3054b = null;
        } else {
            this.f3054b = str2;
        }
    }

    /* renamed from: f */
    private final String m4339f(String str) {
        String str2 = this.f3054b;
        return str2 == null ? str : str2.concat(str);
    }

    @KeepForSdk
    /* renamed from: a */
    public final boolean mo11241a(int i) {
        return Log.isLoggable(this.f3053a, i);
    }

    @KeepForSdk
    /* renamed from: b */
    public final void mo11242b(String str, String str2) {
        if (mo11241a(3)) {
            m4339f(str2);
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public final void mo11243c(String str, String str2) {
        if (mo11241a(6)) {
            m4339f(str2);
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public final void mo11244d(String str, String str2, Throwable th) {
        if (mo11241a(6)) {
            m4339f(str2);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public final void mo11245e(String str, String str2) {
        if (mo11241a(2)) {
            m4339f(str2);
        }
    }
}
