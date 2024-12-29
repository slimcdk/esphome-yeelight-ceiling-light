package p154d.p198a.p199g.p201s;

import java.io.IOException;
import java.util.TimerTask;
import p154d.p198a.p199g.C10621c;
import p154d.p198a.p199g.C10626f;
import p154d.p198a.p199g.C10628g;
import p154d.p198a.p199g.C10637h;
import p154d.p198a.p199g.C10656l;

/* renamed from: d.a.g.s.a */
public abstract class C10686a extends TimerTask {

    /* renamed from: a */
    private final C10656l f20585a;

    protected C10686a(C10656l lVar) {
        this.f20585a = lVar;
    }

    /* renamed from: b */
    public C10626f mo33841b(C10626f fVar, C10621c cVar, C10637h hVar) {
        try {
            fVar.mo33579t(cVar, hVar);
            return fVar;
        } catch (IOException unused) {
            int e = fVar.mo33564e();
            boolean m = fVar.mo33572m();
            int z = fVar.mo33586z();
            int f = fVar.mo33565f();
            fVar.mo33577r(e | 512);
            fVar.mo33578s(f);
            this.f20585a.mo33738s1(fVar);
            C10626f fVar2 = new C10626f(e, m, z);
            fVar2.mo33579t(cVar, hVar);
            return fVar2;
        }
    }

    /* renamed from: c */
    public C10626f mo33842c(C10626f fVar, C10637h hVar, long j) {
        try {
            fVar.mo33581u(hVar, j);
            return fVar;
        } catch (IOException unused) {
            int e = fVar.mo33564e();
            boolean m = fVar.mo33572m();
            int z = fVar.mo33586z();
            int f = fVar.mo33565f();
            fVar.mo33577r(e | 512);
            fVar.mo33578s(f);
            this.f20585a.mo33738s1(fVar);
            C10626f fVar2 = new C10626f(e, m, z);
            fVar2.mo33581u(hVar, j);
            return fVar2;
        }
    }

    /* renamed from: d */
    public C10626f mo33843d(C10626f fVar, C10637h hVar) {
        try {
            fVar.mo33582v(hVar);
            return fVar;
        } catch (IOException unused) {
            int e = fVar.mo33564e();
            boolean m = fVar.mo33572m();
            int z = fVar.mo33586z();
            int f = fVar.mo33565f();
            fVar.mo33577r(e | 512);
            fVar.mo33578s(f);
            this.f20585a.mo33738s1(fVar);
            C10626f fVar2 = new C10626f(e, m, z);
            fVar2.mo33582v(hVar);
            return fVar2;
        }
    }

    /* renamed from: e */
    public C10626f mo33844e(C10626f fVar, C10628g gVar) {
        try {
            fVar.mo33583w(gVar);
            return fVar;
        } catch (IOException unused) {
            int e = fVar.mo33564e();
            boolean m = fVar.mo33572m();
            int z = fVar.mo33586z();
            int f = fVar.mo33565f();
            fVar.mo33577r(e | 512);
            fVar.mo33578s(f);
            this.f20585a.mo33738s1(fVar);
            C10626f fVar2 = new C10626f(e, m, z);
            fVar2.mo33583w(gVar);
            return fVar2;
        }
    }

    /* renamed from: f */
    public C10656l mo33845f() {
        return this.f20585a;
    }

    /* renamed from: g */
    public abstract String mo33846g();

    public String toString() {
        return mo33846g();
    }
}
