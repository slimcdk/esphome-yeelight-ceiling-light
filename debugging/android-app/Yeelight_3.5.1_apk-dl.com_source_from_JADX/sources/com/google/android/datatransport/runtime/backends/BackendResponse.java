package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static BackendResponse m503a() {
        return new C0683b(Status.FATAL_ERROR, -1);
    }

    /* renamed from: d */
    public static BackendResponse m504d() {
        return new C0683b(Status.INVALID_PAYLOAD, -1);
    }

    /* renamed from: e */
    public static BackendResponse m505e(long j) {
        return new C0683b(Status.OK, j);
    }

    /* renamed from: f */
    public static BackendResponse m506f() {
        return new C0683b(Status.TRANSIENT_ERROR, -1);
    }

    /* renamed from: b */
    public abstract long mo11209b();

    /* renamed from: c */
    public abstract Status mo11210c();
}
