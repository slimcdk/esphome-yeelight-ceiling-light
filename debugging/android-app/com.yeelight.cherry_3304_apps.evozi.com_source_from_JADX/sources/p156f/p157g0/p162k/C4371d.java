package p156f.p157g0.p162k;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import p156f.C10835y;
import p156f.p157g0.C4345c;

/* renamed from: f.g0.k.d */
class C4371d extends C4373f {

    /* renamed from: c */
    private final Method f7768c;

    /* renamed from: d */
    private final Method f7769d;

    /* renamed from: e */
    private final Method f7770e;

    /* renamed from: f */
    private final Class<?> f7771f;

    /* renamed from: g */
    private final Class<?> f7772g;

    /* renamed from: f.g0.k.d$a */
    private static class C4372a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f7773a;

        /* renamed from: b */
        boolean f7774b;

        /* renamed from: c */
        String f7775c;

        C4372a(List<String> list) {
            this.f7773a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C4345c.f7641b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f7774b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f7773a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            obj2 = this.f7773a.get(0);
                            break;
                        } else if (this.f7773a.contains(list.get(i))) {
                            obj2 = list.get(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                    String str = (String) obj2;
                    this.f7775c = str;
                    return str;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f7775c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    C4371d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f7768c = method;
        this.f7769d = method2;
        this.f7770e = method3;
        this.f7771f = cls;
        this.f7772g = cls2;
    }

    /* renamed from: s */
    public static C4373f m12502s() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider");
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider");
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            return new C4371d(method, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo24018a(SSLSocket sSLSocket) {
        try {
            this.f7770e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C4345c.m12355b("unable to remove alpn", e);
        }
    }

    /* renamed from: g */
    public void mo24001g(SSLSocket sSLSocket, String str, List<C10835y> list) {
        List<String> b = C4373f.m12506b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C4373f.class.getClassLoader(), new Class[]{this.f7771f, this.f7772g}, new C4372a(b));
            this.f7768c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C4345c.m12355b("unable to set alpn", e);
        }
    }

    @Nullable
    /* renamed from: m */
    public String mo24004m(SSLSocket sSLSocket) {
        try {
            C4372a aVar = (C4372a) Proxy.getInvocationHandler(this.f7769d.invoke((Object) null, new Object[]{sSLSocket}));
            if (!aVar.f7774b && aVar.f7775c == null) {
                C4373f.m12509j().mo24007q(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (aVar.f7774b) {
                return null;
            } else {
                return aVar.f7775c;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C4345c.m12355b("unable to get selected protocol", e);
        }
    }
}
