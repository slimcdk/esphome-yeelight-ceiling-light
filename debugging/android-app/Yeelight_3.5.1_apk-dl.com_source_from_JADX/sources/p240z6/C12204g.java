package p240z6;

import java.net.URL;
import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.types.C10076b0;
import p200p6.C10276b;
import p210s6.C10377e;
import p230x6.C12009f;

/* renamed from: z6.g */
public class C12204g extends C12009f<C10377e, C10031e> {

    /* renamed from: h */
    private static final Logger f22538h = Logger.getLogger(C12204g.class.getName());

    /* renamed from: e */
    protected final String f22539e;

    /* renamed from: f */
    protected final C10377e[] f22540f;

    /* renamed from: g */
    protected final C10076b0 f22541g;

    public C12204g(C10010b bVar, C10276b bVar2) {
        super(bVar, null);
        this.f22539e = bVar2.mo41767K();
        this.f22540f = new C10377e[bVar2.mo41775Q().size()];
        int i = 0;
        for (URL eVar : bVar2.mo41775Q()) {
            this.f22540f[i] = new C10377e(bVar2, eVar);
            mo42617c().getConfiguration().getGenaEventProcessor().mo36792a(this.f22540f[i]);
            i++;
        }
        this.f22541g = bVar2.mo41772w();
        bVar2.mo41776R();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10031e mo42620d() {
        StringBuilder sb;
        String str;
        f22538h.fine("Sending event for subscription: " + this.f22539e);
        C10031e eVar = null;
        for (C10377e eVar2 : this.f22540f) {
            int i = (this.f22541g.mo40572c().longValue() > 0 ? 1 : (this.f22541g.mo40572c().longValue() == 0 ? 0 : -1));
            Logger logger = f22538h;
            if (i == 0) {
                str = "Sending initial event message to callback URL: ";
            } else {
                sb = new StringBuilder();
                sb.append("Sending event message '");
                sb.append(this.f22541g);
                str = "' to callback URL: ";
            }
            sb.append(str);
            sb.append(eVar2.mo40435v());
            logger.fine(sb.toString());
            eVar = mo42617c().getRouter().mo24969d(eVar2);
            f22538h.fine("Received event callback response: " + eVar);
        }
        return eVar;
    }
}
