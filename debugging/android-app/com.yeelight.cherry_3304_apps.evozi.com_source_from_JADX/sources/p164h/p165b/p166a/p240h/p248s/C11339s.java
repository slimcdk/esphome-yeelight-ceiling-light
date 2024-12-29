package p164h.p165b.p166a.p240h.p248s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.C11222l;
import p164h.p165b.p166a.p240h.p252w.C11374j;

/* renamed from: h.b.a.h.s.s */
public class C11339s {

    /* renamed from: e */
    private static final Logger f22520e = Logger.getLogger(C11339s.class.getName());

    /* renamed from: a */
    private final C11374j f22521a;

    /* renamed from: b */
    private final String f22522b;

    /* renamed from: c */
    private final String[] f22523c;

    /* renamed from: d */
    private final C11337q f22524d;

    public C11339s(C11374j jVar) {
        this(jVar, (String) null, (String[]) null, (C11337q) null);
    }

    public C11339s(C11374j jVar, String str, String[] strArr, C11337q qVar) {
        this.f22521a = jVar;
        this.f22522b = str;
        this.f22523c = strArr;
        this.f22524d = qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo36010a(String str, String[] strArr) {
        if (str == null || strArr == null) {
            return true;
        }
        for (String equals : strArr) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public C11337q mo36011b() {
        return this.f22524d;
    }

    /* renamed from: c */
    public String[] mo36012c() {
        if (mo36010a(this.f22522b, this.f22523c)) {
            return this.f22523c;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f22523c));
        arrayList.add(mo36014e());
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: d */
    public C11374j mo36013d() {
        return this.f22521a;
    }

    /* renamed from: e */
    public String mo36014e() {
        return this.f22522b;
    }

    /* renamed from: f */
    public List<C11222l> mo36015f() {
        Class<C11339s> cls = C11339s.class;
        ArrayList arrayList = new ArrayList();
        if (mo36013d() == null) {
            arrayList.add(new C11222l(cls, "datatype", "Service state variable has no datatype"));
        }
        if (mo36012c() != null) {
            if (mo36011b() != null) {
                arrayList.add(new C11222l(cls, "allowedValues", "Allowed value list of state variable can not also be restricted with allowed value range"));
            }
            if (!C11374j.C11375a.STRING.equals(mo36013d().mo36045e())) {
                arrayList.add(new C11222l(cls, "allowedValues", "Allowed value list of state variable only available for string datatype, not: " + mo36013d()));
            }
            for (String str : mo36012c()) {
                if (str.length() > 31) {
                    f22520e.warning("UPnP specification violation, allowed value string must be less than 32 chars: " + str);
                }
            }
            if (!mo36010a(this.f22522b, this.f22523c)) {
                f22520e.warning("UPnP specification violation, allowed string values don't contain default value: " + this.f22522b);
            }
        }
        if (mo36011b() != null) {
            arrayList.addAll(mo36011b().mo36005e());
        }
        return arrayList;
    }
}
