package com.google.firebase.crashlytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.C2816c;
import com.google.firebase.analytics.p109a.C2801a;
import com.google.firebase.crashlytics.p110c.C2856a;
import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.C2858c;
import com.google.firebase.crashlytics.p110c.C2862e;
import com.google.firebase.crashlytics.p110c.p112g.C2935k;
import com.google.firebase.crashlytics.p110c.p112g.C2947q;
import com.google.firebase.crashlytics.p110c.p112g.C2950t;
import com.google.firebase.crashlytics.p110c.p112g.C2955v;
import com.google.firebase.crashlytics.p110c.p122o.C3022d;
import com.google.firebase.iid.p134b.C3207a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p011c.p012a.p019b.p028b.p038e.C0623k;

/* renamed from: com.google.firebase.crashlytics.b */
public class C2854b {

    /* renamed from: a */
    private final C2935k f5495a;

    /* renamed from: com.google.firebase.crashlytics.b$a */
    class C2855a implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ C2862e f5496a;

        /* renamed from: b */
        final /* synthetic */ ExecutorService f5497b;

        /* renamed from: c */
        final /* synthetic */ C3022d f5498c;

        /* renamed from: d */
        final /* synthetic */ boolean f5499d;

        /* renamed from: e */
        final /* synthetic */ C2935k f5500e;

        C2855a(C2862e eVar, ExecutorService executorService, C3022d dVar, boolean z, C2935k kVar) {
            this.f5496a = eVar;
            this.f5497b = executorService;
            this.f5498c = dVar;
            this.f5499d = z;
            this.f5500e = kVar;
        }

        /* renamed from: a */
        public Void call() {
            this.f5496a.mo17145c(this.f5497b, this.f5498c);
            if (!this.f5499d) {
                return null;
            }
            this.f5500e.mo17265g(this.f5498c);
            return null;
        }
    }

    private C2854b(@NonNull C2935k kVar) {
        this.f5495a = kVar;
    }

    @NonNull
    /* renamed from: a */
    public static C2854b m8671a() {
        C2854b bVar = (C2854b) C2816c.m8559h().mo17060f(C2854b.class);
        if (bVar != null) {
            return bVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @Nullable
    /* renamed from: b */
    static C2854b m8672b(@NonNull C2816c cVar, @NonNull C3207a aVar, @Nullable C2856a aVar2, @Nullable C2801a aVar3) {
        C2816c cVar2 = cVar;
        Context g = cVar.mo17061g();
        C2955v vVar = new C2955v(g, g.getPackageName(), aVar);
        C2947q qVar = new C2947q(cVar);
        C2858c cVar3 = aVar2 == null ? new C2858c() : aVar2;
        C2862e eVar = new C2862e(cVar, g, vVar, qVar);
        C2935k kVar = new C2935k(cVar, vVar, cVar3, qVar, aVar3);
        if (!eVar.mo17148h()) {
            C2857b.m8687f().mo17132d("Unable to start Crashlytics.");
            return null;
        }
        ExecutorService c = C2950t.m9046c("com.google.firebase.crashlytics.startup");
        C3022d l = eVar.mo17149l(g, cVar, c);
        C0623k.m536c(c, new C2855a(eVar, c, l, kVar.mo17270o(l), kVar));
        return new C2854b(kVar);
    }

    /* renamed from: c */
    public void mo17116c(@NonNull Throwable th) {
        if (th == null) {
            C2857b.m8687f().mo17136i("Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.f5495a.mo17267l(th);
        }
    }

    /* renamed from: d */
    public void mo17117d(@NonNull String str, long j) {
        this.f5495a.mo17271p(str, Long.toString(j));
    }

    /* renamed from: e */
    public void mo17118e(@NonNull String str, @NonNull String str2) {
        this.f5495a.mo17271p(str, str2);
    }

    /* renamed from: f */
    public void mo17119f(@NonNull String str) {
        this.f5495a.mo17272q(str);
    }
}
