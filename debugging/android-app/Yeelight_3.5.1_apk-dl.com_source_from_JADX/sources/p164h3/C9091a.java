package p164h3;

import android.os.Bundle;
import p181l3.C9524c;

/* renamed from: h3.a */
public abstract class C9091a {

    /* renamed from: a */
    public String f16747a;

    /* renamed from: b */
    public String f16748b;

    /* renamed from: a */
    public abstract boolean mo37081a();

    /* renamed from: b */
    public void mo37082b(Bundle bundle) {
        this.f16747a = C9524c.m23174a(bundle, "_wxapi_basereq_transaction");
        this.f16748b = C9524c.m23174a(bundle, "_wxapi_basereq_openid");
    }

    /* renamed from: c */
    public abstract int mo37083c();

    /* renamed from: d */
    public void mo37084d(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", mo37083c());
        bundle.putString("_wxapi_basereq_transaction", this.f16747a);
        bundle.putString("_wxapi_basereq_openid", this.f16748b);
    }
}
