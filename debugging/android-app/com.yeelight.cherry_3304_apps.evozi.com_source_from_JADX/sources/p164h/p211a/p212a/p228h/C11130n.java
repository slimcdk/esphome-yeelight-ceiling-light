package p164h.p211a.p212a.p228h;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import p154d.p155b.p204f0.C10720n;

/* renamed from: h.a.a.h.n */
public class C11130n {

    /* renamed from: a */
    protected C11129m<String> f22036a;

    /* renamed from: h.a.a.h.n$a */
    public class C11131a implements C10720n {

        /* renamed from: a */
        protected File f22037a;

        /* renamed from: b */
        protected boolean f22038b;

        /* renamed from: a */
        public void mo35407a() {
            File file;
            if (this.f22038b && (file = this.f22037a) != null && file.exists()) {
                this.f22037a.delete();
            }
        }
    }

    static {
        System.getProperty("java.io.tmpdir");
    }

    /* renamed from: a */
    public void mo35405a() {
        Collection<C10720n> b = mo35406b();
        C11128l lVar = new C11128l();
        Iterator<C10720n> it = b.iterator();
        while (it.hasNext()) {
            try {
                ((C11131a) it.next()).mo35407a();
            } catch (Exception e) {
                lVar.mo35374a(e);
            }
        }
        this.f22036a.clear();
        lVar.mo35377d();
    }

    /* renamed from: b */
    public Collection<C10720n> mo35406b() {
        C11129m<String> mVar = this.f22036a;
        if (mVar == null) {
            return Collections.emptyList();
        }
        Collection<Object> values = mVar.values();
        ArrayList arrayList = new ArrayList();
        for (Object l : values) {
            arrayList.addAll(C11126j.m28886l(l, false));
        }
        return arrayList;
    }
}
