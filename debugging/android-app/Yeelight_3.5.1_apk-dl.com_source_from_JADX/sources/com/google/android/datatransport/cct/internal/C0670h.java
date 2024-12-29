package com.google.android.datatransport.cct.internal;

/* renamed from: com.google.android.datatransport.cct.internal.h */
final class C0670h extends C0679m {

    /* renamed from: a */
    private final long f417a;

    C0670h(long j) {
        this.f417a = j;
    }

    /* renamed from: c */
    public long mo11200c() {
        return this.f417a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0679m) && this.f417a == ((C0679m) obj).mo11200c();
    }

    public int hashCode() {
        long j = this.f417a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f417a + "}";
    }
}
