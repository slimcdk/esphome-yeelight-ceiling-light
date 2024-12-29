package org.fourthline.cling.model.types;

import java.lang.reflect.ParameterizedType;
import org.fourthline.cling.model.types.Datatype;

/* renamed from: org.fourthline.cling.model.types.a */
public abstract class C10073a<V> implements Datatype<V> {

    /* renamed from: a */
    private Datatype.Builtin f18603a;

    /* renamed from: a */
    public String mo40556a(V v) {
        if (v == null) {
            return "";
        }
        if (mo40558c(v)) {
            return v.toString();
        }
        throw new InvalidValueException("Value is not valid: " + v);
    }

    /* renamed from: b */
    public boolean mo40557b(Class cls) {
        return mo40580g().isAssignableFrom(cls);
    }

    /* renamed from: c */
    public boolean mo40558c(V v) {
        return v == null || mo40580g().isAssignableFrom(v.getClass());
    }

    /* renamed from: d */
    public String mo40559d() {
        return this instanceof C10085g ? ((C10085g) this).mo40598i() : mo40560e() != null ? mo40560e().getDescriptorName() : mo40580g().getSimpleName();
    }

    /* renamed from: e */
    public Datatype.Builtin mo40560e() {
        return this.f18603a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Class<V> mo40580g() {
        return (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    /* renamed from: h */
    public void mo40581h(Datatype.Builtin builtin) {
        this.f18603a = builtin;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
