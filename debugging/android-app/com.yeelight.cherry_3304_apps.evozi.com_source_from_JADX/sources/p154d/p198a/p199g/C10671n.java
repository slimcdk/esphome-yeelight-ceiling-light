package p154d.p198a.p199g;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import p154d.p198a.C10609b;

/* renamed from: d.a.g.n */
public class C10671n implements C10609b {

    /* renamed from: c */
    private static final Logger f20433c = Logger.getLogger(C10671n.class.getName());

    /* renamed from: a */
    private final Method f20434a;

    /* renamed from: b */
    private final Method f20435b;

    public C10671n() {
        Method method;
        Method method2 = null;
        try {
            method = NetworkInterface.class.getMethod("isUp", (Class[]) null);
        } catch (Exception unused) {
            method = null;
        }
        this.f20434a = method;
        try {
            method2 = NetworkInterface.class.getMethod("supportsMulticast", (Class[]) null);
        } catch (Exception unused2) {
        }
        this.f20435b = method2;
    }

    /* renamed from: a */
    public InetAddress[] mo33457a() {
        HashSet hashSet = new HashSet();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (f20433c.isLoggable(Level.FINEST)) {
                        Logger logger = f20433c;
                        logger.finest("Found NetworkInterface/InetAddress: " + nextElement + " -- " + nextElement2);
                    }
                    if (mo33786b(nextElement, nextElement2)) {
                        hashSet.add(nextElement2);
                    }
                }
            }
        } catch (SocketException e) {
            Logger logger2 = f20433c;
            logger2.warning("Error while fetching network interfaces addresses: " + e);
        }
        return (InetAddress[]) hashSet.toArray(new InetAddress[hashSet.size()]);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(3:5|6|(1:8))|9|10|(3:12|13|(1:15))|16|17|(1:19)(1:20)) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0019 A[SYNTHETIC, Splitter:B:12:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002f A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo33786b(java.net.NetworkInterface r4, java.net.InetAddress r5) {
        /*
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r3.f20434a     // Catch:{ Exception -> 0x0031 }
            r2 = 0
            if (r1 == 0) goto L_0x0015
            java.lang.reflect.Method r1 = r3.f20434a     // Catch:{ Exception -> 0x0015 }
            java.lang.Object r1 = r1.invoke(r4, r2)     // Catch:{ Exception -> 0x0015 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x0015 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0015 }
            if (r1 != 0) goto L_0x0015
            return r0
        L_0x0015:
            java.lang.reflect.Method r1 = r3.f20435b     // Catch:{ Exception -> 0x0031 }
            if (r1 == 0) goto L_0x0028
            java.lang.reflect.Method r1 = r3.f20435b     // Catch:{ Exception -> 0x0028 }
            java.lang.Object r4 = r1.invoke(r4, r2)     // Catch:{ Exception -> 0x0028 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x0028 }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x0028 }
            if (r4 != 0) goto L_0x0028
            return r0
        L_0x0028:
            boolean r4 = r5.isLoopbackAddress()     // Catch:{ Exception -> 0x0031 }
            if (r4 == 0) goto L_0x002f
            return r0
        L_0x002f:
            r4 = 1
            return r4
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p154d.p198a.p199g.C10671n.mo33786b(java.net.NetworkInterface, java.net.InetAddress):boolean");
    }
}
