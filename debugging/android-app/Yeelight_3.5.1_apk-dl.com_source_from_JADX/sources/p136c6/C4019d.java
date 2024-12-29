package p136c6;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9281e;
import org.apache.commons.p194io.FilenameUtils;

/* renamed from: c6.d */
public class C4019d extends C4014b {

    /* renamed from: i */
    private final Map<String, Set<WeakReference<C9281e>>> f6830i = new HashMap();

    /* renamed from: V */
    public void mo26685V(C9281e eVar) {
        String s0 = mo26689s0(eVar.getId());
        synchronized (this) {
            Collection collection = this.f6830i.get(s0);
            if (collection != null) {
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C9281e eVar2 = (C9281e) ((WeakReference) it.next()).get();
                    if (eVar2 == null) {
                        it.remove();
                    } else if (eVar2 == eVar) {
                        it.remove();
                        break;
                    }
                }
                if (collection.isEmpty()) {
                    this.f6830i.remove(s0);
                }
            }
        }
    }

    /* renamed from: d0 */
    public boolean mo26686d0(String str) {
        boolean containsKey;
        synchronized (this) {
            containsKey = this.f6830i.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: l */
    public void mo26687l(C9281e eVar) {
        String s0 = mo26689s0(eVar.getId());
        WeakReference weakReference = new WeakReference(eVar);
        synchronized (this) {
            Set set = this.f6830i.get(s0);
            if (set == null) {
                set = new HashSet();
                this.f6830i.put(s0, set);
            }
            set.add(weakReference);
        }
    }

    /* renamed from: m */
    public String mo26688m(String str, C9277a aVar) {
        String str2 = aVar == null ? null : (String) aVar.mo40040a("org.eclipse.jetty.ajp.JVMRoute");
        if (str2 != null) {
            return str + FilenameUtils.EXTENSION_SEPARATOR + str2;
        } else if (this.f6801g == null) {
            return str;
        } else {
            return str + FilenameUtils.EXTENSION_SEPARATOR + this.f6801g;
        }
    }

    /* renamed from: s0 */
    public String mo26689s0(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf > 0 ? str.substring(0, lastIndexOf) : str;
    }

    /* renamed from: u */
    public void mo26690u(String str) {
        Collection<WeakReference> remove;
        synchronized (this) {
            remove = this.f6830i.remove(str);
        }
        if (remove != null) {
            for (WeakReference weakReference : remove) {
                C4013a aVar = (C4013a) weakReference.get();
                if (aVar != null && aVar.mo26652z()) {
                    aVar.mo26629e();
                }
            }
            remove.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        super.mo26547u0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        this.f6830i.clear();
        super.mo26548v0();
    }
}
