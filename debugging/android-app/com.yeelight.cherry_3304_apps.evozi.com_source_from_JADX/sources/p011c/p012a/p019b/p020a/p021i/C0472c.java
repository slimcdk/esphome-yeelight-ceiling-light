package p011c.p012a.p019b.p020a.p021i;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import p011c.p012a.p019b.p020a.C0461d;
import p011c.p012a.p019b.p020a.p021i.C0487l;

/* renamed from: c.a.b.a.i.c */
final class C0472c extends C0487l {

    /* renamed from: a */
    private final String f77a;

    /* renamed from: b */
    private final byte[] f78b;

    /* renamed from: c */
    private final C0461d f79c;

    /* renamed from: c.a.b.a.i.c$b */
    static final class C0474b extends C0487l.C0488a {

        /* renamed from: a */
        private String f80a;

        /* renamed from: b */
        private byte[] f81b;

        /* renamed from: c */
        private C0461d f82c;

        C0474b() {
        }

        /* renamed from: a */
        public C0487l mo8441a() {
            String str = "";
            if (this.f80a == null) {
                str = str + " backendName";
            }
            if (this.f82c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C0472c(this.f80a, this.f81b, this.f82c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C0487l.C0488a mo8442b(String str) {
            if (str != null) {
                this.f80a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        /* renamed from: c */
        public C0487l.C0488a mo8443c(@Nullable byte[] bArr) {
            this.f81b = bArr;
            return this;
        }

        /* renamed from: d */
        public C0487l.C0488a mo8444d(C0461d dVar) {
            if (dVar != null) {
                this.f82c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    private C0472c(String str, @Nullable byte[] bArr, C0461d dVar) {
        this.f77a = str;
        this.f78b = bArr;
        this.f79c = dVar;
    }

    /* renamed from: b */
    public String mo8436b() {
        return this.f77a;
    }

    @Nullable
    /* renamed from: c */
    public byte[] mo8437c() {
        return this.f78b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public C0461d mo8438d() {
        return this.f79c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0487l)) {
            return false;
        }
        C0487l lVar = (C0487l) obj;
        if (this.f77a.equals(lVar.mo8436b())) {
            return Arrays.equals(this.f78b, lVar instanceof C0472c ? ((C0472c) lVar).f78b : lVar.mo8437c()) && this.f79c.equals(lVar.mo8438d());
        }
    }

    public int hashCode() {
        return ((((this.f77a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f78b)) * 1000003) ^ this.f79c.hashCode();
    }
}
