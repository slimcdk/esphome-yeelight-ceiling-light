package p169i3;

import android.os.Bundle;
import p164h3.C9091a;
import p181l3.C9523b;
import p181l3.C9528g;

/* renamed from: i3.d */
public final class C9103d extends C9091a {

    /* renamed from: c */
    public String f16784c;

    /* renamed from: d */
    public String f16785d = "";

    /* renamed from: e */
    public int f16786e = 0;

    /* renamed from: a */
    public final boolean mo37081a() {
        String str;
        if (C9528g.m23177a(this.f16784c)) {
            str = "userName is null";
        } else {
            int i = this.f16786e;
            if (i >= 0 && i <= 2) {
                return true;
            }
            str = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW";
        }
        C9523b.m23172b("MicroMsg.SDK.WXLaunchMiniProgram.Req", str);
        return false;
    }

    /* renamed from: c */
    public final int mo37083c() {
        return 19;
    }

    /* renamed from: d */
    public final void mo37084d(Bundle bundle) {
        super.mo37084d(bundle);
        bundle.putString("_launch_wxminiprogram_username", this.f16784c);
        bundle.putString("_launch_wxminiprogram_path", this.f16785d);
        bundle.putInt("_launch_wxminiprogram_type", this.f16786e);
    }
}
