package p193o6;

import java.util.LinkedHashMap;
import java.util.Map;
import org.fourthline.cling.model.action.ActionArgumentValue;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.C10066a;
import org.fourthline.cling.model.meta.C10070e;
import p218u6.C10540a;

/* renamed from: o6.d */
public class C9792d<S extends C10070e> {

    /* renamed from: a */
    protected final C10066a<S> f17664a;

    /* renamed from: b */
    protected final C10540a f17665b;

    /* renamed from: c */
    protected Map<String, C9790b<S>> f17666c;

    /* renamed from: d */
    protected Map<String, C9790b<S>> f17667d;

    /* renamed from: e */
    protected ActionException f17668e;

    public C9792d(ActionException actionException) {
        this.f17666c = new LinkedHashMap();
        this.f17667d = new LinkedHashMap();
        this.f17668e = null;
        this.f17664a = null;
        this.f17666c = null;
        this.f17667d = null;
        this.f17668e = actionException;
        this.f17665b = null;
    }

    public C9792d(C10066a<S> aVar) {
        this(aVar, (ActionArgumentValue<S>[]) null, (ActionArgumentValue<S>[]) null, (C10540a) null);
    }

    public C9792d(C10066a<S> aVar, ActionArgumentValue<S>[] actionArgumentValueArr, ActionArgumentValue<S>[] actionArgumentValueArr2, C10540a aVar2) {
        this.f17666c = new LinkedHashMap();
        this.f17667d = new LinkedHashMap();
        this.f17668e = null;
        if (aVar != null) {
            this.f17664a = aVar;
            mo38979m(actionArgumentValueArr);
            mo38981o(actionArgumentValueArr2);
            this.f17665b = aVar2;
            return;
        }
        throw new IllegalArgumentException("Action can not be null");
    }

    /* renamed from: a */
    public C10066a<S> mo38967a() {
        return this.f17664a;
    }

    /* renamed from: b */
    public C10540a mo38968b() {
        return this.f17665b;
    }

    /* renamed from: c */
    public ActionException mo38969c() {
        return this.f17668e;
    }

    /* renamed from: d */
    public C9790b<S> mo38970d(String str) {
        return mo38971e(mo38972f(str));
    }

    /* renamed from: e */
    public C9790b<S> mo38971e(ActionArgument<S> actionArgument) {
        return this.f17666c.get(actionArgument.mo40464e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public ActionArgument<S> mo38972f(String str) {
        ActionArgument<S> b = mo38967a().mo40472b(str);
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException("Argument not found: " + str);
    }

    /* renamed from: g */
    public C9790b<S> mo38973g(String str) {
        return mo38974h(mo38975i(str));
    }

    /* renamed from: h */
    public C9790b<S> mo38974h(ActionArgument<S> actionArgument) {
        return this.f17667d.get(actionArgument.mo40464e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public ActionArgument<S> mo38975i(String str) {
        ActionArgument<S> e = mo38967a().mo40475e(str);
        if (e != null) {
            return e;
        }
        throw new IllegalArgumentException("Argument not found: " + str);
    }

    /* renamed from: j */
    public void mo38976j(ActionException actionException) {
        this.f17668e = actionException;
    }

    /* renamed from: k */
    public void mo38977k(String str, Object obj) {
        mo38978l(new C9790b(mo38972f(str), obj));
    }

    /* renamed from: l */
    public void mo38978l(C9790b<S> bVar) {
        this.f17666c.put(bVar.mo38966d().mo40464e(), bVar);
    }

    /* renamed from: m */
    public void mo38979m(ActionArgumentValue<S>[] actionArgumentValueArr) {
        if (actionArgumentValueArr != null) {
            for (C9790b bVar : actionArgumentValueArr) {
                this.f17666c.put(bVar.mo38966d().mo40464e(), bVar);
            }
        }
    }

    /* renamed from: n */
    public void mo38980n(C9790b<S> bVar) {
        this.f17667d.put(bVar.mo38966d().mo40464e(), bVar);
    }

    /* renamed from: o */
    public void mo38981o(ActionArgumentValue<S>[] actionArgumentValueArr) {
        if (actionArgumentValueArr != null) {
            for (C9790b bVar : actionArgumentValueArr) {
                this.f17667d.put(bVar.mo38966d().mo40464e(), bVar);
            }
        }
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") " + mo38967a();
    }
}
