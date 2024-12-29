package p164h.p165b.p166a.p168i.p255j;

import java.net.URL;
import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11405h;
import p164h.p165b.p166a.p240h.p242q.C11238c;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.p246m.C11279e;
import p164h.p165b.p166a.p240h.p252w.C11369g0;

/* renamed from: h.b.a.i.j.g */
public class C11422g extends C11405h<C11279e, C11244e> {

    /* renamed from: h */
    private static final Logger f22717h = Logger.getLogger(C11422g.class.getName());

    /* renamed from: e */
    protected final String f22718e;

    /* renamed from: f */
    protected final C11279e[] f22719f;

    /* renamed from: g */
    protected final C11369g0 f22720g;

    public C11422g(C4423b bVar, C11238c cVar) {
        super(bVar, null);
        this.f22718e = cVar.mo35724O();
        this.f22719f = new C11279e[cVar.mo35731U().size()];
        int i = 0;
        for (URL eVar : cVar.mo35731U()) {
            this.f22719f[i] = new C11279e(cVar, eVar);
            mo36173c().getConfiguration().getGenaEventProcessor().mo24467a(this.f22719f[i]);
            i++;
        }
        this.f22720g = cVar.mo35720C();
        cVar.mo35732V();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C11244e mo36176d() {
        StringBuilder sb;
        String str;
        f22717h.fine("Sending event for subscription: " + this.f22718e);
        C11244e eVar = null;
        for (C11279e eVar2 : this.f22719f) {
            int i = (this.f22720g.mo36099c().longValue() > 0 ? 1 : (this.f22720g.mo36099c().longValue() == 0 ? 0 : -1));
            Logger logger = f22717h;
            if (i == 0) {
                str = "Sending initial event message to callback URL: ";
            } else {
                sb = new StringBuilder();
                sb.append("Sending event message '");
                sb.append(this.f22720g);
                str = "' to callback URL: ";
            }
            sb.append(str);
            sb.append(eVar2.mo35751v());
            logger.fine(sb.toString());
            eVar = mo36173c().getRouter().mo24453d(eVar2);
            f22717h.fine("Received event callback response: " + eVar);
        }
        return eVar;
    }
}
