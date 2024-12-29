package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p014c0.C0627p;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.i */
public final class C0917i {
    @KeepForSdk
    /* renamed from: a */
    public static void m1410a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static void m1411b(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public static void m1412c(@NonNull Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name2 + " thread, but got " + name + ".");
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public static void m1413d(@NonNull Handler handler, @NonNull String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public static void m1414e(@NonNull String str) {
        if (!C0627p.m236a()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    @KeepForSdk
    @EnsuresNonNull({"#1"})
    /* renamed from: f */
    public static String m1415f(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @NonNull
    @KeepForSdk
    @EnsuresNonNull({"#1"})
    /* renamed from: g */
    public static String m1416g(@Nullable String str, @NonNull Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    /* renamed from: h */
    public static void m1417h() {
        m1418i("Must not be called on the main application thread");
    }

    @KeepForSdk
    /* renamed from: i */
    public static void m1418i(@NonNull String str) {
        if (C0627p.m236a()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    @NonNull
    @KeepForSdk
    /* renamed from: j */
    public static <T> T m1419j(@Nullable T t) {
        Objects.requireNonNull(t, "null reference");
        return t;
    }

    @EnsuresNonNull({"#1"})
    @NonNull
    @KeepForSdk
    /* renamed from: k */
    public static <T> T m1420k(@NonNull T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    /* renamed from: l */
    public static int m1421l(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @KeepForSdk
    /* renamed from: m */
    public static long m1422m(long j) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @KeepForSdk
    /* renamed from: n */
    public static void m1423n(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @KeepForSdk
    /* renamed from: o */
    public static void m1424o(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    /* renamed from: p */
    public static void m1425p(boolean z, @NonNull String str, @NonNull Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
