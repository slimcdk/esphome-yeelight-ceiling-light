package com.google.android.datatransport.cct.p103b;

import com.google.firebase.p128f.C3179c;
import com.google.firebase.p128f.C3180d;
import com.google.firebase.p128f.p129g.C3183a;
import com.google.firebase.p128f.p129g.C3184b;
import com.miot.common.device.parser.xml.DddTag;

/* renamed from: com.google.android.datatransport.cct.b.b */
public final class C1266b implements C3183a {

    /* renamed from: a */
    public static final C3183a f2270a = new C1266b();

    /* renamed from: com.google.android.datatransport.cct.b.b$a */
    private static final class C1267a implements C3179c<C1264a> {

        /* renamed from: a */
        static final C1267a f2271a = new C1267a();

        private C1267a() {
        }

        /* renamed from: a */
        public void mo10134a(Object obj, Object obj2) {
            C1264a aVar = (C1264a) obj;
            C3180d dVar = (C3180d) obj2;
            dVar.mo17755f("sdkVersion", aVar.mo10123i());
            dVar.mo17755f("model", aVar.mo10120f());
            dVar.mo17755f("hardware", aVar.mo10118d());
            dVar.mo17755f(DddTag.DEVICE, aVar.mo10116b());
            dVar.mo17755f("product", aVar.mo10122h());
            dVar.mo17755f("osBuild", aVar.mo10121g());
            dVar.mo17755f(DddTag.DEVICE_MANUFACTURER, aVar.mo10119e());
            dVar.mo17755f("fingerprint", aVar.mo10117c());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.b.b$b */
    private static final class C1268b implements C3179c<C1290j> {

        /* renamed from: a */
        static final C1268b f2272a = new C1268b();

        private C1268b() {
        }

        /* renamed from: a */
        public void mo10134a(Object obj, Object obj2) {
            ((C3180d) obj2).mo17755f("logRequest", ((C1290j) obj).mo10138b());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.b.b$c */
    private static final class C1269c implements C3179c<C1291k> {

        /* renamed from: a */
        static final C1269c f2273a = new C1269c();

        private C1269c() {
        }

        /* renamed from: a */
        public void mo10134a(Object obj, Object obj2) {
            C1291k kVar = (C1291k) obj;
            C3180d dVar = (C3180d) obj2;
            dVar.mo17755f("clientType", kVar.mo10143c());
            dVar.mo17755f("androidClientInfo", kVar.mo10142b());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.b.b$d */
    private static final class C1270d implements C3179c<C1294l> {

        /* renamed from: a */
        static final C1270d f2274a = new C1270d();

        private C1270d() {
        }

        /* renamed from: a */
        public void mo10134a(Object obj, Object obj2) {
            C1294l lVar = (C1294l) obj;
            C3180d dVar = (C3180d) obj2;
            dVar.mo17753b("eventTimeMs", lVar.mo10151d());
            dVar.mo17755f("eventCode", lVar.mo10150c());
            dVar.mo17753b("eventUptimeMs", lVar.mo10152e());
            dVar.mo17755f("sourceExtension", lVar.mo10155g());
            dVar.mo17755f("sourceExtensionJsonProto3", lVar.mo10156h());
            dVar.mo17753b("timezoneOffsetSeconds", lVar.mo10158i());
            dVar.mo17755f("networkConnectionInfo", lVar.mo10154f());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.b.b$e */
    private static final class C1271e implements C3179c<C1296m> {

        /* renamed from: a */
        static final C1271e f2275a = new C1271e();

        private C1271e() {
        }

        /* renamed from: a */
        public void mo10134a(Object obj, Object obj2) {
            C1296m mVar = (C1296m) obj;
            C3180d dVar = (C3180d) obj2;
            dVar.mo17753b("requestTimeMs", mVar.mo10174g());
            dVar.mo17753b("requestUptimeMs", mVar.mo10175h());
            dVar.mo17755f("clientInfo", mVar.mo10168b());
            dVar.mo17755f("logSource", mVar.mo10170d());
            dVar.mo17755f("logSourceName", mVar.mo10171e());
            dVar.mo17755f("logEvent", mVar.mo10169c());
            dVar.mo17755f("qosTier", mVar.mo10173f());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.b.b$f */
    private static final class C1272f implements C3179c<C1299o> {

        /* renamed from: a */
        static final C1272f f2276a = new C1272f();

        private C1272f() {
        }

        /* renamed from: a */
        public void mo10134a(Object obj, Object obj2) {
            C1299o oVar = (C1299o) obj;
            C3180d dVar = (C3180d) obj2;
            dVar.mo17755f("networkType", oVar.mo10191c());
            dVar.mo17755f("mobileSubtype", oVar.mo10190b());
        }
    }

    private C1266b() {
    }

    /* renamed from: a */
    public void mo10133a(C3184b<?> bVar) {
        bVar.mo17759a(C1290j.class, C1268b.f2272a);
        bVar.mo17759a(C1276d.class, C1268b.f2272a);
        bVar.mo17759a(C1296m.class, C1271e.f2275a);
        bVar.mo17759a(C1283g.class, C1271e.f2275a);
        bVar.mo17759a(C1291k.class, C1269c.f2273a);
        bVar.mo17759a(C1277e.class, C1269c.f2273a);
        bVar.mo17759a(C1264a.class, C1267a.f2271a);
        bVar.mo17759a(C1273c.class, C1267a.f2271a);
        bVar.mo17759a(C1294l.class, C1270d.f2274a);
        bVar.mo17759a(C1280f.class, C1270d.f2274a);
        bVar.mo17759a(C1299o.class, C1272f.f2276a);
        bVar.mo17759a(C1287i.class, C1272f.f2276a);
    }
}
