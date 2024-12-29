package p239z5;

import java.io.IOException;
import java.io.Writer;
import org.eclipse.jetty.http.C9887a;
import org.eclipse.jetty.p195io.EofException;
import org.eclipse.jetty.util.C9983g;
import p208s4.C10362n;
import p225w5.C11940d;
import p225w5.C11946h;

/* renamed from: z5.l */
public class C12178l extends C10362n {

    /* renamed from: b */
    protected final C12151b f22423b;

    /* renamed from: c */
    protected final C9887a f22424c;

    /* renamed from: d */
    private boolean f22425d;

    /* renamed from: e */
    private C11946h f22426e;

    /* renamed from: f */
    String f22427f;

    /* renamed from: g */
    Writer f22428g;

    /* renamed from: h */
    char[] f22429h;

    /* renamed from: i */
    C9983g f22430i;

    public C12178l(C12151b bVar) {
        this.f22423b = bVar;
        this.f22424c = (C9887a) bVar.mo42988p();
    }

    /* renamed from: h */
    private void m31731h(C11940d dVar) {
        if (this.f22425d) {
            throw new IOException("Closed");
        } else if (this.f22424c.mo39708B()) {
            while (this.f22424c.mo39707A()) {
                this.f22424c.mo39735v((long) mo43048c());
                if (this.f22425d) {
                    throw new IOException("Closed");
                } else if (!this.f22424c.mo39708B()) {
                    throw new EofException();
                }
            }
            this.f22424c.mo39753l(dVar, false);
            if (this.f22424c.mo39723j()) {
                flush();
                close();
            } else if (this.f22424c.mo39707A()) {
                this.f22423b.mo42982i(false);
            }
            while (dVar.length() > 0 && this.f22424c.mo39708B()) {
                this.f22424c.mo39735v((long) mo43048c());
            }
        } else {
            throw new EofException();
        }
    }

    /* renamed from: a */
    public void mo39911a(String str) {
        write(str.getBytes());
    }

    /* renamed from: c */
    public int mo43048c() {
        return this.f22423b.mo42990r();
    }

    public void close() {
        this.f22425d = true;
    }

    /* renamed from: d */
    public boolean mo43049d() {
        return this.f22424c.mo39733t() > 0;
    }

    /* renamed from: f */
    public void mo43050f() {
        this.f22425d = false;
    }

    public void flush() {
        this.f22424c.mo39737x((long) mo43048c());
    }

    public boolean isClosed() {
        return this.f22425d;
    }

    public void write(int i) {
        C11946h hVar = this.f22426e;
        if (hVar == null) {
            this.f22426e = new C11946h(1);
        } else {
            hVar.clear();
        }
        this.f22426e.mo42414S0((byte) i);
        m31731h(this.f22426e);
    }

    public void write(byte[] bArr) {
        m31731h(new C11946h(bArr));
    }

    public void write(byte[] bArr, int i, int i2) {
        m31731h(new C11946h(bArr, i, i2));
    }
}
