package com.google.firebase.crashlytics.p110c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.C2816c;
import com.google.firebase.crashlytics.p110c.p112g.C2884h;
import com.google.firebase.crashlytics.p110c.p112g.C2935k;
import com.google.firebase.crashlytics.p110c.p112g.C2947q;
import com.google.firebase.crashlytics.p110c.p112g.C2949s;
import com.google.firebase.crashlytics.p110c.p112g.C2955v;
import com.google.firebase.crashlytics.p110c.p115j.C2982c;
import com.google.firebase.crashlytics.p110c.p122o.C3021c;
import com.google.firebase.crashlytics.p110c.p122o.C3022d;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3028a;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3029b;
import com.google.firebase.crashlytics.p110c.p122o.p124j.C3036b;
import com.google.firebase.crashlytics.p110c.p122o.p124j.C3039e;
import com.miot.service.manager.timer.TimerCodec;
import java.util.concurrent.Executor;
import p011c.p012a.p019b.p028b.p038e.C0608a;
import p011c.p012a.p019b.p028b.p038e.C0618g;
import p011c.p012a.p019b.p028b.p038e.C0619h;

/* renamed from: com.google.firebase.crashlytics.c.e */
public class C2862e {

    /* renamed from: a */
    private final C2982c f5505a = new C2982c();

    /* renamed from: b */
    private final C2816c f5506b;

    /* renamed from: c */
    private final Context f5507c;

    /* renamed from: d */
    private PackageManager f5508d;

    /* renamed from: e */
    private String f5509e;

    /* renamed from: f */
    private PackageInfo f5510f;

    /* renamed from: g */
    private String f5511g;

    /* renamed from: h */
    private String f5512h;

    /* renamed from: i */
    private String f5513i;

    /* renamed from: j */
    private String f5514j;

    /* renamed from: k */
    private String f5515k;

    /* renamed from: l */
    private C2955v f5516l;

    /* renamed from: m */
    private C2947q f5517m;

    /* renamed from: com.google.firebase.crashlytics.c.e$a */
    class C2863a implements C0618g<C3029b, Void> {

        /* renamed from: a */
        final /* synthetic */ String f5518a;

        /* renamed from: b */
        final /* synthetic */ C3022d f5519b;

        /* renamed from: c */
        final /* synthetic */ Executor f5520c;

        C2863a(String str, C3022d dVar, Executor executor) {
            this.f5518a = str;
            this.f5519b = dVar;
            this.f5520c = executor;
        }

        @NonNull
        /* renamed from: b */
        public C0619h<Void> mo8665a(@Nullable C3029b bVar) {
            try {
                C2862e.this.m8722i(bVar, this.f5518a, this.f5519b, this.f5520c, true);
                return null;
            } catch (Exception e) {
                C2857b.m8687f().mo17133e("Error performing auto configuration.", e);
                throw e;
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.e$b */
    class C2864b implements C0618g<Void, C3029b> {

        /* renamed from: a */
        final /* synthetic */ C3022d f5522a;

        C2864b(C2862e eVar, C3022d dVar) {
            this.f5522a = dVar;
        }

        @NonNull
        /* renamed from: b */
        public C0619h<C3029b> mo8665a(@Nullable Void voidR) {
            return this.f5522a.mo17412a();
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.e$c */
    class C2865c implements C0608a<Void, Object> {
        C2865c(C2862e eVar) {
        }

        /* renamed from: a */
        public Object mo8634a(@NonNull C0619h<Void> hVar) {
            if (hVar.mo8654o()) {
                return null;
            }
            C2857b.m8687f().mo17133e("Error fetching settings.", hVar.mo8649j());
            return null;
        }
    }

    public C2862e(C2816c cVar, Context context, C2955v vVar, C2947q qVar) {
        this.f5506b = cVar;
        this.f5507c = context;
        this.f5516l = vVar;
        this.f5517m = qVar;
    }

    /* renamed from: b */
    private C3028a m8719b(String str, String str2) {
        return new C3028a(str, str2, m8720e().mo17295d(), this.f5512h, this.f5511g, C2884h.m8811h(C2884h.m8819p(mo17146d()), str2, this.f5512h, this.f5511g), this.f5514j, C2949s.m9042a(this.f5513i).mo17291b(), this.f5515k, TimerCodec.DISENABLE);
    }

    /* renamed from: e */
    private C2955v m8720e() {
        return this.f5516l;
    }

    /* renamed from: g */
    private static String m8721g() {
        return C2935k.m8990i();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m8722i(C3029b bVar, String str, C3022d dVar, Executor executor, boolean z) {
        if ("new".equals(bVar.f5896a)) {
            if (!m8723j(bVar, str, z)) {
                C2857b.m8687f().mo17133e("Failed to create app with Crashlytics service.", (Throwable) null);
                return;
            }
        } else if (!"configured".equals(bVar.f5896a)) {
            if (bVar.f5901f) {
                C2857b.m8687f().mo17130b("Server says an update is required - forcing a full App update.");
                m8724k(bVar, str, z);
                return;
            }
            return;
        }
        dVar.mo17415o(C3021c.SKIP_CACHE_LOOKUP, executor);
    }

    /* renamed from: j */
    private boolean m8723j(C3029b bVar, String str, boolean z) {
        return new C3036b(mo17147f(), bVar.f5897b, this.f5505a, m8721g()).mo17424i(m8719b(bVar.f5900e, str), z);
    }

    /* renamed from: k */
    private boolean m8724k(C3029b bVar, String str, boolean z) {
        return new C3039e(mo17147f(), bVar.f5897b, this.f5505a, m8721g()).mo17424i(m8719b(bVar.f5900e, str), z);
    }

    /* renamed from: c */
    public void mo17145c(Executor executor, C3022d dVar) {
        this.f5517m.mo17290d().mo8656q(executor, new C2864b(this, dVar)).mo8656q(executor, new C2863a(this.f5506b.mo17064j().mo17742c(), dVar, executor));
    }

    /* renamed from: d */
    public Context mo17146d() {
        return this.f5507c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo17147f() {
        return C2884h.m8824u(this.f5507c, "com.crashlytics.ApiEndpoint");
    }

    /* renamed from: h */
    public boolean mo17148h() {
        try {
            this.f5513i = this.f5516l.mo17296e();
            this.f5508d = this.f5507c.getPackageManager();
            String packageName = this.f5507c.getPackageName();
            this.f5509e = packageName;
            PackageInfo packageInfo = this.f5508d.getPackageInfo(packageName, 0);
            this.f5510f = packageInfo;
            this.f5511g = Integer.toString(packageInfo.versionCode);
            this.f5512h = this.f5510f.versionName == null ? "0.0" : this.f5510f.versionName;
            this.f5514j = this.f5508d.getApplicationLabel(this.f5507c.getApplicationInfo()).toString();
            this.f5515k = Integer.toString(this.f5507c.getApplicationInfo().targetSdkVersion);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            C2857b.m8687f().mo17133e("Failed init", e);
            return false;
        }
    }

    /* renamed from: l */
    public C3022d mo17149l(Context context, C2816c cVar, Executor executor) {
        C3022d l = C3022d.m9361l(context, cVar.mo17064j().mo17742c(), this.f5516l, this.f5505a, this.f5511g, this.f5512h, mo17147f(), this.f5517m);
        l.mo17416p(executor).mo8647h(executor, new C2865c(this));
        return l;
    }
}
