package p164h.p165b.p166a.p169j;

import p164h.p165b.p166a.p240h.C11214d;

/* renamed from: h.b.a.j.f */
class C11442f<K, I> {

    /* renamed from: a */
    private K f22754a;

    /* renamed from: b */
    private I f22755b;

    /* renamed from: c */
    private C11214d f22756c = new C11214d();

    C11442f(K k) {
        this.f22754a = k;
    }

    C11442f(K k, I i, int i2) {
        this.f22754a = k;
        this.f22755b = i;
        this.f22756c = new C11214d(i2);
    }

    /* renamed from: a */
    public C11214d mo36250a() {
        return this.f22756c;
    }

    /* renamed from: b */
    public I mo36251b() {
        return this.f22755b;
    }

    /* renamed from: c */
    public K mo36252c() {
        return this.f22754a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11442f.class != obj.getClass()) {
            return false;
        }
        return this.f22754a.equals(((C11442f) obj).f22754a);
    }

    public int hashCode() {
        return this.f22754a.hashCode();
    }

    public String toString() {
        return "(" + C11442f.class.getSimpleName() + ") " + mo36250a() + " KEY: " + mo36252c() + " ITEM: " + mo36251b();
    }
}
