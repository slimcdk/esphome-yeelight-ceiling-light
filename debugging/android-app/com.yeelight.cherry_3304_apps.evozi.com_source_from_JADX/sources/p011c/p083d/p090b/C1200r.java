package p011c.p083d.p090b;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import p011c.p083d.p090b.C1189j;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1220y;

/* renamed from: c.d.b.r */
class C1200r extends C1220y {

    /* renamed from: a */
    private final C1189j f2051a;

    /* renamed from: b */
    private final C1155a0 f2052b;

    /* renamed from: c.d.b.r$a */
    static class C1201a extends IOException {
        public C1201a(String str) {
            super(str);
        }
    }

    public C1200r(C1189j jVar, C1155a0 a0Var) {
        this.f2051a = jVar;
        this.f2052b = a0Var;
    }

    /* renamed from: c */
    public boolean mo9912c(C1216w wVar) {
        String scheme = wVar.f2107d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo9994e() {
        return 2;
    }

    /* renamed from: f */
    public C1220y.C1221a mo9913f(C1216w wVar, int i) {
        C1189j.C1190a a = this.f2051a.mo9946a(wVar.f2107d, wVar.f2106c);
        if (a == null) {
            return null;
        }
        C1203t.C1209e eVar = a.f2017c ? C1203t.C1209e.DISK : C1203t.C1209e.NETWORK;
        Bitmap a2 = a.mo9980a();
        if (a2 != null) {
            return new C1220y.C1221a(a2, eVar);
        }
        InputStream c = a.mo9982c();
        if (c == null) {
            return null;
        }
        if (eVar == C1203t.C1209e.DISK && a.mo9981b() == 0) {
            C1173e0.m3014e(c);
            throw new C1201a("Received response with 0 content-length header.");
        }
        if (eVar == C1203t.C1209e.NETWORK && a.mo9981b() > 0) {
            this.f2052b.mo9904f(a.mo9981b());
        }
        return new C1220y.C1221a(c, eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9995h(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo9996i() {
        return true;
    }
}
