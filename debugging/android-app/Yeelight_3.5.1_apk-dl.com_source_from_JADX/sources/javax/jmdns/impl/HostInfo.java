package javax.jmdns.impl;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.C9220b;
import javax.jmdns.impl.C9259h;
import javax.jmdns.impl.DNSStatefulObject;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import javax.jmdns.impl.constants.DNSState;
import org.apache.commons.p194io.FilenameUtils;
import p198p4.C10268a;

public class HostInfo implements DNSStatefulObject {

    /* renamed from: f */
    private static Logger f17055f = Logger.getLogger(HostInfo.class.getName());

    /* renamed from: a */
    protected String f17056a;

    /* renamed from: b */
    protected InetAddress f17057b;

    /* renamed from: c */
    protected NetworkInterface f17058c;

    /* renamed from: d */
    private final HostInfoState f17059d;

    /* renamed from: e */
    private int f17060e;

    private static final class HostInfoState extends DNSStatefulObject.DefaultImplementation {
        private static final long serialVersionUID = -8191476803620402088L;

        public HostInfoState(JmDNSImpl jmDNSImpl) {
            setDns(jmDNSImpl);
        }
    }

    /* renamed from: javax.jmdns.impl.HostInfo$a */
    static /* synthetic */ class C9227a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17061a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                javax.jmdns.impl.constants.DNSRecordType[] r0 = javax.jmdns.impl.constants.DNSRecordType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17061a = r0
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_A     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17061a     // Catch:{ NoSuchFieldError -> 0x001d }
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_A6     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17061a     // Catch:{ NoSuchFieldError -> 0x0028 }
                javax.jmdns.impl.constants.DNSRecordType r1 = javax.jmdns.impl.constants.DNSRecordType.TYPE_AAAA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.HostInfo.C9227a.<clinit>():void");
        }
    }

    private HostInfo(InetAddress inetAddress, String str, JmDNSImpl jmDNSImpl) {
        this.f17059d = new HostInfoState(jmDNSImpl);
        this.f17057b = inetAddress;
        this.f17056a = str;
        if (inetAddress != null) {
            try {
                this.f17058c = NetworkInterface.getByInetAddress(inetAddress);
            } catch (Exception e) {
                f17055f.log(Level.SEVERE, "LocalHostInfo() exception ", e);
            }
        }
    }

    /* renamed from: f */
    private C9259h.C9260a m22285f(boolean z, int i) {
        if (!(mo37388n() instanceof Inet4Address) && (!(mo37388n() instanceof Inet6Address) || !((Inet6Address) mo37388n()).isIPv4CompatibleAddress())) {
            return null;
        }
        return new C9259h.C9262c(mo37390p(), DNSRecordClass.CLASS_IN, z, i, mo37388n());
    }

    /* renamed from: g */
    private C9259h.C9264e m22286g(boolean z, int i) {
        if (mo37388n() instanceof Inet4Address) {
            return new C9259h.C9264e(mo37388n().getHostAddress() + ".in-addr.arpa.", DNSRecordClass.CLASS_IN, z, i, mo37390p());
        } else if (!(mo37388n() instanceof Inet6Address) || !((Inet6Address) mo37388n()).isIPv4CompatibleAddress()) {
            return null;
        } else {
            byte[] address = mo37388n().getAddress();
            return new C9259h.C9264e(((address[12] & 255) + "." + (address[13] & 255) + "." + (address[14] & 255) + "." + (address[15] & 255)) + ".in-addr.arpa.", DNSRecordClass.CLASS_IN, z, i, mo37390p());
        }
    }

    /* renamed from: h */
    private C9259h.C9260a m22287h(boolean z, int i) {
        if (!(mo37388n() instanceof Inet6Address)) {
            return null;
        }
        return new C9259h.C9263d(mo37390p(), DNSRecordClass.CLASS_IN, z, i, mo37388n());
    }

    /* renamed from: i */
    private C9259h.C9264e m22288i(boolean z, int i) {
        if (!(mo37388n() instanceof Inet6Address)) {
            return null;
        }
        return new C9259h.C9264e(mo37388n().getHostAddress() + ".ip6.arpa.", DNSRecordClass.CLASS_IN, z, i, mo37390p());
    }

    /* renamed from: y */
    private static InetAddress m22289y() {
        try {
            return InetAddress.getByName((String) null);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    /* renamed from: z */
    public static HostInfo m22290z(InetAddress inetAddress, JmDNSImpl jmDNSImpl, String str) {
        String str2;
        InetAddress inetAddress2;
        if (inetAddress == null) {
            try {
                String property = System.getProperty("net.mdns.interface");
                if (property != null) {
                    inetAddress2 = InetAddress.getByName(property);
                } else {
                    inetAddress2 = InetAddress.getLocalHost();
                    if (inetAddress2.isLoopbackAddress()) {
                        InetAddress[] a = C9220b.C9221a.m22278a().mo37344a();
                        if (a.length > 0) {
                            inetAddress2 = a[0];
                        }
                    }
                }
                str2 = inetAddress2.getHostName();
                if (inetAddress2.isLoopbackAddress()) {
                    f17055f.warning("Could not find any address beside the loopback.");
                }
            } catch (IOException e) {
                Logger logger = f17055f;
                Level level = Level.WARNING;
                logger.log(level, "Could not intialize the host network interface on " + inetAddress + "because of an error: " + e.getMessage(), e);
                inetAddress2 = m22289y();
                if (str == null || str.length() <= 0) {
                    str = "computer";
                }
            }
        } else {
            str2 = inetAddress.getHostName();
            inetAddress2 = inetAddress;
        }
        if (str2.contains("in-addr.arpa") || str2.equals(inetAddress2.getHostAddress())) {
            if (str == null || str.length() <= 0) {
                str = inetAddress2.getHostAddress();
            }
            str2 = str;
        }
        String replace = str2.replace(FilenameUtils.EXTENSION_SEPARATOR, '-');
        return new HostInfo(inetAddress2, replace + ".local.", jmDNSImpl);
    }

    /* renamed from: A */
    public boolean mo37373A() {
        return this.f17059d.recoverState();
    }

    /* renamed from: B */
    public void mo37374B(C10268a aVar) {
        this.f17059d.removeAssociationWithTask(aVar);
    }

    /* renamed from: C */
    public boolean mo37375C() {
        return this.f17059d.revertState();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo37376D(DatagramPacket datagramPacket) {
        InetAddress address;
        boolean z = false;
        if (mo37388n() == null || (address = datagramPacket.getAddress()) == null) {
            return false;
        }
        if (address.isLinkLocalAddress() && !mo37388n().isLinkLocalAddress()) {
            z = true;
        }
        if (!address.isLoopbackAddress() || mo37388n().isLoopbackAddress()) {
            return z;
        }
        return true;
    }

    /* renamed from: E */
    public boolean mo37377E(long j) {
        return this.f17059d.waitForAnnounced(j);
    }

    /* renamed from: F */
    public boolean mo37378F(long j) {
        if (this.f17057b == null) {
            return true;
        }
        return this.f17059d.waitForCanceled(j);
    }

    /* renamed from: a */
    public Collection<C9259h> mo37379a(boolean z, int i) {
        ArrayList arrayList = new ArrayList();
        C9259h.C9260a f = m22285f(z, i);
        if (f != null) {
            arrayList.add(f);
        }
        C9259h.C9260a h = m22287h(z, i);
        if (h != null) {
            arrayList.add(h);
        }
        return arrayList;
    }

    public boolean advanceState(C10268a aVar) {
        return this.f17059d.advanceState(aVar);
    }

    /* renamed from: b */
    public void mo37380b(C10268a aVar, DNSState dNSState) {
        this.f17059d.associateWithTask(aVar, dNSState);
    }

    /* renamed from: c */
    public boolean mo37381c() {
        return this.f17059d.cancelState();
    }

    /* renamed from: d */
    public boolean mo37382d() {
        return this.f17059d.closeState();
    }

    /* renamed from: e */
    public boolean mo37383e(C9259h.C9260a aVar) {
        C9259h.C9260a j = mo37384j(aVar.mo37558f(), aVar.mo37569p(), 3600);
        return j != null && j.mo37668I(aVar) && j.mo37680Q(aVar) && !j.mo37669J(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C9259h.C9260a mo37384j(DNSRecordType dNSRecordType, boolean z, int i) {
        int i2 = C9227a.f17061a[dNSRecordType.ordinal()];
        if (i2 == 1) {
            return m22285f(z, i);
        }
        if (i2 == 2 || i2 == 3) {
            return m22287h(z, i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C9259h.C9264e mo37385k(DNSRecordType dNSRecordType, boolean z, int i) {
        int i2 = C9227a.f17061a[dNSRecordType.ordinal()];
        if (i2 == 1) {
            return m22286g(z, i);
        }
        if (i2 == 2 || i2 == 3) {
            return m22288i(z, i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Inet4Address mo37386l() {
        if (mo37388n() instanceof Inet4Address) {
            return (Inet4Address) this.f17057b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Inet6Address mo37387m() {
        if (mo37388n() instanceof Inet6Address) {
            return (Inet6Address) this.f17057b;
        }
        return null;
    }

    /* renamed from: n */
    public InetAddress mo37388n() {
        return this.f17057b;
    }

    /* renamed from: o */
    public NetworkInterface mo37389o() {
        return this.f17058c;
    }

    /* renamed from: p */
    public String mo37390p() {
        return this.f17056a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public synchronized String mo37391q() {
        String sb;
        this.f17060e++;
        int indexOf = this.f17056a.indexOf(".local.");
        int lastIndexOf = this.f17056a.lastIndexOf(45);
        StringBuilder sb2 = new StringBuilder();
        String str = this.f17056a;
        if (lastIndexOf != -1) {
            indexOf = lastIndexOf;
        }
        sb2.append(str.substring(0, indexOf));
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        sb2.append(this.f17060e);
        sb2.append(".local.");
        sb = sb2.toString();
        this.f17056a = sb;
        return sb;
    }

    /* renamed from: r */
    public boolean mo37392r() {
        return this.f17059d.isAnnounced();
    }

    /* renamed from: s */
    public boolean mo37393s(C10268a aVar, DNSState dNSState) {
        return this.f17059d.isAssociatedWithTask(aVar, dNSState);
    }

    /* renamed from: t */
    public boolean mo37394t() {
        return this.f17059d.isCanceled();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("local host info[");
        sb.append(mo37390p() != null ? mo37390p() : "no name");
        sb.append(", ");
        sb.append(mo37389o() != null ? mo37389o().getDisplayName() : "???");
        sb.append(Constants.COLON_SEPARATOR);
        sb.append(mo37388n() != null ? mo37388n().getHostAddress() : "no address");
        sb.append(", ");
        sb.append(this.f17059d);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo37396u() {
        return this.f17059d.isCanceling();
    }

    /* renamed from: v */
    public boolean mo37397v() {
        return this.f17059d.isClosed();
    }

    /* renamed from: w */
    public boolean mo37398w() {
        return this.f17059d.isClosing();
    }

    /* renamed from: x */
    public boolean mo37399x() {
        return this.f17059d.isProbing();
    }
}
