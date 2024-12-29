package p011c.p091e.p092a.p093a.p097c;

import android.os.Bundle;
import p011c.p091e.p092a.p093a.p096b.C1228a;
import p011c.p091e.p092a.p093a.p100f.C1249b;

/* renamed from: c.e.a.a.c.b */
public class C1230b extends C1228a {

    /* renamed from: c */
    public int f2170c;

    /* renamed from: d */
    public String f2171d;

    /* renamed from: e */
    public String f2172e;

    /* renamed from: a */
    public boolean mo10046a() {
        String str;
        String str2 = this.f2171d;
        if (str2 == null || str2.length() == 0) {
            str = "checkArgs fail, templateID is null";
        } else if (this.f2171d.length() > 1024) {
            str = "checkArgs fail, templateID is too long";
        } else {
            String str3 = this.f2172e;
            if (str3 == null || str3.length() <= 1024) {
                return true;
            }
            str = "checkArgs fail, reserved is too long";
        }
        C1249b.m3235b("MicroMsg.SDK.SubscribeMessage.Req", str);
        return false;
    }

    /* renamed from: c */
    public int mo10048c() {
        return 18;
    }

    /* renamed from: d */
    public void mo10049d(Bundle bundle) {
        super.mo10049d(bundle);
        bundle.putInt("_wxapi_subscribemessage_req_scene", this.f2170c);
        bundle.putString("_wxapi_subscribemessage_req_templateid", this.f2171d);
        bundle.putString("_wxapi_subscribemessage_req_reserved", this.f2172e);
    }
}
