package p164h.p211a.p212a.p213a.p214n;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import p164h.p211a.p212a.p213a.C10866h;
import p164h.p211a.p212a.p213a.C10870j;
import p164h.p211a.p212a.p213a.C10871k;
import p164h.p211a.p212a.p216c.C10910l;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p228h.C11137q;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.a.n.f */
public class C10885f extends C10870j {

    /* renamed from: n */
    private static final C11158c f21055n = C11156b.m29015a(C10885f.class);

    /* renamed from: h */
    private C10866h f21056h;

    /* renamed from: i */
    private C10871k f21057i;

    /* renamed from: j */
    private boolean f21058j;

    /* renamed from: k */
    private boolean f21059k;

    /* renamed from: l */
    private boolean f21060l;

    /* renamed from: m */
    private int f21061m = 0;

    public C10885f(C10866h hVar, C10871k kVar) {
        super(kVar.mo34327k(), true);
        this.f21056h = hVar;
        this.f21057i = kVar;
    }

    /* renamed from: e */
    public void mo34212e() {
        this.f21059k = true;
        if (this.f21060l) {
            if (this.f21058j && 1 != 0) {
                if (f21055n.mo35485a()) {
                    C11158c cVar = f21055n;
                    cVar.mo35489e("onResponseComplete, Both complete: Resending from onResponseComplete" + this.f21057i, new Object[0]);
                }
                this.f21059k = false;
                this.f21058j = false;
                mo34296n(true);
                mo34295m(true);
                this.f21056h.mo34281q(this.f21057i);
                return;
            } else if (f21055n.mo35485a()) {
                C11158c cVar2 = f21055n;
                cVar2.mo35489e("onResponseComplete, Request not yet complete from onResponseComplete,  calling super " + this.f21057i, new Object[0]);
            }
        } else if (f21055n.mo35485a()) {
            C11158c cVar3 = f21055n;
            cVar3.mo35489e("OnResponseComplete, delegating to super with Request complete=" + this.f21058j + ", response complete=" + this.f21059k + " " + this.f21057i, new Object[0]);
        }
        super.mo34212e();
    }

    /* renamed from: f */
    public void mo34213f() {
        this.f21061m++;
        mo34295m(true);
        mo34296n(true);
        this.f21058j = false;
        this.f21059k = false;
        this.f21060l = false;
        super.mo34213f();
    }

    /* renamed from: g */
    public void mo34214g(C10929e eVar, int i, C10929e eVar2) {
        if (f21055n.mo35485a()) {
            C11158c cVar = f21055n;
            cVar.mo35489e("SecurityListener:Response Status: " + i, new Object[0]);
        }
        if (i != 401 || this.f21061m >= this.f21056h.mo34272h().mo34248Y0()) {
            mo34296n(true);
            mo34295m(true);
            this.f21060l = false;
        } else {
            mo34296n(false);
            this.f21060l = true;
        }
        super.mo34214g(eVar, i, eVar2);
    }

    /* renamed from: j */
    public void mo34217j(C10929e eVar, C10929e eVar2) {
        if (f21055n.mo35485a()) {
            C11158c cVar = f21055n;
            cVar.mo35489e("SecurityListener:Header: " + eVar.toString() + " / " + eVar2.toString(), new Object[0]);
        }
        if (!mo34294l() && C10910l.f21152d.mo34616f(eVar) == 51) {
            String obj = eVar2.toString();
            String p = mo34385p(obj);
            Map<String, String> o = mo34384o(obj);
            C10884e R0 = this.f21056h.mo34272h().mo34240R0();
            if (R0 != null) {
                C10883d a = R0.mo34383a(o.get("realm"), this.f21056h, MiotCloudImpl.COOKIE_PATH);
                if (a == null) {
                    C11158c cVar2 = f21055n;
                    cVar2.mo35486b("Unknown Security Realm: " + o.get("realm"), new Object[0]);
                } else if ("digest".equalsIgnoreCase(p)) {
                    this.f21056h.mo34266b(MiotCloudImpl.COOKIE_PATH, new C10882c(a, o));
                } else if ("basic".equalsIgnoreCase(p)) {
                    this.f21056h.mo34266b(MiotCloudImpl.COOKIE_PATH, new C10881b(a));
                }
            }
        }
        super.mo34217j(eVar, eVar2);
    }

    /* renamed from: k */
    public void mo34218k() {
        this.f21058j = true;
        if (this.f21060l) {
            if (1 != 0 && this.f21059k) {
                if (f21055n.mo35485a()) {
                    C11158c cVar = f21055n;
                    cVar.mo35489e("onRequestComplete, Both complete: Resending from onResponseComplete " + this.f21057i, new Object[0]);
                }
                this.f21059k = false;
                this.f21058j = false;
                mo34295m(true);
                mo34296n(true);
                this.f21056h.mo34281q(this.f21057i);
                return;
            } else if (f21055n.mo35485a()) {
                C11158c cVar2 = f21055n;
                cVar2.mo35489e("onRequestComplete, Response not yet complete onRequestComplete, calling super for " + this.f21057i, new Object[0]);
            }
        } else if (f21055n.mo35485a()) {
            C11158c cVar3 = f21055n;
            cVar3.mo35489e("onRequestComplete, delegating to super with Request complete=" + this.f21058j + ", response complete=" + this.f21059k + " " + this.f21057i, new Object[0]);
        }
        super.mo34218k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Map<String, String> mo34384o(String str) {
        HashMap hashMap = new HashMap();
        StringTokenizer stringTokenizer = new StringTokenizer(str.substring(str.indexOf(" ") + 1, str.length()), Constants.ACCEPT_TIME_SEPARATOR_SP);
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            String[] split = nextToken.split("=");
            if (split.length == 2) {
                hashMap.put(split[0].trim(), C11137q.m28926i(split[1].trim()));
            } else {
                C11158c cVar = f21055n;
                cVar.mo35489e("SecurityListener: missed scraping authentication details - " + nextToken, new Object[0]);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public String mo34385p(String str) {
        int indexOf = str.indexOf(" ");
        String str2 = str.toString();
        if (indexOf != -1) {
            str2 = str2.substring(0, str2.indexOf(" "));
        }
        return str2.trim();
    }
}
