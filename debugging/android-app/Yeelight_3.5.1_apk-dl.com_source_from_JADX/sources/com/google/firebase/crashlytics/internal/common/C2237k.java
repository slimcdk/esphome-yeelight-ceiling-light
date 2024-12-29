package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.C1874c;
import com.google.firebase.C2406d;
import com.google.firebase.crashlytics.internal.settings.C2402h;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p002a1.C0005b;
import p011b1.C0582c;
import p011b1.C0597i;
import p033f1.C3160f;
import p041h1.C3240a;
import p041h1.C3242c;
import p065m0.C3339g;
import p118y0.C3909a;
import p118y0.C3916f;
import p121z0.C3923a;

/* renamed from: com.google.firebase.crashlytics.internal.common.k */
public class C2237k {

    /* renamed from: a */
    private final Context f3597a;

    /* renamed from: b */
    private final C2248q f3598b;

    /* renamed from: c */
    private final C2259y f3599c = new C2259y();

    /* renamed from: d */
    private final long f3600d = System.currentTimeMillis();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2242l f3601e;

    /* renamed from: f */
    private C2242l f3602f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2224i f3603g;

    /* renamed from: h */
    private final C2254t f3604h;

    /* renamed from: i */
    private final C3160f f3605i;
    @VisibleForTesting

    /* renamed from: j */
    public final C0005b f3606j;

    /* renamed from: k */
    private final C3923a f3607k;

    /* renamed from: l */
    private final ExecutorService f3608l;

    /* renamed from: m */
    private final C2215g f3609m;

    /* renamed from: n */
    private final C3909a f3610n;

    /* renamed from: com.google.firebase.crashlytics.internal.common.k$a */
    class C2238a implements Callable<C3339g<Void>> {

        /* renamed from: a */
        final /* synthetic */ C2402h f3611a;

        C2238a(C2402h hVar) {
            this.f3611a = hVar;
        }

        /* renamed from: a */
        public C3339g<Void> call() {
            return C2237k.this.m5697f(this.f3611a);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.k$b */
    class C2239b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2402h f3613a;

        C2239b(C2402h hVar) {
            this.f3613a = hVar;
        }

        public void run() {
            C3339g unused = C2237k.this.m5697f(this.f3613a);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.k$c */
    class C2240c implements Callable<Boolean> {
        C2240c() {
        }

        /* renamed from: a */
        public Boolean call() {
            try {
                boolean d = C2237k.this.f3601e.mo18600d();
                if (!d) {
                    C3916f.m11190f().mo26407k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d);
            } catch (Exception e) {
                C3916f.m11190f().mo26402e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.k$d */
    class C2241d implements Callable<Boolean> {
        C2241d() {
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(C2237k.this.f3603g.mo18561s());
        }
    }

    public C2237k(C2406d dVar, C2254t tVar, C3909a aVar, C2248q qVar, C0005b bVar, C3923a aVar2, C3160f fVar, ExecutorService executorService) {
        this.f3598b = qVar;
        this.f3597a = dVar.mo18983j();
        this.f3604h = tVar;
        this.f3610n = aVar;
        this.f3606j = bVar;
        this.f3607k = aVar2;
        this.f3608l = executorService;
        this.f3605i = fVar;
        this.f3609m = new C2215g(executorService);
    }

    /* renamed from: d */
    private void m5696d() {
        try {
            Boolean.TRUE.equals((Boolean) C2220g0.m5622d(this.f3609m.mo18542h(new C2241d())));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public C3339g<Void> m5697f(C2402h hVar) {
        mo18587n();
        try {
            this.f3606j.mo5a(new C2236j(this));
            if (!hVar.mo18973b().f3998b.f4003a) {
                C3916f.m11190f().mo26399b("Collection of crash reports disabled in Crashlytics settings.");
                return C1874c.m4950d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f3603g.mo18564z(hVar)) {
                C3916f.m11190f().mo26407k("Previous sessions could not be finalized.");
            }
            C3339g<Void> Q = this.f3603g.mo18558Q(hVar.mo18972a());
            mo18586m();
            return Q;
        } catch (Exception e) {
            C3916f.m11190f().mo26402e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return C1874c.m4950d(e);
        } finally {
            mo18586m();
        }
    }

    /* renamed from: h */
    private void m5698h(C2402h hVar) {
        String str;
        C3916f fVar;
        Future<?> submit = this.f3608l.submit(new C2239b(hVar));
        C3916f.m11190f().mo26399b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
            return;
        } catch (InterruptedException e) {
            e = e;
            fVar = C3916f.m11190f();
            str = "Crashlytics was interrupted during initialization.";
        } catch (ExecutionException e2) {
            e = e2;
            fVar = C3916f.m11190f();
            str = "Crashlytics encountered a problem during initialization.";
        } catch (TimeoutException e3) {
            e = e3;
            fVar = C3916f.m11190f();
            str = "Crashlytics timed out during initialization.";
        }
        fVar.mo26402e(str, e);
    }

    /* renamed from: i */
    public static String m5699i() {
        return "18.2.11";
    }

    /* renamed from: j */
    static boolean m5700j(String str, boolean z) {
        if (z) {
            return !TextUtils.isEmpty(str);
        }
        C3916f.m11190f().mo26405i("Configured not to require a build ID.");
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo18582e() {
        return this.f3601e.mo18599c();
    }

    /* renamed from: g */
    public C3339g<Void> mo18583g(C2402h hVar) {
        return C2220g0.m5623e(this.f3608l, new C2238a(hVar));
    }

    /* renamed from: k */
    public void mo18584k(String str) {
        this.f3603g.mo18560U(System.currentTimeMillis() - this.f3600d, str);
    }

    /* renamed from: l */
    public void mo18585l(@NonNull Throwable th) {
        this.f3603g.mo18559T(Thread.currentThread(), th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo18586m() {
        this.f3609m.mo18542h(new C2240c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo18587n() {
        this.f3609m.mo18539b();
        this.f3601e.mo18598a();
        C3916f.m11190f().mo26405i("Initialization marker file was created.");
    }

    /* renamed from: o */
    public boolean mo18588o(C2203a aVar, C2402h hVar) {
        C2402h hVar2 = hVar;
        if (m5700j(aVar.f3515b, CommonUtils.m5542k(this.f3597a, "com.crashlytics.RequireBuildId", true))) {
            String fVar = new C2213f(this.f3604h).toString();
            try {
                this.f3602f = new C2242l("crash_marker", this.f3605i);
                this.f3601e = new C2242l("initialization_marker", this.f3605i);
                C0597i iVar = new C0597i(fVar, this.f3605i, this.f3609m);
                C0582c cVar = new C0582c(this.f3605i);
                C2203a aVar2 = aVar;
                C0582c cVar2 = cVar;
                C0597i iVar2 = iVar;
                C2206b0 g = C2206b0.m5569g(this.f3597a, this.f3604h, this.f3605i, aVar2, cVar2, iVar2, new C3240a(1024, new C3242c(10)), hVar, this.f3599c);
                Context context = this.f3597a;
                C2215g gVar = this.f3609m;
                C2254t tVar = this.f3604h;
                C2248q qVar = this.f3598b;
                C3160f fVar2 = this.f3605i;
                C2242l lVar = this.f3602f;
                C0597i iVar3 = iVar;
                Context context2 = context;
                String str = fVar;
                C2215g gVar2 = gVar;
                C2254t tVar2 = tVar;
                C2248q qVar2 = qVar;
                C3160f fVar3 = fVar2;
                C2242l lVar2 = lVar;
                C2203a aVar3 = aVar;
                this.f3603g = new C2224i(context2, gVar2, tVar2, qVar2, fVar3, lVar2, aVar3, iVar3, cVar, g, this.f3610n, this.f3607k);
                boolean e = mo18582e();
                m5696d();
                this.f3603g.mo18563x(str, Thread.getDefaultUncaughtExceptionHandler(), hVar2);
                if (!e || !CommonUtils.m5534c(this.f3597a)) {
                    C3916f.m11190f().mo26399b("Successfully configured exception handler.");
                    return true;
                }
                C3916f.m11190f().mo26399b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                m5698h(hVar2);
                return false;
            } catch (Exception e2) {
                C3916f.m11190f().mo26402e("Crashlytics was not started due to an exception during initialization", e2);
                this.f3603g = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }

    /* renamed from: p */
    public void mo18589p(String str, String str2) {
        this.f3603g.mo18556O(str, str2);
    }

    /* renamed from: q */
    public void mo18590q(String str) {
        this.f3603g.mo18557P(str);
    }
}
