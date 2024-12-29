package p164h.p211a.p212a.p222f.p226y;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.p271io.FilenameUtils;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10713g;

/* renamed from: h.a.a.f.y.d */
public class C11067d extends C11063b {

    /* renamed from: i */
    private final Map<String, Set<WeakReference<C10713g>>> f21802i = new HashMap();

    /* renamed from: U */
    public void mo35022U(C10713g gVar) {
        String n0 = mo35027n0(gVar.getId());
        synchronized (this) {
            Collection collection = this.f21802i.get(n0);
            if (collection != null) {
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C10713g gVar2 = (C10713g) ((WeakReference) it.next()).get();
                    if (gVar2 == null) {
                        it.remove();
                    } else if (gVar2 == gVar) {
                        it.remove();
                        break;
                    }
                }
                if (collection.isEmpty()) {
                    this.f21802i.remove(n0);
                }
            }
        }
    }

    /* renamed from: b0 */
    public boolean mo35023b0(String str) {
        boolean containsKey;
        synchronized (this) {
            containsKey = this.f21802i.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: k */
    public void mo35025k(C10713g gVar) {
        String n0 = mo35027n0(gVar.getId());
        WeakReference weakReference = new WeakReference(gVar);
        synchronized (this) {
            Set set = this.f21802i.get(n0);
            if (set == null) {
                set = new HashSet();
                this.f21802i.put(n0, set);
            }
            set.add(weakReference);
        }
    }

    /* renamed from: l */
    public String mo35026l(String str, C10709c cVar) {
        String str2 = cVar == null ? null : (String) cVar.mo33964a("org.eclipse.jetty.ajp.JVMRoute");
        if (str2 != null) {
            return str + FilenameUtils.EXTENSION_SEPARATOR + str2;
        } else if (this.f21774g == null) {
            return str;
        } else {
            return str + FilenameUtils.EXTENSION_SEPARATOR + this.f21774g;
        }
    }

    /* renamed from: n0 */
    public String mo35027n0(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf > 0 ? str.substring(0, lastIndexOf) : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        super.mo34262p0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        this.f21802i.clear();
        super.mo34263q0();
    }

    /* renamed from: s */
    public void mo35028s(String str) {
        Collection<WeakReference> remove;
        synchronized (this) {
            remove = this.f21802i.remove(str);
        }
        if (remove != null) {
            for (WeakReference weakReference : remove) {
                C11062a aVar = (C11062a) weakReference.get();
                if (aVar != null && aVar.mo35130z()) {
                    aVar.mo33941f();
                }
            }
            remove.clear();
        }
    }
}
