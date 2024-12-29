package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.C1316e;
import com.google.android.datatransport.runtime.backends.C1318g;
import com.google.android.datatransport.runtime.backends.C1320h;
import com.google.android.datatransport.runtime.backends.C1328n;
import com.google.android.datatransport.runtime.time.C1354a;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.p022s.C0496a;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0519c;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0533i;
import p011c.p012a.p019b.p020a.p021i.p026v.C0553b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.m */
public class C1347m {

    /* renamed from: a */
    private final Context f2465a;

    /* renamed from: b */
    private final C1316e f2466b;

    /* renamed from: c */
    private final C0519c f2467c;

    /* renamed from: d */
    private final C1353s f2468d;

    /* renamed from: e */
    private final Executor f2469e;

    /* renamed from: f */
    private final C0553b f2470f;

    /* renamed from: g */
    private final C1354a f2471g;

    @Inject
    public C1347m(Context context, C1316e eVar, C0519c cVar, C1353s sVar, Executor executor, C0553b bVar, @WallTime C1354a aVar) {
        this.f2465a = context;
        this.f2466b = eVar;
        this.f2467c = cVar;
        this.f2468d = sVar;
        this.f2469e = executor;
        this.f2470f = bVar;
        this.f2471g = aVar;
    }

    /* renamed from: c */
    static /* synthetic */ Object m3540c(C1347m mVar, C1320h hVar, Iterable iterable, C0487l lVar, int i) {
        if (hVar.mo10215c() == C1320h.C1321a.TRANSIENT_ERROR) {
            mVar.f2467c.mo8508U0(iterable);
            mVar.f2468d.mo10234a(lVar, i + 1);
            return null;
        }
        mVar.f2467c.mo8513m(iterable);
        if (hVar.mo10215c() == C1320h.C1321a.OK) {
            mVar.f2467c.mo8515w(lVar, mVar.f2471g.mo10267a() + hVar.mo10214b());
        }
        if (!mVar.f2467c.mo8507T0(lVar)) {
            return null;
        }
        mVar.f2468d.mo10234a(lVar, 1);
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r5.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2.f2468d.mo10234a(r3, r4 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0024 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m3542e(com.google.android.datatransport.runtime.scheduling.jobscheduling.C1347m r2, p011c.p012a.p019b.p020a.p021i.C0487l r3, int r4, java.lang.Runnable r5) {
        /*
            c.a.b.a.i.v.b r0 = r2.f2470f     // Catch:{ a -> 0x0024 }
            c.a.b.a.i.u.j.c r1 = r2.f2467c     // Catch:{ a -> 0x0024 }
            r1.getClass()     // Catch:{ a -> 0x0024 }
            c.a.b.a.i.v.b$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.C1345k.m3535a(r1)     // Catch:{ a -> 0x0024 }
            r0.mo8509a(r1)     // Catch:{ a -> 0x0024 }
            boolean r0 = r2.mo10260a()     // Catch:{ a -> 0x0024 }
            if (r0 != 0) goto L_0x001e
            c.a.b.a.i.v.b r0 = r2.f2470f     // Catch:{ a -> 0x0024 }
            c.a.b.a.i.v.b$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.C1346l.m3537a(r2, r3, r4)     // Catch:{ a -> 0x0024 }
            r0.mo8509a(r1)     // Catch:{ a -> 0x0024 }
            goto L_0x002b
        L_0x001e:
            r2.mo10261f(r3, r4)     // Catch:{ a -> 0x0024 }
            goto L_0x002b
        L_0x0022:
            r2 = move-exception
            goto L_0x002f
        L_0x0024:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.s r2 = r2.f2468d     // Catch:{ all -> 0x0022 }
            int r4 = r4 + 1
            r2.mo10234a(r3, r4)     // Catch:{ all -> 0x0022 }
        L_0x002b:
            r5.run()
            return
        L_0x002f:
            r5.run()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.C1347m.m3542e(com.google.android.datatransport.runtime.scheduling.jobscheduling.m, c.a.b.a.i.l, int, java.lang.Runnable):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10260a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f2465a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10261f(C0487l lVar, int i) {
        C1320h hVar;
        C1328n a = this.f2466b.mo10226a(lVar.mo8436b());
        Iterable<C0533i> iterable = (Iterable) this.f2470f.mo8509a(C1343i.m3531a(this, lVar));
        if (iterable.iterator().hasNext()) {
            if (a == null) {
                C0496a.m155a("Uploader", "Unknown backend for %s, deleting event batch for it...", lVar);
                hVar = C1320h.m3470a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (C0533i b : iterable) {
                    arrayList.add(b.mo8499b());
                }
                C1318g.C1319a a2 = C1318g.m3464a();
                a2.mo10212b(arrayList);
                a2.mo10213c(lVar.mo8437c());
                hVar = a.mo10202a(a2.mo10211a());
            }
            this.f2470f.mo8509a(C1344j.m3533a(this, hVar, iterable, lVar, i));
        }
    }

    /* renamed from: g */
    public void mo10262g(C0487l lVar, int i, Runnable runnable) {
        this.f2469e.execute(C1342h.m3530b(this, lVar, i, runnable));
    }
}
