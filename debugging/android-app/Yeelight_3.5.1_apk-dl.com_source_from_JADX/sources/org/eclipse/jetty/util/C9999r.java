package org.eclipse.jetty.util;

/* renamed from: org.eclipse.jetty.util.r */
public class C9999r extends Utf8Appendable {

    /* renamed from: f */
    final StringBuilder f18443f = ((StringBuilder) this.f18374a);

    public C9999r() {
        super(new StringBuilder());
    }

    public C9999r(int i) {
        super(new StringBuilder(i));
    }

    /* renamed from: f */
    private void m24734f() {
        if (!mo40204d()) {
            throw new IllegalArgumentException("Tried to read incomplete UTF8 decoded String");
        }
    }

    /* renamed from: e */
    public void mo40205e() {
        super.mo40205e();
        this.f18443f.setLength(0);
    }

    /* renamed from: g */
    public int mo40276g() {
        return this.f18443f.length();
    }

    public String toString() {
        m24734f();
        return this.f18443f.toString();
    }
}
