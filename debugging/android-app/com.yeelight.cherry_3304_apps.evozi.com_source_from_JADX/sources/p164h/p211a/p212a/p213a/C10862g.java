package p164h.p211a.p212a.p213a;

import androidx.appcompat.widget.ActivityChooserView;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p164h.p211a.p212a.p213a.p214n.C10880a;
import p164h.p211a.p212a.p213a.p214n.C10884e;
import p164h.p211a.p212a.p216c.C10892d;
import p164h.p211a.p212a.p216c.C10893e;
import p164h.p211a.p212a.p216c.C10914o;
import p164h.p211a.p212a.p217d.C10935i;
import p164h.p211a.p212a.p228h.C11100b;
import p164h.p211a.p212a.p228h.C11104c;
import p164h.p211a.p212a.p228h.p230b0.C11102b;
import p164h.p211a.p212a.p228h.p232d0.C11109b;
import p164h.p211a.p212a.p228h.p232d0.C11114d;
import p164h.p211a.p212a.p228h.p232d0.C11115e;
import p164h.p211a.p212a.p228h.p233x.C11146b;
import p164h.p211a.p212a.p228h.p233x.C11152d;
import p164h.p211a.p212a.p228h.p233x.C11153e;

/* renamed from: h.a.a.a.g */
public class C10862g extends C11146b implements C10892d, C11100b, C11152d {

    /* renamed from: A */
    private C10884e f20963A;

    /* renamed from: B */
    private C11104c f20964B;

    /* renamed from: G */
    private final C10893e f20965G;

    /* renamed from: h */
    private int f20966h;

    /* renamed from: i */
    private boolean f20967i;

    /* renamed from: j */
    private boolean f20968j;

    /* renamed from: k */
    private int f20969k;

    /* renamed from: l */
    private int f20970l;

    /* renamed from: m */
    private ConcurrentMap<C10857b, C10866h> f20971m;

    /* renamed from: n */
    C11114d f20972n;

    /* renamed from: o */
    C10864b f20973o;

    /* renamed from: p */
    private long f20974p;

    /* renamed from: q */
    private long f20975q;

    /* renamed from: r */
    private int f20976r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C11115e f20977s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C11115e f20978t;

    /* renamed from: u */
    private C10857b f20979u;

    /* renamed from: v */
    private C10880a f20980v;

    /* renamed from: w */
    private Set<String> f20981w;

    /* renamed from: x */
    private int f20982x;

    /* renamed from: y */
    private LinkedList<String> f20983y;

    /* renamed from: z */
    private final C11102b f20984z;

    /* renamed from: h.a.a.a.g$a */
    class C10863a implements Runnable {
        C10863a() {
        }

        public void run() {
            while (C10862g.this.isRunning()) {
                C10862g.this.f20977s.mo35318m(System.currentTimeMillis());
                C10862g.this.f20978t.mo35318m(C10862g.this.f20977s.mo35310e());
                try {
                    Thread.sleep(200);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: h.a.a.a.g$b */
    interface C10864b extends C11153e {
        /* renamed from: T */
        void mo34265T(C10866h hVar);
    }

    /* renamed from: h.a.a.a.g$c */
    private static class C10865c extends C11109b {
        private C10865c() {
        }

        /* synthetic */ C10865c(C10863a aVar) {
            this();
        }
    }

    public C10862g() {
        this(new C11102b());
    }

    public C10862g(C11102b bVar) {
        this.f20966h = 2;
        this.f20967i = true;
        this.f20968j = true;
        this.f20969k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f20970l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f20971m = new ConcurrentHashMap();
        this.f20974p = 20000;
        this.f20975q = 320000;
        this.f20976r = 75000;
        this.f20977s = new C11115e();
        this.f20978t = new C11115e();
        this.f20982x = 3;
        this.f20964B = new C11104c();
        this.f20965G = new C10893e();
        this.f20984z = bVar;
        mo35020y0(bVar);
        mo35020y0(this.f20965G);
    }

    /* renamed from: d1 */
    private void m27143d1() {
        C10893e eVar;
        C10935i.C10936a aVar;
        if (this.f20966h == 0) {
            this.f20965G.mo34438z0(C10935i.C10936a.BYTE_ARRAY);
            this.f20965G.mo34433A0(C10935i.C10936a.BYTE_ARRAY);
            this.f20965G.mo34434B0(C10935i.C10936a.BYTE_ARRAY);
            eVar = this.f20965G;
            aVar = C10935i.C10936a.BYTE_ARRAY;
        } else {
            this.f20965G.mo34438z0(C10935i.C10936a.DIRECT);
            this.f20965G.mo34433A0(this.f20967i ? C10935i.C10936a.DIRECT : C10935i.C10936a.INDIRECT);
            this.f20965G.mo34434B0(C10935i.C10936a.DIRECT);
            eVar = this.f20965G;
            aVar = this.f20967i ? C10935i.C10936a.DIRECT : C10935i.C10936a.INDIRECT;
        }
        eVar.mo34435C0(aVar);
    }

    /* renamed from: L0 */
    public void mo34234L0(C11115e.C11116a aVar) {
        aVar.mo35320d();
    }

    /* renamed from: M0 */
    public int mo34235M0() {
        return this.f20976r;
    }

    /* renamed from: N0 */
    public C10866h mo34236N0(C10857b bVar, boolean z) {
        Set<String> set;
        if (bVar != null) {
            C10866h hVar = (C10866h) this.f20971m.get(bVar);
            if (hVar != null) {
                return hVar;
            }
            C10866h hVar2 = new C10866h(this, bVar, z);
            if (this.f20979u != null && ((set = this.f20981w) == null || !set.contains(bVar.mo34219a()))) {
                hVar2.mo34287v(this.f20979u);
                C10880a aVar = this.f20980v;
                if (aVar != null) {
                    hVar2.mo34288w(aVar);
                }
            }
            C10866h putIfAbsent = this.f20971m.putIfAbsent(bVar, hVar2);
            return putIfAbsent != null ? putIfAbsent : hVar2;
        }
        throw new UnknownHostException("Remote socket address cannot be null.");
    }

    /* renamed from: O0 */
    public long mo34237O0() {
        return this.f20974p;
    }

    /* renamed from: P0 */
    public int mo34238P0() {
        return this.f20969k;
    }

    /* renamed from: Q0 */
    public int mo34239Q0() {
        return this.f20970l;
    }

    /* renamed from: R0 */
    public C10884e mo34240R0() {
        return this.f20963A;
    }

    /* renamed from: S0 */
    public LinkedList<String> mo34241S0() {
        return this.f20983y;
    }

    /* renamed from: T0 */
    public C11102b mo34242T0() {
        return this.f20984z;
    }

    /* renamed from: U0 */
    public C11114d mo34243U0() {
        return this.f20972n;
    }

    /* renamed from: V0 */
    public long mo34244V0() {
        return this.f20975q;
    }

    /* renamed from: W */
    public C10935i mo34245W() {
        return this.f20965G.mo34245W();
    }

    /* renamed from: W0 */
    public boolean mo34246W0() {
        return this.f20963A != null;
    }

    /* renamed from: X0 */
    public boolean mo34247X0() {
        return this.f20968j;
    }

    /* renamed from: Y0 */
    public int mo34248Y0() {
        return this.f20982x;
    }

    /* renamed from: Z */
    public void mo34249Z() {
        this.f20964B.mo34249Z();
    }

    /* renamed from: Z0 */
    public void mo34250Z0(C11115e.C11116a aVar) {
        this.f20977s.mo35312g(aVar);
    }

    /* renamed from: a */
    public Object mo34251a(String str) {
        return this.f20964B.mo34251a(str);
    }

    /* renamed from: a1 */
    public void mo34252a1(C11115e.C11116a aVar, long j) {
        C11115e eVar = this.f20977s;
        eVar.mo35313h(aVar, j - eVar.mo35309d());
    }

    /* renamed from: b */
    public void mo34253b(String str, Object obj) {
        this.f20964B.mo34253b(str, obj);
    }

    /* renamed from: b1 */
    public void mo34254b1(C11115e.C11116a aVar) {
        this.f20978t.mo35312g(aVar);
    }

    /* renamed from: c1 */
    public void mo34255c1(C10871k kVar) {
        boolean m0 = C10914o.f21189b.mo34585m0(kVar.mo34334r());
        kVar.mo34315X(1);
        mo34236N0(kVar.mo34326j(), m0).mo34286u(kVar);
    }

    /* renamed from: e */
    public void mo34256e(String str) {
        this.f20964B.mo34256e(str);
    }

    /* renamed from: e1 */
    public void mo34257e1(int i) {
        this.f20976r = i;
    }

    /* renamed from: f1 */
    public void mo34258f1(int i) {
        this.f20982x = i;
    }

    /* renamed from: g1 */
    public void mo34259g1(C11114d dVar) {
        mo35000I0(this.f20972n);
        this.f20972n = dVar;
        mo35020y0(dVar);
    }

    /* renamed from: h1 */
    public void mo34260h1(long j) {
        this.f20975q = j;
    }

    /* renamed from: m0 */
    public C10935i mo34261m0() {
        return this.f20965G.mo34261m0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        m27143d1();
        this.f20977s.mo35314i(this.f20975q);
        this.f20977s.mo35315j();
        this.f20978t.mo35314i(this.f20974p);
        this.f20978t.mo35315j();
        if (this.f20972n == null) {
            C10865c cVar = new C10865c((C10863a) null);
            cVar.mo35300P0(16);
            cVar.mo35299O0(true);
            cVar.mo35301Q0("HttpClient");
            this.f20972n = cVar;
            mo35462z0(cVar, true);
        }
        C10864b lVar = this.f20966h == 2 ? new C10874l(this) : new C10878m(this);
        this.f20973o = lVar;
        mo35462z0(lVar, true);
        super.mo34262p0();
        this.f20972n.mo35291e0(new C10863a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        for (C10866h c : this.f20971m.values()) {
            c.mo34267c();
        }
        this.f20977s.mo35307b();
        this.f20978t.mo35307b();
        super.mo34263q0();
        C11114d dVar = this.f20972n;
        if (dVar instanceof C10865c) {
            mo35000I0(dVar);
            this.f20972n = null;
        }
        mo35000I0(this.f20973o);
    }
}
