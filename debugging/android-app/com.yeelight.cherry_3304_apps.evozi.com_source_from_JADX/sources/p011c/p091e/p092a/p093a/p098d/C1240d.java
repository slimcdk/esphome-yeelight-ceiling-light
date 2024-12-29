package p011c.p091e.p092a.p093a.p098d;

import android.os.Bundle;
import p011c.p091e.p092a.p093a.p098d.C1237c;

/* renamed from: c.e.a.a.d.d */
public class C1240d implements C1237c.C1239b {

    /* renamed from: a */
    public String f2191a;

    /* renamed from: b */
    public String f2192b;

    /* renamed from: c */
    public String f2193c;

    /* renamed from: d */
    public boolean f2194d;

    /* renamed from: e */
    public int f2195e = 0;

    /* renamed from: a */
    public void mo10050a(Bundle bundle) {
        bundle.putString("_wxminiprogram_webpageurl", this.f2191a);
        bundle.putString("_wxminiprogram_username", this.f2192b);
        bundle.putString("_wxminiprogram_path", this.f2193c);
        bundle.putBoolean("_wxminiprogram_withsharetiket", this.f2194d);
        bundle.putInt("_wxminiprogram_type", this.f2195e);
    }

    public int type() {
        return 36;
    }
}
