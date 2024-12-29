package p011c.p083d.p084a.p085d0.p087n;

import java.net.ProtocolException;
import p011c.p083d.p084a.p085d0.C1024k;
import p163g.C4406c;
import p163g.C4415s;
import p163g.C4417u;

/* renamed from: c.d.a.d0.n.o */
public final class C1101o implements C4415s {

    /* renamed from: a */
    private boolean f1615a;

    /* renamed from: b */
    private final int f1616b;

    /* renamed from: c */
    private final C4406c f1617c;

    public C1101o() {
        this(-1);
    }

    public C1101o(int i) {
        this.f1617c = new C4406c();
        this.f1616b = i;
    }

    /* renamed from: a */
    public long mo9650a() {
        return this.f1617c.mo24233g1();
    }

    /* renamed from: b */
    public void mo9651b(C4415s sVar) {
        C4406c cVar = new C4406c();
        C4406c cVar2 = this.f1617c;
        cVar2.mo24240j(cVar, 0, cVar2.mo24233g1());
        sVar.mo9442p0(cVar, cVar.mo24233g1());
    }

    public void close() {
        if (!this.f1615a) {
            this.f1615a = true;
            if (this.f1617c.mo24233g1() < ((long) this.f1616b)) {
                throw new ProtocolException("content-length promised " + this.f1616b + " bytes, but received " + this.f1617c.mo24233g1());
            }
        }
    }

    /* renamed from: f */
    public C4417u mo9440f() {
        return C4417u.f7967d;
    }

    public void flush() {
    }

    /* renamed from: p0 */
    public void mo9442p0(C4406c cVar, long j) {
        if (!this.f1615a) {
            C1024k.m2090a(cVar.mo24233g1(), 0, j);
            if (this.f1616b == -1 || this.f1617c.mo24233g1() <= ((long) this.f1616b) - j) {
                this.f1617c.mo9442p0(cVar, j);
                return;
            }
            throw new ProtocolException("exceeded content-length limit of " + this.f1616b + " bytes");
        }
        throw new IllegalStateException("closed");
    }
}
