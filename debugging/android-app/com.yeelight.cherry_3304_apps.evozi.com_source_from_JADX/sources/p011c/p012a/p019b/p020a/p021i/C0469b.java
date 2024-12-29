package p011c.p012a.p019b.p020a.p021i;

import p011c.p012a.p019b.p020a.C0459b;
import p011c.p012a.p019b.p020a.C0460c;
import p011c.p012a.p019b.p020a.C0462e;
import p011c.p012a.p019b.p020a.p021i.C0485k;

/* renamed from: c.a.b.a.i.b */
final class C0469b extends C0485k {

    /* renamed from: a */
    private final C0487l f67a;

    /* renamed from: b */
    private final String f68b;

    /* renamed from: c */
    private final C0460c<?> f69c;

    /* renamed from: d */
    private final C0462e<?, byte[]> f70d;

    /* renamed from: e */
    private final C0459b f71e;

    /* renamed from: c.a.b.a.i.b$b */
    static final class C0471b extends C0485k.C0486a {

        /* renamed from: a */
        private C0487l f72a;

        /* renamed from: b */
        private String f73b;

        /* renamed from: c */
        private C0460c<?> f74c;

        /* renamed from: d */
        private C0462e<?, byte[]> f75d;

        /* renamed from: e */
        private C0459b f76e;

        C0471b() {
        }

        /* renamed from: a */
        public C0485k mo8430a() {
            String str = "";
            if (this.f72a == null) {
                str = str + " transportContext";
            }
            if (this.f73b == null) {
                str = str + " transportName";
            }
            if (this.f74c == null) {
                str = str + " event";
            }
            if (this.f75d == null) {
                str = str + " transformer";
            }
            if (this.f76e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C0469b(this.f72a, this.f73b, this.f74c, this.f75d, this.f76e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0485k.C0486a mo8431b(C0459b bVar) {
            if (bVar != null) {
                this.f76e = bVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0485k.C0486a mo8432c(C0460c<?> cVar) {
            if (cVar != null) {
                this.f74c = cVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C0485k.C0486a mo8433d(C0462e<?, byte[]> eVar) {
            if (eVar != null) {
                this.f75d = eVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        /* renamed from: e */
        public C0485k.C0486a mo8434e(C0487l lVar) {
            if (lVar != null) {
                this.f72a = lVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        /* renamed from: f */
        public C0485k.C0486a mo8435f(String str) {
            if (str != null) {
                this.f73b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    private C0469b(C0487l lVar, String str, C0460c<?> cVar, C0462e<?, byte[]> eVar, C0459b bVar) {
        this.f67a = lVar;
        this.f68b = str;
        this.f69c = cVar;
        this.f70d = eVar;
        this.f71e = bVar;
    }

    /* renamed from: b */
    public C0459b mo8422b() {
        return this.f71e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0460c<?> mo8423c() {
        return this.f69c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0462e<?, byte[]> mo8424e() {
        return this.f70d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0485k)) {
            return false;
        }
        C0485k kVar = (C0485k) obj;
        return this.f67a.equals(kVar.mo8426f()) && this.f68b.equals(kVar.mo8427g()) && this.f69c.equals(kVar.mo8423c()) && this.f70d.equals(kVar.mo8424e()) && this.f71e.equals(kVar.mo8422b());
    }

    /* renamed from: f */
    public C0487l mo8426f() {
        return this.f67a;
    }

    /* renamed from: g */
    public String mo8427g() {
        return this.f68b;
    }

    public int hashCode() {
        return ((((((((this.f67a.hashCode() ^ 1000003) * 1000003) ^ this.f68b.hashCode()) * 1000003) ^ this.f69c.hashCode()) * 1000003) ^ this.f70d.hashCode()) * 1000003) ^ this.f71e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f67a + ", transportName=" + this.f68b + ", event=" + this.f69c + ", transformer=" + this.f70d + ", encoding=" + this.f71e + "}";
    }
}
