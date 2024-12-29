package org.eclipse.jetty.p195io;

import com.xiaomi.mipush.sdk.Constants;
import org.eclipse.jetty.p195io.Buffers;
import p225w5.C11940d;

/* renamed from: org.eclipse.jetty.io.d */
public class C9925d extends C9918a {

    /* renamed from: f */
    private final ThreadLocal<C9927b> f18183f = new C9926a(this);

    /* renamed from: org.eclipse.jetty.io.d$a */
    class C9926a extends ThreadLocal<C9927b> {
        C9926a(C9925d dVar) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C9927b initialValue() {
            return new C9927b();
        }
    }

    /* renamed from: org.eclipse.jetty.io.d$b */
    protected static class C9927b {

        /* renamed from: a */
        C11940d f18184a;

        /* renamed from: b */
        C11940d f18185b;

        /* renamed from: c */
        C11940d f18186c;

        protected C9927b() {
        }
    }

    public C9925d(Buffers.Type type, int i, Buffers.Type type2, int i2, Buffers.Type type3) {
        super(type, i, type2, i2, type3);
    }

    /* renamed from: a */
    public C11940d mo39861a() {
        C9927b bVar = this.f18183f.get();
        C11940d dVar = bVar.f18184a;
        if (dVar != null) {
            bVar.f18184a = null;
            return dVar;
        }
        C11940d dVar2 = bVar.f18186c;
        if (dVar2 == null || !mo39867g(dVar2)) {
            return mo39869i();
        }
        C11940d dVar3 = bVar.f18186c;
        bVar.f18186c = null;
        return dVar3;
    }

    /* renamed from: b */
    public void mo39862b(C11940d dVar) {
        dVar.clear();
        if (!dVar.mo42432k0() && !dVar.mo42438r0()) {
            C9927b bVar = this.f18183f.get();
            if (bVar.f18185b == null && mo39868h(dVar)) {
                bVar.f18185b = dVar;
            } else if (bVar.f18184a != null || !mo39867g(dVar)) {
                bVar.f18186c = dVar;
            } else {
                bVar.f18184a = dVar;
            }
        }
    }

    /* renamed from: c */
    public C11940d mo39863c(int i) {
        C9927b bVar = this.f18183f.get();
        C11940d dVar = bVar.f18186c;
        if (dVar == null || dVar.capacity() != i) {
            return mo39870j(i);
        }
        C11940d dVar2 = bVar.f18186c;
        bVar.f18186c = null;
        return dVar2;
    }

    /* renamed from: d */
    public C11940d mo39864d() {
        C9927b bVar = this.f18183f.get();
        C11940d dVar = bVar.f18185b;
        if (dVar != null) {
            bVar.f18185b = null;
            return dVar;
        }
        C11940d dVar2 = bVar.f18186c;
        if (dVar2 == null || !mo39868h(dVar2)) {
            return mo39871k();
        }
        C11940d dVar3 = bVar.f18186c;
        bVar.f18186c = null;
        return dVar3;
    }

    public String toString() {
        return "{{" + mo39866f() + Constants.ACCEPT_TIME_SEPARATOR_SP + mo39865e() + "}}";
    }
}
