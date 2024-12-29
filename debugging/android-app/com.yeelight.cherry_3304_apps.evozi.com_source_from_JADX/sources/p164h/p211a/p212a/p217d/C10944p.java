package p164h.p211a.p212a.p217d;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p164h.p211a.p212a.p217d.C10935i;

/* renamed from: h.a.a.d.p */
public class C10944p extends C10925b {

    /* renamed from: f */
    private final Queue<C10929e> f21324f = new ConcurrentLinkedQueue();

    /* renamed from: g */
    private final Queue<C10929e> f21325g = new ConcurrentLinkedQueue();

    /* renamed from: h */
    private final Queue<C10929e> f21326h = new ConcurrentLinkedQueue();

    /* renamed from: i */
    private final AtomicInteger f21327i = new AtomicInteger();

    /* renamed from: j */
    private final int f21328j;

    /* renamed from: k */
    private final boolean f21329k;

    /* renamed from: l */
    private final boolean f21330l;

    public C10944p(C10935i.C10936a aVar, int i, C10935i.C10936a aVar2, int i2, C10935i.C10936a aVar3, int i3) {
        super(aVar, i, aVar2, i2, aVar3);
        boolean z = true;
        this.f21329k = aVar == aVar3;
        this.f21330l = aVar2 != aVar3 ? false : z;
        this.f21328j = i3;
    }

    /* renamed from: a */
    public C10929e mo34624a() {
        C10929e poll = this.f21325g.poll();
        if (poll == null) {
            return mo34600i();
        }
        this.f21327i.decrementAndGet();
        return poll;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p164h.p211a.p212a.p217d.C10929e mo34625b(int r3) {
        /*
            r2 = this;
            boolean r0 = r2.f21329k
            if (r0 == 0) goto L_0x000f
            int r0 = r2.mo34597f()
            if (r3 != r0) goto L_0x000f
            h.a.a.d.e r3 = r2.mo34626c()
            return r3
        L_0x000f:
            boolean r0 = r2.f21330l
            if (r0 == 0) goto L_0x001e
            int r0 = r2.mo34596e()
            if (r3 != r0) goto L_0x001e
            h.a.a.d.e r3 = r2.mo34624a()
            return r3
        L_0x001e:
            java.util.Queue<h.a.a.d.e> r0 = r2.f21326h
            java.lang.Object r0 = r0.poll()
            h.a.a.d.e r0 = (p164h.p211a.p212a.p217d.C10929e) r0
            if (r0 == 0) goto L_0x0034
            int r1 = r0.capacity()
            if (r1 == r3) goto L_0x0034
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f21327i
            r0.decrementAndGet()
            goto L_0x001e
        L_0x0034:
            if (r0 != 0) goto L_0x003b
            h.a.a.d.e r0 = r2.mo34601j(r3)
            goto L_0x0040
        L_0x003b:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f21327i
            r3.decrementAndGet()
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.C10944p.mo34625b(int):h.a.a.d.e");
    }

    /* renamed from: c */
    public C10929e mo34626c() {
        C10929e poll = this.f21324f.poll();
        if (poll == null) {
            return mo34602k();
        }
        this.f21327i.decrementAndGet();
        return poll;
    }

    /* renamed from: d */
    public void mo34627d(C10929e eVar) {
        eVar.clear();
        if (!eVar.mo34583j0() && !eVar.mo34588r0()) {
            if (this.f21327i.incrementAndGet() > this.f21328j) {
                this.f21327i.decrementAndGet();
            } else {
                (mo34599h(eVar) ? this.f21324f : mo34598g(eVar) ? this.f21325g : this.f21326h).add(eVar);
            }
        }
    }

    public String toString() {
        return String.format("%s [%d/%d@%d,%d/%d@%d,%d/%d@-]", new Object[]{C10944p.class.getSimpleName(), Integer.valueOf(this.f21324f.size()), Integer.valueOf(this.f21328j), Integer.valueOf(this.f21301b), Integer.valueOf(this.f21325g.size()), Integer.valueOf(this.f21328j), Integer.valueOf(this.f21303d), Integer.valueOf(this.f21326h.size()), Integer.valueOf(this.f21328j)});
    }
}
