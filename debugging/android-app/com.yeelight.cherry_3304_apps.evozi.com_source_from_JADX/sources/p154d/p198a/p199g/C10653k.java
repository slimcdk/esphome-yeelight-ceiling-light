package p154d.p198a.p199g;

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
import org.apache.commons.p271io.FilenameUtils;
import p154d.p198a.C10609b;
import p154d.p198a.p199g.C10637h;
import p154d.p198a.p199g.C10645i;
import p154d.p198a.p199g.p200r.C10680d;
import p154d.p198a.p199g.p200r.C10681e;
import p154d.p198a.p199g.p200r.C10683g;
import p154d.p198a.p199g.p201s.C10686a;

/* renamed from: d.a.g.k */
public class C10653k implements C10645i {

    /* renamed from: f */
    private static Logger f20368f = Logger.getLogger(C10653k.class.getName());

    /* renamed from: a */
    protected String f20369a;

    /* renamed from: b */
    protected InetAddress f20370b;

    /* renamed from: c */
    protected NetworkInterface f20371c;

    /* renamed from: d */
    private final C10655b f20372d;

    /* renamed from: e */
    private int f20373e;

    /* renamed from: d.a.g.k$a */
    static /* synthetic */ class C10654a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20374a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                d.a.g.r.e[] r0 = p154d.p198a.p199g.p200r.C10681e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20374a = r0
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_A     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20374a     // Catch:{ NoSuchFieldError -> 0x001d }
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_A6     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20374a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_AAAA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p154d.p198a.p199g.C10653k.C10654a.<clinit>():void");
        }
    }

    /* renamed from: d.a.g.k$b */
    private static final class C10655b extends C10645i.C10647b {
        public C10655b(C10656l lVar) {
            mo33646q(lVar);
        }
    }

    private C10653k(InetAddress inetAddress, String str, C10656l lVar) {
        this.f20372d = new C10655b(lVar);
        this.f20370b = inetAddress;
        this.f20369a = str;
        if (inetAddress != null) {
            try {
                this.f20371c = NetworkInterface.getByInetAddress(inetAddress);
            } catch (Exception e) {
                f20368f.log(Level.SEVERE, "LocalHostInfo() exception ", e);
            }
        }
    }

    /* renamed from: A */
    public static C10653k m26181A(InetAddress inetAddress, C10656l lVar, String str) {
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
                        InetAddress[] a = C10609b.C10610a.m25914a().mo33457a();
                        if (a.length > 0) {
                            inetAddress2 = a[0];
                        }
                    }
                }
                str2 = inetAddress2.getHostName();
                if (inetAddress2.isLoopbackAddress()) {
                    f20368f.warning("Could not find any address beside the loopback.");
                }
            } catch (IOException e) {
                Logger logger = f20368f;
                Level level = Level.WARNING;
                logger.log(level, "Could not intialize the host network interface on " + inetAddress + "because of an error: " + e.getMessage(), e);
                inetAddress2 = m26186z();
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
        return new C10653k(inetAddress2, replace + ".local.", lVar);
    }

    /* renamed from: f */
    private C10637h.C10638a m26182f(boolean z, int i) {
        if (!(mo33688o() instanceof Inet4Address) && (!(mo33688o() instanceof Inet6Address) || !((Inet6Address) mo33688o()).isIPv4CompatibleAddress())) {
            return null;
        }
        return new C10637h.C10640c(mo33690q(), C10680d.CLASS_IN, z, i, mo33688o());
    }

    /* renamed from: g */
    private C10637h.C10642e m26183g(boolean z, int i) {
        if (mo33688o() instanceof Inet4Address) {
            return new C10637h.C10642e(mo33688o().getHostAddress() + ".in-addr.arpa.", C10680d.CLASS_IN, z, i, mo33690q());
        } else if (!(mo33688o() instanceof Inet6Address) || !((Inet6Address) mo33688o()).isIPv4CompatibleAddress()) {
            return null;
        } else {
            byte[] address = mo33688o().getAddress();
            return new C10637h.C10642e(((address[12] & 255) + "." + (address[13] & 255) + "." + (address[14] & 255) + "." + (address[15] & 255)) + ".in-addr.arpa.", C10680d.CLASS_IN, z, i, mo33690q());
        }
    }

    /* renamed from: h */
    private C10637h.C10638a m26184h(boolean z, int i) {
        if (!(mo33688o() instanceof Inet6Address)) {
            return null;
        }
        return new C10637h.C10641d(mo33690q(), C10680d.CLASS_IN, z, i, mo33688o());
    }

    /* renamed from: i */
    private C10637h.C10642e m26185i(boolean z, int i) {
        if (!(mo33688o() instanceof Inet6Address)) {
            return null;
        }
        return new C10637h.C10642e(mo33688o().getHostAddress() + ".ip6.arpa.", C10680d.CLASS_IN, z, i, mo33690q());
    }

    /* renamed from: z */
    private static InetAddress m26186z() {
        try {
            return InetAddress.getByName((String) null);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    /* renamed from: B */
    public boolean mo33673B() {
        return this.f20372d.mo33643n();
    }

    /* renamed from: C */
    public void mo33674C(C10686a aVar) {
        this.f20372d.mo33644o(aVar);
    }

    /* renamed from: D */
    public boolean mo33675D() {
        return this.f20372d.mo33645p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo33676E(DatagramPacket datagramPacket) {
        InetAddress address;
        boolean z = false;
        if (mo33688o() == null || (address = datagramPacket.getAddress()) == null) {
            return false;
        }
        if (address.isLinkLocalAddress() && !mo33688o().isLinkLocalAddress()) {
            z = true;
        }
        if (!address.isLoopbackAddress() || mo33688o().isLoopbackAddress()) {
            return z;
        }
        return true;
    }

    /* renamed from: F */
    public boolean mo33677F(long j) {
        return this.f20372d.mo33649t(j);
    }

    /* renamed from: G */
    public boolean mo33678G(long j) {
        if (this.f20370b == null) {
            return true;
        }
        return this.f20372d.mo33651u(j);
    }

    /* renamed from: a */
    public Collection<C10637h> mo33679a(boolean z, int i) {
        ArrayList arrayList = new ArrayList();
        C10637h.C10638a f = m26182f(z, i);
        if (f != null) {
            arrayList.add(f);
        }
        C10637h.C10638a h = m26184h(z, i);
        if (h != null) {
            arrayList.add(h);
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo33680b(C10686a aVar, C10683g gVar) {
        this.f20372d.mo33631a(aVar, gVar);
    }

    /* renamed from: c */
    public boolean mo33681c() {
        return this.f20372d.mo33632b();
    }

    /* renamed from: d */
    public boolean mo33682d() {
        return this.f20372d.mo33633c();
    }

    /* renamed from: e */
    public boolean mo33683e(C10637h.C10638a aVar) {
        C10637h.C10638a k = mo33684k(aVar.mo33527f(), aVar.mo33538p(), 3600);
        return k != null && k.mo33608I(aVar) && k.mo33620Q(aVar) && !k.mo33609J(aVar);
    }

    /* renamed from: j */
    public boolean mo33627j(C10686a aVar) {
        return this.f20372d.mo33627j(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C10637h.C10638a mo33684k(C10681e eVar, boolean z, int i) {
        int i2 = C10654a.f20374a[eVar.ordinal()];
        if (i2 == 1) {
            return m26182f(z, i);
        }
        if (i2 == 2 || i2 == 3) {
            return m26184h(z, i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C10637h.C10642e mo33685l(C10681e eVar, boolean z, int i) {
        int i2 = C10654a.f20374a[eVar.ordinal()];
        if (i2 == 1) {
            return m26183g(z, i);
        }
        if (i2 == 2 || i2 == 3) {
            return m26185i(z, i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Inet4Address mo33686m() {
        if (mo33688o() instanceof Inet4Address) {
            return (Inet4Address) this.f20370b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Inet6Address mo33687n() {
        if (mo33688o() instanceof Inet6Address) {
            return (Inet6Address) this.f20370b;
        }
        return null;
    }

    /* renamed from: o */
    public InetAddress mo33688o() {
        return this.f20370b;
    }

    /* renamed from: p */
    public NetworkInterface mo33689p() {
        return this.f20371c;
    }

    /* renamed from: q */
    public String mo33690q() {
        return this.f20369a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized String mo33691r() {
        String sb;
        this.f20373e++;
        int indexOf = this.f20369a.indexOf(".local.");
        int lastIndexOf = this.f20369a.lastIndexOf(45);
        StringBuilder sb2 = new StringBuilder();
        String str = this.f20369a;
        if (lastIndexOf != -1) {
            indexOf = lastIndexOf;
        }
        sb2.append(str.substring(0, indexOf));
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        sb2.append(this.f20373e);
        sb2.append(".local.");
        sb = sb2.toString();
        this.f20369a = sb;
        return sb;
    }

    /* renamed from: s */
    public boolean mo33692s() {
        return this.f20372d.mo33635e();
    }

    /* renamed from: t */
    public boolean mo33693t(C10686a aVar, C10683g gVar) {
        return this.f20372d.mo33637g(aVar, gVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("local host info[");
        sb.append(mo33690q() != null ? mo33690q() : "no name");
        sb.append(", ");
        sb.append(mo33689p() != null ? mo33689p().getDisplayName() : "???");
        sb.append(Constants.COLON_SEPARATOR);
        sb.append(mo33688o() != null ? mo33688o().getHostAddress() : "no address");
        sb.append(", ");
        sb.append(this.f20372d);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo33695u() {
        return this.f20372d.mo33638h();
    }

    /* renamed from: v */
    public boolean mo33696v() {
        return this.f20372d.mo33639i();
    }

    /* renamed from: w */
    public boolean mo33697w() {
        return this.f20372d.mo33640k();
    }

    /* renamed from: x */
    public boolean mo33698x() {
        return this.f20372d.mo33641l();
    }

    /* renamed from: y */
    public boolean mo33699y() {
        return this.f20372d.mo33642m();
    }
}
