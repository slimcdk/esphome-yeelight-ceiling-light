package org.eclipse.jetty.server.handler;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.util.C9996o;
import org.eclipse.jetty.util.LazyList;
import p147d6.C8942b;
import p239z5.C12175i;
import p239z5.C12176j;

/* renamed from: org.eclipse.jetty.server.handler.b */
public abstract class C9941b extends C9940a implements C12176j {
    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public Object mo39920O0(Object obj, Class<?> cls) {
        return obj;
    }

    /* renamed from: P */
    public Handler[] mo39921P(Class<?> cls) {
        return (C12175i[]) LazyList.toArray(mo39920O0((Object) null, cls), cls);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public Object mo39922P0(C12175i iVar, Object obj, Class<C12175i> cls) {
        if (iVar == null) {
            return obj;
        }
        if (cls == null || cls.isAssignableFrom(iVar.getClass())) {
            obj = LazyList.add(obj, iVar);
        }
        if (iVar instanceof C9941b) {
            return ((C9941b) iVar).mo39920O0(obj, cls);
        }
        if (!(iVar instanceof C12176j)) {
            return obj;
        }
        C12176j jVar = (C12176j) iVar;
        return LazyList.addArray(obj, cls == null ? jVar.mo39924v() : jVar.mo39921P(cls));
    }

    /* renamed from: Q0 */
    public <T extends C12175i> T mo39923Q0(Class<T> cls) {
        Object O0 = mo39920O0((Object) null, cls);
        if (O0 == null) {
            return null;
        }
        return (C12175i) LazyList.get(O0, 0);
    }

    /* renamed from: p0 */
    public void mo26544p0(Appendable appendable, String str) {
        mo36757J0(appendable);
        C8942b.m21357G0(appendable, str, mo36759L0(), C9996o.m24714a(mo39981o()));
    }

    /* renamed from: v */
    public C12175i[] mo39924v() {
        return (C12175i[]) LazyList.toArray(mo39920O0((Object) null, (Class<?>) null), C12175i.class);
    }
}
