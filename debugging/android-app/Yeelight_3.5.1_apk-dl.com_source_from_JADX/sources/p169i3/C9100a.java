package p169i3;

import android.os.Bundle;
import p164h3.C9091a;
import p181l3.C9523b;

/* renamed from: i3.a */
public class C9100a extends C9091a {

    /* renamed from: c */
    public String f16777c;

    /* renamed from: d */
    public String f16778d;

    /* renamed from: e */
    public int f16779e = 0;

    /* renamed from: a */
    public boolean mo37081a() {
        String str;
        String str2;
        String str3 = this.f16777c;
        if (str3 == null || str3.length() == 0) {
            str = "checkArgs fail, toUserName is invalid";
        } else {
            String str4 = this.f16778d;
            if (str4 != null && str4.length() > 1024) {
                str = "ext msg is not null, while the length exceed 1024 bytes";
            } else if (this.f16779e != 1 || ((str2 = this.f16778d) != null && str2.length() != 0)) {
                return true;
            } else {
                str = "scene is jump to hardware profile, while extmsg is null";
            }
        }
        C9523b.m23172b("MicroMsg.SDK.JumpToBizProfile.Req", str);
        return false;
    }

    /* renamed from: c */
    public int mo37083c() {
        return 7;
    }

    /* renamed from: d */
    public void mo37084d(Bundle bundle) {
        super.mo37084d(bundle);
        bundle.putString("_wxapi_jump_to_biz_profile_req_to_user_name", this.f16777c);
        bundle.putString("_wxapi_jump_to_biz_profile_req_ext_msg", this.f16778d);
        bundle.putInt("_wxapi_jump_to_biz_profile_req_scene", 0);
        bundle.putInt("_wxapi_jump_to_biz_profile_req_profile_type", this.f16779e);
    }
}
