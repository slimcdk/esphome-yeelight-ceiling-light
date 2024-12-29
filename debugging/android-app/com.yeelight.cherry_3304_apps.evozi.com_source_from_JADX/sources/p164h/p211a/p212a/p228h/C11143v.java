package p164h.p211a.p212a.p228h;

/* renamed from: h.a.a.h.v */
public class C11143v extends C11141u {

    /* renamed from: f */
    final StringBuffer f22078f = ((StringBuffer) this.f22075a);

    public C11143v(int i) {
        super(new StringBuffer(i));
    }

    /* renamed from: f */
    private void m28958f() {
        if (!mo35443d()) {
            throw new IllegalArgumentException("Tried to read incomplete UTF8 decoded String");
        }
    }

    /* renamed from: g */
    public StringBuffer mo35445g() {
        m28958f();
        return this.f22078f;
    }

    public String toString() {
        m28958f();
        return this.f22078f.toString();
    }
}
