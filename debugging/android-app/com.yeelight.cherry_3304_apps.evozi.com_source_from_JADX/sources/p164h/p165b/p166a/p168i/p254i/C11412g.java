package p164h.p165b.p166a.p168i.p254i;

import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11404g;
import p164h.p165b.p166a.p240h.p243r.p245l.C11269i;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;

/* renamed from: h.b.a.i.i.g */
public class C11412g extends C11404g {

    /* renamed from: e */
    private static final Logger f22701e = Logger.getLogger(C11412g.class.getName());

    /* renamed from: c */
    private final C11296f0 f22702c;

    /* renamed from: d */
    private final int f22703d;

    public C11412g(C4423b bVar, C11296f0 f0Var, int i) {
        super(bVar);
        if (C11296f0.C11297a.ST.mo35850d(f0Var.getClass())) {
            this.f22702c = f0Var;
            this.f22703d = i;
            return;
        }
        throw new IllegalArgumentException("Given search target instance is not a valid header class for type ST: " + f0Var.getClass());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36172b() {
        Logger logger = f22701e;
        logger.fine("Executing search for target: " + this.f22702c.mo35841a() + " with MX seconds: " + mo36199f());
        C11269i iVar = new C11269i(this.f22702c, mo36199f());
        mo36200g(iVar);
        int i = 0;
        while (i < mo36198e()) {
            try {
                mo36173c().getRouter().mo24450a(iVar);
                Logger logger2 = f22701e;
                logger2.finer("Sleeping " + mo36197d() + " milliseconds");
                Thread.sleep((long) mo36197d());
                i++;
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* renamed from: d */
    public int mo36197d() {
        return 500;
    }

    /* renamed from: e */
    public int mo36198e() {
        return 5;
    }

    /* renamed from: f */
    public int mo36199f() {
        return this.f22703d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo36200g(C11269i iVar) {
    }
}
