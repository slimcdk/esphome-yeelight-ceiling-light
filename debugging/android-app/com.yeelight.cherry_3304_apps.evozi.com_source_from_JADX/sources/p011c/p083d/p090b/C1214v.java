package p011c.p083d.p090b;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p011c.p083d.p090b.C1173e0;
import p011c.p083d.p090b.C1203t;

/* renamed from: c.d.b.v */
class C1214v extends ThreadPoolExecutor {

    /* renamed from: c.d.b.v$a */
    private static final class C1215a extends FutureTask<C1160c> implements Comparable<C1215a> {

        /* renamed from: a */
        private final C1160c f2102a;

        public C1215a(C1160c cVar) {
            super(cVar, (Object) null);
            this.f2102a = cVar;
        }

        /* renamed from: b */
        public int compareTo(C1215a aVar) {
            C1203t.C1210f q = this.f2102a.mo9927q();
            C1203t.C1210f q2 = aVar.f2102a.mo9927q();
            return q == q2 ? this.f2102a.f1961a - aVar.f2102a.f1961a : q2.ordinal() - q.ordinal();
        }
    }

    C1214v() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1173e0.C1179f());
    }

    /* renamed from: b */
    private void m3126b(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        r4 = 2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10018a(android.net.NetworkInfo r4) {
        /*
            r3 = this;
            r0 = 3
            if (r4 == 0) goto L_0x0034
            boolean r1 = r4.isConnectedOrConnecting()
            if (r1 != 0) goto L_0x000a
            goto L_0x0034
        L_0x000a:
            int r1 = r4.getType()
            r2 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r2) goto L_0x001e
            r4 = 6
            if (r1 == r4) goto L_0x001e
            r4 = 9
            if (r1 == r4) goto L_0x001e
        L_0x001a:
            r3.m3126b(r0)
            goto L_0x0033
        L_0x001e:
            r4 = 4
        L_0x001f:
            r3.m3126b(r4)
            goto L_0x0033
        L_0x0023:
            int r4 = r4.getSubtype()
            switch(r4) {
                case 1: goto L_0x0030;
                case 2: goto L_0x0030;
                case 3: goto L_0x002e;
                case 4: goto L_0x002e;
                case 5: goto L_0x002e;
                case 6: goto L_0x002e;
                default: goto L_0x002a;
            }
        L_0x002a:
            switch(r4) {
                case 12: goto L_0x002e;
                case 13: goto L_0x001a;
                case 14: goto L_0x001a;
                case 15: goto L_0x001a;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x001a
        L_0x002e:
            r4 = 2
            goto L_0x001f
        L_0x0030:
            r3.m3126b(r2)
        L_0x0033:
            return
        L_0x0034:
            r3.m3126b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p090b.C1214v.mo10018a(android.net.NetworkInfo):void");
    }

    public Future<?> submit(Runnable runnable) {
        C1215a aVar = new C1215a((C1160c) runnable);
        execute(aVar);
        return aVar;
    }
}
