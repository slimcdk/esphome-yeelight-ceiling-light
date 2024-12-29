package com.google.firebase.components;

import com.google.firebase.p131g.C3194c;
import com.google.firebase.p131g.C3195d;
import com.google.firebase.p133i.C3201a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.l */
public class C2838l extends C2822a {

    /* renamed from: e */
    private static final C3201a<Set<Object>> f5467e = C2837k.m8624a();

    /* renamed from: a */
    private final Map<C2825d<?>, C2848s<?>> f5468a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, C2848s<?>> f5469b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, C2848s<Set<?>>> f5470c = new HashMap();

    /* renamed from: d */
    private final C2847r f5471d;

    public C2838l(Executor executor, Iterable<C2834h> iterable, C2825d<?>... dVarArr) {
        this.f5471d = new C2847r(executor);
        ArrayList<C2825d> arrayList = new ArrayList<>();
        arrayList.add(C2825d.m8593n(this.f5471d, C2847r.class, C3195d.class, C3194c.class));
        for (C2834h components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        for (C2825d<?> dVar : dVarArr) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        C2839m.m8633a(arrayList);
        for (C2825d dVar2 : arrayList) {
            this.f5468a.put(dVar2, new C2848s(C2835i.m8622a(this, dVar2)));
        }
        m8627h();
        m8628i();
    }

    /* renamed from: g */
    static /* synthetic */ Set m8626g(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((C2848s) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: h */
    private void m8627h() {
        for (Map.Entry next : this.f5468a.entrySet()) {
            C2825d dVar = (C2825d) next.getKey();
            if (dVar.mo17082k()) {
                C2848s sVar = (C2848s) next.getValue();
                for (Class put : dVar.mo17078e()) {
                    this.f5469b.put(put, sVar);
                }
            }
        }
        m8629j();
    }

    /* renamed from: i */
    private void m8628i() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f5468a.entrySet()) {
            C2825d dVar = (C2825d) next.getKey();
            if (!dVar.mo17082k()) {
                C2848s sVar = (C2848s) next.getValue();
                for (Class cls : dVar.mo17078e()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(sVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f5470c.put((Class) entry.getKey(), new C2848s(C2836j.m8623a((Set) entry.getValue())));
        }
    }

    /* renamed from: j */
    private void m8629j() {
        for (C2825d next : this.f5468a.keySet()) {
            Iterator<C2843n> it = next.mo17076c().iterator();
            while (true) {
                if (it.hasNext()) {
                    C2843n next2 = it.next();
                    if (next2.mo17106c() && !this.f5469b.containsKey(next2.mo17104a())) {
                        throw new C2849t(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.mo17104a()}));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public <T> C3201a<T> mo17089b(Class<T> cls) {
        C2850u.m8661c(cls, "Null interface requested.");
        return this.f5469b.get(cls);
    }

    /* renamed from: c */
    public <T> C3201a<Set<T>> mo17090c(Class<T> cls) {
        C2848s sVar = this.f5470c.get(cls);
        return sVar != null ? sVar : f5467e;
    }

    /* renamed from: e */
    public void mo17094e(boolean z) {
        for (Map.Entry next : this.f5468a.entrySet()) {
            C2825d dVar = (C2825d) next.getKey();
            C2848s sVar = (C2848s) next.getValue();
            if (dVar.mo17080i() || (dVar.mo17081j() && z)) {
                sVar.get();
            }
        }
        this.f5471d.mo17114c();
    }
}
