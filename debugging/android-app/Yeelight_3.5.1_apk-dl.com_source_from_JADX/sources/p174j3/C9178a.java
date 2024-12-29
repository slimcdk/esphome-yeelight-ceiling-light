package p174j3;

import android.os.Bundle;
import p164h3.C9091a;
import p174j3.C9179b;
import p181l3.C9523b;

/* renamed from: j3.a */
public class C9178a extends C9091a {

    /* renamed from: c */
    public C9179b f17001c;

    /* renamed from: d */
    public int f17002d;

    /* renamed from: a */
    public boolean mo37081a() {
        C9523b.m23172b("MicroMsg.SDK.SendMessageToWX.Req", "checkArgs fail ,message is null");
        return false;
    }

    /* renamed from: c */
    public int mo37083c() {
        return 2;
    }

    /* renamed from: d */
    public void mo37084d(Bundle bundle) {
        super.mo37084d(bundle);
        bundle.putAll(C9179b.C9180a.m22074a(this.f17001c));
        bundle.putInt("_wxapi_sendmessagetowx_req_scene", this.f17002d);
        throw null;
    }
}
