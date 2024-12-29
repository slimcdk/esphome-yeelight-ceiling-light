package p011c.p091e.p092a.p093a.p097c;

import android.os.Bundle;
import p011c.p091e.p092a.p093a.p096b.C1228a;
import p011c.p091e.p092a.p093a.p100f.C1249b;

/* renamed from: c.e.a.a.c.a */
public class C1229a extends C1228a {

    /* renamed from: c */
    public String f2167c;

    /* renamed from: d */
    public String f2168d;

    /* renamed from: e */
    public int f2169e = 0;

    /* renamed from: a */
    public boolean mo10046a() {
        String str;
        String str2;
        String str3 = this.f2167c;
        if (str3 == null || str3.length() == 0) {
            str = "checkArgs fail, toUserName is invalid";
        } else {
            String str4 = this.f2168d;
            if (str4 != null && str4.length() > 1024) {
                str = "ext msg is not null, while the length exceed 1024 bytes";
            } else if (this.f2169e != 1 || ((str2 = this.f2168d) != null && str2.length() != 0)) {
                return true;
            } else {
                str = "scene is jump to hardware profile, while extmsg is null";
            }
        }
        C1249b.m3235b("MicroMsg.SDK.JumpToBizProfile.Req", str);
        return false;
    }

    /* renamed from: c */
    public int mo10048c() {
        return 7;
    }

    /* renamed from: d */
    public void mo10049d(Bundle bundle) {
        super.mo10049d(bundle);
        bundle.putString("_wxapi_jump_to_biz_profile_req_to_user_name", this.f2167c);
        bundle.putString("_wxapi_jump_to_biz_profile_req_ext_msg", this.f2168d);
        bundle.putInt("_wxapi_jump_to_biz_profile_req_scene", 0);
        bundle.putInt("_wxapi_jump_to_biz_profile_req_profile_type", this.f2169e);
    }
}
