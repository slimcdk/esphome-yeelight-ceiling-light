package p164h.p211a.p212a.p220e.p221o;

import java.io.Serializable;
import p154d.p155b.p204f0.C10713g;
import p154d.p155b.p204f0.C10714h;
import p154d.p155b.p204f0.C10716j;
import p154d.p155b.p204f0.C10717k;
import p154d.p155b.p204f0.C10718l;
import p164h.p211a.p212a.p220e.C10987k;
import p164h.p211a.p212a.p222f.C11018d;
import p164h.p211a.p212a.p222f.C11046u;
import p164h.p211a.p212a.p228h.p234y.C11156b;

/* renamed from: h.a.a.e.o.g */
public class C11006g implements C11018d.C11025g, Serializable, C10714h, C10717k {

    /* renamed from: a */
    private final String f21511a;

    /* renamed from: b */
    private final Object f21512b;

    /* renamed from: c */
    private transient C11046u f21513c;

    /* renamed from: d */
    private transient C10713g f21514d;

    static {
        C11156b.m29015a(C11006g.class);
    }

    public C11006g(String str, C11046u uVar, Object obj) {
        this.f21511a = str;
        this.f21513c = uVar;
        uVar.mo35041a().getName();
        this.f21512b = obj;
    }

    /* renamed from: M */
    private void m28057M() {
        C10987k U0 = C10987k.m27980U0();
        if (U0 != null) {
            U0.mo34763X0(this);
        }
        C10713g gVar = this.f21514d;
        if (gVar != null) {
            gVar.mo33940e("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated");
        }
    }

    /* renamed from: B */
    public void mo33950B(C10716j jVar) {
        m28057M();
    }

    /* renamed from: D */
    public void mo33944D(C10718l lVar) {
    }

    /* renamed from: a */
    public C11046u mo34765a() {
        return this.f21513c;
    }

    /* renamed from: c */
    public String mo34766c() {
        return this.f21511a;
    }

    /* renamed from: s */
    public void mo33945s(C10718l lVar) {
        if (this.f21514d == null) {
            this.f21514d = lVar.mo33949a();
        }
    }

    public String toString() {
        return "Session" + super.toString();
    }

    /* renamed from: w */
    public void mo33951w(C10716j jVar) {
        if (this.f21514d == null) {
            this.f21514d = jVar.mo33949a();
        }
    }
}
