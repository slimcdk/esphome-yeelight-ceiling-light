package p164h.p165b.p166a.p240h.p252w.p253n0;

import java.util.ArrayList;
import java.util.Iterator;
import p164h.p165b.p166a.p240h.C11216f;
import p164h.p165b.p166a.p240h.p252w.C11374j;
import p164h.p165b.p166a.p240h.p252w.C11391r;
import p164h.p257c.p259b.C11499d;

/* renamed from: h.b.a.h.w.n0.a */
public abstract class C11387a<T> extends ArrayList<T> {

    /* renamed from: a */
    protected final C11374j.C11375a f22641a = mo36109c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C11374j.C11375a mo36109c() {
        Class cls = C11499d.m30192j(ArrayList.class, C11387a.class).get(0);
        C11374j.C11377b b = C11374j.C11377b.m29816b(cls);
        if (b != null) {
            return b.mo36080a();
        }
        throw new C11391r("No built-in UPnP datatype for Java type of CSV: " + cls);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(this.f22641a.mo36078b().mo36041a(it.next()));
        }
        return C11216f.m29269f(arrayList.toArray(new Object[arrayList.size()]));
    }
}
