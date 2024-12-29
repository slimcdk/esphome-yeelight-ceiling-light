package p153e7;

import org.joda.time.C10142a;
import org.joda.time.C10149c;
import org.joda.time.C10224k;
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.C10199a;

/* renamed from: e7.a */
public abstract class C9005a implements C9007c {
    protected C9005a() {
    }

    /* renamed from: a */
    public C10142a mo36861a(Object obj, C10142a aVar) {
        return C10149c.m25337b(aVar);
    }

    /* renamed from: b */
    public C10142a mo36862b(Object obj, DateTimeZone dateTimeZone) {
        return ISOChronology.getInstance(dateTimeZone);
    }

    /* renamed from: c */
    public boolean mo36863c(Object obj, C10142a aVar) {
        return false;
    }

    /* renamed from: d */
    public long mo36864d(Object obj, C10142a aVar) {
        return C10149c.m25336a();
    }

    /* renamed from: h */
    public PeriodType mo36865h(Object obj) {
        return PeriodType.standard();
    }

    /* renamed from: i */
    public int[] mo36866i(C10224k kVar, Object obj, C10142a aVar, C10199a aVar2) {
        return mo36867j(kVar, obj, aVar);
    }

    /* renamed from: j */
    public int[] mo36867j(C10224k kVar, Object obj, C10142a aVar) {
        return aVar.get(kVar, mo36864d(obj, aVar));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Converter[");
        sb.append(mo36869g() == null ? "null" : mo36869g().getName());
        sb.append("]");
        return sb.toString();
    }
}
