package p164h.p211a.p212a.p222f.p224w;

import p164h.p211a.p212a.p222f.C11032i;
import p164h.p211a.p212a.p222f.C11033j;
import p164h.p211a.p212a.p228h.C11126j;
import p164h.p211a.p212a.p228h.C11138r;
import p164h.p211a.p212a.p228h.p233x.C11146b;

/* renamed from: h.a.a.f.w.b */
public abstract class C11051b extends C11050a implements C11033j {
    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public Object mo35049J0(Object obj, Class<?> cls) {
        return obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public Object mo35050K0(C11032i iVar, Object obj, Class<C11032i> cls) {
        if (iVar == null) {
            return obj;
        }
        if (cls == null || cls.isAssignableFrom(iVar.getClass())) {
            obj = C11126j.m28879b(obj, iVar);
        }
        if (iVar instanceof C11051b) {
            return ((C11051b) iVar).mo35049J0(obj, cls);
        }
        if (!(iVar instanceof C11033j)) {
            return obj;
        }
        C11033j jVar = (C11033j) iVar;
        return C11126j.m28880c(obj, cls == null ? jVar.mo34904t() : jVar.mo34902O(cls));
    }

    /* renamed from: L0 */
    public <T extends C11032i> T mo35051L0(Class<T> cls) {
        Object J0 = mo35049J0((Object) null, cls);
        if (J0 == null) {
            return null;
        }
        return (C11032i) C11126j.m28884j(J0, 0);
    }

    /* renamed from: O */
    public C11032i[] mo34902O(Class<?> cls) {
        return (C11032i[]) C11126j.m28891r(mo35049J0((Object) null, cls), cls);
    }

    /* renamed from: k0 */
    public void mo34187k0(Appendable appendable, String str) {
        mo35048E0(appendable);
        C11146b.m28976B0(appendable, str, mo35460G0(), C11138r.m28927a(mo34903n()));
    }

    /* renamed from: t */
    public C11032i[] mo34904t() {
        return (C11032i[]) C11126j.m28891r(mo35049J0((Object) null, (Class<?>) null), C11032i.class);
    }
}
