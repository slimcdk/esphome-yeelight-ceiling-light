package p164h.p165b.p166a.p240h.p248s;

import com.miot.common.device.parser.xml.DddTag;
import java.util.ArrayList;
import java.util.List;
import p164h.p165b.p166a.p240h.C11222l;
import p164h.p165b.p166a.p240h.p252w.C11365e0;

/* renamed from: h.b.a.h.s.e */
public class C11325e {

    /* renamed from: a */
    private final C11365e0 f22474a;

    /* renamed from: b */
    private final Integer f22475b;

    public C11325e(C11365e0 e0Var) {
        this.f22474a = e0Var;
        this.f22475b = 1800;
    }

    public C11325e(C11365e0 e0Var, Integer num) {
        this.f22474a = e0Var;
        this.f22475b = num;
    }

    /* renamed from: a */
    public Integer mo35921a() {
        return this.f22475b;
    }

    /* renamed from: b */
    public C11365e0 mo35922b() {
        return this.f22474a;
    }

    /* renamed from: c */
    public List<C11222l> mo35923c() {
        ArrayList arrayList = new ArrayList();
        if (mo35922b() == null) {
            arrayList.add(new C11222l(getClass(), DddTag.SEPCVERSION_MAJOR, "Device has no UDN"));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f22474a.equals(((C11325e) obj).f22474a);
    }

    public int hashCode() {
        return this.f22474a.hashCode();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") UDN: " + mo35922b();
    }
}
