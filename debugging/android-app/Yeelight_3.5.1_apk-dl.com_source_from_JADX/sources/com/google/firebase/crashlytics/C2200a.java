package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.C1874c;
import com.google.firebase.C2406d;
import com.google.firebase.crashlytics.internal.common.C2203a;
import com.google.firebase.crashlytics.internal.common.C2237k;
import com.google.firebase.crashlytics.internal.common.C2248q;
import com.google.firebase.crashlytics.internal.common.C2249r;
import com.google.firebase.crashlytics.internal.common.C2254t;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.settings.C2398e;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p029e1.C3146b;
import p033f1.C3160f;
import p065m0.C3333a;
import p065m0.C3339g;
import p077o1.C3500a;
import p081p1.C3595c;
import p106v0.C3730a;
import p114x0.C3898d;
import p118y0.C3909a;
import p118y0.C3910d;
import p118y0.C3913e;
import p118y0.C3916f;

/* renamed from: com.google.firebase.crashlytics.a */
public class C2200a {
    @VisibleForTesting

    /* renamed from: a */
    final C2237k f3507a;

    /* renamed from: com.google.firebase.crashlytics.a$a */
    class C2201a implements C3333a<Void, Object> {
        C2201a() {
        }

        /* renamed from: a */
        public Object mo18508a(@NonNull C3339g<Void> gVar) {
            if (gVar.mo14771n()) {
                return null;
            }
            C3916f.m11190f().mo26402e("Error fetching settings.", gVar.mo14767j());
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.a$b */
    class C2202b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ boolean f3508a;

        /* renamed from: b */
        final /* synthetic */ C2237k f3509b;

        /* renamed from: c */
        final /* synthetic */ C2398e f3510c;

        C2202b(boolean z, C2237k kVar, C2398e eVar) {
            this.f3508a = z;
            this.f3509b = kVar;
            this.f3510c = eVar;
        }

        /* renamed from: a */
        public Void call() {
            if (!this.f3508a) {
                return null;
            }
            this.f3509b.mo18583g(this.f3510c);
            return null;
        }
    }

    private C2200a(@NonNull C2237k kVar) {
        this.f3507a = kVar;
    }

    @NonNull
    /* renamed from: a */
    public static C2200a m5521a() {
        C2200a aVar = (C2200a) C2406d.m6394k().mo18982i(C2200a.class);
        Objects.requireNonNull(aVar, "FirebaseCrashlytics component is not present.");
        return aVar;
    }

    @Nullable
    /* renamed from: b */
    static C2200a m5522b(@NonNull C2406d dVar, @NonNull C3595c cVar, @NonNull C3500a<C3909a> aVar, @NonNull C3500a<C3730a> aVar2) {
        Context j = dVar.mo18983j();
        String packageName = j.getPackageName();
        C3916f f = C3916f.m11190f();
        f.mo26403g("Initializing Firebase Crashlytics " + C2237k.m5699i() + " for " + packageName);
        C3160f fVar = new C3160f(j);
        C2248q qVar = new C2248q(dVar);
        C2254t tVar = new C2254t(j, packageName, cVar, qVar);
        C3910d dVar2 = new C3910d(aVar);
        C3898d dVar3 = new C3898d(aVar2);
        C2406d dVar4 = dVar;
        C2254t tVar2 = tVar;
        C2248q qVar2 = qVar;
        C2237k kVar = new C2237k(dVar4, tVar2, dVar2, qVar2, dVar3.mo26381e(), dVar3.mo26380d(), fVar, C2249r.m5759c("Crashlytics Exception Handler"));
        String c = dVar.mo18985m().mo19045c();
        String n = CommonUtils.m5545n(j);
        C3916f f2 = C3916f.m11190f();
        f2.mo26399b("Mapping file ID is: " + n);
        try {
            C2203a a = C2203a.m5558a(j, tVar, c, n, new C3913e(j));
            C3916f f3 = C3916f.m11190f();
            f3.mo26405i("Installer package name is: " + a.f3516c);
            ExecutorService c2 = C2249r.m5759c("com.google.firebase.crashlytics.startup");
            C2398e l = C2398e.m6365l(j, c, tVar, new C3146b(), a.f3518e, a.f3519f, fVar, qVar);
            l.mo18976p(c2).mo14764g(c2, new C2201a());
            C1874c.m4949c(c2, new C2202b(kVar.mo18588o(a, l), kVar, l));
            return new C2200a(kVar);
        } catch (PackageManager.NameNotFoundException e) {
            C3916f.m11190f().mo26402e("Error retrieving app package info.", e);
            return null;
        }
    }

    /* renamed from: c */
    public void mo18504c(@NonNull Throwable th) {
        if (th == null) {
            C3916f.m11190f().mo26407k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f3507a.mo18585l(th);
        }
    }

    /* renamed from: d */
    public void mo18505d(@NonNull String str, long j) {
        this.f3507a.mo18589p(str, Long.toString(j));
    }

    /* renamed from: e */
    public void mo18506e(@NonNull String str, @NonNull String str2) {
        this.f3507a.mo18589p(str, str2);
    }

    /* renamed from: f */
    public void mo18507f(@NonNull String str) {
        this.f3507a.mo18590q(str);
    }
}
