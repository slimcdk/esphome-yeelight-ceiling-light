package p011c.p012a.p046d.p047x.p048n;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import p011c.p012a.p046d.C0673i;
import p011c.p012a.p046d.C0676l;
import p011c.p012a.p046d.C0678n;
import p011c.p012a.p046d.C0679o;
import p011c.p012a.p046d.C0681q;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.x.n.f */
public final class C0744f extends C0812c {

    /* renamed from: o */
    private static final Writer f501o = new C0745a();

    /* renamed from: p */
    private static final C0681q f502p = new C0681q("closed");

    /* renamed from: l */
    private final List<C0676l> f503l = new ArrayList();

    /* renamed from: m */
    private String f504m;

    /* renamed from: n */
    private C0676l f505n = C0678n.f414a;

    /* renamed from: c.a.d.x.n.f$a */
    static class C0745a extends Writer {
        C0745a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C0744f() {
        super(f501o);
    }

    /* renamed from: c0 */
    private C0676l m831c0() {
        List<C0676l> list = this.f503l;
        return list.get(list.size() - 1);
    }

    /* renamed from: d0 */
    private void m832d0(C0676l lVar) {
        if (this.f504m != null) {
            if (!lVar.mo8743g() || mo8980o()) {
                ((C0679o) m831c0()).mo8752j(this.f504m, lVar);
            }
            this.f504m = null;
        } else if (this.f503l.isEmpty()) {
            this.f505n = lVar;
        } else {
            C0676l c0 = m831c0();
            if (c0 instanceof C0673i) {
                ((C0673i) c0).mo8737j(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: D */
    public C0812c mo8874D() {
        m832d0(C0678n.f414a);
        return this;
    }

    /* renamed from: T */
    public C0812c mo8875T(long j) {
        m832d0(new C0681q((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: V */
    public C0812c mo8876V(Boolean bool) {
        if (bool == null) {
            mo8874D();
            return this;
        }
        m832d0(new C0681q(bool));
        return this;
    }

    /* renamed from: W */
    public C0812c mo8877W(Number number) {
        if (number == null) {
            mo8874D();
            return this;
        }
        if (!mo8982t()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m832d0(new C0681q(number));
        return this;
    }

    /* renamed from: X */
    public C0812c mo8878X(String str) {
        if (str == null) {
            mo8874D();
            return this;
        }
        m832d0(new C0681q(str));
        return this;
    }

    /* renamed from: Z */
    public C0812c mo8879Z(boolean z) {
        m832d0(new C0681q(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: b0 */
    public C0676l mo8880b0() {
        if (this.f503l.isEmpty()) {
            return this.f505n;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f503l);
    }

    public void close() {
        if (this.f503l.isEmpty()) {
            this.f503l.add(f502p);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public void flush() {
    }

    /* renamed from: g */
    public C0812c mo8883g() {
        C0673i iVar = new C0673i();
        m832d0(iVar);
        this.f503l.add(iVar);
        return this;
    }

    /* renamed from: h */
    public C0812c mo8884h() {
        C0679o oVar = new C0679o();
        m832d0(oVar);
        this.f503l.add(oVar);
        return this;
    }

    /* renamed from: j */
    public C0812c mo8885j() {
        if (this.f503l.isEmpty() || this.f504m != null) {
            throw new IllegalStateException();
        } else if (m831c0() instanceof C0673i) {
            List<C0676l> list = this.f503l;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: n */
    public C0812c mo8886n() {
        if (this.f503l.isEmpty() || this.f504m != null) {
            throw new IllegalStateException();
        } else if (m831c0() instanceof C0679o) {
            List<C0676l> list = this.f503l;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: u */
    public C0812c mo8887u(String str) {
        if (this.f503l.isEmpty() || this.f504m != null) {
            throw new IllegalStateException();
        } else if (m831c0() instanceof C0679o) {
            this.f504m = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }
}
