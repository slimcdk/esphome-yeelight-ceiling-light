package p164h.p165b.p166a.p237f.p239e;

import org.w3c.dom.Node;

/* renamed from: h.b.a.f.e.c */
public enum C11187c {
    f22233a,
    f22234b,
    f22235c,
    f22236d,
    f22237e,
    f22238f,
    name,
    f22240h,
    f22241i,
    f22242j,
    relatedStateVariable,
    retval,
    serviceStateTable,
    stateVariable,
    dataType,
    defaultValue,
    f22249q,
    f22250r,
    f22251s,
    f22252t,
    f22253u,
    step;

    /* renamed from: b */
    public static C11187c m29133b(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo35548a(Node node) {
        return toString().equals(node.getLocalName());
    }
}
