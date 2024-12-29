package p163g;

import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: g.g */
public final class C10837g implements C4415s {

    /* renamed from: a */
    private final C4409d f20901a;

    /* renamed from: b */
    private final Deflater f20902b;

    /* renamed from: c */
    private boolean f20903c;

    C10837g(C4409d dVar, Deflater deflater) {
        if (dVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.f20901a = dVar;
            this.f20902b = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public C10837g(C4415s sVar, Deflater deflater) {
        this(C10843m.m27008c(sVar), deflater);
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    private void m26977a(boolean z) {
        C4413p j1;
        C4406c H = this.f20901a.mo24208H();
        while (true) {
            j1 = H.mo24241j1(1);
            Deflater deflater = this.f20902b;
            byte[] bArr = j1.f7958a;
            int i = j1.f7960c;
            int i2 = 8192 - i;
            int deflate = z ? deflater.deflate(bArr, i, i2, 2) : deflater.deflate(bArr, i, i2);
            if (deflate > 0) {
                j1.f7960c += deflate;
                H.f7949b += (long) deflate;
                this.f20901a.mo24219Y();
            } else if (this.f20902b.needsInput()) {
                break;
            }
        }
        if (j1.f7959b == j1.f7960c) {
            H.f7948a = j1.mo24306b();
            C4414q.m12894a(j1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo34161b() {
        this.f20902b.finish();
        m26977a(false);
    }

    public void close() {
        if (!this.f20903c) {
            try {
                mo34161b();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f20902b.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.f20901a.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f20903c = true;
            if (th != null) {
                C10851v.m27083e(th);
                throw null;
            }
        }
    }

    /* renamed from: f */
    public C4417u mo9440f() {
        return this.f20901a.mo9440f();
    }

    public void flush() {
        m26977a(true);
        this.f20901a.flush();
    }

    /* renamed from: p0 */
    public void mo9442p0(C4406c cVar, long j) {
        C10851v.m27080b(cVar.f7949b, 0, j);
        while (j > 0) {
            C4413p pVar = cVar.f7948a;
            int min = (int) Math.min(j, (long) (pVar.f7960c - pVar.f7959b));
            this.f20902b.setInput(pVar.f7958a, pVar.f7959b, min);
            m26977a(false);
            long j2 = (long) min;
            cVar.f7949b -= j2;
            int i = pVar.f7959b + min;
            pVar.f7959b = i;
            if (i == pVar.f7960c) {
                cVar.f7948a = pVar.mo24306b();
                C4414q.m12894a(pVar);
            }
            j -= j2;
        }
    }

    public String toString() {
        return "DeflaterSink(" + this.f20901a + ")";
    }
}
