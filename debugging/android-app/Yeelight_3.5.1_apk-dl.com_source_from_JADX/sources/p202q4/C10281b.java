package p202q4;

import javax.jmdns.impl.C9237a;
import javax.jmdns.impl.C9248f;
import javax.jmdns.impl.C9250g;
import javax.jmdns.impl.C9259h;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.ServiceInfoImpl;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

/* renamed from: q4.b */
public class C10281b extends C10280a {

    /* renamed from: d */
    private final ServiceInfoImpl f19367d;

    public C10281b(JmDNSImpl jmDNSImpl, ServiceInfoImpl serviceInfoImpl) {
        super(jmDNSImpl);
        this.f19367d = serviceInfoImpl;
        serviceInfoImpl.mo37491F0(mo41753f());
        mo41753f().mo37404H(serviceInfoImpl, C9250g.m22539A(serviceInfoImpl.mo37330r(), DNSRecordType.TYPE_ANY, DNSRecordClass.CLASS_IN, false));
    }

    public boolean cancel() {
        boolean cancel = super.cancel();
        if (!this.f19367d.mo37316C()) {
            mo41753f().mo37437k1(this.f19367d);
        }
        return cancel;
    }

    /* renamed from: g */
    public String mo41754g() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceInfoResolver(");
        sb.append(mo41753f() != null ? mo41753f().mo37444o0() : "");
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C9248f mo41789h(C9248f fVar) {
        if (this.f19367d.mo37336y()) {
            return fVar;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C9237a c0 = mo41753f().mo37419c0();
        String r = this.f19367d.mo37330r();
        DNSRecordType dNSRecordType = DNSRecordType.TYPE_SRV;
        DNSRecordClass dNSRecordClass = DNSRecordClass.CLASS_IN;
        C9248f c = mo41750c(mo41750c(fVar, (C9259h) c0.mo37522d(r, dNSRecordType, dNSRecordClass), currentTimeMillis), (C9259h) mo41753f().mo37419c0().mo37522d(this.f19367d.mo37330r(), DNSRecordType.TYPE_TXT, dNSRecordClass), currentTimeMillis);
        return this.f19367d.mo37331s().length() > 0 ? mo41750c(mo41750c(c, (C9259h) mo41753f().mo37419c0().mo37522d(this.f19367d.mo37331s(), DNSRecordType.TYPE_A, dNSRecordClass), currentTimeMillis), (C9259h) mo41753f().mo37419c0().mo37522d(this.f19367d.mo37331s(), DNSRecordType.TYPE_AAAA, dNSRecordClass), currentTimeMillis) : c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C9248f mo41790i(C9248f fVar) {
        if (this.f19367d.mo37336y()) {
            return fVar;
        }
        String r = this.f19367d.mo37330r();
        DNSRecordType dNSRecordType = DNSRecordType.TYPE_SRV;
        DNSRecordClass dNSRecordClass = DNSRecordClass.CLASS_IN;
        C9248f e = mo41752e(mo41752e(fVar, C9250g.m22539A(r, dNSRecordType, dNSRecordClass, false)), C9250g.m22539A(this.f19367d.mo37330r(), DNSRecordType.TYPE_TXT, dNSRecordClass, false));
        return this.f19367d.mo37331s().length() > 0 ? mo41752e(mo41752e(e, C9250g.m22539A(this.f19367d.mo37331s(), DNSRecordType.TYPE_A, dNSRecordClass, false)), C9250g.m22539A(this.f19367d.mo37331s(), DNSRecordType.TYPE_AAAA, dNSRecordClass, false)) : e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo41791j() {
        StringBuilder sb = new StringBuilder();
        sb.append("querying service info: ");
        ServiceInfoImpl serviceInfoImpl = this.f19367d;
        sb.append(serviceInfoImpl != null ? serviceInfoImpl.mo37330r() : "null");
        return sb.toString();
    }
}
