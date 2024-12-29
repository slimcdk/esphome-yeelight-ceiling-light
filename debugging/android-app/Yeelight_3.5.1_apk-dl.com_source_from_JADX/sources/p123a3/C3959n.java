package p123a3;

import java.net.ProtocolException;
import okio.C3564c;
import okio.C9852q;
import okio.C9854s;
import p231y2.C12033k;

/* renamed from: a3.n */
public final class C3959n implements C9852q {

    /* renamed from: a */
    private boolean f6672a;

    /* renamed from: b */
    private final int f6673b;

    /* renamed from: c */
    private final C3564c f6674c;

    public C3959n() {
        this(-1);
    }

    public C3959n(int i) {
        this.f6674c = new C3564c();
        this.f6673b = i;
    }

    /* renamed from: a */
    public long mo26487a() {
        return this.f6674c.mo24758i1();
    }

    /* renamed from: c */
    public void mo26488c(C9852q qVar) {
        C3564c cVar = new C3564c();
        C3564c cVar2 = this.f6674c;
        cVar2.mo24747d(cVar, 0, cVar2.mo24758i1());
        qVar.mo24476q0(cVar, cVar.mo24758i1());
    }

    public void close() {
        if (!this.f6672a) {
            this.f6672a = true;
            if (this.f6674c.mo24758i1() < ((long) this.f6673b)) {
                throw new ProtocolException("content-length promised " + this.f6673b + " bytes, but received " + this.f6674c.mo24758i1());
            }
        }
    }

    public void flush() {
    }

    /* renamed from: j */
    public C9854s mo24475j() {
        return C9854s.f17853d;
    }

    /* renamed from: q0 */
    public void mo24476q0(C3564c cVar, long j) {
        if (!this.f6672a) {
            C12033k.m31041a(cVar.mo24758i1(), 0, j);
            if (this.f6673b == -1 || this.f6674c.mo24758i1() <= ((long) this.f6673b) - j) {
                this.f6674c.mo24476q0(cVar, j);
                return;
            }
            throw new ProtocolException("exceeded content-length limit of " + this.f6673b + " bytes");
        }
        throw new IllegalStateException("closed");
    }
}
