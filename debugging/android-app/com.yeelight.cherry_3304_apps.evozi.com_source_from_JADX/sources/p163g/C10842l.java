package p163g;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: g.l */
public final class C10842l implements C4416t {

    /* renamed from: a */
    private final C4410e f20912a;

    /* renamed from: b */
    private final Inflater f20913b;

    /* renamed from: c */
    private int f20914c;

    /* renamed from: d */
    private boolean f20915d;

    C10842l(C4410e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f20912a = eVar;
            this.f20913b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public C10842l(C4416t tVar, Inflater inflater) {
        this(C10843m.m27009d(tVar), inflater);
    }

    /* renamed from: b */
    private void m27002b() {
        int i = this.f20914c;
        if (i != 0) {
            int remaining = i - this.f20913b.getRemaining();
            this.f20914c -= remaining;
            this.f20912a.skip((long) remaining);
        }
    }

    /* renamed from: P0 */
    public long mo9541P0(C4406c cVar, long j) {
        C4413p j1;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f20915d) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean a = mo34168a();
                try {
                    j1 = cVar.mo24241j1(1);
                    int inflate = this.f20913b.inflate(j1.f7958a, j1.f7960c, (int) Math.min(j, (long) (8192 - j1.f7960c)));
                    if (inflate > 0) {
                        j1.f7960c += inflate;
                        long j2 = (long) inflate;
                        cVar.f7949b += j2;
                        return j2;
                    } else if (this.f20913b.finished()) {
                        break;
                    } else if (this.f20913b.needsDictionary()) {
                        break;
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m27002b();
            if (j1.f7959b != j1.f7960c) {
                return -1;
            }
            cVar.f7948a = j1.mo24306b();
            C4414q.m12894a(j1);
            return -1;
        }
    }

    /* renamed from: a */
    public final boolean mo34168a() {
        if (!this.f20913b.needsInput()) {
            return false;
        }
        m27002b();
        if (this.f20913b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f20912a.mo24274x()) {
            return true;
        } else {
            C4413p pVar = this.f20912a.mo24208H().f7948a;
            int i = pVar.f7960c;
            int i2 = pVar.f7959b;
            int i3 = i - i2;
            this.f20914c = i3;
            this.f20913b.setInput(pVar.f7958a, i2, i3);
            return false;
        }
    }

    public void close() {
        if (!this.f20915d) {
            this.f20913b.end();
            this.f20915d = true;
            this.f20912a.close();
        }
    }

    /* renamed from: f */
    public C4417u mo9542f() {
        return this.f20912a.mo9542f();
    }
}
