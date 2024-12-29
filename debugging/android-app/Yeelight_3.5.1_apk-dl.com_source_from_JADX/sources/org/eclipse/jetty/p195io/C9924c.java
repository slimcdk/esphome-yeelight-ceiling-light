package org.eclipse.jetty.p195io;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.jetty.p195io.Buffers;
import p225w5.C11940d;

/* renamed from: org.eclipse.jetty.io.c */
public class C9924c extends C9918a {

    /* renamed from: f */
    private final Queue<C11940d> f18176f = new ConcurrentLinkedQueue();

    /* renamed from: g */
    private final Queue<C11940d> f18177g = new ConcurrentLinkedQueue();

    /* renamed from: h */
    private final Queue<C11940d> f18178h = new ConcurrentLinkedQueue();

    /* renamed from: i */
    private final AtomicInteger f18179i = new AtomicInteger();

    /* renamed from: j */
    private final int f18180j;

    /* renamed from: k */
    private final boolean f18181k;

    /* renamed from: l */
    private final boolean f18182l;

    public C9924c(Buffers.Type type, int i, Buffers.Type type2, int i2, Buffers.Type type3, int i3) {
        super(type, i, type2, i2, type3);
        boolean z = true;
        this.f18181k = type == type3;
        this.f18182l = type2 != type3 ? false : z;
        this.f18180j = i3;
    }

    /* renamed from: a */
    public C11940d mo39861a() {
        C11940d poll = this.f18177g.poll();
        if (poll == null) {
            return mo39869i();
        }
        this.f18179i.decrementAndGet();
        return poll;
    }

    /* renamed from: b */
    public void mo39862b(C11940d dVar) {
        dVar.clear();
        if (!dVar.mo42432k0() && !dVar.mo42438r0()) {
            if (this.f18179i.incrementAndGet() > this.f18180j) {
                this.f18179i.decrementAndGet();
            } else {
                (mo39868h(dVar) ? this.f18176f : mo39867g(dVar) ? this.f18177g : this.f18178h).add(dVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p225w5.C11940d mo39863c(int r3) {
        /*
            r2 = this;
            boolean r0 = r2.f18181k
            if (r0 == 0) goto L_0x000f
            int r0 = r2.mo39866f()
            if (r3 != r0) goto L_0x000f
            w5.d r3 = r2.mo39864d()
            return r3
        L_0x000f:
            boolean r0 = r2.f18182l
            if (r0 == 0) goto L_0x001e
            int r0 = r2.mo39865e()
            if (r3 != r0) goto L_0x001e
            w5.d r3 = r2.mo39861a()
            return r3
        L_0x001e:
            java.util.Queue<w5.d> r0 = r2.f18178h
            java.lang.Object r0 = r0.poll()
            w5.d r0 = (p225w5.C11940d) r0
            if (r0 == 0) goto L_0x0034
            int r1 = r0.capacity()
            if (r1 == r3) goto L_0x0034
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f18179i
            r0.decrementAndGet()
            goto L_0x001e
        L_0x0034:
            if (r0 != 0) goto L_0x003b
            w5.d r0 = r2.mo39870j(r3)
            goto L_0x0040
        L_0x003b:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f18179i
            r3.decrementAndGet()
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.p195io.C9924c.mo39863c(int):w5.d");
    }

    /* renamed from: d */
    public C11940d mo39864d() {
        C11940d poll = this.f18176f.poll();
        if (poll == null) {
            return mo39871k();
        }
        this.f18179i.decrementAndGet();
        return poll;
    }

    public String toString() {
        return String.format("%s [%d/%d@%d,%d/%d@%d,%d/%d@-]", new Object[]{C9924c.class.getSimpleName(), Integer.valueOf(this.f18176f.size()), Integer.valueOf(this.f18180j), Integer.valueOf(this.f18162b), Integer.valueOf(this.f18177g.size()), Integer.valueOf(this.f18180j), Integer.valueOf(this.f18164d), Integer.valueOf(this.f18178h.size()), Integer.valueOf(this.f18180j)});
    }
}
