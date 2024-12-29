package org.eclipse.jetty.servlet;

import javax.servlet.ServletException;
import org.eclipse.jetty.servlet.C9965c;
import org.eclipse.jetty.servlet.Holder;
import p152e6.C9001b;
import p152e6.C9003c;
import p208s4.C10352d;
import p208s4.C10354f;

/* renamed from: org.eclipse.jetty.servlet.a */
public class C9961a extends Holder<C10352d> {

    /* renamed from: o */
    private static final C9003c f18317o = C9001b.m21450a(C9961a.class);

    /* renamed from: m */
    private transient C10352d f18318m;

    /* renamed from: n */
    private transient C9962a f18319n;

    /* renamed from: org.eclipse.jetty.servlet.a$a */
    class C9962a extends Holder<C10352d>.a implements C10354f {
        C9962a(C9961a aVar) {
            super();
        }
    }

    public C9961a() {
        super(Holder.Source.EMBEDDED);
    }

    /* renamed from: O0 */
    public void mo40057O0(Object obj) {
        if (obj != null) {
            C10352d dVar = (C10352d) obj;
            dVar.destroy();
            mo40026G0().mo40087b1(dVar);
        }
    }

    /* renamed from: P0 */
    public C10352d mo40058P0() {
        return this.f18318m;
    }

    public String toString() {
        return getName();
    }

    /* renamed from: u0 */
    public void mo26547u0() {
        super.mo26547u0();
        if (C10352d.class.isAssignableFrom(this.f18288e)) {
            if (this.f18318m == null) {
                try {
                    this.f18318m = ((C9965c.C9966a) this.f18294k.mo40093h1()).mo40077i(mo40024E0());
                } catch (ServletException e) {
                    Throwable rootCause = e.getRootCause();
                    if (rootCause instanceof InstantiationException) {
                        throw ((InstantiationException) rootCause);
                    } else if (rootCause instanceof IllegalAccessException) {
                        throw ((IllegalAccessException) rootCause);
                    } else {
                        throw e;
                    }
                }
            }
            C9962a aVar = new C9962a(this);
            this.f18319n = aVar;
            this.f18318m.mo41938b(aVar);
            return;
        }
        String str = this.f18288e + " is not a javax.servlet.Filter";
        super.stop();
        throw new IllegalStateException(str);
    }

    /* renamed from: v0 */
    public void mo26548v0() {
        C10352d dVar = this.f18318m;
        if (dVar != null) {
            try {
                mo40057O0(dVar);
            } catch (Exception e) {
                f18317o.mo36856j(e);
            }
        }
        if (!this.f18291h) {
            this.f18318m = null;
        }
        this.f18319n = null;
        super.mo26548v0();
    }
}
