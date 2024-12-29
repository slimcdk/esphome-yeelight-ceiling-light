package com.google.android.datatransport.cct.p103b;

/* renamed from: com.google.android.datatransport.cct.b.h */
final class C1286h extends C1298n {

    /* renamed from: a */
    private final long f2326a;

    C1286h(long j) {
        this.f2326a = j;
    }

    /* renamed from: a */
    public long mo10186a() {
        return this.f2326a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C1298n) && this.f2326a == ((C1298n) obj).mo10186a();
    }

    public int hashCode() {
        long j = this.f2326a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f2326a + "}";
    }
}
