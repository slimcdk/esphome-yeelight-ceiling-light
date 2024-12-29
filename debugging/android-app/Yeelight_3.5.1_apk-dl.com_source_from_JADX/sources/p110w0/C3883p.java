package p110w0;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: w0.p */
class C3883p {

    /* renamed from: w0.p$b */
    private static class C3885b {

        /* renamed from: a */
        private final C3870d<?> f6513a;

        /* renamed from: b */
        private final Set<C3885b> f6514b = new HashSet();

        /* renamed from: c */
        private final Set<C3885b> f6515c = new HashSet();

        C3885b(C3870d<?> dVar) {
            this.f6513a = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo26358a(C3885b bVar) {
            this.f6514b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo26359b(C3885b bVar) {
            this.f6515c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3870d<?> mo26360c() {
            return this.f6513a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Set<C3885b> mo26361d() {
            return this.f6514b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo26362e() {
            return this.f6514b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo26363f() {
            return this.f6515c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo26364g(C3885b bVar) {
            this.f6515c.remove(bVar);
        }
    }

    /* renamed from: w0.p$c */
    private static class C3886c {

        /* renamed from: a */
        private final Class<?> f6516a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f6517b;

        private C3886c(Class<?> cls, boolean z) {
            this.f6516a = cls;
            this.f6517b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3886c)) {
                return false;
            }
            C3886c cVar = (C3886c) obj;
            return cVar.f6516a.equals(this.f6516a) && cVar.f6517b == this.f6517b;
        }

        public int hashCode() {
            return ((this.f6516a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f6517b).hashCode();
        }
    }

    /* renamed from: a */
    static void m11043a(List<C3870d<?>> list) {
        Set<C3885b> c = m11045c(list);
        Set<C3885b> b = m11044b(c);
        int i = 0;
        while (!b.isEmpty()) {
            C3885b next = b.iterator().next();
            b.remove(next);
            i++;
            for (C3885b next2 : next.mo26361d()) {
                next2.mo26364g(next);
                if (next2.mo26363f()) {
                    b.add(next2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C3885b next3 : c) {
                if (!next3.mo26363f() && !next3.mo26362e()) {
                    arrayList.add(next3.mo26360c());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    /* renamed from: b */
    private static Set<C3885b> m11044b(Set<C3885b> set) {
        HashSet hashSet = new HashSet();
        for (C3885b next : set) {
            if (next.mo26363f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<C3885b> m11045c(List<C3870d<?>> list) {
        Set<C3885b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C3870d next : list) {
            C3885b bVar = new C3885b(next);
            Iterator it = next.mo26340g().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    C3886c cVar = new C3886c(cls, !next.mo26344m());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f6517b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<C3885b> it2 : hashMap.values()) {
            for (C3885b bVar2 : it2) {
                for (C3887q next2 : bVar2.mo26360c().mo26338e()) {
                    if (next2.mo26369e() && (set = (Set) hashMap.get(new C3886c(next2.mo26367c(), next2.mo26372g()))) != null) {
                        for (C3885b bVar3 : set) {
                            bVar2.mo26358a(bVar3);
                            bVar3.mo26359b(bVar2);
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
