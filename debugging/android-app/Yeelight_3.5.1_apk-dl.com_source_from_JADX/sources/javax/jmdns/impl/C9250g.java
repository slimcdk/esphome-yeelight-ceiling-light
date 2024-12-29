package javax.jmdns.impl;

import java.net.InetAddress;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.C9259h;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import org.apache.commons.p194io.IOUtils;

/* renamed from: javax.jmdns.impl.g */
public class C9250g extends C9240b {

    /* renamed from: h */
    private static Logger f17161h = Logger.getLogger(C9250g.class.getName());

    /* renamed from: javax.jmdns.impl.g$a */
    static /* synthetic */ class C9251a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17162a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                javax.jmdns.impl.constants.DNSRecordType[] r0 = javax.jmdns.impl.constants.DNSRecordType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17162a = r0
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_A     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17162a     // Catch:{ NoSuchFieldError -> 0x001d }
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_A6     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17162a     // Catch:{ NoSuchFieldError -> 0x0028 }
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_AAAA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17162a     // Catch:{ NoSuchFieldError -> 0x0033 }
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_ANY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17162a     // Catch:{ NoSuchFieldError -> 0x003e }
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_HINFO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f17162a     // Catch:{ NoSuchFieldError -> 0x0049 }
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_PTR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f17162a     // Catch:{ NoSuchFieldError -> 0x0054 }
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_SRV     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f17162a     // Catch:{ NoSuchFieldError -> 0x0060 }
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_TXT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.C9250g.C9251a.<clinit>():void");
        }
    }

    /* renamed from: javax.jmdns.impl.g$b */
    private static class C9252b extends C9250g {
        C9252b(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z) {
            super(str, dNSRecordType, dNSRecordClass, z);
        }

        /* renamed from: n */
        public boolean mo37567n(C9240b bVar) {
            return bVar != null;
        }

        /* renamed from: w */
        public void mo37656w(JmDNSImpl jmDNSImpl, Set<C9259h> set) {
            String lowerCase = mo37554c().toLowerCase();
            if (jmDNSImpl.mo37436k0().mo37390p().equalsIgnoreCase(lowerCase)) {
                set.addAll(jmDNSImpl.mo37436k0().mo37379a(mo37569p(), 3600));
            } else if (jmDNSImpl.mo37454u0().containsKey(lowerCase)) {
                new C9256f(mo37554c(), DNSRecordType.TYPE_PTR, mo37556e(), mo37569p()).mo37656w(jmDNSImpl, set);
            } else {
                mo37657x(jmDNSImpl, set, (ServiceInfoImpl) jmDNSImpl.mo37455v0().get(lowerCase));
            }
        }

        /* renamed from: z */
        public boolean mo37659z(JmDNSImpl jmDNSImpl) {
            String lowerCase = mo37554c().toLowerCase();
            return jmDNSImpl.mo37436k0().mo37390p().equals(lowerCase) || jmDNSImpl.mo37455v0().keySet().contains(lowerCase);
        }
    }

    /* renamed from: javax.jmdns.impl.g$c */
    private static class C9253c extends C9250g {
        C9253c(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z) {
            super(str, dNSRecordType, dNSRecordClass, z);
        }

        /* renamed from: w */
        public void mo37656w(JmDNSImpl jmDNSImpl, Set<C9259h> set) {
            C9259h.C9260a j = jmDNSImpl.mo37436k0().mo37384j(mo37558f(), true, 3600);
            if (j != null) {
                set.add(j);
            }
        }

        /* renamed from: z */
        public boolean mo37659z(JmDNSImpl jmDNSImpl) {
            String lowerCase = mo37554c().toLowerCase();
            return jmDNSImpl.mo37436k0().mo37390p().equals(lowerCase) || jmDNSImpl.mo37455v0().keySet().contains(lowerCase);
        }
    }

    /* renamed from: javax.jmdns.impl.g$d */
    private static class C9254d extends C9250g {
        C9254d(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z) {
            super(str, dNSRecordType, dNSRecordClass, z);
        }

        /* renamed from: w */
        public void mo37656w(JmDNSImpl jmDNSImpl, Set<C9259h> set) {
            C9259h.C9260a j = jmDNSImpl.mo37436k0().mo37384j(mo37558f(), true, 3600);
            if (j != null) {
                set.add(j);
            }
        }

        /* renamed from: z */
        public boolean mo37659z(JmDNSImpl jmDNSImpl) {
            String lowerCase = mo37554c().toLowerCase();
            return jmDNSImpl.mo37436k0().mo37390p().equals(lowerCase) || jmDNSImpl.mo37455v0().keySet().contains(lowerCase);
        }
    }

    /* renamed from: javax.jmdns.impl.g$e */
    private static class C9255e extends C9250g {
        C9255e(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z) {
            super(str, dNSRecordType, dNSRecordClass, z);
        }
    }

    /* renamed from: javax.jmdns.impl.g$f */
    private static class C9256f extends C9250g {
        C9256f(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z) {
            super(str, dNSRecordType, dNSRecordClass, z);
        }

        /* renamed from: w */
        public void mo37656w(JmDNSImpl jmDNSImpl, Set<C9259h> set) {
            Iterator<ServiceInfo> it = jmDNSImpl.mo37455v0().values().iterator();
            while (it.hasNext()) {
                mo37657x(jmDNSImpl, set, (ServiceInfoImpl) it.next());
            }
            if (mo37568o()) {
                for (String str : jmDNSImpl.mo37454u0().keySet()) {
                    set.add(new C9259h.C9264e("_services._dns-sd._udp.local.", DNSRecordClass.CLASS_IN, false, 3600, jmDNSImpl.mo37454u0().get(str).mo37467d()));
                }
            } else if (mo37564k()) {
                String str2 = mo37555d().get(ServiceInfo.Fields.Instance);
                if (str2 != null && str2.length() > 0) {
                    InetAddress n = jmDNSImpl.mo37436k0().mo37388n();
                    if (str2.equalsIgnoreCase(n != null ? n.getHostAddress() : "")) {
                        if (mo37570q()) {
                            set.add(jmDNSImpl.mo37436k0().mo37385k(DNSRecordType.TYPE_A, false, 3600));
                        }
                        if (mo37571r()) {
                            set.add(jmDNSImpl.mo37436k0().mo37385k(DNSRecordType.TYPE_AAAA, false, 3600));
                        }
                    }
                }
            } else {
                mo37562i();
            }
        }
    }

    /* renamed from: javax.jmdns.impl.g$g */
    private static class C9257g extends C9250g {
        C9257g(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z) {
            super(str, dNSRecordType, dNSRecordClass, z);
        }

        /* renamed from: w */
        public void mo37656w(JmDNSImpl jmDNSImpl, Set<C9259h> set) {
            String lowerCase = mo37554c().toLowerCase();
            if (jmDNSImpl.mo37436k0().mo37390p().equalsIgnoreCase(lowerCase)) {
                set.addAll(jmDNSImpl.mo37436k0().mo37379a(mo37569p(), 3600));
            } else if (jmDNSImpl.mo37454u0().containsKey(lowerCase)) {
                new C9256f(mo37554c(), DNSRecordType.TYPE_PTR, mo37556e(), mo37569p()).mo37656w(jmDNSImpl, set);
            } else {
                mo37657x(jmDNSImpl, set, (ServiceInfoImpl) jmDNSImpl.mo37455v0().get(lowerCase));
            }
        }

        /* renamed from: z */
        public boolean mo37659z(JmDNSImpl jmDNSImpl) {
            String lowerCase = mo37554c().toLowerCase();
            return jmDNSImpl.mo37436k0().mo37390p().equals(lowerCase) || jmDNSImpl.mo37455v0().keySet().contains(lowerCase);
        }
    }

    /* renamed from: javax.jmdns.impl.g$h */
    private static class C9258h extends C9250g {
        C9258h(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z) {
            super(str, dNSRecordType, dNSRecordClass, z);
        }

        /* renamed from: w */
        public void mo37656w(JmDNSImpl jmDNSImpl, Set<C9259h> set) {
            mo37657x(jmDNSImpl, set, (ServiceInfoImpl) jmDNSImpl.mo37455v0().get(mo37554c().toLowerCase()));
        }

        /* renamed from: z */
        public boolean mo37659z(JmDNSImpl jmDNSImpl) {
            String lowerCase = mo37554c().toLowerCase();
            return jmDNSImpl.mo37436k0().mo37390p().equals(lowerCase) || jmDNSImpl.mo37455v0().keySet().contains(lowerCase);
        }
    }

    C9250g(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z) {
        super(str, dNSRecordType, dNSRecordClass, z);
    }

    /* renamed from: A */
    public static C9250g m22539A(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z) {
        switch (C9251a.f17162a[dNSRecordType.ordinal()]) {
            case 1:
                return new C9253c(str, dNSRecordType, dNSRecordClass, z);
            case 2:
                return new C9254d(str, dNSRecordType, dNSRecordClass, z);
            case 3:
                return new C9254d(str, dNSRecordType, dNSRecordClass, z);
            case 4:
                return new C9252b(str, dNSRecordType, dNSRecordClass, z);
            case 5:
                return new C9255e(str, dNSRecordType, dNSRecordClass, z);
            case 6:
                return new C9256f(str, dNSRecordType, dNSRecordClass, z);
            case 7:
                return new C9257g(str, dNSRecordType, dNSRecordClass, z);
            case 8:
                return new C9258h(str, dNSRecordType, dNSRecordClass, z);
            default:
                return new C9250g(str, dNSRecordType, dNSRecordClass, z);
        }
    }

    /* renamed from: j */
    public boolean mo37563j(long j) {
        return false;
    }

    /* renamed from: v */
    public void mo37576v(StringBuilder sb) {
    }

    /* renamed from: w */
    public void mo37656w(JmDNSImpl jmDNSImpl, Set<C9259h> set) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo37657x(JmDNSImpl jmDNSImpl, Set<C9259h> set, ServiceInfoImpl serviceInfoImpl) {
        if (serviceInfoImpl != null && serviceInfoImpl.mo37510i0()) {
            if (mo37554c().equalsIgnoreCase(serviceInfoImpl.mo37330r()) || mo37554c().equalsIgnoreCase(serviceInfoImpl.mo37334w())) {
                set.addAll(jmDNSImpl.mo37436k0().mo37379a(true, 3600));
                set.addAll(serviceInfoImpl.mo37496L(true, 3600, jmDNSImpl.mo37436k0()));
            }
            if (f17161h.isLoggable(Level.FINER)) {
                Logger logger = f17161h;
                logger.finer(jmDNSImpl.mo37444o0() + " DNSQuestion(" + mo37554c() + ").addAnswersForServiceInfo(): info: " + serviceInfoImpl + IOUtils.LINE_SEPARATOR_UNIX + set);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo37658y(C9240b bVar) {
        return mo37566m(bVar) && mo37567n(bVar) && mo37554c().equals(bVar.mo37554c());
    }

    /* renamed from: z */
    public boolean mo37659z(JmDNSImpl jmDNSImpl) {
        return false;
    }
}
