package p164h.p165b.p166a.p240h.p243r.p245l;

import java.net.URL;
import p164h.p165b.p166a.p240h.p243r.C11241b;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p247n.C11292d0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11294e0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11295f;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11303j;
import p164h.p165b.p166a.p240h.p243r.p247n.C11305l;
import p164h.p165b.p166a.p240h.p243r.p247n.C11308o;
import p164h.p165b.p166a.p240h.p243r.p247n.C11317x;
import p164h.p165b.p166a.p240h.p252w.C11365e0;
import p164h.p165b.p166a.p240h.p252w.C11392s;
import p164h.p165b.p166a.p240h.p252w.C11393t;

/* renamed from: h.b.a.h.r.l.c */
public class C11263c extends C11241b<C11252j> {
    public C11263c(C11241b<C11252j> bVar) {
        super(bVar);
    }

    /* renamed from: A */
    public C11365e0 mo35819A() {
        C11296f0 q = mo35747j().mo35764q(C11296f0.C11297a.USN, C11294e0.class);
        if (q != null) {
            return (C11365e0) q.mo35845b();
        }
        C11296f0 q2 = mo35747j().mo35764q(C11296f0.C11297a.USN, C11292d0.class);
        if (q2 != null) {
            return (C11365e0) q2.mo35845b();
        }
        C11296f0 q3 = mo35747j().mo35764q(C11296f0.C11297a.USN, C11295f.class);
        if (q3 != null) {
            return ((C11392s) q3.mo35845b()).mo36121b();
        }
        C11296f0 q4 = mo35747j().mo35764q(C11296f0.C11297a.USN, C11317x.class);
        if (q4 != null) {
            return ((C11393t) q4.mo35845b()).mo36126b();
        }
        return null;
    }

    /* renamed from: B */
    public boolean mo35820B() {
        C11296f0 p = mo35747j().mo35762p(C11296f0.C11297a.ST);
        C11296f0 p2 = mo35747j().mo35762p(C11296f0.C11297a.USN);
        return (p == null || p.mo35845b() == null || p2 == null || p2.mo35845b() == null || mo35747j().mo35762p(C11296f0.C11297a.EXT) == null) ? false : true;
    }

    /* renamed from: x */
    public byte[] mo35821x() {
        C11303j jVar = (C11303j) mo35747j().mo35764q(C11296f0.C11297a.EXT_IFACE_MAC, C11303j.class);
        if (jVar != null) {
            return (byte[]) jVar.mo35845b();
        }
        return null;
    }

    /* renamed from: y */
    public URL mo35822y() {
        C11305l lVar = (C11305l) mo35747j().mo35764q(C11296f0.C11297a.f22410h, C11305l.class);
        if (lVar != null) {
            return (URL) lVar.mo35845b();
        }
        return null;
    }

    /* renamed from: z */
    public Integer mo35823z() {
        C11308o oVar = (C11308o) mo35747j().mo35764q(C11296f0.C11297a.MAX_AGE, C11308o.class);
        if (oVar != null) {
            return (Integer) oVar.mo35845b();
        }
        return null;
    }
}
