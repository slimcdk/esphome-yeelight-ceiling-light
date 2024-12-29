package p217u5;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.eclipse.jetty.client.C9876i;
import org.eclipse.jetty.client.C9877j;
import org.eclipse.jetty.client.HttpDestination;
import org.eclipse.jetty.http.C9908k;
import org.eclipse.jetty.util.C9995n;
import p152e6.C9001b;
import p152e6.C9003c;
import p225w5.C11940d;

/* renamed from: u5.f */
public class C10539f extends C9876i {

    /* renamed from: n */
    private static final C9003c f19700n = C9001b.m21450a(C10539f.class);

    /* renamed from: h */
    private HttpDestination f19701h;

    /* renamed from: i */
    private C9877j f19702i;

    /* renamed from: j */
    private boolean f19703j;

    /* renamed from: k */
    private boolean f19704k;

    /* renamed from: l */
    private boolean f19705l;

    /* renamed from: m */
    private int f19706m = 0;

    public C10539f(HttpDestination httpDestination, C9877j jVar) {
        super(jVar.mo39628k(), true);
        this.f19701h = httpDestination;
        this.f19702i = jVar;
    }

    /* renamed from: a */
    public void mo39539a(C11940d dVar, int i, C11940d dVar2) {
        C9003c cVar = f19700n;
        if (cVar.mo36846a()) {
            cVar.mo36850e("SecurityListener:Response Status: " + i, new Object[0]);
        }
        if (i != 401 || this.f19706m >= this.f19701h.mo39498h().mo39583d1()) {
            mo39597n(true);
            mo39596m(true);
            this.f19705l = false;
        } else {
            mo39597n(false);
            this.f19705l = true;
        }
        super.mo39539a(dVar, i, dVar2);
    }

    /* renamed from: d */
    public void mo39542d(C11940d dVar, C11940d dVar2) {
        C9003c cVar = f19700n;
        if (cVar.mo36846a()) {
            cVar.mo36850e("SecurityListener:Header: " + dVar.toString() + " / " + dVar2.toString(), new Object[0]);
        }
        if (!mo39595l() && C9908k.f18084d.mo42459f(dVar) == 51) {
            String obj = dVar2.toString();
            String p = mo42198p(obj);
            Map<String, String> o = mo42197o(obj);
            C10538e W0 = this.f19701h.mo39498h().mo39571W0();
            if (W0 != null) {
                C10537d a = W0.mo42196a(o.get("realm"), this.f19701h, MiotCloudImpl.COOKIE_PATH);
                if (a == null) {
                    cVar.mo36847b("Unknown Security Realm: " + o.get("realm"), new Object[0]);
                } else if ("digest".equalsIgnoreCase(p)) {
                    this.f19701h.mo39492b(MiotCloudImpl.COOKIE_PATH, new C10536c(a, o));
                } else if ("basic".equalsIgnoreCase(p)) {
                    this.f19701h.mo39492b(MiotCloudImpl.COOKIE_PATH, new C10535b(a));
                }
            }
        }
        super.mo39542d(dVar, dVar2);
    }

    /* renamed from: g */
    public void mo39545g() {
        this.f19704k = true;
        if (!this.f19705l) {
            C9003c cVar = f19700n;
            if (cVar.mo36846a()) {
                cVar.mo36850e("OnResponseComplete, delegating to super with Request complete=" + this.f19703j + ", response complete=" + this.f19704k + " " + this.f19702i, new Object[0]);
            }
        } else if (this.f19703j) {
            C9003c cVar2 = f19700n;
            if (cVar2.mo36846a()) {
                cVar2.mo36850e("onResponseComplete, Both complete: Resending from onResponseComplete" + this.f19702i, new Object[0]);
            }
            this.f19704k = false;
            this.f19703j = false;
            mo39597n(true);
            mo39596m(true);
            this.f19701h.mo39507q(this.f19702i);
            return;
        } else {
            C9003c cVar3 = f19700n;
            if (cVar3.mo36846a()) {
                cVar3.mo36850e("onResponseComplete, Request not yet complete from onResponseComplete,  calling super " + this.f19702i, new Object[0]);
            }
        }
        super.mo39545g();
    }

    /* renamed from: h */
    public void mo39546h() {
        this.f19706m++;
        mo39596m(true);
        mo39597n(true);
        this.f19703j = false;
        this.f19704k = false;
        this.f19705l = false;
        super.mo39546h();
    }

    /* renamed from: k */
    public void mo39549k() {
        this.f19703j = true;
        if (!this.f19705l) {
            C9003c cVar = f19700n;
            if (cVar.mo36846a()) {
                cVar.mo36850e("onRequestComplete, delegating to super with Request complete=" + this.f19703j + ", response complete=" + this.f19704k + " " + this.f19702i, new Object[0]);
            }
        } else if (this.f19704k) {
            C9003c cVar2 = f19700n;
            if (cVar2.mo36846a()) {
                cVar2.mo36850e("onRequestComplete, Both complete: Resending from onResponseComplete " + this.f19702i, new Object[0]);
            }
            this.f19704k = false;
            this.f19703j = false;
            mo39596m(true);
            mo39597n(true);
            this.f19701h.mo39507q(this.f19702i);
            return;
        } else {
            C9003c cVar3 = f19700n;
            if (cVar3.mo36846a()) {
                cVar3.mo36850e("onRequestComplete, Response not yet complete onRequestComplete, calling super for " + this.f19702i, new Object[0]);
            }
        }
        super.mo39549k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Map<String, String> mo42197o(String str) {
        HashMap hashMap = new HashMap();
        StringTokenizer stringTokenizer = new StringTokenizer(str.substring(str.indexOf(" ") + 1, str.length()), Constants.ACCEPT_TIME_SEPARATOR_SP);
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            String[] split = nextToken.split("=");
            if (split.length == 2) {
                hashMap.put(split[0].trim(), C9995n.m24713i(split[1].trim()));
            } else {
                C9003c cVar = f19700n;
                cVar.mo36850e("SecurityListener: missed scraping authentication details - " + nextToken, new Object[0]);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public String mo42198p(String str) {
        if (str.indexOf(" ") != -1) {
            str = str.substring(0, str.indexOf(" "));
        }
        return str.trim();
    }
}
