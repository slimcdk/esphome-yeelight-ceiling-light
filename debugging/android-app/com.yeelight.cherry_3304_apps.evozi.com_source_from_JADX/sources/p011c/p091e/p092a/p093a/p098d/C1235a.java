package p011c.p091e.p092a.p093a.p098d;

import android.os.Bundle;
import p011c.p091e.p092a.p093a.p096b.C1228a;
import p011c.p091e.p092a.p093a.p098d.C1237c;
import p011c.p091e.p092a.p093a.p100f.C1249b;

/* renamed from: c.e.a.a.d.a */
public class C1235a extends C1228a {

    /* renamed from: c */
    public C1237c f2179c;

    /* renamed from: d */
    public int f2180d;

    /* renamed from: a */
    public boolean mo10046a() {
        C1237c cVar = this.f2179c;
        if (cVar == null) {
            C1249b.m3235b("MicroMsg.SDK.SendMessageToWX.Req", "checkArgs fail ,message is null");
            return false;
        }
        if (cVar.f2187e.type() == 6 && this.f2180d == 2) {
            ((C1236b) this.f2179c.f2187e).mo10051b(26214400);
        }
        this.f2179c.mo10053a();
        throw null;
    }

    /* renamed from: c */
    public int mo10048c() {
        return 2;
    }

    /* renamed from: d */
    public void mo10049d(Bundle bundle) {
        super.mo10049d(bundle);
        bundle.putAll(C1237c.C1238a.m3198b(this.f2179c));
        bundle.putInt("_wxapi_sendmessagetowx_req_scene", this.f2180d);
        this.f2179c.mo10054b();
        throw null;
    }
}
