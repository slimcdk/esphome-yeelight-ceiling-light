package p154d.p198a.p199g;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p154d.p198a.p199g.p200r.C10680d;
import p154d.p198a.p199g.p200r.C10681e;

/* renamed from: d.a.g.a */
public class C10617a extends AbstractMap<String, List<? extends C10620b>> {

    /* renamed from: a */
    private transient Set<Map.Entry<String, List<? extends C10620b>>> f20296a;

    /* renamed from: d.a.g.a$a */
    protected static class C10618a implements Map.Entry<String, List<? extends C10620b>> {

        /* renamed from: a */
        private List<? extends C10620b> f20297a;

        /* renamed from: b */
        private String f20298b;

        protected C10618a(String str, List<? extends C10620b> list) {
            this.f20298b = str != null ? str.trim().toLowerCase() : null;
            this.f20297a = list;
        }

        /* renamed from: a */
        public String getKey() {
            String str = this.f20298b;
            return str != null ? str : "";
        }

        /* renamed from: b */
        public List<? extends C10620b> getValue() {
            return this.f20297a;
        }

        /* renamed from: c */
        public List<? extends C10620b> setValue(List<? extends C10620b> list) {
            List<? extends C10620b> list2 = this.f20297a;
            this.f20297a = list;
            return list2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return getKey().equals(entry.getKey()) && getValue().equals(entry.getValue());
        }

        public int hashCode() {
            String str = this.f20298b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public synchronized String toString() {
            StringBuffer stringBuffer;
            stringBuffer = new StringBuffer(200);
            stringBuffer.append("\n\t\tname '");
            stringBuffer.append(this.f20298b);
            stringBuffer.append("' ");
            if (this.f20297a == null || this.f20297a.isEmpty()) {
                stringBuffer.append(" no entries");
            } else {
                for (C10620b bVar : this.f20297a) {
                    stringBuffer.append("\n\t\t\t");
                    stringBuffer.append(bVar.toString());
                }
            }
            return stringBuffer.toString();
        }
    }

    /* renamed from: d.a.g.a$b */
    static final class C10619b extends C10617a {
        C10619b() {
        }

        public boolean containsKey(Object obj) {
            return false;
        }

        public boolean containsValue(Object obj) {
            return false;
        }

        public Set<Map.Entry<String, List<? extends C10620b>>> entrySet() {
            return Collections.emptySet();
        }

        public boolean equals(Object obj) {
            return (obj instanceof Map) && ((Map) obj).size() == 0;
        }

        public int hashCode() {
            return 0;
        }

        /* renamed from: i */
        public List<? extends C10620b> put(String str, List<? extends C10620b> list) {
            return null;
        }

        public boolean isEmpty() {
            return true;
        }

        public Set<String> keySet() {
            return Collections.emptySet();
        }

        /* renamed from: l */
        public List<C10620b> get(Object obj) {
            return null;
        }

        public int size() {
            return 0;
        }

        public Collection<List<? extends C10620b>> values() {
            return Collections.emptySet();
        }
    }

    static {
        new C10619b();
    }

    public C10617a() {
        this(1024);
    }

    public C10617a(int i) {
        this.f20296a = null;
        this.f20296a = new HashSet(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10617a(C10617a aVar) {
        this(aVar != null ? aVar.size() : 1024);
        if (aVar != null) {
            putAll(aVar);
        }
    }

    /* renamed from: a */
    private Collection<? extends C10620b> m25945a(String str) {
        return (Collection) get(str != null ? str.toLowerCase() : null);
    }

    /* renamed from: b */
    public synchronized boolean mo33488b(C10620b bVar) {
        boolean z;
        z = false;
        if (bVar != null) {
            Map.Entry<String, List<? extends C10620b>> h = mo33496h(bVar.mo33522b());
            ArrayList arrayList = h != null ? new ArrayList(h.getValue()) : new ArrayList();
            arrayList.add(bVar);
            if (h != null) {
                h.setValue(arrayList);
            } else {
                entrySet().add(new C10618a(bVar.mo33522b(), arrayList));
            }
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public synchronized Collection<C10620b> mo33489c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (List list : values()) {
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        return new C10617a(this);
    }

    /* renamed from: d */
    public synchronized C10620b mo33491d(String str, C10681e eVar, C10680d dVar) {
        C10620b bVar;
        C10620b bVar2;
        bVar = null;
        Collection<? extends C10620b> a = m25945a(str);
        if (a != null) {
            Iterator<? extends C10620b> it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                bVar2 = (C10620b) it.next();
                if (!bVar2.mo33527f().equals(eVar) || (C10680d.CLASS_ANY != dVar && !bVar2.mo33525e().equals(dVar))) {
                }
            }
            bVar = bVar2;
        }
        return bVar;
    }

    /* renamed from: e */
    public synchronized C10620b mo33492e(C10620b bVar) {
        C10620b bVar2;
        bVar2 = null;
        if (bVar != null) {
            Collection<? extends C10620b> a = m25945a(bVar.mo33522b());
            if (a != null) {
                Iterator<? extends C10620b> it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C10620b bVar3 = (C10620b) it.next();
                    if (bVar3.mo33534l(bVar)) {
                        bVar2 = bVar3;
                        break;
                    }
                }
            }
        }
        return bVar2;
    }

    public Set<Map.Entry<String, List<? extends C10620b>>> entrySet() {
        if (this.f20296a == null) {
            this.f20296a = new HashSet();
        }
        return this.f20296a;
    }

    /* renamed from: f */
    public synchronized Collection<? extends C10620b> mo33494f(String str) {
        Collection<? extends C10620b> a;
        a = m25945a(str);
        return a != null ? new ArrayList<>(a) : Collections.emptyList();
    }

    /* renamed from: g */
    public synchronized Collection<? extends C10620b> mo33495g(String str, C10681e eVar, C10680d dVar) {
        Collection<? extends C10620b> collection;
        Collection<? extends C10620b> a = m25945a(str);
        if (a != null) {
            collection = new ArrayList<>(a);
            Iterator<? extends C10620b> it = collection.iterator();
            while (it.hasNext()) {
                C10620b bVar = (C10620b) it.next();
                if (!bVar.mo33527f().equals(eVar) || (C10680d.CLASS_ANY != dVar && !bVar.mo33525e().equals(dVar))) {
                    it.remove();
                }
            }
        } else {
            collection = Collections.emptyList();
        }
        return collection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Map.Entry<String, List<? extends C10620b>> mo33496h(String str) {
        String lowerCase = str != null ? str.trim().toLowerCase() : null;
        for (Map.Entry<String, List<? extends C10620b>> next : entrySet()) {
            String key = next.getKey();
            if (lowerCase != null) {
                if (lowerCase.equals(key)) {
                    return next;
                }
            } else if (key == null) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    public List<? extends C10620b> put(String str, List<? extends C10620b> list) {
        List<? extends C10620b> list2;
        synchronized (this) {
            list2 = null;
            Map.Entry<String, List<? extends C10620b>> h = mo33496h(str);
            if (h != null) {
                list2 = h.setValue(list);
            } else {
                entrySet().add(new C10618a(str, list));
            }
        }
        return list2;
    }

    /* renamed from: j */
    public synchronized boolean mo33498j(C10620b bVar) {
        boolean z;
        z = false;
        if (bVar != null) {
            Map.Entry<String, List<? extends C10620b>> h = mo33496h(bVar.mo33522b());
            if (h != null) {
                z = h.getValue().remove(bVar);
                if (h.getValue().isEmpty()) {
                    entrySet().remove(h);
                }
            }
        }
        return z;
    }

    /* renamed from: k */
    public synchronized boolean mo33499k(C10620b bVar, C10620b bVar2) {
        boolean z;
        z = false;
        if (!(bVar == null || bVar2 == null)) {
            if (bVar.mo33522b().equals(bVar2.mo33522b())) {
                Map.Entry<String, List<? extends C10620b>> h = mo33496h(bVar.mo33522b());
                ArrayList arrayList = h != null ? new ArrayList(h.getValue()) : new ArrayList();
                arrayList.remove(bVar2);
                arrayList.add(bVar);
                if (h != null) {
                    h.setValue(arrayList);
                } else {
                    entrySet().add(new C10618a(bVar.mo33522b(), arrayList));
                }
                z = true;
            }
        }
        return z;
    }

    public synchronized String toString() {
        StringBuffer stringBuffer;
        stringBuffer = new StringBuffer(2000);
        stringBuffer.append("\t---- cache ----");
        for (Map.Entry<String, List<? extends C10620b>> obj : entrySet()) {
            stringBuffer.append("\n\t\t");
            stringBuffer.append(obj.toString());
        }
        return stringBuffer.toString();
    }
}
