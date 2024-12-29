package p037g1;

import com.google.android.datatransport.C0638b;
import com.google.android.gms.tasks.C1872a;
import com.google.firebase.crashlytics.internal.common.C2244n;
import com.google.firebase.crashlytics.internal.common.C2259y;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.C2395d;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p031f.C3152c;
import p118y0.C3916f;

/* renamed from: g1.d */
final class C3217d {

    /* renamed from: a */
    private final double f5185a;

    /* renamed from: b */
    private final double f5186b;

    /* renamed from: c */
    private final long f5187c;

    /* renamed from: d */
    private final int f5188d;

    /* renamed from: e */
    private final BlockingQueue<Runnable> f5189e;

    /* renamed from: f */
    private final ThreadPoolExecutor f5190f;

    /* renamed from: g */
    private final C3152c<CrashlyticsReport> f5191g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2259y f5192h;

    /* renamed from: i */
    private int f5193i;

    /* renamed from: j */
    private long f5194j;

    /* renamed from: g1.d$b */
    private final class C3219b implements Runnable {

        /* renamed from: a */
        private final C2244n f5195a;

        /* renamed from: b */
        private final C1872a<C2244n> f5196b;

        private C3219b(C2244n nVar, C1872a<C2244n> aVar) {
            this.f5195a = nVar;
            this.f5196b = aVar;
        }

        public void run() {
            C3217d.this.m8662m(this.f5195a, this.f5196b);
            C3217d.this.f5192h.mo18620c();
            double d = C3217d.this.m8656f();
            C3916f f = C3916f.m11190f();
            f.mo26399b("Delay for: " + String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(d / 1000.0d)}) + " s for report: " + this.f5195a.mo18515d());
            C3217d.m8663n(d);
        }
    }

    C3217d(double d, double d2, long j, C3152c<CrashlyticsReport> cVar, C2259y yVar) {
        this.f5185a = d;
        this.f5186b = d2;
        this.f5187c = j;
        this.f5191g = cVar;
        this.f5192h = yVar;
        int i = (int) d;
        this.f5188d = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f5189e = arrayBlockingQueue;
        this.f5190f = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f5193i = 0;
        this.f5194j = 0;
    }

    C3217d(C3152c<CrashlyticsReport> cVar, C2395d dVar, C2259y yVar) {
        this(dVar.f4000d, dVar.f4001e, ((long) dVar.f4002f) * 1000, cVar, yVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public double m8656f() {
        return Math.min(3600000.0d, (60000.0d / this.f5185a) * Math.pow(this.f5186b, (double) m8657g()));
    }

    /* renamed from: g */
    private int m8657g() {
        if (this.f5194j == 0) {
            this.f5194j = m8661l();
        }
        int l = (int) ((m8661l() - this.f5194j) / this.f5187c);
        int min = m8659j() ? Math.min(100, this.f5193i + l) : Math.max(0, this.f5193i - l);
        if (this.f5193i != min) {
            this.f5193i = min;
            this.f5194j = m8661l();
        }
        return min;
    }

    /* renamed from: i */
    private boolean m8658i() {
        return this.f5189e.size() < this.f5188d;
    }

    /* renamed from: j */
    private boolean m8659j() {
        return this.f5189e.size() == this.f5188d;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m8660k(C1872a aVar, C2244n nVar, Exception exc) {
        if (exc != null) {
            aVar.mo14739d(exc);
        } else {
            aVar.mo14740e(nVar);
        }
    }

    /* renamed from: l */
    private long m8661l() {
        return System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m8662m(C2244n nVar, C1872a<C2244n> aVar) {
        C3916f f = C3916f.m11190f();
        f.mo26399b("Sending report through Google DataTransport: " + nVar.mo18515d());
        this.f5191g.mo23644a(C0638b.m317d(nVar.mo18513b()), new C9048c(aVar, nVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m8663n(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C1872a<C2244n> mo23777h(C2244n nVar, boolean z) {
        synchronized (this.f5189e) {
            C1872a<C2244n> aVar = new C1872a<>();
            if (z) {
                this.f5192h.mo18619b();
                if (m8658i()) {
                    C3916f f = C3916f.m11190f();
                    f.mo26399b("Enqueueing report: " + nVar.mo18515d());
                    C3916f f2 = C3916f.m11190f();
                    f2.mo26399b("Queue size: " + this.f5189e.size());
                    this.f5190f.execute(new C3219b(nVar, aVar));
                    C3916f f3 = C3916f.m11190f();
                    f3.mo26399b("Closing task for report: " + nVar.mo18515d());
                    aVar.mo14740e(nVar);
                    return aVar;
                }
                m8657g();
                C3916f f4 = C3916f.m11190f();
                f4.mo26399b("Dropping report due to queue being full: " + nVar.mo18515d());
                this.f5192h.mo18618a();
                aVar.mo14740e(nVar);
                return aVar;
            }
            m8662m(nVar, aVar);
            return aVar;
        }
    }
}
