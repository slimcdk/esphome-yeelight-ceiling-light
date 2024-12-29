package p154d.p155b.p204f0;

import java.io.Serializable;
import java.util.ResourceBundle;
import p154d.p155b.C10722h;
import p154d.p155b.C10730p;
import p154d.p155b.C10734t;
import p154d.p155b.C10740z;

/* renamed from: d.b.f0.b */
public abstract class C10708b extends C10722h implements Serializable {
    static {
        ResourceBundle.getBundle("javax.servlet.http.LocalStrings");
    }

    /* renamed from: a */
    public void mo33915a(C10734t tVar, C10740z zVar) {
        try {
            mo33916d((C10709c) tVar, (C10711e) zVar);
        } catch (ClassCastException unused) {
            throw new C10730p("non-HTTP request or response");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo33916d(C10709c cVar, C10711e eVar);
}
