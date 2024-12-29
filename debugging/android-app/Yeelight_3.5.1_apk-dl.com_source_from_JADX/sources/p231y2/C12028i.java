package p231y2;

import com.squareup.okhttp.Protocol;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import okio.C3564c;

/* renamed from: y2.i */
public class C12028i {

    /* renamed from: a */
    private static final C12028i f22049a = m31018e();

    /* renamed from: y2.i$a */
    private static class C12029a extends C12028i {

        /* renamed from: b */
        private final C12027h<Socket> f22050b;

        /* renamed from: c */
        private final C12027h<Socket> f22051c;

        /* renamed from: d */
        private final Method f22052d;

        /* renamed from: e */
        private final Method f22053e;

        /* renamed from: f */
        private final C12027h<Socket> f22054f;

        /* renamed from: g */
        private final C12027h<Socket> f22055g;

        public C12029a(C12027h<Socket> hVar, C12027h<Socket> hVar2, Method method, Method method2, C12027h<Socket> hVar3, C12027h<Socket> hVar4) {
            this.f22050b = hVar;
            this.f22051c = hVar2;
            this.f22052d = method;
            this.f22053e = method2;
            this.f22054f = hVar3;
            this.f22055g = hVar4;
        }

        /* renamed from: c */
        public void mo42650c(SSLSocket sSLSocket, String str, List<Protocol> list) {
            if (str != null) {
                this.f22050b.mo42646e(sSLSocket, Boolean.TRUE);
                this.f22051c.mo42646e(sSLSocket, str);
            }
            C12027h<Socket> hVar = this.f22055g;
            if (hVar != null && hVar.mo42648g(sSLSocket)) {
                this.f22055g.mo42647f(sSLSocket, C12028i.m31017b(list));
            }
        }

        /* renamed from: d */
        public void mo42651d(Socket socket, InetSocketAddress inetSocketAddress, int i) {
            try {
                socket.connect(inetSocketAddress, i);
            } catch (SecurityException e) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e);
                throw iOException;
            }
        }

        /* renamed from: h */
        public String mo42653h(SSLSocket sSLSocket) {
            byte[] bArr;
            C12027h<Socket> hVar = this.f22054f;
            if (hVar == null || !hVar.mo42648g(sSLSocket) || (bArr = (byte[]) this.f22054f.mo42647f(sSLSocket, new Object[0])) == null) {
                return null;
            }
            return new String(bArr, C12033k.f22067c);
        }

        /* renamed from: j */
        public void mo42655j(Socket socket) {
            Method method = this.f22052d;
            if (method != null) {
                try {
                    method.invoke((Object) null, new Object[]{socket});
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2.getCause());
                }
            }
        }

        /* renamed from: k */
        public void mo42656k(Socket socket) {
            Method method = this.f22053e;
            if (method != null) {
                try {
                    method.invoke((Object) null, new Object[]{socket});
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2.getCause());
                }
            }
        }
    }

    /* renamed from: y2.i$b */
    private static class C12030b extends C12028i {

        /* renamed from: b */
        private final Method f22056b;

        /* renamed from: c */
        private final Method f22057c;

        /* renamed from: d */
        private final Method f22058d;

        /* renamed from: e */
        private final Class<?> f22059e;

        /* renamed from: f */
        private final Class<?> f22060f;

        public C12030b(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
            this.f22056b = method;
            this.f22057c = method2;
            this.f22058d = method3;
            this.f22059e = cls;
            this.f22060f = cls2;
        }

        /* renamed from: a */
        public void mo42649a(SSLSocket sSLSocket) {
            try {
                this.f22058d.invoke((Object) null, new Object[]{sSLSocket});
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: c */
        public void mo42650c(SSLSocket sSLSocket, String str, List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Protocol protocol = list.get(i);
                if (protocol != Protocol.HTTP_1_0) {
                    arrayList.add(protocol.toString());
                }
            }
            try {
                Object newProxyInstance = Proxy.newProxyInstance(C12028i.class.getClassLoader(), new Class[]{this.f22059e, this.f22060f}, new C12031c(arrayList));
                this.f22056b.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: h */
        public String mo42653h(SSLSocket sSLSocket) {
            try {
                C12031c cVar = (C12031c) Proxy.getInvocationHandler(this.f22057c.invoke((Object) null, new Object[]{sSLSocket}));
                if (!cVar.f22062b && cVar.f22063c == null) {
                    C12022d.f22042a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (cVar.f22062b) {
                    return null;
                } else {
                    return cVar.f22063c;
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: y2.i$c */
    private static class C12031c implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f22061a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f22062b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f22063c;

        public C12031c(List<String> list) {
            this.f22061a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C12033k.f22066b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f22062b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f22061a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            obj2 = this.f22061a.get(0);
                            break;
                        } else if (this.f22061a.contains(list.get(i))) {
                            obj2 = list.get(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                    String str = (String) obj2;
                    this.f22063c = str;
                    return str;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f22063c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    /* renamed from: b */
    static byte[] m31017b(List<Protocol> list) {
        C3564c cVar = new C3564c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                cVar.mo24736R(protocol.toString().length());
                cVar.mo24757i0(protocol.toString());
            }
        }
        return cVar.mo24731O();
    }

    /* renamed from: e */
    private static C12028i m31018e() {
        C12027h hVar;
        Method method;
        Method method2;
        Class<byte[]> cls = byte[].class;
        try {
            Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException unused) {
            try {
                Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException unused2) {
                try {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
                    return new C12030b(cls2.getMethod("put", new Class[]{SSLSocket.class, cls3}), cls2.getMethod("get", new Class[]{SSLSocket.class}), cls2.getMethod("remove", new Class[]{SSLSocket.class}), Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider"));
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    return new C12028i();
                }
            }
        }
        C12027h hVar2 = null;
        C12027h hVar3 = new C12027h((Class<?>) null, "setUseSessionTickets", Boolean.TYPE);
        C12027h hVar4 = new C12027h((Class<?>) null, "setHostname", String.class);
        try {
            Class<?> cls4 = Class.forName("android.net.TrafficStats");
            method = cls4.getMethod("tagSocket", new Class[]{Socket.class});
            try {
                method2 = cls4.getMethod("untagSocket", new Class[]{Socket.class});
                try {
                    Class.forName("android.net.Network");
                    hVar = new C12027h(cls, "getAlpnSelectedProtocol", new Class[0]);
                    try {
                        hVar2 = new C12027h((Class<?>) null, "setAlpnProtocols", cls);
                    } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                    hVar = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused6) {
                method2 = null;
                hVar = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused7) {
            method2 = null;
            method = null;
            hVar = null;
        }
        return new C12029a(hVar3, hVar4, method, method2, hVar, hVar2);
    }

    /* renamed from: f */
    public static C12028i m31019f() {
        return f22049a;
    }

    /* renamed from: a */
    public void mo42649a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public void mo42650c(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    /* renamed from: d */
    public void mo42651d(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: g */
    public String mo42652g() {
        return "OkHttp";
    }

    /* renamed from: h */
    public String mo42653h(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: i */
    public void mo42654i(String str) {
        System.out.println(str);
    }

    /* renamed from: j */
    public void mo42655j(Socket socket) {
    }

    /* renamed from: k */
    public void mo42656k(Socket socket) {
    }
}
