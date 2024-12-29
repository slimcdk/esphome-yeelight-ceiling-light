package com.google.firebase.crashlytics.p110c.p112g;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.C3165v;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p113h.C2962b;
import com.google.firebase.crashlytics.p110c.p116k.C2990g;
import com.google.firebase.crashlytics.p110c.p116k.C2991h;
import com.google.firebase.crashlytics.p110c.p121n.C3018c;
import com.google.firebase.crashlytics.p110c.p122o.C3024e;
import com.google.firebase.crashlytics.p110c.p125p.C3043d;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p011c.p012a.p019b.p028b.p038e.C0619h;

/* renamed from: com.google.firebase.crashlytics.c.g.e0 */
class C2879e0 {

    /* renamed from: a */
    private final C2942m f5544a;

    /* renamed from: b */
    private final C2990g f5545b;

    /* renamed from: c */
    private final C3018c f5546c;

    /* renamed from: d */
    private final C2962b f5547d;

    /* renamed from: e */
    private final C2883g0 f5548e;
    @Nullable

    /* renamed from: f */
    private String f5549f;

    C2879e0(C2942m mVar, C2990g gVar, C3018c cVar, C2962b bVar, C2883g0 g0Var) {
        this.f5544a = mVar;
        this.f5545b = gVar;
        this.f5546c = cVar;
        this.f5547d = bVar;
        this.f5548e = g0Var;
    }

    /* renamed from: b */
    public static C2879e0 m8763b(Context context, C2955v vVar, C2991h hVar, C2872b bVar, C2962b bVar2, C2883g0 g0Var, C3043d dVar, C3024e eVar) {
        return new C2879e0(new C2942m(context, vVar, bVar, dVar), new C2990g(new File(hVar.mo17357a()), eVar), C3018c.m9339a(context), bVar2, g0Var);
    }

    @NonNull
    /* renamed from: e */
    private static List<CrashlyticsReport.C3048b> m8764e(@NonNull Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            CrashlyticsReport.C3048b.C3049a a = CrashlyticsReport.C3048b.m9433a();
            a.mo17455b((String) next.getKey());
            a.mo17456c((String) next.getValue());
            arrayList.add(a.mo17454a());
        }
        Collections.sort(arrayList, C2877d0.m8756a());
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m8766i(@NonNull C0619h<C2943n> hVar) {
        if (hVar.mo8654o()) {
            C2943n k = hVar.mo8650k();
            C2857b f = C2857b.m8687f();
            f.mo17130b("Crashlytics report successfully enqueued to DataTransport: " + k.mo17160c());
            this.f5545b.mo17353i(k.mo17160c());
            return true;
        }
        C2857b.m8687f().mo17131c("Crashlytics report could not be enqueued to DataTransport", hVar.mo8649j());
        return false;
    }

    /* renamed from: j */
    private void m8767j(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j, boolean z) {
        String str2 = this.f5549f;
        if (str2 == null) {
            C2857b.m8687f().mo17130b("Cannot persist event, no currently open session");
            return;
        }
        boolean equals = str.equals("crash");
        CrashlyticsReport.C3054d.C3061d b = this.f5544a.mo17283b(th, thread, str, j, 4, 8, z);
        CrashlyticsReport.C3054d.C3061d.C3076b g = b.mo17530g();
        String d = this.f5547d.mo17314d();
        if (d != null) {
            CrashlyticsReport.C3054d.C3061d.C3079d.C3080a a = CrashlyticsReport.C3054d.C3061d.C3079d.m9612a();
            a.mo17618b(d);
            g.mo17600d(a.mo17617a());
        } else {
            C2857b.m8687f().mo17130b("No log data to include with this event.");
        }
        List<CrashlyticsReport.C3048b> e = m8764e(this.f5548e.mo17183a());
        if (!e.isEmpty()) {
            CrashlyticsReport.C3054d.C3061d.C3062a.C3063a f = b.mo17525b().mo17535f();
            f.mo17538c(C3165v.m9862c(e));
            g.mo17598b(f.mo17536a());
        }
        this.f5545b.mo17349B(g.mo17597a(), str2, equals);
    }

    /* renamed from: c */
    public void mo17169c(@NonNull String str, @NonNull List<C2960z> list) {
        ArrayList arrayList = new ArrayList();
        for (C2960z c : list) {
            CrashlyticsReport.C3050c.C3052b c2 = c.mo17180c();
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        C2990g gVar = this.f5545b;
        CrashlyticsReport.C3050c.C3051a a = CrashlyticsReport.C3050c.m9439a();
        a.mo17460b(C3165v.m9862c(arrayList));
        gVar.mo17355k(str, a.mo17459a());
    }

    /* renamed from: d */
    public void mo17170d(long j) {
        this.f5545b.mo17354j(this.f5549f, j);
    }

    /* renamed from: g */
    public void mo17171g(@NonNull String str, long j) {
        this.f5549f = str;
        this.f5545b.mo17350C(this.f5544a.mo17284c(str, j));
    }

    /* renamed from: h */
    public void mo17172h() {
        this.f5549f = null;
    }

    /* renamed from: k */
    public void mo17173k(@NonNull Throwable th, @NonNull Thread thread, long j) {
        m8767j(th, thread, "crash", j, true);
    }

    /* renamed from: l */
    public void mo17174l(@NonNull Throwable th, @NonNull Thread thread, long j) {
        m8767j(th, thread, XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, j, false);
    }

    /* renamed from: m */
    public void mo17175m() {
        String str = this.f5549f;
        if (str == null) {
            C2857b.m8687f().mo17130b("Could not persist user ID; no current session");
            return;
        }
        String b = this.f5548e.mo17184b();
        if (b == null) {
            C2857b.m8687f().mo17130b("Could not persist user ID; no user ID available");
        } else {
            this.f5545b.mo17351D(b, str);
        }
    }

    /* renamed from: n */
    public void mo17176n() {
        this.f5545b.mo17352h();
    }

    /* renamed from: o */
    public void mo17177o(@NonNull Executor executor, @NonNull C2948r rVar) {
        if (rVar == C2948r.NONE) {
            C2857b.m8687f().mo17130b("Send via DataTransport disabled. Removing DataTransport reports.");
            this.f5545b.mo17352h();
            return;
        }
        for (C2943n next : this.f5545b.mo17356y()) {
            if (next.mo17159b().mo17438k() != CrashlyticsReport.C3085e.NATIVE || rVar == C2948r.ALL) {
                this.f5546c.mo17408e(next).mo8647h(executor, C2875c0.m8753b(this));
            } else {
                C2857b.m8687f().mo17130b("Send native reports via DataTransport disabled. Removing DataTransport reports.");
                this.f5545b.mo17353i(next.mo17160c());
            }
        }
    }
}
