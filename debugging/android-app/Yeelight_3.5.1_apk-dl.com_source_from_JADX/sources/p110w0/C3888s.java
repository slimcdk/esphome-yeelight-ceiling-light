package p110w0;

import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p066m1.C3341a;
import p066m1.C3342b;
import p066m1.C3343c;
import p066m1.C3344d;

/* renamed from: w0.s */
class C3888s implements C3344d, C3343c {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C3342b<Object>, Executor>> f6521a = new HashMap();
    @GuardedBy("this")

    /* renamed from: b */
    private Queue<C3341a<?>> f6522b = new ArrayDeque();

    C3888s(Executor executor) {
    }

    /* renamed from: d */
    private synchronized Set<Map.Entry<C3342b<Object>, Executor>> m11066d(C3341a<?> aVar) {
        Map map;
        map = this.f6521a.get(aVar.mo24067b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* renamed from: a */
    public synchronized <T> void mo24070a(Class<T> cls, Executor executor, C3342b<? super T> bVar) {
        C3892z.m11086b(cls);
        C3892z.m11086b(bVar);
        C3892z.m11086b(executor);
        if (!this.f6521a.containsKey(cls)) {
            this.f6521a.put(cls, new ConcurrentHashMap());
        }
        this.f6521a.get(cls).put(bVar, executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo26375c() {
        Queue<C3341a<?>> queue;
        synchronized (this) {
            queue = this.f6522b;
            if (queue != null) {
                this.f6522b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C3341a f : queue) {
                mo26376f(f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new p110w0.C10562r(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = m11066d(r5).iterator();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26376f(p066m1.C3341a<?> r5) {
        /*
            r4 = this;
            p110w0.C3892z.m11086b(r5)
            monitor-enter(r4)
            java.util.Queue<m1.a<?>> r0 = r4.f6522b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.m11066d(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            w0.r r3 = new w0.r
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            goto L_0x0036
        L_0x0035:
            throw r5
        L_0x0036:
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: p110w0.C3888s.mo26376f(m1.a):void");
    }
}
