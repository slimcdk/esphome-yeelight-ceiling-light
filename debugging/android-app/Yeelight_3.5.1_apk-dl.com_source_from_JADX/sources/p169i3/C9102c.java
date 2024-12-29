package p169i3;

import android.os.Bundle;
import p164h3.C9091a;
import p181l3.C9523b;
import p181l3.C9528g;

/* renamed from: i3.c */
public final class C9102c extends C9091a {

    /* renamed from: c */
    public String f16783c;

    /* renamed from: a */
    public final boolean mo37081a() {
        if (C9528g.m23177a(this.f16783c)) {
            C9523b.m23173c("MicroMsg.SDK.WXInvoiceAuthInsert.Req", "url should not be empty");
            return false;
        } else if (this.f16783c.length() <= 10240) {
            return true;
        } else {
            C9523b.m23172b("MicroMsg.SDK.WXInvoiceAuthInsert.Req", "url must be in 10k");
            return false;
        }
    }

    /* renamed from: c */
    public final int mo37083c() {
        return 20;
    }

    /* renamed from: d */
    public final void mo37084d(Bundle bundle) {
        super.mo37082b(bundle);
        bundle.putString("_wxapi_invoice_auth_insert_req_url", this.f16783c);
    }
}
