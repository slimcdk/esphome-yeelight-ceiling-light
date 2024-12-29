package p214t6;

import com.miot.common.device.parser.xml.DddTag;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.C10023k;

/* renamed from: t6.m */
public class C10413m {

    /* renamed from: a */
    private int f19507a = 1;

    /* renamed from: b */
    private int f19508b = 0;

    public C10413m() {
    }

    public C10413m(int i, int i2) {
        this.f19507a = i;
        this.f19508b = i2;
    }

    /* renamed from: a */
    public int mo42119a() {
        return this.f19507a;
    }

    /* renamed from: b */
    public int mo42120b() {
        return this.f19508b;
    }

    /* renamed from: c */
    public List<C10023k> mo42121c() {
        Class<C10413m> cls = C10413m.class;
        ArrayList arrayList = new ArrayList();
        if (mo42119a() != 1) {
            arrayList.add(new C10023k(cls, DddTag.SEPCVERSION_MAJOR, "UDA major spec version must be 1"));
        }
        if (mo42119a() < 0) {
            arrayList.add(new C10023k(cls, DddTag.SEPCVERSION_MINOR, "UDA minor spec version must be equal or greater 0"));
        }
        return arrayList;
    }
}
