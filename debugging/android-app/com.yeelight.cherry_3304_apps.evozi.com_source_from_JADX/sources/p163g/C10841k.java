package p163g;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: g.k */
public final class C10841k implements C4416t {

    /* renamed from: a */
    private int f20907a = 0;

    /* renamed from: b */
    private final C4410e f20908b;

    /* renamed from: c */
    private final Inflater f20909c;

    /* renamed from: d */
    private final C10842l f20910d;

    /* renamed from: e */
    private final CRC32 f20911e = new CRC32();

    public C10841k(C4416t tVar) {
        if (tVar != null) {
            this.f20909c = new Inflater(true);
            C4410e d = C10843m.m27009d(tVar);
            this.f20908b = d;
            this.f20910d = new C10842l(d, this.f20909c);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    private void m26996a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    /* renamed from: b */
    private void m26997b() {
        this.f20908b.mo24218X0(10);
        byte s = this.f20908b.mo24208H().mo24260s(3);
        boolean z = ((s >> 1) & 1) == 1;
        if (z) {
            m26999h(this.f20908b.mo24208H(), 0, 10);
        }
        m26996a("ID1ID2", 8075, this.f20908b.readShort());
        this.f20908b.skip(8);
        if (((s >> 2) & 1) == 1) {
            this.f20908b.mo24218X0(2);
            if (z) {
                m26999h(this.f20908b.mo24208H(), 0, 2);
            }
            long N0 = (long) this.f20908b.mo24208H().mo24213N0();
            this.f20908b.mo24218X0(N0);
            if (z) {
                m26999h(this.f20908b.mo24208H(), 0, N0);
            }
            this.f20908b.skip(N0);
        }
        if (((s >> 3) & 1) == 1) {
            long b1 = this.f20908b.mo24224b1((byte) 0);
            if (b1 != -1) {
                if (z) {
                    m26999h(this.f20908b.mo24208H(), 0, b1 + 1);
                }
                this.f20908b.skip(b1 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((s >> 4) & 1) == 1) {
            long b12 = this.f20908b.mo24224b1((byte) 0);
            if (b12 != -1) {
                if (z) {
                    m26999h(this.f20908b.mo24208H(), 0, b12 + 1);
                }
                this.f20908b.skip(b12 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m26996a("FHCRC", this.f20908b.mo24213N0(), (short) ((int) this.f20911e.getValue()));
            this.f20911e.reset();
        }
    }

    /* renamed from: g */
    private void m26998g() {
        m26996a("CRC", this.f20908b.mo24206E0(), (int) this.f20911e.getValue());
        m26996a("ISIZE", this.f20908b.mo24206E0(), (int) this.f20909c.getBytesWritten());
    }

    /* renamed from: h */
    private void m26999h(C4406c cVar, long j, long j2) {
        C4413p pVar = cVar.f7948a;
        while (true) {
            int i = pVar.f7960c;
            int i2 = pVar.f7959b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            pVar = pVar.f7963f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) pVar.f7959b) + j);
            int min = (int) Math.min((long) (pVar.f7960c - i3), j2);
            this.f20911e.update(pVar.f7958a, i3, min);
            j2 -= (long) min;
            pVar = pVar.f7963f;
            j = 0;
        }
    }

    /* renamed from: P0 */
    public long mo9541P0(C4406c cVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (j == 0) {
            return 0;
        } else {
            if (this.f20907a == 0) {
                m26997b();
                this.f20907a = 1;
            }
            if (this.f20907a == 1) {
                long j2 = cVar.f7949b;
                long P0 = this.f20910d.mo9541P0(cVar, j);
                if (P0 != -1) {
                    m26999h(cVar, j2, P0);
                    return P0;
                }
                this.f20907a = 2;
            }
            if (this.f20907a == 2) {
                m26998g();
                this.f20907a = 3;
                if (!this.f20908b.mo24274x()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public void close() {
        this.f20910d.close();
    }

    /* renamed from: f */
    public C4417u mo9542f() {
        return this.f20908b.mo9542f();
    }
}
