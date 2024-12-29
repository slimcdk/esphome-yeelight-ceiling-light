package p092r5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import p056k5.C3300c;

/* renamed from: r5.d */
class C3634d extends C3636f {

    /* renamed from: c */
    private final Method f6065c;

    /* renamed from: d */
    private final Method f6066d;

    /* renamed from: e */
    private final Method f6067e;

    /* renamed from: f */
    private final Class<?> f6068f;

    /* renamed from: g */
    private final Class<?> f6069g;

    /* renamed from: r5.d$a */
    private static class C3635a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f6070a;

        /* renamed from: b */
        boolean f6071b;

        /* renamed from: c */
        String f6072c;

        C3635a(List<String> list) {
            this.f6070a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C3300c.f5333b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f6071b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f6070a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            obj2 = this.f6070a.get(0);
                            break;
                        } else if (this.f6070a.contains(list.get(i))) {
                            obj2 = list.get(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                    String str = (String) obj2;
                    this.f6072c = str;
                    return str;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f6072c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    C3634d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f6065c = method;
        this.f6066d = method2;
        this.f6067e = method3;
        this.f6068f = cls;
        this.f6069g = cls2;
    }

    /* renamed from: s */
    public static C3636f m10361s() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider");
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider");
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            return new C3634d(method, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo25954a(SSLSocket sSLSocket) {
        try {
            this.f6067e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C3300c.m8917b("unable to remove alpn", e);
        }
    }

    /* renamed from: g */
    public void mo25937g(SSLSocket sSLSocket, String str, List<Protocol> list) {
        List<String> b = C3636f.m10365b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C3636f.class.getClassLoader(), new Class[]{this.f6068f, this.f6069g}, new C3635a(b));
            this.f6065c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C3300c.m8917b("unable to set alpn", e);
        }
    }

    @Nullable
    /* renamed from: m */
    public String mo25940m(SSLSocket sSLSocket) {
        try {
            C3635a aVar = (C3635a) Proxy.getInvocationHandler(this.f6066d.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z = aVar.f6071b;
            if (!z && aVar.f6072c == null) {
                C3636f.m10368j().mo25943q(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z) {
                return null;
            } else {
                return aVar.f6072c;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C3300c.m8917b("unable to get selected protocol", e);
        }
    }
}
