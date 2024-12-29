package p011c.p091e.p092a.p093a.p096b;

import android.os.Bundle;
import p011c.p091e.p092a.p093a.p100f.C1250c;

/* renamed from: c.e.a.a.b.a */
public abstract class C1228a {

    /* renamed from: a */
    public String f2165a;

    /* renamed from: b */
    public String f2166b;

    /* renamed from: a */
    public abstract boolean mo10046a();

    /* renamed from: b */
    public void mo10047b(Bundle bundle) {
        this.f2165a = C1250c.m3237a(bundle, "_wxapi_basereq_transaction");
        this.f2166b = C1250c.m3237a(bundle, "_wxapi_basereq_openid");
    }

    /* renamed from: c */
    public abstract int mo10048c();

    /* renamed from: d */
    public void mo10049d(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", mo10048c());
        bundle.putString("_wxapi_basereq_transaction", this.f2165a);
        bundle.putString("_wxapi_basereq_openid", this.f2166b);
    }
}
