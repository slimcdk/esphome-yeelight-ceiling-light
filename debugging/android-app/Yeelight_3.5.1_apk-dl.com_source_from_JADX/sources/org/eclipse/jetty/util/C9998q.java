package org.eclipse.jetty.util;

/* renamed from: org.eclipse.jetty.util.q */
public class C9998q extends Utf8Appendable {

    /* renamed from: f */
    final StringBuffer f18442f = ((StringBuffer) this.f18374a);

    public C9998q(int i) {
        super(new StringBuffer(i));
    }

    /* renamed from: f */
    private void m24732f() {
        if (!mo40204d()) {
            throw new IllegalArgumentException("Tried to read incomplete UTF8 decoded String");
        }
    }

    /* renamed from: g */
    public StringBuffer mo40274g() {
        m24732f();
        return this.f18442f;
    }

    public String toString() {
        m24732f();
        return this.f18442f.toString();
    }
}
