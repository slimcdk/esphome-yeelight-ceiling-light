package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.backends.h */
public abstract class C1320h {

    /* renamed from: com.google.android.datatransport.runtime.backends.h$a */
    public enum C1321a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    /* renamed from: a */
    public static C1320h m3470a() {
        return new C1313b(C1321a.FATAL_ERROR, -1);
    }

    /* renamed from: d */
    public static C1320h m3471d(long j) {
        return new C1313b(C1321a.OK, j);
    }

    /* renamed from: e */
    public static C1320h m3472e() {
        return new C1313b(C1321a.TRANSIENT_ERROR, -1);
    }

    /* renamed from: b */
    public abstract long mo10214b();

    /* renamed from: c */
    public abstract C1321a mo10215c();
}
