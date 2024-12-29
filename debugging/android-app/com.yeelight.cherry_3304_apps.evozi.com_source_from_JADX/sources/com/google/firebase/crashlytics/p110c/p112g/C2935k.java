package com.google.firebase.crashlytics.p110c.p112g;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.C2816c;
import com.google.firebase.analytics.p109a.C2801a;
import com.google.firebase.crashlytics.p110c.C2856a;
import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p111f.C2866a;
import com.google.firebase.crashlytics.p110c.p115j.C2982c;
import com.google.firebase.crashlytics.p110c.p116k.C2992i;
import com.google.firebase.crashlytics.p110c.p118m.C3000a;
import com.google.firebase.crashlytics.p110c.p118m.C3001b;
import com.google.firebase.crashlytics.p110c.p122o.C3024e;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3032e;
import com.google.firebase.crashlytics.p110c.p126q.C3045a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0623k;

/* renamed from: com.google.firebase.crashlytics.c.g.k */
public class C2935k {

    /* renamed from: a */
    private final Context f5686a;

    /* renamed from: b */
    private final C2816c f5687b;

    /* renamed from: c */
    private final C2947q f5688c;

    /* renamed from: d */
    private final long f5689d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2941l f5690e;

    /* renamed from: f */
    private C2941l f5691f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2898j f5692g;

    /* renamed from: h */
    private final C2955v f5693h;

    /* renamed from: i */
    private final C2801a f5694i;

    /* renamed from: j */
    private ExecutorService f5695j;

    /* renamed from: k */
    private C2893i f5696k;

    /* renamed from: l */
    private C2856a f5697l;

    /* renamed from: com.google.firebase.crashlytics.c.g.k$a */
    class C2936a implements C2866a.C2867a {
        C2936a() {
        }

        /* renamed from: a */
        public void mo17154a(String str) {
            C2935k.this.mo17266k(str);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.k$b */
    class C2937b implements Callable<C0619h<Void>> {

        /* renamed from: a */
        final /* synthetic */ C3024e f5699a;

        C2937b(C3024e eVar) {
            this.f5699a = eVar;
        }

        /* renamed from: a */
        public C0619h<Void> call() {
            return C2935k.this.m8988f(this.f5699a);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.k$c */
    class C2938c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3024e f5701a;

        C2938c(C3024e eVar) {
            this.f5701a = eVar;
        }

        public void run() {
            C0619h unused = C2935k.this.m8988f(this.f5701a);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.k$d */
    class C2939d implements Callable<Boolean> {
        C2939d() {
        }

        /* renamed from: a */
        public Boolean call() {
            try {
                boolean d = C2935k.this.f5690e.mo17282d();
                C2857b f = C2857b.m8687f();
                f.mo17130b("Initialization marker file removed: " + d);
                return Boolean.valueOf(d);
            } catch (Exception e) {
                C2857b.m8687f().mo17133e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.k$e */
    class C2940e implements Callable<Boolean> {
        C2940e() {
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(C2935k.this.f5692g.mo17205H());
        }
    }

    public C2935k(C2816c cVar, C2955v vVar, C2856a aVar, C2947q qVar, C2801a aVar2) {
        this(cVar, vVar, aVar, qVar, aVar2, C2950t.m9046c("Crashlytics Exception Handler"));
    }

    C2935k(C2816c cVar, C2955v vVar, C2856a aVar, C2947q qVar, C2801a aVar2, ExecutorService executorService) {
        this.f5687b = cVar;
        this.f5688c = qVar;
        this.f5686a = cVar.mo17061g();
        this.f5693h = vVar;
        this.f5697l = aVar;
        this.f5694i = aVar2;
        this.f5695j = executorService;
        this.f5696k = new C2893i(executorService);
        this.f5689d = System.currentTimeMillis();
    }

    /* renamed from: d */
    private void m8987d() {
        try {
            Boolean.TRUE.equals((Boolean) C2887h0.m8832a(this.f5696k.mo17196h(new C2940e())));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public C0619h<Void> m8988f(C3024e eVar) {
        mo17269n();
        this.f5692g.mo17203B();
        try {
            this.f5692g.mo17221r0();
            C3032e b = eVar.mo17413b();
            if (!b.mo17419a().f5904a) {
                C2857b.m8687f().mo17130b("Collection of crash reports disabled in Crashlytics settings.");
                return C0623k.m537d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f5692g.mo17210Q(b.mo17420b().f5905a)) {
                C2857b.m8687f().mo17130b("Could not finalize previous sessions.");
            }
            C0619h<Void> w0 = this.f5692g.mo17224w0(1.0f, eVar.mo17412a());
            mo17268m();
            return w0;
        } catch (Exception e) {
            C2857b.m8687f().mo17133e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return C0623k.m537d(e);
        } finally {
            mo17268m();
        }
    }

    /* renamed from: h */
    private void m8989h(C3024e eVar) {
        String str;
        C2857b bVar;
        Future<?> submit = this.f5695j.submit(new C2938c(eVar));
        C2857b.m8687f().mo17130b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
            return;
        } catch (InterruptedException e) {
            e = e;
            bVar = C2857b.m8687f();
            str = "Crashlytics was interrupted during initialization.";
        } catch (ExecutionException e2) {
            e = e2;
            bVar = C2857b.m8687f();
            str = "Problem encountered during Crashlytics initialization.";
        } catch (TimeoutException e3) {
            e = e3;
            bVar = C2857b.m8687f();
            str = "Crashlytics timed out during initialization.";
        }
        bVar.mo17133e(str, e);
    }

    /* renamed from: i */
    public static String m8990i() {
        return "17.0.0";
    }

    /* renamed from: j */
    static boolean m8991j(String str, boolean z) {
        if (z) {
            return !C2884h.m8797D(str);
        }
        C2857b.m8687f().mo17130b("Configured not to require a build ID.");
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo17264e() {
        return this.f5690e.mo17281c();
    }

    /* renamed from: g */
    public C0619h<Void> mo17265g(C3024e eVar) {
        return C2887h0.m8833b(this.f5695j, new C2937b(eVar));
    }

    /* renamed from: k */
    public void mo17266k(String str) {
        this.f5692g.mo17209P0(System.currentTimeMillis() - this.f5689d, str);
    }

    /* renamed from: l */
    public void mo17267l(@NonNull Throwable th) {
        this.f5692g.mo17204G0(Thread.currentThread(), th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo17268m() {
        this.f5696k.mo17196h(new C2939d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo17269n() {
        this.f5696k.mo17193b();
        this.f5690e.mo17280a();
        C2857b.m8687f().mo17130b("Initialization marker file created.");
    }

    /* renamed from: o */
    public boolean mo17270o(C3024e eVar) {
        String p = C2884h.m8819p(this.f5686a);
        C2857b f = C2857b.m8687f();
        f.mo17130b("Mapping file ID is: " + p);
        if (m8991j(p, C2884h.m8815l(this.f5686a, "com.crashlytics.RequireBuildId", true))) {
            String c = this.f5687b.mo17064j().mo17742c();
            try {
                C2857b f2 = C2857b.m8687f();
                f2.mo17134g("Initializing Crashlytics " + m8990i());
                C2992i iVar = new C2992i(this.f5686a);
                this.f5691f = new C2941l("crash_marker", iVar);
                this.f5690e = new C2941l("initialization_marker", iVar);
                C2982c cVar = new C2982c();
                C2872b a = C2872b.m8749a(this.f5686a, this.f5693h, c, p);
                C3045a aVar = new C3045a(this.f5686a);
                C2866a aVar2 = new C2866a(this.f5694i, new C2936a());
                C2857b f3 = C2857b.m8687f();
                f3.mo17130b("Installer package name is: " + a.f5534c);
                this.f5692g = new C2898j(this.f5686a, this.f5696k, cVar, this.f5693h, this.f5688c, iVar, this.f5691f, a, (C3000a) null, (C3001b.C3003b) null, this.f5697l, aVar, aVar2, this.f5694i, eVar);
                boolean e = mo17264e();
                m8987d();
                this.f5692g.mo17208N(Thread.getDefaultUncaughtExceptionHandler(), eVar);
                if (!e || !C2884h.m8806c(this.f5686a)) {
                    C2857b.m8687f().mo17130b("Exception handling initialization successful");
                    return true;
                }
                C2857b.m8687f().mo17130b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                m8989h(eVar);
                return false;
            } catch (Exception e2) {
                C2857b.m8687f().mo17133e("Crashlytics was not started due to an exception during initialization", e2);
                this.f5692g = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }

    /* renamed from: p */
    public void mo17271p(String str, String str2) {
        this.f5692g.mo17222u0(str, str2);
    }

    /* renamed from: q */
    public void mo17272q(String str) {
        this.f5692g.mo17223v0(str);
    }
}
