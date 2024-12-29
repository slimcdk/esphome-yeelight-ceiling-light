package com.google.android.datatransport.cct.internal;

import com.miot.common.device.parser.xml.DddTag;
import p049j1.C3265b;
import p049j1.C3268c;
import p049j1.C3269d;
import p054k1.C3293a;
import p054k1.C3294b;

/* renamed from: com.google.android.datatransport.cct.internal.b */
public final class C0650b implements C3293a {

    /* renamed from: a */
    public static final C3293a f322a = new C0650b();

    /* renamed from: com.google.android.datatransport.cct.internal.b$a */
    private static final class C0651a implements C3268c<C0648a> {

        /* renamed from: a */
        static final C0651a f323a = new C0651a();

        /* renamed from: b */
        private static final C3265b f324b = C3265b.m8754d("sdkVersion");

        /* renamed from: c */
        private static final C3265b f325c = C3265b.m8754d("model");

        /* renamed from: d */
        private static final C3265b f326d = C3265b.m8754d("hardware");

        /* renamed from: e */
        private static final C3265b f327e = C3265b.m8754d(DddTag.DEVICE);

        /* renamed from: f */
        private static final C3265b f328f = C3265b.m8754d("product");

        /* renamed from: g */
        private static final C3265b f329g = C3265b.m8754d("osBuild");

        /* renamed from: h */
        private static final C3265b f330h = C3265b.m8754d(DddTag.DEVICE_MANUFACTURER);

        /* renamed from: i */
        private static final C3265b f331i = C3265b.m8754d("fingerprint");

        /* renamed from: j */
        private static final C3265b f332j = C3265b.m8754d("locale");

        /* renamed from: k */
        private static final C3265b f333k = C3265b.m8754d("country");

        /* renamed from: l */
        private static final C3265b f334l = C3265b.m8754d("mccMnc");

        /* renamed from: m */
        private static final C3265b f335m = C3265b.m8754d("applicationBuild");

        private C0651a() {
        }

        /* renamed from: b */
        public void mo11147a(C0648a aVar, C3269d dVar) {
            dVar.mo19009a(f324b, aVar.mo11132m());
            dVar.mo19009a(f325c, aVar.mo11129j());
            dVar.mo19009a(f326d, aVar.mo11125f());
            dVar.mo19009a(f327e, aVar.mo11123d());
            dVar.mo19009a(f328f, aVar.mo11131l());
            dVar.mo19009a(f329g, aVar.mo11130k());
            dVar.mo19009a(f330h, aVar.mo11127h());
            dVar.mo19009a(f331i, aVar.mo11124e());
            dVar.mo19009a(f332j, aVar.mo11126g());
            dVar.mo19009a(f333k, aVar.mo11122c());
            dVar.mo19009a(f334l, aVar.mo11128i());
            dVar.mo19009a(f335m, aVar.mo11121b());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$b */
    private static final class C0652b implements C3268c<C0674j> {

        /* renamed from: a */
        static final C0652b f336a = new C0652b();

        /* renamed from: b */
        private static final C3265b f337b = C3265b.m8754d("logRequest");

        private C0652b() {
        }

        /* renamed from: b */
        public void mo11147a(C0674j jVar, C3269d dVar) {
            dVar.mo19009a(f337b, jVar.mo11157c());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$c */
    private static final class C0653c implements C3268c<ClientInfo> {

        /* renamed from: a */
        static final C0653c f338a = new C0653c();

        /* renamed from: b */
        private static final C3265b f339b = C3265b.m8754d("clientType");

        /* renamed from: c */
        private static final C3265b f340c = C3265b.m8754d("androidClientInfo");

        private C0653c() {
        }

        /* renamed from: b */
        public void mo11147a(ClientInfo clientInfo, C3269d dVar) {
            dVar.mo19009a(f339b, clientInfo.mo11109c());
            dVar.mo19009a(f340c, clientInfo.mo11108b());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$d */
    private static final class C0654d implements C3268c<C0675k> {

        /* renamed from: a */
        static final C0654d f341a = new C0654d();

        /* renamed from: b */
        private static final C3265b f342b = C3265b.m8754d("eventTimeMs");

        /* renamed from: c */
        private static final C3265b f343c = C3265b.m8754d("eventCode");

        /* renamed from: d */
        private static final C3265b f344d = C3265b.m8754d("eventUptimeMs");

        /* renamed from: e */
        private static final C3265b f345e = C3265b.m8754d("sourceExtension");

        /* renamed from: f */
        private static final C3265b f346f = C3265b.m8754d("sourceExtensionJsonProto3");

        /* renamed from: g */
        private static final C3265b f347g = C3265b.m8754d("timezoneOffsetSeconds");

        /* renamed from: h */
        private static final C3265b f348h = C3265b.m8754d("networkConnectionInfo");

        private C0654d() {
        }

        /* renamed from: b */
        public void mo11147a(C0675k kVar, C3269d dVar) {
            dVar.mo19011d(f342b, kVar.mo11165c());
            dVar.mo19009a(f343c, kVar.mo11164b());
            dVar.mo19011d(f344d, kVar.mo11166d());
            dVar.mo19009a(f345e, kVar.mo11169f());
            dVar.mo19009a(f346f, kVar.mo11170g());
            dVar.mo19011d(f347g, kVar.mo11171h());
            dVar.mo19009a(f348h, kVar.mo11167e());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$e */
    private static final class C0655e implements C3268c<C0677l> {

        /* renamed from: a */
        static final C0655e f349a = new C0655e();

        /* renamed from: b */
        private static final C3265b f350b = C3265b.m8754d("requestTimeMs");

        /* renamed from: c */
        private static final C3265b f351c = C3265b.m8754d("requestUptimeMs");

        /* renamed from: d */
        private static final C3265b f352d = C3265b.m8754d("clientInfo");

        /* renamed from: e */
        private static final C3265b f353e = C3265b.m8754d("logSource");

        /* renamed from: f */
        private static final C3265b f354f = C3265b.m8754d("logSourceName");

        /* renamed from: g */
        private static final C3265b f355g = C3265b.m8754d("logEvent");

        /* renamed from: h */
        private static final C3265b f356h = C3265b.m8754d("qosTier");

        private C0655e() {
        }

        /* renamed from: b */
        public void mo11147a(C0677l lVar, C3269d dVar) {
            dVar.mo19011d(f350b, lVar.mo11188g());
            dVar.mo19011d(f351c, lVar.mo11189h());
            dVar.mo19009a(f352d, lVar.mo11182b());
            dVar.mo19009a(f353e, lVar.mo11184d());
            dVar.mo19009a(f354f, lVar.mo11185e());
            dVar.mo19009a(f355g, lVar.mo11183c());
            dVar.mo19009a(f356h, lVar.mo11187f());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$f */
    private static final class C0656f implements C3268c<NetworkConnectionInfo> {

        /* renamed from: a */
        static final C0656f f357a = new C0656f();

        /* renamed from: b */
        private static final C3265b f358b = C3265b.m8754d("networkType");

        /* renamed from: c */
        private static final C3265b f359c = C3265b.m8754d("mobileSubtype");

        private C0656f() {
        }

        /* renamed from: b */
        public void mo11147a(NetworkConnectionInfo networkConnectionInfo, C3269d dVar) {
            dVar.mo19009a(f358b, networkConnectionInfo.mo11114c());
            dVar.mo19009a(f359c, networkConnectionInfo.mo11113b());
        }
    }

    private C0650b() {
    }

    /* renamed from: a */
    public void mo11146a(C3294b<?> bVar) {
        C0652b bVar2 = C0652b.f336a;
        bVar.mo19025a(C0674j.class, bVar2);
        bVar.mo19025a(C0660d.class, bVar2);
        C0655e eVar = C0655e.f349a;
        bVar.mo19025a(C0677l.class, eVar);
        bVar.mo19025a(C0667g.class, eVar);
        C0653c cVar = C0653c.f338a;
        bVar.mo19025a(ClientInfo.class, cVar);
        bVar.mo19025a(C0661e.class, cVar);
        C0651a aVar = C0651a.f323a;
        bVar.mo19025a(C0648a.class, aVar);
        bVar.mo19025a(C0657c.class, aVar);
        C0654d dVar = C0654d.f341a;
        bVar.mo19025a(C0675k.class, dVar);
        bVar.mo19025a(C0664f.class, dVar);
        C0656f fVar = C0656f.f357a;
        bVar.mo19025a(NetworkConnectionInfo.class, fVar);
        bVar.mo19025a(C0671i.class, fVar);
    }
}
