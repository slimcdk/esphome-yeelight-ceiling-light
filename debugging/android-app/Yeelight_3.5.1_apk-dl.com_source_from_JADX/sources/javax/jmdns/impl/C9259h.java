package javax.jmdns.impl;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.C9248f;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import org.apache.commons.p194io.IOUtils;

/* renamed from: javax.jmdns.impl.h */
public abstract class C9259h extends C9240b {

    /* renamed from: k */
    private static Logger f17163k = Logger.getLogger(C9259h.class.getName());

    /* renamed from: l */
    public static final byte[] f17164l = {0};

    /* renamed from: h */
    private int f17165h;

    /* renamed from: i */
    private long f17166i = System.currentTimeMillis();

    /* renamed from: j */
    private InetAddress f17167j;

    /* renamed from: javax.jmdns.impl.h$a */
    public static abstract class C9260a extends C9259h {

        /* renamed from: n */
        private static Logger f17168n = Logger.getLogger(C9260a.class.getName());

        /* renamed from: m */
        InetAddress f17169m;

        protected C9260a(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z, int i, InetAddress inetAddress) {
            super(str, dNSRecordType, dNSRecordClass, z, i);
            this.f17169m = inetAddress;
        }

        protected C9260a(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z, int i, byte[] bArr) {
            super(str, dNSRecordType, dNSRecordClass, z, i);
            try {
                this.f17169m = InetAddress.getByAddress(bArr);
            } catch (UnknownHostException e) {
                f17168n.log(Level.WARNING, "Address() exception ", e);
            }
        }

        /* renamed from: B */
        public ServiceInfo mo37661B(boolean z) {
            return new ServiceInfoImpl(mo37555d(), 0, 0, 0, z, (byte[]) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public boolean mo37663D(JmDNSImpl jmDNSImpl, long j) {
            if (!jmDNSImpl.mo37436k0().mo37383e(this)) {
                return false;
            }
            int a = mo37552a(jmDNSImpl.mo37436k0().mo37384j(mo37558f(), mo37569p(), 3600));
            if (a == 0) {
                f17168n.finer("handleQuery() Ignoring an identical address query");
                return false;
            }
            f17168n.finer("handleQuery() Conflicting query detected.");
            if (jmDNSImpl.mo37416V0() && a > 0) {
                jmDNSImpl.mo37436k0().mo37391q();
                jmDNSImpl.mo37419c0().clear();
                Iterator<ServiceInfo> it = jmDNSImpl.mo37455v0().values().iterator();
                while (it.hasNext()) {
                    ((ServiceInfoImpl) it.next()).mo37488C0();
                }
            }
            jmDNSImpl.mo37447p1();
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public boolean mo37664E(JmDNSImpl jmDNSImpl) {
            if (!jmDNSImpl.mo37436k0().mo37383e(this)) {
                return false;
            }
            f17168n.finer("handleResponse() Denial detected");
            if (jmDNSImpl.mo37416V0()) {
                jmDNSImpl.mo37436k0().mo37391q();
                jmDNSImpl.mo37419c0().clear();
                Iterator<ServiceInfo> it = jmDNSImpl.mo37455v0().values().iterator();
                while (it.hasNext()) {
                    ((ServiceInfoImpl) it.next()).mo37488C0();
                }
            }
            jmDNSImpl.mo37447p1();
            return true;
        }

        /* renamed from: F */
        public boolean mo37665F() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo37669J(C9259h hVar) {
            if (!(hVar instanceof C9260a)) {
                return false;
            }
            C9260a aVar = (C9260a) hVar;
            if (mo37679P() != null || aVar.mo37679P() == null) {
                return mo37679P().equals(aVar.mo37679P());
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P */
        public InetAddress mo37679P() {
            return this.f17169m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public boolean mo37680Q(C9259h hVar) {
            return mo37554c().equalsIgnoreCase(hVar.mo37554c());
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo37573t(DataOutputStream dataOutputStream) {
            super.mo37573t(dataOutputStream);
            byte[] address = mo37679P().getAddress();
            for (byte writeByte : address) {
                dataOutputStream.writeByte(writeByte);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo37576v(StringBuilder sb) {
            C9259h.super.mo37576v(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" address: '");
            sb2.append(mo37679P() != null ? mo37679P().getHostAddress() : "null");
            sb2.append("'");
            sb.append(sb2.toString());
        }

        /* renamed from: z */
        public ServiceEvent mo37678z(JmDNSImpl jmDNSImpl) {
            ServiceInfo B = mo37661B(false);
            ((ServiceInfoImpl) B).mo37491F0(jmDNSImpl);
            return new ServiceEventImpl(jmDNSImpl, B.mo37334w(), B.mo37324i(), B);
        }
    }

    /* renamed from: javax.jmdns.impl.h$b */
    public static class C9261b extends C9259h {

        /* renamed from: m */
        String f17170m;

        /* renamed from: n */
        String f17171n;

        public C9261b(String str, DNSRecordClass dNSRecordClass, boolean z, int i, String str2, String str3) {
            super(str, DNSRecordType.TYPE_HINFO, dNSRecordClass, z, i);
            this.f17171n = str2;
            this.f17170m = str3;
        }

        /* renamed from: B */
        public ServiceInfo mo37661B(boolean z) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("cpu", this.f17171n);
            hashMap.put("os", this.f17170m);
            return new ServiceInfoImpl(mo37555d(), 0, 0, 0, z, (Map<String, ?>) hashMap);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public boolean mo37663D(JmDNSImpl jmDNSImpl, long j) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public boolean mo37664E(JmDNSImpl jmDNSImpl) {
            return false;
        }

        /* renamed from: F */
        public boolean mo37665F() {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo37669J(C9259h hVar) {
            if (!(hVar instanceof C9261b)) {
                return false;
            }
            C9261b bVar = (C9261b) hVar;
            String str = this.f17171n;
            if (str != null || bVar.f17171n == null) {
                return (this.f17170m != null || bVar.f17170m == null) && str.equals(bVar.f17171n) && this.f17170m.equals(bVar.f17170m);
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public void mo37674O(C9248f.C9249a aVar) {
            String str = this.f17171n + " " + this.f17170m;
            aVar.mo37654m(str, 0, str.length());
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo37576v(StringBuilder sb) {
            C9259h.super.mo37576v(sb);
            sb.append(" cpu: '" + this.f17171n + "' os: '" + this.f17170m + "'");
        }

        /* renamed from: z */
        public ServiceEvent mo37678z(JmDNSImpl jmDNSImpl) {
            ServiceInfo B = mo37661B(false);
            ((ServiceInfoImpl) B).mo37491F0(jmDNSImpl);
            return new ServiceEventImpl(jmDNSImpl, B.mo37334w(), B.mo37324i(), B);
        }
    }

    /* renamed from: javax.jmdns.impl.h$c */
    public static class C9262c extends C9260a {
        C9262c(String str, DNSRecordClass dNSRecordClass, boolean z, int i, InetAddress inetAddress) {
            super(str, DNSRecordType.TYPE_A, dNSRecordClass, z, i, inetAddress);
        }

        C9262c(String str, DNSRecordClass dNSRecordClass, boolean z, int i, byte[] bArr) {
            super(str, DNSRecordType.TYPE_A, dNSRecordClass, z, i, bArr);
        }

        /* renamed from: B */
        public ServiceInfo mo37661B(boolean z) {
            ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) super.mo37661B(z);
            serviceInfoImpl.mo37490E((Inet4Address) this.f17169m);
            return serviceInfoImpl;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public void mo37674O(C9248f.C9249a aVar) {
            InetAddress inetAddress = this.f17169m;
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (!(this.f17169m instanceof Inet4Address)) {
                    byte[] bArr = new byte[4];
                    System.arraycopy(address, 12, bArr, 0, 4);
                    address = bArr;
                }
                aVar.mo37647c(address, 0, address.length);
            }
        }
    }

    /* renamed from: javax.jmdns.impl.h$d */
    public static class C9263d extends C9260a {
        C9263d(String str, DNSRecordClass dNSRecordClass, boolean z, int i, InetAddress inetAddress) {
            super(str, DNSRecordType.TYPE_AAAA, dNSRecordClass, z, i, inetAddress);
        }

        C9263d(String str, DNSRecordClass dNSRecordClass, boolean z, int i, byte[] bArr) {
            super(str, DNSRecordType.TYPE_AAAA, dNSRecordClass, z, i, bArr);
        }

        /* renamed from: B */
        public ServiceInfo mo37661B(boolean z) {
            ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) super.mo37661B(z);
            serviceInfoImpl.mo37494K((Inet6Address) this.f17169m);
            return serviceInfoImpl;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public void mo37674O(C9248f.C9249a aVar) {
            InetAddress inetAddress = this.f17169m;
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (this.f17169m instanceof Inet4Address) {
                    byte[] bArr = new byte[16];
                    for (int i = 0; i < 16; i++) {
                        if (i < 11) {
                            bArr[i] = address[i - 12];
                        } else {
                            bArr[i] = 0;
                        }
                    }
                    address = bArr;
                }
                aVar.mo37647c(address, 0, address.length);
            }
        }
    }

    /* renamed from: javax.jmdns.impl.h$e */
    public static class C9264e extends C9259h {

        /* renamed from: m */
        private final String f17172m;

        public C9264e(String str, DNSRecordClass dNSRecordClass, boolean z, int i, String str2) {
            super(str, DNSRecordType.TYPE_PTR, dNSRecordClass, z, i);
            this.f17172m = str2;
        }

        /* renamed from: B */
        public ServiceInfo mo37661B(boolean z) {
            if (mo37568o()) {
                return new ServiceInfoImpl(ServiceInfoImpl.m22401U(mo37681P()), 0, 0, 0, z, (byte[]) null);
            }
            if (mo37564k()) {
                return new ServiceInfoImpl(mo37555d(), 0, 0, 0, z, (byte[]) null);
            }
            if (mo37562i()) {
                return new ServiceInfoImpl(mo37555d(), 0, 0, 0, z, (byte[]) null);
            }
            Map<ServiceInfo.Fields, String> U = ServiceInfoImpl.m22401U(mo37681P());
            ServiceInfo.Fields fields = ServiceInfo.Fields.Subtype;
            U.put(fields, mo37555d().get(fields));
            return new ServiceInfoImpl(U, 0, 0, 0, z, mo37681P());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public boolean mo37663D(JmDNSImpl jmDNSImpl, long j) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public boolean mo37664E(JmDNSImpl jmDNSImpl) {
            return false;
        }

        /* renamed from: F */
        public boolean mo37665F() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo37669J(C9259h hVar) {
            if (!(hVar instanceof C9264e)) {
                return false;
            }
            C9264e eVar = (C9264e) hVar;
            String str = this.f17172m;
            if (str != null || eVar.f17172m == null) {
                return str.equals(eVar.f17172m);
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public void mo37674O(C9248f.C9249a aVar) {
            aVar.mo37649f(this.f17172m);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P */
        public String mo37681P() {
            return this.f17172m;
        }

        /* renamed from: l */
        public boolean mo37565l(C9240b bVar) {
            return super.mo37565l(bVar) && (bVar instanceof C9264e) && mo37669J((C9264e) bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo37576v(StringBuilder sb) {
            C9259h.super.mo37576v(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" alias: '");
            String str = this.f17172m;
            sb2.append(str != null ? str.toString() : "null");
            sb2.append("'");
            sb.append(sb2.toString());
        }

        /* renamed from: z */
        public ServiceEvent mo37678z(JmDNSImpl jmDNSImpl) {
            ServiceInfo B = mo37661B(false);
            ((ServiceInfoImpl) B).mo37491F0(jmDNSImpl);
            String w = B.mo37334w();
            return new ServiceEventImpl(jmDNSImpl, w, JmDNSImpl.m22324u1(w, mo37681P()), B);
        }
    }

    /* renamed from: javax.jmdns.impl.h$f */
    public static class C9265f extends C9259h {

        /* renamed from: q */
        private static Logger f17173q = Logger.getLogger(C9265f.class.getName());

        /* renamed from: m */
        private final int f17174m;

        /* renamed from: n */
        private final int f17175n;

        /* renamed from: o */
        private final int f17176o;

        /* renamed from: p */
        private final String f17177p;

        public C9265f(String str, DNSRecordClass dNSRecordClass, boolean z, int i, int i2, int i3, int i4, String str2) {
            super(str, DNSRecordType.TYPE_SRV, dNSRecordClass, z, i);
            this.f17174m = i2;
            this.f17175n = i3;
            this.f17176o = i4;
            this.f17177p = str2;
        }

        /* renamed from: B */
        public ServiceInfo mo37661B(boolean z) {
            return new ServiceInfoImpl(mo37555d(), this.f17176o, this.f17175n, this.f17174m, z, this.f17177p);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public boolean mo37663D(JmDNSImpl jmDNSImpl, long j) {
            ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) jmDNSImpl.mo37455v0().get(mo37553b());
            if (serviceInfoImpl != null && ((serviceInfoImpl.mo37511j0() || serviceInfoImpl.mo37510i0()) && (this.f17176o != serviceInfoImpl.mo37325j() || !this.f17177p.equalsIgnoreCase(jmDNSImpl.mo37436k0().mo37390p())))) {
                Logger logger = f17173q;
                logger.finer("handleQuery() Conflicting probe detected from: " + mo37676x());
                C9265f fVar = new C9265f(serviceInfoImpl.mo37330r(), DNSRecordClass.CLASS_IN, true, 3600, serviceInfoImpl.mo37326k(), serviceInfoImpl.mo37335x(), serviceInfoImpl.mo37325j(), jmDNSImpl.mo37436k0().mo37390p());
                try {
                    if (jmDNSImpl.mo37428h0().equals(mo37676x())) {
                        Logger logger2 = f17173q;
                        logger2.warning("Got conflicting probe from ourselves\nincoming: " + toString() + IOUtils.LINE_SEPARATOR_UNIX + "local   : " + fVar.toString());
                    }
                } catch (IOException e) {
                    f17173q.log(Level.WARNING, "IOException", e);
                }
                int a = mo37552a(fVar);
                if (a == 0) {
                    f17173q.finer("handleQuery() Ignoring a identical service query");
                    return false;
                } else if (serviceInfoImpl.mo37513m0() && a > 0) {
                    String lowerCase = serviceInfoImpl.mo37330r().toLowerCase();
                    serviceInfoImpl.mo37492G0(jmDNSImpl.mo37402E0(serviceInfoImpl.mo37324i()));
                    jmDNSImpl.mo37455v0().remove(lowerCase);
                    jmDNSImpl.mo37455v0().put(serviceInfoImpl.mo37330r().toLowerCase(), serviceInfoImpl);
                    Logger logger3 = f17173q;
                    logger3.finer("handleQuery() Lost tie break: new unique name chosen:" + serviceInfoImpl.mo37324i());
                    serviceInfoImpl.mo37488C0();
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public boolean mo37664E(JmDNSImpl jmDNSImpl) {
            ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) jmDNSImpl.mo37455v0().get(mo37553b());
            if (serviceInfoImpl == null) {
                return false;
            }
            if (this.f17176o == serviceInfoImpl.mo37325j() && this.f17177p.equalsIgnoreCase(jmDNSImpl.mo37436k0().mo37390p())) {
                return false;
            }
            f17173q.finer("handleResponse() Denial detected");
            if (serviceInfoImpl.mo37513m0()) {
                String lowerCase = serviceInfoImpl.mo37330r().toLowerCase();
                serviceInfoImpl.mo37492G0(jmDNSImpl.mo37402E0(serviceInfoImpl.mo37324i()));
                jmDNSImpl.mo37455v0().remove(lowerCase);
                jmDNSImpl.mo37455v0().put(serviceInfoImpl.mo37330r().toLowerCase(), serviceInfoImpl);
                Logger logger = f17173q;
                logger.finer("handleResponse() New unique name chose:" + serviceInfoImpl.mo37324i());
            }
            serviceInfoImpl.mo37488C0();
            return true;
        }

        /* renamed from: F */
        public boolean mo37665F() {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo37669J(C9259h hVar) {
            if (!(hVar instanceof C9265f)) {
                return false;
            }
            C9265f fVar = (C9265f) hVar;
            return this.f17174m == fVar.f17174m && this.f17175n == fVar.f17175n && this.f17176o == fVar.f17176o && this.f17177p.equals(fVar.f17177p);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public void mo37674O(C9248f.C9249a aVar) {
            aVar.mo37653l(this.f17174m);
            aVar.mo37653l(this.f17175n);
            aVar.mo37653l(this.f17176o);
            if (C9241c.f17131m) {
                aVar.mo37649f(this.f17177p);
                return;
            }
            String str = this.f17177p;
            aVar.mo37654m(str, 0, str.length());
            aVar.mo37646a(0);
        }

        /* renamed from: P */
        public int mo37682P() {
            return this.f17176o;
        }

        /* renamed from: Q */
        public int mo37683Q() {
            return this.f17174m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: R */
        public String mo37684R() {
            return this.f17177p;
        }

        /* renamed from: S */
        public int mo37685S() {
            return this.f17175n;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo37573t(DataOutputStream dataOutputStream) {
            super.mo37573t(dataOutputStream);
            dataOutputStream.writeShort(this.f17174m);
            dataOutputStream.writeShort(this.f17175n);
            dataOutputStream.writeShort(this.f17176o);
            try {
                dataOutputStream.write(this.f17177p.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo37576v(StringBuilder sb) {
            C9259h.super.mo37576v(sb);
            sb.append(" server: '" + this.f17177p + Constants.COLON_SEPARATOR + this.f17176o + "'");
        }

        /* renamed from: z */
        public ServiceEvent mo37678z(JmDNSImpl jmDNSImpl) {
            ServiceInfo B = mo37661B(false);
            ((ServiceInfoImpl) B).mo37491F0(jmDNSImpl);
            return new ServiceEventImpl(jmDNSImpl, B.mo37334w(), B.mo37324i(), B);
        }
    }

    /* renamed from: javax.jmdns.impl.h$g */
    public static class C9266g extends C9259h {

        /* renamed from: m */
        private final byte[] f17178m;

        public C9266g(String str, DNSRecordClass dNSRecordClass, boolean z, int i, byte[] bArr) {
            super(str, DNSRecordType.TYPE_TXT, dNSRecordClass, z, i);
            this.f17178m = (bArr == null || bArr.length <= 0) ? C9259h.f17164l : bArr;
        }

        /* renamed from: B */
        public ServiceInfo mo37661B(boolean z) {
            return new ServiceInfoImpl(mo37555d(), 0, 0, 0, z, this.f17178m);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public boolean mo37663D(JmDNSImpl jmDNSImpl, long j) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public boolean mo37664E(JmDNSImpl jmDNSImpl) {
            return false;
        }

        /* renamed from: F */
        public boolean mo37665F() {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo37669J(C9259h hVar) {
            if (!(hVar instanceof C9266g)) {
                return false;
            }
            C9266g gVar = (C9266g) hVar;
            byte[] bArr = this.f17178m;
            if ((bArr == null && gVar.f17178m != null) || gVar.f17178m.length != bArr.length) {
                return false;
            }
            int length = bArr.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    return true;
                }
                if (gVar.f17178m[i] != this.f17178m[i]) {
                    return false;
                }
                length = i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public void mo37674O(C9248f.C9249a aVar) {
            byte[] bArr = this.f17178m;
            aVar.mo37647c(bArr, 0, bArr.length);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P */
        public byte[] mo37686P() {
            return this.f17178m;
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo37576v(StringBuilder sb) {
            String str;
            C9259h.super.mo37576v(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" text: '");
            byte[] bArr = this.f17178m;
            if (bArr.length > 20) {
                str = new String(this.f17178m, 0, 17) + "...";
            } else {
                str = new String(bArr);
            }
            sb2.append(str);
            sb2.append("'");
            sb.append(sb2.toString());
        }

        /* renamed from: z */
        public ServiceEvent mo37678z(JmDNSImpl jmDNSImpl) {
            ServiceInfo B = mo37661B(false);
            ((ServiceInfoImpl) B).mo37491F0(jmDNSImpl);
            return new ServiceEventImpl(jmDNSImpl, B.mo37334w(), B.mo37324i(), B);
        }
    }

    C9259h(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z, int i) {
        super(str, dNSRecordType, dNSRecordClass, z);
        this.f17165h = i;
    }

    /* renamed from: A */
    public ServiceInfo mo37660A() {
        return mo37661B(false);
    }

    /* renamed from: B */
    public abstract ServiceInfo mo37661B(boolean z);

    /* renamed from: C */
    public int mo37662C() {
        return this.f17165h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public abstract boolean mo37663D(JmDNSImpl jmDNSImpl, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public abstract boolean mo37664E(JmDNSImpl jmDNSImpl);

    /* renamed from: F */
    public abstract boolean mo37665F();

    /* renamed from: G */
    public boolean mo37666G(long j) {
        return mo37675w(50) <= j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo37667H(C9259h hVar) {
        this.f17166i = hVar.f17166i;
        this.f17165h = hVar.f17165h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo37668I(C9259h hVar) {
        return mo37558f() == hVar.mo37558f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public abstract boolean mo37669J(C9259h hVar);

    /* renamed from: K */
    public void mo37670K(InetAddress inetAddress) {
        this.f17167j = inetAddress;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo37671L(long j) {
        this.f17166i = j;
        this.f17165h = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public boolean mo37672M(C9241c cVar) {
        try {
            for (C9259h N : cVar.mo37620b()) {
                if (mo37673N(N)) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            Logger logger = f17163k;
            Level level = Level.WARNING;
            logger.log(level, "suppressedBy() message " + cVar + " exception ", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public boolean mo37673N(C9259h hVar) {
        return equals(hVar) && hVar.f17165h > this.f17165h / 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public abstract void mo37674O(C9248f.C9249a aVar);

    public boolean equals(Object obj) {
        return (obj instanceof C9259h) && super.equals(obj) && mo37669J((C9259h) obj);
    }

    /* renamed from: j */
    public boolean mo37563j(long j) {
        return mo37675w(100) <= j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo37576v(StringBuilder sb) {
        super.mo37576v(sb);
        sb.append(" ttl: '" + mo37677y(System.currentTimeMillis()) + MiotCloudImpl.COOKIE_PATH + this.f17165h + "'");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public long mo37675w(int i) {
        return this.f17166i + (((long) (i * this.f17165h)) * 10);
    }

    /* renamed from: x */
    public InetAddress mo37676x() {
        return this.f17167j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public int mo37677y(long j) {
        return (int) Math.max(0, (mo37675w(100) - j) / 1000);
    }

    /* renamed from: z */
    public abstract ServiceEvent mo37678z(JmDNSImpl jmDNSImpl);
}
