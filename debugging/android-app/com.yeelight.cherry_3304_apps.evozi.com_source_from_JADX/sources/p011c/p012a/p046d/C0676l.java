package p011c.p012a.p046d;

import java.io.IOException;
import java.io.StringWriter;
import p011c.p012a.p046d.p047x.C0727l;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.l */
public abstract class C0676l {
    /* renamed from: c */
    public C0673i mo8739c() {
        if (mo8742f()) {
            return (C0673i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: d */
    public C0679o mo8740d() {
        if (mo8744h()) {
            return (C0679o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: e */
    public C0681q mo8741e() {
        if (mo8745i()) {
            return (C0681q) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: f */
    public boolean mo8742f() {
        return this instanceof C0673i;
    }

    /* renamed from: g */
    public boolean mo8743g() {
        return this instanceof C0678n;
    }

    /* renamed from: h */
    public boolean mo8744h() {
        return this instanceof C0679o;
    }

    /* renamed from: i */
    public boolean mo8745i() {
        return this instanceof C0681q;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C0812c cVar = new C0812c(stringWriter);
            cVar.mo8978Q(true);
            C0727l.m785b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
