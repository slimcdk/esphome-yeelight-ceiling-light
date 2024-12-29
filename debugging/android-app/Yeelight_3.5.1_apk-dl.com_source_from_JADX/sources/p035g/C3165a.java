package p035g;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.proto.AtProtobuf;
import p047j.C3252a;
import p047j.C3254b;
import p047j.C3256c;
import p047j.C3258d;
import p047j.C3260e;
import p049j1.C3265b;
import p049j1.C3268c;
import p049j1.C3269d;
import p054k1.C3293a;
import p054k1.C3294b;

/* renamed from: g.a */
public final class C3165a implements C3293a {

    /* renamed from: a */
    public static final C3293a f5089a = new C3165a();

    /* renamed from: g.a$a */
    private static final class C3166a implements C3268c<C3252a> {

        /* renamed from: a */
        static final C3166a f5090a = new C3166a();

        /* renamed from: b */
        private static final C3265b f5091b = C3265b.m8753a("window").mo23835b(AtProtobuf.m6419b().mo18998c(1).mo18997a()).mo23834a();

        /* renamed from: c */
        private static final C3265b f5092c = C3265b.m8753a("logSourceMetrics").mo23835b(AtProtobuf.m6419b().mo18998c(2).mo18997a()).mo23834a();

        /* renamed from: d */
        private static final C3265b f5093d = C3265b.m8753a("globalMetrics").mo23835b(AtProtobuf.m6419b().mo18998c(3).mo18997a()).mo23834a();

        /* renamed from: e */
        private static final C3265b f5094e = C3265b.m8753a("appNamespace").mo23835b(AtProtobuf.m6419b().mo18998c(4).mo18997a()).mo23834a();

        private C3166a() {
        }

        /* renamed from: b */
        public void mo11147a(C3252a aVar, C3269d dVar) {
            dVar.mo19009a(f5091b, aVar.mo23799d());
            dVar.mo19009a(f5092c, aVar.mo23798c());
            dVar.mo19009a(f5093d, aVar.mo23797b());
            dVar.mo19009a(f5094e, aVar.mo23796a());
        }
    }

    /* renamed from: g.a$b */
    private static final class C3167b implements C3268c<C3254b> {

        /* renamed from: a */
        static final C3167b f5095a = new C3167b();

        /* renamed from: b */
        private static final C3265b f5096b = C3265b.m8753a("storageMetrics").mo23835b(AtProtobuf.m6419b().mo18998c(1).mo18997a()).mo23834a();

        private C3167b() {
        }

        /* renamed from: b */
        public void mo11147a(C3254b bVar, C3269d dVar) {
            dVar.mo19009a(f5096b, bVar.mo23806a());
        }
    }

    /* renamed from: g.a$c */
    private static final class C3168c implements C3268c<LogEventDropped> {

        /* renamed from: a */
        static final C3168c f5097a = new C3168c();

        /* renamed from: b */
        private static final C3265b f5098b = C3265b.m8753a("eventsDroppedCount").mo23835b(AtProtobuf.m6419b().mo18998c(1).mo18997a()).mo23834a();

        /* renamed from: c */
        private static final C3265b f5099c = C3265b.m8753a("reason").mo23835b(AtProtobuf.m6419b().mo18998c(3).mo18997a()).mo23834a();

        private C3168c() {
        }

        /* renamed from: b */
        public void mo11147a(LogEventDropped logEventDropped, C3269d dVar) {
            dVar.mo19011d(f5098b, logEventDropped.mo11244a());
            dVar.mo19009a(f5099c, logEventDropped.mo11245b());
        }
    }

    /* renamed from: g.a$d */
    private static final class C3169d implements C3268c<C3256c> {

        /* renamed from: a */
        static final C3169d f5100a = new C3169d();

        /* renamed from: b */
        private static final C3265b f5101b = C3265b.m8753a("logSource").mo23835b(AtProtobuf.m6419b().mo18998c(1).mo18997a()).mo23834a();

        /* renamed from: c */
        private static final C3265b f5102c = C3265b.m8753a("logEventDropped").mo23835b(AtProtobuf.m6419b().mo18998c(2).mo18997a()).mo23834a();

        private C3169d() {
        }

        /* renamed from: b */
        public void mo11147a(C3256c cVar, C3269d dVar) {
            dVar.mo19009a(f5101b, cVar.mo23810b());
            dVar.mo19009a(f5102c, cVar.mo23809a());
        }
    }

    /* renamed from: g.a$e */
    private static final class C3170e implements C3268c<C3193l> {

        /* renamed from: a */
        static final C3170e f5103a = new C3170e();

        /* renamed from: b */
        private static final C3265b f5104b = C3265b.m8754d("clientMetrics");

        private C3170e() {
        }

        /* renamed from: b */
        public void mo11147a(C3193l lVar, C3269d dVar) {
            dVar.mo19009a(f5104b, lVar.mo23759b());
        }
    }

    /* renamed from: g.a$f */
    private static final class C3171f implements C3268c<C3258d> {

        /* renamed from: a */
        static final C3171f f5105a = new C3171f();

        /* renamed from: b */
        private static final C3265b f5106b = C3265b.m8753a("currentCacheSizeBytes").mo23835b(AtProtobuf.m6419b().mo18998c(1).mo18997a()).mo23834a();

        /* renamed from: c */
        private static final C3265b f5107c = C3265b.m8753a("maxCacheSizeBytes").mo23835b(AtProtobuf.m6419b().mo18998c(2).mo18997a()).mo23834a();

        private C3171f() {
        }

        /* renamed from: b */
        public void mo11147a(C3258d dVar, C3269d dVar2) {
            dVar2.mo19011d(f5106b, dVar.mo23814a());
            dVar2.mo19011d(f5107c, dVar.mo23815b());
        }
    }

    /* renamed from: g.a$g */
    private static final class C3172g implements C3268c<C3260e> {

        /* renamed from: a */
        static final C3172g f5108a = new C3172g();

        /* renamed from: b */
        private static final C3265b f5109b = C3265b.m8753a("startMs").mo23835b(AtProtobuf.m6419b().mo18998c(1).mo18997a()).mo23834a();

        /* renamed from: c */
        private static final C3265b f5110c = C3265b.m8753a("endMs").mo23835b(AtProtobuf.m6419b().mo18998c(2).mo18997a()).mo23834a();

        private C3172g() {
        }

        /* renamed from: b */
        public void mo11147a(C3260e eVar, C3269d dVar) {
            dVar.mo19011d(f5109b, eVar.mo23820b());
            dVar.mo19011d(f5110c, eVar.mo23819a());
        }
    }

    private C3165a() {
    }

    /* renamed from: a */
    public void mo11146a(C3294b<?> bVar) {
        bVar.mo19025a(C3193l.class, C3170e.f5103a);
        bVar.mo19025a(C3252a.class, C3166a.f5090a);
        bVar.mo19025a(C3260e.class, C3172g.f5108a);
        bVar.mo19025a(C3256c.class, C3169d.f5100a);
        bVar.mo19025a(LogEventDropped.class, C3168c.f5097a);
        bVar.mo19025a(C3254b.class, C3167b.f5095a);
        bVar.mo19025a(C3258d.class, C3171f.f5105a);
    }
}
