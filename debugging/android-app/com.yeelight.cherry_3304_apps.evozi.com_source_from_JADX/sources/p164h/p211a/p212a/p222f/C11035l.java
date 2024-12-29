package p164h.p211a.p212a.p222f;

import java.io.IOException;
import java.io.Writer;
import p154d.p155b.C10732r;
import p164h.p211a.p212a.p216c.C10889a;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10938k;
import p164h.p211a.p212a.p217d.C10943o;
import p164h.p211a.p212a.p228h.C11119g;

/* renamed from: h.a.a.f.l */
public class C11035l extends C10732r {

    /* renamed from: a */
    protected final C11010b f21623a;

    /* renamed from: b */
    protected final C10889a f21624b;

    /* renamed from: c */
    private boolean f21625c;

    /* renamed from: d */
    private C10938k f21626d;

    /* renamed from: e */
    String f21627e;

    /* renamed from: f */
    Writer f21628f;

    /* renamed from: g */
    char[] f21629g;

    /* renamed from: h */
    C11119g f21630h;

    public C11035l(C11010b bVar) {
        this.f21623a = bVar;
        this.f21624b = (C10889a) bVar.mo34843p();
    }

    /* renamed from: g */
    private void m28230g(C10929e eVar) {
        if (this.f21625c) {
            throw new IOException("Closed");
        } else if (this.f21624b.mo34417y()) {
            while (this.f21624b.mo34416x()) {
                this.f21624b.mo34411s((long) mo34908a());
                if (this.f21625c) {
                    throw new IOException("Closed");
                } else if (!this.f21624b.mo34417y()) {
                    throw new C10943o();
                }
            }
            this.f21624b.mo34432o(eVar, false);
            if (this.f21624b.mo34401i()) {
                flush();
                close();
            } else if (this.f21624b.mo34416x()) {
                this.f21623a.mo34837i(false);
            }
            while (eVar.length() > 0 && this.f21624b.mo34417y()) {
                this.f21624b.mo34411s((long) mo34908a());
            }
        } else {
            throw new C10943o();
        }
    }

    /* renamed from: a */
    public int mo34908a() {
        return this.f21623a.mo34845r();
    }

    /* renamed from: b */
    public void mo34909b() {
        this.f21625c = false;
    }

    public void close() {
        this.f21625c = true;
    }

    public void flush() {
        this.f21624b.mo34413u((long) mo34908a());
    }

    public boolean isClosed() {
        return this.f21625c;
    }

    public void write(int i) {
        C10938k kVar = this.f21626d;
        if (kVar == null) {
            this.f21626d = new C10938k(1);
        } else {
            kVar.clear();
        }
        this.f21626d.mo34560Q0((byte) i);
        m28230g(this.f21626d);
    }

    public void write(byte[] bArr) {
        m28230g(new C10938k(bArr));
    }

    public void write(byte[] bArr, int i, int i2) {
        m28230g(new C10938k(bArr, i, i2));
    }
}
