package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.h */
public class C1654h implements C1651e {

    /* renamed from: a */
    private static final C1654h f3170a = new C1654h();

    private C1654h() {
    }

    @KeepForSdk
    /* renamed from: d */
    public static C1651e m4587d() {
        return f3170a;
    }

    /* renamed from: a */
    public long mo11378a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public long mo11379b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public long mo11380c() {
        return System.nanoTime();
    }
}
