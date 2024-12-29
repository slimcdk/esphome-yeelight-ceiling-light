package javax.jmdns;

import java.io.Closeable;
import java.net.InetAddress;
import java.util.Collection;
import javax.jmdns.impl.JmDNSImpl;

/* renamed from: javax.jmdns.a */
public abstract class C9218a implements Closeable {

    /* renamed from: javax.jmdns.a$a */
    public interface C9219a {
        /* renamed from: a */
        void mo37343a(C9218a aVar, Collection<ServiceInfo> collection);
    }

    /* renamed from: v */
    public static C9218a m22269v(InetAddress inetAddress) {
        return new JmDNSImpl(inetAddress, (String) null);
    }

    /* renamed from: A */
    public abstract void mo37337A(String str, C9224d dVar);

    /* renamed from: B */
    public abstract void mo37338B(String str, String str2);

    /* renamed from: D */
    public abstract void mo37339D();

    /* renamed from: E */
    public abstract void mo37340E(ServiceInfo serviceInfo);

    /* renamed from: s */
    public abstract void mo37341s(String str, C9224d dVar);

    /* renamed from: z */
    public abstract void mo37342z(ServiceInfo serviceInfo);
}
