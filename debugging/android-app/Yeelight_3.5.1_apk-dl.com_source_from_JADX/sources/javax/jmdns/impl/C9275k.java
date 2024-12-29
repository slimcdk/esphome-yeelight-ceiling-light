package javax.jmdns.impl;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.C9220b;

/* renamed from: javax.jmdns.impl.k */
public class C9275k implements C9220b {

    /* renamed from: c */
    private static final Logger f17192c = Logger.getLogger(C9275k.class.getName());

    /* renamed from: a */
    private final Method f17193a;

    /* renamed from: b */
    private final Method f17194b;

    public C9275k() {
        Method method;
        Method method2 = null;
        try {
            method = NetworkInterface.class.getMethod("isUp", (Class[]) null);
        } catch (Exception unused) {
            method = null;
        }
        this.f17193a = method;
        try {
            method2 = NetworkInterface.class.getMethod("supportsMulticast", (Class[]) null);
        } catch (Exception unused2) {
        }
        this.f17194b = method2;
    }

    /* renamed from: a */
    public InetAddress[] mo37344a() {
        HashSet hashSet = new HashSet();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    Logger logger = f17192c;
                    if (logger.isLoggable(Level.FINEST)) {
                        logger.finest("Found NetworkInterface/InetAddress: " + nextElement + " -- " + nextElement2);
                    }
                    if (mo37706b(nextElement, nextElement2)) {
                        hashSet.add(nextElement2);
                    }
                }
            }
        } catch (SocketException e) {
            Logger logger2 = f17192c;
            logger2.warning("Error while fetching network interfaces addresses: " + e);
        }
        return (InetAddress[]) hashSet.toArray(new InetAddress[hashSet.size()]);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(3:5|6|(1:8))|9|10|(3:12|13|(1:15))|16|17|(1:19)(1:20)) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002d, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0024 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0017 A[SYNTHETIC, Splitter:B:12:0x0017] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo37706b(java.net.NetworkInterface r4, java.net.InetAddress r5) {
        /*
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r3.f17193a     // Catch:{ Exception -> 0x002d }
            r2 = 0
            if (r1 == 0) goto L_0x0013
            java.lang.Object r1 = r1.invoke(r4, r2)     // Catch:{ Exception -> 0x0013 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x0013 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0013 }
            if (r1 != 0) goto L_0x0013
            return r0
        L_0x0013:
            java.lang.reflect.Method r1 = r3.f17194b     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x0024
            java.lang.Object r4 = r1.invoke(r4, r2)     // Catch:{ Exception -> 0x0024 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x0024 }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x0024 }
            if (r4 != 0) goto L_0x0024
            return r0
        L_0x0024:
            boolean r4 = r5.isLoopbackAddress()     // Catch:{ Exception -> 0x002d }
            if (r4 == 0) goto L_0x002b
            return r0
        L_0x002b:
            r4 = 1
            return r4
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.C9275k.mo37706b(java.net.NetworkInterface, java.net.InetAddress):boolean");
    }
}
