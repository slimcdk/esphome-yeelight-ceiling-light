package p092r5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import p056k5.C3300c;

/* renamed from: r5.c */
final class C3633c extends C3636f {

    /* renamed from: c */
    final Method f6063c;

    /* renamed from: d */
    final Method f6064d;

    C3633c(Method method, Method method2) {
        this.f6063c = method;
        this.f6064d = method2;
    }

    /* renamed from: s */
    public static C3633c m10358s() {
        try {
            return new C3633c(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public void mo25937g(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b = C3636f.m10365b(list);
            this.f6063c.invoke(sSLParameters, new Object[]{b.toArray(new String[b.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C3300c.m8917b("unable to set ssl parameters", e);
        }
    }

    @Nullable
    /* renamed from: m */
    public String mo25940m(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f6064d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C3300c.m8917b("unable to get selected protocols", e);
        }
    }
}
