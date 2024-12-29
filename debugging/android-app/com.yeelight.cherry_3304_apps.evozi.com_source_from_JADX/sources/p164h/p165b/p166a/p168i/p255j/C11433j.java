package p164h.p165b.p166a.p168i.p255j;

import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11405h;
import p164h.p165b.p166a.p240h.p242q.C11236a;
import p164h.p165b.p166a.p240h.p242q.C11239d;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p246m.C11284j;
import p164h.p165b.p166a.p240h.p248s.C11334n;

/* renamed from: h.b.a.i.j.j */
public class C11433j extends C11405h<C11284j, C11244e> {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Logger f22737f = Logger.getLogger(C11433j.class.getName());

    /* renamed from: e */
    protected final C11239d f22738e;

    /* renamed from: h.b.a.i.j.j$a */
    class C11434a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11244e f22739a;

        C11434a(C11244e eVar) {
            this.f22739a = eVar;
        }

        public void run() {
            C11239d dVar;
            C11244e eVar = this.f22739a;
            C11236a aVar = null;
            if (eVar == null) {
                C11433j.f22737f.fine("Unsubscribe failed, no response received");
                C11433j.this.f22738e.mo35737R(C11236a.UNSUBSCRIBE_FAILED, (C11252j) null);
                return;
            }
            if (((C11252j) eVar.mo35776k()).mo35798f()) {
                Logger g = C11433j.f22737f;
                g.fine("Unsubscribe failed, response was: " + this.f22739a);
                dVar = C11433j.this.f22738e;
                aVar = C11236a.UNSUBSCRIBE_FAILED;
            } else {
                Logger g2 = C11433j.f22737f;
                g2.fine("Unsubscribe successful, response was: " + this.f22739a);
                dVar = C11433j.this.f22738e;
            }
            dVar.mo35737R(aVar, (C11252j) this.f22739a.mo35776k());
        }
    }

    public C11433j(C4423b bVar, C11239d dVar) {
        super(bVar, new C11284j(dVar, bVar.getConfiguration().getEventSubscriptionHeaders((C11334n) dVar.mo35723N())));
        this.f22738e = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C11244e mo36176d() {
        Logger logger = f22737f;
        logger.fine("Sending unsubscribe request: " + mo36177e());
        try {
            C11244e d = mo36173c().getRouter().mo24453d(mo36177e());
            mo36226h(d);
            return d;
        } catch (Throwable th) {
            mo36226h((C11244e) null);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo36226h(C11244e eVar) {
        mo36173c().getRegistry().mo24435z(this.f22738e);
        mo36173c().getConfiguration().getRegistryListenerExecutor().execute(new C11434a(eVar));
    }
}
