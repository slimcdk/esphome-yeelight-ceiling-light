package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.components.m */
class C2839m {

    /* renamed from: com.google.firebase.components.m$b */
    private static class C2841b {

        /* renamed from: a */
        private final C2825d<?> f5472a;

        /* renamed from: b */
        private final Set<C2841b> f5473b = new HashSet();

        /* renamed from: c */
        private final Set<C2841b> f5474c = new HashSet();

        C2841b(C2825d<?> dVar) {
            this.f5472a = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17095a(C2841b bVar) {
            this.f5473b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo17096b(C2841b bVar) {
            this.f5474c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C2825d<?> mo17097c() {
            return this.f5472a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Set<C2841b> mo17098d() {
            return this.f5473b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo17099e() {
            return this.f5473b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo17100f() {
            return this.f5474c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo17101g(C2841b bVar) {
            this.f5474c.remove(bVar);
        }
    }

    /* renamed from: com.google.firebase.components.m$c */
    private static class C2842c {

        /* renamed from: a */
        private final Class<?> f5475a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f5476b;

        private C2842c(Class<?> cls, boolean z) {
            this.f5475a = cls;
            this.f5476b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2842c)) {
                return false;
            }
            C2842c cVar = (C2842c) obj;
            return cVar.f5475a.equals(this.f5475a) && cVar.f5476b == this.f5476b;
        }

        public int hashCode() {
            return ((this.f5475a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f5476b).hashCode();
        }
    }

    /* renamed from: a */
    static void m8633a(List<C2825d<?>> list) {
        Set<C2841b> c = m8635c(list);
        Set<C2841b> b = m8634b(c);
        int i = 0;
        while (!b.isEmpty()) {
            C2841b next = b.iterator().next();
            b.remove(next);
            i++;
            for (C2841b next2 : next.mo17098d()) {
                next2.mo17101g(next);
                if (next2.mo17100f()) {
                    b.add(next2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C2841b next3 : c) {
                if (!next3.mo17100f() && !next3.mo17099e()) {
                    arrayList.add(next3.mo17097c());
                }
            }
            throw new C2844o(arrayList);
        }
    }

    /* renamed from: b */
    private static Set<C2841b> m8634b(Set<C2841b> set) {
        HashSet hashSet = new HashSet();
        for (C2841b next : set) {
            if (next.mo17100f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<C2841b> m8635c(List<C2825d<?>> list) {
        Set<C2841b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C2825d next : list) {
            C2841b bVar = new C2841b(next);
            Iterator it = next.mo17078e().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    C2842c cVar = new C2842c(cls, !next.mo17082k());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f5476b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<C2841b> it2 : hashMap.values()) {
            for (C2841b bVar2 : it2) {
                for (C2843n next2 : bVar2.mo17097c().mo17076c()) {
                    if (next2.mo17105b() && (set = (Set) hashMap.get(new C2842c(next2.mo17104a(), next2.mo17107d()))) != null) {
                        for (C2841b bVar3 : set) {
                            bVar2.mo17095a(bVar3);
                            bVar3.mo17096b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
