package javax.jmdns.impl;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.miot.bluetooth.channel.packet.Packet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Logger;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.C9259h;
import javax.jmdns.impl.DNSStatefulObject;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSState;
import org.apache.commons.p194io.IOUtils;
import p198p4.C10268a;

public class ServiceInfoImpl extends ServiceInfo implements C9246d, DNSStatefulObject {

    /* renamed from: s */
    private static Logger f17101s = Logger.getLogger(ServiceInfoImpl.class.getName());

    /* renamed from: b */
    private String f17102b;

    /* renamed from: c */
    private String f17103c;

    /* renamed from: d */
    private String f17104d;

    /* renamed from: e */
    private String f17105e;

    /* renamed from: f */
    private String f17106f;

    /* renamed from: g */
    private String f17107g;

    /* renamed from: h */
    private int f17108h;

    /* renamed from: i */
    private int f17109i;

    /* renamed from: j */
    private int f17110j;

    /* renamed from: k */
    private byte[] f17111k;

    /* renamed from: l */
    private Map<String, byte[]> f17112l;

    /* renamed from: m */
    private final Set<Inet4Address> f17113m;

    /* renamed from: n */
    private final Set<Inet6Address> f17114n;

    /* renamed from: o */
    private transient String f17115o;

    /* renamed from: p */
    private boolean f17116p;

    /* renamed from: q */
    private boolean f17117q;

    /* renamed from: r */
    private final ServiceInfoState f17118r;

    private static final class ServiceInfoState extends DNSStatefulObject.DefaultImplementation {
        private static final long serialVersionUID = 1104131034952196820L;
        private final ServiceInfoImpl _info;

        public ServiceInfoState(ServiceInfoImpl serviceInfoImpl) {
            this._info = serviceInfoImpl;
        }

        public void setDns(JmDNSImpl jmDNSImpl) {
            super.setDns(jmDNSImpl);
        }

        /* access modifiers changed from: protected */
        public void setTask(C10268a aVar) {
            super.setTask(aVar);
            if (this._task == null && this._info.mo37514n0()) {
                lock();
                try {
                    if (this._task == null && this._info.mo37514n0()) {
                        if (this._state.isAnnounced()) {
                            setState(DNSState.ANNOUNCING_1);
                            if (getDns() != null) {
                                getDns().mo37440m();
                            }
                        }
                        this._info.mo37493I0(false);
                    }
                } finally {
                    unlock();
                }
            }
        }
    }

    /* renamed from: javax.jmdns.impl.ServiceInfoImpl$a */
    static /* synthetic */ class C9236a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17119a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                javax.jmdns.impl.constants.DNSRecordType[] r0 = javax.jmdns.impl.constants.DNSRecordType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17119a = r0
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_A     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17119a     // Catch:{ NoSuchFieldError -> 0x001d }
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_AAAA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17119a     // Catch:{ NoSuchFieldError -> 0x0028 }
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_SRV     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17119a     // Catch:{ NoSuchFieldError -> 0x0033 }
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_TXT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17119a     // Catch:{ NoSuchFieldError -> 0x003e }
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_PTR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.ServiceInfoImpl.C9236a.<clinit>():void");
        }
    }

    public ServiceInfoImpl(String str, String str2, String str3, int i, int i2, int i3, boolean z, Map<String, ?> map) {
        this(m22400S(str, str2, str3), i, i2, i3, z, m22397O0(map));
    }

    public ServiceInfoImpl(String str, String str2, String str3, int i, int i2, int i3, boolean z, byte[] bArr) {
        this(m22400S(str, str2, str3), i, i2, i3, z, bArr);
    }

    ServiceInfoImpl(Map<ServiceInfo.Fields, String> map, int i, int i2, int i3, boolean z, String str) {
        this(map, i, i2, i3, z, (byte[]) null);
        this.f17107g = str;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            m22399R0(byteArrayOutputStream, str);
            this.f17111k = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("unexpected exception: " + e);
        }
    }

    public ServiceInfoImpl(Map<ServiceInfo.Fields, String> map, int i, int i2, int i3, boolean z, Map<String, ?> map2) {
        this(map, i, i2, i3, z, m22397O0(map2));
    }

    ServiceInfoImpl(Map<ServiceInfo.Fields, String> map, int i, int i2, int i3, boolean z, byte[] bArr) {
        Map<ServiceInfo.Fields, String> Q = m22398Q(map);
        this.f17102b = Q.get(ServiceInfo.Fields.Domain);
        this.f17103c = Q.get(ServiceInfo.Fields.Protocol);
        this.f17104d = Q.get(ServiceInfo.Fields.Application);
        this.f17105e = Q.get(ServiceInfo.Fields.Instance);
        this.f17106f = Q.get(ServiceInfo.Fields.Subtype);
        this.f17108h = i;
        this.f17109i = i2;
        this.f17110j = i3;
        this.f17111k = bArr;
        mo37493I0(false);
        this.f17118r = new ServiceInfoState(this);
        this.f17116p = z;
        this.f17113m = Collections.synchronizedSet(new LinkedHashSet());
        this.f17114n = Collections.synchronizedSet(new LinkedHashSet());
    }

    ServiceInfoImpl(ServiceInfo serviceInfo) {
        this.f17113m = Collections.synchronizedSet(new LinkedHashSet());
        this.f17114n = Collections.synchronizedSet(new LinkedHashSet());
        if (serviceInfo != null) {
            this.f17102b = serviceInfo.mo37320e();
            this.f17103c = serviceInfo.mo37329q();
            this.f17104d = serviceInfo.mo37319d();
            this.f17105e = serviceInfo.mo37324i();
            this.f17106f = serviceInfo.mo37332t();
            this.f17108h = serviceInfo.mo37325j();
            this.f17109i = serviceInfo.mo37335x();
            this.f17110j = serviceInfo.mo37326k();
            this.f17111k = serviceInfo.mo37333u();
            this.f17116p = serviceInfo.mo37316C();
            for (Inet6Address add : serviceInfo.mo37322g()) {
                this.f17114n.add(add);
            }
            for (Inet4Address add2 : serviceInfo.mo37321f()) {
                this.f17113m.add(add2);
            }
        }
        this.f17118r = new ServiceInfoState(this);
    }

    /* renamed from: B0 */
    private static String m22396B0(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.startsWith(".")) {
            trim = trim.substring(1);
        }
        if (trim.startsWith("_")) {
            trim = trim.substring(1);
        }
        return trim.endsWith(".") ? trim.substring(0, trim.length() - 1) : trim;
    }

    /* renamed from: O0 */
    private static byte[] m22397O0(Map<String, ?> map) {
        String str;
        byte[] bArr = null;
        if (map != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
                for (String next : map.keySet()) {
                    Object obj = map.get(next);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(100);
                    m22399R0(byteArrayOutputStream2, next);
                    if (obj != null) {
                        if (obj instanceof String) {
                            byteArrayOutputStream2.write(61);
                            m22399R0(byteArrayOutputStream2, (String) obj);
                        } else if (obj instanceof byte[]) {
                            byte[] bArr2 = (byte[]) obj;
                            if (bArr2.length > 0) {
                                byteArrayOutputStream2.write(61);
                                byteArrayOutputStream2.write(bArr2, 0, bArr2.length);
                            } else {
                                obj = null;
                            }
                        } else {
                            throw new IllegalArgumentException("invalid property value: " + obj);
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    if (byteArray.length > 255) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot have individual values larger that 255 chars. Offending value: ");
                        sb.append(next);
                        if (obj != null) {
                            str = "";
                        } else {
                            str = "=" + obj;
                        }
                        sb.append(str);
                        throw new IOException(sb.toString());
                    }
                    byteArrayOutputStream.write((byte) byteArray.length);
                    byteArrayOutputStream.write(byteArray, 0, byteArray.length);
                }
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new RuntimeException("unexpected exception: " + e);
            }
        }
        return (bArr == null || bArr.length <= 0) ? C9259h.f17164l : bArr;
    }

    /* renamed from: Q */
    protected static Map<ServiceInfo.Fields, String> m22398Q(Map<ServiceInfo.Fields, String> map) {
        HashMap hashMap = new HashMap(5);
        ServiceInfo.Fields fields = ServiceInfo.Fields.Domain;
        String str = "local";
        String str2 = map.containsKey(fields) ? map.get(fields) : str;
        if (!(str2 == null || str2.length() == 0)) {
            str = str2;
        }
        hashMap.put(fields, m22396B0(str));
        ServiceInfo.Fields fields2 = ServiceInfo.Fields.Protocol;
        String str3 = "tcp";
        String str4 = map.containsKey(fields2) ? map.get(fields2) : str3;
        if (!(str4 == null || str4.length() == 0)) {
            str3 = str4;
        }
        hashMap.put(fields2, m22396B0(str3));
        ServiceInfo.Fields fields3 = ServiceInfo.Fields.Application;
        String str5 = "";
        String str6 = map.containsKey(fields3) ? map.get(fields3) : str5;
        if (str6 == null || str6.length() == 0) {
            str6 = str5;
        }
        hashMap.put(fields3, m22396B0(str6));
        ServiceInfo.Fields fields4 = ServiceInfo.Fields.Instance;
        String str7 = map.containsKey(fields4) ? map.get(fields4) : str5;
        if (str7 == null || str7.length() == 0) {
            str7 = str5;
        }
        hashMap.put(fields4, m22396B0(str7));
        ServiceInfo.Fields fields5 = ServiceInfo.Fields.Subtype;
        String str8 = map.containsKey(fields5) ? map.get(fields5) : str5;
        if (!(str8 == null || str8.length() == 0)) {
            str5 = str8;
        }
        hashMap.put(fields5, m22396B0(str5));
        return hashMap;
    }

    /* renamed from: R0 */
    static void m22399R0(OutputStream outputStream, String str) {
        int i;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 1 || charAt > 127) {
                if (charAt > 2047) {
                    outputStream.write(((charAt >> 12) & 15) | 224);
                    i = ((charAt >> 6) & 63) | 128;
                } else {
                    i = ((charAt >> 6) & 31) | 192;
                }
                outputStream.write(i);
                charAt = ((charAt >> 0) & '?') | 128;
            }
            outputStream.write(charAt);
        }
    }

    /* renamed from: S */
    public static Map<ServiceInfo.Fields, String> m22400S(String str, String str2, String str3) {
        Map<ServiceInfo.Fields, String> U = m22401U(str);
        U.put(ServiceInfo.Fields.Instance, str2);
        U.put(ServiceInfo.Fields.Subtype, str3);
        return m22398Q(U);
    }

    /* renamed from: U */
    public static Map<ServiceInfo.Fields, String> m22401U(String str) {
        String str2;
        String str3;
        String str4;
        String substring;
        String str5;
        String str6;
        String str7;
        int indexOf;
        String lowerCase = str.toLowerCase();
        String str8 = "";
        if (lowerCase.contains("in-addr.arpa") || lowerCase.contains("ip6.arpa")) {
            int indexOf2 = lowerCase.contains("in-addr.arpa") ? lowerCase.indexOf("in-addr.arpa") : lowerCase.indexOf("ip6.arpa");
            str4 = m22396B0(str.substring(0, indexOf2));
            substring = str.substring(indexOf2);
        } else if (lowerCase.contains("_") || !lowerCase.contains(".")) {
            if ((!lowerCase.startsWith("_") || lowerCase.startsWith("_services")) && (indexOf = lowerCase.indexOf(46)) > 0) {
                str6 = str.substring(0, indexOf);
                int i = indexOf + 1;
                if (i < lowerCase.length()) {
                    str5 = lowerCase.substring(i);
                    str = str.substring(i);
                } else {
                    str5 = lowerCase;
                }
            } else {
                str5 = lowerCase;
                str6 = str8;
            }
            int lastIndexOf = str5.lastIndexOf("._");
            if (lastIndexOf > 0) {
                int i2 = lastIndexOf + 2;
                str7 = str.substring(i2, str5.indexOf(46, i2));
            } else {
                str7 = str8;
            }
            if (str7.length() > 0) {
                int indexOf3 = str5.indexOf("_" + str7.toLowerCase() + ".");
                String substring2 = str.substring(str7.length() + indexOf3 + 2, str5.length() - (str5.endsWith(".") ? 1 : 0));
                lowerCase = str.substring(0, indexOf3 + -1);
                str2 = substring2;
            } else {
                str2 = str8;
            }
            int indexOf4 = lowerCase.toLowerCase().indexOf("._sub");
            if (indexOf4 > 0) {
                str8 = m22396B0(lowerCase.substring(0, indexOf4));
                lowerCase = lowerCase.substring(indexOf4 + 5);
            }
            str4 = str6;
            String str9 = str8;
            str8 = str7;
            str3 = str9;
            HashMap hashMap = new HashMap(5);
            hashMap.put(ServiceInfo.Fields.Domain, m22396B0(str2));
            hashMap.put(ServiceInfo.Fields.Protocol, str8);
            hashMap.put(ServiceInfo.Fields.Application, m22396B0(lowerCase));
            hashMap.put(ServiceInfo.Fields.Instance, str4);
            hashMap.put(ServiceInfo.Fields.Subtype, str3);
            return hashMap;
        } else {
            int indexOf5 = lowerCase.indexOf(46);
            str4 = m22396B0(str.substring(0, indexOf5));
            substring = m22396B0(str.substring(indexOf5));
        }
        lowerCase = str8;
        str3 = lowerCase;
        HashMap hashMap2 = new HashMap(5);
        hashMap2.put(ServiceInfo.Fields.Domain, m22396B0(str2));
        hashMap2.put(ServiceInfo.Fields.Protocol, str8);
        hashMap2.put(ServiceInfo.Fields.Application, m22396B0(lowerCase));
        hashMap2.put(ServiceInfo.Fields.Instance, str4);
        hashMap2.put(ServiceInfo.Fields.Subtype, str3);
        return hashMap2;
    }

    /* renamed from: e0 */
    private final boolean m22402e0() {
        return this.f17113m.size() > 0 || this.f17114n.size() > 0;
    }

    /* renamed from: C */
    public boolean mo37316C() {
        return this.f17116p;
    }

    /* renamed from: C0 */
    public boolean mo37488C0() {
        return this.f17118r.revertState();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo37489D(byte[] bArr) {
        this.f17111k = bArr;
        this.f17112l = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo37490E(Inet4Address inet4Address) {
        this.f17113m.add(inet4Address);
    }

    /* renamed from: F0 */
    public void mo37491F0(JmDNSImpl jmDNSImpl) {
        this.f17118r.setDns(jmDNSImpl);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G0 */
    public void mo37492G0(String str) {
        this.f17105e = str;
        this.f17115o = null;
    }

    /* renamed from: I0 */
    public void mo37493I0(boolean z) {
        this.f17117q = z;
        if (z) {
            this.f17118r.setTask((C10268a) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo37494K(Inet6Address inet6Address) {
        this.f17114n.add(inet6Address);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void mo37495K0(String str) {
        this.f17107g = str;
    }

    /* renamed from: L */
    public Collection<C9259h> mo37496L(boolean z, int i, HostInfo hostInfo) {
        ArrayList arrayList = new ArrayList();
        if (mo37332t().length() > 0) {
            arrayList.add(new C9259h.C9264e(mo37507b0(), DNSRecordClass.CLASS_IN, false, i, mo37330r()));
        }
        String w = mo37334w();
        DNSRecordClass dNSRecordClass = DNSRecordClass.CLASS_IN;
        arrayList.add(new C9259h.C9264e(w, dNSRecordClass, false, i, mo37330r()));
        String r = mo37330r();
        int i2 = this.f17110j;
        int i3 = this.f17109i;
        arrayList.add(new C9259h.C9265f(r, dNSRecordClass, z, i, i2, i3, this.f17108h, hostInfo.mo37390p()));
        arrayList.add(new C9259h.C9266g(mo37330r(), dNSRecordClass, z, i, mo37333u()));
        return arrayList;
    }

    /* renamed from: M */
    public void mo37497M(C10268a aVar, DNSState dNSState) {
        this.f17118r.associateWithTask(aVar, dNSState);
    }

    /* renamed from: O */
    public boolean mo37498O() {
        return this.f17118r.cancelState();
    }

    /* renamed from: P0 */
    public boolean mo37499P0(long j) {
        return this.f17118r.waitForAnnounced(j);
    }

    /* renamed from: Q0 */
    public boolean mo37500Q0(long j) {
        return this.f17118r.waitForCanceled(j);
    }

    /* renamed from: R */
    public ServiceInfoImpl clone() {
        ServiceInfoImpl serviceInfoImpl = new ServiceInfoImpl(mo37506a0(), this.f17108h, this.f17109i, this.f17110j, this.f17116p, this.f17111k);
        for (Inet6Address add : mo37322g()) {
            serviceInfoImpl.f17114n.add(add);
        }
        for (Inet4Address add2 : mo37321f()) {
            serviceInfoImpl.f17113m.add(add2);
        }
        return serviceInfoImpl;
    }

    /* renamed from: X */
    public JmDNSImpl mo37502X() {
        return this.f17118r.getDns();
    }

    /* renamed from: Y */
    public InetAddress[] mo37503Y() {
        ArrayList arrayList = new ArrayList(this.f17113m.size() + this.f17114n.size());
        arrayList.addAll(this.f17113m);
        arrayList.addAll(this.f17114n);
        return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r0.clear();
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.Map<java.lang.String, byte[]> mo37504Z() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.Map<java.lang.String, byte[]> r0 = r9.f17112l     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x0076
            byte[] r0 = r9.mo37333u()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0076
            java.util.Hashtable r0 = new java.util.Hashtable     // Catch:{ all -> 0x0081 }
            r0.<init>()     // Catch:{ all -> 0x0081 }
            r1 = 0
            r2 = 0
        L_0x0012:
            byte[] r3 = r9.mo37333u()     // Catch:{ Exception -> 0x006a }
            int r3 = r3.length     // Catch:{ Exception -> 0x006a }
            if (r2 >= r3) goto L_0x0074
            byte[] r3 = r9.mo37333u()     // Catch:{ Exception -> 0x006a }
            int r4 = r2 + 1
            byte r2 = r3[r2]     // Catch:{ Exception -> 0x006a }
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L_0x004b
            int r3 = r4 + r2
            byte[] r5 = r9.mo37333u()     // Catch:{ Exception -> 0x006a }
            int r5 = r5.length     // Catch:{ Exception -> 0x006a }
            if (r3 <= r5) goto L_0x002f
            goto L_0x004b
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 >= r2) goto L_0x0041
            byte[] r6 = r9.mo37333u()     // Catch:{ Exception -> 0x006a }
            int r7 = r4 + r5
            byte r6 = r6[r7]     // Catch:{ Exception -> 0x006a }
            r7 = 61
            if (r6 == r7) goto L_0x0041
            int r5 = r5 + 1
            goto L_0x0030
        L_0x0041:
            byte[] r6 = r9.mo37333u()     // Catch:{ Exception -> 0x006a }
            java.lang.String r6 = r9.mo37515q0(r6, r4, r5)     // Catch:{ Exception -> 0x006a }
            if (r6 != 0) goto L_0x004f
        L_0x004b:
            r0.clear()     // Catch:{ Exception -> 0x006a }
            goto L_0x0074
        L_0x004f:
            if (r5 != r2) goto L_0x0058
            byte[] r2 = javax.jmdns.ServiceInfo.f17049a     // Catch:{ Exception -> 0x006a }
            r0.put(r6, r2)     // Catch:{ Exception -> 0x006a }
            r2 = r4
            goto L_0x0012
        L_0x0058:
            int r5 = r5 + 1
            int r2 = r2 - r5
            byte[] r7 = new byte[r2]     // Catch:{ Exception -> 0x006a }
            byte[] r8 = r9.mo37333u()     // Catch:{ Exception -> 0x006a }
            int r4 = r4 + r5
            java.lang.System.arraycopy(r8, r4, r7, r1, r2)     // Catch:{ Exception -> 0x006a }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x006a }
            r2 = r3
            goto L_0x0012
        L_0x006a:
            r1 = move-exception
            java.util.logging.Logger r2 = f17101s     // Catch:{ all -> 0x0081 }
            java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "Malformed TXT Field "
            r2.log(r3, r4, r1)     // Catch:{ all -> 0x0081 }
        L_0x0074:
            r9.f17112l = r0     // Catch:{ all -> 0x0081 }
        L_0x0076:
            java.util.Map<java.lang.String, byte[]> r0 = r9.f17112l     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x007b
            goto L_0x007f
        L_0x007b:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0081 }
        L_0x007f:
            monitor-exit(r9)
            return r0
        L_0x0081:
            r0 = move-exception
            monitor-exit(r9)
            goto L_0x0085
        L_0x0084:
            throw r0
        L_0x0085:
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.ServiceInfoImpl.mo37504Z():java.util.Map");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public void mo37505a(javax.jmdns.impl.C9237a r6, long r7, javax.jmdns.impl.C9240b r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof javax.jmdns.impl.C9259h
            if (r0 == 0) goto L_0x0144
            boolean r0 = r9.mo37563j(r7)
            if (r0 != 0) goto L_0x0144
            int[] r0 = javax.jmdns.impl.ServiceInfoImpl.C9236a.f17119a
            javax.jmdns.impl.constants.DNSRecordType r1 = r9.mo37558f()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x00fa
            r3 = 2
            if (r0 == r3) goto L_0x00e0
            r3 = 3
            if (r0 == r3) goto L_0x005d
            r6 = 4
            if (r0 == r6) goto L_0x0044
            r6 = 5
            if (r0 == r6) goto L_0x0028
            goto L_0x0117
        L_0x0028:
            java.lang.String r6 = r5.mo37332t()
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0117
            java.lang.String r6 = r9.mo37559g()
            int r6 = r6.length()
            if (r6 == 0) goto L_0x0117
            java.lang.String r6 = r9.mo37559g()
            r5.f17106f = r6
            goto L_0x0116
        L_0x0044:
            java.lang.String r6 = r9.mo37554c()
            java.lang.String r7 = r5.mo37330r()
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x0117
            r6 = r9
            javax.jmdns.impl.h$g r6 = (javax.jmdns.impl.C9259h.C9266g) r6
            byte[] r6 = r6.mo37686P()
            r5.f17111k = r6
            goto L_0x0116
        L_0x005d:
            java.lang.String r0 = r9.mo37554c()
            java.lang.String r3 = r5.mo37330r()
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0117
            r0 = r9
            javax.jmdns.impl.h$f r0 = (javax.jmdns.impl.C9259h.C9265f) r0
            java.lang.String r3 = r5.f17107g
            if (r3 == 0) goto L_0x007f
            java.lang.String r4 = r0.mo37684R()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 != 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r3 = 0
            goto L_0x0080
        L_0x007f:
            r3 = 1
        L_0x0080:
            java.lang.String r4 = r0.mo37684R()
            r5.f17107g = r4
            int r4 = r0.mo37682P()
            r5.f17108h = r4
            int r4 = r0.mo37685S()
            r5.f17109i = r4
            int r0 = r0.mo37683Q()
            r5.f17110j = r0
            if (r3 == 0) goto L_0x0116
            java.util.Set<java.net.Inet4Address> r0 = r5.f17113m
            r0.clear()
            java.util.Set<java.net.Inet6Address> r0 = r5.f17114n
            r0.clear()
            java.lang.String r0 = r5.f17107g
            javax.jmdns.impl.constants.DNSRecordType r2 = javax.jmdns.impl.constants.DNSRecordType.TYPE_A
            javax.jmdns.impl.constants.DNSRecordClass r3 = javax.jmdns.impl.constants.DNSRecordClass.CLASS_IN
            java.util.Collection r0 = r6.mo37526g(r0, r2, r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x00b2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00c2
            java.lang.Object r2 = r0.next()
            javax.jmdns.impl.b r2 = (javax.jmdns.impl.C9240b) r2
            r5.mo37505a(r6, r7, r2)
            goto L_0x00b2
        L_0x00c2:
            java.lang.String r0 = r5.f17107g
            javax.jmdns.impl.constants.DNSRecordType r2 = javax.jmdns.impl.constants.DNSRecordType.TYPE_AAAA
            javax.jmdns.impl.constants.DNSRecordClass r3 = javax.jmdns.impl.constants.DNSRecordClass.CLASS_IN
            java.util.Collection r0 = r6.mo37526g(r0, r2, r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x00d0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0117
            java.lang.Object r2 = r0.next()
            javax.jmdns.impl.b r2 = (javax.jmdns.impl.C9240b) r2
            r5.mo37505a(r6, r7, r2)
            goto L_0x00d0
        L_0x00e0:
            java.lang.String r6 = r9.mo37554c()
            java.lang.String r7 = r5.mo37331s()
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x0117
            java.util.Set<java.net.Inet6Address> r6 = r5.f17114n
            r7 = r9
            javax.jmdns.impl.h$a r7 = (javax.jmdns.impl.C9259h.C9260a) r7
            java.net.InetAddress r7 = r7.mo37679P()
            java.net.Inet6Address r7 = (java.net.Inet6Address) r7
            goto L_0x0113
        L_0x00fa:
            java.lang.String r6 = r9.mo37554c()
            java.lang.String r7 = r5.mo37331s()
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x0117
            java.util.Set<java.net.Inet4Address> r6 = r5.f17113m
            r7 = r9
            javax.jmdns.impl.h$a r7 = (javax.jmdns.impl.C9259h.C9260a) r7
            java.net.InetAddress r7 = r7.mo37679P()
            java.net.Inet4Address r7 = (java.net.Inet4Address) r7
        L_0x0113:
            r6.add(r7)
        L_0x0116:
            r1 = 1
        L_0x0117:
            if (r1 == 0) goto L_0x013b
            boolean r6 = r5.mo37336y()
            if (r6 == 0) goto L_0x013b
            javax.jmdns.impl.JmDNSImpl r6 = r5.mo37502X()
            if (r6 == 0) goto L_0x013b
            javax.jmdns.impl.h r9 = (javax.jmdns.impl.C9259h) r9
            javax.jmdns.ServiceEvent r7 = r9.mo37678z(r6)
            javax.jmdns.impl.ServiceEventImpl r8 = new javax.jmdns.impl.ServiceEventImpl
            java.lang.String r9 = r7.getType()
            java.lang.String r7 = r7.getName()
            r8.<init>(r6, r9, r7, r5)
            r6.mo37401D0(r8)
        L_0x013b:
            monitor-enter(r5)
            r5.notifyAll()     // Catch:{ all -> 0x0141 }
            monitor-exit(r5)     // Catch:{ all -> 0x0141 }
            goto L_0x0144
        L_0x0141:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0141 }
            throw r6
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.ServiceInfoImpl.mo37505a(javax.jmdns.impl.a, long, javax.jmdns.impl.b):void");
    }

    /* renamed from: a0 */
    public Map<ServiceInfo.Fields, String> mo37506a0() {
        HashMap hashMap = new HashMap(5);
        hashMap.put(ServiceInfo.Fields.Domain, mo37320e());
        hashMap.put(ServiceInfo.Fields.Protocol, mo37329q());
        hashMap.put(ServiceInfo.Fields.Application, mo37319d());
        hashMap.put(ServiceInfo.Fields.Instance, mo37324i());
        hashMap.put(ServiceInfo.Fields.Subtype, mo37332t());
        return hashMap;
    }

    public boolean advanceState(C10268a aVar) {
        return this.f17118r.advanceState(aVar);
    }

    /* renamed from: b0 */
    public String mo37507b0() {
        String str;
        String t = mo37332t();
        StringBuilder sb = new StringBuilder();
        if (t.length() > 0) {
            str = "_" + t.toLowerCase() + "._sub.";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(mo37334w());
        return sb.toString();
    }

    /* renamed from: d */
    public String mo37319d() {
        String str = this.f17104d;
        return str != null ? str : "";
    }

    /* renamed from: e */
    public String mo37320e() {
        String str = this.f17102b;
        return str != null ? str : "local";
    }

    public boolean equals(Object obj) {
        return (obj instanceof ServiceInfoImpl) && mo37330r().equals(((ServiceInfoImpl) obj).mo37330r());
    }

    /* renamed from: f */
    public Inet4Address[] mo37321f() {
        Set<Inet4Address> set = this.f17113m;
        return (Inet4Address[]) set.toArray(new Inet4Address[set.size()]);
    }

    /* renamed from: g */
    public Inet6Address[] mo37322g() {
        Set<Inet6Address> set = this.f17114n;
        return (Inet6Address[]) set.toArray(new Inet6Address[set.size()]);
    }

    /* renamed from: h */
    public String mo37323h() {
        if (this.f17115o == null) {
            this.f17115o = mo37330r().toLowerCase();
        }
        return this.f17115o;
    }

    public int hashCode() {
        return mo37330r().hashCode();
    }

    /* renamed from: i */
    public String mo37324i() {
        String str = this.f17105e;
        return str != null ? str : "";
    }

    /* renamed from: i0 */
    public boolean mo37510i0() {
        return this.f17118r.isAnnounced();
    }

    /* renamed from: j */
    public int mo37325j() {
        return this.f17108h;
    }

    /* renamed from: j0 */
    public boolean mo37511j0() {
        return this.f17118r.isAnnouncing();
    }

    /* renamed from: k */
    public int mo37326k() {
        return this.f17110j;
    }

    /* renamed from: l0 */
    public boolean mo37512l0(C10268a aVar, DNSState dNSState) {
        return this.f17118r.isAssociatedWithTask(aVar, dNSState);
    }

    /* renamed from: m0 */
    public boolean mo37513m0() {
        return this.f17118r.isProbing();
    }

    /* renamed from: n0 */
    public boolean mo37514n0() {
        return this.f17117q;
    }

    /* renamed from: o */
    public Enumeration<String> mo37327o() {
        Map<String, byte[]> Z = mo37504Z();
        return new Vector(Z != null ? Z.keySet() : Collections.emptySet()).elements();
    }

    /* renamed from: p */
    public synchronized String mo37328p(String str) {
        byte[] bArr = mo37504Z().get(str);
        if (bArr == null) {
            return null;
        }
        if (bArr == ServiceInfo.f17049a) {
            return "true";
        }
        return mo37515q0(bArr, 0, bArr.length);
    }

    /* renamed from: q */
    public String mo37329q() {
        String str = this.f17103c;
        return str != null ? str : "tcp";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public String mo37515q0(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte b;
        StringBuffer stringBuffer = new StringBuffer();
        int i5 = i + i2;
        while (i < i5) {
            int i6 = i + 1;
            byte b2 = bArr[i] & 255;
            switch (b2 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                case 12:
                case 13:
                    if (i6 < i2) {
                        i3 = (b2 & 31) << 6;
                        i4 = i6 + 1;
                        b = bArr[i6] & 63;
                        break;
                    } else {
                        return null;
                    }
                case 14:
                    if (i6 + 2 >= i2) {
                        return null;
                    }
                    int i7 = i6 + 1;
                    byte b3 = ((b2 & ParameterInitDefType.CubemapSamplerInit) << 12) | ((bArr[i6] & 63) << 6);
                    i6 = i7 + 1;
                    b2 = b3 | (bArr[i7] & 63);
                    continue;
                default:
                    i4 = i6 + 1;
                    if (i4 < i2) {
                        i3 = (b2 & 63) << 4;
                        b = bArr[i6] & ParameterInitDefType.CubemapSamplerInit;
                        break;
                    } else {
                        return null;
                    }
            }
            b2 = i3 | b;
            i6 = i4;
            stringBuffer.append((char) b2);
            i = i6;
        }
        return stringBuffer.toString();
    }

    /* renamed from: r */
    public String mo37330r() {
        String str;
        String str2;
        String e = mo37320e();
        String q = mo37329q();
        String d = mo37319d();
        String i = mo37324i();
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        if (i.length() > 0) {
            str = i + ".";
        } else {
            str = str3;
        }
        sb.append(str);
        if (d.length() > 0) {
            str2 = "_" + d + ".";
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (q.length() > 0) {
            str3 = "_" + q + ".";
        }
        sb.append(str3);
        sb.append(e);
        sb.append(".");
        return sb.toString();
    }

    /* renamed from: s */
    public String mo37331s() {
        String str = this.f17107g;
        return str != null ? str : "";
    }

    /* renamed from: s0 */
    public boolean mo37516s0() {
        return this.f17118r.recoverState();
    }

    /* renamed from: t */
    public String mo37332t() {
        String str = this.f17106f;
        return str != null ? str : "";
    }

    /* renamed from: t0 */
    public void mo37517t0(C10268a aVar) {
        this.f17118r.removeAssociationWithTask(aVar);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[" + ServiceInfoImpl.class.getSimpleName() + "@" + System.identityHashCode(this) + " ");
        sb.append("name: '");
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (mo37324i().length() > 0) {
            str = mo37324i() + ".";
        } else {
            str = str2;
        }
        sb2.append(str);
        sb2.append(mo37507b0());
        sb.append(sb2.toString());
        sb.append("' address: '");
        InetAddress[] Y = mo37503Y();
        if (Y.length > 0) {
            for (InetAddress append : Y) {
                sb.append(append);
                sb.append(':');
                sb.append(mo37325j());
                sb.append(' ');
            }
        } else {
            sb.append("(null):");
            sb.append(mo37325j());
        }
        sb.append("' status: '");
        sb.append(this.f17118r.toString());
        sb.append(mo37316C() ? "' is persistent," : "',");
        sb.append(" has ");
        if (!mo37336y()) {
            str2 = "NO ";
        }
        sb.append(str2);
        sb.append(Packet.DATA);
        if (mo37333u().length > 0) {
            Map<String, byte[]> Z = mo37504Z();
            if (!Z.isEmpty()) {
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                for (String next : Z.keySet()) {
                    sb.append("\t" + next + ": " + new String(Z.get(next)) + IOUtils.LINE_SEPARATOR_UNIX);
                }
            } else {
                sb.append(" empty");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: u */
    public byte[] mo37333u() {
        byte[] bArr = this.f17111k;
        return (bArr == null || bArr.length <= 0) ? C9259h.f17164l : bArr;
    }

    /* renamed from: w */
    public String mo37334w() {
        String str;
        String e = mo37320e();
        String q = mo37329q();
        String d = mo37319d();
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (d.length() > 0) {
            str = "_" + d + ".";
        } else {
            str = str2;
        }
        sb.append(str);
        if (q.length() > 0) {
            str2 = "_" + q + ".";
        }
        sb.append(str2);
        sb.append(e);
        sb.append(".");
        return sb.toString();
    }

    /* renamed from: x */
    public int mo37335x() {
        return this.f17109i;
    }

    /* renamed from: y */
    public synchronized boolean mo37336y() {
        return mo37331s() != null && m22402e0() && mo37333u() != null && mo37333u().length > 0;
    }
}
