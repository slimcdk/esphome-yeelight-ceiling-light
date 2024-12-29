package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.backends.C1318g;
import java.util.Arrays;
import p011c.p012a.p019b.p020a.p021i.C0481h;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
final class C1310a extends C1318g {

    /* renamed from: a */
    private final Iterable<C0481h> f2398a;

    /* renamed from: b */
    private final byte[] f2399b;

    /* renamed from: com.google.android.datatransport.runtime.backends.a$b */
    static final class C1312b extends C1318g.C1319a {

        /* renamed from: a */
        private Iterable<C0481h> f2400a;

        /* renamed from: b */
        private byte[] f2401b;

        C1312b() {
        }

        /* renamed from: a */
        public C1318g mo10211a() {
            String str = "";
            if (this.f2400a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C1310a(this.f2400a, this.f2401b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C1318g.C1319a mo10212b(Iterable<C0481h> iterable) {
            if (iterable != null) {
                this.f2400a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        /* renamed from: c */
        public C1318g.C1319a mo10213c(@Nullable byte[] bArr) {
            this.f2401b = bArr;
            return this;
        }
    }

    private C1310a(Iterable<C0481h> iterable, @Nullable byte[] bArr) {
        this.f2398a = iterable;
        this.f2399b = bArr;
    }

    /* renamed from: b */
    public Iterable<C0481h> mo10206b() {
        return this.f2398a;
    }

    @Nullable
    /* renamed from: c */
    public byte[] mo10207c() {
        return this.f2399b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1318g)) {
            return false;
        }
        C1318g gVar = (C1318g) obj;
        if (this.f2398a.equals(gVar.mo10206b())) {
            if (Arrays.equals(this.f2399b, gVar instanceof C1310a ? ((C1310a) gVar).f2399b : gVar.mo10207c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2398a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2399b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f2398a + ", extras=" + Arrays.toString(this.f2399b) + "}";
    }
}
