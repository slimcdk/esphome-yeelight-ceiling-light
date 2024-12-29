package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.C1874c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.C2402h;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p011b1.C0582c;
import p011b1.C0597i;
import p015c1.C0628a;
import p033f1.C3159e;
import p033f1.C3160f;
import p037g1.C3216b;
import p041h1.C3243d;
import p065m0.C3339g;
import p118y0.C3916f;

/* renamed from: com.google.firebase.crashlytics.internal.common.b0 */
public class C2206b0 {

    /* renamed from: a */
    private final C2243m f3525a;

    /* renamed from: b */
    private final C3159e f3526b;

    /* renamed from: c */
    private final C3216b f3527c;

    /* renamed from: d */
    private final C0582c f3528d;

    /* renamed from: e */
    private final C0597i f3529e;

    C2206b0(C2243m mVar, C3159e eVar, C3216b bVar, C0582c cVar, C0597i iVar) {
        this.f3525a = mVar;
        this.f3526b = eVar;
        this.f3527c = bVar;
        this.f3528d = cVar;
        this.f3529e = iVar;
    }

    /* renamed from: c */
    private CrashlyticsReport.C2270e.C2277d m5565c(CrashlyticsReport.C2270e.C2277d dVar) {
        return m5566d(dVar, this.f3528d, this.f3529e);
    }

    /* renamed from: d */
    private CrashlyticsReport.C2270e.C2277d m5566d(CrashlyticsReport.C2270e.C2277d dVar, C0582c cVar, C0597i iVar) {
        CrashlyticsReport.C2270e.C2277d.C2292b g = dVar.mo18742g();
        String c = cVar.mo10933c();
        if (c != null) {
            g.mo18816d(CrashlyticsReport.C2270e.C2277d.C2295d.m6020a().mo18834b(c).mo18833a());
        } else {
            C3916f.m11190f().mo26405i("No log data to include with this event.");
        }
        List<CrashlyticsReport.C2264c> k = m5571k(iVar.mo10959e());
        List<CrashlyticsReport.C2264c> k2 = m5571k(iVar.mo10960f());
        if (!k.isEmpty() || !k2.isEmpty()) {
            g.mo18814b(dVar.mo18737b().mo18748g().mo18751c(C0628a.m237b(k)).mo18753e(C0628a.m237b(k2)).mo18749a());
        }
        return g.mo18813a();
    }

    @RequiresApi(api = 30)
    /* renamed from: e */
    private static CrashlyticsReport.C2261a m5567e(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = m5568f(traceInputStream);
            }
        } catch (IOException e) {
            C3916f f = C3916f.m11190f();
            f.mo26407k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return CrashlyticsReport.C2261a.m5806a().mo18643b(applicationExitInfo.getImportance()).mo18645d(applicationExitInfo.getProcessName()).mo18647f(applicationExitInfo.getReason()).mo18649h(applicationExitInfo.getTimestamp()).mo18644c(applicationExitInfo.getPid()).mo18646e(applicationExitInfo.getPss()).mo18648g(applicationExitInfo.getRss()).mo18650i(str).mo18642a();
    }

    @RequiresApi(api = 19)
    @VisibleForTesting
    /* renamed from: f */
    public static String m5568f(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: g */
    public static C2206b0 m5569g(Context context, C2254t tVar, C3160f fVar, C2203a aVar, C0582c cVar, C0597i iVar, C3243d dVar, C2402h hVar, C2259y yVar) {
        return new C2206b0(new C2243m(context, tVar, aVar, dVar), new C3159e(fVar, hVar), C3216b.m8647b(context, hVar, yVar), cVar, iVar);
    }

    @RequiresApi(api = 30)
    @Nullable
    /* renamed from: j */
    private ApplicationExitInfo m5570j(String str, List<ApplicationExitInfo> list) {
        long q = this.f3526b.mo23651q(str);
        for (ApplicationExitInfo next : list) {
            if (next.getTimestamp() < q) {
                return null;
            }
            if (next.getReason() == 6) {
                return next;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: k */
    private static List<CrashlyticsReport.C2264c> m5571k(@NonNull Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(CrashlyticsReport.C2264c.m5833a().mo18663b((String) next.getKey()).mo18664c((String) next.getValue()).mo18662a());
        }
        Collections.sort(arrayList, C2260z.f3658a);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public boolean m5573p(@NonNull C3339g<C2244n> gVar) {
        if (gVar.mo14771n()) {
            C2244n k = gVar.mo14768k();
            C3916f f = C3916f.m11190f();
            f.mo26399b("Crashlytics report successfully enqueued to DataTransport: " + k.mo18515d());
            File c = k.mo18514c();
            if (c.delete()) {
                C3916f f2 = C3916f.m11190f();
                f2.mo26399b("Deleted report file: " + c.getPath());
                return true;
            }
            C3916f f3 = C3916f.m11190f();
            f3.mo26407k("Crashlytics could not delete report file: " + c.getPath());
            return true;
        }
        C3916f.m11190f().mo26408l("Crashlytics report could not be enqueued to DataTransport", gVar.mo14767j());
        return false;
    }

    /* renamed from: q */
    private void m5574q(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, @NonNull String str2, long j, boolean z) {
        boolean equals = str2.equals("crash");
        CrashlyticsReport.C2270e.C2277d c = this.f3525a.mo18602c(th, thread, str2, j, 4, 8, z);
        String str3 = str;
        this.f3526b.mo23654y(m5565c(c), str, equals);
    }

    /* renamed from: h */
    public void mo18519h(@NonNull String str, @NonNull List<C2257w> list) {
        C3916f.m11190f().mo26399b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (C2257w c : list) {
            CrashlyticsReport.C2266d.C2268b c2 = c.mo18537c();
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        this.f3526b.mo23649l(str, CrashlyticsReport.C2266d.m5839a().mo18668b(C0628a.m237b(arrayList)).mo18667a());
    }

    /* renamed from: i */
    public void mo18520i(long j, @Nullable String str) {
        this.f3526b.mo23648k(str, j);
    }

    /* renamed from: l */
    public boolean mo18521l() {
        return this.f3526b.mo23652r();
    }

    /* renamed from: n */
    public SortedSet<String> mo18522n() {
        return this.f3526b.mo23650p();
    }

    /* renamed from: o */
    public void mo18523o(@NonNull String str, long j) {
        this.f3526b.mo23655z(this.f3525a.mo18603d(str, j));
    }

    /* renamed from: r */
    public void mo18524r(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j) {
        C3916f f = C3916f.m11190f();
        f.mo26405i("Persisting fatal event for session " + str);
        m5574q(th, thread, str, "crash", j, true);
    }

    /* renamed from: s */
    public void mo18525s(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j) {
        C3916f f = C3916f.m11190f();
        f.mo26405i("Persisting non-fatal event for session " + str);
        m5574q(th, thread, str, XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, j, false);
    }

    @RequiresApi(api = 30)
    /* renamed from: t */
    public void mo18526t(String str, List<ApplicationExitInfo> list, C0582c cVar, C0597i iVar) {
        ApplicationExitInfo j = m5570j(str, list);
        if (j == null) {
            C3916f f = C3916f.m11190f();
            f.mo26405i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        CrashlyticsReport.C2270e.C2277d b = this.f3525a.mo18601b(m5567e(j));
        C3916f f2 = C3916f.m11190f();
        f2.mo26399b("Persisting anr for session " + str);
        this.f3526b.mo23654y(m5566d(b, cVar, iVar), str, true);
    }

    /* renamed from: u */
    public void mo18527u() {
        this.f3526b.mo23647i();
    }

    /* renamed from: v */
    public C3339g<Void> mo18528v(@NonNull Executor executor) {
        return mo18529w(executor, (String) null);
    }

    /* renamed from: w */
    public C3339g<Void> mo18529w(@NonNull Executor executor, @Nullable String str) {
        List<C2244n> w = this.f3526b.mo23653w();
        ArrayList arrayList = new ArrayList();
        for (C2244n next : w) {
            if (str == null || str.equals(next.mo18515d())) {
                arrayList.add(this.f3527c.mo23776c(next, str != null).mo14764g(executor, new C2204a0(this)));
            }
        }
        return C1874c.m4952f(arrayList);
    }
}
