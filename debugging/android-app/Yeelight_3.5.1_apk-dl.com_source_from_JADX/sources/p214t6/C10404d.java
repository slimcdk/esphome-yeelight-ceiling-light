package p214t6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.fourthline.cling.model.C10018f;
import org.fourthline.cling.model.C10022j;
import org.fourthline.cling.model.meta.C10066a;
import org.fourthline.cling.model.meta.C10070e;
import org.fourthline.cling.model.meta.C10071f;
import org.fourthline.cling.model.types.C10097r;
import org.fourthline.cling.model.types.C10098s;
import p193o6.C9791c;
import p226w6.C11957c;

/* renamed from: t6.d */
public class C10404d<T> extends C10070e<C10403c, C10404d> {

    /* renamed from: g */
    protected final Map<C10066a, C9791c> f19478g;

    /* renamed from: h */
    protected final Map<C10071f, C11957c> f19479h;

    /* renamed from: i */
    protected final Set<Class> f19480i;

    /* renamed from: j */
    protected final boolean f19481j;

    /* renamed from: k */
    protected C10022j f19482k;

    public C10404d(C10098s sVar, C10097r rVar, Map<C10066a, C9791c> map, Map<C10071f, C11957c> map2, Set<Class> set, boolean z) {
        super(sVar, rVar, (C10066a[]) map.keySet().toArray(new C10066a[map.size()]), (C10071f[]) map2.keySet().toArray(new C10071f[map2.size()]));
        this.f19481j = z;
        this.f19480i = set;
        this.f19479h = map2;
        this.f19478g = map;
    }

    public C10404d(C10098s sVar, C10097r rVar, C10066a[] aVarArr, C10071f[] fVarArr) {
        super(sVar, rVar, aVarArr, fVarArr);
        this.f19482k = null;
        this.f19478g = new HashMap();
        this.f19479h = new HashMap();
        this.f19480i = new HashSet();
        this.f19481j = true;
    }

    /* renamed from: n */
    public C11957c mo42072n(String str) {
        C10071f h = mo40535h(str);
        if (h != null) {
            return mo42073o(h);
        }
        return null;
    }

    /* renamed from: o */
    public C11957c mo42073o(C10071f fVar) {
        return this.f19479h.get(fVar);
    }

    /* renamed from: p */
    public C9791c mo42074p(C10066a aVar) {
        return this.f19478g.get(aVar);
    }

    /* renamed from: q */
    public synchronized C10022j<T> mo42075q() {
        C10022j<T> jVar;
        jVar = this.f19482k;
        if (jVar == null) {
            throw new IllegalStateException("Unmanaged service, no implementation instance available");
        }
        return jVar;
    }

    /* renamed from: r */
    public Set<Class> mo42076r() {
        return this.f19480i;
    }

    /* renamed from: s */
    public boolean mo42077s(Class cls) {
        return C10018f.m24805d(mo42076r(), cls);
    }

    /* renamed from: t */
    public boolean mo42078t(Object obj) {
        return obj != null && mo42077s(obj.getClass());
    }

    public String toString() {
        return super.toString() + ", Manager: " + this.f19482k;
    }

    /* renamed from: u */
    public boolean mo42079u() {
        return this.f19481j;
    }

    /* renamed from: v */
    public synchronized void mo42080v(C10022j<T> jVar) {
        if (this.f19482k == null) {
            this.f19482k = jVar;
        } else {
            throw new IllegalStateException("Manager is final");
        }
    }
}
