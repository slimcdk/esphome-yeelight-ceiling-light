package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.p128f.C3179c;
import com.google.firebase.p128f.C3180d;
import com.google.firebase.p128f.p129g.C3183a;
import com.google.firebase.p128f.p129g.C3184b;
import com.miot.common.device.parser.xml.DddTag;
import com.xiaomi.mistatistic.sdk.BaseService;

/* renamed from: com.google.firebase.crashlytics.internal.model.a */
public final class C3086a implements C3183a {

    /* renamed from: a */
    public static final C3183a f5939a = new C3086a();

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$a */
    private static final class C3087a implements C3179c<CrashlyticsReport.C3048b> {

        /* renamed from: a */
        static final C3087a f5940a = new C3087a();

        private C3087a() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3048b bVar, C3180d dVar) {
            dVar.mo17755f(BaseService.KEY, bVar.mo17452b());
            dVar.mo17755f("value", bVar.mo17453c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$b */
    private static final class C3088b implements C3179c<CrashlyticsReport> {

        /* renamed from: a */
        static final C3088b f5941a = new C3088b();

        private C3088b() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport crashlyticsReport, C3180d dVar) {
            dVar.mo17755f("sdkVersion", crashlyticsReport.mo17436i());
            dVar.mo17755f("gmpAppId", crashlyticsReport.mo17432e());
            dVar.mo17754c("platform", crashlyticsReport.mo17435h());
            dVar.mo17755f("installationUuid", crashlyticsReport.mo17433f());
            dVar.mo17755f("buildVersion", crashlyticsReport.mo17430c());
            dVar.mo17755f("displayVersion", crashlyticsReport.mo17431d());
            dVar.mo17755f("session", crashlyticsReport.mo17437j());
            dVar.mo17755f("ndkPayload", crashlyticsReport.mo17434g());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$c */
    private static final class C3089c implements C3179c<CrashlyticsReport.C3050c> {

        /* renamed from: a */
        static final C3089c f5942a = new C3089c();

        private C3089c() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3050c cVar, C3180d dVar) {
            dVar.mo17755f("files", cVar.mo17457b());
            dVar.mo17755f("orgId", cVar.mo17458c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$d */
    private static final class C3090d implements C3179c<CrashlyticsReport.C3050c.C3052b> {

        /* renamed from: a */
        static final C3090d f5943a = new C3090d();

        private C3090d() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3050c.C3052b bVar, C3180d dVar) {
            dVar.mo17755f("filename", bVar.mo17463c());
            dVar.mo17755f("contents", bVar.mo17462b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$e */
    private static final class C3091e implements C3179c<CrashlyticsReport.C3054d.C3055a> {

        /* renamed from: a */
        static final C3091e f5944a = new C3091e();

        private C3091e() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3055a aVar, C3180d dVar) {
            dVar.mo17755f("identifier", aVar.mo17483c());
            dVar.mo17755f("version", aVar.mo17486f());
            dVar.mo17755f("displayVersion", aVar.mo17482b());
            dVar.mo17755f("organization", aVar.mo17485e());
            dVar.mo17755f("installationUuid", aVar.mo17484d());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$f */
    private static final class C3092f implements C3179c<CrashlyticsReport.C3054d.C3055a.C3057b> {

        /* renamed from: a */
        static final C3092f f5945a = new C3092f();

        private C3092f() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3055a.C3057b bVar, C3180d dVar) {
            dVar.mo17755f("clsId", bVar.mo17492a());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$g */
    private static final class C3093g implements C3179c<CrashlyticsReport.C3054d.C3059c> {

        /* renamed from: a */
        static final C3093g f5946a = new C3093g();

        private C3093g() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3059c cVar, C3180d dVar) {
            dVar.mo17754c("arch", cVar.mo17506b());
            dVar.mo17755f("model", cVar.mo17510f());
            dVar.mo17754c("cores", cVar.mo17507c());
            dVar.mo17753b("ram", cVar.mo17512h());
            dVar.mo17753b("diskSpace", cVar.mo17508d());
            dVar.mo17752a("simulator", cVar.mo17514j());
            dVar.mo17754c("state", cVar.mo17513i());
            dVar.mo17755f(DddTag.DEVICE_MANUFACTURER, cVar.mo17509e());
            dVar.mo17755f("modelClass", cVar.mo17511g());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$h */
    private static final class C3094h implements C3179c<CrashlyticsReport.C3054d> {

        /* renamed from: a */
        static final C3094h f5947a = new C3094h();

        private C3094h() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d dVar, C3180d dVar2) {
            dVar2.mo17755f("generator", dVar.mo17471f());
            dVar2.mo17755f("identifier", dVar.mo17474i());
            dVar2.mo17753b("startedAt", dVar.mo17476k());
            dVar2.mo17755f("endedAt", dVar.mo17469d());
            dVar2.mo17752a("crashed", dVar.mo17478m());
            dVar2.mo17755f("app", dVar.mo17467b());
            dVar2.mo17755f("user", dVar.mo17477l());
            dVar2.mo17755f("os", dVar.mo17475j());
            dVar2.mo17755f(DddTag.DEVICE, dVar.mo17468c());
            dVar2.mo17755f("events", dVar.mo17470e());
            dVar2.mo17754c("generatorType", dVar.mo17472g());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$i */
    private static final class C3095i implements C3179c<CrashlyticsReport.C3054d.C3061d.C3062a> {

        /* renamed from: a */
        static final C3095i f5948a = new C3095i();

        private C3095i() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3061d.C3062a aVar, C3180d dVar) {
            dVar.mo17755f("execution", aVar.mo17533d());
            dVar.mo17755f("customAttributes", aVar.mo17532c());
            dVar.mo17755f("background", aVar.mo17531b());
            dVar.mo17754c("uiOrientation", aVar.mo17534e());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$j */
    private static final class C3096j implements C3179c<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a> {

        /* renamed from: a */
        static final C3096j f5949a = new C3096j();

        private C3096j() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a aVar, C3180d dVar) {
            dVar.mo17753b("baseAddress", aVar.mo17545b());
            dVar.mo17753b("size", aVar.mo17547d());
            dVar.mo17755f("name", aVar.mo17546c());
            dVar.mo17755f("uuid", aVar.mo17549f());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$k */
    private static final class C3097k implements C3179c<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b> {

        /* renamed from: a */
        static final C3097k f5950a = new C3097k();

        private C3097k() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b bVar, C3180d dVar) {
            dVar.mo17755f("threads", bVar.mo17544e());
            dVar.mo17755f("exception", bVar.mo17542c());
            dVar.mo17755f("signal", bVar.mo17543d());
            dVar.mo17755f("binaries", bVar.mo17541b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$l */
    private static final class C3098l implements C3179c<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c> {

        /* renamed from: a */
        static final C3098l f5951a = new C3098l();

        private C3098l() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c cVar, C3180d dVar) {
            dVar.mo17755f("type", cVar.mo17565f());
            dVar.mo17755f("reason", cVar.mo17564e());
            dVar.mo17755f("frames", cVar.mo17562c());
            dVar.mo17755f("causedBy", cVar.mo17561b());
            dVar.mo17754c("overflowCount", cVar.mo17563d());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$m */
    private static final class C3099m implements C3179c<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d> {

        /* renamed from: a */
        static final C3099m f5952a = new C3099m();

        private C3099m() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d dVar, C3180d dVar2) {
            dVar2.mo17755f("name", dVar.mo17574d());
            dVar2.mo17755f("code", dVar.mo17573c());
            dVar2.mo17753b("address", dVar.mo17572b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$n */
    private static final class C3100n implements C3179c<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e> {

        /* renamed from: a */
        static final C3100n f5953a = new C3100n();

        private C3100n() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e eVar, C3180d dVar) {
            dVar.mo17755f("name", eVar.mo17581d());
            dVar.mo17754c("importance", eVar.mo17580c());
            dVar.mo17755f("frames", eVar.mo17579b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$o */
    private static final class C3101o implements C3179c<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b> {

        /* renamed from: a */
        static final C3101o f5954a = new C3101o();

        private C3101o() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b bVar, C3180d dVar) {
            dVar.mo17753b("pc", bVar.mo17589e());
            dVar.mo17755f("symbol", bVar.mo17590f());
            dVar.mo17755f("file", bVar.mo17586b());
            dVar.mo17753b("offset", bVar.mo17588d());
            dVar.mo17754c("importance", bVar.mo17587c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$p */
    private static final class C3102p implements C3179c<CrashlyticsReport.C3054d.C3061d.C3077c> {

        /* renamed from: a */
        static final C3102p f5955a = new C3102p();

        private C3102p() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3061d.C3077c cVar, C3180d dVar) {
            dVar.mo17755f("batteryLevel", cVar.mo17603b());
            dVar.mo17754c("batteryVelocity", cVar.mo17604c());
            dVar.mo17752a("proximityOn", cVar.mo17608g());
            dVar.mo17754c("orientation", cVar.mo17606e());
            dVar.mo17753b("ramUsed", cVar.mo17607f());
            dVar.mo17753b("diskUsed", cVar.mo17605d());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$q */
    private static final class C3103q implements C3179c<CrashlyticsReport.C3054d.C3061d> {

        /* renamed from: a */
        static final C3103q f5956a = new C3103q();

        private C3103q() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3061d dVar, C3180d dVar2) {
            dVar2.mo17753b("timestamp", dVar.mo17528e());
            dVar2.mo17755f("type", dVar.mo17529f());
            dVar2.mo17755f("app", dVar.mo17525b());
            dVar2.mo17755f(DddTag.DEVICE, dVar.mo17526c());
            dVar2.mo17755f("log", dVar.mo17527d());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$r */
    private static final class C3104r implements C3179c<CrashlyticsReport.C3054d.C3061d.C3079d> {

        /* renamed from: a */
        static final C3104r f5957a = new C3104r();

        private C3104r() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3061d.C3079d dVar, C3180d dVar2) {
            dVar2.mo17755f("content", dVar.mo17616b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$s */
    private static final class C3105s implements C3179c<CrashlyticsReport.C3054d.C3081e> {

        /* renamed from: a */
        static final C3105s f5958a = new C3105s();

        private C3105s() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3081e eVar, C3180d dVar) {
            dVar.mo17754c("platform", eVar.mo17620c());
            dVar.mo17755f("version", eVar.mo17621d());
            dVar.mo17755f("buildVersion", eVar.mo17619b());
            dVar.mo17752a("jailbroken", eVar.mo17622e());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$t */
    private static final class C3106t implements C3179c<CrashlyticsReport.C3054d.C3083f> {

        /* renamed from: a */
        static final C3106t f5959a = new C3106t();

        private C3106t() {
        }

        /* renamed from: b */
        public void mo10134a(CrashlyticsReport.C3054d.C3083f fVar, C3180d dVar) {
            dVar.mo17755f("identifier", fVar.mo17628b());
        }
    }

    private C3086a() {
    }

    /* renamed from: a */
    public void mo10133a(C3184b<?> bVar) {
        bVar.mo17759a(CrashlyticsReport.class, C3088b.f5941a);
        bVar.mo17759a(C3107b.class, C3088b.f5941a);
        bVar.mo17759a(CrashlyticsReport.C3054d.class, C3094h.f5947a);
        bVar.mo17759a(C3119f.class, C3094h.f5947a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3055a.class, C3091e.f5944a);
        bVar.mo17759a(C3122g.class, C3091e.f5944a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3055a.C3057b.class, C3092f.f5945a);
        bVar.mo17759a(C3125h.class, C3092f.f5945a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3083f.class, C3106t.f5959a);
        bVar.mo17759a(C3162u.class, C3106t.f5959a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3081e.class, C3105s.f5958a);
        bVar.mo17759a(C3159t.class, C3105s.f5958a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3059c.class, C3093g.f5946a);
        bVar.mo17759a(C3126i.class, C3093g.f5946a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3061d.class, C3103q.f5956a);
        bVar.mo17759a(C3129j.class, C3103q.f5956a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3061d.C3062a.class, C3095i.f5948a);
        bVar.mo17759a(C3132k.class, C3095i.f5948a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.class, C3097k.f5950a);
        bVar.mo17759a(C3135l.class, C3097k.f5950a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.class, C3100n.f5953a);
        bVar.mo17759a(C3147p.class, C3100n.f5953a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b.class, C3101o.f5954a);
        bVar.mo17759a(C3150q.class, C3101o.f5954a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c.class, C3098l.f5951a);
        bVar.mo17759a(C3141n.class, C3098l.f5951a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d.class, C3099m.f5952a);
        bVar.mo17759a(C3144o.class, C3099m.f5952a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a.class, C3096j.f5949a);
        bVar.mo17759a(C3138m.class, C3096j.f5949a);
        bVar.mo17759a(CrashlyticsReport.C3048b.class, C3087a.f5940a);
        bVar.mo17759a(C3110c.class, C3087a.f5940a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3061d.C3077c.class, C3102p.f5955a);
        bVar.mo17759a(C3153r.class, C3102p.f5955a);
        bVar.mo17759a(CrashlyticsReport.C3054d.C3061d.C3079d.class, C3104r.f5957a);
        bVar.mo17759a(C3156s.class, C3104r.f5957a);
        bVar.mo17759a(CrashlyticsReport.C3050c.class, C3089c.f5942a);
        bVar.mo17759a(C3113d.class, C3089c.f5942a);
        bVar.mo17759a(CrashlyticsReport.C3050c.C3052b.class, C3090d.f5943a);
        bVar.mo17759a(C3116e.class, C3090d.f5943a);
    }
}
