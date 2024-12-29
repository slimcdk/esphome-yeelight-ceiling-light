package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.cct.internal.d */
final class C0660d extends C0674j {

    /* renamed from: a */
    private final List<C0677l> f384a;

    C0660d(List<C0677l> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f384a = list;
    }

    @NonNull
    @Encodable.Field(name = "logRequest")
    /* renamed from: c */
    public List<C0677l> mo11157c() {
        return this.f384a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0674j) {
            return this.f384a.equals(((C0674j) obj).mo11157c());
        }
        return false;
    }

    public int hashCode() {
        return this.f384a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f384a + "}";
    }
}
