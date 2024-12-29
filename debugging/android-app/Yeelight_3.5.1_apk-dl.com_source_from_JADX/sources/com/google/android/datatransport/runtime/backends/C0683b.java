package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.backends.b */
final class C0683b extends BackendResponse {

    /* renamed from: a */
    private final BackendResponse.Status f427a;

    /* renamed from: b */
    private final long f428b;

    C0683b(BackendResponse.Status status, long j) {
        Objects.requireNonNull(status, "Null status");
        this.f427a = status;
        this.f428b = j;
    }

    /* renamed from: b */
    public long mo11209b() {
        return this.f428b;
    }

    /* renamed from: c */
    public BackendResponse.Status mo11210c() {
        return this.f427a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.f427a.equals(backendResponse.mo11210c()) && this.f428b == backendResponse.mo11209b();
    }

    public int hashCode() {
        long j = this.f428b;
        return ((this.f427a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f427a + ", nextRequestWaitMillis=" + this.f428b + "}";
    }
}
