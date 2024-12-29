package p164h.p165b.p166a.p240h.p243r.p246m;

import java.net.URL;
import java.util.List;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.p247n.C11286a0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11287b;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11309p;
import p164h.p165b.p166a.p240h.p243r.p247n.C11319z;
import p164h.p165b.p166a.p240h.p248s.C11328h;

/* renamed from: h.b.a.h.r.m.b */
public class C11276b extends C11243d {
    public C11276b(C11243d dVar, C11328h hVar) {
        super(dVar);
    }

    /* renamed from: A */
    public String mo35829A() {
        C11319z zVar = (C11319z) mo35747j().mo35764q(C11296f0.C11297a.SID, C11319z.class);
        if (zVar != null) {
            return (String) zVar.mo35845b();
        }
        return null;
    }

    /* renamed from: B */
    public boolean mo35830B() {
        return mo35747j().mo35764q(C11296f0.C11297a.NT, C11309p.class) != null;
    }

    /* renamed from: y */
    public List<URL> mo35831y() {
        C11287b bVar = (C11287b) mo35747j().mo35764q(C11296f0.C11297a.CALLBACK, C11287b.class);
        if (bVar != null) {
            return (List) bVar.mo35845b();
        }
        return null;
    }

    /* renamed from: z */
    public Integer mo35832z() {
        C11286a0 a0Var = (C11286a0) mo35747j().mo35764q(C11296f0.C11297a.TIMEOUT, C11286a0.class);
        if (a0Var != null) {
            return (Integer) a0Var.mo35845b();
        }
        return null;
    }
}
