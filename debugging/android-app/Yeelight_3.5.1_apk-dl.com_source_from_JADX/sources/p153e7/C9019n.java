package p153e7;

import org.joda.time.C10142a;
import org.joda.time.C10149c;
import org.joda.time.C10174f;
import org.joda.time.C10221h;
import org.joda.time.C10225l;

/* renamed from: e7.n */
class C9019n extends C9005a implements C9012g, C9018m {

    /* renamed from: a */
    static final C9019n f16529a = new C9019n();

    protected C9019n() {
    }

    /* renamed from: e */
    public void mo36882e(C10174f fVar, Object obj, C10142a aVar) {
        int[] iArr = C10149c.m25337b(aVar).get((C10225l) fVar, ((C10221h) obj).getMillis());
        for (int i = 0; i < iArr.length; i++) {
            fVar.setValue(i, iArr[i]);
        }
    }

    /* renamed from: f */
    public long mo36879f(Object obj) {
        return ((C10221h) obj).getMillis();
    }

    /* renamed from: g */
    public Class<?> mo36869g() {
        return C10221h.class;
    }
}
