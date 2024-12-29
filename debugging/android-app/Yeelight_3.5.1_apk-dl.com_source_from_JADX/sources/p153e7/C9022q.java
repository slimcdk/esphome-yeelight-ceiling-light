package p153e7;

import org.joda.time.C10142a;
import org.joda.time.C10149c;
import org.joda.time.C10224k;
import org.joda.time.DateTimeZone;

/* renamed from: e7.q */
class C9022q extends C9005a implements C9017l {

    /* renamed from: a */
    static final C9022q f16532a = new C9022q();

    protected C9022q() {
    }

    /* renamed from: a */
    public C10142a mo36861a(Object obj, C10142a aVar) {
        return aVar == null ? C10149c.m25337b(((C10224k) obj).getChronology()) : aVar;
    }

    /* renamed from: b */
    public C10142a mo36862b(Object obj, DateTimeZone dateTimeZone) {
        return mo36861a(obj, (C10142a) null).withZone(dateTimeZone);
    }

    /* renamed from: g */
    public Class<?> mo36869g() {
        return C10224k.class;
    }

    /* renamed from: j */
    public int[] mo36867j(C10224k kVar, Object obj, C10142a aVar) {
        C10224k kVar2 = (C10224k) obj;
        int size = kVar.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = kVar2.get(kVar.getFieldType(i));
        }
        aVar.validate(kVar, iArr);
        return iArr;
    }
}
