package com.google.firebase.crashlytics.internal.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.C1872a;
import com.google.android.gms.tasks.C1874c;
import com.google.firebase.crashlytics.internal.common.C2208c0;
import com.google.firebase.crashlytics.internal.common.C2247p;
import com.google.firebase.crashlytics.internal.common.C2248q;
import com.google.firebase.crashlytics.internal.common.C2254t;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p029e1.C3146b;
import p033f1.C3160f;
import p065m0.C3338f;
import p065m0.C3339g;
import p118y0.C3916f;

/* renamed from: com.google.firebase.crashlytics.internal.settings.e */
public class C2398e implements C2402h {

    /* renamed from: a */
    private final Context f4007a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2403i f4008b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2400f f4009c;

    /* renamed from: d */
    private final C2247p f4010d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2392a f4011e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2404j f4012f;

    /* renamed from: g */
    private final C2248q f4013g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AtomicReference<C2395d> f4014h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicReference<C1872a<C2395d>> f4015i = new AtomicReference<>(new C1872a());

    /* renamed from: com.google.firebase.crashlytics.internal.settings.e$a */
    class C2399a implements C3338f<Void, Void> {
        C2399a() {
        }

        @NonNull
        /* renamed from: b */
        public C3339g<Void> mo18568a(@Nullable Void voidR) {
            JSONObject a = C2398e.this.f4012f.mo18967a(C2398e.this.f4008b, true);
            if (a != null) {
                C2395d b = C2398e.this.f4009c.mo18978b(a);
                C2398e.this.f4011e.mo18965c(b.f3999c, a);
                C2398e.this.m6368q(a, "Loaded settings: ");
                C2398e eVar = C2398e.this;
                boolean unused = eVar.m6369r(eVar.f4008b.f4023f);
                C2398e.this.f4014h.set(b);
                ((C1872a) C2398e.this.f4015i.get()).mo14740e(b);
            }
            return C1874c.m4951e(null);
        }
    }

    C2398e(Context context, C2403i iVar, C2247p pVar, C2400f fVar, C2392a aVar, C2404j jVar, C2248q qVar) {
        AtomicReference<C2395d> atomicReference = new AtomicReference<>();
        this.f4014h = atomicReference;
        this.f4007a = context;
        this.f4008b = iVar;
        this.f4010d = pVar;
        this.f4009c = fVar;
        this.f4011e = aVar;
        this.f4012f = jVar;
        this.f4013g = qVar;
        atomicReference.set(C2393b.m6346b(pVar));
    }

    /* renamed from: l */
    public static C2398e m6365l(Context context, String str, C2254t tVar, C3146b bVar, String str2, String str3, C3160f fVar, C2248q qVar) {
        String g = tVar.mo18613g();
        C2208c0 c0Var = new C2208c0();
        C2400f fVar2 = new C2400f(c0Var);
        C2392a aVar = new C2392a(fVar);
        C2394c cVar = new C2394c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{str}), bVar);
        String h = tVar.mo18614h();
        String i = tVar.mo18615i();
        String j = tVar.mo18616j();
        String h2 = CommonUtils.m5539h(CommonUtils.m5545n(context), str, str3, str2);
        return new C2398e(context, new C2403i(str, h, i, j, tVar, h2, str3, str2, DeliveryMechanism.determineFrom(g).getId()), c0Var, fVar2, aVar, cVar, qVar);
    }

    /* renamed from: m */
    private C2395d m6366m(SettingsCacheBehavior settingsCacheBehavior) {
        C2395d dVar = null;
        try {
            if (SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                return null;
            }
            JSONObject b = this.f4011e.mo18964b();
            if (b != null) {
                C2395d b2 = this.f4009c.mo18978b(b);
                if (b2 != null) {
                    m6368q(b, "Loaded cached settings: ");
                    long a = this.f4010d.mo18532a();
                    if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior)) {
                        if (b2.mo18971a(a)) {
                            C3916f.m11190f().mo26405i("Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        C3916f.m11190f().mo26405i("Returning cached settings.");
                        return b2;
                    } catch (Exception e) {
                        e = e;
                        dVar = b2;
                        C3916f.m11190f().mo26402e("Failed to get cached settings", e);
                        return dVar;
                    }
                } else {
                    C3916f.m11190f().mo26402e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                C3916f.m11190f().mo26399b("No cached settings data found.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            C3916f.m11190f().mo26402e("Failed to get cached settings", e);
            return dVar;
        }
    }

    /* renamed from: n */
    private String m6367n() {
        return CommonUtils.m5549r(this.f4007a).getString("existing_instance_identifier", "");
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m6368q(JSONObject jSONObject, String str) {
        C3916f f = C3916f.m11190f();
        f.mo26399b(str + jSONObject.toString());
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: r */
    public boolean m6369r(String str) {
        SharedPreferences.Editor edit = CommonUtils.m5549r(this.f4007a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    /* renamed from: a */
    public C3339g<C2395d> mo18972a() {
        return this.f4015i.get().mo14736a();
    }

    /* renamed from: b */
    public C2395d mo18973b() {
        return this.f4014h.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo18974k() {
        return !m6367n().equals(this.f4008b.f4023f);
    }

    /* renamed from: o */
    public C3339g<Void> mo18975o(SettingsCacheBehavior settingsCacheBehavior, Executor executor) {
        C2395d m;
        if (mo18974k() || (m = m6366m(settingsCacheBehavior)) == null) {
            C2395d m2 = m6366m(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
            if (m2 != null) {
                this.f4014h.set(m2);
                this.f4015i.get().mo14740e(m2);
            }
            return this.f4013g.mo18609h(executor).mo14772o(executor, new C2399a());
        }
        this.f4014h.set(m);
        this.f4015i.get().mo14740e(m);
        return C1874c.m4951e(null);
    }

    /* renamed from: p */
    public C3339g<Void> mo18976p(Executor executor) {
        return mo18975o(SettingsCacheBehavior.USE_CACHE, executor);
    }
}
