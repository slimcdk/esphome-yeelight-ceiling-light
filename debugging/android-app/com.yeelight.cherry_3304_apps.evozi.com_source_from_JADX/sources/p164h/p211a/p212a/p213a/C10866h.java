package p164h.p211a.p212a.p213a;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import org.apache.commons.p271io.IOUtils;
import p164h.p211a.p212a.p213a.C10862g;
import p164h.p211a.p212a.p213a.C10874l;
import p164h.p211a.p212a.p213a.p214n.C10880a;
import p164h.p211a.p212a.p213a.p214n.C10885f;
import p164h.p211a.p212a.p216c.C10895g;
import p164h.p211a.p212a.p216c.C10922v;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10938k;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p228h.p233x.C11146b;
import p164h.p211a.p212a.p228h.p233x.C11152d;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.a.h */
public class C10866h implements C11152d {

    /* renamed from: q */
    private static final C11158c f20986q = C11156b.m29015a(C10866h.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<C10871k> f20987a = new LinkedList();

    /* renamed from: b */
    private final List<C10852a> f20988b = new LinkedList();

    /* renamed from: c */
    private final BlockingQueue<Object> f20989c = new ArrayBlockingQueue(10, true);

    /* renamed from: d */
    private final List<C10852a> f20990d = new ArrayList();

    /* renamed from: e */
    private final C10862g f20991e;

    /* renamed from: f */
    private final C10857b f20992f;

    /* renamed from: g */
    private final boolean f20993g;

    /* renamed from: h */
    private final C10938k f20994h;

    /* renamed from: i */
    private volatile int f20995i;

    /* renamed from: j */
    private volatile int f20996j;

    /* renamed from: k */
    private int f20997k = 0;

    /* renamed from: l */
    private int f20998l = 0;

    /* renamed from: m */
    private volatile C10857b f20999m;

    /* renamed from: n */
    private C10880a f21000n;

    /* renamed from: o */
    private C10922v f21001o;

    /* renamed from: p */
    private List<C10895g> f21002p;

    /* renamed from: h.a.a.a.h$a */
    class C10867a extends IOException {

        /* renamed from: a */
        final /* synthetic */ Exception f21003a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10867a(C10866h hVar, String str, Exception exc) {
            super(str);
            this.f21003a = exc;
            initCause(this.f21003a);
        }
    }

    /* renamed from: h.a.a.a.h$b */
    private class C10868b extends C10861f {

        /* renamed from: B */
        private final C10874l.C10877c f21004B;

        /* renamed from: C */
        private final C10871k f21005C;

        public C10868b(C10857b bVar, C10874l.C10877c cVar, C10871k kVar) {
            this.f21004B = cVar;
            this.f21005C = kVar;
            mo34305N("CONNECT");
            mo34318b0(kVar.mo34339v());
            String bVar2 = bVar.toString();
            mo34311T(bVar2);
            mo34319c("Host", bVar2);
            mo34319c("Proxy-Connection", "keep-alive");
            mo34319c("User-Agent", "Jetty-Client");
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void mo34290C() {
            int f0 = mo34230f0();
            if (f0 == 200) {
                this.f21004B.mo34348a();
            } else if (f0 == 504) {
                mo34293z();
            } else {
                mo34292y(new ProtocolException("Proxy: " + this.f21004B.mo34358i() + Constants.COLON_SEPARATOR + this.f21004B.mo34375x() + " didn't return http return code 200, but " + f0 + " while trying to request: " + this.f21005C.mo34326j().toString()));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public void mo34291x(Throwable th) {
            C10866h.this.mo34278n(th);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public void mo34292y(Throwable th) {
            C10866h.this.f20987a.remove(this.f21005C);
            if (this.f21005C.mo34315X(9)) {
                this.f21005C.mo34327k().mo34215h(th);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public void mo34293z() {
            C10866h.this.f20987a.remove(this.f21005C);
            if (this.f21005C.mo34315X(8)) {
                this.f21005C.mo34327k().mo34210c();
            }
        }
    }

    C10866h(C10862g gVar, C10857b bVar, boolean z) {
        this.f20991e = gVar;
        this.f20992f = bVar;
        this.f20993g = z;
        this.f20995i = gVar.mo34238P0();
        this.f20996j = this.f20991e.mo34239Q0();
        String a = bVar.mo34219a();
        if (bVar.mo34220b() != (this.f20993g ? 443 : 80)) {
            a = a + Constants.COLON_SEPARATOR + bVar.mo34220b();
        }
        this.f20994h = new C10938k(a);
    }

    /* renamed from: b */
    public void mo34266b(String str, C10880a aVar) {
        synchronized (this) {
            if (this.f21001o == null) {
                this.f21001o = new C10922v();
            }
            this.f21001o.put(str, aVar);
        }
    }

    /* renamed from: c */
    public void mo34267c() {
        synchronized (this) {
            for (C10852a m : this.f20988b) {
                m.mo34189m();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo34268d(C10871k kVar) {
        C10880a aVar;
        List<C10895g> list = this.f21002p;
        if (list != null) {
            StringBuilder sb = null;
            for (C10895g next : list) {
                if (sb == null) {
                    sb = new StringBuilder();
                } else {
                    sb.append("; ");
                }
                sb.append(next.mo34449d());
                sb.append("=");
                sb.append(next.mo34451f());
            }
            if (sb != null) {
                kVar.mo34319c("Cookie", sb.toString());
            }
        }
        C10922v vVar = this.f21001o;
        if (!(vVar == null || (aVar = (C10880a) vVar.mo34543d(kVar.mo34333q())) == null)) {
            aVar.mo34378a(kVar);
        }
        kVar.mo34302K(this);
        C10852a i = mo34273i();
        if (i != null) {
            mo34284t(i, kVar);
            return;
        }
        boolean z = false;
        synchronized (this) {
            if (this.f20987a.size() != this.f20996j) {
                this.f20987a.add(kVar);
                if (this.f20988b.size() + this.f20997k < this.f20995i) {
                    z = true;
                }
            } else {
                throw new RejectedExecutionException("Queue full for address " + this.f20992f);
            }
        }
        if (z) {
            mo34289x();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo34269e(C10871k kVar) {
        synchronized (this) {
            this.f20987a.remove(kVar);
        }
    }

    /* renamed from: f */
    public C10857b mo34270f() {
        return this.f20992f;
    }

    /* renamed from: g */
    public C10929e mo34271g() {
        return this.f20994h;
    }

    /* renamed from: h */
    public C10862g mo34272h() {
        return this.f20991e;
    }

    /* renamed from: i */
    public C10852a mo34273i() {
        C10852a aVar = null;
        do {
            synchronized (this) {
                if (aVar != null) {
                    this.f20988b.remove(aVar);
                    aVar.mo34189m();
                    aVar = null;
                }
                if (this.f20990d.size() > 0) {
                    aVar = this.f20990d.remove(this.f20990d.size() - 1);
                }
            }
            if (aVar == null) {
                return null;
            }
        } while (!aVar.mo34188l());
        return aVar;
    }

    /* renamed from: j */
    public C10857b mo34274j() {
        return this.f20999m;
    }

    /* renamed from: k */
    public C10880a mo34275k() {
        return this.f21000n;
    }

    /* renamed from: k0 */
    public void mo34187k0(Appendable appendable, String str) {
        synchronized (this) {
            appendable.append(String.valueOf(this) + "idle=" + this.f20990d.size() + " pending=" + this.f20997k).append(IOUtils.LINE_SEPARATOR_UNIX);
            C11146b.m28976B0(appendable, str, this.f20988b);
        }
    }

    /* renamed from: l */
    public boolean mo34276l() {
        return this.f20999m != null;
    }

    /* renamed from: m */
    public boolean mo34277m() {
        return this.f20993g;
    }

    /* renamed from: n */
    public void mo34278n(Throwable th) {
        boolean z;
        synchronized (this) {
            z = true;
            this.f20997k--;
            if (this.f20998l > 0) {
                this.f20998l--;
            } else {
                if (this.f20987a.size() > 0) {
                    C10871k remove = this.f20987a.remove(0);
                    if (remove.mo34315X(9)) {
                        remove.mo34327k().mo34209b(th);
                    }
                    if (!this.f20987a.isEmpty() && this.f20991e.mo35452j0()) {
                        th = null;
                    }
                }
                th = null;
            }
            z = false;
        }
        if (z) {
            mo34289x();
        }
        if (th != null) {
            try {
                this.f20989c.put(th);
            } catch (InterruptedException e) {
                f20986q.mo35488d(e);
            }
        }
    }

    /* renamed from: o */
    public void mo34279o(Throwable th) {
        synchronized (this) {
            this.f20997k--;
            if (this.f20987a.size() > 0) {
                C10871k remove = this.f20987a.remove(0);
                if (remove.mo34315X(9)) {
                    remove.mo34327k().mo34215h(th);
                }
            }
        }
    }

    /* renamed from: p */
    public void mo34280p(C10852a aVar) {
        synchronized (this) {
            this.f20997k--;
            this.f20988b.add(aVar);
            if (this.f20998l > 0) {
                this.f20998l--;
            } else {
                if (this.f20987a.size() == 0) {
                    aVar.mo34197t();
                    this.f20990d.add(aVar);
                } else {
                    C10942n g = aVar.mo34605g();
                    if (!mo34276l() || !(g instanceof C10874l.C10877c)) {
                        mo34284t(aVar, this.f20987a.remove(0));
                    } else {
                        C10868b bVar = new C10868b(mo34270f(), (C10874l.C10877c) g, this.f20987a.get(0));
                        bVar.mo34303L(mo34274j());
                        mo34284t(aVar, bVar);
                    }
                }
                aVar = null;
            }
        }
        if (aVar != null) {
            try {
                this.f20989c.put(aVar);
            } catch (InterruptedException e) {
                f20986q.mo35488d(e);
            }
        }
    }

    /* renamed from: q */
    public void mo34281q(C10871k kVar) {
        kVar.mo34327k().mo34213f();
        kVar.mo34301J();
        mo34268d(kVar);
    }

    /* renamed from: r */
    public void mo34282r(C10852a aVar, boolean z) {
        boolean z2;
        if (aVar.mo34193p()) {
            aVar.mo34199u(false);
        }
        if (z) {
            try {
                aVar.mo34189m();
            } catch (IOException e) {
                f20986q.mo35488d(e);
            }
        }
        if (this.f20991e.mo35452j0()) {
            if (z || !aVar.mo34605g().isOpen()) {
                synchronized (this) {
                    this.f20988b.remove(aVar);
                    z2 = !this.f20987a.isEmpty();
                }
                if (z2) {
                    mo34289x();
                    return;
                }
                return;
            }
            synchronized (this) {
                if (this.f20987a.size() == 0) {
                    aVar.mo34197t();
                    this.f20990d.add(aVar);
                } else {
                    mo34284t(aVar, this.f20987a.remove(0));
                }
                notifyAll();
            }
        }
    }

    /* renamed from: s */
    public void mo34283s(C10852a aVar) {
        aVar.mo34604f((aVar == null || aVar.mo34605g() == null) ? -1 : (long) aVar.mo34605g().mo34356g());
        boolean z = false;
        synchronized (this) {
            this.f20990d.remove(aVar);
            this.f20988b.remove(aVar);
            if (!this.f20987a.isEmpty() && this.f20991e.mo35452j0()) {
                z = true;
            }
        }
        if (z) {
            mo34289x();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo34284t(C10852a aVar, C10871k kVar) {
        synchronized (this) {
            if (!aVar.mo34195r(kVar)) {
                if (kVar.mo34335s() <= 1) {
                    this.f20987a.add(0, kVar);
                }
                mo34283s(aVar);
            }
        }
    }

    public synchronized String toString() {
        return String.format("HttpDestination@%x//%s:%d(%d/%d,%d,%d/%d)%n", new Object[]{Integer.valueOf(hashCode()), this.f20992f.mo34219a(), Integer.valueOf(this.f20992f.mo34220b()), Integer.valueOf(this.f20988b.size()), Integer.valueOf(this.f20995i), Integer.valueOf(this.f20990d.size()), Integer.valueOf(this.f20987a.size()), Integer.valueOf(this.f20996j)});
    }

    /* renamed from: u */
    public void mo34286u(C10871k kVar) {
        LinkedList<String> S0 = this.f20991e.mo34241S0();
        if (S0 != null) {
            int size = S0.size();
            while (size > 0) {
                String str = S0.get(size - 1);
                try {
                    kVar.mo34304M((C10869i) Class.forName(str).getDeclaredConstructor(new Class[]{C10866h.class, C10871k.class}).newInstance(new Object[]{this, kVar}));
                    size--;
                } catch (Exception e) {
                    throw new C10867a(this, "Unable to instantiate registered listener for destination: " + str, e);
                }
            }
        }
        if (this.f20991e.mo34246W0()) {
            kVar.mo34304M(new C10885f(this, kVar));
        }
        mo34268d(kVar);
    }

    /* renamed from: v */
    public void mo34287v(C10857b bVar) {
        this.f20999m = bVar;
    }

    /* renamed from: w */
    public void mo34288w(C10880a aVar) {
        this.f21000n = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo34289x() {
        try {
            synchronized (this) {
                this.f20997k++;
            }
            C10862g.C10864b bVar = this.f20991e.f20973o;
            if (bVar != null) {
                bVar.mo34265T(this);
            }
        } catch (Exception e) {
            f20986q.mo35487c(e);
            mo34278n(e);
        }
    }
}
