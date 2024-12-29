package org.eclipse.jetty.client;

import androidx.appcompat.widget.ActivityChooserView;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.eclipse.jetty.http.C9890d;
import org.eclipse.jetty.http.C9891e;
import org.eclipse.jetty.http.C9912n;
import org.eclipse.jetty.p195io.Buffers;
import org.eclipse.jetty.util.C9978b;
import org.eclipse.jetty.util.C9979c;
import p147d6.C8942b;
import p147d6.C8949e;
import p162g6.C9085b;
import p172i6.C9122b;
import p172i6.C9127d;
import p172i6.C9128e;
import p217u5.C10534a;
import p217u5.C10538e;

/* renamed from: org.eclipse.jetty.client.g */
public class C9871g extends C8942b implements C9890d, C9978b {

    /* renamed from: A */
    private C10538e f17915A;

    /* renamed from: B */
    private C9979c f17916B;

    /* renamed from: C */
    private final C9891e f17917C;

    /* renamed from: h */
    private int f17918h;

    /* renamed from: i */
    private boolean f17919i;

    /* renamed from: j */
    private boolean f17920j;

    /* renamed from: k */
    private int f17921k;

    /* renamed from: l */
    private int f17922l;

    /* renamed from: m */
    private ConcurrentMap<C9866b, HttpDestination> f17923m;

    /* renamed from: n */
    C9127d f17924n;

    /* renamed from: o */
    C9873b f17925o;

    /* renamed from: p */
    private long f17926p;

    /* renamed from: q */
    private long f17927q;

    /* renamed from: r */
    private int f17928r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C9128e f17929s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C9128e f17930t;

    /* renamed from: u */
    private C9866b f17931u;

    /* renamed from: v */
    private C10534a f17932v;

    /* renamed from: w */
    private Set<String> f17933w;

    /* renamed from: x */
    private int f17934x;

    /* renamed from: y */
    private LinkedList<String> f17935y;

    /* renamed from: z */
    private final C9085b f17936z;

    /* renamed from: org.eclipse.jetty.client.g$a */
    class C9872a implements Runnable {
        C9872a() {
        }

        public void run() {
            while (C9871g.this.isRunning()) {
                C9871g.this.f17929s.mo37213m(System.currentTimeMillis());
                C9871g.this.f17930t.mo37213m(C9871g.this.f17929s.mo37205e());
                try {
                    Thread.sleep(200);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: org.eclipse.jetty.client.g$b */
    interface C9873b extends C8949e {
        /* renamed from: U */
        void mo39594U(HttpDestination httpDestination);
    }

    /* renamed from: org.eclipse.jetty.client.g$c */
    private static class C9874c extends C9122b {
        private C9874c() {
        }

        /* synthetic */ C9874c(C9872a aVar) {
            this();
        }
    }

    public C9871g() {
        this(new C9085b());
    }

    public C9871g(C9085b bVar) {
        this.f17918h = 2;
        this.f17919i = true;
        this.f17920j = true;
        this.f17921k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f17922l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f17923m = new ConcurrentHashMap();
        this.f17926p = 20000;
        this.f17927q = 320000;
        this.f17928r = 75000;
        this.f17929s = new C9128e();
        this.f17930t = new C9128e();
        this.f17934x = 3;
        this.f17916B = new C9979c();
        C9891e eVar = new C9891e();
        this.f17917C = eVar;
        this.f17936z = bVar;
        mo36753D0(bVar);
        mo36753D0(eVar);
    }

    /* renamed from: i1 */
    private void m23898i1() {
        Buffers.Type type;
        C9891e eVar;
        if (this.f17918h == 0) {
            C9891e eVar2 = this.f17917C;
            type = Buffers.Type.BYTE_ARRAY;
            eVar2.mo39755E0(type);
            this.f17917C.mo39756F0(type);
            this.f17917C.mo39757G0(type);
            eVar = this.f17917C;
        } else {
            C9891e eVar3 = this.f17917C;
            type = Buffers.Type.DIRECT;
            eVar3.mo39755E0(type);
            this.f17917C.mo39756F0(this.f17919i ? type : Buffers.Type.INDIRECT);
            this.f17917C.mo39757G0(type);
            eVar = this.f17917C;
            if (!this.f17919i) {
                type = Buffers.Type.INDIRECT;
            }
        }
        eVar.mo39758H0(type);
    }

    /* renamed from: Q0 */
    public void mo39565Q0(C9128e.C9129a aVar) {
        aVar.mo37215d();
    }

    /* renamed from: R0 */
    public int mo39566R0() {
        return this.f17928r;
    }

    /* renamed from: S0 */
    public HttpDestination mo39567S0(C9866b bVar, boolean z) {
        Set<String> set;
        if (bVar != null) {
            HttpDestination httpDestination = (HttpDestination) this.f17923m.get(bVar);
            if (httpDestination != null) {
                return httpDestination;
            }
            HttpDestination httpDestination2 = new HttpDestination(this, bVar, z);
            if (this.f17931u != null && ((set = this.f17933w) == null || !set.contains(bVar.mo39550a()))) {
                httpDestination2.mo39513v(this.f17931u);
                C10534a aVar = this.f17932v;
                if (aVar != null) {
                    httpDestination2.mo39514w(aVar);
                }
            }
            HttpDestination putIfAbsent = this.f17923m.putIfAbsent(bVar, httpDestination2);
            return putIfAbsent != null ? putIfAbsent : httpDestination2;
        }
        throw new UnknownHostException("Remote socket address cannot be null.");
    }

    /* renamed from: T0 */
    public long mo39568T0() {
        return this.f17926p;
    }

    /* renamed from: U0 */
    public int mo39569U0() {
        return this.f17921k;
    }

    /* renamed from: V0 */
    public int mo39570V0() {
        return this.f17922l;
    }

    /* renamed from: W0 */
    public C10538e mo39571W0() {
        return this.f17915A;
    }

    /* renamed from: X */
    public Buffers mo39572X() {
        return this.f17917C.mo39572X();
    }

    /* renamed from: X0 */
    public LinkedList<String> mo39573X0() {
        return this.f17935y;
    }

    /* renamed from: Y0 */
    public C9085b mo39574Y0() {
        return this.f17936z;
    }

    /* renamed from: Z0 */
    public C9127d mo39575Z0() {
        return this.f17924n;
    }

    /* renamed from: a */
    public Object mo39576a(String str) {
        return this.f17916B.mo39576a(str);
    }

    /* renamed from: a1 */
    public long mo39577a1() {
        return this.f17927q;
    }

    /* renamed from: b */
    public void mo39578b(String str, Object obj) {
        this.f17916B.mo39578b(str, obj);
    }

    /* renamed from: b0 */
    public void mo39579b0() {
        this.f17916B.mo39579b0();
    }

    /* renamed from: b1 */
    public boolean mo39580b1() {
        return this.f17915A != null;
    }

    /* renamed from: c1 */
    public boolean mo39581c1() {
        return this.f17920j;
    }

    /* renamed from: d */
    public void mo39582d(String str) {
        this.f17916B.mo39582d(str);
    }

    /* renamed from: d1 */
    public int mo39583d1() {
        return this.f17934x;
    }

    /* renamed from: e1 */
    public void mo39584e1(C9128e.C9129a aVar) {
        this.f17929s.mo37207g(aVar);
    }

    /* renamed from: f1 */
    public void mo39585f1(C9128e.C9129a aVar, long j) {
        C9128e eVar = this.f17929s;
        eVar.mo37208h(aVar, j - eVar.mo37204d());
    }

    /* renamed from: g1 */
    public void mo39586g1(C9128e.C9129a aVar) {
        this.f17930t.mo37207g(aVar);
    }

    /* renamed from: h1 */
    public void mo39587h1(C9877j jVar) {
        boolean Z0 = C9912n.f18123b.mo42418Z0(jVar.mo39635r());
        jVar.mo39616X(1);
        mo39567S0(jVar.mo39627j(), Z0).mo39512u(jVar);
    }

    /* renamed from: j1 */
    public void mo39588j1(int i) {
        this.f17928r = i;
    }

    /* renamed from: k1 */
    public void mo39589k1(int i) {
        this.f17934x = i;
    }

    /* renamed from: l1 */
    public void mo39590l1(C9127d dVar) {
        mo36761N0(this.f17924n);
        this.f17924n = dVar;
        mo36753D0(dVar);
    }

    /* renamed from: m1 */
    public void mo39591m1(long j) {
        this.f17927q = j;
    }

    /* renamed from: r0 */
    public Buffers mo39592r0() {
        return this.f17917C.mo39592r0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        m23898i1();
        this.f17929s.mo37209i(this.f17927q);
        this.f17929s.mo37210j();
        this.f17930t.mo37209i(this.f17926p);
        this.f17930t.mo37210j();
        if (this.f17924n == null) {
            C9874c cVar = new C9874c((C9872a) null);
            cVar.mo37195U0(16);
            cVar.mo37194T0(true);
            cVar.mo37196V0("HttpClient");
            this.f17924n = cVar;
            mo36754E0(cVar, true);
        }
        C9873b kVar = this.f17918h == 2 ? new C9880k(this) : new C9884l(this);
        this.f17925o = kVar;
        mo36754E0(kVar, true);
        super.mo26547u0();
        this.f17924n.mo37186h0(new C9872a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        for (HttpDestination c : this.f17923m.values()) {
            c.mo39493c();
        }
        this.f17929s.mo37202b();
        this.f17930t.mo37202b();
        super.mo26548v0();
        C9127d dVar = this.f17924n;
        if (dVar instanceof C9874c) {
            mo36761N0(dVar);
            this.f17924n = null;
        }
        mo36761N0(this.f17925o);
    }
}
