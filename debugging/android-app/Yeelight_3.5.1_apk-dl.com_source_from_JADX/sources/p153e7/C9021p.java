package p153e7;

import org.joda.time.C10142a;
import org.joda.time.C10149c;
import org.joda.time.C10173e;
import org.joda.time.C10174f;
import org.joda.time.C10223j;

/* renamed from: e7.p */
class C9021p extends C9005a implements C9014i, C9012g, C9018m {

    /* renamed from: a */
    static final C9021p f16531a = new C9021p();

    protected C9021p() {
    }

    /* renamed from: c */
    public boolean mo36863c(Object obj, C10142a aVar) {
        return true;
    }

    /* renamed from: e */
    public void mo36882e(C10174f fVar, Object obj, C10142a aVar) {
        C10223j jVar = (C10223j) obj;
        if (aVar == null) {
            aVar = C10149c.m25344i(jVar);
        }
        int[] iArr = aVar.get(fVar, jVar.getStartMillis(), jVar.getEndMillis());
        for (int i = 0; i < iArr.length; i++) {
            fVar.setValue(i, iArr[i]);
        }
    }

    /* renamed from: f */
    public long mo36879f(Object obj) {
        return ((C10223j) obj).toDurationMillis();
    }

    /* renamed from: g */
    public Class<?> mo36869g() {
        return C10223j.class;
    }

    /* renamed from: k */
    public void mo36881k(C10173e eVar, Object obj, C10142a aVar) {
        C10223j jVar = (C10223j) obj;
        eVar.setInterval(jVar);
        if (aVar != null) {
            eVar.setChronology(aVar);
        } else {
            eVar.setChronology(jVar.getChronology());
        }
    }
}
