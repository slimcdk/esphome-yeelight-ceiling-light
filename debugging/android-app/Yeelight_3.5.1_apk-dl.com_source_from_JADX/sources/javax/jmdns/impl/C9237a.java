package javax.jmdns.impl;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

/* renamed from: javax.jmdns.impl.a */
public class C9237a extends AbstractMap<String, List<? extends C9240b>> {

    /* renamed from: a */
    private transient Set<Map.Entry<String, List<? extends C9240b>>> f17120a;

    /* renamed from: javax.jmdns.impl.a$a */
    protected static class C9238a implements Map.Entry<String, List<? extends C9240b>> {

        /* renamed from: a */
        private List<? extends C9240b> f17121a;

        /* renamed from: b */
        private String f17122b;

        protected C9238a(String str, List<? extends C9240b> list) {
            this.f17122b = str != null ? str.trim().toLowerCase() : null;
            this.f17121a = list;
        }

        /* renamed from: a */
        public String getKey() {
            String str = this.f17122b;
            return str != null ? str : "";
        }

        /* renamed from: b */
        public List<? extends C9240b> getValue() {
            return this.f17121a;
        }

        /* renamed from: c */
        public List<? extends C9240b> setValue(List<? extends C9240b> list) {
            List<? extends C9240b> list2 = this.f17121a;
            this.f17121a = list;
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
            String str = this.f17122b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public synchronized String toString() {
            StringBuffer stringBuffer;
            stringBuffer = new StringBuffer(200);
            stringBuffer.append("\n\t\tname '");
            stringBuffer.append(this.f17122b);
            stringBuffer.append("' ");
            List<? extends C9240b> list = this.f17121a;
            if (list == null || list.isEmpty()) {
                stringBuffer.append(" no entries");
            } else {
                for (C9240b bVar : this.f17121a) {
                    stringBuffer.append("\n\t\t\t");
                    stringBuffer.append(bVar.toString());
                }
            }
            return stringBuffer.toString();
        }
    }

    /* renamed from: javax.jmdns.impl.a$b */
    static final class C9239b extends C9237a {
        C9239b() {
        }

        public boolean containsKey(Object obj) {
            return false;
        }

        public boolean containsValue(Object obj) {
            return false;
        }

        public Set<Map.Entry<String, List<? extends C9240b>>> entrySet() {
            return Collections.emptySet();
        }

        public boolean equals(Object obj) {
            return (obj instanceof Map) && ((Map) obj).size() == 0;
        }

        public int hashCode() {
            return 0;
        }

        /* renamed from: i */
        public List<? extends C9240b> put(String str, List<? extends C9240b> list) {
            return null;
        }

        public boolean isEmpty() {
            return true;
        }

        public Set<String> keySet() {
            return Collections.emptySet();
        }

        /* renamed from: l */
        public List<C9240b> get(Object obj) {
            return null;
        }

        public int size() {
            return 0;
        }

        public Collection<List<? extends C9240b>> values() {
            return Collections.emptySet();
        }
    }

    static {
        new C9239b();
    }

    public C9237a() {
        this(1024);
    }

    public C9237a(int i) {
        this.f17120a = null;
        this.f17120a = new HashSet(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C9237a(C9237a aVar) {
        this(aVar != null ? aVar.size() : 1024);
        if (aVar != null) {
            putAll(aVar);
        }
    }

    /* renamed from: a */
    private Collection<? extends C9240b> m22451a(String str) {
        return (Collection) get(str != null ? str.toLowerCase() : null);
    }

    /* renamed from: b */
    public synchronized boolean mo37519b(C9240b bVar) {
        boolean z;
        z = false;
        if (bVar != null) {
            Map.Entry<String, List<? extends C9240b>> h = mo37527h(bVar.mo37553b());
            ArrayList arrayList = h != null ? new ArrayList(h.getValue()) : new ArrayList();
            arrayList.add(bVar);
            if (h != null) {
                h.setValue(arrayList);
            } else {
                entrySet().add(new C9238a(bVar.mo37553b(), arrayList));
            }
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public synchronized Collection<C9240b> mo37520c() {
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
        return new C9237a(this);
    }

    /* renamed from: d */
    public synchronized C9240b mo37522d(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass) {
        C9240b bVar;
        C9240b bVar2;
        bVar = null;
        Collection<? extends C9240b> a = m22451a(str);
        if (a != null) {
            Iterator<? extends C9240b> it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                bVar2 = (C9240b) it.next();
                if (!bVar2.mo37558f().equals(dNSRecordType) || (DNSRecordClass.CLASS_ANY != dNSRecordClass && !bVar2.mo37556e().equals(dNSRecordClass))) {
                }
            }
            bVar = bVar2;
        }
        return bVar;
    }

    /* renamed from: e */
    public synchronized C9240b mo37523e(C9240b bVar) {
        C9240b bVar2;
        bVar2 = null;
        if (bVar != null) {
            Collection<? extends C9240b> a = m22451a(bVar.mo37553b());
            if (a != null) {
                Iterator<? extends C9240b> it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C9240b bVar3 = (C9240b) it.next();
                    if (bVar3.mo37565l(bVar)) {
                        bVar2 = bVar3;
                        break;
                    }
                }
            }
        }
        return bVar2;
    }

    public Set<Map.Entry<String, List<? extends C9240b>>> entrySet() {
        if (this.f17120a == null) {
            this.f17120a = new HashSet();
        }
        return this.f17120a;
    }

    /* renamed from: f */
    public synchronized Collection<? extends C9240b> mo37525f(String str) {
        Collection<? extends C9240b> a;
        a = m22451a(str);
        return a != null ? new ArrayList<>(a) : Collections.emptyList();
    }

    /* renamed from: g */
    public synchronized Collection<? extends C9240b> mo37526g(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass) {
        Collection<? extends C9240b> collection;
        Collection<? extends C9240b> a = m22451a(str);
        if (a != null) {
            collection = new ArrayList<>(a);
            Iterator<? extends C9240b> it = collection.iterator();
            while (it.hasNext()) {
                C9240b bVar = (C9240b) it.next();
                if (!bVar.mo37558f().equals(dNSRecordType) || (DNSRecordClass.CLASS_ANY != dNSRecordClass && !bVar.mo37556e().equals(dNSRecordClass))) {
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
    public Map.Entry<String, List<? extends C9240b>> mo37527h(String str) {
        String lowerCase = str != null ? str.trim().toLowerCase() : null;
        for (Map.Entry<String, List<? extends C9240b>> next : entrySet()) {
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
    public List<? extends C9240b> put(String str, List<? extends C9240b> list) {
        List<? extends C9240b> list2;
        synchronized (this) {
            list2 = null;
            Map.Entry<String, List<? extends C9240b>> h = mo37527h(str);
            if (h != null) {
                list2 = h.setValue(list);
            } else {
                entrySet().add(new C9238a(str, list));
            }
        }
        return list2;
    }

    /* renamed from: j */
    public synchronized boolean mo37529j(C9240b bVar) {
        boolean z;
        z = false;
        if (bVar != null) {
            Map.Entry<String, List<? extends C9240b>> h = mo37527h(bVar.mo37553b());
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
    public synchronized boolean mo37530k(C9240b bVar, C9240b bVar2) {
        boolean z;
        z = false;
        if (!(bVar == null || bVar2 == null)) {
            if (bVar.mo37553b().equals(bVar2.mo37553b())) {
                Map.Entry<String, List<? extends C9240b>> h = mo37527h(bVar.mo37553b());
                ArrayList arrayList = h != null ? new ArrayList(h.getValue()) : new ArrayList();
                arrayList.remove(bVar2);
                arrayList.add(bVar);
                if (h != null) {
                    h.setValue(arrayList);
                } else {
                    entrySet().add(new C9238a(bVar.mo37553b(), arrayList));
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
        for (Map.Entry<String, List<? extends C9240b>> obj : entrySet()) {
            stringBuffer.append("\n\t\t");
            stringBuffer.append(obj.toString());
        }
        return stringBuffer.toString();
    }
}
