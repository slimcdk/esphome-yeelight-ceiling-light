package p011c.p083d.p084a.p085d0;

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
import p011c.p083d.p084a.C1143w;
import p163g.C4406c;

/* renamed from: c.d.a.d0.i */
public class C1019i {

    /* renamed from: a */
    private static final C1019i f1327a = m2067e();

    /* renamed from: c.d.a.d0.i$a */
    private static class C1020a extends C1019i {

        /* renamed from: b */
        private final C1018h<Socket> f1328b;

        /* renamed from: c */
        private final C1018h<Socket> f1329c;

        /* renamed from: d */
        private final Method f1330d;

        /* renamed from: e */
        private final Method f1331e;

        /* renamed from: f */
        private final C1018h<Socket> f1332f;

        /* renamed from: g */
        private final C1018h<Socket> f1333g;

        public C1020a(C1018h<Socket> hVar, C1018h<Socket> hVar2, Method method, Method method2, C1018h<Socket> hVar3, C1018h<Socket> hVar4) {
            this.f1328b = hVar;
            this.f1329c = hVar2;
            this.f1330d = method;
            this.f1331e = method2;
            this.f1332f = hVar3;
            this.f1333g = hVar4;
        }

        /* renamed from: c */
        public void mo9474c(SSLSocket sSLSocket, String str, List<C1143w> list) {
            if (str != null) {
                this.f1328b.mo9470e(sSLSocket, Boolean.TRUE);
                this.f1329c.mo9470e(sSLSocket, str);
            }
            C1018h<Socket> hVar = this.f1333g;
            if (hVar != null && hVar.mo9472g(sSLSocket)) {
                this.f1333g.mo9471f(sSLSocket, C1019i.m2066b(list));
            }
        }

        /* renamed from: d */
        public void mo9475d(Socket socket, InetSocketAddress inetSocketAddress, int i) {
            try {
                socket.connect(inetSocketAddress, i);
            } catch (SecurityException e) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e);
                throw iOException;
            }
        }

        /* renamed from: h */
        public String mo9477h(SSLSocket sSLSocket) {
            byte[] bArr;
            C1018h<Socket> hVar = this.f1332f;
            if (hVar == null || !hVar.mo9472g(sSLSocket) || (bArr = (byte[]) this.f1332f.mo9471f(sSLSocket, new Object[0])) == null) {
                return null;
            }
            return new String(bArr, C1024k.f1345c);
        }

        /* renamed from: j */
        public void mo9479j(Socket socket) {
            Method method = this.f1330d;
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
        public void mo9480k(Socket socket) {
            Method method = this.f1331e;
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

    /* renamed from: c.d.a.d0.i$b */
    private static class C1021b extends C1019i {

        /* renamed from: b */
        private final Method f1334b;

        /* renamed from: c */
        private final Method f1335c;

        /* renamed from: d */
        private final Method f1336d;

        /* renamed from: e */
        private final Class<?> f1337e;

        /* renamed from: f */
        private final Class<?> f1338f;

        public C1021b(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
            this.f1334b = method;
            this.f1335c = method2;
            this.f1336d = method3;
            this.f1337e = cls;
            this.f1338f = cls2;
        }

        /* renamed from: a */
        public void mo9473a(SSLSocket sSLSocket) {
            try {
                this.f1336d.invoke((Object) null, new Object[]{sSLSocket});
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: c */
        public void mo9474c(SSLSocket sSLSocket, String str, List<C1143w> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1143w wVar = list.get(i);
                if (wVar != C1143w.HTTP_1_0) {
                    arrayList.add(wVar.toString());
                }
            }
            try {
                Object newProxyInstance = Proxy.newProxyInstance(C1019i.class.getClassLoader(), new Class[]{this.f1337e, this.f1338f}, new C1022c(arrayList));
                this.f1334b.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: h */
        public String mo9477h(SSLSocket sSLSocket) {
            try {
                C1022c cVar = (C1022c) Proxy.getInvocationHandler(this.f1335c.invoke((Object) null, new Object[]{sSLSocket}));
                if (!cVar.f1340b && cVar.f1341c == null) {
                    C1013d.f1320a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (cVar.f1340b) {
                    return null;
                } else {
                    return cVar.f1341c;
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: c.d.a.d0.i$c */
    private static class C1022c implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f1339a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f1340b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f1341c;

        public C1022c(List<String> list) {
            this.f1339a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C1024k.f1344b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f1340b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f1339a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            obj2 = this.f1339a.get(0);
                            break;
                        } else if (this.f1339a.contains(list.get(i))) {
                            obj2 = list.get(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                    String str = (String) obj2;
                    this.f1341c = str;
                    return str;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f1341c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    /* renamed from: b */
    static byte[] m2066b(List<C1143w> list) {
        C4406c cVar = new C4406c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1143w wVar = list.get(i);
            if (wVar != C1143w.HTTP_1_0) {
                cVar.mo24247n1(wVar.toString().length());
                cVar.mo24269u1(wVar.toString());
            }
        }
        return cVar.mo24270v();
    }

    /* renamed from: e */
    private static C1019i m2067e() {
        C1018h hVar;
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
                    return new C1021b(cls2.getMethod("put", new Class[]{SSLSocket.class, cls3}), cls2.getMethod("get", new Class[]{SSLSocket.class}), cls2.getMethod("remove", new Class[]{SSLSocket.class}), Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider"));
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    return new C1019i();
                }
            }
        }
        C1018h hVar2 = null;
        C1018h hVar3 = new C1018h((Class<?>) null, "setUseSessionTickets", Boolean.TYPE);
        C1018h hVar4 = new C1018h((Class<?>) null, "setHostname", String.class);
        try {
            Class<?> cls4 = Class.forName("android.net.TrafficStats");
            method = cls4.getMethod("tagSocket", new Class[]{Socket.class});
            try {
                method2 = cls4.getMethod("untagSocket", new Class[]{Socket.class});
                try {
                    Class.forName("android.net.Network");
                    hVar = new C1018h(cls, "getAlpnSelectedProtocol", new Class[0]);
                    try {
                        hVar2 = new C1018h((Class<?>) null, "setAlpnProtocols", cls);
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
        return new C1020a(hVar3, hVar4, method, method2, hVar, hVar2);
    }

    /* renamed from: f */
    public static C1019i m2068f() {
        return f1327a;
    }

    /* renamed from: a */
    public void mo9473a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public void mo9474c(SSLSocket sSLSocket, String str, List<C1143w> list) {
    }

    /* renamed from: d */
    public void mo9475d(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: g */
    public String mo9476g() {
        return "OkHttp";
    }

    /* renamed from: h */
    public String mo9477h(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: i */
    public void mo9478i(String str) {
        System.out.println(str);
    }

    /* renamed from: j */
    public void mo9479j(Socket socket) {
    }

    /* renamed from: k */
    public void mo9480k(Socket socket) {
    }
}
