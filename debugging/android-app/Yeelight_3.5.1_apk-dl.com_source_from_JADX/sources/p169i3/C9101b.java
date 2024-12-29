package p169i3;

import android.os.Bundle;
import p164h3.C9091a;
import p181l3.C9523b;

/* renamed from: i3.b */
public class C9101b extends C9091a {

    /* renamed from: c */
    public int f16780c;

    /* renamed from: d */
    public String f16781d;

    /* renamed from: e */
    public String f16782e;

    /* renamed from: a */
    public boolean mo37081a() {
        String str;
        String str2 = this.f16781d;
        if (str2 == null || str2.length() == 0) {
            str = "checkArgs fail, templateID is null";
        } else if (this.f16781d.length() > 1024) {
            str = "checkArgs fail, templateID is too long";
        } else {
            String str3 = this.f16782e;
            if (str3 == null || str3.length() <= 1024) {
                return true;
            }
            str = "checkArgs fail, reserved is too long";
        }
        C9523b.m23172b("MicroMsg.SDK.SubscribeMessage.Req", str);
        return false;
    }

    /* renamed from: c */
    public int mo37083c() {
        return 18;
    }

    /* renamed from: d */
    public void mo37084d(Bundle bundle) {
        super.mo37084d(bundle);
        bundle.putInt("_wxapi_subscribemessage_req_scene", this.f16780c);
        bundle.putString("_wxapi_subscribemessage_req_templateid", this.f16781d);
        bundle.putString("_wxapi_subscribemessage_req_reserved", this.f16782e);
    }
}
