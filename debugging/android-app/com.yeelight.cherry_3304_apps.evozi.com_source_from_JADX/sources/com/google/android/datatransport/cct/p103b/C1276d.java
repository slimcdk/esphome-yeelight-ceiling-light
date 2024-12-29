package com.google.android.datatransport.cct.p103b;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* renamed from: com.google.android.datatransport.cct.b.d */
final class C1276d extends C1290j {

    /* renamed from: a */
    private final List<C1296m> f2293a;

    C1276d(List<C1296m> list) {
        if (list != null) {
            this.f2293a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @NonNull
    @Encodable.Field(name = "logRequest")
    /* renamed from: b */
    public List<C1296m> mo10138b() {
        return this.f2293a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1290j) {
            return this.f2293a.equals(((C1290j) obj).mo10138b());
        }
        return false;
    }

    public int hashCode() {
        return this.f2293a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f2293a + "}";
    }
}
