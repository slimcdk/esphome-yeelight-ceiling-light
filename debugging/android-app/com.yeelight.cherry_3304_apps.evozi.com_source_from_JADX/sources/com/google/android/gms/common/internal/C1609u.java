package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.C1671v;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.u */
public final class C1609u {
    @KeepForSdk
    /* renamed from: a */
    public static void m4465a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static void m4466b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public static void m4467c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public static void m4468d(Handler handler) {
        m4469e(handler, "Must be called on the handler thread");
    }

    @KeepForSdk
    /* renamed from: e */
    public static void m4469e(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    /* renamed from: f */
    public static void m4470f(String str) {
        if (!C1671v.m4634a()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    /* renamed from: g */
    public static String m4471g(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @KeepForSdk
    /* renamed from: h */
    public static String m4472h(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    /* renamed from: i */
    public static void m4473i() {
        m4474j("Must not be called on the main application thread");
    }

    @KeepForSdk
    /* renamed from: j */
    public static void m4474j(String str) {
        if (C1671v.m4634a()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    @KeepForSdk
    /* renamed from: k */
    public static <T> T m4475k(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    @NonNull
    @KeepForSdk
    /* renamed from: l */
    public static <T> T m4476l(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    /* renamed from: m */
    public static int m4477m(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @KeepForSdk
    /* renamed from: n */
    public static void m4478n(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @KeepForSdk
    /* renamed from: o */
    public static void m4479o(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    /* renamed from: p */
    public static void m4480p(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
