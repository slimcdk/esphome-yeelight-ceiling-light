package p164h.p165b.p166a.p240h.p248s;

import com.miot.common.device.parser.xml.DddTag;
import java.util.ArrayList;
import java.util.List;
import p164h.p165b.p166a.p240h.C11222l;

/* renamed from: h.b.a.h.s.t */
public class C11340t {

    /* renamed from: a */
    private int f22525a = 1;

    /* renamed from: b */
    private int f22526b = 0;

    public C11340t() {
    }

    public C11340t(int i, int i2) {
        this.f22525a = i;
        this.f22526b = i2;
    }

    /* renamed from: a */
    public int mo36016a() {
        return this.f22525a;
    }

    /* renamed from: b */
    public int mo36017b() {
        return this.f22526b;
    }

    /* renamed from: c */
    public List<C11222l> mo36018c() {
        Class<C11340t> cls = C11340t.class;
        ArrayList arrayList = new ArrayList();
        if (mo36016a() != 1) {
            arrayList.add(new C11222l(cls, DddTag.SEPCVERSION_MAJOR, "UDA major spec version must be 1"));
        }
        if (mo36016a() < 0) {
            arrayList.add(new C11222l(cls, DddTag.SEPCVERSION_MINOR, "UDA minor spec version must be equal or greater 0"));
        }
        return arrayList;
    }
}
