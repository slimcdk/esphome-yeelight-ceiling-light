package p198p4;

import java.io.IOException;
import java.util.TimerTask;
import javax.jmdns.impl.C9241c;
import javax.jmdns.impl.C9248f;
import javax.jmdns.impl.C9250g;
import javax.jmdns.impl.C9259h;
import javax.jmdns.impl.JmDNSImpl;

/* renamed from: p4.a */
public abstract class C10268a extends TimerTask {

    /* renamed from: a */
    private final JmDNSImpl f19335a;

    protected C10268a(JmDNSImpl jmDNSImpl) {
        this.f19335a = jmDNSImpl;
    }

    /* renamed from: b */
    public C9248f mo41749b(C9248f fVar, C9241c cVar, C9259h hVar) {
        try {
            fVar.mo37638t(cVar, hVar);
            return fVar;
        } catch (IOException unused) {
            int e = fVar.mo37623e();
            boolean m = fVar.mo37631m();
            int z = fVar.mo37645z();
            int f = fVar.mo37624f();
            fVar.mo37636r(e | 512);
            fVar.mo37637s(f);
            this.f19335a.mo37449q1(fVar);
            C9248f fVar2 = new C9248f(e, m, z);
            fVar2.mo37638t(cVar, hVar);
            return fVar2;
        }
    }

    /* renamed from: c */
    public C9248f mo41750c(C9248f fVar, C9259h hVar, long j) {
        try {
            fVar.mo37640u(hVar, j);
            return fVar;
        } catch (IOException unused) {
            int e = fVar.mo37623e();
            boolean m = fVar.mo37631m();
            int z = fVar.mo37645z();
            int f = fVar.mo37624f();
            fVar.mo37636r(e | 512);
            fVar.mo37637s(f);
            this.f19335a.mo37449q1(fVar);
            C9248f fVar2 = new C9248f(e, m, z);
            fVar2.mo37640u(hVar, j);
            return fVar2;
        }
    }

    /* renamed from: d */
    public C9248f mo41751d(C9248f fVar, C9259h hVar) {
        try {
            fVar.mo37641v(hVar);
            return fVar;
        } catch (IOException unused) {
            int e = fVar.mo37623e();
            boolean m = fVar.mo37631m();
            int z = fVar.mo37645z();
            int f = fVar.mo37624f();
            fVar.mo37636r(e | 512);
            fVar.mo37637s(f);
            this.f19335a.mo37449q1(fVar);
            C9248f fVar2 = new C9248f(e, m, z);
            fVar2.mo37641v(hVar);
            return fVar2;
        }
    }

    /* renamed from: e */
    public C9248f mo41752e(C9248f fVar, C9250g gVar) {
        try {
            fVar.mo37642w(gVar);
            return fVar;
        } catch (IOException unused) {
            int e = fVar.mo37623e();
            boolean m = fVar.mo37631m();
            int z = fVar.mo37645z();
            int f = fVar.mo37624f();
            fVar.mo37636r(e | 512);
            fVar.mo37637s(f);
            this.f19335a.mo37449q1(fVar);
            C9248f fVar2 = new C9248f(e, m, z);
            fVar2.mo37642w(gVar);
            return fVar2;
        }
    }

    /* renamed from: f */
    public JmDNSImpl mo41753f() {
        return this.f19335a;
    }

    /* renamed from: g */
    public abstract String mo41754g();

    public String toString() {
        return mo41754g();
    }
}
