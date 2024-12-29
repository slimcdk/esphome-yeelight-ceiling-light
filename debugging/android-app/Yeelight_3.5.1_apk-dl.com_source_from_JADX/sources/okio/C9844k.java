package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: okio.k */
public final class C9844k implements C9853r {

    /* renamed from: a */
    private final C9838e f17837a;

    /* renamed from: b */
    private final Inflater f17838b;

    /* renamed from: c */
    private int f17839c;

    /* renamed from: d */
    private boolean f17840d;

    C9844k(C9838e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f17837a = eVar;
            this.f17838b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public C9844k(C9853r rVar, Inflater inflater) {
        this(C9845l.m23738d(rVar), inflater);
    }

    /* renamed from: c */
    private void m23731c() {
        int i = this.f17839c;
        if (i != 0) {
            int remaining = i - this.f17838b.getRemaining();
            this.f17839c -= remaining;
            this.f17837a.skip((long) remaining);
        }
    }

    /* renamed from: R0 */
    public long mo24477R0(C3564c cVar, long j) {
        C3568o l1;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f17840d) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean a = mo39094a();
                try {
                    l1 = cVar.mo24764l1(1);
                    int inflate = this.f17838b.inflate(l1.f5937a, l1.f5939c, (int) Math.min(j, (long) (8192 - l1.f5939c)));
                    if (inflate > 0) {
                        l1.f5939c += inflate;
                        long j2 = (long) inflate;
                        cVar.f5933b += j2;
                        return j2;
                    } else if (this.f17838b.finished()) {
                        break;
                    } else if (this.f17838b.needsDictionary()) {
                        break;
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m23731c();
            if (l1.f5938b != l1.f5939c) {
                return -1;
            }
            cVar.f5932a = l1.mo24805b();
            C3569p.m10054a(l1);
            return -1;
        }
    }

    /* renamed from: a */
    public final boolean mo39094a() {
        if (!this.f17838b.needsInput()) {
            return false;
        }
        m23731c();
        if (this.f17838b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f17837a.mo24734Q()) {
            return true;
        } else {
            C3568o oVar = this.f17837a.mo24724F().f5932a;
            int i = oVar.f5939c;
            int i2 = oVar.f5938b;
            int i3 = i - i2;
            this.f17839c = i3;
            this.f17838b.setInput(oVar.f5937a, i2, i3);
            return false;
        }
    }

    public void close() {
        if (!this.f17840d) {
            this.f17838b.end();
            this.f17840d = true;
            this.f17837a.close();
        }
    }

    /* renamed from: j */
    public C9854s mo24479j() {
        return this.f17837a.mo24479j();
    }
}
