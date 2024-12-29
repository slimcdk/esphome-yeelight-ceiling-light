package p068n;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.C0685d;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import p031f.C3150a;
import p035g.C3187h;
import p035g.C3188i;
import p035g.C3198o;
import p039h.C3222b;
import p039h.C3229h;
import p047j.C3252a;
import p052k.C3285a;
import p075o.C3387c;
import p075o.C3388d;
import p075o.C3399k;
import p079p.C3590a;
import p083q.C3604a;

/* renamed from: n.p */
public class C3350p {

    /* renamed from: a */
    private final Context f5451a;

    /* renamed from: b */
    private final C3222b f5452b;

    /* renamed from: c */
    private final C3388d f5453c;

    /* renamed from: d */
    private final C3354v f5454d;

    /* renamed from: e */
    private final Executor f5455e;

    /* renamed from: f */
    private final C3590a f5456f;

    /* renamed from: g */
    private final C3604a f5457g;

    /* renamed from: h */
    private final C3604a f5458h;

    /* renamed from: i */
    private final C3387c f5459i;

    @Inject
    public C3350p(Context context, C3222b bVar, C3388d dVar, C3354v vVar, Executor executor, C3590a aVar, @WallTime C3604a aVar2, @Monotonic C3604a aVar3, C3387c cVar) {
        this.f5451a = context;
        this.f5452b = bVar;
        this.f5453c = dVar;
        this.f5454d = vVar;
        this.f5455e = executor;
        this.f5456f = aVar;
        this.f5457g = aVar2;
        this.f5458h = aVar3;
        this.f5459i = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m9138l(C3198o oVar) {
        return Boolean.valueOf(this.f5453c.mo24188t(oVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m9139m(C3198o oVar) {
        return this.f5453c.mo24185l0(oVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m9140n(Iterable iterable, C3198o oVar, long j) {
        this.f5453c.mo24183W0(iterable);
        this.f5453c.mo24186n0(oVar, this.f5457g.mo25913a() + j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m9141o(Iterable iterable) {
        this.f5453c.mo24189u(iterable);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m9142p() {
        this.f5459i.mo24178c();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m9143q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f5459i.mo24180f((long) ((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m9144r(C3198o oVar, long j) {
        this.f5453c.mo24186n0(oVar, this.f5457g.mo25913a() + j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m9145s(C3198o oVar, int i) {
        this.f5454d.mo24093a(oVar, i + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f5454d.mo24093a(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m9146t(p035g.C3198o r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            p.a r0 = r3.f5456f     // Catch:{ SynchronizationException -> 0x0026 }
            o.d r1 = r3.f5453c     // Catch:{ SynchronizationException -> 0x0026 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            n.f r2 = new n.f     // Catch:{ SynchronizationException -> 0x0026 }
            r2.<init>(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.mo24194a(r2)     // Catch:{ SynchronizationException -> 0x0026 }
            boolean r0 = r3.mo24098k()     // Catch:{ SynchronizationException -> 0x0026 }
            if (r0 != 0) goto L_0x0020
            p.a r0 = r3.f5456f     // Catch:{ SynchronizationException -> 0x0026 }
            n.j r1 = new n.j     // Catch:{ SynchronizationException -> 0x0026 }
            r1.<init>(r3, r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.mo24194a(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0020:
            r3.mo24099u(r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0024:
            r4 = move-exception
            goto L_0x0031
        L_0x0026:
            n.v r0 = r3.f5454d     // Catch:{ all -> 0x0024 }
            int r5 = r5 + 1
            r0.mo24093a(r4, r5)     // Catch:{ all -> 0x0024 }
        L_0x002d:
            r6.run()
            return
        L_0x0031:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p068n.C3350p.m9146t(g.o, int, java.lang.Runnable):void");
    }

    @VisibleForTesting
    /* renamed from: j */
    public C3188i mo24097j(C3229h hVar) {
        C3590a aVar = this.f5456f;
        C3387c cVar = this.f5459i;
        Objects.requireNonNull(cVar);
        return hVar.mo11106b(C3188i.m8566a().mo23714i(this.f5457g.mo25913a()).mo23716k(this.f5458h.mo25913a()).mo23715j("GDT_CLIENT_METRICS").mo23713h(new C3187h(C3150a.m8421b("proto"), ((C3252a) aVar.mo24194a(new C9713o(cVar))).mo23800f())).mo23709d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo24098k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f5451a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public BackendResponse mo24099u(C3198o oVar, int i) {
        BackendResponse a;
        C3229h hVar = this.f5452b.get(oVar.mo23731b());
        long j = 0;
        BackendResponse e = BackendResponse.m505e(0);
        while (true) {
            long j2 = j;
            while (((Boolean) this.f5456f.mo24194a(new C9706h(this, oVar))).booleanValue()) {
                Iterable<C3399k> iterable = (Iterable) this.f5456f.mo24194a(new C9707i(this, oVar));
                if (!iterable.iterator().hasNext()) {
                    return e;
                }
                if (hVar == null) {
                    C3285a.m8854b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    a = BackendResponse.m503a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (C3399k b : iterable) {
                        arrayList.add(b.mo24172b());
                    }
                    if (oVar.mo23763e()) {
                        arrayList.add(mo24097j(hVar));
                    }
                    a = hVar.mo11105a(C0685d.m520a().mo11218b(arrayList).mo11219c(oVar.mo23732c()).mo11217a());
                }
                e = a;
                if (e.mo11210c() == BackendResponse.Status.TRANSIENT_ERROR) {
                    this.f5456f.mo24194a(new C9711m(this, iterable, oVar, j2));
                    this.f5454d.mo24094b(oVar, i + 1, true);
                    return e;
                }
                this.f5456f.mo24194a(new C9710l(this, iterable));
                if (e.mo11210c() == BackendResponse.Status.OK) {
                    j = Math.max(j2, e.mo11209b());
                    if (oVar.mo23763e()) {
                        this.f5456f.mo24194a(new C9705g(this));
                    }
                } else if (e.mo11210c() == BackendResponse.Status.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (C3399k b2 : iterable) {
                        String j3 = b2.mo24172b().mo23706j();
                        hashMap.put(j3, !hashMap.containsKey(j3) ? 1 : Integer.valueOf(((Integer) hashMap.get(j3)).intValue() + 1));
                    }
                    this.f5456f.mo24194a(new C9712n(this, hashMap));
                }
            }
            this.f5456f.mo24194a(new C9709k(this, oVar, j2));
            return e;
        }
    }

    /* renamed from: v */
    public void mo24100v(C3198o oVar, int i, Runnable runnable) {
        this.f5455e.execute(new C9703e(this, oVar, i, runnable));
    }
}
