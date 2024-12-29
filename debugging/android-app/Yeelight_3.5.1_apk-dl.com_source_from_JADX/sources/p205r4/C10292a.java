package p205r4;

import java.util.Timer;
import java.util.logging.Logger;
import javax.jmdns.impl.C9241c;
import javax.jmdns.impl.C9248f;
import javax.jmdns.impl.C9259h;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.ServiceInfoImpl;
import javax.jmdns.impl.constants.DNSState;

/* renamed from: r4.a */
public class C10292a extends C10294c {
    static {
        Logger.getLogger(C10292a.class.getName());
    }

    public C10292a(JmDNSImpl jmDNSImpl) {
        super(jmDNSImpl, C10294c.m25938o());
        DNSState dNSState = DNSState.ANNOUNCING_1;
        mo41828v(dNSState);
        mo41823j(dNSState);
    }

    public boolean cancel() {
        mo41827u();
        return super.cancel();
    }

    /* renamed from: g */
    public String mo41754g() {
        StringBuilder sb = new StringBuilder();
        sb.append("Announcer(");
        sb.append(mo41753f() != null ? mo41753f().mo37444o0() : "");
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo41812i() {
        mo41828v(mo41826s().advance());
        if (!mo41826s().isAnnouncing()) {
            cancel();
            mo41753f().mo37446p();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C9248f mo41813k(C9248f fVar) {
        for (C9259h b : mo41753f().mo37436k0().mo37379a(true, mo41824q())) {
            fVar = mo41749b(fVar, (C9241c) null, b);
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C9248f mo41814l(ServiceInfoImpl serviceInfoImpl, C9248f fVar) {
        for (C9259h b : serviceInfoImpl.mo37496L(true, mo41824q(), mo41753f().mo37436k0())) {
            fVar = mo41749b(fVar, (C9241c) null, b);
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo41815m() {
        return !mo41753f().mo37413S0() && !mo41753f().mo37411N0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C9248f mo41816n() {
        return new C9248f(33792);
    }

    /* renamed from: r */
    public String mo41817r() {
        return "announcing";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo41818t(Throwable th) {
        mo41753f().mo37426g1();
    }

    public String toString() {
        return super.toString() + " state: " + mo41826s();
    }

    /* renamed from: x */
    public void mo41819x(Timer timer) {
        if (!mo41753f().mo37413S0() && !mo41753f().mo37411N0()) {
            timer.schedule(this, 1000, 1000);
        }
    }
}
