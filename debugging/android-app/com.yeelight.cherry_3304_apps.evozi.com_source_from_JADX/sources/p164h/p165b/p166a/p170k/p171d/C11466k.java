package p164h.p165b.p166a.p170k.p171d;

import com.miot.common.device.parser.xml.DddTag;
import com.xiaomi.mipush.sdk.Constants;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.p170k.p172e.C11485f;
import p164h.p165b.p166a.p170k.p172e.C11487h;
import p164h.p165b.p166a.p170k.p172e.C11488i;
import p164h.p257c.p259b.C11496b;

/* renamed from: h.b.a.k.d.k */
public class C11466k implements C11487h {

    /* renamed from: f */
    private static Logger f22814f = Logger.getLogger(C11466k.class.getName());

    /* renamed from: a */
    protected final Set<String> f22815a;

    /* renamed from: b */
    protected final Set<String> f22816b;

    /* renamed from: c */
    protected final List<NetworkInterface> f22817c;

    /* renamed from: d */
    protected final List<InetAddress> f22818d;

    /* renamed from: e */
    protected int f22819e;

    /* renamed from: h.b.a.k.d.k$a */
    class C11467a extends C11496b<NetworkInterface> {
        C11467a(Collection collection) {
            super(collection);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo36332a(int i) {
            synchronized (C11466k.this.f22817c) {
                C11466k.this.f22817c.remove(i);
            }
        }
    }

    /* renamed from: h.b.a.k.d.k$b */
    class C11468b extends C11496b<InetAddress> {
        C11468b(Collection collection) {
            super(collection);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo36332a(int i) {
            synchronized (C11466k.this.f22818d) {
                C11466k.this.f22818d.remove(i);
            }
        }
    }

    public C11466k() {
        this(0);
    }

    public C11466k(int i) {
        this.f22815a = new HashSet();
        this.f22816b = new HashSet();
        this.f22817c = new ArrayList();
        this.f22818d = new ArrayList();
        System.setProperty("java.net.preferIPv4Stack", "true");
        String property = System.getProperty("org.fourthline.cling.network.useInterfaces");
        if (property != null) {
            this.f22815a.addAll(Arrays.asList(property.split(Constants.ACCEPT_TIME_SEPARATOR_SP)));
        }
        String property2 = System.getProperty("org.fourthline.cling.network.useAddresses");
        if (property2 != null) {
            this.f22816b.addAll(Arrays.asList(property2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)));
        }
        mo35514j();
        mo36326i();
        if (this.f22817c.size() == 0 || this.f22818d.size() == 0) {
            f22814f.warning("No usable network interface or addresses found");
            if (mo35516q()) {
                throw new C11488i("Could not discover any usable network interfaces and/or addresses");
            }
        }
        this.f22819e = i;
    }

    /* renamed from: a */
    public Iterator<NetworkInterface> mo36319a() {
        return new C11467a(this.f22817c);
    }

    /* renamed from: b */
    public boolean mo36320b() {
        return this.f22817c.size() > 0 && this.f22818d.size() > 0;
    }

    /* renamed from: c */
    public Iterator<InetAddress> mo36321c() {
        return new C11468b(this.f22818d);
    }

    /* renamed from: d */
    public int mo36322d() {
        return 1900;
    }

    /* renamed from: e */
    public InetAddress mo36323e() {
        try {
            return InetAddress.getByName("239.255.255.250");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: f */
    public byte[] mo36324f(InetAddress inetAddress) {
        try {
            NetworkInterface byInetAddress = NetworkInterface.getByInetAddress(inetAddress);
            if (byInetAddress != null) {
                return byInetAddress.getHardwareAddress();
            }
            return null;
        } catch (Throwable th) {
            Logger logger = f22814f;
            Level level = Level.WARNING;
            logger.log(level, "Cannot get hardware address for: " + inetAddress, th);
            return null;
        }
    }

    /* renamed from: g */
    public int mo36325g() {
        return this.f22819e;
    }

    /* renamed from: h */
    public InetAddress mo35513h(NetworkInterface networkInterface, boolean z, InetAddress inetAddress) {
        InetAddress k = mo36327k(inetAddress);
        if (k != null) {
            return k;
        }
        Logger logger = f22814f;
        logger.finer("Could not find local bind address in same subnet as: " + inetAddress.getHostAddress());
        for (InetAddress next : mo36328l(networkInterface)) {
            if (z && (next instanceof Inet6Address)) {
                return next;
            }
            if (!z && (next instanceof Inet4Address)) {
                return next;
            }
        }
        throw new IllegalStateException("Can't find any IPv4 or IPv6 address on interface: " + networkInterface.getDisplayName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo36326i() {
        try {
            synchronized (this.f22817c) {
                Iterator<NetworkInterface> it = this.f22817c.iterator();
                while (it.hasNext()) {
                    NetworkInterface next = it.next();
                    Logger logger = f22814f;
                    logger.finer("Discovering addresses of interface: " + next.getDisplayName());
                    int i = 0;
                    for (InetAddress next2 : mo36328l(next)) {
                        if (next2 == null) {
                            Logger logger2 = f22814f;
                            logger2.warning("Network has a null address: " + next.getDisplayName());
                        } else if (mo35515o(next, next2)) {
                            Logger logger3 = f22814f;
                            logger3.fine("Discovered usable network interface address: " + next2.getHostAddress());
                            i++;
                            synchronized (this.f22818d) {
                                this.f22818d.add(next2);
                            }
                        } else {
                            Logger logger4 = f22814f;
                            logger4.finer("Ignoring non-usable network interface address: " + next2.getHostAddress());
                        }
                    }
                    if (i == 0) {
                        Logger logger5 = f22814f;
                        logger5.finer("Network interface has no usable addresses, removing: " + next.getDisplayName());
                        it.remove();
                    }
                }
            }
        } catch (Exception e) {
            throw new C11485f("Could not not analyze local network interfaces: " + e, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo35514j() {
        try {
            Iterator<T> it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                Logger logger = f22814f;
                logger.finer("Analyzing network interface: " + networkInterface.getDisplayName());
                if (mo36331p(networkInterface)) {
                    Logger logger2 = f22814f;
                    logger2.fine("Discovered usable network interface: " + networkInterface.getDisplayName());
                    synchronized (this.f22817c) {
                        this.f22817c.add(networkInterface);
                    }
                } else {
                    Logger logger3 = f22814f;
                    logger3.finer("Ignoring non-usable network interface: " + networkInterface.getDisplayName());
                }
            }
        } catch (Exception e) {
            throw new C11485f("Could not not analyze local network interfaces: " + e, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public InetAddress mo36327k(InetAddress inetAddress) {
        synchronized (this.f22817c) {
            loop0:
            for (NetworkInterface m : this.f22817c) {
                Iterator<InterfaceAddress> it = mo36329m(m).iterator();
                while (true) {
                    if (it.hasNext()) {
                        InterfaceAddress next = it.next();
                        synchronized (this.f22818d) {
                            if (next != null) {
                                if (this.f22818d.contains(next.getAddress())) {
                                    if (mo36330n(inetAddress.getAddress(), next.getAddress().getAddress(), next.getNetworkPrefixLength())) {
                                        InetAddress address = next.getAddress();
                                        return address;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public List<InetAddress> mo36328l(NetworkInterface networkInterface) {
        return Collections.list(networkInterface.getInetAddresses());
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public List<InterfaceAddress> mo36329m(NetworkInterface networkInterface) {
        return networkInterface.getInterfaceAddresses();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo36330n(byte[] bArr, byte[] bArr2, short s) {
        if (bArr.length != bArr2.length || s / 8 > bArr.length) {
            return false;
        }
        int i = 0;
        while (s >= 8 && i < bArr.length) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
            s = (short) (s - 8);
        }
        if (i == bArr.length) {
            return true;
        }
        byte b = (byte) (((1 << (8 - s)) - 1) ^ -1);
        return (bArr[i] & b) == (bArr2[i] & b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo35515o(NetworkInterface networkInterface, InetAddress inetAddress) {
        Logger logger;
        StringBuilder sb;
        String str;
        if (!(inetAddress instanceof Inet4Address)) {
            logger = f22814f;
            sb = new StringBuilder();
            str = "Skipping unsupported non-IPv4 address: ";
        } else if (inetAddress.isLoopbackAddress()) {
            logger = f22814f;
            sb = new StringBuilder();
            str = "Skipping loopback address: ";
        } else if (this.f22816b.size() <= 0 || this.f22816b.contains(inetAddress.getHostAddress())) {
            return true;
        } else {
            logger = f22814f;
            sb = new StringBuilder();
            str = "Skipping unwanted address: ";
        }
        sb.append(str);
        sb.append(inetAddress);
        logger.finer(sb.toString());
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo36331p(NetworkInterface networkInterface) {
        Logger logger;
        StringBuilder sb;
        String str;
        String name;
        if (!networkInterface.isUp()) {
            logger = f22814f;
            sb = new StringBuilder();
            str = "Skipping network interface (down): ";
        } else if (mo36328l(networkInterface).size() == 0) {
            logger = f22814f;
            sb = new StringBuilder();
            str = "Skipping network interface without bound IP addresses: ";
        } else if (networkInterface.getName().toLowerCase(Locale.ROOT).startsWith("vmnet") || (networkInterface.getDisplayName() != null && networkInterface.getDisplayName().toLowerCase(Locale.ROOT).contains("vmnet"))) {
            logger = f22814f;
            sb = new StringBuilder();
            str = "Skipping network interface (VMWare): ";
        } else if (networkInterface.getName().toLowerCase(Locale.ROOT).startsWith("vnic")) {
            logger = f22814f;
            sb = new StringBuilder();
            str = "Skipping network interface (Parallels): ";
        } else if (networkInterface.getName().toLowerCase(Locale.ROOT).startsWith("vboxnet")) {
            logger = f22814f;
            sb = new StringBuilder();
            str = "Skipping network interface (Virtual Box): ";
        } else if (networkInterface.getName().toLowerCase(Locale.ROOT).contains(DddTag.PL_PROPERTY_ATTR_VIRTUAL)) {
            logger = f22814f;
            sb = new StringBuilder();
            str = "Skipping network interface (named '*virtual*'): ";
        } else if (networkInterface.getName().toLowerCase(Locale.ROOT).startsWith("ppp")) {
            logger = f22814f;
            sb = new StringBuilder();
            str = "Skipping network interface (PPP): ";
        } else if (networkInterface.isLoopback()) {
            logger = f22814f;
            sb = new StringBuilder();
            str = "Skipping network interface (ignoring loopback): ";
        } else if (this.f22815a.size() > 0 && !this.f22815a.contains(networkInterface.getName())) {
            logger = f22814f;
            sb = new StringBuilder();
            sb.append("Skipping unwanted network interface (-Dorg.fourthline.cling.network.useInterfaces): ");
            name = networkInterface.getName();
            sb.append(name);
            logger.finer(sb.toString());
            return false;
        } else if (networkInterface.supportsMulticast()) {
            return true;
        } else {
            Logger logger2 = f22814f;
            logger2.warning("Network interface may not be multicast capable: " + networkInterface.getDisplayName());
            return true;
        }
        sb.append(str);
        name = networkInterface.getDisplayName();
        sb.append(name);
        logger.finer(sb.toString());
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo35516q() {
        return true;
    }
}
