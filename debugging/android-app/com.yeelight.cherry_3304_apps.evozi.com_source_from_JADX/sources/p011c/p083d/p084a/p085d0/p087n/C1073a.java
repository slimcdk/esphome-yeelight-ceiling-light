package p011c.p083d.p084a.p085d0.p087n;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;
import p011c.p083d.p084a.C0990b;
import p011c.p083d.p084a.C1118h;
import p011c.p083d.p084a.C1126m;
import p011c.p083d.p084a.C1133r;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1150z;

/* renamed from: c.d.a.d0.n.a */
public final class C1073a implements C0990b {

    /* renamed from: a */
    public static final C0990b f1528a = new C1073a();

    /* renamed from: c */
    private InetAddress m2396c(Proxy proxy, C1133r rVar) {
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? InetAddress.getByName(rVar.mo9772q()) : ((InetSocketAddress) proxy.address()).getAddress();
    }

    /* renamed from: a */
    public C1144x mo9392a(Proxy proxy, C1150z zVar) {
        List<C1118h> n = zVar.mo9860n();
        C1144x y = zVar.mo9872y();
        C1133r k = y.mo9838k();
        int size = n.size();
        for (int i = 0; i < size; i++) {
            C1118h hVar = n.get(i);
            if ("Basic".equalsIgnoreCase(hVar.mo9685b())) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), m2396c(proxy, k), inetSocketAddress.getPort(), k.mo9761E(), hVar.mo9684a(), hVar.mo9685b(), k.mo9763G(), Authenticator.RequestorType.PROXY);
                if (requestPasswordAuthentication != null) {
                    String a = C1126m.m2688a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()));
                    C1144x.C1146b n2 = y.mo9841n();
                    n2.mo9850i("Proxy-Authorization", a);
                    return n2.mo9848g();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public C1144x mo9393b(Proxy proxy, C1150z zVar) {
        List<C1118h> n = zVar.mo9860n();
        C1144x y = zVar.mo9872y();
        C1133r k = y.mo9838k();
        int size = n.size();
        for (int i = 0; i < size; i++) {
            C1118h hVar = n.get(i);
            if (!"Basic".equalsIgnoreCase(hVar.mo9685b())) {
                Proxy proxy2 = proxy;
            } else {
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(k.mo9772q(), m2396c(proxy, k), k.mo9758A(), k.mo9761E(), hVar.mo9684a(), hVar.mo9685b(), k.mo9763G(), Authenticator.RequestorType.SERVER);
                if (requestPasswordAuthentication != null) {
                    String a = C1126m.m2688a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()));
                    C1144x.C1146b n2 = y.mo9841n();
                    n2.mo9850i("Authorization", a);
                    return n2.mo9848g();
                }
            }
        }
        return null;
    }
}
