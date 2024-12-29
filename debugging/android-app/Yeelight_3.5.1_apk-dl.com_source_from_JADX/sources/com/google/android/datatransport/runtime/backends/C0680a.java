package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.backends.C0685d;
import java.util.Arrays;
import java.util.Objects;
import p035g.C3188i;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
final class C0680a extends C0685d {

    /* renamed from: a */
    private final Iterable<C3188i> f423a;

    /* renamed from: b */
    private final byte[] f424b;

    /* renamed from: com.google.android.datatransport.runtime.backends.a$b */
    static final class C0682b extends C0685d.C0686a {

        /* renamed from: a */
        private Iterable<C3188i> f425a;

        /* renamed from: b */
        private byte[] f426b;

        C0682b() {
        }

        /* renamed from: a */
        public C0685d mo11217a() {
            String str = "";
            if (this.f425a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C0680a(this.f425a, this.f426b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C0685d.C0686a mo11218b(Iterable<C3188i> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f425a = iterable;
            return this;
        }

        /* renamed from: c */
        public C0685d.C0686a mo11219c(@Nullable byte[] bArr) {
            this.f426b = bArr;
            return this;
        }
    }

    private C0680a(Iterable<C3188i> iterable, @Nullable byte[] bArr) {
        this.f423a = iterable;
        this.f424b = bArr;
    }

    /* renamed from: b */
    public Iterable<C3188i> mo11212b() {
        return this.f423a;
    }

    @Nullable
    /* renamed from: c */
    public byte[] mo11213c() {
        return this.f424b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0685d)) {
            return false;
        }
        C0685d dVar = (C0685d) obj;
        if (this.f423a.equals(dVar.mo11212b())) {
            if (Arrays.equals(this.f424b, dVar instanceof C0680a ? ((C0680a) dVar).f424b : dVar.mo11213c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f423a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f424b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f423a + ", extras=" + Arrays.toString(this.f424b) + "}";
    }
}
