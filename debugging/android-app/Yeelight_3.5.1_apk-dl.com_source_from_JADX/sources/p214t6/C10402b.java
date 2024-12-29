package p214t6;

import com.miot.common.device.parser.xml.DddTag;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.C10023k;
import org.fourthline.cling.model.types.C10105z;

/* renamed from: t6.b */
public class C10402b {

    /* renamed from: a */
    private final C10105z f19475a;

    /* renamed from: b */
    private final Integer f19476b;

    public C10402b(C10105z zVar) {
        this.f19475a = zVar;
        this.f19476b = 1800;
    }

    public C10402b(C10105z zVar, Integer num) {
        this.f19475a = zVar;
        this.f19476b = num;
    }

    /* renamed from: a */
    public Integer mo42057a() {
        return this.f19476b;
    }

    /* renamed from: b */
    public C10105z mo42058b() {
        return this.f19475a;
    }

    /* renamed from: c */
    public List<C10023k> mo42059c() {
        ArrayList arrayList = new ArrayList();
        if (mo42058b() == null) {
            arrayList.add(new C10023k(getClass(), DddTag.SEPCVERSION_MAJOR, "Device has no UDN"));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f19475a.equals(((C10402b) obj).f19475a);
    }

    public int hashCode() {
        return this.f19475a.hashCode();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") UDN: " + mo42058b();
    }
}
