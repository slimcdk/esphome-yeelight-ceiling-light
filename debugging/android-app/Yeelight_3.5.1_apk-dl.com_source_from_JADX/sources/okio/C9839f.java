package okio;

import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: okio.f */
public final class C9839f implements C9852q {

    /* renamed from: a */
    private final C9837d f17826a;

    /* renamed from: b */
    private final Deflater f17827b;

    /* renamed from: c */
    private boolean f17828c;

    C9839f(C9837d dVar, Deflater deflater) {
        if (dVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.f17826a = dVar;
            this.f17827b = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public C9839f(C9852q qVar, Deflater deflater) {
        this(C9845l.m23737c(qVar), deflater);
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    private void m23707a(boolean z) {
        C3568o l1;
        C3564c F = this.f17826a.mo24724F();
        while (true) {
            l1 = F.mo24764l1(1);
            Deflater deflater = this.f17827b;
            byte[] bArr = l1.f5937a;
            int i = l1.f5939c;
            int i2 = 8192 - i;
            int deflate = z ? deflater.deflate(bArr, i, i2, 2) : deflater.deflate(bArr, i, i2);
            if (deflate > 0) {
                l1.f5939c += deflate;
                F.f5933b += (long) deflate;
                this.f17826a.mo24738Y();
            } else if (this.f17827b.needsInput()) {
                break;
            }
        }
        if (l1.f5938b == l1.f5939c) {
            F.f5932a = l1.mo24805b();
            C3569p.m10054a(l1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo39080c() {
        this.f17827b.finish();
        m23707a(false);
    }

    public void close() {
        if (!this.f17828c) {
            Throwable th = null;
            try {
                mo39080c();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f17827b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f17826a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f17828c = true;
            if (th != null) {
                C9856t.m23808e(th);
            }
        }
    }

    public void flush() {
        m23707a(true);
        this.f17826a.flush();
    }

    /* renamed from: j */
    public C9854s mo24475j() {
        return this.f17826a.mo24475j();
    }

    /* renamed from: q0 */
    public void mo24476q0(C3564c cVar, long j) {
        C9856t.m23805b(cVar.f5933b, 0, j);
        while (j > 0) {
            C3568o oVar = cVar.f5932a;
            int min = (int) Math.min(j, (long) (oVar.f5939c - oVar.f5938b));
            this.f17827b.setInput(oVar.f5937a, oVar.f5938b, min);
            m23707a(false);
            long j2 = (long) min;
            cVar.f5933b -= j2;
            int i = oVar.f5938b + min;
            oVar.f5938b = i;
            if (i == oVar.f5939c) {
                cVar.f5932a = oVar.mo24805b();
                C3569p.m10054a(oVar);
            }
            j -= j2;
        }
    }

    public String toString() {
        return "DeflaterSink(" + this.f17826a + ")";
    }
}
