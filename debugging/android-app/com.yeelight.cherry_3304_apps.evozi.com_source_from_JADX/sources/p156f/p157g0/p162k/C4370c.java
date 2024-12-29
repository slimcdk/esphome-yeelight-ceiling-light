package p156f.p157g0.p162k;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p156f.C10835y;
import p156f.p157g0.C4345c;

/* renamed from: f.g0.k.c */
final class C4370c extends C4373f {

    /* renamed from: c */
    final Method f7766c;

    /* renamed from: d */
    final Method f7767d;

    C4370c(Method method, Method method2) {
        this.f7766c = method;
        this.f7767d = method2;
    }

    /* renamed from: s */
    public static C4370c m12499s() {
        try {
            return new C4370c(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public void mo24001g(SSLSocket sSLSocket, String str, List<C10835y> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b = C4373f.m12506b(list);
            this.f7766c.invoke(sSLParameters, new Object[]{b.toArray(new String[b.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C4345c.m12355b("unable to set ssl parameters", e);
        }
    }

    @Nullable
    /* renamed from: m */
    public String mo24004m(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f7767d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C4345c.m12355b("unable to get selected protocols", e);
        }
    }
}
