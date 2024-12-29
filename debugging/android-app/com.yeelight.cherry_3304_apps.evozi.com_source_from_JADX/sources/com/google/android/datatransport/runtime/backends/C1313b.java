package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.C1320h;

/* renamed from: com.google.android.datatransport.runtime.backends.b */
final class C1313b extends C1320h {

    /* renamed from: a */
    private final C1320h.C1321a f2402a;

    /* renamed from: b */
    private final long f2403b;

    C1313b(C1320h.C1321a aVar, long j) {
        if (aVar != null) {
            this.f2402a = aVar;
            this.f2403b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: b */
    public long mo10214b() {
        return this.f2403b;
    }

    /* renamed from: c */
    public C1320h.C1321a mo10215c() {
        return this.f2402a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1320h)) {
            return false;
        }
        C1320h hVar = (C1320h) obj;
        return this.f2402a.equals(hVar.mo10215c()) && this.f2403b == hVar.mo10214b();
    }

    public int hashCode() {
        long j = this.f2403b;
        return ((this.f2402a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f2402a + ", nextRequestWaitMillis=" + this.f2403b + "}";
    }
}
