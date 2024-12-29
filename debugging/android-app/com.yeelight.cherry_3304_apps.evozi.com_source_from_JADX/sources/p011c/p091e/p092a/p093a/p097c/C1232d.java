package p011c.p091e.p092a.p093a.p097c;

import android.os.Bundle;
import p011c.p091e.p092a.p093a.p096b.C1228a;
import p011c.p091e.p092a.p093a.p100f.C1249b;
import p011c.p091e.p092a.p093a.p100f.C1254g;

/* renamed from: c.e.a.a.c.d */
public final class C1232d extends C1228a {

    /* renamed from: c */
    public String f2174c;

    /* renamed from: d */
    public String f2175d = "";

    /* renamed from: e */
    public int f2176e = 0;

    /* renamed from: a */
    public final boolean mo10046a() {
        String str;
        if (C1254g.m3240a(this.f2174c)) {
            str = "userName is null";
        } else {
            int i = this.f2176e;
            if (i >= 0 && i <= 2) {
                return true;
            }
            str = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW";
        }
        C1249b.m3235b("MicroMsg.SDK.WXLaunchMiniProgram.Req", str);
        return false;
    }

    /* renamed from: c */
    public final int mo10048c() {
        return 19;
    }

    /* renamed from: d */
    public final void mo10049d(Bundle bundle) {
        super.mo10049d(bundle);
        bundle.putString("_launch_wxminiprogram_username", this.f2174c);
        bundle.putString("_launch_wxminiprogram_path", this.f2175d);
        bundle.putInt("_launch_wxminiprogram_type", this.f2176e);
    }
}
