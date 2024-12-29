package p214t6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.C10023k;
import org.fourthline.cling.model.types.Datatype;

/* renamed from: t6.l */
public class C10412l {

    /* renamed from: e */
    private static final Logger f19502e = Logger.getLogger(C10412l.class.getName());

    /* renamed from: a */
    private final Datatype f19503a;

    /* renamed from: b */
    private final String f19504b;

    /* renamed from: c */
    private final String[] f19505c;

    /* renamed from: d */
    private final C10410j f19506d;

    public C10412l(Datatype datatype) {
        this(datatype, (String) null, (String[]) null, (C10410j) null);
    }

    public C10412l(Datatype datatype, String str, String[] strArr, C10410j jVar) {
        this.f19503a = datatype;
        this.f19504b = str;
        this.f19505c = strArr;
        this.f19506d = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo42113a(String str, String[] strArr) {
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
    public C10410j mo42114b() {
        return this.f19506d;
    }

    /* renamed from: c */
    public String[] mo42115c() {
        if (mo42113a(this.f19504b, this.f19505c)) {
            return this.f19505c;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f19505c));
        arrayList.add(mo42117e());
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: d */
    public Datatype mo42116d() {
        return this.f19503a;
    }

    /* renamed from: e */
    public String mo42117e() {
        return this.f19504b;
    }

    /* renamed from: f */
    public List<C10023k> mo42118f() {
        Class<C10412l> cls = C10412l.class;
        ArrayList arrayList = new ArrayList();
        if (mo42116d() == null) {
            arrayList.add(new C10023k(cls, "datatype", "Service state variable has no datatype"));
        }
        if (mo42115c() != null) {
            if (mo42114b() != null) {
                arrayList.add(new C10023k(cls, "allowedValues", "Allowed value list of state variable can not also be restricted with allowed value range"));
            }
            if (!Datatype.Builtin.STRING.equals(mo42116d().mo40560e())) {
                arrayList.add(new C10023k(cls, "allowedValues", "Allowed value list of state variable only available for string datatype, not: " + mo42116d()));
            }
            for (String str : mo42115c()) {
                if (str.length() > 31) {
                    f19502e.warning("UPnP specification violation, allowed value string must be less than 32 chars: " + str);
                }
            }
            if (!mo42113a(this.f19504b, this.f19505c)) {
                f19502e.warning("UPnP specification violation, allowed string values don't contain default value: " + this.f19504b);
            }
        }
        if (mo42114b() != null) {
            arrayList.addAll(mo42114b().mo42108e());
        }
        return arrayList;
    }
}
