package p011c.p012a.p053e;

import p011c.p012a.p053e.p057t.C0839a;
import p011c.p012a.p053e.p057t.C0840b;

/* renamed from: c.a.e.c */
public final class C0816c {

    /* renamed from: a */
    private final C0815b f685a;

    /* renamed from: b */
    private C0840b f686b;

    public C0816c(C0815b bVar) {
        if (bVar != null) {
            this.f685a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C0840b mo8988a() {
        if (this.f686b == null) {
            this.f686b = this.f685a.mo8983a();
        }
        return this.f686b;
    }

    /* renamed from: b */
    public C0839a mo8989b(int i, C0839a aVar) {
        return this.f685a.mo8984b(i, aVar);
    }

    /* renamed from: c */
    public int mo8990c() {
        return this.f685a.mo8985c();
    }

    /* renamed from: d */
    public int mo8991d() {
        return this.f685a.mo8987e();
    }

    /* renamed from: e */
    public boolean mo8992e() {
        return this.f685a.mo8986d().mo9000e();
    }

    /* renamed from: f */
    public C0816c mo8993f() {
        this.f685a.mo8986d().mo9001f();
        throw null;
    }

    public String toString() {
        try {
            return mo8988a().toString();
        } catch (C0823j unused) {
            return "";
        }
    }
}
