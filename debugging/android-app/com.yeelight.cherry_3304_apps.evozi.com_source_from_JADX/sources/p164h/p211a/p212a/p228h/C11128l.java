package p164h.p211a.p212a.p228h;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: h.a.a.h.l */
public class C11128l extends Exception {

    /* renamed from: a */
    private Object f22033a;

    public C11128l() {
        super("Multiple exceptions");
    }

    /* renamed from: a */
    public void mo35374a(Throwable th) {
        if (th instanceof C11128l) {
            C11128l lVar = (C11128l) th;
            for (int i = 0; i < C11126j.m28890q(lVar.f22033a); i++) {
                this.f22033a = C11126j.m28879b(this.f22033a, C11126j.m28884j(lVar.f22033a, i));
            }
            return;
        }
        this.f22033a = C11126j.m28879b(this.f22033a, th);
    }

    /* renamed from: b */
    public Throwable mo35375b(int i) {
        return (Throwable) C11126j.m28884j(this.f22033a, i);
    }

    /* renamed from: c */
    public void mo35376c() {
        int q = C11126j.m28890q(this.f22033a);
        if (q != 0) {
            if (q == 1) {
                Throwable th = (Throwable) C11126j.m28884j(this.f22033a, 0);
                if (th instanceof Error) {
                    throw ((Error) th);
                } else if (th instanceof Exception) {
                    throw ((Exception) th);
                }
            }
            throw this;
        }
    }

    /* renamed from: d */
    public void mo35377d() {
        if (C11126j.m28890q(this.f22033a) > 0) {
            throw this;
        }
    }

    /* renamed from: e */
    public void mo35378e() {
        int q = C11126j.m28890q(this.f22033a);
        if (q == 0) {
            return;
        }
        if (q == 1) {
            Throwable th = (Throwable) C11126j.m28884j(this.f22033a, 0);
            if (th instanceof Error) {
                throw ((Error) th);
            } else if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            } else {
                throw new RuntimeException(th);
            }
        } else {
            throw new RuntimeException(this);
        }
    }

    /* renamed from: f */
    public int mo35379f() {
        return C11126j.m28890q(this.f22033a);
    }

    public void printStackTrace() {
        super.printStackTrace();
        for (int i = 0; i < C11126j.m28890q(this.f22033a); i++) {
            ((Throwable) C11126j.m28884j(this.f22033a, i)).printStackTrace();
        }
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        for (int i = 0; i < C11126j.m28890q(this.f22033a); i++) {
            ((Throwable) C11126j.m28884j(this.f22033a, i)).printStackTrace(printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        for (int i = 0; i < C11126j.m28890q(this.f22033a); i++) {
            ((Throwable) C11126j.m28884j(this.f22033a, i)).printStackTrace(printWriter);
        }
    }

    public String toString() {
        StringBuilder sb;
        if (C11126j.m28890q(this.f22033a) > 0) {
            sb = new StringBuilder();
            sb.append(C11128l.class.getSimpleName());
            sb.append(C11126j.m28885k(this.f22033a));
        } else {
            sb = new StringBuilder();
            sb.append(C11128l.class.getSimpleName());
            sb.append("[]");
        }
        return sb.toString();
    }
}
