package org.fourthline.cling.model.meta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.fourthline.cling.model.C10023k;
import org.fourthline.cling.model.meta.C10067b;
import org.fourthline.cling.model.meta.C10070e;
import org.fourthline.cling.model.types.C10097r;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.Datatype;
import p214t6.C10412l;

/* renamed from: org.fourthline.cling.model.meta.e */
public abstract class C10070e<D extends C10067b, S extends C10070e> {

    /* renamed from: f */
    private static final Logger f18581f = Logger.getLogger(C10070e.class.getName());

    /* renamed from: a */
    private final C10098s f18582a;

    /* renamed from: b */
    private final C10097r f18583b;

    /* renamed from: c */
    private final Map<String, C10066a> f18584c = new HashMap();

    /* renamed from: d */
    private final Map<String, C10071f> f18585d = new HashMap();

    /* renamed from: e */
    private D f18586e;

    public C10070e(C10098s sVar, C10097r rVar, C10066a<S>[] aVarArr, C10071f<S>[] fVarArr) {
        this.f18582a = sVar;
        this.f18583b = rVar;
        if (aVarArr != null) {
            for (C10066a<S> aVar : aVarArr) {
                this.f18584c.put(aVar.mo40474d(), aVar);
                aVar.mo40480j(this);
            }
        }
        if (fVarArr != null) {
            for (C10071f<S> fVar : fVarArr) {
                this.f18585d.put(fVar.mo40543b(), fVar);
                fVar.mo40547f(this);
            }
        }
    }

    /* renamed from: a */
    public C10066a<S> mo40528a(String str) {
        Map<String, C10066a> map = this.f18584c;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: b */
    public C10066a<S>[] mo40529b() {
        Map<String, C10066a> map = this.f18584c;
        if (map == null) {
            return null;
        }
        return (C10066a[]) map.values().toArray(new C10066a[this.f18584c.values().size()]);
    }

    /* renamed from: c */
    public Datatype<S> mo40530c(ActionArgument actionArgument) {
        return mo40532e(actionArgument).mo40545d().mo42116d();
    }

    /* renamed from: d */
    public D mo40531d() {
        return this.f18586e;
    }

    /* renamed from: e */
    public C10071f<S> mo40532e(ActionArgument actionArgument) {
        return mo40535h(actionArgument.mo40465f());
    }

    /* renamed from: f */
    public C10097r mo40533f() {
        return this.f18583b;
    }

    /* renamed from: g */
    public C10098s mo40534g() {
        return this.f18582a;
    }

    /* renamed from: h */
    public C10071f<S> mo40535h(String str) {
        if ("VirtualQueryActionInput".equals(str)) {
            return new C10071f<>("VirtualQueryActionInput", new C10412l(Datatype.Builtin.STRING.getDatatype()));
        }
        if ("VirtualQueryActionOutput".equals(str)) {
            return new C10071f<>("VirtualQueryActionOutput", new C10412l(Datatype.Builtin.STRING.getDatatype()));
        }
        Map<String, C10071f> map = this.f18585d;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: i */
    public C10071f<S>[] mo40536i() {
        Map<String, C10071f> map = this.f18585d;
        if (map == null) {
            return null;
        }
        return (C10071f[]) map.values().toArray(new C10071f[this.f18585d.values().size()]);
    }

    /* renamed from: j */
    public boolean mo40537j() {
        return mo40529b() != null && mo40529b().length > 0;
    }

    /* renamed from: k */
    public boolean mo40538k() {
        return mo40536i() != null && mo40536i().length > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo40539l(D d) {
        if (this.f18586e == null) {
            this.f18586e = d;
            return;
        }
        throw new IllegalStateException("Final value has been set already, model is immutable");
    }

    /* renamed from: m */
    public List<C10023k> mo40540m() {
        ArrayList arrayList = new ArrayList();
        if (mo40534g() == null) {
            arrayList.add(new C10023k(getClass(), "serviceType", "Service type/info is required"));
        }
        if (mo40533f() == null) {
            arrayList.add(new C10023k(getClass(), "serviceId", "Service ID is required"));
        }
        if (mo40538k()) {
            for (C10071f g : mo40536i()) {
                arrayList.addAll(g.mo40548g());
            }
        }
        if (mo40537j()) {
            for (C10066a aVar : mo40529b()) {
                List<C10023k> k = aVar.mo40481k();
                if (k.size() > 0) {
                    this.f18584c.remove(aVar.mo40474d());
                    f18581f.warning("Discarding invalid action of service '" + mo40533f() + "': " + aVar.mo40474d());
                    for (C10023k kVar : k) {
                        f18581f.warning("Invalid action '" + aVar.mo40474d() + "': " + kVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") ServiceId: " + mo40533f();
    }
}
