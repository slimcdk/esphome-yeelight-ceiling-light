package org.eclipse.jetty.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import javax.servlet.http.C9288l;
import p208s4.C10355g;

/* renamed from: org.eclipse.jetty.util.k */
public class C9991k {

    /* renamed from: a */
    protected MultiMap<String> f18415a;

    /* renamed from: org.eclipse.jetty.util.k$a */
    public class C9992a implements C9288l {

        /* renamed from: a */
        protected File f18416a;

        /* renamed from: b */
        protected boolean f18417b;

        /* renamed from: a */
        public void mo40263a() {
            File file;
            if (this.f18417b && (file = this.f18416a) != null && file.exists()) {
                this.f18416a.delete();
            }
        }
    }

    static {
        new C10355g(System.getProperty("java.io.tmpdir"));
    }

    /* renamed from: a */
    public void mo40261a() {
        Collection<C9288l> b = mo40262b();
        MultiException multiException = new MultiException();
        Iterator<C9288l> it = b.iterator();
        while (it.hasNext()) {
            try {
                ((C9992a) it.next()).mo40263a();
            } catch (Exception e) {
                multiException.add(e);
            }
        }
        this.f18415a.clear();
        multiException.ifExceptionThrowMulti();
    }

    /* renamed from: b */
    public Collection<C9288l> mo40262b() {
        MultiMap<String> multiMap = this.f18415a;
        if (multiMap == null) {
            return Collections.emptyList();
        }
        Collection<Object> values = multiMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object list : values) {
            arrayList.addAll(LazyList.getList(list, false));
        }
        return arrayList;
    }
}
