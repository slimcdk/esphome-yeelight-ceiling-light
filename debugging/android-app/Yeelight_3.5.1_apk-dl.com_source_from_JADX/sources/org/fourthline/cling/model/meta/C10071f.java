package org.fourthline.cling.model.meta;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.C10018f;
import org.fourthline.cling.model.C10023k;
import org.fourthline.cling.model.meta.C10070e;
import org.fourthline.cling.model.types.Datatype;
import p214t6.C10411k;
import p214t6.C10412l;

/* renamed from: org.fourthline.cling.model.meta.f */
public class C10071f<S extends C10070e> {

    /* renamed from: e */
    private static final Logger f18587e = Logger.getLogger(C10071f.class.getName());

    /* renamed from: a */
    private final String f18588a;

    /* renamed from: b */
    private final C10412l f18589b;

    /* renamed from: c */
    private final C10411k f18590c;

    /* renamed from: d */
    private S f18591d;

    public C10071f(String str, C10412l lVar) {
        this(str, lVar, new C10411k());
    }

    public C10071f(String str, C10412l lVar, C10411k kVar) {
        this.f18588a = str;
        this.f18589b = lVar;
        this.f18590c = kVar;
    }

    /* renamed from: a */
    public C10411k mo40542a() {
        return this.f18590c;
    }

    /* renamed from: b */
    public String mo40543b() {
        return this.f18588a;
    }

    /* renamed from: c */
    public S mo40544c() {
        return this.f18591d;
    }

    /* renamed from: d */
    public C10412l mo40545d() {
        return this.f18589b;
    }

    /* renamed from: e */
    public boolean mo40546e() {
        return Datatype.Builtin.isNumeric(mo40545d().mo42116d().mo40560e()) && mo40542a().mo42111b() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo40547f(S s) {
        if (this.f18591d == null) {
            this.f18591d = s;
            return;
        }
        throw new IllegalStateException("Final value has been set already, model is immutable");
    }

    /* renamed from: g */
    public List<C10023k> mo40548g() {
        ArrayList arrayList = new ArrayList();
        if (mo40543b() == null || mo40543b().length() == 0) {
            arrayList.add(new C10023k(C10071f.class, "name", "StateVariable without name of: " + mo40544c()));
        } else if (!C10018f.m24806e(mo40543b())) {
            Logger logger = f18587e;
            logger.warning("UPnP specification violation of: " + mo40544c().mo40531d());
            logger.warning("Invalid state variable name: " + this);
        }
        arrayList.addAll(mo40545d().mo42118f());
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(C10071f.class.getSimpleName());
        sb.append(", Name: ");
        sb.append(mo40543b());
        sb.append(", Type: ");
        sb.append(mo40545d().mo42116d().mo40559d());
        sb.append(")");
        if (!mo40542a().mo42112c()) {
            sb.append(" (No Events)");
        }
        if (mo40545d().mo42117e() != null) {
            sb.append(" Default Value: ");
            sb.append("'");
            sb.append(mo40545d().mo42117e());
            sb.append("'");
        }
        if (mo40545d().mo42115c() != null) {
            sb.append(" Allowed Values: ");
            for (String append : mo40545d().mo42115c()) {
                sb.append(append);
                sb.append("|");
            }
        }
        return sb.toString();
    }
}
