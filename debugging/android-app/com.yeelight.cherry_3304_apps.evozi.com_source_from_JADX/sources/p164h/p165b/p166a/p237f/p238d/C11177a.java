package p164h.p165b.p166a.p237f.p238d;

import java.util.ArrayList;
import java.util.List;
import p164h.p165b.p166a.p240h.p248s.C11320a;
import p164h.p165b.p166a.p240h.p248s.C11321b;

/* renamed from: h.b.a.f.d.a */
public class C11177a {

    /* renamed from: a */
    public String f22145a;

    /* renamed from: b */
    public List<C11178b> f22146b = new ArrayList();

    /* renamed from: a */
    public C11320a mo35532a() {
        return new C11320a(this.f22145a, mo35533b());
    }

    /* renamed from: b */
    public C11321b[] mo35533b() {
        C11321b[] bVarArr = new C11321b[this.f22146b.size()];
        int i = 0;
        for (C11178b a : this.f22146b) {
            bVarArr[i] = a.mo35534a();
            i++;
        }
        return bVarArr;
    }
}
