package com.google.firebase.crashlytics.p110c.p122o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p112g.C2881f0;
import com.google.firebase.crashlytics.p110c.p112g.C2884h;
import com.google.firebase.crashlytics.p110c.p112g.C2946p;
import com.google.firebase.crashlytics.p110c.p112g.C2947q;
import com.google.firebase.crashlytics.p110c.p112g.C2949s;
import com.google.firebase.crashlytics.p110c.p112g.C2955v;
import com.google.firebase.crashlytics.p110c.p115j.C2982c;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3029b;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3032e;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3033f;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3034g;
import com.google.firebase.crashlytics.p110c.p122o.p124j.C3037c;
import com.google.firebase.crashlytics.p110c.p122o.p124j.C3038d;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p011c.p012a.p019b.p028b.p038e.C0618g;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0620i;
import p011c.p012a.p019b.p028b.p038e.C0623k;

/* renamed from: com.google.firebase.crashlytics.c.o.d */
public class C3022d implements C3024e {

    /* renamed from: a */
    private final Context f5875a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3034g f5876b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3025f f5877c;

    /* renamed from: d */
    private final C2946p f5878d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3019a f5879e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3038d f5880f;

    /* renamed from: g */
    private final C2947q f5881g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AtomicReference<C3032e> f5882h = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicReference<C0620i<C3029b>> f5883i = new AtomicReference<>(new C0620i());

    /* renamed from: com.google.firebase.crashlytics.c.o.d$a */
    class C3023a implements C0618g<Void, Void> {
        C3023a() {
        }

        @NonNull
        /* renamed from: b */
        public C0619h<Void> mo8665a(@Nullable Void voidR) {
            JSONObject a = C3022d.this.f5880f.mo17425a(C3022d.this.f5876b, true);
            if (a != null) {
                C3033f b = C3022d.this.f5877c.mo17418b(a);
                C3022d.this.f5879e.mo17410c(b.mo17422d(), a);
                C3022d.this.m9364q(a, "Loaded settings: ");
                C3022d dVar = C3022d.this;
                boolean unused = dVar.m9365r(dVar.f5876b.f5916f);
                C3022d.this.f5882h.set(b);
                ((C0620i) C3022d.this.f5883i.get()).mo8670e(b.mo17421c());
                C0620i iVar = new C0620i();
                iVar.mo8670e(b.mo17421c());
                C3022d.this.f5883i.set(iVar);
            }
            return C0623k.m538e(null);
        }
    }

    C3022d(Context context, C3034g gVar, C2946p pVar, C3025f fVar, C3019a aVar, C3038d dVar, C2947q qVar) {
        this.f5875a = context;
        this.f5876b = gVar;
        this.f5878d = pVar;
        this.f5877c = fVar;
        this.f5879e = aVar;
        this.f5880f = dVar;
        this.f5881g = qVar;
        this.f5882h.set(C3020b.m9350e(pVar));
    }

    /* renamed from: l */
    public static C3022d m9361l(Context context, String str, C2955v vVar, C2982c cVar, String str2, String str3, String str4, C2947q qVar) {
        String e = vVar.mo17296e();
        C2881f0 f0Var = new C2881f0();
        C3025f fVar = new C3025f(f0Var);
        C3019a aVar = new C3019a(context);
        String str5 = str4;
        C3037c cVar2 = new C3037c(str5, String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{str}), cVar);
        String f = vVar.mo17297f();
        String g = vVar.mo17298g();
        String h = vVar.mo17299h();
        String h2 = C2884h.m8811h(C2884h.m8819p(context), str, str3, str2);
        return new C3022d(context, new C3034g(str, f, g, h, vVar, h2, str3, str2, C2949s.m9042a(e).mo17291b()), f0Var, fVar, aVar, cVar2, qVar);
    }

    /* renamed from: m */
    private C3033f m9362m(C3021c cVar) {
        C2857b f;
        String str;
        C3033f fVar = null;
        try {
            if (C3021c.SKIP_CACHE_LOOKUP.equals(cVar)) {
                return null;
            }
            JSONObject b = this.f5879e.mo17409b();
            if (b != null) {
                C3033f b2 = this.f5877c.mo17418b(b);
                if (b2 != null) {
                    m9364q(b, "Loaded cached settings: ");
                    long a = this.f5878d.mo17181a();
                    if (!C3021c.IGNORE_CACHE_EXPIRATION.equals(cVar)) {
                        if (b2.mo17423e(a)) {
                            f = C2857b.m8687f();
                            str = "Cached settings have expired.";
                        }
                    }
                    try {
                        C2857b.m8687f().mo17130b("Returning cached settings.");
                        return b2;
                    } catch (Exception e) {
                        e = e;
                        fVar = b2;
                        C2857b.m8687f().mo17133e("Failed to get cached settings", e);
                        return fVar;
                    }
                } else {
                    C2857b.m8687f().mo17133e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                f = C2857b.m8687f();
                str = "No cached settings data found.";
            }
            f.mo17130b(str);
            return null;
        } catch (Exception e2) {
            e = e2;
            C2857b.m8687f().mo17133e("Failed to get cached settings", e);
            return fVar;
        }
    }

    /* renamed from: n */
    private String m9363n() {
        return C2884h.m8823t(this.f5875a).getString("existing_instance_identifier", "");
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m9364q(JSONObject jSONObject, String str) {
        C2857b f = C2857b.m8687f();
        f.mo17130b(str + jSONObject.toString());
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: r */
    public boolean m9365r(String str) {
        SharedPreferences.Editor edit = C2884h.m8823t(this.f5875a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    /* renamed from: a */
    public C0619h<C3029b> mo17412a() {
        return this.f5883i.get().mo8666a();
    }

    /* renamed from: b */
    public C3032e mo17413b() {
        return this.f5882h.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo17414k() {
        return !m9363n().equals(this.f5876b.f5916f);
    }

    /* renamed from: o */
    public C0619h<Void> mo17415o(C3021c cVar, Executor executor) {
        C3033f m;
        if (mo17414k() || (m = m9362m(cVar)) == null) {
            C3033f m2 = m9362m(C3021c.IGNORE_CACHE_EXPIRATION);
            if (m2 != null) {
                this.f5882h.set(m2);
                this.f5883i.get().mo8670e(m2.mo17421c());
            }
            return this.f5881g.mo17290d().mo8656q(executor, new C3023a());
        }
        this.f5882h.set(m);
        this.f5883i.get().mo8670e(m.mo17421c());
        return C0623k.m538e(null);
    }

    /* renamed from: p */
    public C0619h<Void> mo17416p(Executor executor) {
        return mo17415o(C3021c.USE_CACHE, executor);
    }
}
