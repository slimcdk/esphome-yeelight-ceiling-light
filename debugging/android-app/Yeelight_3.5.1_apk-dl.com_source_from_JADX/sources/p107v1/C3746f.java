package p107v1;

import com.google.gson.C2478h;
import com.google.gson.C2528k;
import com.google.gson.C2529l;
import com.google.gson.C2530m;
import com.google.gson.C2531n;
import com.google.gson.stream.C2537a;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: v1.f */
public final class C3746f extends C2537a {

    /* renamed from: o */
    private static final Writer f6278o = new C3747a();

    /* renamed from: p */
    private static final C2531n f6279p = new C2531n("closed");

    /* renamed from: l */
    private final List<C2528k> f6280l = new ArrayList();

    /* renamed from: m */
    private String f6281m;

    /* renamed from: n */
    private C2528k f6282n = C2529l.f4270a;

    /* renamed from: v1.f$a */
    static class C3747a extends Writer {
        C3747a() {
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

    public C3746f() {
        super(f6278o);
    }

    /* renamed from: d0 */
    private C2528k m10668d0() {
        List<C2528k> list = this.f6280l;
        return list.get(list.size() - 1);
    }

    /* renamed from: f0 */
    private void m10669f0(C2528k kVar) {
        if (this.f6281m != null) {
            if (!kVar.mo19387l() || mo19430l()) {
                ((C2530m) m10668d0()).mo19396o(this.f6281m, kVar);
            }
            this.f6281m = null;
        } else if (this.f6280l.isEmpty()) {
            this.f6282n = kVar;
        } else {
            C2528k d0 = m10668d0();
            if (d0 instanceof C2478h) {
                ((C2478h) d0).mo19259o(kVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: J */
    public C2537a mo19419J(long j) {
        m10669f0(new C2531n((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: N */
    public C2537a mo19420N(Boolean bool) {
        if (bool == null) {
            return mo19434s();
        }
        m10669f0(new C2531n(bool));
        return this;
    }

    /* renamed from: P */
    public C2537a mo19421P(Number number) {
        if (number == null) {
            return mo19434s();
        }
        if (!mo19432n()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m10669f0(new C2531n(number));
        return this;
    }

    /* renamed from: T */
    public C2537a mo19422T(String str) {
        if (str == null) {
            return mo19434s();
        }
        m10669f0(new C2531n(str));
        return this;
    }

    /* renamed from: V */
    public C2537a mo19423V(boolean z) {
        m10669f0(new C2531n(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: c0 */
    public C2528k mo26184c0() {
        if (this.f6280l.isEmpty()) {
            return this.f6282n;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f6280l);
    }

    public void close() {
        if (this.f6280l.isEmpty()) {
            this.f6280l.add(f6279p);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public C2537a mo19425d() {
        C2478h hVar = new C2478h();
        m10669f0(hVar);
        this.f6280l.add(hVar);
        return this;
    }

    /* renamed from: f */
    public C2537a mo19426f() {
        C2530m mVar = new C2530m();
        m10669f0(mVar);
        this.f6280l.add(mVar);
        return this;
    }

    public void flush() {
    }

    /* renamed from: i */
    public C2537a mo19428i() {
        if (this.f6280l.isEmpty() || this.f6281m != null) {
            throw new IllegalStateException();
        } else if (m10668d0() instanceof C2478h) {
            List<C2528k> list = this.f6280l;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: k */
    public C2537a mo19429k() {
        if (this.f6280l.isEmpty() || this.f6281m != null) {
            throw new IllegalStateException();
        } else if (m10668d0() instanceof C2530m) {
            List<C2528k> list = this.f6280l;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: p */
    public C2537a mo19433p(String str) {
        if (this.f6280l.isEmpty() || this.f6281m != null) {
            throw new IllegalStateException();
        } else if (m10668d0() instanceof C2530m) {
            this.f6281m = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: s */
    public C2537a mo19434s() {
        m10669f0(C2529l.f4270a);
        return this;
    }
}
