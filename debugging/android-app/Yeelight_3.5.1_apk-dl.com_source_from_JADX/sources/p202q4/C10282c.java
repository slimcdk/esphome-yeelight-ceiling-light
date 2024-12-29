package p202q4;

import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.C9248f;
import javax.jmdns.impl.C9250g;
import javax.jmdns.impl.C9259h;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

/* renamed from: q4.c */
public class C10282c extends C10280a {

    /* renamed from: d */
    private final String f19368d;

    public C10282c(JmDNSImpl jmDNSImpl, String str) {
        super(jmDNSImpl);
        this.f19368d = str;
    }

    /* renamed from: g */
    public String mo41754g() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceResolver(");
        sb.append(mo41753f() != null ? mo41753f().mo37444o0() : "");
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C9248f mo41789h(C9248f fVar) {
        long currentTimeMillis = System.currentTimeMillis();
        for (ServiceInfo next : mo41753f().mo37455v0().values()) {
            fVar = mo41750c(fVar, new C9259h.C9264e(next.mo37334w(), DNSRecordClass.CLASS_IN, false, 3600, next.mo37330r()), currentTimeMillis);
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C9248f mo41790i(C9248f fVar) {
        return mo41752e(fVar, C9250g.m22539A(this.f19368d, DNSRecordType.TYPE_PTR, DNSRecordClass.CLASS_IN, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo41791j() {
        return "querying service";
    }
}
