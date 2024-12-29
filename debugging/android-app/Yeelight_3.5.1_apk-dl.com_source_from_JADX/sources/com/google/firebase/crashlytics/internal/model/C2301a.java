package com.google.firebase.crashlytics.internal.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.miot.common.device.parser.xml.DddTag;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import p049j1.C3265b;
import p049j1.C3268c;
import p049j1.C3269d;
import p054k1.C3293a;
import p054k1.C3294b;

/* renamed from: com.google.firebase.crashlytics.internal.model.a */
public final class C2301a implements C3293a {

    /* renamed from: a */
    public static final C3293a f3660a = new C2301a();

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$a */
    private static final class C2302a implements C3268c<CrashlyticsReport.C2261a> {

        /* renamed from: a */
        static final C2302a f3661a = new C2302a();

        /* renamed from: b */
        private static final C3265b f3662b = C3265b.m8754d(ScanBarcodeActivity.PID);

        /* renamed from: c */
        private static final C3265b f3663c = C3265b.m8754d("processName");

        /* renamed from: d */
        private static final C3265b f3664d = C3265b.m8754d("reasonCode");

        /* renamed from: e */
        private static final C3265b f3665e = C3265b.m8754d("importance");

        /* renamed from: f */
        private static final C3265b f3666f = C3265b.m8754d("pss");

        /* renamed from: g */
        private static final C3265b f3667g = C3265b.m8754d("rss");

        /* renamed from: h */
        private static final C3265b f3668h = C3265b.m8754d("timestamp");

        /* renamed from: i */
        private static final C3265b f3669i = C3265b.m8754d("traceFile");

        private C2302a() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2261a aVar, C3269d dVar) {
            dVar.mo19012e(f3662b, aVar.mo18635c());
            dVar.mo19009a(f3663c, aVar.mo18636d());
            dVar.mo19012e(f3664d, aVar.mo18638f());
            dVar.mo19012e(f3665e, aVar.mo18634b());
            dVar.mo19011d(f3666f, aVar.mo18637e());
            dVar.mo19011d(f3667g, aVar.mo18639g());
            dVar.mo19011d(f3668h, aVar.mo18640h());
            dVar.mo19009a(f3669i, aVar.mo18641i());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$b */
    private static final class C2303b implements C3268c<CrashlyticsReport.C2264c> {

        /* renamed from: a */
        static final C2303b f3670a = new C2303b();

        /* renamed from: b */
        private static final C3265b f3671b = C3265b.m8754d("key");

        /* renamed from: c */
        private static final C3265b f3672c = C3265b.m8754d("value");

        private C2303b() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2264c cVar, C3269d dVar) {
            dVar.mo19009a(f3671b, cVar.mo18660b());
            dVar.mo19009a(f3672c, cVar.mo18661c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$c */
    private static final class C2304c implements C3268c<CrashlyticsReport> {

        /* renamed from: a */
        static final C2304c f3673a = new C2304c();

        /* renamed from: b */
        private static final C3265b f3674b = C3265b.m8754d("sdkVersion");

        /* renamed from: c */
        private static final C3265b f3675c = C3265b.m8754d("gmpAppId");

        /* renamed from: d */
        private static final C3265b f3676d = C3265b.m8754d("platform");

        /* renamed from: e */
        private static final C3265b f3677e = C3265b.m8754d("installationUuid");

        /* renamed from: f */
        private static final C3265b f3678f = C3265b.m8754d("buildVersion");

        /* renamed from: g */
        private static final C3265b f3679g = C3265b.m8754d("displayVersion");

        /* renamed from: h */
        private static final C3265b f3680h = C3265b.m8754d("session");

        /* renamed from: i */
        private static final C3265b f3681i = C3265b.m8754d("ndkPayload");

        private C2304c() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport crashlyticsReport, C3269d dVar) {
            dVar.mo19009a(f3674b, crashlyticsReport.mo18628i());
            dVar.mo19009a(f3675c, crashlyticsReport.mo18624e());
            dVar.mo19012e(f3676d, crashlyticsReport.mo18627h());
            dVar.mo19009a(f3677e, crashlyticsReport.mo18625f());
            dVar.mo19009a(f3678f, crashlyticsReport.mo18622c());
            dVar.mo19009a(f3679g, crashlyticsReport.mo18623d());
            dVar.mo19009a(f3680h, crashlyticsReport.mo18629j());
            dVar.mo19009a(f3681i, crashlyticsReport.mo18626g());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$d */
    private static final class C2305d implements C3268c<CrashlyticsReport.C2266d> {

        /* renamed from: a */
        static final C2305d f3682a = new C2305d();

        /* renamed from: b */
        private static final C3265b f3683b = C3265b.m8754d("files");

        /* renamed from: c */
        private static final C3265b f3684c = C3265b.m8754d("orgId");

        private C2305d() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2266d dVar, C3269d dVar2) {
            dVar2.mo19009a(f3683b, dVar.mo18665b());
            dVar2.mo19009a(f3684c, dVar.mo18666c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$e */
    private static final class C2306e implements C3268c<CrashlyticsReport.C2266d.C2268b> {

        /* renamed from: a */
        static final C2306e f3685a = new C2306e();

        /* renamed from: b */
        private static final C3265b f3686b = C3265b.m8754d("filename");

        /* renamed from: c */
        private static final C3265b f3687c = C3265b.m8754d("contents");

        private C2306e() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2266d.C2268b bVar, C3269d dVar) {
            dVar.mo19009a(f3686b, bVar.mo18671c());
            dVar.mo19009a(f3687c, bVar.mo18670b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$f */
    private static final class C2307f implements C3268c<CrashlyticsReport.C2270e.C2271a> {

        /* renamed from: a */
        static final C2307f f3688a = new C2307f();

        /* renamed from: b */
        private static final C3265b f3689b = C3265b.m8754d("identifier");

        /* renamed from: c */
        private static final C3265b f3690c = C3265b.m8754d(Constants.VERSION);

        /* renamed from: d */
        private static final C3265b f3691d = C3265b.m8754d("displayVersion");

        /* renamed from: e */
        private static final C3265b f3692e = C3265b.m8754d("organization");

        /* renamed from: f */
        private static final C3265b f3693f = C3265b.m8754d("installationUuid");

        /* renamed from: g */
        private static final C3265b f3694g = C3265b.m8754d("developmentPlatform");

        /* renamed from: h */
        private static final C3265b f3695h = C3265b.m8754d("developmentPlatformVersion");

        private C2307f() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2271a aVar, C3269d dVar) {
            dVar.mo19009a(f3689b, aVar.mo18693e());
            dVar.mo19009a(f3690c, aVar.mo18696h());
            dVar.mo19009a(f3691d, aVar.mo18692d());
            dVar.mo19009a(f3692e, aVar.mo18695g());
            dVar.mo19009a(f3693f, aVar.mo18694f());
            dVar.mo19009a(f3694g, aVar.mo18690b());
            dVar.mo19009a(f3695h, aVar.mo18691c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$g */
    private static final class C2308g implements C3268c<CrashlyticsReport.C2270e.C2271a.C2273b> {

        /* renamed from: a */
        static final C2308g f3696a = new C2308g();

        /* renamed from: b */
        private static final C3265b f3697b = C3265b.m8754d("clsId");

        private C2308g() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2271a.C2273b bVar, C3269d dVar) {
            dVar.mo19009a(f3697b, bVar.mo18704a());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$h */
    private static final class C2309h implements C3268c<CrashlyticsReport.C2270e.C2275c> {

        /* renamed from: a */
        static final C2309h f3698a = new C2309h();

        /* renamed from: b */
        private static final C3265b f3699b = C3265b.m8754d("arch");

        /* renamed from: c */
        private static final C3265b f3700c = C3265b.m8754d("model");

        /* renamed from: d */
        private static final C3265b f3701d = C3265b.m8754d("cores");

        /* renamed from: e */
        private static final C3265b f3702e = C3265b.m8754d("ram");

        /* renamed from: f */
        private static final C3265b f3703f = C3265b.m8754d("diskSpace");

        /* renamed from: g */
        private static final C3265b f3704g = C3265b.m8754d("simulator");

        /* renamed from: h */
        private static final C3265b f3705h = C3265b.m8754d("state");

        /* renamed from: i */
        private static final C3265b f3706i = C3265b.m8754d(DddTag.DEVICE_MANUFACTURER);

        /* renamed from: j */
        private static final C3265b f3707j = C3265b.m8754d("modelClass");

        private C2309h() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2275c cVar, C3269d dVar) {
            dVar.mo19012e(f3699b, cVar.mo18718b());
            dVar.mo19009a(f3700c, cVar.mo18722f());
            dVar.mo19012e(f3701d, cVar.mo18719c());
            dVar.mo19011d(f3702e, cVar.mo18724h());
            dVar.mo19011d(f3703f, cVar.mo18720d());
            dVar.mo19013f(f3704g, cVar.mo18726j());
            dVar.mo19012e(f3705h, cVar.mo18725i());
            dVar.mo19009a(f3706i, cVar.mo18721e());
            dVar.mo19009a(f3707j, cVar.mo18723g());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$i */
    private static final class C2310i implements C3268c<CrashlyticsReport.C2270e> {

        /* renamed from: a */
        static final C2310i f3708a = new C2310i();

        /* renamed from: b */
        private static final C3265b f3709b = C3265b.m8754d("generator");

        /* renamed from: c */
        private static final C3265b f3710c = C3265b.m8754d("identifier");

        /* renamed from: d */
        private static final C3265b f3711d = C3265b.m8754d("startedAt");

        /* renamed from: e */
        private static final C3265b f3712e = C3265b.m8754d("endedAt");

        /* renamed from: f */
        private static final C3265b f3713f = C3265b.m8754d("crashed");

        /* renamed from: g */
        private static final C3265b f3714g = C3265b.m8754d("app");

        /* renamed from: h */
        private static final C3265b f3715h = C3265b.m8754d("user");

        /* renamed from: i */
        private static final C3265b f3716i = C3265b.m8754d("os");

        /* renamed from: j */
        private static final C3265b f3717j = C3265b.m8754d(DddTag.DEVICE);

        /* renamed from: k */
        private static final C3265b f3718k = C3265b.m8754d("events");

        /* renamed from: l */
        private static final C3265b f3719l = C3265b.m8754d("generatorType");

        private C2310i() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e eVar, C3269d dVar) {
            dVar.mo19009a(f3709b, eVar.mo18679f());
            dVar.mo19009a(f3710c, eVar.mo18682i());
            dVar.mo19011d(f3711d, eVar.mo18684k());
            dVar.mo19009a(f3712e, eVar.mo18677d());
            dVar.mo19013f(f3713f, eVar.mo18686m());
            dVar.mo19009a(f3714g, eVar.mo18675b());
            dVar.mo19009a(f3715h, eVar.mo18685l());
            dVar.mo19009a(f3716i, eVar.mo18683j());
            dVar.mo19009a(f3717j, eVar.mo18676c());
            dVar.mo19009a(f3718k, eVar.mo18678e());
            dVar.mo19012e(f3719l, eVar.mo18680g());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$j */
    private static final class C2311j implements C3268c<CrashlyticsReport.C2270e.C2277d.C2278a> {

        /* renamed from: a */
        static final C2311j f3720a = new C2311j();

        /* renamed from: b */
        private static final C3265b f3721b = C3265b.m8754d("execution");

        /* renamed from: c */
        private static final C3265b f3722c = C3265b.m8754d("customAttributes");

        /* renamed from: d */
        private static final C3265b f3723d = C3265b.m8754d("internalKeys");

        /* renamed from: e */
        private static final C3265b f3724e = C3265b.m8754d("background");

        /* renamed from: f */
        private static final C3265b f3725f = C3265b.m8754d("uiOrientation");

        private C2311j() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2277d.C2278a aVar, C3269d dVar) {
            dVar.mo19009a(f3721b, aVar.mo18745d());
            dVar.mo19009a(f3722c, aVar.mo18744c());
            dVar.mo19009a(f3723d, aVar.mo18746e());
            dVar.mo19009a(f3724e, aVar.mo18743b());
            dVar.mo19012e(f3725f, aVar.mo18747f());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$k */
    private static final class C2312k implements C3268c<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a> {

        /* renamed from: a */
        static final C2312k f3726a = new C2312k();

        /* renamed from: b */
        private static final C3265b f3727b = C3265b.m8754d("baseAddress");

        /* renamed from: c */
        private static final C3265b f3728c = C3265b.m8754d("size");

        /* renamed from: d */
        private static final C3265b f3729d = C3265b.m8754d("name");

        /* renamed from: e */
        private static final C3265b f3730e = C3265b.m8754d("uuid");

        private C2312k() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a aVar, C3269d dVar) {
            dVar.mo19011d(f3727b, aVar.mo18760b());
            dVar.mo19011d(f3728c, aVar.mo18762d());
            dVar.mo19009a(f3729d, aVar.mo18761c());
            dVar.mo19009a(f3730e, aVar.mo18764f());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$l */
    private static final class C2313l implements C3268c<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b> {

        /* renamed from: a */
        static final C2313l f3731a = new C2313l();

        /* renamed from: b */
        private static final C3265b f3732b = C3265b.m8754d("threads");

        /* renamed from: c */
        private static final C3265b f3733c = C3265b.m8754d("exception");

        /* renamed from: d */
        private static final C3265b f3734d = C3265b.m8754d("appExitInfo");

        /* renamed from: e */
        private static final C3265b f3735e = C3265b.m8754d("signal");

        /* renamed from: f */
        private static final C3265b f3736f = C3265b.m8754d("binaries");

        private C2313l() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b bVar, C3269d dVar) {
            dVar.mo19009a(f3732b, bVar.mo18759f());
            dVar.mo19009a(f3733c, bVar.mo18757d());
            dVar.mo19009a(f3734d, bVar.mo18755b());
            dVar.mo19009a(f3735e, bVar.mo18758e());
            dVar.mo19009a(f3736f, bVar.mo18756c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$m */
    private static final class C2314m implements C3268c<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c> {

        /* renamed from: a */
        static final C2314m f3737a = new C2314m();

        /* renamed from: b */
        private static final C3265b f3738b = C3265b.m8754d("type");

        /* renamed from: c */
        private static final C3265b f3739c = C3265b.m8754d("reason");

        /* renamed from: d */
        private static final C3265b f3740d = C3265b.m8754d("frames");

        /* renamed from: e */
        private static final C3265b f3741e = C3265b.m8754d("causedBy");

        /* renamed from: f */
        private static final C3265b f3742f = C3265b.m8754d("overflowCount");

        private C2314m() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c cVar, C3269d dVar) {
            dVar.mo19009a(f3738b, cVar.mo18781f());
            dVar.mo19009a(f3739c, cVar.mo18780e());
            dVar.mo19009a(f3740d, cVar.mo18778c());
            dVar.mo19009a(f3741e, cVar.mo18777b());
            dVar.mo19012e(f3742f, cVar.mo18779d());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$n */
    private static final class C2315n implements C3268c<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d> {

        /* renamed from: a */
        static final C2315n f3743a = new C2315n();

        /* renamed from: b */
        private static final C3265b f3744b = C3265b.m8754d("name");

        /* renamed from: c */
        private static final C3265b f3745c = C3265b.m8754d("code");

        /* renamed from: d */
        private static final C3265b f3746d = C3265b.m8754d("address");

        private C2315n() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d dVar, C3269d dVar2) {
            dVar2.mo19009a(f3744b, dVar.mo18790d());
            dVar2.mo19009a(f3745c, dVar.mo18789c());
            dVar2.mo19011d(f3746d, dVar.mo18788b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$o */
    private static final class C2316o implements C3268c<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e> {

        /* renamed from: a */
        static final C2316o f3747a = new C2316o();

        /* renamed from: b */
        private static final C3265b f3748b = C3265b.m8754d("name");

        /* renamed from: c */
        private static final C3265b f3749c = C3265b.m8754d("importance");

        /* renamed from: d */
        private static final C3265b f3750d = C3265b.m8754d("frames");

        private C2316o() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e eVar, C3269d dVar) {
            dVar.mo19009a(f3748b, eVar.mo18797d());
            dVar.mo19012e(f3749c, eVar.mo18796c());
            dVar.mo19009a(f3750d, eVar.mo18795b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$p */
    private static final class C2317p implements C3268c<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b> {

        /* renamed from: a */
        static final C2317p f3751a = new C2317p();

        /* renamed from: b */
        private static final C3265b f3752b = C3265b.m8754d("pc");

        /* renamed from: c */
        private static final C3265b f3753c = C3265b.m8754d("symbol");

        /* renamed from: d */
        private static final C3265b f3754d = C3265b.m8754d("file");

        /* renamed from: e */
        private static final C3265b f3755e = C3265b.m8754d(TypedValues.CycleType.S_WAVE_OFFSET);

        /* renamed from: f */
        private static final C3265b f3756f = C3265b.m8754d("importance");

        private C2317p() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b bVar, C3269d dVar) {
            dVar.mo19011d(f3752b, bVar.mo18805e());
            dVar.mo19009a(f3753c, bVar.mo18806f());
            dVar.mo19009a(f3754d, bVar.mo18802b());
            dVar.mo19011d(f3755e, bVar.mo18804d());
            dVar.mo19012e(f3756f, bVar.mo18803c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$q */
    private static final class C2318q implements C3268c<CrashlyticsReport.C2270e.C2277d.C2293c> {

        /* renamed from: a */
        static final C2318q f3757a = new C2318q();

        /* renamed from: b */
        private static final C3265b f3758b = C3265b.m8754d("batteryLevel");

        /* renamed from: c */
        private static final C3265b f3759c = C3265b.m8754d("batteryVelocity");

        /* renamed from: d */
        private static final C3265b f3760d = C3265b.m8754d("proximityOn");

        /* renamed from: e */
        private static final C3265b f3761e = C3265b.m8754d("orientation");

        /* renamed from: f */
        private static final C3265b f3762f = C3265b.m8754d("ramUsed");

        /* renamed from: g */
        private static final C3265b f3763g = C3265b.m8754d("diskUsed");

        private C2318q() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2277d.C2293c cVar, C3269d dVar) {
            dVar.mo19009a(f3758b, cVar.mo18819b());
            dVar.mo19012e(f3759c, cVar.mo18820c());
            dVar.mo19013f(f3760d, cVar.mo18824g());
            dVar.mo19012e(f3761e, cVar.mo18822e());
            dVar.mo19011d(f3762f, cVar.mo18823f());
            dVar.mo19011d(f3763g, cVar.mo18821d());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$r */
    private static final class C2319r implements C3268c<CrashlyticsReport.C2270e.C2277d> {

        /* renamed from: a */
        static final C2319r f3764a = new C2319r();

        /* renamed from: b */
        private static final C3265b f3765b = C3265b.m8754d("timestamp");

        /* renamed from: c */
        private static final C3265b f3766c = C3265b.m8754d("type");

        /* renamed from: d */
        private static final C3265b f3767d = C3265b.m8754d("app");

        /* renamed from: e */
        private static final C3265b f3768e = C3265b.m8754d(DddTag.DEVICE);

        /* renamed from: f */
        private static final C3265b f3769f = C3265b.m8754d("log");

        private C2319r() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2277d dVar, C3269d dVar2) {
            dVar2.mo19011d(f3765b, dVar.mo18740e());
            dVar2.mo19009a(f3766c, dVar.mo18741f());
            dVar2.mo19009a(f3767d, dVar.mo18737b());
            dVar2.mo19009a(f3768e, dVar.mo18738c());
            dVar2.mo19009a(f3769f, dVar.mo18739d());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$s */
    private static final class C2320s implements C3268c<CrashlyticsReport.C2270e.C2277d.C2295d> {

        /* renamed from: a */
        static final C2320s f3770a = new C2320s();

        /* renamed from: b */
        private static final C3265b f3771b = C3265b.m8754d("content");

        private C2320s() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2277d.C2295d dVar, C3269d dVar2) {
            dVar2.mo19009a(f3771b, dVar.mo18832b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$t */
    private static final class C2321t implements C3268c<CrashlyticsReport.C2270e.C2297e> {

        /* renamed from: a */
        static final C2321t f3772a = new C2321t();

        /* renamed from: b */
        private static final C3265b f3773b = C3265b.m8754d("platform");

        /* renamed from: c */
        private static final C3265b f3774c = C3265b.m8754d(Constants.VERSION);

        /* renamed from: d */
        private static final C3265b f3775d = C3265b.m8754d("buildVersion");

        /* renamed from: e */
        private static final C3265b f3776e = C3265b.m8754d("jailbroken");

        private C2321t() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2297e eVar, C3269d dVar) {
            dVar.mo19012e(f3773b, eVar.mo18836c());
            dVar.mo19009a(f3774c, eVar.mo18837d());
            dVar.mo19009a(f3775d, eVar.mo18835b());
            dVar.mo19013f(f3776e, eVar.mo18838e());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$u */
    private static final class C2322u implements C3268c<CrashlyticsReport.C2270e.C2299f> {

        /* renamed from: a */
        static final C2322u f3777a = new C2322u();

        /* renamed from: b */
        private static final C3265b f3778b = C3265b.m8754d("identifier");

        private C2322u() {
        }

        /* renamed from: b */
        public void mo11147a(CrashlyticsReport.C2270e.C2299f fVar, C3269d dVar) {
            dVar.mo19009a(f3778b, fVar.mo18844b());
        }
    }

    private C2301a() {
    }

    /* renamed from: a */
    public void mo11146a(C3294b<?> bVar) {
        C2304c cVar = C2304c.f3673a;
        bVar.mo19025a(CrashlyticsReport.class, cVar);
        bVar.mo19025a(C2327b.class, cVar);
        C2310i iVar = C2310i.f3708a;
        bVar.mo19025a(CrashlyticsReport.C2270e.class, iVar);
        bVar.mo19025a(C2342g.class, iVar);
        C2307f fVar = C2307f.f3688a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2271a.class, fVar);
        bVar.mo19025a(C2345h.class, fVar);
        C2308g gVar = C2308g.f3696a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2271a.C2273b.class, gVar);
        bVar.mo19025a(C2348i.class, gVar);
        C2322u uVar = C2322u.f3777a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2299f.class, uVar);
        bVar.mo19025a(C2385v.class, uVar);
        C2321t tVar = C2321t.f3772a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2297e.class, tVar);
        bVar.mo19025a(C2382u.class, tVar);
        C2309h hVar = C2309h.f3698a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2275c.class, hVar);
        bVar.mo19025a(C2349j.class, hVar);
        C2319r rVar = C2319r.f3764a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2277d.class, rVar);
        bVar.mo19025a(C2352k.class, rVar);
        C2311j jVar = C2311j.f3720a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2277d.C2278a.class, jVar);
        bVar.mo19025a(C2355l.class, jVar);
        C2313l lVar = C2313l.f3731a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.class, lVar);
        bVar.mo19025a(C2358m.class, lVar);
        C2316o oVar = C2316o.f3747a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.class, oVar);
        bVar.mo19025a(C2370q.class, oVar);
        C2317p pVar = C2317p.f3751a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b.class, pVar);
        bVar.mo19025a(C2373r.class, pVar);
        C2314m mVar = C2314m.f3737a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c.class, mVar);
        bVar.mo19025a(C2364o.class, mVar);
        C2302a aVar = C2302a.f3661a;
        bVar.mo19025a(CrashlyticsReport.C2261a.class, aVar);
        bVar.mo19025a(C2330c.class, aVar);
        C2315n nVar = C2315n.f3743a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d.class, nVar);
        bVar.mo19025a(C2367p.class, nVar);
        C2312k kVar = C2312k.f3726a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a.class, kVar);
        bVar.mo19025a(C2361n.class, kVar);
        C2303b bVar2 = C2303b.f3670a;
        bVar.mo19025a(CrashlyticsReport.C2264c.class, bVar2);
        bVar.mo19025a(C2333d.class, bVar2);
        C2318q qVar = C2318q.f3757a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2277d.C2293c.class, qVar);
        bVar.mo19025a(C2376s.class, qVar);
        C2320s sVar = C2320s.f3770a;
        bVar.mo19025a(CrashlyticsReport.C2270e.C2277d.C2295d.class, sVar);
        bVar.mo19025a(C2379t.class, sVar);
        C2305d dVar = C2305d.f3682a;
        bVar.mo19025a(CrashlyticsReport.C2266d.class, dVar);
        bVar.mo19025a(C2336e.class, dVar);
        C2306e eVar = C2306e.f3685a;
        bVar.mo19025a(CrashlyticsReport.C2266d.C2268b.class, eVar);
        bVar.mo19025a(C2339f.class, eVar);
    }
}
