package p011c.p091e.p092a.p093a.p097c;

import android.os.Bundle;
import p011c.p091e.p092a.p093a.p096b.C1228a;
import p011c.p091e.p092a.p093a.p100f.C1249b;
import p011c.p091e.p092a.p093a.p100f.C1254g;

/* renamed from: c.e.a.a.c.c */
public final class C1231c extends C1228a {

    /* renamed from: c */
    public String f2173c;

    /* renamed from: a */
    public final boolean mo10046a() {
        if (C1254g.m3240a(this.f2173c)) {
            C1249b.m3236c("MicroMsg.SDK.WXInvoiceAuthInsert.Req", "url should not be empty");
            return false;
        } else if (this.f2173c.length() <= 10240) {
            return true;
        } else {
            C1249b.m3235b("MicroMsg.SDK.WXInvoiceAuthInsert.Req", "url must be in 10k");
            return false;
        }
    }

    /* renamed from: c */
    public final int mo10048c() {
        return 20;
    }

    /* renamed from: d */
    public final void mo10049d(Bundle bundle) {
        super.mo10047b(bundle);
        bundle.putString("_wxapi_invoice_auth_insert_req_url", this.f2173c);
    }
}
