package p164h.p165b.p166a.p236e;

import java.lang.reflect.Field;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.p170k.p171d.C11466k;

/* renamed from: h.b.a.e.a */
public class C11167a extends C11466k {

    /* renamed from: g */
    private static final Logger f22135g = Logger.getLogger(C11171d.class.getName());

    public C11167a(int i) {
        super(i);
    }

    /* renamed from: h */
    public InetAddress mo35513h(NetworkInterface networkInterface, boolean z, InetAddress inetAddress) {
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
    /* renamed from: j */
    public void mo35514j() {
        try {
            super.mo35514j();
        } catch (Exception e) {
            Logger logger = f22135g;
            logger.warning("Exception while enumerating network interfaces, trying once more: " + e);
            super.mo35514j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo35515o(NetworkInterface networkInterface, InetAddress inetAddress) {
        Object obj;
        Field field;
        boolean o = super.mo35515o(networkInterface, inetAddress);
        if (o) {
            String hostAddress = inetAddress.getHostAddress();
            try {
                Field declaredField = InetAddress.class.getDeclaredField("holder");
                declaredField.setAccessible(true);
                obj = declaredField.get(inetAddress);
                field = obj.getClass().getDeclaredField("hostName");
            } catch (NoSuchFieldException unused) {
                try {
                    field = InetAddress.class.getDeclaredField("hostName");
                    obj = inetAddress;
                } catch (Exception e) {
                    Logger logger = f22135g;
                    Level level = Level.SEVERE;
                    logger.log(level, "Failed injecting hostName to work around Android InetAddress DNS bug: " + inetAddress, e);
                    return false;
                }
            }
            if (field == null || obj == null || hostAddress == null) {
                return false;
            }
            field.setAccessible(true);
            field.set(obj, hostAddress);
        }
        return o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo35516q() {
        return false;
    }
}
