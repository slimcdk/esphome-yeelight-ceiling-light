package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: okio.j */
public final class C9843j implements C9853r {

    /* renamed from: a */
    private int f17832a = 0;

    /* renamed from: b */
    private final C9838e f17833b;

    /* renamed from: c */
    private final Inflater f17834c;

    /* renamed from: d */
    private final C9844k f17835d;

    /* renamed from: e */
    private final CRC32 f17836e = new CRC32();

    public C9843j(C9853r rVar) {
        if (rVar != null) {
            Inflater inflater = new Inflater(true);
            this.f17834c = inflater;
            C9838e d = C9845l.m23738d(rVar);
            this.f17833b = d;
            this.f17835d = new C9844k(d, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    private void m23725a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    /* renamed from: c */
    private void m23726c() {
        this.f17833b.mo24742a1(10);
        byte h = this.f17833b.mo24724F().mo24753h(3);
        boolean z = ((h >> 1) & 1) == 1;
        if (z) {
            m23728f(this.f17833b.mo24724F(), 0, 10);
        }
        m23725a("ID1ID2", 8075, this.f17833b.readShort());
        this.f17833b.skip(8);
        if (((h >> 2) & 1) == 1) {
            this.f17833b.mo24742a1(2);
            if (z) {
                m23728f(this.f17833b.mo24724F(), 0, 2);
            }
            long Q0 = (long) this.f17833b.mo24724F().mo24735Q0();
            this.f17833b.mo24742a1(Q0);
            if (z) {
                m23728f(this.f17833b.mo24724F(), 0, Q0);
            }
            this.f17833b.skip(Q0);
        }
        if (((h >> 3) & 1) == 1) {
            long d1 = this.f17833b.mo24748d1((byte) 0);
            if (d1 != -1) {
                if (z) {
                    m23728f(this.f17833b.mo24724F(), 0, d1 + 1);
                }
                this.f17833b.skip(d1 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((h >> 4) & 1) == 1) {
            long d12 = this.f17833b.mo24748d1((byte) 0);
            if (d12 != -1) {
                if (z) {
                    m23728f(this.f17833b.mo24724F(), 0, d12 + 1);
                }
                this.f17833b.skip(d12 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m23725a("FHCRC", this.f17833b.mo24735Q0(), (short) ((int) this.f17836e.getValue()));
            this.f17836e.reset();
        }
    }

    /* renamed from: d */
    private void m23727d() {
        m23725a("CRC", this.f17833b.mo24726I0(), (int) this.f17836e.getValue());
        m23725a("ISIZE", this.f17833b.mo24726I0(), (int) this.f17834c.getBytesWritten());
    }

    /* renamed from: f */
    private void m23728f(C3564c cVar, long j, long j2) {
        C3568o oVar = cVar.f5932a;
        while (true) {
            int i = oVar.f5939c;
            int i2 = oVar.f5938b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            oVar = oVar.f5942f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) oVar.f5938b) + j);
            int min = (int) Math.min((long) (oVar.f5939c - i3), j2);
            this.f17836e.update(oVar.f5937a, i3, min);
            j2 -= (long) min;
            oVar = oVar.f5942f;
            j = 0;
        }
    }

    /* renamed from: R0 */
    public long mo24477R0(C3564c cVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (j == 0) {
            return 0;
        } else {
            if (this.f17832a == 0) {
                m23726c();
                this.f17832a = 1;
            }
            if (this.f17832a == 1) {
                long j2 = cVar.f5933b;
                long R0 = this.f17835d.mo24477R0(cVar, j);
                if (R0 != -1) {
                    m23728f(cVar, j2, R0);
                    return R0;
                }
                this.f17832a = 2;
            }
            if (this.f17832a == 2) {
                m23727d();
                this.f17832a = 3;
                if (!this.f17833b.mo24734Q()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public void close() {
        this.f17835d.close();
    }

    /* renamed from: j */
    public C9854s mo24479j() {
        return this.f17833b.mo24479j();
    }
}
