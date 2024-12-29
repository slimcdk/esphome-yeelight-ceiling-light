package p011c.p012a.p019b.p028b.p032c.p036d;

/* renamed from: c.a.b.b.c.d.f */
public final class C0586f extends C0593m<C0586f> {

    /* renamed from: c */
    public C0587g[] f237c = C0587g.m369i();

    public C0586f() {
        this.f268b = null;
        this.f279a = -1;
    }

    /* renamed from: i */
    public static C0586f m365i(byte[] bArr) {
        C0586f fVar = new C0586f();
        C0599s.m454b(fVar, bArr, 0, bArr.length);
        return fVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C0599s mo8561a(C0590j jVar) {
        while (true) {
            int n = jVar.mo8583n();
            if (n == 0) {
                return this;
            }
            if (n == 10) {
                int a = C0602v.m464a(jVar, 10);
                C0587g[] gVarArr = this.f237c;
                int length = gVarArr == null ? 0 : gVarArr.length;
                int i = a + length;
                C0587g[] gVarArr2 = new C0587g[i];
                if (length != 0) {
                    System.arraycopy(this.f237c, 0, gVarArr2, 0, length);
                }
                while (length < i - 1) {
                    gVarArr2[length] = new C0587g();
                    jVar.mo8575e(gVarArr2[length]);
                    jVar.mo8583n();
                    length++;
                }
                gVarArr2[length] = new C0587g();
                jVar.mo8575e(gVarArr2[length]);
                this.f237c = gVarArr2;
            } else if (!super.mo8602h(jVar, n)) {
                return this;
            }
        }
    }

    /* renamed from: c */
    public final void mo8562c(C0591k kVar) {
        C0587g[] gVarArr = this.f237c;
        if (gVarArr != null && gVarArr.length > 0) {
            int i = 0;
            while (true) {
                C0587g[] gVarArr2 = this.f237c;
                if (i >= gVarArr2.length) {
                    break;
                }
                C0587g gVar = gVarArr2[i];
                if (gVar != null) {
                    kVar.mo8592e(1, gVar);
                }
                i++;
            }
        }
        super.mo8562c(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo8563e() {
        int e = super.mo8563e();
        C0587g[] gVarArr = this.f237c;
        if (gVarArr != null && gVarArr.length > 0) {
            int i = 0;
            while (true) {
                C0587g[] gVarArr2 = this.f237c;
                if (i >= gVarArr2.length) {
                    break;
                }
                C0587g gVar = gVarArr2[i];
                if (gVar != null) {
                    e += C0591k.m406j(1, gVar);
                }
                i++;
            }
        }
        return e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0586f)) {
            return false;
        }
        C0586f fVar = (C0586f) obj;
        if (!C0597q.m446c(this.f237c, fVar.f237c)) {
            return false;
        }
        C0595o oVar = this.f268b;
        if (oVar != null && !oVar.mo8603b()) {
            return this.f268b.equals(fVar.f268b);
        }
        C0595o oVar2 = fVar.f268b;
        return oVar2 == null || oVar2.mo8603b();
    }

    public final int hashCode() {
        int hashCode = (((C0586f.class.getName().hashCode() + 527) * 31) + C0597q.m449f(this.f237c)) * 31;
        C0595o oVar = this.f268b;
        return hashCode + ((oVar == null || oVar.mo8603b()) ? 0 : this.f268b.hashCode());
    }
}
