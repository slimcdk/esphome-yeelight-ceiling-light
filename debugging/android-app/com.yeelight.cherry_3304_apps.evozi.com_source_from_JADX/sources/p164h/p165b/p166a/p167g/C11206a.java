package p164h.p165b.p166a.p167g;

import p164h.p165b.p166a.p240h.p241p.C11230d;
import p164h.p165b.p166a.p240h.p241p.C11232f;
import p164h.p165b.p166a.p240h.p243r.C11252j;

/* renamed from: h.b.a.g.a */
public abstract class C11206a implements Runnable {

    /* renamed from: a */
    protected final C11232f f22269a;

    /* renamed from: b */
    protected C4427b f22270b;

    protected C11206a(C11232f fVar) {
        this.f22269a = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo35594b(C11232f fVar, C11252j jVar) {
        C11230d c = fVar.mo35702c();
        String str = "Error: ";
        if (c != null) {
            str = str + c.getMessage();
        }
        if (jVar == null) {
            return str;
        }
        return str + " (HTTP response was: " + jVar.mo35795c() + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo35595c(C11232f fVar, C11252j jVar) {
        mo28122d(fVar, jVar, mo35594b(fVar, jVar));
    }

    /* renamed from: d */
    public abstract void mo28122d(C11232f fVar, C11252j jVar, String str);

    /* renamed from: e */
    public synchronized C4427b mo35596e() {
        return this.f22270b;
    }

    /* renamed from: f */
    public synchronized C11206a mo35597f(C4427b bVar) {
        this.f22270b = bVar;
        return this;
    }

    /* renamed from: g */
    public abstract void mo28123g(C11232f fVar);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r5.f22269a.mo35702c() != null) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            h.b.a.h.p.f r0 = r5.f22269a
            h.b.a.h.s.a r0 = r0.mo35700a()
            h.b.a.h.s.o r0 = r0.mo35859g()
            boolean r1 = r0 instanceof p164h.p165b.p166a.p240h.p248s.C11328h
            r2 = 0
            if (r1 == 0) goto L_0x0029
            h.b.a.h.s.h r0 = (p164h.p165b.p166a.p240h.p248s.C11328h) r0
            h.b.a.h.p.f r1 = r5.f22269a
            h.b.a.h.s.a r1 = r1.mo35700a()
            h.b.a.h.p.e r0 = r0.mo35949p(r1)
            h.b.a.h.p.f r1 = r5.f22269a
            r0.mo35692a(r1)
            h.b.a.h.p.f r0 = r5.f22269a
            h.b.a.h.p.d r0 = r0.mo35702c()
            if (r0 == 0) goto L_0x007a
            goto L_0x005c
        L_0x0029:
            boolean r1 = r0 instanceof p164h.p165b.p166a.p240h.p248s.C11334n
            if (r1 == 0) goto L_0x00a3
            h.b.a.g.b r1 = r5.mo35596e()
            if (r1 == 0) goto L_0x009b
            h.b.a.h.s.n r0 = (p164h.p165b.p166a.p240h.p248s.C11334n) r0
            h.b.a.h.s.c r1 = r0.mo35983d()     // Catch:{ IllegalArgumentException -> 0x0080 }
            h.b.a.h.s.l r1 = (p164h.p165b.p166a.p240h.p248s.C11332l) r1     // Catch:{ IllegalArgumentException -> 0x0080 }
            java.net.URI r3 = r0.mo35976n()     // Catch:{ IllegalArgumentException -> 0x0080 }
            java.net.URL r0 = r1.mo35970N(r3)     // Catch:{ IllegalArgumentException -> 0x0080 }
            h.b.a.g.b r1 = r5.mo35596e()
            h.b.a.i.b r1 = r1.getProtocolFactory()
            h.b.a.h.p.f r3 = r5.f22269a
            h.b.a.i.j.f r0 = r1.mo24384f(r3, r0)
            r0.run()
            h.b.a.h.r.e r0 = r0.mo36178f()
            h.b.a.h.r.k.e r0 = (p164h.p165b.p166a.p240h.p243r.p244k.C11258e) r0
            if (r0 != 0) goto L_0x0062
        L_0x005c:
            h.b.a.h.p.f r0 = r5.f22269a
            r5.mo35595c(r0, r2)
            goto L_0x00a3
        L_0x0062:
            h.b.a.h.r.h r1 = r0.mo35776k()
            h.b.a.h.r.j r1 = (p164h.p165b.p166a.p240h.p243r.C11252j) r1
            boolean r1 = r1.mo35798f()
            if (r1 == 0) goto L_0x007a
            h.b.a.h.p.f r1 = r5.f22269a
            h.b.a.h.r.h r0 = r0.mo35776k()
            h.b.a.h.r.j r0 = (p164h.p165b.p166a.p240h.p243r.C11252j) r0
            r5.mo35595c(r1, r0)
            goto L_0x00a3
        L_0x007a:
            h.b.a.h.p.f r0 = r5.f22269a
            r5.mo28123g(r0)
            goto L_0x00a3
        L_0x0080:
            h.b.a.h.p.f r1 = r5.f22269a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "bad control URL: "
            r3.append(r4)
            java.net.URI r0 = r0.mo35976n()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r5.mo28122d(r1, r2, r0)
            return
        L_0x009b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Callback must be executed through ControlPoint"
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p167g.C11206a.run():void");
    }

    public String toString() {
        return "(ActionCallback) " + this.f22269a;
    }
}
