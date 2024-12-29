package p164h.p211a.p212a.p228h;

/* renamed from: h.a.a.h.w */
public class C11144w extends C11141u {

    /* renamed from: f */
    final StringBuilder f22079f = ((StringBuilder) this.f22075a);

    public C11144w() {
        super(new StringBuilder());
    }

    public C11144w(int i) {
        super(new StringBuilder(i));
    }

    /* renamed from: f */
    private void m28960f() {
        if (!mo35443d()) {
            throw new IllegalArgumentException("Tried to read incomplete UTF8 decoded String");
        }
    }

    /* renamed from: e */
    public void mo35444e() {
        super.mo35444e();
        this.f22079f.setLength(0);
    }

    /* renamed from: g */
    public int mo35447g() {
        return this.f22079f.length();
    }

    public String toString() {
        m28960f();
        return this.f22079f.toString();
    }
}
