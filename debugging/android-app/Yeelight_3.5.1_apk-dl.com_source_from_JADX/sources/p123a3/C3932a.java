package p123a3;

import com.squareup.okhttp.C4269b;
import com.squareup.okhttp.C4288h;
import com.squareup.okhttp.C4295l;
import com.squareup.okhttp.C4302q;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.C4318x;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;

/* renamed from: a3.a */
public final class C3932a implements C4269b {

    /* renamed from: a */
    public static final C4269b f6585a = new C3932a();

    /* renamed from: c */
    private InetAddress m11254c(Proxy proxy, C4302q qVar) {
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? InetAddress.getByName(qVar.mo27959q()) : ((InetSocketAddress) proxy.address()).getAddress();
    }

    /* renamed from: a */
    public C4312v mo26428a(Proxy proxy, C4318x xVar) {
        List<C4288h> n = xVar.mo28059n();
        C4312v y = xVar.mo28071y();
        C4302q k = y.mo28037k();
        int size = n.size();
        for (int i = 0; i < size; i++) {
            C4288h hVar = n.get(i);
            if ("Basic".equalsIgnoreCase(hVar.mo27865b())) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), m11254c(proxy, k), inetSocketAddress.getPort(), k.mo27948E(), hVar.mo27864a(), hVar.mo27865b(), k.mo27950G(), Authenticator.RequestorType.PROXY);
                if (requestPasswordAuthentication != null) {
                    return y.mo28040n().mo28049i("Proxy-Authorization", C4295l.m11968a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).mo28047g();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public C4312v mo26429b(Proxy proxy, C4318x xVar) {
        List<C4288h> n = xVar.mo28059n();
        C4312v y = xVar.mo28071y();
        C4302q k = y.mo28037k();
        int size = n.size();
        for (int i = 0; i < size; i++) {
            C4288h hVar = n.get(i);
            if (!"Basic".equalsIgnoreCase(hVar.mo27865b())) {
                Proxy proxy2 = proxy;
            } else {
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(k.mo27959q(), m11254c(proxy, k), k.mo27945A(), k.mo27948E(), hVar.mo27864a(), hVar.mo27865b(), k.mo27950G(), Authenticator.RequestorType.SERVER);
                if (requestPasswordAuthentication != null) {
                    return y.mo28040n().mo28049i("Authorization", C4295l.m11968a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).mo28047g();
                }
            }
        }
        return null;
    }
}
