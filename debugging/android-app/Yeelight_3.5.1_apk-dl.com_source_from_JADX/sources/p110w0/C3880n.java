package p110w0;

import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p045i1.C3248a;
import p066m1.C3343c;
import p066m1.C3344d;
import p077o1.C3500a;
import p077o1.C3502b;

/* renamed from: w0.n */
public class C3880n extends C3867a implements C3248a {

    /* renamed from: g */
    private static final C3502b<Set<Object>> f6503g = C10560m.f19721a;

    /* renamed from: a */
    private final Map<C3870d<?>, C3502b<?>> f6504a;

    /* renamed from: b */
    private final Map<Class<?>, C3502b<?>> f6505b;

    /* renamed from: c */
    private final Map<Class<?>, C3890u<?>> f6506c;

    /* renamed from: d */
    private final List<C3502b<C3879i>> f6507d;

    /* renamed from: e */
    private final C3888s f6508e;

    /* renamed from: f */
    private final AtomicReference<Boolean> f6509f;

    /* renamed from: w0.n$b */
    public static final class C3882b {

        /* renamed from: a */
        private final Executor f6510a;

        /* renamed from: b */
        private final List<C3502b<C3879i>> f6511b = new ArrayList();

        /* renamed from: c */
        private final List<C3870d<?>> f6512c = new ArrayList();

        C3882b(Executor executor) {
            this.f6510a = executor;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ C3879i m11038f(C3879i iVar) {
            return iVar;
        }

        /* renamed from: b */
        public C3882b mo26354b(C3870d<?> dVar) {
            this.f6512c.add(dVar);
            return this;
        }

        /* renamed from: c */
        public C3882b mo26355c(C3879i iVar) {
            this.f6511b.add(new C10561o(iVar));
            return this;
        }

        /* renamed from: d */
        public C3882b mo26356d(Collection<C3502b<C3879i>> collection) {
            this.f6511b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C3880n mo26357e() {
            return new C3880n(this.f6510a, this.f6511b, this.f6512c);
        }
    }

    private C3880n(Executor executor, Iterable<C3502b<C3879i>> iterable, Collection<C3870d<?>> collection) {
        this.f6504a = new HashMap();
        this.f6505b = new HashMap();
        this.f6506c = new HashMap();
        this.f6509f = new AtomicReference<>();
        C3888s sVar = new C3888s(executor);
        this.f6508e = sVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3870d.m10988p(sVar, C3888s.class, C3344d.class, C3343c.class));
        arrayList.add(C3870d.m10988p(this, C3248a.class, new Class[0]));
        for (C3870d next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f6507d = m11025m(iterable);
        m11023j(arrayList);
    }

    /* renamed from: i */
    public static C3882b m11022i(Executor executor) {
        return new C3882b(executor);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.remove();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002b */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11023j(java.util.List<p110w0.C3870d<?>> r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r5)
            java.util.List<o1.b<w0.i>> r1 = r5.f6507d     // Catch:{ all -> 0x0096 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0096 }
        L_0x000c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0096 }
            o1.b r2 = (p077o1.C3502b) r2     // Catch:{ all -> 0x0096 }
            java.lang.Object r2 = r2.get()     // Catch:{ InvalidRegistrarException -> 0x002b }
            w0.i r2 = (p110w0.C3879i) r2     // Catch:{ InvalidRegistrarException -> 0x002b }
            if (r2 == 0) goto L_0x000c
            java.util.List r2 = r2.getComponents()     // Catch:{ InvalidRegistrarException -> 0x002b }
            r6.addAll(r2)     // Catch:{ InvalidRegistrarException -> 0x002b }
            r1.remove()     // Catch:{ InvalidRegistrarException -> 0x002b }
            goto L_0x000c
        L_0x002b:
            r1.remove()     // Catch:{ all -> 0x0096 }
            goto L_0x000c
        L_0x002f:
            java.util.Map<w0.d<?>, o1.b<?>> r1 = r5.f6504a     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x003b
            p110w0.C3883p.m11043a(r6)     // Catch:{ all -> 0x0096 }
            goto L_0x004c
        L_0x003b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0096 }
            java.util.Map<w0.d<?>, o1.b<?>> r2 = r5.f6504a     // Catch:{ all -> 0x0096 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0096 }
            r1.<init>(r2)     // Catch:{ all -> 0x0096 }
            r1.addAll(r6)     // Catch:{ all -> 0x0096 }
            p110w0.C3883p.m11043a(r1)     // Catch:{ all -> 0x0096 }
        L_0x004c:
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0096 }
        L_0x0050:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x006c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0096 }
            w0.d r2 = (p110w0.C3870d) r2     // Catch:{ all -> 0x0096 }
            w0.t r3 = new w0.t     // Catch:{ all -> 0x0096 }
            w0.l r4 = new w0.l     // Catch:{ all -> 0x0096 }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0096 }
            r3.<init>(r4)     // Catch:{ all -> 0x0096 }
            java.util.Map<w0.d<?>, o1.b<?>> r4 = r5.f6504a     // Catch:{ all -> 0x0096 }
            r4.put(r2, r3)     // Catch:{ all -> 0x0096 }
            goto L_0x0050
        L_0x006c:
            java.util.List r6 = r5.m11031s(r6)     // Catch:{ all -> 0x0096 }
            r0.addAll(r6)     // Catch:{ all -> 0x0096 }
            java.util.List r6 = r5.m11032t()     // Catch:{ all -> 0x0096 }
            r0.addAll(r6)     // Catch:{ all -> 0x0096 }
            r5.m11030r()     // Catch:{ all -> 0x0096 }
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            java.util.Iterator r6 = r0.iterator()
        L_0x0082:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r6.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x0082
        L_0x0092:
            r5.m11029q()
            return
        L_0x0096:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            goto L_0x009a
        L_0x0099:
            throw r6
        L_0x009a:
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: p110w0.C3880n.m11023j(java.util.List):void");
    }

    /* renamed from: k */
    private void m11024k(Map<C3870d<?>, C3502b<?>> map, boolean z) {
        for (Map.Entry next : map.entrySet()) {
            C3870d dVar = (C3870d) next.getKey();
            C3502b bVar = (C3502b) next.getValue();
            if (dVar.mo26342k() || (dVar.mo26343l() && z)) {
                bVar.get();
            }
        }
        this.f6508e.mo26375c();
    }

    /* renamed from: m */
    private static <T> List<T> m11025m(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m11026n(C3870d dVar) {
        return dVar.mo26339f().mo18499a(new C3868a0(dVar, this));
    }

    /* renamed from: q */
    private void m11029q() {
        Boolean bool = this.f6509f.get();
        if (bool != null) {
            m11024k(this.f6504a, bool.booleanValue());
        }
    }

    /* renamed from: r */
    private void m11030r() {
        Map map;
        Class<?> c;
        Object e;
        for (C3870d next : this.f6504a.keySet()) {
            Iterator<C3887q> it = next.mo26338e().iterator();
            while (true) {
                if (it.hasNext()) {
                    C3887q next2 = it.next();
                    if (next2.mo26372g() && !this.f6506c.containsKey(next2.mo26367c())) {
                        map = this.f6506c;
                        c = next2.mo26367c();
                        e = C3890u.m11071b(Collections.emptySet());
                    } else if (this.f6505b.containsKey(next2.mo26367c())) {
                        continue;
                    } else if (next2.mo26371f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.mo26367c()}));
                    } else if (!next2.mo26372g()) {
                        map = this.f6505b;
                        c = next2.mo26367c();
                        e = C3891y.m11078e();
                    }
                    map.put(c, e);
                }
            }
        }
    }

    /* renamed from: s */
    private List<Runnable> m11031s(List<C3870d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C3870d next : list) {
            if (next.mo26344m()) {
                C3502b bVar = this.f6504a.get(next);
                for (Class cls : next.mo26340g()) {
                    if (!this.f6505b.containsKey(cls)) {
                        this.f6505b.put(cls, bVar);
                    } else {
                        arrayList.add(new C10558k((C3891y) this.f6505b.get(cls), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    private List<Runnable> m11032t() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f6504a.entrySet()) {
            C3870d dVar = (C3870d) next.getKey();
            if (!dVar.mo26344m()) {
                C3502b bVar = (C3502b) next.getValue();
                for (Class cls : dVar.mo26340g()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f6506c.containsKey(entry.getKey())) {
                this.f6506c.put((Class) entry.getKey(), C3890u.m11071b((Collection) entry.getValue()));
            } else {
                C3890u uVar = this.f6506c.get(entry.getKey());
                for (C3502b jVar : (Set) entry.getValue()) {
                    arrayList.add(new C10557j(uVar, jVar));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public synchronized <T> C3502b<T> mo26335b(Class<T> cls) {
        C3892z.m11087c(cls, "Null interface requested.");
        return this.f6505b.get(cls);
    }

    /* renamed from: c */
    public synchronized <T> C3502b<Set<T>> mo26336c(Class<T> cls) {
        C3890u uVar = this.f6506c.get(cls);
        if (uVar != null) {
            return uVar;
        }
        return f6503g;
    }

    /* renamed from: e */
    public <T> C3500a<T> mo26337e(Class<T> cls) {
        C3502b<T> b = mo26335b(cls);
        return b == null ? C3891y.m11078e() : b instanceof C3891y ? (C3891y) b : C3891y.m11082i(b);
    }

    /* renamed from: l */
    public void mo26353l(boolean z) {
        HashMap hashMap;
        if (this.f6509f.compareAndSet((Object) null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f6504a);
            }
            m11024k(hashMap, z);
        }
    }
}
