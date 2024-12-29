package org.fourthline.cling.transport.impl;

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
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.NoNetworkException;
import org.seamless.util.C10244b;
import p148d7.C8957g;

/* renamed from: org.fourthline.cling.transport.impl.j */
public class C10133j implements C8957g {

    /* renamed from: f */
    private static Logger f18721f = Logger.getLogger(C10133j.class.getName());

    /* renamed from: a */
    protected final Set<String> f18722a;

    /* renamed from: b */
    protected final Set<String> f18723b;

    /* renamed from: c */
    protected final List<NetworkInterface> f18724c;

    /* renamed from: d */
    protected final List<InetAddress> f18725d;

    /* renamed from: e */
    protected int f18726e;

    /* renamed from: org.fourthline.cling.transport.impl.j$a */
    class C10134a extends C10244b<NetworkInterface> {
        C10134a(Collection collection) {
            super(collection);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo40765a(int i) {
            synchronized (C10133j.this.f18724c) {
                C10133j.this.f18724c.remove(i);
            }
        }
    }

    /* renamed from: org.fourthline.cling.transport.impl.j$b */
    class C10135b extends C10244b<InetAddress> {
        C10135b(Collection collection) {
            super(collection);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo40765a(int i) {
            synchronized (C10133j.this.f18725d) {
                C10133j.this.f18725d.remove(i);
            }
        }
    }

    public C10133j() {
        this(0);
    }

    public C10133j(int i) {
        HashSet hashSet = new HashSet();
        this.f18722a = hashSet;
        HashSet hashSet2 = new HashSet();
        this.f18723b = hashSet2;
        ArrayList arrayList = new ArrayList();
        this.f18724c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f18725d = arrayList2;
        System.setProperty("java.net.preferIPv4Stack", "true");
        String property = System.getProperty("org.fourthline.cling.network.useInterfaces");
        if (property != null) {
            hashSet.addAll(Arrays.asList(property.split(Constants.ACCEPT_TIME_SEPARATOR_SP)));
        }
        String property2 = System.getProperty("org.fourthline.cling.network.useAddresses");
        if (property2 != null) {
            hashSet2.addAll(Arrays.asList(property2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)));
        }
        mo40302j();
        mo40759i();
        if (arrayList.size() == 0 || arrayList2.size() == 0) {
            f18721f.warning("No usable network interface or addresses found");
            if (mo40304q()) {
                throw new NoNetworkException("Could not discover any usable network interfaces and/or addresses");
            }
        }
        this.f18726e = i;
    }

    /* renamed from: a */
    public Iterator<NetworkInterface> mo36795a() {
        return new C10134a(this.f18724c);
    }

    /* renamed from: b */
    public boolean mo36796b() {
        return this.f18724c.size() > 0 && this.f18725d.size() > 0;
    }

    /* renamed from: c */
    public Iterator<InetAddress> mo36797c() {
        return new C10135b(this.f18725d);
    }

    /* renamed from: d */
    public int mo36798d() {
        return 1900;
    }

    /* renamed from: e */
    public InetAddress mo36799e() {
        try {
            return InetAddress.getByName("239.255.255.250");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: f */
    public byte[] mo36800f(InetAddress inetAddress) {
        try {
            NetworkInterface byInetAddress = NetworkInterface.getByInetAddress(inetAddress);
            if (byInetAddress != null) {
                return byInetAddress.getHardwareAddress();
            }
            return null;
        } catch (Throwable th) {
            Logger logger = f18721f;
            Level level = Level.WARNING;
            logger.log(level, "Cannot get hardware address for: " + inetAddress, th);
            return null;
        }
    }

    /* renamed from: g */
    public int mo36801g() {
        return this.f18726e;
    }

    /* renamed from: h */
    public InetAddress mo36802h(NetworkInterface networkInterface, boolean z, InetAddress inetAddress) {
        InetAddress k = mo40760k(inetAddress);
        if (k != null) {
            return k;
        }
        Logger logger = f18721f;
        logger.finer("Could not find local bind address in same subnet as: " + inetAddress.getHostAddress());
        for (InetAddress next : mo40761l(networkInterface)) {
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
    public void mo40759i() {
        try {
            synchronized (this.f18724c) {
                Iterator<NetworkInterface> it = this.f18724c.iterator();
                while (it.hasNext()) {
                    NetworkInterface next = it.next();
                    Logger logger = f18721f;
                    logger.finer("Discovering addresses of interface: " + next.getDisplayName());
                    int i = 0;
                    for (InetAddress next2 : mo40761l(next)) {
                        if (next2 == null) {
                            Logger logger2 = f18721f;
                            logger2.warning("Network has a null address: " + next.getDisplayName());
                        } else if (mo40303o(next, next2)) {
                            Logger logger3 = f18721f;
                            logger3.fine("Discovered usable network interface address: " + next2.getHostAddress());
                            i++;
                            synchronized (this.f18725d) {
                                this.f18725d.add(next2);
                            }
                        } else {
                            Logger logger4 = f18721f;
                            logger4.finer("Ignoring non-usable network interface address: " + next2.getHostAddress());
                        }
                    }
                    if (i == 0) {
                        Logger logger5 = f18721f;
                        logger5.finer("Network interface has no usable addresses, removing: " + next.getDisplayName());
                        it.remove();
                    }
                }
            }
        } catch (Exception e) {
            throw new InitializationException("Could not not analyze local network interfaces: " + e, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo40302j() {
        try {
            Iterator<T> it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                Logger logger = f18721f;
                logger.finer("Analyzing network interface: " + networkInterface.getDisplayName());
                if (mo40764p(networkInterface)) {
                    Logger logger2 = f18721f;
                    logger2.fine("Discovered usable network interface: " + networkInterface.getDisplayName());
                    synchronized (this.f18724c) {
                        this.f18724c.add(networkInterface);
                    }
                } else {
                    Logger logger3 = f18721f;
                    logger3.finer("Ignoring non-usable network interface: " + networkInterface.getDisplayName());
                }
            }
        } catch (Exception e) {
            throw new InitializationException("Could not not analyze local network interfaces: " + e, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public InetAddress mo40760k(InetAddress inetAddress) {
        synchronized (this.f18724c) {
            loop0:
            for (NetworkInterface m : this.f18724c) {
                Iterator<InterfaceAddress> it = mo40762m(m).iterator();
                while (true) {
                    if (it.hasNext()) {
                        InterfaceAddress next = it.next();
                        synchronized (this.f18725d) {
                            if (next != null) {
                                if (this.f18725d.contains(next.getAddress())) {
                                    if (mo40763n(inetAddress.getAddress(), next.getAddress().getAddress(), next.getNetworkPrefixLength())) {
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
    public List<InetAddress> mo40761l(NetworkInterface networkInterface) {
        return Collections.list(networkInterface.getInetAddresses());
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public List<InterfaceAddress> mo40762m(NetworkInterface networkInterface) {
        return networkInterface.getInterfaceAddresses();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo40763n(byte[] bArr, byte[] bArr2, short s) {
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
    public boolean mo40303o(NetworkInterface networkInterface, InetAddress inetAddress) {
        Logger logger;
        StringBuilder sb;
        String str;
        if (!(inetAddress instanceof Inet4Address)) {
            logger = f18721f;
            sb = new StringBuilder();
            str = "Skipping unsupported non-IPv4 address: ";
        } else if (inetAddress.isLoopbackAddress()) {
            logger = f18721f;
            sb = new StringBuilder();
            str = "Skipping loopback address: ";
        } else if (this.f18723b.size() <= 0 || this.f18723b.contains(inetAddress.getHostAddress())) {
            return true;
        } else {
            logger = f18721f;
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
    public boolean mo40764p(NetworkInterface networkInterface) {
        Logger logger;
        StringBuilder sb;
        String str;
        String name;
        if (!networkInterface.isUp()) {
            logger = f18721f;
            sb = new StringBuilder();
            str = "Skipping network interface (down): ";
        } else if (mo40761l(networkInterface).size() == 0) {
            logger = f18721f;
            sb = new StringBuilder();
            str = "Skipping network interface without bound IP addresses: ";
        } else {
            String name2 = networkInterface.getName();
            Locale locale = Locale.ROOT;
            if (name2.toLowerCase(locale).startsWith("vmnet") || (networkInterface.getDisplayName() != null && networkInterface.getDisplayName().toLowerCase(locale).contains("vmnet"))) {
                logger = f18721f;
                sb = new StringBuilder();
                str = "Skipping network interface (VMWare): ";
            } else if (networkInterface.getName().toLowerCase(locale).startsWith("vnic")) {
                logger = f18721f;
                sb = new StringBuilder();
                str = "Skipping network interface (Parallels): ";
            } else if (networkInterface.getName().toLowerCase(locale).startsWith("vboxnet")) {
                logger = f18721f;
                sb = new StringBuilder();
                str = "Skipping network interface (Virtual Box): ";
            } else if (networkInterface.getName().toLowerCase(locale).contains(DddTag.PL_PROPERTY_ATTR_VIRTUAL)) {
                logger = f18721f;
                sb = new StringBuilder();
                str = "Skipping network interface (named '*virtual*'): ";
            } else if (networkInterface.getName().toLowerCase(locale).startsWith("ppp")) {
                logger = f18721f;
                sb = new StringBuilder();
                str = "Skipping network interface (PPP): ";
            } else if (networkInterface.isLoopback()) {
                logger = f18721f;
                sb = new StringBuilder();
                str = "Skipping network interface (ignoring loopback): ";
            } else if (this.f18722a.size() > 0 && !this.f18722a.contains(networkInterface.getName())) {
                logger = f18721f;
                sb = new StringBuilder();
                sb.append("Skipping unwanted network interface (-Dorg.fourthline.cling.network.useInterfaces): ");
                name = networkInterface.getName();
                sb.append(name);
                logger.finer(sb.toString());
                return false;
            } else if (networkInterface.supportsMulticast()) {
                return true;
            } else {
                Logger logger2 = f18721f;
                logger2.warning("Network interface may not be multicast capable: " + networkInterface.getDisplayName());
                return true;
            }
        }
        sb.append(str);
        name = networkInterface.getDisplayName();
        sb.append(name);
        logger.finer(sb.toString());
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo40304q() {
        return true;
    }
}
