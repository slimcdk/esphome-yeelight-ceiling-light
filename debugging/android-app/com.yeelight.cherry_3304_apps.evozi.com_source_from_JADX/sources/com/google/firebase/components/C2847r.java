package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import com.google.firebase.p131g.C3192a;
import com.google.firebase.p131g.C3193b;
import com.google.firebase.p131g.C3194c;
import com.google.firebase.p131g.C3195d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.r */
class C2847r implements C3195d, C3194c {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C3193b<Object>, Executor>> f5482a = new HashMap();
    @GuardedBy("this")

    /* renamed from: b */
    private Queue<C3192a<?>> f5483b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f5484c;

    C2847r(Executor executor) {
        this.f5484c = executor;
    }

    /* renamed from: d */
    private synchronized Set<Map.Entry<C3193b<Object>, Executor>> m8653d(C3192a<?> aVar) {
        Map map;
        map = this.f5482a.get(aVar.mo17779b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* renamed from: a */
    public <T> void mo17112a(Class<T> cls, C3193b<? super T> bVar) {
        mo17113b(cls, this.f5484c, bVar);
    }

    /* renamed from: b */
    public synchronized <T> void mo17113b(Class<T> cls, Executor executor, C3193b<? super T> bVar) {
        C2850u.m8660b(cls);
        C2850u.m8660b(bVar);
        C2850u.m8660b(executor);
        if (!this.f5482a.containsKey(cls)) {
            this.f5482a.put(cls, new ConcurrentHashMap());
        }
        this.f5482a.get(cls).put(bVar, executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo17114c() {
        Queue<C3192a<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.f5483b != null) {
                Queue<C3192a<?>> queue2 = this.f5483b;
                this.f5483b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            for (C3192a f : queue) {
                mo17115f(f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(com.google.firebase.components.C2846q.m8652b(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = m8653d(r4).iterator();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17115f(com.google.firebase.p131g.C3192a<?> r4) {
        /*
            r3 = this;
            com.google.firebase.components.C2850u.m8660b(r4)
            monitor-enter(r3)
            java.util.Queue<com.google.firebase.g.a<?>> r0 = r3.f5483b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<com.google.firebase.g.a<?>> r0 = r3.f5483b     // Catch:{ all -> 0x0033 }
            r0.add(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r3.m8653d(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.C2846q.m8652b(r1, r4)
            r2.execute(r1)
            goto L_0x0018
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0036:
            throw r4
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C2847r.mo17115f(com.google.firebase.g.a):void");
    }
}
