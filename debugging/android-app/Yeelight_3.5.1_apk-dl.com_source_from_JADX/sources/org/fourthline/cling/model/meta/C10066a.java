package org.fourthline.cling.model.meta;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.C10018f;
import org.fourthline.cling.model.C10023k;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.C10070e;

/* renamed from: org.fourthline.cling.model.meta.a */
public class C10066a<S extends C10070e> {

    /* renamed from: f */
    private static final Logger f18558f = Logger.getLogger(C10066a.class.getName());

    /* renamed from: a */
    private final String f18559a;

    /* renamed from: b */
    private final ActionArgument[] f18560b;

    /* renamed from: c */
    private final ActionArgument[] f18561c;

    /* renamed from: d */
    private final ActionArgument[] f18562d;

    /* renamed from: e */
    private S f18563e;

    public C10066a(String str, ActionArgument[] actionArgumentArr) {
        this.f18559a = str;
        if (actionArgumentArr != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (ActionArgument actionArgument : actionArgumentArr) {
                actionArgument.mo40468i(this);
                if (actionArgument.mo40463d().equals(ActionArgument.Direction.IN)) {
                    arrayList.add(actionArgument);
                }
                if (actionArgument.mo40463d().equals(ActionArgument.Direction.OUT)) {
                    arrayList2.add(actionArgument);
                }
            }
            this.f18560b = actionArgumentArr;
            this.f18561c = (ActionArgument[]) arrayList.toArray(new ActionArgument[arrayList.size()]);
            this.f18562d = (ActionArgument[]) arrayList2.toArray(new ActionArgument[arrayList2.size()]);
            return;
        }
        this.f18560b = new ActionArgument[0];
        this.f18561c = new ActionArgument[0];
        this.f18562d = new ActionArgument[0];
    }

    /* renamed from: a */
    public ActionArgument[] mo40471a() {
        return this.f18560b;
    }

    /* renamed from: b */
    public ActionArgument<S> mo40472b(String str) {
        for (ActionArgument<S> actionArgument : mo40473c()) {
            if (actionArgument.mo40466g(str)) {
                return actionArgument;
            }
        }
        return null;
    }

    /* renamed from: c */
    public ActionArgument<S>[] mo40473c() {
        return this.f18561c;
    }

    /* renamed from: d */
    public String mo40474d() {
        return this.f18559a;
    }

    /* renamed from: e */
    public ActionArgument<S> mo40475e(String str) {
        for (ActionArgument<S> actionArgument : mo40476f()) {
            if (actionArgument.mo40464e().equals(str)) {
                return actionArgument;
            }
        }
        return null;
    }

    /* renamed from: f */
    public ActionArgument<S>[] mo40476f() {
        return this.f18562d;
    }

    /* renamed from: g */
    public S mo40477g() {
        return this.f18563e;
    }

    /* renamed from: h */
    public boolean mo40478h() {
        return mo40471a() != null && mo40471a().length > 0;
    }

    /* renamed from: i */
    public boolean mo40479i() {
        return mo40476f() != null && mo40476f().length > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo40480j(S s) {
        if (this.f18563e == null) {
            this.f18563e = s;
            return;
        }
        throw new IllegalStateException("Final value has been set already, model is immutable");
    }

    /* renamed from: k */
    public List<C10023k> mo40481k() {
        ArrayList arrayList = new ArrayList();
        if (mo40474d() == null || mo40474d().length() == 0) {
            arrayList.add(new C10023k(getClass(), "name", "Action without name of: " + mo40477g()));
        } else if (!C10018f.m24806e(mo40474d())) {
            Logger logger = f18558f;
            logger.warning("UPnP specification violation of: " + mo40477g().mo40531d());
            logger.warning("Invalid action name: " + this);
        }
        for (ActionArgument actionArgument : mo40471a()) {
            if (mo40477g().mo40535h(actionArgument.mo40465f()) == null) {
                arrayList.add(new C10023k(getClass(), "arguments", "Action argument references an unknown state variable: " + actionArgument.mo40465f()));
            }
        }
        ActionArgument actionArgument2 = null;
        int i = 0;
        int i2 = 0;
        for (ActionArgument actionArgument3 : mo40471a()) {
            if (actionArgument3.mo40467h()) {
                if (actionArgument3.mo40463d() == ActionArgument.Direction.IN) {
                    Logger logger2 = f18558f;
                    logger2.warning("UPnP specification violation of :" + mo40477g().mo40531d());
                    logger2.warning("Input argument can not have <retval/>");
                } else {
                    if (actionArgument2 != null) {
                        Logger logger3 = f18558f;
                        logger3.warning("UPnP specification violation of: " + mo40477g().mo40531d());
                        logger3.warning("Only one argument of action '" + mo40474d() + "' can be <retval/>");
                    }
                    i2 = i;
                    actionArgument2 = actionArgument3;
                }
            }
            i++;
        }
        if (actionArgument2 != null) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (mo40471a()[i3].mo40463d() == ActionArgument.Direction.OUT) {
                    Logger logger4 = f18558f;
                    logger4.warning("UPnP specification violation of: " + mo40477g().mo40531d());
                    logger4.warning("Argument '" + actionArgument2.mo40464e() + "' of action '" + mo40474d() + "' is <retval/> but not the first OUT argument");
                }
            }
        }
        for (ActionArgument j : this.f18560b) {
            arrayList.addAll(j.mo40469j());
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(getClass().getSimpleName());
        sb.append(", Arguments: ");
        sb.append(mo40471a() != null ? Integer.valueOf(mo40471a().length) : "NO ARGS");
        sb.append(") ");
        sb.append(mo40474d());
        return sb.toString();
    }
}
