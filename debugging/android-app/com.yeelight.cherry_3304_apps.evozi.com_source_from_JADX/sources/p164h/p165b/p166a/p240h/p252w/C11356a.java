package p164h.p165b.p166a.p240h.p252w;

import java.lang.reflect.ParameterizedType;
import p164h.p165b.p166a.p240h.p252w.C11374j;

/* renamed from: h.b.a.h.w.a */
public abstract class C11356a<V> implements C11374j<V> {

    /* renamed from: a */
    private C11374j.C11375a f22539a;

    /* renamed from: a */
    public String mo36041a(V v) {
        if (v == null) {
            return "";
        }
        if (mo36043c(v)) {
            return v.toString();
        }
        throw new C11391r("Value is not valid: " + v);
    }

    /* renamed from: b */
    public boolean mo36042b(Class cls) {
        return mo36046g().isAssignableFrom(cls);
    }

    /* renamed from: c */
    public boolean mo36043c(V v) {
        return v == null || mo36046g().isAssignableFrom(v.getClass());
    }

    /* renamed from: d */
    public String mo36044d() {
        return this instanceof C11368g ? ((C11368g) this).mo36065i() : mo36045e() != null ? mo36045e().mo36079c() : mo36046g().getSimpleName();
    }

    /* renamed from: e */
    public C11374j.C11375a mo36045e() {
        return this.f22539a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Class<V> mo36046g() {
        return (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    /* renamed from: h */
    public void mo36047h(C11374j.C11375a aVar) {
        this.f22539a = aVar;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
