package p035g;

import com.google.android.datatransport.C0638b;
import java.util.Objects;
import p031f.C3150a;
import p031f.C3151b;
import p035g.C3196n;

/* renamed from: g.c */
final class C3176c extends C3196n {

    /* renamed from: a */
    private final C3198o f5123a;

    /* renamed from: b */
    private final String f5124b;

    /* renamed from: c */
    private final C0638b<?> f5125c;

    /* renamed from: d */
    private final C3151b<?, byte[]> f5126d;

    /* renamed from: e */
    private final C3150a f5127e;

    /* renamed from: g.c$b */
    static final class C3178b extends C3196n.C3197a {

        /* renamed from: a */
        private C3198o f5128a;

        /* renamed from: b */
        private String f5129b;

        /* renamed from: c */
        private C0638b<?> f5130c;

        /* renamed from: d */
        private C3151b<?, byte[]> f5131d;

        /* renamed from: e */
        private C3150a f5132e;

        C3178b() {
        }

        /* renamed from: a */
        public C3196n mo23725a() {
            String str = "";
            if (this.f5128a == null) {
                str = str + " transportContext";
            }
            if (this.f5129b == null) {
                str = str + " transportName";
            }
            if (this.f5130c == null) {
                str = str + " event";
            }
            if (this.f5131d == null) {
                str = str + " transformer";
            }
            if (this.f5132e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C3176c(this.f5128a, this.f5129b, this.f5130c, this.f5131d, this.f5132e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3196n.C3197a mo23726b(C3150a aVar) {
            Objects.requireNonNull(aVar, "Null encoding");
            this.f5132e = aVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3196n.C3197a mo23727c(C0638b<?> bVar) {
            Objects.requireNonNull(bVar, "Null event");
            this.f5130c = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C3196n.C3197a mo23728d(C3151b<?, byte[]> bVar) {
            Objects.requireNonNull(bVar, "Null transformer");
            this.f5131d = bVar;
            return this;
        }

        /* renamed from: e */
        public C3196n.C3197a mo23729e(C3198o oVar) {
            Objects.requireNonNull(oVar, "Null transportContext");
            this.f5128a = oVar;
            return this;
        }

        /* renamed from: f */
        public C3196n.C3197a mo23730f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f5129b = str;
            return this;
        }
    }

    private C3176c(C3198o oVar, String str, C0638b<?> bVar, C3151b<?, byte[]> bVar2, C3150a aVar) {
        this.f5123a = oVar;
        this.f5124b = str;
        this.f5125c = bVar;
        this.f5126d = bVar2;
        this.f5127e = aVar;
    }

    /* renamed from: b */
    public C3150a mo23717b() {
        return this.f5127e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0638b<?> mo23718c() {
        return this.f5125c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C3151b<?, byte[]> mo23719e() {
        return this.f5126d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3196n)) {
            return false;
        }
        C3196n nVar = (C3196n) obj;
        return this.f5123a.equals(nVar.mo23721f()) && this.f5124b.equals(nVar.mo23722g()) && this.f5125c.equals(nVar.mo23718c()) && this.f5126d.equals(nVar.mo23719e()) && this.f5127e.equals(nVar.mo23717b());
    }

    /* renamed from: f */
    public C3198o mo23721f() {
        return this.f5123a;
    }

    /* renamed from: g */
    public String mo23722g() {
        return this.f5124b;
    }

    public int hashCode() {
        return ((((((((this.f5123a.hashCode() ^ 1000003) * 1000003) ^ this.f5124b.hashCode()) * 1000003) ^ this.f5125c.hashCode()) * 1000003) ^ this.f5126d.hashCode()) * 1000003) ^ this.f5127e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f5123a + ", transportName=" + this.f5124b + ", event=" + this.f5125c + ", transformer=" + this.f5126d + ", encoding=" + this.f5127e + "}";
    }
}
