package org.fourthline.cling.android;

import java.lang.reflect.Field;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.transport.impl.C10133j;

/* renamed from: org.fourthline.cling.android.a */
public class C10003a extends C10133j {

    /* renamed from: g */
    private static final Logger f18466g = Logger.getLogger(C10007d.class.getName());

    public C10003a(int i) {
        super(i);
    }

    /* renamed from: h */
    public InetAddress mo36802h(NetworkInterface networkInterface, boolean z, InetAddress inetAddress) {
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
    /* renamed from: j */
    public void mo40302j() {
        try {
            super.mo40302j();
        } catch (Exception e) {
            Logger logger = f18466g;
            logger.warning("Exception while enumerating network interfaces, trying once more: " + e);
            super.mo40302j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo40303o(NetworkInterface networkInterface, InetAddress inetAddress) {
        Object obj;
        Field field;
        boolean o = super.mo40303o(networkInterface, inetAddress);
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
                    Logger logger = f18466g;
                    Level level = Level.SEVERE;
                    logger.log(level, "Failed injecting hostName to work around Android InetAddress DNS bug: " + inetAddress, e);
                    return false;
                }
            }
            if (field == null || hostAddress == null) {
                return false;
            }
            field.setAccessible(true);
            field.set(obj, hostAddress);
        }
        return o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo40304q() {
        return false;
    }
}
