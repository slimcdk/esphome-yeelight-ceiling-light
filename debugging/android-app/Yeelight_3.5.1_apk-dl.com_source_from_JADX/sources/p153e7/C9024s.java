package p153e7;

import org.joda.time.C10142a;
import org.joda.time.C10173e;
import org.joda.time.C10174f;
import org.joda.time.C10224k;
import org.joda.time.C10225l;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10199a;
import org.joda.time.format.C10206f;
import org.joda.time.format.C10208g;
import org.joda.time.format.C10209h;

/* renamed from: e7.s */
class C9024s extends C9005a implements C9013h, C9017l, C9012g, C9018m, C9014i {

    /* renamed from: a */
    static final C9024s f16534a = new C9024s();

    protected C9024s() {
    }

    /* renamed from: d */
    public long mo36864d(Object obj, C10142a aVar) {
        return C10206f.m25540i().mo41443s(aVar).mo41437i((String) obj);
    }

    /* renamed from: e */
    public void mo36882e(C10174f fVar, Object obj, C10142a aVar) {
        String str = (String) obj;
        C10209h a = C10208g.m25627a();
        fVar.clear();
        int f = a.mo41467f(fVar, str, 0);
        if (f < str.length()) {
            if (f < 0) {
                a.mo41471j(fVar.getPeriodType()).mo41468g(str);
            }
            throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
        }
    }

    /* renamed from: f */
    public long mo36879f(Object obj) {
        long j;
        long j2;
        String str = (String) obj;
        int length = str.length();
        if (length >= 4 && ((str.charAt(0) == 'P' || str.charAt(0) == 'p') && (str.charAt(1) == 'T' || str.charAt(1) == 't'))) {
            int i = length - 1;
            if (str.charAt(i) == 'S' || str.charAt(i) == 's') {
                String substring = str.substring(2, i);
                int i2 = 0;
                int i3 = -1;
                for (int i4 = 0; i4 < substring.length(); i4++) {
                    if (substring.charAt(i4) < '0' || substring.charAt(i4) > '9') {
                        if (i4 == 0 && substring.charAt(0) == '-') {
                            i2 = 1;
                        } else if (i4 > i2 && substring.charAt(i4) == '.' && i3 == -1) {
                            i3 = i4;
                        } else {
                            throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
                        }
                    }
                }
                if (i3 > 0) {
                    j2 = Long.parseLong(substring.substring(i2, i3));
                    String substring2 = substring.substring(i3 + 1);
                    if (substring2.length() != 3) {
                        substring2 = (substring2 + "000").substring(0, 3);
                    }
                    j = (long) Integer.parseInt(substring2);
                } else {
                    j2 = i2 != 0 ? Long.parseLong(substring.substring(i2, substring.length())) : Long.parseLong(substring);
                    j = 0;
                }
                return i2 != 0 ? C10179e.m25389e(C10179e.m25391g(-j2, 1000), -j) : C10179e.m25389e(C10179e.m25391g(j2, 1000), j);
            }
        }
        throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
    }

    /* renamed from: g */
    public Class<?> mo36869g() {
        return String.class;
    }

    /* renamed from: i */
    public int[] mo36866i(C10224k kVar, Object obj, C10142a aVar, C10199a aVar2) {
        if (aVar2.mo41432d() != null) {
            aVar = aVar.withZone(aVar2.mo41432d());
        }
        return aVar.get(kVar, aVar2.mo41443s(aVar).mo41437i((String) obj));
    }

    /* renamed from: k */
    public void mo36881k(C10173e eVar, Object obj, C10142a aVar) {
        Period period;
        long j;
        C10173e eVar2 = eVar;
        C10142a aVar2 = aVar;
        String str = (String) obj;
        int indexOf = str.indexOf(47);
        if (indexOf >= 0) {
            String substring = str.substring(0, indexOf);
            if (substring.length() > 0) {
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    C10199a s = C10206f.m25540i().mo41443s(aVar2);
                    C10209h a = C10208g.m25627a();
                    long j2 = 0;
                    char charAt = substring.charAt(0);
                    C10142a aVar3 = null;
                    if (charAt == 'P' || charAt == 'p') {
                        period = a.mo41471j(mo36865h(substring)).mo41469h(substring);
                    } else {
                        DateTime e = s.mo41433e(substring);
                        j2 = e.getMillis();
                        aVar3 = e.getChronology();
                        period = null;
                    }
                    char charAt2 = substring2.charAt(0);
                    if (charAt2 != 'P' && charAt2 != 'p') {
                        DateTime e2 = s.mo41433e(substring2);
                        j = e2.getMillis();
                        if (aVar3 == null) {
                            aVar3 = e2.getChronology();
                        }
                        if (aVar2 != null) {
                            aVar3 = aVar2;
                        }
                        if (period != null) {
                            j2 = aVar3.add((C10225l) period, j, -1);
                        }
                    } else if (period == null) {
                        Period h = a.mo41471j(mo36865h(substring2)).mo41469h(substring2);
                        if (aVar2 != null) {
                            aVar3 = aVar2;
                        }
                        j = aVar3.add((C10225l) h, j2, 1);
                    } else {
                        throw new IllegalArgumentException("Interval composed of two durations: " + str);
                    }
                    eVar2.setInterval(j2, j);
                    eVar2.setChronology(aVar3);
                    return;
                }
                throw new IllegalArgumentException("Format invalid: " + str);
            }
            throw new IllegalArgumentException("Format invalid: " + str);
        }
        throw new IllegalArgumentException("Format requires a '/' separator: " + str);
    }
}
