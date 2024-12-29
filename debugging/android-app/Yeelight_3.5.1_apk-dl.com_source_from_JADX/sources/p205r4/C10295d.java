package p205r4;

import java.util.Timer;
import java.util.logging.Logger;
import javax.jmdns.impl.C9248f;
import javax.jmdns.impl.C9250g;
import javax.jmdns.impl.C9259h;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.ServiceInfoImpl;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import javax.jmdns.impl.constants.DNSState;

/* renamed from: r4.d */
public class C10295d extends C10294c {
    static {
        Logger.getLogger(C10295d.class.getName());
    }

    public C10295d(JmDNSImpl jmDNSImpl) {
        super(jmDNSImpl, C10294c.m25938o());
        DNSState dNSState = DNSState.PROBING_1;
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
        sb.append("Prober(");
        sb.append(mo41753f() != null ? mo41753f().mo37444o0() : "");
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo41812i() {
        mo41828v(mo41826s().advance());
        if (!mo41826s().isProbing()) {
            cancel();
            mo41753f().mo37440m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C9248f mo41813k(C9248f fVar) {
        fVar.mo37642w(C9250g.m22539A(mo41753f().mo37436k0().mo37390p(), DNSRecordType.TYPE_ANY, DNSRecordClass.CLASS_IN, false));
        for (C9259h d : mo41753f().mo37436k0().mo37379a(false, mo41824q())) {
            fVar = mo41751d(fVar, d);
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C9248f mo41814l(ServiceInfoImpl serviceInfoImpl, C9248f fVar) {
        String r = serviceInfoImpl.mo37330r();
        DNSRecordType dNSRecordType = DNSRecordType.TYPE_ANY;
        DNSRecordClass dNSRecordClass = DNSRecordClass.CLASS_IN;
        return mo41751d(mo41752e(fVar, C9250g.m22539A(r, dNSRecordType, dNSRecordClass, false)), new C9259h.C9265f(serviceInfoImpl.mo37330r(), dNSRecordClass, false, mo41824q(), serviceInfoImpl.mo37326k(), serviceInfoImpl.mo37335x(), serviceInfoImpl.mo37325j(), mo41753f().mo37436k0().mo37390p()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo41815m() {
        return !mo41753f().mo37413S0() && !mo41753f().mo37411N0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C9248f mo41816n() {
        return new C9248f(0);
    }

    /* renamed from: r */
    public String mo41817r() {
        return "probing";
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
    public void mo41830x(Timer timer) {
        long j;
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        int i = ((currentTimeMillis - mo41753f().mo37433j0()) > 5000 ? 1 : ((currentTimeMillis - mo41753f().mo37433j0()) == 5000 ? 0 : -1));
        JmDNSImpl f = mo41753f();
        if (i < 0) {
            f.mo37452s1(mo41753f().mo37459x0() + 1);
        } else {
            f.mo37452s1(1);
        }
        mo41753f().mo37451r1(currentTimeMillis);
        if (mo41753f().mo37408L0() && mo41753f().mo37459x0() < 10) {
            j = (long) JmDNSImpl.m22322p0().nextInt(251);
            j2 = 250;
        } else if (!mo41753f().mo37413S0() && !mo41753f().mo37411N0()) {
            j = 1000;
            j2 = 1000;
        } else {
            return;
        }
        timer.schedule(this, j, j2);
    }
}
